package com.sapiens.Spring;

import com.sapiens.di.ConstructorBasedDI;
import com.sapiens.di.ConstructorBasedDIWithComponentScan;
import com.sapiens.di.SetterBasedDI;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringDemoApplication.class, args);

//		System.out.println("Setter based DI Demo");
//		AnnotationConfigApplicationContext configApplicationContext1 =
//				new AnnotationConfigApplicationContext(SetterBasedDI.class);
//		SetterBasedDI.AccountServiceClient accountServiceClient =
//				configApplicationContext1.getBean(SetterBasedDI.AccountServiceClient.class);
//		accountServiceClient.showPendingDetails();

//		 System.out.println("Constructor Based DI with Component Scan");
//		 AnnotationConfigApplicationContext configApplicationContext =
//		 new AnnotationConfigApplicationContext(ConstructorBasedDIWithComponentScan.class) ;
//		 ConstructorBasedDIWithComponentScan.AccountServiceClient beans=
//		 configApplicationContext.getBean(ConstructorBasedDIWithComponentScan.AccountServiceClient.class);
//		 beans.showPendingDetails();
		//
		//
		 System.out.println("Constructor Based DI");
		 AnnotationConfigApplicationContext context2 =
		 new AnnotationConfigApplicationContext(ConstructorBasedDI.class);
		 ConstructorBasedDI.AccountServiceClient bean =
		 context2.getBean(ConstructorBasedDI.AccountServiceClient.class);
		 bean.showPendingAccountDetails();


		System.out.println("Spring IOC Demo");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		//employee class
		Employee employee1 = (Employee) factory.getBean("employee1");
		Employee employee2 = (Employee) factory.getBean("employee2");
		Employee employee3 = (Employee) factory.getBean("employee3");
		Employee employee4 = (Employee) factory.getBean("employee4");

		//address class
		Address address1 = (Address) factory.getBean("address1");
		Address address2 = (Address) factory.getBean("address2");
		Address address3 = (Address) factory.getBean("address3");
		Address address4 = (Address) factory.getBean("address4");

		//contact class
		Contact contact1 = (Contact) factory.getBean("contact1");
		Contact contact2 = (Contact) factory.getBean("contact2");
		Contact contact3 = (Contact) factory.getBean("contact3");
		Contact contact4 = (Contact) factory.getBean("contact4");

		//officialDetail class
		OfficialDetail officialDetail1 = (OfficialDetail) factory.getBean("officialDetail1");
		OfficialDetail officialDetail2 = (OfficialDetail) factory.getBean("officialDetail2");
		OfficialDetail officialDetail3 = (OfficialDetail) factory.getBean("officialDetail3");
		OfficialDetail officialDetail4 = (OfficialDetail) factory.getBean("officialDetail4");

		//employee details
		System.out.println("------------- Employees Details --------------------");
		System.out.println("------ Employee1 ------");
		System.out.println("ID: "+employee1.getId()+" \n"+"Name: "+employee1.getName()+" \n"+"Age: "+employee1.getAge()+" \n"+"Gender: "+employee1.getGender());
		System.out.println("------ Employee2 ------");
		System.out.println("ID: "+employee2.getId()+" \n"+"Name: "+employee2.getName()+" \n"+"Age: "+employee2.getAge()+" \n"+"Gender: "+employee2.getGender());
		System.out.println("------ Employee3 ------");
		System.out.println("ID: "+employee3.getId()+" \n"+"Name: "+employee3.getName()+" \n"+"Age: "+employee3.getAge()+" \n"+"Gender: "+employee3.getGender());
		System.out.println("------ Employee4 ------");
		System.out.println("ID: "+employee4.getId()+" \n"+"Name: "+employee4.getName()+" \n"+"Age: "+employee4.getAge()+" \n"+"Gender: "+employee4.getGender());

		//address details
		System.out.println("\n ------------- Address  Details -----------");
		System.out.println("------ address Employee1 ------");
		System.out.println("city : "+address1.getCity()+"\n"+"country: "+address1.getCountry()
				+"\n"+"state: "+address1.getState()+"\n"+"pincode: "+address1.getPincode()
				+"\n"+"PO: "+address1.getPO()+"\n"+"boxNumber: "+address1.getBoxNumber());
		System.out.println("------ address Employee2 ------");
		System.out.println("city : "+address2.getCity()+"\n"+"country: "+address2.getCountry()
				+"\n"+"state: "+address2.getState()+"\n"+"pincode: "+address2.getPincode()
				+"\n"+"PO: "+address2.getPO()+"\n"+"boxNumber: "+address2.getBoxNumber());
		System.out.println("------ address Employee3 ------");
		System.out.println("city : "+address3.getCity()+"\n"+"country: "+address3.getCountry()
				+"\n"+"state: "+address3.getState()+"\n"+"pincode: "+address3.getPincode()
				+"\n"+"PO: "+address3.getPO()+"\n"+"boxNumber: "+address3.getBoxNumber());
		System.out.println("------ address Employee4 ------");
		System.out.println("city : "+address4.getCity()+"\n"+"country: "+address4.getCountry()
				+"\n"+"state: "+address4.getState()+"\n"+"pincode: "+address4.getPincode()
				+"\n"+"PO: "+address4.getPO()+"\n"+"boxNumber: "+address4.getBoxNumber());

		//contact details
		System.out.println("\n ------------- Contact  Details -----------");
		System.out.println("------ contact Employee1 ------");
		System.out.println("primaryMobileNo : "+contact1.getPrimaryMobileNo()+"\n"+"secondaryMobileNo: "+contact1.getSecondaryMobileNo()
				+"\n"+"emergencyContactNo: "+contact1.getEmergencyContactNo()+"\n"+"emailID: "+contact1.getEmailID()
				+"\n"+"officialMailID: "+contact1.getOfficialMailID());
		System.out.println("------ contact Employee2 ------");
		System.out.println("primaryMobileNo : "+contact2.getPrimaryMobileNo()+"\n"+"secondaryMobileNo: "+contact2.getSecondaryMobileNo()
				+"\n"+"emergencyContactNo: "+contact2.getEmergencyContactNo()+"\n"+"emailID: "+contact2.getEmailID()
				+"\n"+"officialMailID: "+contact2.getOfficialMailID());
		System.out.println("------ contact Employee3 ------");
		System.out.println("primaryMobileNo : "+contact3.getPrimaryMobileNo()+"\n"+"secondaryMobileNo: "+contact3.getSecondaryMobileNo()
				+"\n"+"emergencyContactNo: "+contact3.getEmergencyContactNo()+"\n"+"emailID: "+contact3.getEmailID()
				+"\n"+"officialMailID: "+contact3.getOfficialMailID());
		System.out.println("------ contact Employee4 ------");
		System.out.println("primaryMobileNo : "+contact4.getPrimaryMobileNo()+"\n"+"secondaryMobileNo: "+contact4.getSecondaryMobileNo()
				+"\n"+"emergencyContactNo: "+contact4.getEmergencyContactNo()+"\n"+"emailID: "+contact4.getEmailID()
				+"\n"+"officialMailID: "+contact4.getOfficialMailID());



		System.out.println("\n ------------- Official Detail -----------");
		System.out.println("------ contact Employee1 ------");
		System.out.println("eduQualification : "+officialDetail1.getEduQualification()+"\n"+"percentage: "+officialDetail1.getPercentage());
		System.out.println("designation : "+officialDetail1.getDesignation()+"\n"+"yearOfExp: "+officialDetail1.getYearOfExp()
				+"\n"+"currentCompanyName: "+officialDetail1.getCurrentCompanyName());
		System.out.println("------ contact Employee2 ------");
		System.out.println("eduQualification : "+officialDetail2.getEduQualification()+"\n"+"percentage: "+officialDetail2.getPercentage());
		System.out.println("designation : "+officialDetail2.getDesignation()+"\n"+"yearOfExp: "+officialDetail2.getYearOfExp()
				+"\n"+"currentCompanyName: "+officialDetail2.getCurrentCompanyName());
		System.out.println("------ contact Employee3 ------");
		System.out.println("eduQualification : "+officialDetail3.getEduQualification()+"\n"+"percentage: "+officialDetail3.getPercentage());
		System.out.println("designation : "+officialDetail3.getDesignation()+"\n"+"yearOfExp: "+officialDetail3.getYearOfExp()
				+"\n"+"currentCompanyName: "+officialDetail3.getCurrentCompanyName());
		System.out.println("------ contact Employee4 ------");
		System.out.println("eduQualification : "+officialDetail4.getEduQualification()+"\n"+"percentage: "+officialDetail4.getPercentage());
		System.out.println("designation : "+officialDetail4.getDesignation()+"\n"+"yearOfExp: "+officialDetail4.getYearOfExp()
				+"\n"+"currentCompanyName: "+officialDetail4.getCurrentCompanyName());

	}

}
