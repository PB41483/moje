/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
/**
 *
 * @author pb41483
 */

@Controller
public class HomeController {
    
@RequestMapping("/")
public String home(Model model) {
   

    return "home";
}
@RequestMapping("/hello")
public String hello(Model model, String imie, Integer wiek) {
    model.addAttribute("imie", imie);
    model.addAttribute("wiek", wiek);

    return "hello";
}
}

 
