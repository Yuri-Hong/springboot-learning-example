package org.spring.springboot.domain;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.command.BaseModel;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

@Table(name = "em_t")//新建表数据库表名
public class EmpAttr {
    private static final long serialVersionUID = 5199244153134426433L;

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private String id;

    @Column(name="ename",type= MySqlTypeConstant.VARCHAR)
    private String ename;

    @Column(name="sal",type= MySqlTypeConstant.VARCHAR)
    private String sal;

    @Column(name="job",type= MySqlTypeConstant.VARCHAR)
    private String job;

    //...省略get，set方法
}
