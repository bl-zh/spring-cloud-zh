/**
 * 
 */
package org.zh.admin.service.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hudepin
 *
 */
@RestController
@RefreshScope
public class AutoFreshTestController {
	@Value("${my.app.name}")
	private String myName;

	@GetMapping("/my-name")
	public String getName() {
		return myName;
	}
}
