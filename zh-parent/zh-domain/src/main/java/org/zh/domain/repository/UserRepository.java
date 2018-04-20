/**
 * 
 */
package org.zh.domain.repository;

import org.springframework.data.repository.CrudRepository;
import org.zh.domain.entity.Userinfo;

/**
 * @author hudepin
 *
 * 2018年4月20日上午11:22:00
 */
public interface UserRepository extends CrudRepository<Userinfo,Integer>{

}
