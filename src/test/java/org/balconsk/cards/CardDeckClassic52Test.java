package org.balconsk.cards;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CardDeckClassic52Test {
    CardDeckClassic52 cardDeckClassic52;

    @BeforeEach
    void setup(){
        cardDeckClassic52 = new CardDeckClassic52();
    }

    @Test
    void size(){
        Assertions.assertEquals(52,cardDeckClassic52.size());
    }
}
