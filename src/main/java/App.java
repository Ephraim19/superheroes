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
        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);
        staticFileLocation("/public");
       //Read heroes
        get("/",(request, response) -> {
            Map<String, ArrayList> model = new HashMap<>();
            ArrayList myHeroes = Hero.getAll();
            model.put("hero",myHeroes);
            ArrayList mySquad = Squad.getAllData();
            model.put("squad",mySquad);
            System.out.println(mySquad);
            boolean len = Squad.getSize();
            String sessionData = request.session().attribute("user");
            return new ModelAndView(model,"index.hbs");
        },new HandlebarsTemplateEngine());

        //Create heroes
        post("/heroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams ("name");
            String age = request.queryParams ("age");
            Integer myAge = Integer.valueOf(age);
            String power = request.queryParams ("power");
            String weakness = request.queryParams ("weakness");
            Hero hero = new Hero(1,name,myAge,power,weakness);
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

        // delete all heroes
        get("/delete", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Hero.clearAllHeroes();
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());


    }
}













