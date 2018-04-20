/**
 * 
 */
package org.zh.admin.service.web.service;

import java.util.List;

import org.zh.api.domain.UserInfoDTO;

/**
 * @author hudepin
 *
 * 2018年4月20日上午11:20:29
 */
public interface UserInfoService {

	boolean save(UserInfoDTO user);

	List<UserInfoDTO> findAll();

}
