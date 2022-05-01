package autowire_constructor;

public class Human {
	Heart heart;
 
	/*public Heart getHeart() {
		return heart;
	}


	public void setHeart(Heart heart) {
		this.heart = heart;
	}*/
	public Human(Heart heart) {
		super();
		this.heart = heart;
	}

   public void humanFunc() {
		System.out.println("Human function calling heart");
		heart.heartFunction();
	}

public void func() {
	// TODO Auto-generated method stub
	
}

	
	

}
