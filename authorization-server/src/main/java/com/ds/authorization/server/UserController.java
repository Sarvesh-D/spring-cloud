/**
 * 
 */
package com.ds.authorization.server;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Sarvesh
 *
 */
@RestController
public class UserController {

    @GetMapping({ "/user", "/me" })
    public Map<String, String> me(Principal principal) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", principal.getName());
        return map;
    }

}
