package com.atguigu06.project.team.domain;

/**
 * ClassName: Architect
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:33
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;//公司奖励的股票数量

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return super.getDetail() + "架构师\t" +
                getStatus() + "\t"+
                getBonus() +"\t"+
                stock + "\t"
                + getEquipment().getDescription();

    }
}
