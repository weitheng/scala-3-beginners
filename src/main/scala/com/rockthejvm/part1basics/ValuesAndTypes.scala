package com.rockthejvm.part1basics

object ValuesAndTypes {

  // values
  val meaningOfLife: Int = 42 // const int meaningofLife = 42

  //assigning is not allowed
  // meaningOfLife = 45

  // type inference
  val anInteger = 67 // : Int is optional, compiler can tell the type

  // common types
  val aBoolean : Boolean = true // or false
  val aChar : Char = 'a' // single quote
  val aString : String = "" // double quote
  val anInt : Int = 78 // 4 bytes representation
  val aShort : Short = 5263 // 2 bytes representation -2^16 -> + 2^16
  val aLong : Long = 894172398427L // L at the end differentiate Long from Int, 8 bytes representation
  val aFloat : Float = 2.4f // 4 bytes representation, with decimals
  val aDouble : Double = 3.14 // 8 byes representation

  def main(args: Array[String]): Unit = {

  }
}
