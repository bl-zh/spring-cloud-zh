/**
 *
 */
package org.zh.admin.web.controller.view;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.zh.api.domain.UserInfoDTO;
import org.zh.api.service.UserService;

/**
 * @author HDP23
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

    @GetMapping("/blank")
    public String blank(Model model, HttpServletRequest request) {
        return "blank";
    }

    /**
     * 登入成功之后的后台页面
     *
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/backend")
    public String backend(Model model, HttpServletRequest request) {
        model.addAttribute("active","backend");
        return "backend";
    }

    @GetMapping("/table")
    public String table(Model model) {
        List<UserInfoDTO> list = userService.findAll();
        model.addAttribute("data", list);
        return "table-datatable";
    }

}
