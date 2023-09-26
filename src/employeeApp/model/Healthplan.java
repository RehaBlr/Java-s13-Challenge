package employeeApp.model;

import employeeApp.enums.Plan;

public class Healthplan {
    private long id;
    private String name;
    private Plan plan;

    public Healthplan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Healthplan(long id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    @Override
    public String toString() {

        return "Id: "+id +" Name: "+ name +" PlanName : "+
                plan.getName() +"-"+ " Plan Price : "+plan.getPrice();
    }
}
