package co.com.movingu.user;

//TO DO: Complete/Rewrite the class according to the requirements
public class Trainer extends User{
    private String category;

    public Trainer(String dni, String name, int age, String category) {
        super(dni, name, age);
        this.category = category;
    }

    @Override
    public void statusMsg() {
        if(blocked && !ticketOn){
            System.out.println("The trainer "+name+"is blocked bc of debt");
        }else{
            System.out.println("The trainer "+name+"is blocked bc he/she already borrow a vehicle");
        }

    }

    @Override
    public String toString() {
        return "Trainer{" +
                "category='" + category + '\'' +
                ", dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", blocked=" + blocked +
                ", ticketOn=" + ticketOn +
                '}';
    }
}
