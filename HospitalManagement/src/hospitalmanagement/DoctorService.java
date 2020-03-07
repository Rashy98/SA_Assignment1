package hospitalmanagement;

import java.util.ArrayList;


public interface DoctorService {
	
	public ArrayList<String> FindDoctorsWithSpecialization(String _sSpecialization);
	
	public String checkSpecialization(String _sDoctorName);
	

}
