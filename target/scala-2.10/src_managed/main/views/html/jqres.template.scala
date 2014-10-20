
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
object jqres extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""
<!DOCTYPE html>
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
	$(document).ready(function() """),format.raw/*7.31*/("""{"""),format.raw/*7.32*/("""
		$("button").click(function() """),format.raw/*8.32*/("""{"""),format.raw/*8.33*/("""
			$("p").text("change the text now");
		"""),format.raw/*10.3*/("""}"""),format.raw/*10.4*/(""");
	"""),format.raw/*11.2*/("""}"""),format.raw/*11.3*/(""");
</script>
</head>
<body>

<h2>This is a heading</h2>
<p>This is a paragraph.</p>
<p>This is another paragraph.</p>
<button>Click me</button>

</body>
</html>
"""))}
    }
    
    def render(message:String): play.api.templates.HtmlFormat.Appendable = apply(message)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (message) => apply(message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Oct 19 16:10:25 WIT 2014
                    SOURCE: /home/alifkecil/work/SistemPeminjamanBarang/app/views/jqres.scala.html
                    HASH: 8ede37180558d8f87a5abcee48e1e87962a5b823
                    MATRIX: 774->1|885->18|1071->177|1099->178|1158->210|1186->211|1255->253|1283->254|1314->258|1342->259
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|38->10|38->10|39->11|39->11
                    -- GENERATED --
                */
            