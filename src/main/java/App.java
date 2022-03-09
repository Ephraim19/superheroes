
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return Integer.parseInt(processBuilder.environment().get("PORT"));
        }
        return 4567; //return default port if heroku-port isn't set (i.e. on localhost)
    }

    public static void main(String[] args) {

        port(getHerokuAssignedPort());
        staticFileLocation("/public");

        //Read heroes and squads
        get("/",(request, response) -> {
            Map<String, ArrayList> model = new HashMap<>();

            ArrayList myHeroes = Hero.getAll();
            model.put("hero",myHeroes);
            ArrayList mySquad = Squad.getAllData();
            System.out.println(mySquad);
            model.put("squad",mySquad);

            return new ModelAndView(model,"squads.hbs");
        },new HandlebarsTemplateEngine());

        //Create heroes
        post("/heroes",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams ("name");
            String age = request.queryParams ("age");
            Integer myAge = Integer.valueOf(age);
            String power = request.queryParams ("power");
            String weakness = request.queryParams ("weakness");
            System.out.println(Squad.max());
            if(Squad.max()) {
                Hero hero = new Hero(1, name, myAge, power, weakness);
                model.put("hero", hero);
                request.session().attribute("user", name);
            }
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());

        // delete all heroes
        get("/delete", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            Hero.clearAllHeroes();
            Squad.clearAllSquads();
            response.redirect("/");
            return null;
        }, new HandlebarsTemplateEngine());

        //path to squads
        get("/heroes/add",(request,response) ->{
            Map<String, Object> model = new HashMap<>();

            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());

        //Create squads
        post("/squads",(request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams ("name");
            String max = request.queryParams ("max");
            Integer maxSize = Integer.valueOf(max);
            String purpose = request.queryParams ("purpose");
            Squad squad = new Squad(maxSize,name,purpose);
            model.put("squad",squad);
            return new ModelAndView(model,"success.hbs");
        },new HandlebarsTemplateEngine());

    }
}














