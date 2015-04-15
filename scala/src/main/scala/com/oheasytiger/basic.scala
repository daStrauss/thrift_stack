package com.oheasytiger

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import org.jboss.netty.handler.codec.http._

/** a remarkably simple service for returning success */
class simpleService extends Service[HttpRequest, HttpResponse] {
	def apply(req: HttpRequest): Future[HttpResponse] =
      Future.value(new DefaultHttpResponse(
        req.getProtocolVersion, HttpResponseStatus.OK))
      .onSuccess{ y=> println("success") }
}

/** 'simple' http server, finagle-style */
object Server extends App {

  // create an instance of the server
  val service = new simpleService
    
  // run the server
  val server = Http.serve(":8080", service)
  Await.ready(server)
}