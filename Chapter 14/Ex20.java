import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

public class Ex20 {
	public static void start(){
		final String classname = "Test";
		System.out.println("-------Class Test-------");
		try {
			Class c = Class.forName(classname);
			System.out.println("Name: "  + c.getName());
			System.out.println("Canonical name: " + c.getCanonicalName());
			System.out.println("Simple name: " + c.getSimpleName());
			System.out.println("desiredAssertionStatus: " +c.desiredAssertionStatus());
			System.out.println("Annotations: ");
			for (Annotation a : c.getAnnotations())
				System.out.println("	" + a);
			System.out.println("Classes: ");
			for (Class cl : c.getClasses())
				System.out.println("	" + c);
			System.out.println("Class loader: " + c.getClassLoader());
			System.out.println("Component type: " + c.getComponentType());
			System.out.println("Constructors: ");
			for (Constructor constr : c.getConstructors())
				System.out.println("	" + constr);
			System.out.println("Declared annotations: ");
			for (Annotation a : c.getDeclaredAnnotations())
				System.out.println("	" + a);
			System.out.println("Declared constructors: ");
			for (Constructor constr : c.getDeclaredConstructors())
				System.out.println("	" + constr);
			System.out.println("Declared fields: ");
			for (Field f : c.getDeclaredFields())
				System.out.println("	" + f);
			System.out.println("Declared methods: ");
			for (Method m : c.getDeclaredMethods())
				System.out.println("	" + m);
			System.out.println("Declaring class: " + c.getDeclaringClass());
			System.out.println("Enlosing class: " + c.getEnclosingClass());
			System.out.println("Enlosing constructor: " + c.getEnclosingConstructor());
			System.out.println("Enlosing method: " + c.getEnclosingMethod());
			System.out.println("Enum constants: ");
			if (c.getEnumConstants()!=null)
				for (Object e : c.getEnumConstants())
					System.out.println("	" + e);
			System.out.println("Fields: ");
			for (Field f : c.getDeclaredFields())
				System.out.println("	" + f);
			System.out.println("Generic interfaces: ");
			for (Type i : c.getGenericInterfaces())
				System.out.println("	" + i);
			System.out.println("Generic superclass: " + c.getGenericSuperclass());
			System.out.println("Interfaces: ");
			for (Class i : c.getInterfaces())
				System.out.println("	" + i);
			System.out.println("Methods: ");
			for (Method m : c.getMethods())
				System.out.println("	" + m);
			System.out.println("Modifiers: " + c.getModifiers());
			System.out.println("Package: " + c.getPackage());
			System.out.println("Protection Domain: " + c.getProtectionDomain());
			System.out.println("Signers: ");
			if (c.getSigners()!=null)
				for (Object s : c.getSigners())
					System.out.println("	" + s);
			System.out.println("Superclass: " + c.getSuperclass());
			System.out.println("Type Parametres: ");
			for (TypeVariable tp : c.getTypeParameters())
				System.out.println("	" + tp);
			System.out.println("Is annotation: " + c.isAnnotation());
			System.out.println("Is anonymous: " + c.isAnonymousClass());
			System.out.println("Is array: " + c.isArray());
			System.out.println("Is enum: " + c.isEnum());
			System.out.println("Is interface: " + c.isInterface());
			System.out.println("Is local class: " + c.isLocalClass());
			System.out.println("Is member class: " + c.isMemberClass());
			System.out.println("Is primitive: " + c.isPrimitive());
			System.out.println("Is synthetic: " + c.isSynthetic());
			System.out.println(c);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(System.err);
		}
	}
}

class Test{
	int b;
	Test(){}
	Test(String a){}
	void msg(){}
}