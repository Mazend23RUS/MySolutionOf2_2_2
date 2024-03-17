package web.controller;


import hiber.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RestController
@RequestMapping(value = "/", method = RequestMethod.GET)
public class HelloController {

//    @Autowired
//    private final ImpCarDAO impCarDAO;

    @GetMapping()
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm Spring MVC application");
        messages.add("5.2.0 version by sep'19 ");
        model.addAttribute("messages", messages);
        return "index";
    }


//    @GetMapping(value = "calculator")
//    public String printCalculator(@RequestParam (value = "a" ,required = false) int a,
//                                  @RequestParam (value = "b", required = false) int b,
//                                  @RequestParam (value = "action", required = false) String action,  Model model){
//    model.addAttribute("calcul","Результат вычислений : " + a + action + b);
//    return "calculator";
//    }

    @GetMapping(value = "cars")
    public String getCars(ModelMap model) {
        Car car1 = new Car();
        List<Car> list = car1.creatingListCars();
        model.addAttribute("carPages", list);
        return "cars";
    }

    @GetMapping("/cars/{count}")
    public String indexId(@RequestParam("count") int count, Model model) {
        Car car = new Car();
        model.addAttribute("carResultPage", car.getListbyID(count));
        return "resultList";
    }

    @GetMapping(value = "/quantityOfCars")
    public String getQuantityOfCars(Model model) {
        int quantityOfCars;
        Car car1 = new Car();
        quantityOfCars = car1.creatingListCars().size();
        model.addAttribute("quantity", quantityOfCars);
        return "quantityOfCars";

    }
}