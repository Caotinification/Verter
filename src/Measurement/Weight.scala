package Measurement
object Weight extends Converter {
	/** Converts kilograms to pounds*/
	def KilogramsToPounds(kg: Double): Double = kg * KILOGRAM_TO_POUND
	/**Convert from (kg,g) to (lbs,oz)
	* @return tuple of (lbs, oz)
	* */
	def KilogramsToPounds(kg: Int, g: Double): BigUSmallU = UaToUb(kg + g/G_IN_KG, OZ_IN_LBS, KilogramsToPounds)
	/** Converts pounds to kilograms*/
	def PoundsToKilograms(lbs: Double): Double = lbs * POUND_TO_KILOGRAM
	/**Convert from (lbs,oz) to (kg,g)
	* @return returns tuple of (kg,g)
	* */
	def PoundsToKilograms(lbs: Int, oz: Double): BigUSmallU = UaToUb(lbs + oz/OZ_IN_LBS, G_IN_KG, PoundsToKilograms)

	private val KILOGRAM_TO_POUND = 2.20462262
	private val POUND_TO_KILOGRAM = 1/KILOGRAM_TO_POUND

	private val G_IN_KG = 1000
	private val OZ_IN_LBS = 16
}
