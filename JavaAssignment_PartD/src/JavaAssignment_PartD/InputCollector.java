package JavaAssignment_PartD;


import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
public class InputCollector {

	
	 int num1;
	 int num2;
	 int num3;

	long  timeRequested;
	
	
	

	InputCollector() throws IOException
	{
	
		Calendar cal = Calendar.getInstance();
	       
		timeRequested= cal.get(Calendar.MILLISECOND);
					        
	}


	
	public void collectInput()
	
	{
		System.out.println("Welcome to Ahmed Super Calc 1.0!");
		
        System.out.println("This is the main menu");

        System.out.println("Choose your exp<b></b>ression: ");

        System.out.println("1. Addition /n 2. Substraction/n 3. Multiplcation /n 4. Divide ");

        
        Scanner math1 = new Scanner(System.in);
        
        int choice = math1.nextInt();
    
        System.out.println("Enter First Num");
    	
	        num1 = math1.nextInt();
	
	        System.out.print("Enter Second Num");
	
	        num2= math1.nextInt();
	       
	        
	        
	        System.out.print("Do you have another number for the operation?!  press 1 fro Yes  or 2 for No");
	        
	        int i= math1.nextInt();
	        
	        

           // math1.close();
	      
	   

           switch (choice){
        
                 
        
                case 1:
        
                   // addition();
                	
                {	   
                  	 if (i==1)
                 	{
                 	
                		
                 	System.out.print("Enter Third Num");
                 	
          	              num3= math1.nextInt();
          	            new Adder(num1,num2,num3, timeRequested).add(num1, num2,num3);
          	         
                 	}else if (i==2) {
                 		
                 		  new Adder(num1,num2,timeRequested).add(num1, num2);
                 		
                 	} else   System.out.print("Inavlid Option") 
                 		;
                     
                }
                
                break;
                case 2:
        
                   // substraction()
                	
                	
                	
                {

                	 if (i==1)
     	        	{
     	        	
     	        	System.out.print("Enter Third Num");
                 	
          	              num3= math1.nextInt();
          	            new Subtractor(num1,num2,num3,timeRequested).subtractv(num1, num2,num3);
     	        	
     	        	}else if (i==2) {
     	        		
     	        		  new Subtractor(num1,num2,timeRequested).subtract(num1, num2);
     	        		
     	        	} else   System.out.print("Inavlid Option") 
     	        		;
                     
                     math1.close();
                }
                break;
                case 3:
                {
                   	System.out.print("he is here");
                   // multiplication()
                	 if (i==1)
	     	        	{
	     	        	
	     	        	System.out.print("Enter Third Num");
	                 	
	          	              num3= math1.nextInt();
	          	            new Multiplier(num1,num2,num3,timeRequested).multiply(num1, num2, num3);
	     	        	
	     	        	}else if (i==2) {
	     	        		
	     	        		  new Multiplier(num1,num2,timeRequested).multiply(num1, num2);
	     	        		
	     	        	} else   System.out.print("Inavlid Option") 
	     	        		;
	                     
	                     math1.close();
                }
                break;
                case 4:
        
                   // divide();
                {
                	 if (i==1)
	     	        	{
	     	        	
	     	        	System.out.print("Enter Third Num");
	                 	
	          	              num3= math1.nextInt();
	          	            new Divider(num1,num2,num3,timeRequested).divide(num1, num2, num3);
	     	        	
	     	        	}else if (i==2) {
	     	        		
	     	        		  new Divider(num1,num2,timeRequested).divide(num1, num2);
	     	        		
	     	        	} else   System.out.print("Inavlid Option") 
	     	        		;
	                     
	                     math1.close();
	                     
                }
                break;
                    }
           
           
           
    //----------------------------------
    //---------------------------------            
           
        
           
           
         //Runs the garbage collector. 
   		System.gc();
   		
   	//------------------------------------
   		
   //-------------------------------
   		
                
		
   		
   		//write the time the inquiry was made to file
		
             
                
                
	}
	
	
	//
	
}
