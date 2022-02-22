package Measurement

object Length extends Converter {
	def MetersToFeet(m: Double): Double = m * METER_TO_FOOT
	def MetersToFeet(m: Int, cm: Double): BigUSmallU = UaToUb(m+cm/CM_IN_M, IN_IN_FT, MetersToFeet)

	def FeetToMeters(ft: Double): Double = ft * FOOT_TO_METER
	def FeetToMeters(ft: Int, in: Double): BigUSmallU = UaToUb(ft+in/IN_IN_FT, CM_IN_M, FeetToMeters)

	private val METER_TO_FOOT = 3.28084
	private val FOOT_TO_METER = 1.0 / METER_TO_FOOT

	private val CM_IN_M = 100
	private val IN_IN_FT = 12
}
