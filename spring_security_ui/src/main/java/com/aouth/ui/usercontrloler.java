package com.aouth.ui;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by muhamd gomaa on 11/20/2017.
 */
@Controller
public class usercontrloler {




@GetMapping("/hello")
    public String ss(){

    return "hello";


}




}




