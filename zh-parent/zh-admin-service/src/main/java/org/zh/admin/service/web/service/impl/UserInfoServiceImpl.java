package org.zh.admin.service.web.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zh.admin.service.web.service.UserInfoService;
import org.zh.api.domain.UserInfoDTO;
import org.zh.domain.entity.Userinfo;
import org.zh.domain.repository.UserRepository;

@Service
@Transactional
public class UserInfoServiceImpl implements UserInfoService {
	private final UserRepository userRepository;
	@Autowired
	public UserInfoServiceImpl(UserRepository userRepository){
		this.userRepository=userRepository;
	}

	@Override
	public boolean save(UserInfoDTO user) {
		Userinfo u = new Userinfo();
		BeanUtils.copyProperties(user, u);
		// TODO Auto-generated method stub
		return userRepository.save(u)!=null;
	}

	@Override
	public List<UserInfoDTO> findAll() {
		// TODO Auto-generated method stub
		Iterable<Userinfo> is = userRepository.findAll();
		List<UserInfoDTO> list = new ArrayList<UserInfoDTO>();
		if (is != null) {
			for (Iterator iter = is.iterator(); iter.hasNext();) {
				Userinfo u = (Userinfo) iter.next();
				UserInfoDTO uu = new UserInfoDTO();
				BeanUtils.copyProperties(u, uu);
				list.add(uu);
			}
		}
		return list;
	}

}
