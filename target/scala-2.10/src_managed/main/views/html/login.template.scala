
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<html>

<head>

  <meta charset="UTF-8">

  <title>Login</title>
	<link rel="stylesheet" href="""),_display_(Seq[Any](/*9.31*/routes/*9.37*/.Assets.at("css/style.css"))),format.raw/*9.64*/(""" media="screen" type="text/css" />
	<script type="text/javascript" src="""),_display_(Seq[Any](/*10.38*/routes/*10.44*/.Assets.at("js/jquery-1.11.0.js"))),format.raw/*10.77*/("""></script>
	<script type="text/javascript" language="javascript">
		$(document).ready(function() """),format.raw/*12.32*/("""{"""),format.raw/*12.33*/("""
	      $(".btn").click(function(event)"""),format.raw/*13.39*/("""{"""),format.raw/*13.40*/("""
	    	  $.ajax("""),format.raw/*14.16*/("""{"""),format.raw/*14.17*/("""
	    		  type: "POST",
	    		  url: "/api/login",
	    		  data: "username="+$("#username").val()+"&password="+$("#password").val()+"",
	    		  success: function(msg)"""),format.raw/*18.32*/("""{"""),format.raw/*18.33*/("""
	    		        
	    		        window.location.replace("/dashboard/"+msg.data.admin.user.id);
	    		        //$.cookie("test", 1);
	    		  """),format.raw/*22.10*/("""}"""),format.raw/*22.11*/(""",
	    		  error: function(XMLHttpRequest, textStatus, errorThrown) """),format.raw/*23.67*/("""{"""),format.raw/*23.68*/("""
	    		     alert("login error");
	    		  """),format.raw/*25.10*/("""}"""),format.raw/*25.11*/("""
	    		"""),format.raw/*26.8*/("""}"""),format.raw/*26.9*/(""");
	      	"""),format.raw/*27.9*/("""}"""),format.raw/*27.10*/(""");
	   	"""),format.raw/*28.6*/("""}"""),format.raw/*28.7*/(""");
	</script>
</head>

<body>

  <body>
	<div class="login">
		<div class="login-screen">
			<div class="app-title">
				<h1>SISINBAR</h1>
			</div>

			<div class="login-form">
				<div class="control-group">
				<input type="text" class="login-field" value="" placeholder="username" id="username">
				<label class="login-field-icon fui-user" for="login-name"></label>
				</div>

				<div class="control-group">
				<input type="password" class="login-field" value="" placeholder="password" id="password">
				<label class="login-field-icon fui-lock" for="login-pass"></label>
				</div>

				<a class="btn btn-primary btn-large btn-block" >login</a>
				<a class="login-link" href="""),_display_(Seq[Any](/*53.33*/routes/*53.39*/.FrontEndController.index())),format.raw/*53.66*/(""" id="lost">Lost your password?</a>
			</div>
		</div>
	</div>
</body>

</body>

</html>"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Oct 21 06:42:49 WIT 2014
                    SOURCE: /home/alifkecil/work/SistemPeminjamanBarang/app/views/login.scala.html
                    HASH: 4ea3d7ad51f8ce66b4bdd92ee94e7607374e6090
                    MATRIX: 774->1|885->18|1016->114|1030->120|1078->147|1186->219|1201->225|1256->258|1381->355|1410->356|1477->395|1506->396|1550->412|1579->413|1776->582|1805->583|1975->725|2004->726|2100->794|2129->795|2201->839|2230->840|2265->848|2293->849|2331->860|2360->861|2395->869|2423->870|3145->1556|3160->1562|3209->1589
                    LINES: 26->1|29->1|37->9|37->9|37->9|38->10|38->10|38->10|40->12|40->12|41->13|41->13|42->14|42->14|46->18|46->18|50->22|50->22|51->23|51->23|53->25|53->25|54->26|54->26|55->27|55->27|56->28|56->28|81->53|81->53|81->53
                    -- GENERATED --
                */
            