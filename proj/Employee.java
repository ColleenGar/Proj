
public class Employee  {

		private String name="";
		private int rate = 300;
		private int hours;
		
		public Employee()
		{
			
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRate() {
			return rate;
		}

		public void setRate(int rate) {
			this.rate = rate;
		}

		public int getHours() {
			return hours;
		}

		public void setHours(int hours) {
			this.hours = hours;
		}
		
		public String getDetails()
		{
			return "Name: "+name+"\nRate: "+this.rate+"\nHours: "+this.hours;
		}
		
		
		
}
