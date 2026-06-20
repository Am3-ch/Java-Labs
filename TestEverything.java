/* This program tests the functionality of the TestEverything class. It creates an instance of TestEverything and calls the switchTest method with a specific name, printing the result to the console. The switchTest method uses a switch statement to return different strings based on the input name. If the name matches "humphrey" or "mumba", it returns a corresponding string; otherwise, it returns "not found". */
package No1;

public class TestEverything {
	String name;

	public static void main(String[] ars) {
		TestEverything check = new TestEverything();
		System.out.println(check.switchTest("chama"));
	}

	String switchTest(String name) {
		this.name = name;
		String b;
		switch (this.name) {
			case "humphrey":
				b = "humphrey chama 2022000051";
				break;
			case "mumba":
				b = "patience mumba chama 2022000051";
				break;
			default:
				b = "not found";
		}
		return b;
	}
}
