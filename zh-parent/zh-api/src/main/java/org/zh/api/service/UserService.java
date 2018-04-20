/**
 * 
 */
package org.zh.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.zh.api.domain.UserInfoDTO;

/**
 * @author hudepin
 *
 * 2018年4月20日上午11:12:56
 */
@FeignClient(value = "zh-admin-service") // 服务提供方应用的名称
public interface UserService {
	@PostMapping(value = "/user/save")
	public boolean save(@RequestBody UserInfoDTO user);
	@GetMapping(value="user/find/all")
	public List<UserInfoDTO> findAll();

}
