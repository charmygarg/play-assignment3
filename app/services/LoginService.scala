package services

import javax.inject.Inject

import models.PersonSignUp
import play.api.cache.CacheApi

trait LoginServiceTrait {
  def getCache(usrname: String, pass: String): Option[PersonSignUp]
}

class LoginService @Inject()(cache: CacheApi) extends LoginServiceTrait{

  def getCache(usrname: String, pass: String) = {
    val getUser = cache.get[PersonSignUp](usrname)
    val user = getUser.map(x=>x)
    user match {
      case Some(PersonSignUp(name, username, password, confirmPassword)) =>
        if (usrname == username && pass == password) user
        else None
      case None => None
    }
  }

}
