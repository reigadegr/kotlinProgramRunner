class SmartDevice(val name : String, val age : Int)
{
	fun turnOn()
	{
		println("Smart device is turned on.");
	}
	var deviceAge = 1;
	var deviceName = "0";
	//var Code = 5;
	constructor(name : String, age : Int, Code : Int) : this(name, age)
	{
		deviceAge = when(Code)
		{
			in 0..10->666;
			else->0;
		}
		println("deviceAge: ${deviceAge}");
	}
}

fun main()
{
	val nnn = SmartDevice(age = 6, name = "TV");
	nnn.turnOn();
	println("name属性值为: ${nnn.name},长度为: ${nnn.age}");
}
