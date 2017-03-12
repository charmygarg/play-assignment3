package controllers

import javax.inject.Inject
import models.PersonSignUp
import play.api.mvc.{Controller, Action}
import services.ProfileService
import sun.security.util.Password

class ProfileController @Inject()(profileService: ProfileService) extends Controller{

  def profile(name: String, username: String, password: String) = Action { implicit request =>
    val data = profileService.getCache(username)
    data match {
      case Some(PersonSignUp(name, username, password, confirmPassword)) => Ok(views.html.profile(name, username, password))
      case None => Ok("Try again later")
    }
  }
}