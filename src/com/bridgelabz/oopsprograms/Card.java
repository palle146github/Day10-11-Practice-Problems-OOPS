package com.bridgelabz.oopsprograms;

public class Card {
    String[][] shuffle;
    int noOfPlayer;
    int noOfCards;
    DeckOfCards deck = new DeckOfCards();;

    public Card(int noOfPlayer, int noOfCards) {
        this.noOfCards = noOfCards;
        this.noOfPlayer = noOfPlayer;
        shuffle = new String[noOfPlayer][noOfCards];
        deck.init();
    }
    public void shuffleCards() {
        for (int i = 0; i < noOfCards; i++) {
            for (int j = 0; j < noOfPlayer; j++) {
                int randomNumber = (int) (Math.random()* deck.deckOfCard.length);
                shuffle[j][i] = deck.deckOfCard[randomNumber];
                while (deck.deckOfCard[randomNumber].equals("null")) {
                    randomNumber = (int) (Math.random()* deck.deckOfCard.length);
                    shuffle[j][i] = deck.deckOfCard[randomNumber];
                }
                deck.deckOfCard[randomNumber] = "null";
            }
        }
    }
    public void printShuffledCard() {
        for (int i = 0; i < noOfPlayer; i++) {
            for (int j = 0; j < noOfCards; j++) {
                System.out.print(shuffle[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
    public static void main(String[] args) {
        Card card = new Card(4, 9);
        card.shuffleCards();
        card.printShuffledCard();
    }
}
