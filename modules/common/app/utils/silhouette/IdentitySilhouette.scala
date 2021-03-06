package utils.silhouette

import com.mohiva.play.silhouette.core.{Identity, LoginInfo}
import Implicits._

trait IdentitySilhouette extends Identity {
	def key: String
	def loginInfo: LoginInfo = key
}