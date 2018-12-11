package my.day10;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

public class HeroTest {

	public static void main(String[] args) {
	Hero hero1= new Hero();
	Warrior wr= new Warrior();
	Wizard wz= new Wizard();
	
	Hero hero2= new Warrior();
	
	hero1.attack();
	
	ArrayList<Hero> list= new ArrayList<Hero>();
	list.add(wr);
	list.add(wz);
	//list.add(hero1);
	//list.add(hero2);
	
	for(Hero h: list) {
		h.attack();
		
		if(h instanceof Warrior) {
			Warrior t=(Warrior) h;
			t.groundCutting();
			System.out.println(t.getClass());
			Calendar c= Calendar.getInstance();
			System.out.println(c);
			System.out.println(c.get(Calendar.YEAR) + "³â");
			System.out.println(c.get(Calendar.MONTH)+1 + "¿ù");
			System.out.println(c.get(Calendar.DATE) + "ÀÏ");
			long time= System.currentTimeMillis();
			
		} else if (h instanceof Wizard) {
			Wizard t=(Wizard) h;
			t.freezing();
			}
		}
	}
}
