package com.github.dmlap

object SHtmlExample extends Application {
  println(Example.update({ description =>
    description.copy(children = List(description._0.copy(text = "This is an amazing example!")))
  }, { student =>
    student
  }))
}
