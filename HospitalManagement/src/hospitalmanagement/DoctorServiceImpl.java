package hospitalmanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DoctorServiceImpl implements DoctorService {
	
	public HashMap <String, String> NameAndSpecialization = new HashMap<String, String>();
	
	public DoctorServiceImpl() {
		
		NameAndSpecialization.put("Mala Sudusinghe","Eye Surgeon");
		NameAndSpecialization.put("Kushan Edirimanna","Surgeon");
	}
	

	@Override
	public ArrayList<String> FindDoctorsWithSpecialization(String _sSpecialization) {
		ArrayList<String> doctors = new ArrayList<String>();
		for(Map.Entry<String, String> docAndSpec : NameAndSpecialization.entrySet()) {
			if(docAndSpec.getValue().contains(_sSpecialization)) {
				doctors.add(docAndSpec.getKey());
			}
		}
		return  doctors;
	}

	@Override
	public String checkSpecialization(String _sDoctorName) {
		for(Map.Entry<String, String> docAndSpec : NameAndSpecialization.entrySet()) {
			if(docAndSpec.getKey().contains(_sDoctorName)) {
				return _sDoctorName;
			}
			
	}
		return "Doctor Not Found";
	}
	

}
