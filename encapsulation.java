class Human{

   private String name;
   private int age;

   public int getAge(){

    return age;

   }

   public void setAge(int a){

    age=a;

   }

   public String getname(){

     return name;

   }
  
   public void setname(String b){

     name=b;

   }


}


public class encapsulation {
    public static void main(String args[]){

             Human obj1=new Human();
             obj1.setname("Supuni");
             obj1.setAge(23);

             System.out.println(obj1.getname()+": "+obj1.getAge());


    }
}
