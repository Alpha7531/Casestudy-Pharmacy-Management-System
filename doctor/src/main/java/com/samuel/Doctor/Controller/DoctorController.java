package com.samuel.Doctor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.samuel.Doctor.Model.AuthenticationRequest;
import com.samuel.Doctor.Model.AuthenticationResponse;
import com.samuel.Doctor.Model.DoctorModel;
import com.samuel.Doctor.Repository.DoctorRepository;
import com.samuel.Doctor.Service.DoctorService;
import com.samuel.Doctor.Service.JwtUtils;
@RestController
public class DoctorController {
	
@Autowired
private DoctorRepository DoctorRepository;

@Autowired
private DoctorService DoctorService;

@Autowired
private JwtUtils jwtUtils;

@Autowired
private AuthenticationManager authenticationManager;
//---------------------------Registration and Login -------------------------------//

@GetMapping("/test")
private String testingToken()
{
	return "chal gya";
	
}
@GetMapping("/findDoctor")
public List<DoctorModel> getDoctor() {
	return DoctorRepository.findAll();
}
	
@PostMapping("/reg")
	private ResponseEntity<?> subscribeClient(@RequestBody AuthenticationRequest authenticationRequest)
	{
		String Doctorname = authenticationRequest.getDoctorname();
		String password = authenticationRequest.getPassword();
		String emailid = authenticationRequest.getEmailid();
		String contactno = authenticationRequest.getContactno();
		DoctorModel DoctorModel = new DoctorModel();
        DoctorModel.setDoctorname(Doctorname);
        DoctorModel.setPassword(password);
        DoctorModel.setContactno(contactno);
        DoctorModel.setEmailid(emailid);
        try {
        	DoctorRepository.save(DoctorModel);
		}


		catch (Exception e)
		{
			return ResponseEntity.ok(new AuthenticationResponse("Error During Auth for Doctor" + Doctorname));
		}
		return ResponseEntity.ok(new AuthenticationResponse("Successful Auth" + Doctorname));
	}
	@PostMapping("/auth")
	private ResponseEntity<?> authenticateClient(@RequestBody AuthenticationRequest authenticationRequest)
	{
		String Doctorname = authenticationRequest.getDoctorname();
		String password = authenticationRequest.getPassword();

//--------------------------------CRUD Operations----------------------//
	try {
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(Doctorname, password));
	} catch (Exception e) {
		return ResponseEntity.ok(new AuthenticationResponse("Error while authenticating" + Doctorname));
	}
	//return ResponseEntity.ok(new AuthenticationResponse("Succesfull authentication for user " + username));
	UserDetails loadedUser = DoctorService.loadUserByUsername(Doctorname);
	String generatedToken = jwtUtils.generateToken(loadedUser);
	return ResponseEntity.ok(new AuthenticationResponse(generatedToken));
}

}