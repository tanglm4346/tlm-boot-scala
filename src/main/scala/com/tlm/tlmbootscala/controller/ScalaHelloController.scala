package com.tlm.tlmbootscala.controller

import org.springframework.web.bind.annotation.{GetMapping, RestController}


@RestController
class ScalaHelloController {
  @GetMapping(value = Array("/scala/hello"))
  def sayHello():String ={
    "hello scala ..."
  }


}
