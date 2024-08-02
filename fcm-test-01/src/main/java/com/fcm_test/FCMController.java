package com.fcm_test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class FCMController {

    private final FirebaseInit init;
    @GetMapping("/test")
    public String test(){
        init.init();
        return "test";
    }
}