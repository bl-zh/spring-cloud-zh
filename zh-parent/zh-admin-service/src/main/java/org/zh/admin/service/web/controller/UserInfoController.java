/**
 * 
 */
package org.zh.admin.service.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.zh.admin.service.web.service.UserInfoService;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.UserService;

/**
 * @author hudepin
 *
 * 2018年4月20日下午12:26:05
 */
@RestController
public class UserInfoController implements UserService{
	private final UserInfoService userInfoService;
	@Autowired
	public UserInfoController(UserInfoService userInfoService){
		this.userInfoService= userInfoService;
	}

	@Override
	public boolean save(@RequestBody UserInfoDTO user) {
		// TODO Auto-generated method stub
		return userInfoService.save(user);
	}

	@Override
	public List<UserInfoDTO> findAll() {
		// TODO Auto-generated method stub
		return userInfoService.findAll();
	}

}
