package com.syc.vertx

vertx.deployVerticle("com/syc/vertx/HelloWorld.groovy")

vertx.setPeriodic(5000){
  vertx.eventBus().send("com.syc.vertx.hello", "Angel")
}
