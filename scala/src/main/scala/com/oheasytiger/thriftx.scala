package com.oheasytiger

import com.twitter.finagle.SimpleFilter
import com.twitter.util.{Await, Future}
import com.twitter.finagle.Service

/** creates and defines an implementation of the hello service
  * it follows the pattern discussed in the 
  * scrooge docs: https://twitter.github.io/scrooge/Finagle.html
  */
class tigerService extends Hello[Future] {
	def hi() = Future.value("hi")
}


class loggerFilter[Req, Rep] extends SimpleFilter[Req, Rep]
{
	def apply(request: Req, service: Service[Req, Rep]): Future[Rep] = {
		println(request)
		service(request) // decidedly simple
	}
}


case class foobarz(msg: String, vlx: Int) extends Message