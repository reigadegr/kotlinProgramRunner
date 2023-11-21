
class SmartDevice {
	fun turnOn()
	{
		println("Smart device is turned on.");
	}

	fun turnOff()
	{
		println("Smart device is turned off.");
	}
	val name = "Android TV";
}

fun main()
{
	val nnn = SmartDevice();
	nnn.turnOn();
	nnn.turnOff();
	println(nnn.name);
}
