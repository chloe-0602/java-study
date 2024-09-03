package com.atguigu06.project.team.domain;

/**
 * ClassName: Designer
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:32
 * @Version 1.0
 */
public class Designer extends Programmer{
    private double bonus;//奖金

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return super.getDetail() + "设计师\t" +
                getStatus() + "\t"+
                bonus +"\t\t\t"
                + getEquipment().getDescription();

    }
}
