package enums;

public enum Person {
    SASHA1("Программист", 100),
    SASHA2("Программист",100),
    SASHA3("Менеджер", 70),
    SASHA4("Менеджер", 80),
    SASHA5("Бухгатлер", 90),
    SASHA6("Программист", 100);


    private String occupation;

    private Integer salary;

    private Person(String occupation, Integer salary){
        this.occupation = occupation;
        this.salary = salary;
    }


    public String getOccupation() {
        return occupation;
    }

    public Integer getSalary() {
        return salary;
    }
}
