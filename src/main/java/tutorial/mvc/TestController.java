package tutorial.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cccce on 03/10/2017.
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }


}
