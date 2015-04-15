package com.oheasytiger


import com.twitter.finagle.thrift.{ThriftClientRequest, ThriftServerFramedCodec, ThriftClientFramedCodec}
import com.twitter.finagle.Thrift

import com.twitter.finagle.{Http, Service}
import com.twitter.util.{Await, Future}
import java.net.InetSocketAddress
import org.jboss.netty.handler.codec.http._


class tigerService extends Hello[Future] {
	def hi() = Future.value("hi")

}


object srvx {
	def main(args: Array[String]) {
		val service = Thrift.serveIface("localhost:9000", new tigerService)
		Await.ready(service)
	}
}