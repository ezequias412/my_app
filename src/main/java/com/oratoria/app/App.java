package com.oratoria.app;

import spark.*;
import static spark.Spark.*;
import java.util.Scanner;
import java.util.*;
import java.lang.Object;

import spark.ModelAndView;
import spark.TemplateEngine;

public class App{

    public static void main( String[] args ){
    	externalStaticFileLocation("./media");
    	
    	/*return the menu of the application*/
    	get("/main", (request, response) -> {
      		return new ModelAndView(null, "main.moustache");
    	},
      		new MustacheTemplateEngine()
    	);
        System.out.println( "Hello World!" );
        get("/prueba", (request, response) -> {
            return new ModelAndView(null, "prueba.moustache");
        },
            new MustacheTemplateEngine()
        );
    }
}
