import java.util.Scanner;

class Employee {
    String ename;
    int eid;

    Employee(String name, int id) {
        ename = name;
        eid = id;
    }

    void displayDetails() {
        System.out.println("ID: " + eid + "\t NAME: " + ename);
    }
}

class Manager extends Employee {
    int teamsize;

    Manager(String name, int id, int size) {
        super(name, id);
        teamsize = size;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("They manage a team of " + teamsize);
    }
}

class SeniorManager extends Manager {
    String region;

    SeniorManager(String name, int id, int size, String region) {
        super(name, id, size);
        this.region = region;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("They manage the " + region + " region");
    }
}

class Dev extends Employee {
    String language;

    Dev(String name, int id, String lang) {
        super(name, id);
        language = lang;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("They specialize in " + language);
    }
}

class JuniorDev extends Dev {
    String mentor;

    JuniorDev(String name, int id, String lang, String mentor) {
        super(name, id, lang);
        this.mentor = mentor;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Their mentor is " + mentor);
    }
}

class Interns extends Employee {
    String college;

    Interns(String name, int id, String college) {
        super(name, id);
        this.college = college;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("They are from " + college);
    }
}

class EmployeeDemo {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("MENU\n1. MANAGER\n2. DEVELOPER\n3. INTERN");
        System.out.println("Choose the number corresponding to your role: ");
        int choice = s.nextInt();
        s.nextLine(); // Consume the newline character

        if (choice == 1) {
            System.out.println("Enter name: ");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("Enter ID: ");
            int id = s.nextInt();

            System.out.println("Enter the team size: ");
            int size = s.nextInt();
            s.nextLine(); // Consume the newline character

            Manager m = new Manager(name, id, size);

            System.out.println("Are you a senior manager (yes/no): ");
            String senior = s.nextLine();
            if (senior.equals("yes") || senior.equals("YES") || senior.equals("Yes")) {
                System.out.println("Enter your region (north/south/east/west): ");
                String region = s.nextLine();
                SeniorManager sm = new SeniorManager(name, id, size, region);
                sm.displayDetails();
            } else {
                m.displayDetails();
            }
        } else if (choice == 2) {
            System.out.println("Enter name: ");
            String name = s.nextLine();
            s.nextLine ();
            System.out.println("Enter ID: ");
            int id = s.nextInt();
            s.nextLine(); // Consume the newline character

            System.out.println("Enter the programming language: ");
            String lang = s.nextLine();

            Dev d = new Dev(name, id, lang);

            System.out.println("Are you a junior developer (yes/no): ");
            String junior = s.nextLine();
            if (junior.equals("yes") || junior.equals("YES") || junior.equals("Yes")) {
                System.out.println("Enter your mentor: ");
                String mentor = s.nextLine();
                JuniorDev jd = new JuniorDev(name, id, lang, mentor);
                jd.displayDetails();
            } else {
                d.displayDetails();
            }
        } else if (choice == 3) {
            System.out.println("Enter name: ");
            String name = s.nextLine();
            s.nextLine();
            System.out.println("Enter ID: ");
            int id = s.nextInt();
            s.nextLine(); 
            System.out.println("Enter your college: ");
            String college = s.nextLine();
            Interns i = new Interns(name, id, college);
            i.displayDetails();
        }
    }
}
