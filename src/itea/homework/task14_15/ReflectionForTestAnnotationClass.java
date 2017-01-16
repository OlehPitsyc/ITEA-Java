package itea.homework.task14_15;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ReflectionForTestAnnotationClass {

	public static void main(String[] args) throws ClassNotFoundException {
		for (Method method : ReflectionForTestAnnotationClass.class.getClassLoader()
				.loadClass(("itea.homework.task14_15.TestAnnotationClass")).getMethods()) {
			for (Annotation annot : method.getDeclaredAnnotations()) {
				System.out.println("Annotations in the method '" + method + "' : " + annot);
			}

		}
		System.out.println();
		Class objWhithInfo = Class.forName("itea.homework.task14_15.TestAnnotationClass");

		if (!objWhithInfo.isArray()) {
			Method methods[] = objWhithInfo.getMethods();
			for (Method method : methods) {
				System.out.println("There are methods of the TestAnnotationClass: " + method.getName());
			}
		}

	}

}