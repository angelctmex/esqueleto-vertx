package com.syc.vertx

vertx.eventBus().consumer("com.syc.vertx.hello"){ message ->

  def name = message.body()
  println("Hola $name, ya jalo esta madre")

}
