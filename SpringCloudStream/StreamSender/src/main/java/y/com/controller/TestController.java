package y.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import y.com.message.Sender;

@RestController
public class TestController {

    @Autowired
    private Sender sender;


    @RequestMapping("/send")
    public void send(){
        sender.sendMessage();
    }
}
