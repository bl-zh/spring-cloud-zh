/**
 *
 */
package org.zh.front.web.controller.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ZJ08
 */
@Controller
public class IndexViewController {
    private final UserService userService;

    @Autowired
    public IndexViewController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"/index", ""})
    public String index(Model model, HttpServletRequest request) {
        return "index";
    }

    @GetMapping({"/shopcart", ""})
    public String shopcart(Model model, HttpServletRequest request) {
        return "shopcart";
    }

    @GetMapping({"/message", ""})
    public String message(Model model, HttpServletRequest request) {
        return "message";
    }


}
