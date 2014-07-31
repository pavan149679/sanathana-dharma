
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._

/**/
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
	"""),format.raw/*4.2*/("""<script type='text/javascript' src='"""),_display_(/*4.39*/routes/*4.45*/.Assets.at("javascripts/index.js")),format.raw/*4.79*/("""'></script>

	<ul id="persons"></ul>

	<form method="POST" action=""""),_display_(/*8.31*/routes/*8.37*/.Application.addPerson()),format.raw/*8.61*/("""">
		<input type="text" name="name"/>
		<button>Add Person</button>
	</form>
""")))}),format.raw/*12.2*/("""
"""))}
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Wed Jul 30 19:35:09 CDT 2014
                  SOURCE: /Users/pavankumar/workspaces/sanathana-dharma/app/views/index.scala.html
                  HASH: 7fbcd163a5f46ebc3f919f48845e0441a7aac2d5
                  MATRIX: 498->1|587->3|615->6|646->29|685->31|713->33|776->70|790->76|844->110|938->178|952->184|996->208|1104->286
                  LINES: 19->1|22->1|24->3|24->3|24->3|25->4|25->4|25->4|25->4|29->8|29->8|29->8|33->12
                  -- GENERATED --
              */
          