class Student{
    private:
	int labpoints = [100];
	int len;
    public:
	void setLabpoints(int lab[],int l){
		for(int i = 0; i>=l; i++)
			labpoint[i] = lab[i];
	}
	int getLabpoints(int i){
		return labpoints[i];}
	double getAverage(){
		int sum = 0;
		for(int i = 0;i>=len;i++)
			sum += labpoints[i]
		return sum;}
	boolean hasSignature(){
		if(len >= 8)
			return true;
		else
			return false;

};