package services

import javax.inject.Inject
import models.PersonSignUp
import play.api.cache.CacheApi

trait ProfileServiceTrait {
  def getCache(usrname: String): Option[PersonSignUp]
}

class ProfileService @Inject()(cache: CacheApi) extends ProfileServiceTrait{

  def getCache(usrname: String) = {
    val getUser = cache.get[PersonSignUp](usrname)
    val user = getUser.map(x=>x)
    user match {
      case Some(PersonSignUp(name, username, password, confirmPassword)) => user
      case None => None
    }
  }

}
