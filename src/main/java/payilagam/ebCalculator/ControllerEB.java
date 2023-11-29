package payilagam.ebCalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class ControllerEB {
	@Autowired
	ServicesEB serviceEb;
//	@GetMapping("/reading")
//	public String unit(@RequestParam("unit") int unit) {
//		
//		return "Cost of Units "+serviceEb.add(unit)+"\r\n"+"ThankYou";
//		
//	}
	@RequestMapping("/getUnit")
	public String getUnit() {
		return "getUnit";
	}
	@RequestMapping("/calculate")
	public ModelAndView calculate(Integer ebUnits,String Tarrif) {
		
		System.out.println("Eb Units @@@@@@@@ "+ ebUnits);
		String cost=serviceEb.add(ebUnits);
		System.out.println(cost);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("getUnit");
		mv.addObject("display", cost);
		mv.addObject("unit", ebUnits);
		mv.addObject("Tariff", Tarrif);
		return mv;
	}
		
}
