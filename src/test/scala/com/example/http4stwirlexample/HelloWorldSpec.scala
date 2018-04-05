package com.example.http4stwirlexample

import cats.effect.IO
import org.http4s._
import org.http4s.implicits._
import org.specs2.matcher.MatchResult

class HelloWorldSpec extends org.specs2.mutable.Specification {
  "HelloWorld" >> {
    "return 200" >> {
      uriReturns200()
    }
  }

  private[this] val returnHelloName: Response[IO] = {
    val getHW = Request[IO](Method.GET, Uri.uri("/hello/test"))
    HelloWorldServer.service.orNotFound(getHW).unsafeRunSync()
  }

  private[this] def uriReturns200(): MatchResult[Status] =
    returnHelloName.status must beEqualTo(Status.Ok)

}
