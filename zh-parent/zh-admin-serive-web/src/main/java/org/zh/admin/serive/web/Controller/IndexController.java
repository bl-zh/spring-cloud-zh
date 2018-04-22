/**
 * 
 */
package org.zh.admin.serive.web.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author HDP23
 *
 */
@Controller
public class IndexController {
	@GetMapping({"/html"})
    public String index(Model model,HttpServletRequest request){
       return "redirect:/index.html";  
    }
}
