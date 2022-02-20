import Measurement._
object Main {
	def main(args: Array[String]): Unit = {
		val a = args(0).toInt
		val b = args(1).toInt
		println("BigUnit: " + a + ", SmallUnit: " + b)
		println(Length.FeetToMeters(a, b))
		println(Temperature.FahrenheitToCelsius(a))
		println(Weight.PoundsToKilograms(a,b))
	}
}
