public class RewardValue {

private int cash;
private int miles;

public void RewardValue(int cashValue) {
    this.cash = cashValue;
    this.milesValue = cashValue / 0.0035;
}

public RewardValue(int milesValue){
    this.miles = milesValue;
    this.cashValue = milesValue * 0.0035
}



public int getMilesValue() {
    return miles;
}

public int getCashValue()A{
    return cash;
}







}