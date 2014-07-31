package controllers

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.libs.json.Json
import models._

object Application extends Controller {

  def index = Action {
    Redirect("/assets/index.html")
  }
}
