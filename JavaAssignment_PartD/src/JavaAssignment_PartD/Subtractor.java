package JavaAssignment_PartD;


import java.util.Date;

public class Subtractor extends Mathematician {

	//@Override
	

	 
	Subtractor(int no1,int no2,long rt ) 
		{
			
			this.num1=no1;
			this.num2=no2;
			this.timeRequested= new Date(rt);
			
		}
	 
	 
	Subtractor(int no1,int no2, int no3 ,long rt ) 
		{
			
			this.num1=no1;
			this.num2=no2;
			this.num3=no3;
			this.timeRequested= new Date(rt);
			
		}
		 
	 
	public void add(int num1, int num2) {
		// TODO Auto-generated method stub
		
		
	}

	public void subtractv(int num1, int num2,int num3) {
		// TODO Auto-generated method stub
		
		result=(num1-num2)-num3;
	
		responseTime=new Date().getSeconds() -timeRequested.getSeconds();
		print(result, responseTime);
	}


	@Override
	public void subtract(int num1, int num2) {
		// TODO Auto-generated method stub
      result=num1-num2;
		
		responseTime=new Date().getSeconds() -timeRequested.getSeconds();
		print(result, responseTime);
	}


	@Override
	public void multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void divide(int num1, int num2) {
		// TODO Auto-generated method stub

	}

	

}
