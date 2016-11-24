package io.tvang.demo.upload.web.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleCtlr extends AbstractCtrl {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Hello World!";
  }


}