class Test extends Student{
		int sub1;
		int sub2;
	
	public Test(){
		sub1 = 0;
		sub2 = 0;
	}
	
	public void changeTestValues(int nSub1, int nSub2){
		sub1 = nSub1;
		sub2 = nSub2;
	}
	
	public void displayTest(){
		System.out.println("the score for test one is: " +sub1);
		System.out.println("the score for test one is: " +sub2);
	}

}