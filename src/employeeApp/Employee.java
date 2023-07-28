package employeeApp;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(String fullName, String email, String password, String[] healthPlans){
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;

    }

    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(){
        this.fullName = fullName;
    }

    public String getEmail(){
        return this.fullName;
    }

    public void setEmail(){
        this.fullName = fullName;
    }

    public String[] getHealthPlans(){
        return this.healthPlans;
    }

    public void setHealthPlans(){
        this.healthPlans = healthPlans;
    }


    public String toString() {
        return "Name: " + fullName + ", Email: " + email + "HealhPlan "  + healthPlans;
    }
    private void addHealthPlan(int index, String name){

    }

}
