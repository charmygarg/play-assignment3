package controllers

import javax.inject.Inject
import models.PersonSignUp
import play.api.mvc.{Action, Controller}
import services.SignUpService

class SignUpController @Inject()(signUpService: SignUpService) extends Controller {

  def signUp = Action { implicit request =>
    Ok(views.html.signUp())
  }

  def signUpAction(name: String, username: String, password: String, confirmPassword: String) = Action { implicit request =>
    if(password == confirmPassword) {
      val data = PersonSignUp(name, username, password, confirmPassword)
      signUpService.setCache(data)
      Ok(views.html.profile(name, username, password))
    }
    else {
      Ok("Password doesn't match")
    }
  }

}
