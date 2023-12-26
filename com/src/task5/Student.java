package task5;



class Student {
    private String lastName;
    private int gpa;

    Student (String lastName, int gpa) {
        this.lastName = lastName;
        this.gpa = gpa;
    }

    String getLastName() {return this.lastName;}

    int getGPA() {return this.gpa;}
}
