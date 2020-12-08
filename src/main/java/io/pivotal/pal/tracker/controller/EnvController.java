package io.pivotal.pal.tracker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EnvController {

    String port;
    String memory_limit;
    String cf_instance_index;
    String cf_instance_addr;

    public EnvController(@Value("${PORT:NOT SET}") String port,
                         @Value("${MEMORY_LIMIT:NOT SET}") String memory_limit,
                         @Value("${cf.instance.index:NOT SET}") String cf_instance_index,
                         @Value("${CF_INSTANCE_ADDR:NOT SET}") String cf_instance_addr) {
        this.port = port;
        this.memory_limit = memory_limit;
        this.cf_instance_index = cf_instance_index;
        this.cf_instance_addr = cf_instance_addr;
    }

    @GetMapping("/env")
    public Map<String, String> getEnv(){
        Map<String, String> env = new HashMap<String, String>();
        env.put("PORT",this.port );
        env.put("MEMORY_LIMIT",this.memory_limit );
        env.put("CF_INSTANCE_INDEX",this.cf_instance_index );
        env.put("CF_INSTANCE_ADDR",this.cf_instance_addr );

        return env;
    }


}
