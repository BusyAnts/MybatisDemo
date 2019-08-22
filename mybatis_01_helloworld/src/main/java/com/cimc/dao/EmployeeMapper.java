package com.cimc.dao;

import com.cimc.bean.Employee;

public interface EmployeeMapper {

    /**
     * 根据id查询
     * @param id
     * @return
     */
    Employee selectEmpById(Integer id);

}
