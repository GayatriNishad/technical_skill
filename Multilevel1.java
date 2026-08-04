class Teacher{
    void display(){
        System.out.println("teacher is teaching");
    }
}
class student extends Teacher{
    @Override
    void display(){
        super.display();
        System.out.println("Student is Studying");
    }
}
class principal extends Teacher{
    @Override
    void display(){
        super.display();
        System.out.println("Principal is on round");
    }
}
class Multilevel1{
    public static void main(String[] args) {
        student student = new student();
        principal principal = new principal();
        student.display();
        principal.display();
    }
    
}