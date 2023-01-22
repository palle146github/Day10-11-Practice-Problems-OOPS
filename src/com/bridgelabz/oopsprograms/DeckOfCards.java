package com.bridgelabz.oopsprograms;

public class DeckOfCards {
    String[] suits = {"C", "D", "H", "S"};
    String[] ranks = {"A", "2", "3", "4", "5", "6","7", "8", "9", "10", "J", "Q", "K"};
    String[] deckOfCard = new String[52];


    public void init() {
        int deckIndex = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deckOfCard[deckIndex++] = ranks[j] + "("
                        + suits[i] + ")";
            }
        }
    }

    public void printDeckOfCards() {
        for (int i = 0; i < deckOfCard.length; i++) {
            System.out.println(deckOfCard[i]);
        }
    }
}
