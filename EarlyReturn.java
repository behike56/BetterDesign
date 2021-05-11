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


    /**
     * Smart Conditional branch
     */
    // BAD
    Yen fee() {
        Yen result;
        if (isChild()) {
            result = childFee();
        } else if (isSenior()){
            result = seniorFee();
        }else {
            result = adaltFee();
        }

        return result;
    }
    
    // GOOD
    Yen fee() {
        if (isChild()) {
            return childFee();
        } else if (isSenior()) {
            return seniorFee();
        } else {
            return adaltFee();
        }
    }

    Yen fee() {
        if (isChild()) return childFee();
        if (isSenior()) return seniorFee();
        return adaltFee();
    }
}
