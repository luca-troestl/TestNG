package serializableData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int alter;

	public Person(String name, int alter) {
		this.name = name;
		this.alter = alter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAlter() {
		return alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", alter=" + alter + "]";
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
		Person p = new Person("Max", 15);
		out.writeObject(p);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))) {
			Person m = (Person) in.readObject();
			System.out.println(m);
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("personenliste.ser"))) {
			List<Person> ps = Arrays.asList(new Person("Manu", 18), new Person("Barbie", 19), new Person("Haid", 15));
			out.writeObject(ps);
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("personenliste.ser"))) {
			List<Person> ps = (List<Person>) in.readObject();
			System.out.println(ps);
		} catch (IOException e3) {
			e3.printStackTrace();
		}
		
		
	}

}
