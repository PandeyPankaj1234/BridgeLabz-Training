package com.clinic.healthclinicapp.controller;

import java.sql.ResultSet;
import com.clinic.healthclinicapp.dao.PatientDAO;
import com.clinic.healthclinicapp.model.Patient;

public class PatientController {

	PatientDAO dao = new PatientDAO(); 

	public void registerPatient(Patient p) {
		if(dao.isPatientExists(p.getPhone(), p.getEmail())) {
			System.out.println("Patient already exists");
			return;
		}
		dao.insertPatient(p);
		System.out.println("Patient registered successfully");
	}

	public void updatePatient(int id, String address, String phone) {
		dao.updatePatient(id, address, phone);
		System.out.println("Patient updated");
	}

	public void searchPatient(String name) {
		try {
			ResultSet rs = dao.searchByName(name);
			while(rs.next()) {
				System.out.println(
					rs.getInt("id") + " " +
					rs.getString("name") + " " +
					rs.getString("phone")
				);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
