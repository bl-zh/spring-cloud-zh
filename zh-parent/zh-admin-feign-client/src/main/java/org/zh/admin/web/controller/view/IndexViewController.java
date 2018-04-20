/**
 * 
 */
package org.zh.admin.web.controller.view;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author HDP23
 *
 */
@Controller
public class IndexViewController {
	@RequestMapping({"/index",""})
    public String index(Model model,HttpServletRequest request){
       return "index";
    }

}
