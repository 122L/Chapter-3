package cardsExcersise;

public class Cards {

	public static void main(String[] args) {
		final int CARDS_IN_SUIT = 13;
		int myValue;
		int yourValue;
		int mySuit;
		int yourSuit;
		
		char[] mySuits = {'s', 'h', 'd', 'c'};
		char[] yourSuits = {'s', 'h', 'd', 'c'};
		
		getCards myCard = new getCards();
		getCards yourCard = new getCards();
		myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		yourValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		mySuit = ((char)(Math.random() * 100) % 4);
		yourSuit = ((char)(Math.random() * 100) % 4);
		
		myCard.setValue(myValue);
		myCard.setSuit(mySuits[mySuit]);
		yourCard.setValue(yourValue);
		yourCard.setSuit(yourSuits[yourSuit]);
		
		System.out.println("My card is the " + myCard.getValue() + " of " + myCard.getSuit());
		
		
		System.out.println("Your card is the " + yourCard.getValue() + " of " + yourCard.getSuit());
		
	}

}
