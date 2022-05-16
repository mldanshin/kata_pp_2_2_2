package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.Car;
import web.services.CarService;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping(value = "")
    public String getCars(
            @RequestParam(value = "count", required = false) String count,
            Model model, CarService service) {
        List<Car> cars = (count == null) ? service.getList() : service.getList(Integer.parseInt(count));
        model.addAttribute("cars", cars);
        return "cars";
    }
}
