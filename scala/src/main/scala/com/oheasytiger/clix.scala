package com.oheasytiger

import com.twitter.finagle.Thrift

object pinger {
  def main(args : Array[String]): Unit = {
    val client = Thrift.newIface[Hello.FutureIface]("localhost:9000")

    val xr = client.hi()
  }


  def hitPing: Unit = {
    val client = Thrift.newIface[Hello.FutureIface]("localhost:9000")

    val xr = client.hi().onSuccess( y => println(y))
  }
}