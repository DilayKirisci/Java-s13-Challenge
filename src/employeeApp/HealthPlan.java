package employeeApp;

public class HealthPlan {

   private int id;
    private String name;
    private Plan plan;

    public HealthPlan(int id, String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }


    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }
    public Plan getPlan(){
        return this.plan;
    }
    public void setPlan(){
        this.plan = plan;
    }

    public String toString(){
        return "id: " + id + "name: " + name + " plan " + plan;
    }



}
