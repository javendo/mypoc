package com.avaya.ept.pipeline

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
  get("/") {
    "Hi there!"
  }
}