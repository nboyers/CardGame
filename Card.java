//********************************************************************
//  Card.java       Author: Lewis/Loftus, Noah Boyers
//  Date: April 20th, 2020
//  Solution to Programming Project 8.7
//********************************************************************
public class Card {
    public final static int ACE   = 1;
    public final static int TWO   = 2;
    public final static int THREE = 3;
    public final static int FOUR  = 4;
    public final static int FIVE  = 5;
    public final static int SIX   = 6;
    public final static int SEVEN = 7;
    public final static int EIGHT = 8;
    public final static int NINE  = 9;
    public final static int TEN   = 10;
    public final static int JACK  = 11;
    public final static int QUEEN = 12;
    public final static int KING  = 13;

    public final static int CLUBS    = 1;
    public final static int DIAMONDS = 2;
    public final static int HEARTS   = 3;
    public final static int SPADES   = 4;

    private final static int NUM_FACES = 13;
    private final static int NUM_SUITS = 4;
    private int face, suit;
    private String faceName, suitName;

    //-----------------------------------------------------------------
    //  Creates a random card.
    //-----------------------------------------------------------------
    public Card() {
        this.face = (int) (Math.random() * NUM_FACES) + 1;
        this.suit = (int) (Math.random() * NUM_SUITS) + 1;
        setFaceName();
        setSuitName();
    }

    //-----------------------------------------------------------------
    //  Creates a card of the specified suit and face value.
    //-----------------------------------------------------------------
    public Card(int faceValue, int suitValue) {
        this.face = faceValue;
        this.suit = suitValue;
        setFaceName();
        setSuitName();
    }

    //-----------------------------------------------------------------
    //  Sets the string representation of the face using its stored
    //  numeric value.
    //-----------------------------------------------------------------
    private void setFaceName() {
        switch (face) {
            case ACE -> this.faceName = "Ace";
            case TWO -> this.faceName = "Two";
            case THREE -> this.faceName = "Three";
            case FOUR -> this.faceName = "Four";
            case FIVE -> this.faceName = "Five";
            case SIX -> this.faceName = "Six";
            case SEVEN -> this.faceName = "Seven";
            case EIGHT -> this.faceName = "Eight";
            case NINE -> this.faceName = "Nine";
            case TEN -> this.faceName = "Ten";
            case JACK -> this.faceName = "Jack";
            case QUEEN -> this.faceName = "Queen";
            case KING -> this.faceName = "King";
        }
    }

    //-----------------------------------------------------------------
    //  Sets the string representation of the suit using its stored
    //  numeric value.
    //-----------------------------------------------------------------
    private void setSuitName() {
        switch (suit) {
            case CLUBS -> this.suitName = "Clubs";
            case DIAMONDS -> this.suitName = "Diamonds";
            case HEARTS -> this.suitName = "Hearts";
            case SPADES -> this.suitName = "Spades";
        }
    }

    //-----------------------------------------------------------------
    //  Determines if this card is higher than the parameter. The
    //  second parameter determines if aces should be considered high
    //  (beats a King) or low (lowest of all faces). Uses the suit
    //  if both cards have the same face.
    //-----------------------------------------------------------------
    public boolean isHigherThan(Card card2, boolean aceHigh) {
       if (face == card2.getFace()) {
           return suit > card2.getSuit();
        } else {
            if (aceHigh && face == ACE)
                return true;
            else return face > card2.getFace();
        }
    }

    //-----------------------------------------------------------------
    //  Determines if this card is higher than the passed card,
    //  assuming that aces should be considered high.
    //-----------------------------------------------------------------
    public boolean isHigherThan(Card card2) {
        return isHigherThan(card2, true);
    }

    //-----------------------------------------------------------------
    //  Returns the face (numeric value) of this card.
    //-----------------------------------------------------------------
    public int getFace() {
        return face;
    }

    //-----------------------------------------------------------------
    //  Returns the suit (numeric value) of this card.
    //-----------------------------------------------------------------
    public int getSuit() {
        return suit;
    }

    //-----------------------------------------------------------------
    //  Returns the face (string value) of this card.
    //-----------------------------------------------------------------
    public String getFaceName() {
        return faceName;
    }

    //-----------------------------------------------------------------
    //  Returns the suit (string value) of this card.
    //-----------------------------------------------------------------
    public String getSuitName() {
        return suitName;
    }

    //-----------------------------------------------------------------
    //  Returns the string representation of this card, including
    //  both face and suit.
    //-----------------------------------------------------------------
    public String toString() {
        return faceName + " of " + suitName;
    }
}

