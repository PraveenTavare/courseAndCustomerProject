package com.example.course.corejava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Serializable - Marker interface(Empty interface) - does not have data members and members functions or 
// and constants available in it
public class SerializableInterfaceExample {

	public static void main(String[] args) {

		Employee emp = new Employee(1L, "Anil", "Bangalore", 20000.00);
		String fileName = "C:\\Users\\SN256JR\\Downloads\\test.txt";

		// Serializable - Writing state of object into byte stream
		// to save the state of object and to travel object across the network
		// will use writeObject method of ObjectOuputStream class
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(emp);

			out.close();
			file.close();
			System.out.println("Object has been serialized below :: ");
			System.out.println(emp);
			
			// static variable has been re-assigned 
			emp.setEmpid(2L);

		} catch (IOException e) {

			System.out.println("IOException is caught");
			e.printStackTrace();
		}

		// Deserialization - converting byte-stream to java objects
		emp = null;

		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);

			emp = (Employee) in.readObject();
			in.close();
			file.close();

			System.out.println("Object has been deserialized below ::");
			System.out.println(emp);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
