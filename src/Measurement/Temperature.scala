package Measurement
object Temperature {
	def CelsiusToFahrenheit(c: Double): Double = c/CF_RATIO + F_FREEZING_POINT
	def CelsiusToKelvin(c: Double): Double = c + KC_FREEZING_POINT
	def FahrenheitToCelsius(f: Double): Double = (f - F_FREEZING_POINT)*CF_RATIO
	def FahrenheitToKelvin(f: Double): Double = (f + KF_FREEZING_POINT)*CF_RATIO
	def KelvinToCelsius(k: Double): Double = k - KC_FREEZING_POINT
	def KelvinToFahrenheit(k: Double): Double = k/CF_RATIO - KF_FREEZING_POINT

	private val F_FREEZING_POINT = 32 // Fahrenheit freezing point

	private val KC_FREEZING_POINT = 273.15 // Celsius freezing point in Kelvin
	private val KF_FREEZING_POINT = 459.67 // Fahrenheit freezing point in Kelvin

	private val CF_RATIO = 5/9 // Celsius:Fahrenheit ratio
}
