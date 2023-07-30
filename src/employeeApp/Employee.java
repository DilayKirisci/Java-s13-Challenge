package employeeApp;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void addHealthPlan(int index, String name){

        if(healthPlans[index]== null){
            this.healthPlans[index] = name;
        }else{
            System.out.println("Index dolu");
        }


    }


    public String toString() {
        return "Name: " + fullName + ", Email: " + email + "HealhPlan "  + healthPlans;
    }


}
