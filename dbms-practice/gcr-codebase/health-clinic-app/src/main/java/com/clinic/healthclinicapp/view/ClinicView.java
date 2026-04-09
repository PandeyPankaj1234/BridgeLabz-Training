package com.clinic.healthclinicapp.view;

import java.util.*;
import com.clinic.healthclinicapp.controller.PatientController;   
import com.clinic.healthclinicapp.model.Patient;                  

public class ClinicView {
	public void menu() {
		Scanner sc=new Scanner(System.in);
		PatientController pc=new PatientController();

		System.out.println("1.Register Patient");
		System.out.println("2.Update Patient");
		System.out.println("3.Search Patient");
		int ch=sc.nextInt();
		sc.nextLine();

		if(ch==1) {
			System.out.print("Name: ");
			String name=sc.nextLine();
			System.out.print("DOB: ");
			String dob=sc.nextLine();
			System.out.print("Phone: ");
			String phone=sc.nextLine();
			System.out.print("Email: ");
			String email=sc.nextLine();
			System.out.print("Address: ");
			String address=sc.nextLine();
			System.out.print("Blood Group: ");
			String bg=sc.nextLine();

			Patient p=new Patient(name,dob,phone,email,address,bg);
			pc.registerPatient(p);
		}
		else if(ch==2) {
			System.out.print("Patient ID: ");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.print("New Address: ");
			String addr=sc.nextLine();
			System.out.print("New Phone: ");
			String phone=sc.nextLine();
			pc.updatePatient(id,addr,phone);
		}
		else if(ch==3) {
			System.out.print("Search Name: ");
			String name=sc.nextLine();
			pc.searchPatient(name);
		}
		sc.close();
	}
}