public final class clubmemberprofile {
    static void show() {
        System.out.println("Club Member Profile");
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        show();

        Profile profile = new ClubMember("Abebe", 21, "SWE", 2);
        profile.show();
    }
}

class Profile {
    protected String name;
    protected String department;

    Profile() {
        this("Unknown", "SWE");
    }

    Profile(String name, String department) {
        this.name = name;
        this.department = department;
    }

    void show() {
        System.out.println("Name: " + name);
    }

    final void showDepartment() {
        System.out.println("Department: " + department);
    }

    static void showClub() {
        System.out.println("Club: Student Chess Club");
    }
}

class Student extends Profile {
    protected int age;
    protected int year;

    Student() {
    }

    Student(String name, int age, String department, int year) {
        super(name, department);
        this.age = age;
        this.year = year;
    }

    void show() {
        System.out.println("Student: " + super.name);
        System.out.println("Age: " + age);
        super.showDepartment();
        System.out.println("Year: " + year);
    }

    static void showClub() {
        System.out.println("Role: Player");
    }
}

class ClubMember extends Student {
    ClubMember(String name, int age, String department, int year) {
        super(name, age, department, year);
    }

    void show() {
        super.show();
        Profile.showClub();
        Student.showClub();
    }
}

class ClubLeader extends Student {
}