package Measurement

class Converter {
	/** Tuple type for (bigUnit, smallUnit)*/
	type BigUSmallU = (Int, Double)
	/** Generalized converter, converts (big unit + small unit)_A to (big unit, small unit)_B
	* @param a: (bigUnit + smallUnit/smallUnitPerBigUnit) (ex. kilograms + grams/1000)
	* @param bU: a ratio of how to convert from bigUnitB to smallUnitB (ex. lbs = oz/16)
	* @param aTb: a function that converts from unitA to unitB (ex. meters = feet * ~3.2)
	* @return a tuple of (bigUnitB: Int, smallUnitB: Double) [ex. (1m, 0.0cm) = (3ft, ~3.4in)]
	* */
	def UaToUb(a: Double, bU: Int, aTb: Double => Double): BigUSmallU = {
		val b = aTb(a)
		(b.toInt, (b - b.toInt)*bU)
	}
}
