package fr.emse.test;

public class Money {
	private int fAmount;
	private String fCurrency;
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Money other = (Money) obj;
	    return fAmount == other.fAmount && fCurrency.equals(other.fCurrency);
	}
	public Money(int amount, String currency) {
	fAmount = amount;
	fCurrency = currency;
	}
	public int amount() {
	return fAmount;
	}
	public String currency() {
	return fCurrency;
	}
	public Money add(Money m) {
		return new Money(amount() + m.amount(), currency());
	}
	
	
}
