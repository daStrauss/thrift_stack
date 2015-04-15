package com.oheasytiger

import com.twitter.finagle.{Thrift, Service}
import com.twitter.util.{Await, Future}

/** disturbingly simple implementation of a thrift server */
object thriftServe {
	def main(args: Array[String]) {
		val service = Thrift.serveIface("localhost:9000", new tigerService)
		Await.ready(service)
	}
}