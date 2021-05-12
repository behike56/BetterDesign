interface Fee {
    Yen yen();
    String label();
}

class AdultFee implements Fee{
    Yen fee(){
        return new Yen(100);
    }

    String label(){
        return "Otona";
    }

}

class ChildFee implements Fee{
    Yen fee(){
        return new Yen(50);
    }

    String label(){
        return "Kodomo";
    }

}

class ChildFee implements Fee{
    Yen fee(){
        return new Yen(50);
    }

    String label(){
        return "Kodomo";
    }

}

// Using
class Charge{
    Fee fee;

    Charge(Fee fee){
        this.fee = fee;
    }

    Yen yen(){
        return fee.yen();
    }

}

class Reservation {
    list<Fee> fees;

    Reservation(){
        fees = new ArrayList<Fee>();
    }

    void addFee(Fee fee){
        fees.add(fee);
    }

    Yen feeTotal(){
        Yen total = new Yen();
        for (Fee each: fees) {
            total.add(each.yen());
        }
        return total;
    }
    
}
