package calc314.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/calc")
@Controller
public class CalculatorController {

    private final CalculatorServEmpl calcServEmpl;

    public CalculatorController(CalculatorServEmpl calculatorServEmpl){
        this.calcServEmpl = calculatorServEmpl;
    }

    @GetMapping
    public String showCalc() {
        return "calculator";
    }

    @GetMapping("/")
    public String showCalc2() {
        return "calculator";
    }

    @GetMapping("/plus")
    public String plus(@RequestParam(value = "num1", required = false) Integer num1,
                       @RequestParam(value = "num2", required = false) Integer num2,
                       Model model) {
        var result = calcServEmpl.operationResult(EOperation.PLUS, num1, num2);
        model.addAttribute("result", result);

        return "calculator";
    }

    @GetMapping("/minus")
    public String minus(@RequestParam(value = "num1", required = false) Integer num1,
                        @RequestParam(value = "num2", required = false) Integer num2,
                       Model model) {
        var result = calcServEmpl.operationResult(EOperation.MINUS, num1, num2);
        model.addAttribute("result", result);

        return "calculator";
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "num1", required = false) Integer num1,
                           @RequestParam(value = "num2", required = false) Integer num2,
                        Model model) {
        var result = calcServEmpl.operationResult(EOperation.MULTIPLY, num1, num2);
        model.addAttribute("result", result);

        return "calculator";
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(value = "num1", required = false) Integer num1,
                         @RequestParam(value = "num2", required = false) Integer num2,
                           Model model) {
        String result = calcServEmpl.operationResult(EOperation.DIVIDE, num1, num2);

        model.addAttribute("result", result);

        return "calculator";
    }

}
