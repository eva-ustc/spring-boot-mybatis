package ustc.sse.springbootmybatis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ustc.sse.springbootmybatis.domain.Department;
import ustc.sse.springbootmybatis.mapper.DepartmentMapper;

import javax.annotation.Resource;

/**
 * @author LRK
 * @project_name spring-boot-mybatis
 * @package_name ustc.sse.springbootmybatis.controller
 * @date 2018/11/24 0:17
 * @description God Bless, No Bug!
 */
@RestController
public class DeptController {
    @Resource
    DepartmentMapper departmentMapper;
    @GetMapping("/department/{id}")
    public Department getDepartmentById(@PathVariable("id") Integer id){

        return departmentMapper.selectDepartmentById(id);
    }

    @GetMapping("/department")
    public Department saveDepartment(Department department){
        departmentMapper.saveDepartment(department);
        return department;
    }
}
