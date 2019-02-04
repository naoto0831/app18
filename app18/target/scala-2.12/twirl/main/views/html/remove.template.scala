
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object remove extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Form[models.Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title:String,form1:Form[models.Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.43*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>"""),_display_(/*4.8*/title),format.raw/*4.13*/("""</h1>
  """),_display_(/*5.4*/helper/*5.10*/.form(action=routes.HomeController.delete)/*5.52*/{_display_(Seq[Any](format.raw/*5.53*/("""
      """),_display_(/*6.8*/(helper.inputText(field=form1("id")))),format.raw/*6.45*/("""
      """),format.raw/*7.7*/("""<input type="submit">
  """)))}),format.raw/*8.4*/("""
""")))}))
      }
    }
  }

  def render(title:String,form1:Form[models.Message]): play.twirl.api.HtmlFormat.Appendable = apply(title,form1)

  def f:((String,Form[models.Message]) => play.twirl.api.HtmlFormat.Appendable) = (title,form1) => apply(title,form1)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 04 17:14:55 JST 2019
                  SOURCE: C:/play/app18/app/views/remove.scala.html
                  HASH: 3d5b7f962cef663fdf0efa7c51c781180fbc372b
                  MATRIX: 970->1|1106->42|1136->47|1167->70|1206->72|1236->76|1266->81|1291->86|1326->96|1340->102|1390->144|1428->145|1462->154|1519->191|1553->199|1608->225
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|38->6|38->6|39->7|40->8
                  -- GENERATED --
              */
          