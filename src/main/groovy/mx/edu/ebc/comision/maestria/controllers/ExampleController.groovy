package mx.edu.ebc.comision.maestria.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class ExampleController {
  @RequestMapping("/")
  @ResponseBody
  public ModelAndView home() {
    ModelAndView model = new ModelAndView("postgrado/home")
  }
}