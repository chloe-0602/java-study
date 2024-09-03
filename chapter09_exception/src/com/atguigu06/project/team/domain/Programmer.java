package com.atguigu06.project.team.domain;

import com.atguigu06.project.team.service.Status;

/**
 * ClassName: Programmer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:26
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int memberId;//记录成员加入开发团队后在团队中的ID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return super.getDetail() + "程序员\t" +
                status + "\t\t\t\t\t" + equipment.getDescription();
    }
    protected String getBasicDetailsForTeam(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() +
                "\t" + getSalary() + "\t";
    }

    public String getDetailsForTeam(){
        return getBasicDetailsForTeam() + "程序员";
    }
}
