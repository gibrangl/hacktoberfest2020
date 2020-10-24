//Employee.java
public class Employee {
    //...
}

//Courier.java
public class Courier extends Employee {
    //...
    
}

//Main.java
public class Main {
    public static void Proses(Employee emp){
        if(emp instanceof Manager){
            //lakukan tugas-tugas manager
        }else if(emp instanceof Courier){
            //lakukan tugas-tugas Courier
        }else{
            //other methode
        }
        
    }
    public static void main(String[] args) {
        Manager man = new Manager();
        Courier cou = new Courier();
        Proses(man);
        Proses(cou);
    }
    
}
