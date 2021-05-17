package academy.devdojo.javaoneforall.javacore.Ycollection.domain;

public class Smartphone {
    private String serialNumber;
    private String name;

    public Smartphone(String serialNumber, String name) {
        this.serialNumber = serialNumber;
        this.name = name;
    }

    // if x.equals(y) == true, y.hashCode() == x.hashCode()
    // y.hashCode() == x.hashCode(), doesn't mean that y.equals(x) == true
    // x.equals(y) == false
    // y.hashCode() != x.hashCode() x.equals(y) should be false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : serialNumber.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone otherSmartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(otherSmartphone.serialNumber);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
