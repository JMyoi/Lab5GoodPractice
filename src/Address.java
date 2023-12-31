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
    public void setCity(String City){
        city = City;
    }

    // Implement getters and setters for the Address class if needed
    public String toString(){
        return getClass().getName() + "[Street="+street+", city="+city+", state="+state+", zip code="+zipCode+"]";
    }
    public boolean equals(Object otherObject){
        if(otherObject instanceof Address) {
            Address other = (Address) otherObject;
            return street.equals(other.street) && city.equals(other.city) && state.equals(other.state) && zipCode.equals(other.zipCode);
        }
        return false;
    }

    //copy constructor
    public Address(Address toCopy){
        this.street =toCopy.street;
        this.city = toCopy.city;
        this.state = toCopy.state;
        this.zipCode = toCopy.zipCode;
    }
    //copy method
    public void copy(Address toCopy){
        this.street = toCopy.street;
        this.city = toCopy.city;
        this.state = toCopy.state;
        this.zipCode = toCopy.zipCode;
    }

}

