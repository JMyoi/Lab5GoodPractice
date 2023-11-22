public class Main {
    public static void main(String[] args) {
        System.out.println("\n****************************Creating two Address and Students and testing toString method.****************************\n");
        Address A1 = new Address("93 Thomsam", "Staten Island", "New York", "83832");
        Student S1 = new Student("John", 23094, 3.5, A1);
        System.out.println("Address 1 created: "+A1);
        System.out.println("Student 1 Created: " + S1);
        Address A2 = new Address("1823 bardemin", "Brooklyn", "New York", "11203");
        Student S2 = new Student("Christina", 934782, 4.0, A2);
        System.out.println("Address 2 created: "+A2);
        System.out.println("Student 2 Created: " + S2);


        System.out.println("\n****************************testing equal method****************************\n");
        System.out.println("Address1 should not equal Address2 "+A1.equals(A2));
        Address A3 = new Address("93 Thomsam", "Staten Island", "New York", "83832");
        System.out.println("Address1 should equal Address3 "+A1.equals(A3));
        System.out.println("Student 1 should not equal student 2:"+S1.equals(S2));
        Student S3 = new Student("John", 23094, 3.5, A3);
        System.out.println("Student 1 should equal student 3: "+S1.equals(S3));

        System.out.println("\n****************************testing Copy Constructor****************************\n");
        System.out.println("making a new Address that will be constructed with A2");
        Address A4 = new Address(A2);
        System.out.println("copy Address: "+ A4);
        System.out.println("Address 2: "+A2);
        System.out.println("changing the city of the newly created addreass and it sould not change Address 2");
        A4.setCity("Seoul");
        System.out.println("copy Address: "+ A4);
        System.out.println("Address 2: "+A2);
        System.out.println("Creating a new student that will be a copy of Student2");
        Student S4 = new Student(S2);
        System.out.println("new Student: "+S4);
        System.out.println("Student2: "+S2);
        System.out.println("changing the Name of new student and it should not change the name of student 2: ");
        S4.setName("Joe");
        System.out.println("new Student: "+S4);
        System.out.println("Student2: "+S2);

        System.out.println("\n****************************testing Copy method****************************\n");
        System.out.println("making Address 1 a copy of address 2, they should hold the same data");
        A1.copy(A2);
        System.out.println("Address1: "+A1);
        System.out.println("Address2: "+A2);
        System.out.println("making Student 1 a copy of Student 2, they should hold the same data");
        S1.copy(S2);
        System.out.println("Student1: "+S1);
        System.out.println("Student2: "+S2);



    }
}