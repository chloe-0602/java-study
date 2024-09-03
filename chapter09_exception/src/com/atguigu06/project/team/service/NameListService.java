package com.atguigu06.project.team.service;

import com.atguigu06.project.team.domain.PC;
import com.atguigu06.project.team.domain.*;

import static com.atguigu06.project.team.service.Data.*;

/**
 * ClassName: NameListService
 * Package: com.atguigu06.project.team.service
 * Description:
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 20:40
 * @Version 1.0
 */
public class NameListService {
    Employee[] employees = null;

    public NameListService() {
        /**
         * 根据项目提供的Data类构建相应大小的employees数组
         * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
         * 将对象存于数组中
         * Data类位于com.atguigu.team.service包中
         */
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < EMPLOYEES.length; i++) {

            int employeeType = Integer.parseInt(EMPLOYEES[i][0]);

            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            switch (employeeType) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    employees[i] = new Programmer(id, name, age, salary
                            , createEquipment(EQUIPMENTS[i]));
                    break;
                case DESIGNER:
                    employees[i] = new Designer(id, name, age, salary
                            , createEquipment(EQUIPMENTS[i])
                            , Double.parseDouble(EMPLOYEES[i][5]));
                    break;
                case ARCHITECT:
                    employees[i] = new Architect(id, name, age, salary,
                            createEquipment(EQUIPMENTS[i]),
                            Double.parseDouble(EMPLOYEES[i][5]),
                            Integer.parseInt(EMPLOYEES[i][6]));
                    break;
            }
        }
    }

    private Equipment createEquipment(String[] equipmentData) {

        int type = Integer.parseInt(equipmentData[0]);
        String modelOrName = equipmentData[1];
        String priceOrDisplayOrType = equipmentData[2];
        switch (type) {
            case PC:
                return new PC(modelOrName, priceOrDisplayOrType);
            case NOTEBOOK:
                return new NoteBook(modelOrName, Integer.parseInt(priceOrDisplayOrType));
            case PRINTER:
                return new Printer(modelOrName, priceOrDisplayOrType);
        }
        return null;
    }

    public Employee[] getAllEmployees(){
        return employees;
    }

    /**
     * 获取指定ID的员工对象。
     * @param id 指定员工的ID
     * @return 指定员工对象
     * @throws TeamException 找不到指定的员工
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        throw new TeamException("找不到指定的员工");
    }


}
