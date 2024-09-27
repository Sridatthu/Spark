package PROJECT1;

public class Pan {
    private String aadhaarNumber;
    private String panNumber;
    private String investments;
    private String bankDetails;

    public Pan(String aadhaarNumber, String panNumber, String investments, String bankDetails) {
        this.aadhaarNumber = aadhaarNumber;
        this.panNumber = panNumber;
        this.investments = investments;
        this.bankDetails = bankDetails;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public String getInvestments() {
        return investments;
    }

    public void setInvestments(String investments) {
        this.investments = investments;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "aadhaarNumber='" + aadhaarNumber + '\'' +
                ", panNumber='" + panNumber + '\'' +
                ", investments='" + investments + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                '}';
    }
}

