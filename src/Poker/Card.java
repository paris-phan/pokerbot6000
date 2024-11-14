package Poker;

public class Card {
    enum Suit {
        HEARTS,
        DIAMONDS,
        CLUBS,
        SPADES
    }
    enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }
    // Getters
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }
    // Setters
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card card = (Card) obj;
        return suit == card.suit && rank == card.rank;
    }
}
