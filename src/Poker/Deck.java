package Poker;

import java.util.*;

public class Deck {
    private List<Card> cards;
    private int deckSize;
    public Deck() {
        cards = new ArrayList<Card>(52);
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        deckSize = 52;
        shuffle();
    }

    public void reset() {
        cards.clear();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
        deckSize = 52;
        shuffle();
    }

    public Card deal() throws NoCardsException{
        if (deckSize == 0) {
            throw new NoCardsException("No cards left in the deck");
        }
        deckSize--;
        return cards.remove(deckSize);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
}
