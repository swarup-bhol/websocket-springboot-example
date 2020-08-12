package com.example.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {
	@Autowired
    private SimpMessagingTemplate template;
	
	    
	    // For specific user
	    @GetMapping("/sendNotification")
	    public String sendNotification() {
	    	template.convertAndSendToUser("swarup", "/reply", "swarup");
	    	return "Notification send succefully";
	    }
}
