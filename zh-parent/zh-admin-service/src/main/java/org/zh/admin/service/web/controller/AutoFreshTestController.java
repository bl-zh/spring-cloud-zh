/**
 * 
 */
package org.zh.admin.service.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hudepin
 *
 */
@RestController
public class AutoFreshTestController {
	@Value("${my.app.name}")
	private String myName;

	@GetMapping("/my-name")
	public String getName() {
		return myName;
	}
}
