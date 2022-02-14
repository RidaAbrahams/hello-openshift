package za.co.sar.helloopenshift.boundary;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("hello")
@Log
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello, world!" + " The time is: " + LocalDateTime.now();
    }
}
