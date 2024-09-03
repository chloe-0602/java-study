package com.atguigu06.project.team.junit;

import com.atguigu06.project.team.domain.Employee;
import com.atguigu06.project.team.service.NameListService;
import com.atguigu06.project.team.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListTest
 * Package: com.atguigu06.project.team.junit
 * Description:
 *
 * @Author Xu, Luqin
 * @Create 2024/9/3 22:13
 * @Version 1.0
 */
public class NameListTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        for (Employee allEmployee : nameListService.getAllEmployees()) {
            System.out.println(allEmployee  );
        }

    }
    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService = new NameListService();
            Employee employee = nameListService.getEmployee(131);
            System.out.println(employee);
        } catch (TeamException e) {
            e.printStackTrace();
        }
    }

}
