package org.gfg.UserCreation;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    private static final Log logger = LogFactory.getLog(UserController.class);

    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody UserDTO userDTO, @RequestHeader String requestId){
//        MDC.put("requestId", requestId);
        logger.info("request landed to add user "+ userDTO);
        return userService.addUser(userDTO, requestId);
    }
}
