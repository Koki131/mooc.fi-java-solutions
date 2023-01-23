/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author milapetrov
 */
import java.util.*;

public class Hand implements Comparable<Hand> {
    private List<Card> hand;
    
    public Hand() {
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card) {
        this.hand.add(card);
    }
    
    public void print() {
        Iterator<Card> iterator = hand.iterator();
        
        
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }        
    }
    public List<Card> getHand() {
        return this.hand;
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
    @Override
    public int compareTo(Hand compared) {
       int sum1 = 0;
       int sum2 = 0;
       for (Card h : this.hand) {
           sum1 = sum1 + h.getValue();
       }
       for (Card h : compared.hand) {
           sum2 = sum2 + h.getValue();
       }
       
       return sum1 - sum2;
        
    }
    
    public void sortBySuit() {
        Collections.sort(hand, (v1, v2) -> v1.getValue() - v2.getValue());
        Collections.sort(hand, (c1, c2) -> c1.getSuit().ordinal() - c2.getSuit().ordinal());
    }
}
