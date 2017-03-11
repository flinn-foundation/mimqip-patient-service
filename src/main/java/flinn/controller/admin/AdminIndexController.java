package flinn.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminIndexController {

    @GetMapping("/admin")
    public String adminIndex() {
        return "admin/index";
    }
}
