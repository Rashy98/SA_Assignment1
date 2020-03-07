package hospitalmanagement;

import java.util.ArrayList;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import java.util.*;

public class Activator implements BundleActivator{

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		System.out.println("Starting Hospital Management");
		Scanner scn =  new Scanner(System.in);
		
		ArrayList<String> doc = new ArrayList<String>();
		String yesOrNo;
		String specialization;
		System.out.println("Find a doctor by specialization? (y/n): ");
		yesOrNo = scn.nextLine();
		
		if(yesOrNo.equalsIgnoreCase("y")) {
			
			System.out.println("Enter Specialization : ");
			specialization = scn.next();
			
			DoctorService docs = new DoctorServiceImpl();
			doc = docs.FindDoctorsWithSpecialization(specialization);
			
			for(int i = 0 ; i< doc.size() ; i++ ) {
				System.out.println(doc.get(i));
			}
		}
		
	}

	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		System.out.println("Stopping Hospital Management");
	
	}

	
}
