class Fee{

    // 
    // BAD
    if (customerType.equals("child")) {
        fee = baseFee * 0.5;
    }

    // GOOD
    if (isChile()) {
        fee = childFee();
    }
    // Judge Logic
    private Boolean isChild() {
        return customerType.equals("child");
    }
    // Calcurate Logic
    private int childFee(){
        return baseFee * 0.5;
    }
    
}
