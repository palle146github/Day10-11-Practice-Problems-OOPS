package com.bridgelabz.oopsprograms;

public class Card {
    String[][] shuffle;
    int noOfPlayer;
    int noOfCards;
    DeckOfCards deck ;
    Player[] players;

    public Card(int noOfPlayer, int noOfCards) {
        this.noOfCards = noOfCards;
        this.noOfPlayer = noOfPlayer;
        deck = new DeckOfCards();
        deck.init();
        initPlayers();
    }
    public void shuffleCards() {
        for (int i = 0; i < noOfCards; i++) {
            for (int j = 0; j < players.length; j++) {
                int randomNumber = (int) (Math.random() * deck.deckOfCard.length);
                players[j].cards[i] = deck.deckOfCard[randomNumber];
                while (deck.deckOfCard[randomNumber].equals("null")) {
                    randomNumber = (int) (Math.random()* deck.deckOfCard.length);
                    players[j].cards[i] = deck.deckOfCard[randomNumber];
                }
                deck.deckOfCard[randomNumber] = "null";
            }
        }
    }
    private void initPlayers() {
        players = new Player[noOfPlayer];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(noOfCards);
        }
    }

    public void printShuffledCard() {
        for (int i = 0; i < players.length; i++) {
            int j = i + 1;
            System.out.println("Player : " + j + " cards : ");
            players[i].sortCards();
            players[i].printCards();
            System.out.print("\n");
        }
    }



    public static void main(String[] args) {
        Card card = new Card(4, 9);
        card.shuffleCards();
        card.printShuffledCard();
    }
}
