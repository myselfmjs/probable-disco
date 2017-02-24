package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by majunsheng on 2017/2/22.
 */
@Controller
@RequestMapping("hello")
public class HelloController {

    @RequestMapping(value = "/index",method = RequestMethod.POST)
    public String setHello(Model model){
        model.addAttribute("msg","Hello");
        return "hello";
    }
}
