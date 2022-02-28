import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;
import models.Hero;
public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        get("/",(request, response) -> {
            Map<String, ArrayList> model = new HashMap<>();
            ArrayList myHeroes = Hero.getAll();
            model.put("hero",myHeroes);
            ArrayList mySquad = Squad.getAllData();
            model.put("squad",mySquad);
            boolean len = Squad.getSize();
            System.out.println(len);
            String sessionData = request.session().attribute("user");
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
            String squad = request.queryParams("squad");
            if (squad.equals("squadA")){
                Squad squad1 = new Squad(3,"The Fighters","Fighting crime",hero);
            } else if(squad.equals("squadB")){
                Squad squad1 = new Squad(3,"The winners","Helping the needy",hero);
            }else if(squad.equals("squadC")){
                Squad squad1 = new Squad(3,"The Foodies","Fighting hunger",hero);
            }else {
                System.out.println("No squad data is selected");
            }
            model.put("hero",hero);
            request.session().attribute("user",name);
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());
    }
}













