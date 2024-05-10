package com.kong.rich2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class ConfigController {

    @GetMapping("/api/config")
    public Map<String, Object> getConfig() {
        Map<String, Object> response = new HashMap<>();
        Map<String, Integer> data = new HashMap<>();
        data.put("type", 1);
        response.put("code", 0);
        response.put("data", data);
        return response;
    }
}
