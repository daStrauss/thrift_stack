package com.oheasytiger

import com.twitter.util.{Await, Future}

/** creates and defines an implementation of the hello service
  * it follows the pattern discussed in the 
  * scrooge docs: https://twitter.github.io/scrooge/Finagle.html
  */
class tigerService extends Hello[Future] {
	def hi() = Future.value("hi")
}


