package org.zh.admin.service.web.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zh.admin.service.web.service.QueryRecDataService;
import org.zh.api.domain.ProductDTO;
import org.zh.api.domain.ProductList;
import org.zh.api.domain.UserInfoDTO;
import org.zh.domain.entity.Order;
import org.zh.domain.entity.OrderItem;
import org.zh.domain.entity.Product;
import org.zh.domain.entity.ProductidSet;
import org.zh.domain.entity.Userinfo;
import org.zh.domain.repository.OrderItemRepository;
import org.zh.domain.repository.OrderRepository;
import org.zh.domain.repository.ProductRepository;
import org.zh.domain.repository.ProductidSetRepository;
import org.zh.domain.repository.UserRepository;

@Service
@Transactional
public class QueryRecDataServiceImpl implements QueryRecDataService {
	
	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductidSetRepository productidSetRepository;
	/**
	 * 根据userId 查询推荐的信息
	 * @param userId
	 */
	@Override
	public ArrayList<ProductList> findRecDataByUserId(int userId) {
		ArrayList<ProductList> list = new ArrayList<ProductList>();
		ArrayList<String> dataList = new ArrayList<>();
		//首先根据传入的userId查询订单信息，获取到商品ID信息（productId）
		String productIdStr1 = getProductIdStrNew(userId);
		if(productIdStr1!=null&&!"".equalsIgnoreCase(productIdStr1)){
			dataList.add(productIdStr1);
			
			//查询出所有的用户信息，循环查询出订单信息，
			List<UserInfoDTO> userInfos = getUserInfos();
			if(userInfos!=null&&userInfos.size()>0){
				for(UserInfoDTO bean:userInfos){
					if(userId!=bean.getId()){
						String productIdStr2 = getProductIdStr(bean.getId());
						dataList.add(productIdStr2);
					}
				}
			}
			//进行推荐信息的计算
			Map<String, Integer> frequentSetMap = Apriori2.apriori(dataList);  

			Map<String, Double> relationRulesMap = Apriori2.getRelationRules(frequentSetMap);  
			Set<String> rrKeySet = relationRulesMap.keySet();  
			for (String rrKey : rrKeySet)  
			{  
				String[] rrKeys = rrKey.split(Apriori2.CON);
				if(productIdStr1.contains(rrKeys[0])){
					ProductList productList = new ProductList();
					ArrayList<ProductDTO> list1 = new ArrayList<>();
					ArrayList<ProductDTO> list2 = new ArrayList<>();
					String[] ss = rrKeys[0].split(";");
					for(int i=0;i<ss.length;i++){
						Product product = productRepository.findOne(Integer.valueOf(ss[i]));
						ProductDTO productDTO = new ProductDTO();
						BeanUtils.copyProperties(product,productDTO);
						list1.add(productDTO);
					}
					productList.setProductList(list1);
					String[] ss2 = rrKeys[1].split(";");
					for(int j=0;j<ss2.length;j++){
						Product product = productRepository.findOne(Integer.valueOf(ss[j]));
						ProductDTO productDTO = new ProductDTO();
						BeanUtils.copyProperties(product,productDTO);
						list2.add(productDTO);
					}
					productList.setProductList2(list2);
					list.add(productList);
				}
			}  
		}
		return list;
		
	}

	/**
	 * 根据productId 查询推荐的信息
	 * @param productId
	 */
	@Override
	public ArrayList<ProductList> findRecDataByProId(int productId) {
		//首先查询出商品信息id的关系信息，然后根据传入的productId计算推荐的信息
		ArrayList<ProductList> list = new ArrayList<ProductList>();
		if(productId>0){
			ArrayList<String> dataList = new ArrayList<>();
			String productIdStr1 = productId+";";
			dataList.add(productIdStr1);
			Iterable<ProductidSet> is = productidSetRepository.findAll();
			if (is != null) {
				for (Iterator iter = is.iterator(); iter.hasNext();) {
					ProductidSet u = (ProductidSet) iter.next();
					dataList.add(u.getProductIdSet());
				}
			}
			//进行推荐信息的计算
			Map<String, Integer> frequentSetMap = Apriori2.apriori(dataList);  

			Map<String, Double> relationRulesMap = Apriori2.getRelationRules(frequentSetMap);  
			Set<String> rrKeySet = relationRulesMap.keySet();  
			for (String rrKey : rrKeySet)  
			{  
				String[] rrKeys = rrKey.split(Apriori2.CON);
				if(productIdStr1.contains(rrKeys[0])){
					ProductList productList = new ProductList();
					ArrayList<ProductDTO> list1 = new ArrayList<>();
					ArrayList<ProductDTO> list2 = new ArrayList<>();
					String[] ss = rrKeys[0].split(";");
					for(int i=0;i<ss.length;i++){
						Product product = productRepository.findOne(Integer.valueOf(ss[i]));
						ProductDTO productDTO = new ProductDTO();
						BeanUtils.copyProperties(product,productDTO);
						list1.add(productDTO);
					}
					productList.setProductList(list1);
					String[] ss2 = rrKeys[1].split(";");
					for(int j=0;j<ss2.length;j++){
						Product product = productRepository.findOne(Integer.valueOf(ss[j]));
						ProductDTO productDTO = new ProductDTO();
						BeanUtils.copyProperties(product,productDTO);
						list2.add(productDTO);
					}
					productList.setProductList2(list2);
					list.add(productList);
				}
			} 
		}
		return list;
	}

	/**
	 * 组装数据，以";"隔开
	 * @param userId
	 * @return
	 */
	private String getProductIdStrNew(int userId){
		StringBuffer sbuf = new StringBuffer();
		List<Order> orders =orderRepository.findOrderByUserid(userId);
		if(orders!=null&&orders.size()>0){
			int orderId = 0;
			Date date = null;
			for(int i=0;i<orders.size();i++){
				if(date==null){
					date = orders.get(i).getCreateTime(); 
					orderId = orders.get(i).getId();
				}
				else{
					if(date.before(orders.get(i).getCreateTime())){
						date = orders.get(i).getCreateTime();
						orderId = orders.get(i).getId();
					}
				}
			}
			Iterable<OrderItem> is = orderItemRepository.findOrderItemByUserIdNew(orderId);
			if (is != null) {
				for (Iterator iter = is.iterator(); iter.hasNext();) {
					OrderItem u = (OrderItem) iter.next();
					sbuf.append(u.getProductId()+";");
				}
			}

		}
		return sbuf.toString();
	}
	
	/**
	 * 组装数据，以";"隔开
	 * @param userId
	 * @return
	 */
	private String getProductIdStr(int userId){
		StringBuffer sbuf = new StringBuffer();
		Iterable<OrderItem> is = orderItemRepository.findOrderItemByUserId(userId);
		if (is != null) {
			for (Iterator iter = is.iterator(); iter.hasNext();) {
				OrderItem u = (OrderItem) iter.next();
				sbuf.append(u.getProductId()+";");
			}
		}
		return sbuf.toString();
	}
	
	/**
	 * 查询所有会员信息
	 * @return
	 */
	private List<UserInfoDTO> getUserInfos(){
		Iterable<Userinfo> userInfos = userRepository.findAll();
		List<UserInfoDTO> list = new ArrayList<UserInfoDTO>();
		if (userInfos != null) {
			for (Iterator iter = userInfos.iterator(); iter.hasNext();) {
				Userinfo u = (Userinfo) iter.next();
				UserInfoDTO uu = new UserInfoDTO();
				BeanUtils.copyProperties(u, uu);
				list.add(uu);
			}
		}
		return list;
	}
}
