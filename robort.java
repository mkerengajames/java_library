class robort{
		private String name;
		private int model;
		private boolean status = false;
		
		public robort(String name,int model){
			this.name = name;
			this.model = model;
		}
		
		public boolean turnON(){
				if(this.status){
					System.out.println(this.model + "is already turned on");
				}else{
						this.status = true;
						return this.status;
				}
		}
		
		public boolean turnOFF(){
				if(!(this.status)){
					System.out.println(this.model + "is already turned off");
				}else{
						this.status = false;
						return this.status;
					}
		}
		
		public String greet(String n){
				if(this.status){
					return ("hello " + n + " greetins from " + this.name);
				}else{
					return ("this robort is turned off pse turn on first to enjoy functionality");
				}
		}
		
		public void identifyYourself(){
			if(this.status){
					System.out.println("my name is " +this.name + "and my age is " +this.model);
				}else{
					System.out.println("this robort is turned off pse turn on first to enjoy functionality");
				}
		}
		
	
		public static void main(String [] args){
			robort r = new robort("jack", 0);
			r.turnON();
			r.identifyYourself();
			System.out.println(greet("JAMES"));
			r.turnOFF();
			}
}




























































































