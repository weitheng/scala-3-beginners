package com.rockthejvm.part1basics

object Expressions {

  // Expressions are structures that can be evaluated to a value
  val meaningOfLife = 40 + 2

  // mathematical expressions: +, -, *, /, bitwise |, &, <<, >>, >>> (rarely use bitwise in scala, usually in low level languagel ike C, java_
  val mathExpression = 2 + 3 * 4

  // comparison expressions: <, <=, >, >=, ==, !=
  val equalityTest = 1 == 2

  // boolean expressions: !, ||, &&
  val nonEqualityTest = !equalityTest

  // instructions vs expressions
  // expressions are evaluated (functional programming), instructions are executed (imperative programming)
  // we think in terms of expressions

  // ifs are expressions
  val aCondition = true
  val anIfExpression = if (aCondition) 45 else 99

  // code blocks
  val aCodeBlock = {
    // local values
    val localValue = 78
    //expressions....
    localValue + 54
    // lastexpression = value of the block
    // return localvalue + 54 (in other languages)
  }

  // everything is an expression

  /**
   * Exercise:
   */
  val someValues = {
    2 < 3 // true
  }

  val someOtherValue = {
    if (someValues) 239 else 986
    42
  } // 42, OUTPUT LAST EXPRESSION

  val yetAnotherValue = println("Scala") // Scala, ** NOT SCALA, because the valuable is a Unit type, the only value possible for a Unit is VOID in other languages
  val theUnit : Unit = () //  scala will print parenthesis if it's a Unit type
  val yetyetANotherValue = "Scala"

  def main(args: Array[String]): Unit = {
    println(anIfExpression)
    println(if (aCondition) 45 else 99) // same as above
    println(someValues)
    println(someOtherValue)
    println(yetAnotherValue)
    println(yetyetANotherValue)
  }
}
