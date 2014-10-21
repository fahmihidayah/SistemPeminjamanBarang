// @SOURCE:/home/aryo/Documents/Develop/SistemPeminjamanBarang/conf/routes
// @HASH:a0826a273ef549a3568d51876ec3e109d4bae88d
// @DATE:Tue Oct 21 22:29:41 WIB 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_FrontEndController_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_FrontEndController_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_FrontEndController_dashboard2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("dashboard/"),DynamicPart("idUser", """[^/]+""",true))))
        

// @LINE:9
private[this] lazy val controllers_FrontEndController_jqres3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("jqres"))))
        

// @LINE:12
private[this] lazy val controllers_BackEndAdminController_login4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/login"))))
        

// @LINE:13
private[this] lazy val controllers_BackEndAdminController_insertBarang5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/insert_barang"))))
        

// @LINE:14
private[this] lazy val controllers_BackEndAdminController_listBarang6 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/list_barang"))))
        

// @LINE:15
private[this] lazy val controllers_BackEndAdminController_insertUser7 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/insert_user"))))
        

// @LINE:16
private[this] lazy val controllers_BackEndAdminController_listUser8 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/list_user"))))
        

// @LINE:17
private[this] lazy val controllers_BackEndAdminController_insertAdmin9 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/insert_admin"))))
        

// @LINE:18
private[this] lazy val controllers_BackEndAdminController_justTest10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("api/test"))))
        

// @LINE:20
private[this] lazy val controllers_Assets_at11 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.FrontEndController.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.FrontEndController.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """dashboard/$idUser<[^/]+>""","""controllers.FrontEndController.dashboard(idUser:String)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """jqres""","""controllers.FrontEndController.jqres()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/login""","""controllers.BackEndAdminController.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/insert_barang""","""controllers.BackEndAdminController.insertBarang()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/list_barang""","""controllers.BackEndAdminController.listBarang()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/insert_user""","""controllers.BackEndAdminController.insertUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/list_user""","""controllers.BackEndAdminController.listUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/insert_admin""","""controllers.BackEndAdminController.insertAdmin()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """api/test""","""controllers.BackEndAdminController.justTest()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_FrontEndController_index0(params) => {
   call { 
        invokeHandler(controllers.FrontEndController.index(), HandlerDef(this, "controllers.FrontEndController", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_FrontEndController_login1(params) => {
   call { 
        invokeHandler(controllers.FrontEndController.login(), HandlerDef(this, "controllers.FrontEndController", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_FrontEndController_dashboard2(params) => {
   call(params.fromPath[String]("idUser", None)) { (idUser) =>
        invokeHandler(controllers.FrontEndController.dashboard(idUser), HandlerDef(this, "controllers.FrontEndController", "dashboard", Seq(classOf[String]),"GET", """""", Routes.prefix + """dashboard/$idUser<[^/]+>"""))
   }
}
        

// @LINE:9
case controllers_FrontEndController_jqres3(params) => {
   call { 
        invokeHandler(controllers.FrontEndController.jqres(), HandlerDef(this, "controllers.FrontEndController", "jqres", Nil,"GET", """""", Routes.prefix + """jqres"""))
   }
}
        

// @LINE:12
case controllers_BackEndAdminController_login4(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.login(), HandlerDef(this, "controllers.BackEndAdminController", "login", Nil,"POST", """ API""", Routes.prefix + """api/login"""))
   }
}
        

// @LINE:13
case controllers_BackEndAdminController_insertBarang5(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.insertBarang(), HandlerDef(this, "controllers.BackEndAdminController", "insertBarang", Nil,"POST", """""", Routes.prefix + """api/insert_barang"""))
   }
}
        

// @LINE:14
case controllers_BackEndAdminController_listBarang6(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.listBarang(), HandlerDef(this, "controllers.BackEndAdminController", "listBarang", Nil,"POST", """""", Routes.prefix + """api/list_barang"""))
   }
}
        

// @LINE:15
case controllers_BackEndAdminController_insertUser7(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.insertUser(), HandlerDef(this, "controllers.BackEndAdminController", "insertUser", Nil,"POST", """""", Routes.prefix + """api/insert_user"""))
   }
}
        

// @LINE:16
case controllers_BackEndAdminController_listUser8(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.listUser(), HandlerDef(this, "controllers.BackEndAdminController", "listUser", Nil,"POST", """""", Routes.prefix + """api/list_user"""))
   }
}
        

// @LINE:17
case controllers_BackEndAdminController_insertAdmin9(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.insertAdmin(), HandlerDef(this, "controllers.BackEndAdminController", "insertAdmin", Nil,"POST", """""", Routes.prefix + """api/insert_admin"""))
   }
}
        

// @LINE:18
case controllers_BackEndAdminController_justTest10(params) => {
   call { 
        invokeHandler(controllers.BackEndAdminController.justTest(), HandlerDef(this, "controllers.BackEndAdminController", "justTest", Nil,"POST", """""", Routes.prefix + """api/test"""))
   }
}
        

// @LINE:20
case controllers_Assets_at11(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     