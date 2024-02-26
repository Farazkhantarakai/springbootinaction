package com.springboot.action.controllers;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springboot.action.services.AuthenticateServices;

@Controller
public class helloWorld {

    private AuthenticateServices authenticateServices;

    helloWorld(AuthenticateServices aServices) {
        super();
        this.authenticateServices = aServices;
    }

    // Array[] itemList={};

    // int[] arrayOfIntegers=new int[5];

    // arrayOfIntegers[0]=10;

    // this will create an immutable array to which we are unable to add items
    // List<String> groceryItems = List.of("first", "second", "third", "fourth");
    // ArrayList<String> items=new ArrayList<>();
    // List<Object> items = new ArrayList<>();
    // @GetMapping(value = "/getProducts")
    // public String getGroceryItems() {
    // groceryItems.add("newItems");
    // items.add("hel")
    // items.add("items");
    // items.add(12);
    // return "<h1>Hello world</h1>";
    // return "";
    // }

    /*
     * 
     * ModelMap is used for jsp whenever you a value at jsp or when you want to send
     * values to your view then you use model map
     */

    // private Logger logger=LoggerFactory.getLogger(getClass());

    // @RequestMapping(value = "/")
    // public ModelAndView logIn(@RequestParam String name, ModelMap map) {
    // map.put("name", name);

    // // logger.info(name);
    // // logger.error(name, null);
    // // logger.debug(name);

    // return new ModelAndView("login");
    // }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView logIn() {

        return new ModelAndView("login");
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String moveToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
           if(authenticateServices.authenticate(name, password)){
            model.put("name", name);
            model.put("password", password);
            return "welcom";
           }
           model.put("error","unable to authenticate");
      return "login";
    }

}
