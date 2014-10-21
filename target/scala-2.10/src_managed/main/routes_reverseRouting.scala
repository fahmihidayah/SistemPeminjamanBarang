// @SOURCE:/home/aryo/Documents/Develop/SistemPeminjamanBarang/conf/routes
// @HASH:a0826a273ef549a3568d51876ec3e109d4bae88d
// @DATE:Tue Oct 21 21:07:36 WIB 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseBackEndAdminController {
    

// @LINE:17
def insertAdmin(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/insert_admin")
}
                                                

// @LINE:14
def listBarang(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/list_barang")
}
                                                

// @LINE:13
def insertBarang(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/insert_barang")
}
                                                

// @LINE:15
def insertUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/insert_user")
}
                                                

// @LINE:18
def justTest(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/test")
}
                                                

// @LINE:16
def listUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/list_user")
}
                                                

// @LINE:12
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "api/login")
}
                                                
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFrontEndController {
    

// @LINE:9
def jqres(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "jqres")
}
                                                

// @LINE:8
def dashboard(idUser:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "dashboard/" + implicitly[PathBindable[String]].unbind("idUser", dynamicString(idUser)))
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:7
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseBackEndAdminController {
    

// @LINE:17
def insertAdmin : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.insertAdmin",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/insert_admin"})
      }
   """
)
                        

// @LINE:14
def listBarang : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.listBarang",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list_barang"})
      }
   """
)
                        

// @LINE:13
def insertBarang : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.insertBarang",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/insert_barang"})
      }
   """
)
                        

// @LINE:15
def insertUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.insertUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/insert_user"})
      }
   """
)
                        

// @LINE:18
def justTest : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.justTest",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/test"})
      }
   """
)
                        

// @LINE:16
def listUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.listUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/list_user"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.BackEndAdminController.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "api/login"})
      }
   """
)
                        
    
}
              

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFrontEndController {
    

// @LINE:9
def jqres : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FrontEndController.jqres",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "jqres"})
      }
   """
)
                        

// @LINE:8
def dashboard : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FrontEndController.dashboard",
   """
      function(idUser) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("idUser", encodeURIComponent(idUser))})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FrontEndController.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:7
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.FrontEndController.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:20
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseBackEndAdminController {
    

// @LINE:17
def insertAdmin(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.insertAdmin(), HandlerDef(this, "controllers.BackEndAdminController", "insertAdmin", Seq(), "POST", """""", _prefix + """api/insert_admin""")
)
                      

// @LINE:14
def listBarang(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.listBarang(), HandlerDef(this, "controllers.BackEndAdminController", "listBarang", Seq(), "POST", """""", _prefix + """api/list_barang""")
)
                      

// @LINE:13
def insertBarang(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.insertBarang(), HandlerDef(this, "controllers.BackEndAdminController", "insertBarang", Seq(), "POST", """""", _prefix + """api/insert_barang""")
)
                      

// @LINE:15
def insertUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.insertUser(), HandlerDef(this, "controllers.BackEndAdminController", "insertUser", Seq(), "POST", """""", _prefix + """api/insert_user""")
)
                      

// @LINE:18
def justTest(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.justTest(), HandlerDef(this, "controllers.BackEndAdminController", "justTest", Seq(), "POST", """""", _prefix + """api/test""")
)
                      

// @LINE:16
def listUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.listUser(), HandlerDef(this, "controllers.BackEndAdminController", "listUser", Seq(), "POST", """""", _prefix + """api/list_user""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.BackEndAdminController.login(), HandlerDef(this, "controllers.BackEndAdminController", "login", Seq(), "POST", """ API""", _prefix + """api/login""")
)
                      
    
}
                          

// @LINE:20
class ReverseAssets {
    

// @LINE:20
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseFrontEndController {
    

// @LINE:9
def jqres(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FrontEndController.jqres(), HandlerDef(this, "controllers.FrontEndController", "jqres", Seq(), "GET", """""", _prefix + """jqres""")
)
                      

// @LINE:8
def dashboard(idUser:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FrontEndController.dashboard(idUser), HandlerDef(this, "controllers.FrontEndController", "dashboard", Seq(classOf[String]), "GET", """""", _prefix + """dashboard/$idUser<[^/]+>""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FrontEndController.index(), HandlerDef(this, "controllers.FrontEndController", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:7
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.FrontEndController.login(), HandlerDef(this, "controllers.FrontEndController", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    