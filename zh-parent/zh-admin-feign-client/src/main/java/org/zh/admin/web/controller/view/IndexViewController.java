/**
 * 
 */
package org.zh.admin.web.controller.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HDP23
 *
 */
@Controller
public class IndexViewController {
	@GetMapping({"/index",""})
    public String index(Model model,HttpServletRequest request){
       return "index";
    }
	@GetMapping("/blank")
    public String blank(Model model,HttpServletRequest request){
       return "blank";
    }

}
