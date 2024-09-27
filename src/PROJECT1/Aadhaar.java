package PROJECT1;

public class Aadhaar {
    private String aadhaarNumber;
    private String name;
    private String Address;
    private String fatherName;

    public Aadhaar(String aadhaarNumber, String name, String address, String fatherName) {
        this.aadhaarNumber = aadhaarNumber;
        this.name = name;
        Address = address;
        this.fatherName = fatherName;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return Address;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Aadhaar{" +
                "AadhaarNumber='" + aadhaarNumber + '\'' +
                ", Name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                ", fatherName='" + fatherName + '\'' +
                '}';
    }
}
