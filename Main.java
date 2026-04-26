abstract class person {
    private String name;
    private int age;

    public person(String n, int a)
{name =n;
 age= a;
}
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public abstract void show();
}
class Student extends person {
    public Student (String n, int a)
    {
        super (n,a);}
    
    public void show(){System.out.println ("I am " +getName()+ " and I am " +getAge()+ " years old");} 
        
}

public class Main {
    public static void main ( String [] args) 
    {person p = new Student ("Abebe",20);
        p.show();
    }
}


