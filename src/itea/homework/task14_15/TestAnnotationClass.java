package itea.homework.task14_15;

public class TestAnnotationClass {

	private String name = "Oleg";

	@TestAnnotation(season = "winter", temperature = -10)
	@SuppressWarnings("deprecation")
	public void sayHello() {
		System.out.println("Hello World");
	}

	@TestAnnotation(season = "summer", temperature = +25)
	@Override
	public String toString() {
		return "My name is  " + name;
	}

	@TestAnnotation(season = "spring", temperature = 0)
	@Deprecated
	public boolean isTodayCold() {
		return false;
	}
}