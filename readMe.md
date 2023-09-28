# (2/.10.2023) Домашнее задание "Вводное в Maven и Spring Boot + web"

# Структура проекта
- Для удобства восприятия действий контроллера использована упрощенная frontEnd структура на основе Thymeleaf
- HomeController предназначен для url localhost:8080
- CalculatroController основной контроллер согласно домашнего задания
- в CalculatroController использован class Model для обмена данными между контроллером и  calculate.html
- CalculatorServEmpl реализация интерфейса CalculatorServ  

# Проблемы, которые не удалось разрешить
- для url localhost:8080/calc & localhost:8080/calc/  
  пришлось создавать два метода, хотя по большому счету это один и тот url.
  Для url localhost:8080 такой проблемы нет.
- Как убрать сообщения (и другие подобные)
```
Class 'CalculatorController' is never used
Method 'showCalc()' is never used
```

- Средствами cofiguration не удалось убрать контроллер HomeController и тем самым сократить объем кода.
```
@Configuration
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("greet");
  }
}
```

