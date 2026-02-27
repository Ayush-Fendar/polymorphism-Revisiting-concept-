class Polymorphism
{
    public static void main(String[] args)
    {
         person p= new father();
  //refernce typeb   // object tye
        
         p.role();
         

    }
}

class person{
   
    void role()
    {
        System.out.println("I'm a person");
    }
}
class father extends person
{
    void role()
    {
        System.out.println("I'm a father");
    }
}

class husband extends person{
    void role()
    {
        System.out.println("I'm a husband");
    }
}