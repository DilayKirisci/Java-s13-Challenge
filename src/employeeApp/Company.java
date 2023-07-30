package employeeApp;

public class Company {

    private int id;
    private String name;
    private String giro;
    private String[] developerNames;

    public Company(int id, String name, String giro) {
        this.id = id;
        this.name = name;
        this.giro = giro;

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }


    public void addEmployee(int index, String name){
        if(developerNames[index] == null){
            developerNames[index] = name;
        }
    }
}
