
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[Message],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String,datas:List[Message]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>"""),_display_(/*4.8*/message),format.raw/*4.15*/("""</h1>
  <p>"""),_display_(/*5.7*/datas),format.raw/*5.12*/("""</p>
  <p><a href=""""),_display_(/*6.16*/routes/*6.22*/.HomeController.add),format.raw/*6.41*/("""">登録</a></p>
  <p><a href=""""),_display_(/*7.16*/routes/*7.22*/.HomeController.remove),format.raw/*7.44*/("""">削除</a></p>
""")))}),format.raw/*8.2*/("""
"""))
      }
    }
  }

  def render(message:String,datas:List[Message]): play.twirl.api.HtmlFormat.Appendable = apply(message,datas)

  def f:((String,List[Message]) => play.twirl.api.HtmlFormat.Appendable) = (message,datas) => apply(message,datas)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Feb 04 17:14:55 JST 2019
                  SOURCE: C:/play/app18/app/views/index.scala.html
                  HASH: 536a7739229aaeea6c987a25eeeb5cf841d82bb0
                  MATRIX: 962->1|1093->37|1123->42|1154->65|1193->67|1223->71|1253->76|1280->83|1318->96|1343->101|1390->122|1404->128|1443->147|1498->176|1512->182|1554->204|1598->219
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8
                  -- GENERATED --
              */
          