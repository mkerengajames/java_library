class Result extends Test{
	int total;
	
	public Result(){
		total = 0;
	}
	
	public void displayResult(){
		total = sub1 + sub2;
		System.out.println("the total for all tests is: " +total);
	}
	
	public static void main(String[] args){
		Result r = new Result();
		
		r.displayRegNo();
		r.changeTestValues(60,70);
		r.displayTest();
		r.displayResult();	
	}
	
}