package com.ly.web;
 
import com.ly.service.MypwdService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

// import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class MainController {

  private static final Logger logger =  LoggerFactory.getLogger(MainController.class);

  @Resource
  private MypwdService mypwdService;

  @RequestMapping("/")
  public String index() {
    logger.debug("-----------");
    logger.debug("==========");


    return "Hello MyNote";
//      return mypwdService.mypwd_list();

  }

  @RequestMapping("/zero")
    public int getZero(){
      return 100 / 0;
  }

}
