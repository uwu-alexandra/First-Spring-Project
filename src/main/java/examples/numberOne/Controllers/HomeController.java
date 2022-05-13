package examples.numberOne.Controllers;

import examples.numberOne.Services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class   HomeController {

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

    /* @RequestBody - maps the HttpRequest body to a transfer or domain object, enabling automatic deserialization */
    /* @PathVariable - used to extract the value from the URL */
    @PutMapping("/updateString/{string}")
    public void updateStringController(@PathVariable String string, @RequestBody String updatedString) {homeService.updateStringService(string, updatedString);}

    @DeleteMapping("/deleteString/{string}")
    public void deleteStringController(@PathVariable String string) {homeService.deleteStringService(string);}


}
