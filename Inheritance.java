public class Inheritance {
    public static void main(String[] args) {
Mother m=new Mother();
System.out.println(m.gender);
m.display();


uncle u=new uncle();
System.out.println(u.gender);
u.display();
    
   
    }
}

    class GrandFather{
        char gender='M';
    void display(){
        System.out.println(" parent class");

    }
    

    
}
class Mother extends GrandFather{
    char gender='F';
    
    }

class   Daughter extends Mother{
    String Name="varshini";
    int age=34;


}
class uncle extends GrandFather{
    char gender ='M';


}
