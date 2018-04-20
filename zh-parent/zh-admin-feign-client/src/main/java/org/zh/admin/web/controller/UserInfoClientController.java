/**
 * 
 */
package org.zh.admin.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.weaver.patterns.TypePatternQuestions.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.UserService;

/**
 * @author hudepin
 *
 * 2018年4月20日上午11:19:13
 */
@RestController
public class UserInfoClientController{
	private final UserService userService;
	@Autowired
	public UserInfoClientController(UserService userService){
		this.userService= userService;
	}

	@PostMapping(value = "/user/save")
	public boolean save(@RequestBody UserInfoDTO user) {
		return userService.save(user);
	}
	@GetMapping(value="user/find/all")
	public List<UserInfoDTO> findAll() {
		return userService.findAll();
	}
	

}
