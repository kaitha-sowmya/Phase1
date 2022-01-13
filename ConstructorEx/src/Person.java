class PersonDetails{
    double salary=100000;
    
    PersonDetails(double bonus) {
   	 System.out.println(salary+bonus);
    }
    
}


public class Person {
    
    public static void main(String[] args) {
   	 PersonDetails person1=new PersonDetails(5000);
   	 PersonDetails person2=new PersonDetails(15000);
   	 
   	 
    }

}

