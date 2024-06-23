# SpringBoot Day 2

* here in this module we have learnt about different kinds of annotations
* @Component - will create bean in Ioc container for that class
* @Autowired - will create wiring b/w two classes 
	Example : 
	Laptop cannot run with CPU 

	class Laptop{

        @Autowired
		private CPU cpu;  ---> Field injection

		compile()
		{
			cpu.process();
		}
	}

* Injections / Dependency Injection

      * Field Injection
      * Constructor Injection
      * Setter Injection

* Default value by @Values("")
* @Primary - Class level annotation --> To give priority when comes to interface
* @Qualifier("smallCase Of class name") --> wil give precedence to Qualifier than @Primary annotaion


