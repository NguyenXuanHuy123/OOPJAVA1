
import java.util.LinkedList;
import java.util.Scanner;

public class NXH665Person {
    public static void main(String[] args) {
    }
    public String name;
    public int age;
    public Long ID;
    public void Nhap(){
    Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten : ");
        name = sc.nextLine();
        System.out.println("nhap tuoi :" );
        age = sc.nextInt();
        System.out.println("nhap ID ");
        ID = sc.nextLong();
    }
    public void Xuat(){
        System.out.println("Ho va ten la :" + name);
        System.out.println("tuoi : " + age);
        System.out.println("So ID " + ID);
    }
    
    public void phuongthuc(){
    LinkedList<String> newperson = new LinkedList<>();
    newperson.add(name);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getID() {
        return ID;
    }
    public void setID(Long iD) {
        ID = iD;
    }
    
     
    
    
    
     

    
    
}
