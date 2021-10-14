package entity;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Long id;
    private String name;
    private Long parentId;

    public Department(Long id, String name,  Long parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }
    //子类部门
    List<Department> childDepartments=new ArrayList<>();
    //父类部门
    private List<Department> parentDepartments = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public List<Department> getChildDepartments() {
        return childDepartments;
    }

    public void setChildDepartments(List<Department> childDepartments) {
        this.childDepartments = childDepartments;
    }

    public List<Department> getParentDepartments() {
        return parentDepartments;
    }

    public void setParentDepartments(List<Department> parentDepartments) {
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
