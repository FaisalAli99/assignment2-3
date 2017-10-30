class New (val firstName: String, val lastName: String, val age: Int) {
	import New._
	def this(firstName: String) {
		this(firstName, "", 0);
		count +=1;
		println("\nNo last name or age given." + count)
	}
	// Another secondary constructor.

	def this(firstName: String, lastName: String) {
		this(firstName, lastName, 0);
		count +=1;
		println("\nNo age given." + count)
		
	}
}

object New {
  var count=0;
}
object sample {
 def main(args: Array[String]) {
	// (1) use the primary constructor
	val al = new New("Alvin", "Alexander", 20)
	println(al)
	// (2) use a secondary constructor
	val fred = new New("Fred", "Flinstone")
	println(fred)
	// (3) use a secondary constructor
	val barney = new New("Barney")
	println(barney)
 }
}
