package controllers;

import models.Admin;
import models.User;
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
    
    public static Result dashboard(String idUser){
    	User user = User.finder.byId(Long.parseLong(idUser));
    	Admin admin = Admin.finder.where().eq("user", user).findUnique();
    	if(admin != null){
    		return ok(dashboardAdmin.render(user, admin));
    	}
    	return ok("Under construction");
//    	return ok(dashboard.render(null));
    }
    
    public static Result jqres(){
    	return ok(jqres.render(""));
    }
}
