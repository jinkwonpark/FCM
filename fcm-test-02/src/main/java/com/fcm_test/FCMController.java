package com.fcm_test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class FCMController {

    private final FirebaseInit init;
    private final FirebaseService firebaseService;

    @GetMapping("/admin")
    public String admin(Model model){
        return "admin";
    };

    @GetMapping("/consumer")
    public String consumer(){
        init.init();
        return "consumer";
    }

    @PostMapping("/sendNotification")
    public String sendNotification(@RequestParam String title,
                                   @RequestParam String body,
                                   @RequestParam String token) {
        firebaseService.sendNotification(title, body, token);
        return "redirect:/admin";
    };
}
