package com.syc.vertx

import io.vertx.core.AbstractVerticle
import io.vertx.core.DeploymentOptions

class MainVerticle extends AbstractVerticle {

  def options = [instances:1]

  @Override
  void start(){
    vertx.deployVerticle("com/syc/vertx/InitVerticles.groovy")
  }
}
