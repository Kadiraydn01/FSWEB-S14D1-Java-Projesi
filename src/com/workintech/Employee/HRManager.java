package com.workintech.Employee;

public class HRManager extends Employee{
    private JuniorDeveloper[] juniorDevelopers;

    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    private int jrCount;
    private int midCount;
    private int snrCount;

    public HRManager(int id ,String name , double salary){
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[12];
        midDevelopers = new MidDeveloper[6];
        seniorDevelopers = new SeniorDeveloper[7];
        jrCount = 0;
        midCount= 0;
        snrCount = 0;
    }
    public void work(){
        System.out.println("HR Manager " +getName() + "manages HR");
    }
    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        if (jrCount < juniorDevelopers.length) {
            juniorDevelopers[jrCount] = juniorDeveloper;
            jrCount++;
        } else {
            System.out.println("Liste Şuan Dolu.");
        }
    }
    public void addEmployee(MidDeveloper midDeveloper) {
        if (midCount < midDevelopers.length) {
            midDevelopers[midCount] = midDeveloper;
            midCount++;
        } else {
            System.out.println("Liste Şuan Dolu.");
        }
    }
    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        if (snrCount < seniorDevelopers.length) {
            seniorDevelopers[snrCount] = seniorDeveloper;
            snrCount++;
        } else {
            System.out.println("Liste Şuan Dolu.");
        }
    }
}
