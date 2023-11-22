public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Implement getters and setters for the Address class if needed
    public String toString(){

    }
    public boolean equals(Object otherObject){
        Address other = (Address) otherObject;
    }

}

