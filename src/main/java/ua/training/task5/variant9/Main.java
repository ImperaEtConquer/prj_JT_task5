package ua.training.task5.variant9;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class Main {
	public static void main(String[] args) {
		Pet cat = new Pet("Siberian", 4, 2, "Dusya");

		System.out.println("\n" + "1.1 Task" + "\n");

		Class clazz = cat.getClass();

		System.out.println("Class name : " + clazz);

		Constructor[] constructors = clazz.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println("Constructor : " + constructor.getName());
			System.out.println("{");
			Parameter[] constructorParams = constructor.getParameters();
			for (Parameter parameter : constructorParams) {
				System.out.println("Parameter : " + parameter.getType() + " " + parameter.getName());
			}
			System.out.println("}");
		}

		System.out.println("\n" + "1.2 Task" + "\n");

		System.out.println("Class modifier : " + Modifier.toString(clazz.getModifiers()));

		System.out.println("\n" + "2.1 Task" + "\n");

		Method[] methods = clazz.getDeclaredMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(CallMe.class)) {
				Parameter[] methodParams = method.getParameters();
				System.out.println("Method : " + method.getName());
				System.out.println("{");
				for (Parameter param : methodParams) {
					System.out.println("Parameter : " + param.getType() + " " + param.getName());
				}
				System.out.println("}");
			}
		}

		System.out.println("\n" + "2.2 Task" + "\n");

		System.out.println("Package name: " + clazz.getPackage());
		System.out.println("Class simple name : " + clazz.getSimpleName());

		System.out.println("\n" + "3.1 Task" + "\n");

		for (Method method : methods) {
			System.out.println("Method : " + Modifier.toString(method.getModifiers()) + " " + method.getName() + "()");
			System.out.println("{");
			Parameter[] methodParams = method.getParameters();
			for (Parameter param : methodParams) {
				System.out.println("Parameter : " + param.getType() + " " + param.getName());
			}
			System.out.println("}");
		}

		System.out.println("\n" + "3.2 Task" + "\n");

		System.out.println("Superclass name : " + clazz.getSuperclass().getName());

		System.out.println("\n" + "4.1 Task" + "\n");

		Field[] fields = clazz.getDeclaredFields();
		for (Field field : fields) {
			System.out.println("Field : " + Modifier.toString(field.getModifiers()) + " " + field.getType() + " "
					+ field.getName());
		}

		System.out.println("\n" + "4.2 Task" + "\n");

		for (Method method : methods) {
			for (Annotation annotation : method.getAnnotations()) {
				System.out.println("Annotation : " + annotation);
			}
		}

		System.out.println("\n" + "5.1 Task" + "\n");
		
		
		for (Class interf : clazz.getInterfaces()) {
			System.out.println(interf);
		}
		
		System.out.println("\n" + "5.2 Task" + "\n");
		
		for (Field field : fields) {
			System.out.println("Field : " + Modifier.toString(field.getModifiers()) + " " + field.getType() + " "
					+ field.getName());
		}

	}
}
