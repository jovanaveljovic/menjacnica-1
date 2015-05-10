package menjacnica.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import menjacnica.Valuta;

public class SOSacuvajUfajl {

	public static void sacuvajUFajl(String putanja, LinkedList<Valuta> kursnaLista) {
		try{
			ObjectOutputStream out = new ObjectOutputStream(
					new BufferedOutputStream(new FileOutputStream(putanja)));
			
			out.writeObject(kursnaLista);
			
			out.close();
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}
