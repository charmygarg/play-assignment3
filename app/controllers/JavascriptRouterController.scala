package controllers
import play.api.mvc._
import play.api.routing.JavaScriptReverseRouter

class JavascriptRouterController extends Controller{

  def javascriptRoutes = Action { implicit request =>
    Ok(
      JavaScriptReverseRouter("jsRoutes")(
        routes.javascript.SignUpController.signUp,
        routes.javascript.SignUpController.signUpAction,
        routes.javascript.LoginController.login,
        routes.javascript.LoginController.loginAction,
        routes.javascript.ProfileController.profile,
        routes.javascript.WelcomeController.welcome
      )
    ).as("text/javascript")
  }

}
