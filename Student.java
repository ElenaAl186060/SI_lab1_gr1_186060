class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labpoints =new ArrayList<Integer>();
	
	public Student(){
		System.out.println("New Student object!");}
	
	public void setindex(String index) { this.index = index; }
	public String getindex() { return this.index; }

	public void setfirstName(String firstName) { this.firstName = firstName; }
	public String getfirstName() { return this.firstName; }

	public void setlastName(String lastName) { this.lastName = lastName; }
	public String getlastName() { return this.lastName; }

	public void setlabpoints(List<Integer> labpoints) { this.labpoints = labpoints; }
	public String getlabpoints() { return this.labpoints; }

	public double getAverage() {
		int sum = 0;
		for(int i=1;i<=10;i++){  
        	sum += labpoints[i];
		return sum;  
    		}  
	}

	public boolean hasSignature() {
		if(labpoints.size() >= 8)
			return true;
	}
}
