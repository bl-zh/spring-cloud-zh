package org.zh.admin.service.web.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zh.admin.service.web.service.ProductService;
import org.zh.api.domain.ProductDTO;
import org.zh.domain.entity.Product;
import org.zh.domain.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public boolean save(ProductDTO productDTO) {

		// TODO Auto-generated method stub
		Product product = new Product();
		BeanUtils.copyProperties(productDTO, product);
		product.setCreateTime(new Date(System.currentTimeMillis()));
		return productRepository.save(product)!=null;
	}

	@Override
	public boolean saveBatch(List<ProductDTO> list) {
		// TODO Auto-generated method stub
		Date currDate = new Date(System.currentTimeMillis());
		List<Product> products = new ArrayList<Product>();
		for (ProductDTO productDTO : list) {
			Product product = new Product();
			BeanUtils.copyProperties(productDTO, product);
			product.setCreateTime(currDate);
			products.add(product);
		}
		Iterable<Product> save = productRepository.save(products);
		if(save ==null){
			return false;
		}
		List<Product> myList=IteratorUtils.toList(save.iterator()); 
		
		return myList.size() >0;
	}

	@Override
	public List<ProductDTO> findAll() {
		// TODO Auto-generated method stub
		Iterable<Product> products = productRepository.findAll();
		ArrayList<ProductDTO> outList = new ArrayList<ProductDTO>();
		for (Product product : products) {
			ProductDTO productDTO = new ProductDTO();
			BeanUtils.copyProperties(product, productDTO);
			outList.add(productDTO);
		}
		return outList;
	}

}
