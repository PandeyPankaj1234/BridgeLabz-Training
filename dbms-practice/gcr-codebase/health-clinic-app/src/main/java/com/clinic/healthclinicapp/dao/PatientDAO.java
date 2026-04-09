package com.clinic.healthclinicapp.dao;

import java.sql.*;
import com.clinic.healthclinicapp.model.Patient;      
import com.clinic.healthclinicapp.util.DBConnection; 
public class PatientDAO {

	public boolean isPatientExists(String phone,String email) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(
				"select * from patients where phone=? or email=?"
			);
			ps.setString(1,phone);
			ps.setString(2,email);
			ResultSet rs=ps.executeQuery();
			return rs.next();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public void insertPatient(Patient p) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(
				"insert into patients(name,dob,phone,email,address,blood_group) values(?,?,?,?,?,?)"
			);
			ps.setString(1,p.getName());
			ps.setString(2,p.getDob());
			ps.setString(3,p.getPhone());
			ps.setString(4,p.getEmail());
			ps.setString(5,p.getAddress());
			ps.setString(6,p.getBloodGroup());
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updatePatient(int id,String address,String phone) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(
				"update patients set address=?, phone=? where id=?"
			);
			ps.setString(1,address);
			ps.setString(2,phone);
			ps.setInt(3,id);
			ps.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet searchByName(String name) {
		try {
			Connection con=DBConnection.getConnection();
			PreparedStatement ps=con.prepareStatement(
				"select * from patients where name like ?"
			);
			ps.setString(1,"%"+name+"%");
			return ps.executeQuery();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}