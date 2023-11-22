public class Student {
    private String name;
    private int emplID;
    private double gpa;
    private Address address;

    // Constructor
    public Student(String name, int emplID, double gpa, Address address) {
        this.name = name;
        this. emplID = emplID;
        this.gpa = gpa;
        this.address = address;
    }
    public void setName(String N){
        this.name = N;
    }
    // Implement getters and setters for the Student class if needed
    // Implement the equals method
    public boolean equals(Object otherObject){
        if(otherObject instanceof Student){
            Student other = (Student) otherObject;
            return name.equals(other.name) && address.equals(other.address) && emplID == other.emplID && gpa == other.gpa;
        }
        return false;
    }
    // Implement the toString method
    public String toString(){
        return getClass().getName() + "[name="+name+", emplid="+emplID+", gpa="+gpa+address.toString();
    }

    // Implement a copy constructor
    public Student(Student toCopy){
        this.name = toCopy.name;
        this.emplID = toCopy.emplID;
        this.gpa = toCopy.gpa;
        this.address = new Address(toCopy.address);
    }
    // Implement the copy method
    public void copy(Student toCopy){
        this.name = toCopy.name;
        this.emplID = toCopy.emplID;
        this.gpa = toCopy.gpa;
        this.address = new Address(toCopy.address);
    }

}
