package controllers

import javax.inject.Inject
import models.PersonSignUp
import play.api.mvc.{Controller, Action}
import services.LoginService

/**
  * Created by Charmy Garg on 10-Mar-17.
  */
class LoginController @Inject()(loginService: LoginService) extends Controller{

  def login = Action { implicit request =>
    Ok(views.html.login())
  }

  def loginAction(username: String, password: String) = Action { implicit request =>
    val data = loginService.getCache(username, password)
    data match {
      case Some(PersonSignUp(name, username, password, confirmPassword)) => Ok(views.html.profile(name, username, password))
      case None => Ok("Not a valid user")
    }
  }
}
