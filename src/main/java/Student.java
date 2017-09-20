/**
 * Created by PalodRohit on 9/19/2017.
 */
public class Student {

    private String name ;
    private String collegeId;
    private String branch;
    public void setCollegeId(String collegeId) {
        this.collegeId = collegeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeId() {
        return collegeId;
    }

    public String getName() {
        return name;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }
}
