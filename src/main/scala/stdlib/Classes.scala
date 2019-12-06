

package stdlib

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers



class ClassWithValParameter(val name: String);

object classWithValParameterClasses
{
 
  def main(args : Array[String])
  {
    val aClass = new ClassWithValParameter("Gandalf")
    println(aClass.name);
  }
  
}
