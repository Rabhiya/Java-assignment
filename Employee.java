package p1;

	
	public class Employee {

	    /*long empId;*/
		String empName;
		int empAge;
		String empAddress;

		public Employee(String empName, int empAge, String empAddress)
		{
			
			this.empName = empName;
			this.empAge = empAge;
			this.empAddress = empAddress;
		}
		

		public String getEmpName()
		{
			return empName;
		}
		public void setEmpName(String empName)
		{
			this.empName = empName;
		}

		public int getEmpAge()
		{
			return empAge;
		}
		public void setEmpAge(int empAge)
		{
			this.empAge = empAge;
		}

		public String getEmpAddress()
		{
			return empAddress;
		}
		public void setEmpAddress(String empAddress)
		{
			this.empAddress = empAddress;
		}

		public String toString()
		{
			return "Employee[Name="+empName+",Age="+empAge+",Address="+empAddress+"]";
		}

}
	 


