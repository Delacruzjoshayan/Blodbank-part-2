class BloodData {
    private String bloodType, rhFactor;

    public BloodData() {
        bloodType = "O";
        rhFactor = "+";
    }
    public void setBloodType(String bt) {
        this.bloodType = bt;
    }
    public void setRhFactor(String rh) {
        this.rhFactor = rh;
    }
    public String getBloodType() {
        return bloodType;
    }
    public String getRhFactor() {
        return rhFactor;
    }

    public void display(){
        System.out.println(bloodType+rhFactor+" is added to the blood bank.");
    }
}