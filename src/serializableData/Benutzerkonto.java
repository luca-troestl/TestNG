package serializableData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Benutzerkonto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String Benutzer;
	private transient String Passwort;
	
	



	public Benutzerkonto(String benutzer, String passwort) {
		this.Benutzer = benutzer;
		this.Passwort = passwort;
	}





	public String getBenutzer() {
		return Benutzer;
	}





	public void setBenutzer(String benutzer) {
		Benutzer = benutzer;
	}





	public String getPasswort() {
		return Passwort;
	}





	public void setPasswort(String passwort) {
		Passwort = passwort;
	}

	

	@Override
	public String toString() {
		return "Benutzerkonto [Benutzer= " + Benutzer + " Passwort= " + Passwort + "]";
	}





	public static void main(String[] args) throws ClassNotFoundException {
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("benutzerkonto.ser"))) {
			Benutzerkonto b = new Benutzerkonto("Manuel", "KING1234!");
			out.writeObject(b);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("benutzerkonto.ser"))) {
			Benutzerkonto bk = (Benutzerkonto) in.readObject();
			System.out.println(bk);
		} catch (IOException e2) {
			e2.printStackTrace();
		}

	}

}
