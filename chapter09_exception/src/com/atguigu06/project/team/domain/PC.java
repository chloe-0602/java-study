package com.atguigu06.project.team.domain;

/**
 * ClassName: PC
 * Package: com.atguigu06.project.team.domain
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:14
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model; //机器的型号
    private String display;//显示器名称

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "PC{" +
                "model='" + model + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
