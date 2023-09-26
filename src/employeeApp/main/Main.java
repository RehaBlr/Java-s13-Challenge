package employeeApp.main;

import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;
import employeeApp.enums.Plan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        String[] developerNames = new String[10];
        developerNames[1]="test";
        developerNames[2]="test2";

        Healthplan plan1 = new Healthplan(1,"Plan-1", Plan.BASİC);
        Healthplan plan2 = new Healthplan(2,"Plan-2", Plan.MEDİUM);

        String[] healthPlans = new String[10];
        healthPlans[1] =plan1.getName();
        healthPlans[5]=plan2.getName();

        Employee emp1 = new Employee(1,"test","test@test.com","123",healthPlans);
        emp1.addHealthPlan(4,"Plan-4");

        Employee emp2 = new Employee(2,"test2","test2@test2.com","1234",healthPlans);
        emp1.addHealthPlan(1,"Plan-1");

        Company company1 = new Company(1,"Com-test1",1000,developerNames);
        Company company2 = new Company(2,"com-test2",-5000,developerNames);

        System.out.println(company1);
        System.out.println(company2);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(plan1);
        System.out.println(plan2);

        //healthplan.getName();

        System.out.println(Arrays.toString(emp1.getHealthPlans()));

        emp1.addHealthPlan(3,"D Sigorta");

        Employee developer = new Employee(2, "Mehmet Ali", "mehmet@test.com",
                "1234", healthPlans);

        developerNames[0] = developer.getFullName();

        System.out.println("******************************");
        Company company = new Company(1, "Workintech", 100000000, developerNames);
        company.addEmployee(0, "X MT");
        company.addEmployee(5, "Y En");
        company.addEmployee(1, "Z Sa");
        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
