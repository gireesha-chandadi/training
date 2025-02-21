package Inheritance2;

public class Main {
    public static void main(String[] args) {
      City c=new City();
     c.name="hyd";
     c.setName("hyderbad");
        c.Pincode=(5038811);
        c.setPincode(5038811);
        System.out.println(c.name);
        System.out.println(c.getName());
        System.out.println(c.Pincode);
        System.out.println(c.getPincode());
    }
}