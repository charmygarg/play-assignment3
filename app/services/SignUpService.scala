package services

import javax.inject.Inject
import models.PersonSignUp
import play.api.cache.CacheApi

trait SignUpServiceTrait {
  def setCache(value: PersonSignUp): Boolean
}

class SignUpService @Inject()(cache: CacheApi) extends SignUpServiceTrait{

  def setCache(value: PersonSignUp) = {
    cache.set(value.username, value)
    true
  }

}
