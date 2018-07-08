package models.Staff;

import javax.persistence.*;

@Entity
@Table(name="team_members")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TeamMember {
    private int id;
    private String name;
    private int salary;

    public TeamMember(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public TeamMember() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "salary")
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
