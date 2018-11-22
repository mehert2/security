package sec.oauth2.oauth2sec;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/servicedesk")
public class ServiceDesk {
	
	@RequestMapping(method=RequestMethod.GET)
	//public String  getTicketId(@RequestParam(value="name") String name) {
	public String  getTicketId() {
//		System.out.println("###name="+name);
//		return 1+"-"+name;
		return "Bname";
	}

}
