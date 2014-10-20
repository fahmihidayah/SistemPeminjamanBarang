package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class FrontEndController extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result login(){
    	return ok(login.render(""));
    }
    
    public static Result dashboard(){
    	return ok(dashboard.render(""));
    }
    
    public static Result jqres(){
    	return ok(jqres.render(""));
    }
}
