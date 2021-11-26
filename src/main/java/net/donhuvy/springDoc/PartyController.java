package net.donhuvy.springDoc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PartyController {

    @GetMapping("/parties")
    public String getParites(){
        return "Nguyen Thanh Van";
    }

}
