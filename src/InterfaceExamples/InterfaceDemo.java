package InterfaceExamples;


		
	public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger c = new ConsoleLogger();
		c.log();
		
		Logger f = new FileLogger();
		f.log();
	}

}
