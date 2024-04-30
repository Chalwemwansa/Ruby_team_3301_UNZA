/**
 * StaffDepartmentPositions
 */
public class StaffDepartmentPositions {
    public static void main(String[] args) {
        MemberOfStaff membersOfStaff[] = new MemberOfStaff[3];
        membersOfStaff[0] = new Adminnistrator("Festus", "Administration Department");
        membersOfStaff[1] = new Manager("Mwape", "Management Department");
        membersOfStaff[2] = new AccountingClerk("Miles", "Accounting Department");

        for (MemberOfStaff memberOfStaff : membersOfStaff) {
            System.out.println(memberOfStaff.getName() + " is " + memberOfStaff.getRole() + " under the " + memberOfStaff.getDepartment() + ".");
        }
    }
    
}

/**
 * Adminnistrator extends MemberOfStaff
 */
class Adminnistrator extends MemberOfStaff {

    Adminnistrator(String name, String department){
        super(name, department);
    }
    public String getRole(){
        return "responsible for administrative duties";
    }
}

/**
 * Manager extends MemberOfStaff
 */
class Manager extends MemberOfStaff {

    Manager(String name, String department){
        super(name, department);
    }
    public String getRole(){
        return "responsible for managing the office";
    }
}

/**
 * AccountingClerk extends MemberOfStaff
 */
class AccountingClerk extends MemberOfStaff {

    AccountingClerk(String name, String department){
        super(name, department);
    }
    public String getRole(){
        return "responsible for handling financial records";
    }
}

/**
     * MemberOfStaff
     */
class MemberOfStaff {
    
        private String name;
        private String department;

        MemberOfStaff(String name, String department){
            setName(name);
            setDepartment(department);
        }

        public void setName(String name){
            this.name = name;
        }
        public void setDepartment(String department){
            this.department = department;
        }

        public String getName(){
            return name;
        }
        public String getDepartment(){
            return department;
        }
        public String getRole(){return "";};
}