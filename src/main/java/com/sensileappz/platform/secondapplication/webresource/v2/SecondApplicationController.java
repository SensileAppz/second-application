package com.sensileappz.platform.secondapplication.webresource.v2;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sensileappz.platform.secondapplication.model.Greeting;

@RestController
@RequestMapping("/secondapplication/v1")
public class SecondApplicationController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Sanjukta") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
	
}
