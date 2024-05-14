package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HostingController {

    @GetMapping()
    public String getStatus(){
        return "Hello World!!";
    }
}
