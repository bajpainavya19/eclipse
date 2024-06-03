package com.pack;
class People{
	private String name;
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getname() {
		return name;
	}
}

class Address{
	private String State;
	private String City;
	private int zip;
	
	public void setState(String State) {
		this.State = State;
	}
	public String getState() {
		return State;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getCity() {
		return City;
	}
	public void setzip(int zip) {
		this.zip = zip;
	}
	public int getzip() {
		return zip;
	}
}
public class ManytomanyAssociation {

	public static void main(String[] args) {
		People obj = new People();
		obj.setname("Navya");
		
		People obj1 = new People();
		obj1.setname("Sameer");
		
		Address add = new Address();
		add.setState("Uttar Pradesh");
		add.setCity("Lucknow");
		add.setzip(226005);
		 
		Address add1 = new Address();
		add1.setState("Uttar Pradesh");
		add1.setCity("Muzzaffarpur");
		add1.setzip(224304);
		
		
		
		System.out.println(obj.getname() + " live at address " + add.getState() + " having city " + add.getCity() + " with zip code " + add.getzip());
		System.out.println(obj1.getname() + " live at address " + add1.getState() + " having city " + add1.getCity() + " with zip code " + add1.getzip());

	}

}
