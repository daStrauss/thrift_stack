package com.oheasytiger

import com.twitter.finagle.{Thrift, Service}
import com.twitter.util.{Await, Future}

/** disturbingly simple implementation of a thrift server */
object thriftServe {

	val tgr = new tigerService
//	val lgf = new loggerFilter

	val srvr =  tgr

	def main(args: Array[String]) {
		val service = Thrift.serve("localhost:9000", srvr)
		Await.ready(service)
	}
}