package entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private long id;
    private String name;


    private long parentId;

    public Department(long id, String name,  long parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    //子类部门
    List<Department> childDepartments=new ArrayList<>();
    //父类部门
    private Department parentDepartments;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getChildDepartments() {
        return childDepartments;
    }

    public void setChildDepartments(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    public Department getParentDepartments() {
        return parentDepartments;
    }

    public void setParentDepartments(Department parentDepartments) {
        this.parentDepartments = parentDepartments;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", childDepartments=" + childDepartments +
                ", parentDepartments=" + parentDepartments +
                '}';
    }
}
