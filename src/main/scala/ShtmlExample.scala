package com.github.dmlap

object SHtmlExample extends Application {
  println(Example.update({ description =>
    <p>This is an amazing example!</p>.toString
  }, { student =>
    ""
  }))
}
