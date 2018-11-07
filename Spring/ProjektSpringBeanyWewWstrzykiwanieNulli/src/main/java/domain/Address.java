package domain;

public class Address {
    private String locality;
    private String zipCode;
    private String streetNumber;

    public Address(String locality, String zipCode, String streetNumber) {
        this.locality = locality;
        this.zipCode = zipCode;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "locality='" + locality + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                '}';
    }
}
