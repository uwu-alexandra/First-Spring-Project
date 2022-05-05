package examples.numberOne.Controllers;

import examples.numberOne.Services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/getFirstString")
    public String getFirstStringController(){
        return homeService.getFirstStringService();
    }

    @GetMapping("/getAllStrings")
    public List<String> getAllStringsController() {
        return homeService.getAllStringsService();
    }

    @PostMapping("/addString")
    public void addStringController(@RequestBody String string) {
        homeService.addStringsService(string);
    }

}
