public class SalePerson implements Comparable {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return (lastName + " , " + firstName + " : " + totalSales);
    }

    public boolean equals(SalePerson SP) {
        if (SP.firstName == SP.lastName) {
            return true;
        } else {
            return false;
        }
    }

    public int compareTo(Object o) {
        SalePerson SP = (SalePerson) o;
        if (this.totalSales < SP.totalSales) {
            return -1;
        }
        if (this.totalSales > SP.totalSales) {
            return 1;
        }
        if (this.lastName.charAt(0) < SP.lastName.charAt(0)) {
            return 1;
        }
        if (this.lastName.charAt(0) > SP.lastName.charAt(0)) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }
}
