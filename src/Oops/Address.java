package Oops;
 class Address {
    private final String city;
    private String pincode;

    public Address(String city, String pincode) {
        this.city = city;
        this.pincode = pincode;
    }
     public String getFullAddress() {
         return city + " - " + pincode;
     }
}



