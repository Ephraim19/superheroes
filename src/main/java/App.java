import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import models.Hero;
public class App {
    public static void main(String[] args) {
        get("/",(request, response) -> {
            Map<String, ArrayList> model = new HashMap<>();
            ArrayList myHeroes = Hero.getAll();
            model.put("hero",myHeroes);
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        post("/heroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams ("name");
            String age = request.queryParams ("age");
            Integer myAge = Integer.valueOf(age);
            String power = request.queryParams ("power");
            String weakness = request.queryParams ("weakness");
            Hero hero = new Hero(name,myAge,power,weakness);
            request.session().attribute("user",name);
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());
    }
}













