package payilagam.ebCalculator;

import org.springframework.stereotype.Service;

@Service
public class ServicesEB {
	
	

	public String add(int units) {
		if (units <= 100) {
			return "No charges";
		} else if (units > 100 && units <= 200) {
			units=units-100;
			float cost=units-100*2.25f;
			return Math.round(cost)+"";
			
		} else if (units > 200 && units <= 400) {
			units=units-100;
			float cost=100*2.25f+(units-100)*4.5f;
			return Math.round(cost)+"";
			
			
		} else if (units > 400 && units <= 500) {
			units=units-100;
			float cost=100*2.25f+200*4.5f+(units-300)*6;
			return Math.round(cost)+"";
			
		} else if (units > 500 && units <=600) {
			units=units-100;
			float cost=300*4.5f+100*6+(units-400)*8;
			return Math.round(cost)+"";
		} else if (units > 600 && units <= 800) {
			units=units-100;
			float cost=300*4.5f+100*6+100*8+(units-500)*9;
			return Math.round(cost)+"";
			
		} else if (units > 800 && units <= 1000) {
			units=units-100;
			float cost=300*4.5f+100*6+100*8+200*9+(units-700)*10;
			return Math.round(cost)+"";
		} else if (units > 1000) {
			
			units = units - 100;
			float cost=300*4.5f+100*6+100*8+200*9+200*10+(units-900)*11;
			return Math.round(cost)+"";
		}
		return "ThankYou";
		
	}
	

}
