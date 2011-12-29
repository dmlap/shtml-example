package com.github.dmlap

object SHtmlExample extends Application {
  
  val Grades =
    List("John" -> List(89, 91, 100, 82, 96),
         "Mary" -> List(88, 88, 89, 91, 90),
         "Barry" -> List(87, 88, 81, 82, 92),
         "Mark" -> List(92, 81, 96, 81, 94),
         "June" -> List(99, 91, 81, 95, 87))

  println(Example.update({ description =>
    description.copy(children = List(description._0.copy(text = "Elements can be completely replaced, copied or updated, just like this paragraph.")))
  }, { student =>
    new Elem {
      val name = "div"
      override val children = for {
        val (name, scores) <- Grades
      } yield {
        student.copy(children = List(student._0.copy(children = List(TextNode(name))),
                                     student._1.copy(children = List(TextNode(scores(0).toString))),
                                     student._2.copy(children = List(TextNode(scores(1).toString))),
                                     student._3.copy(children = List(TextNode(scores(2).toString))),
                                     student._4.copy(children = List(TextNode(scores(3).toString))),
                                     student._5.copy(children = List(TextNode(scores(4).toString)))))
      }
    }
  }))
}
