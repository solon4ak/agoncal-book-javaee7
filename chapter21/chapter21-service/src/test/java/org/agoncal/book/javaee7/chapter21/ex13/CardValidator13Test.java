package org.agoncal.book.javaee7.chapter21.ex13;

import org.agoncal.book.javaee7.chapter21.ex12.CardValidator12;
import org.agoncal.book.javaee7.chapter21.ex12.CreditCard12;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 7 with Glassfish 4
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
public class CardValidator13Test {

  @Test
  public void shouldCheckCreditCardValidity() {

    CreditCard12 creditCard = new CreditCard12("12341234", "12/12", 1234, "VISA");

    CardValidator12 cardValidator = new CardValidator12();
    assertFalse("Credit card should be valid", cardValidator.validate(creditCard));
    creditCard.setNumber("2");
    assertFalse("Credit card should be valid", cardValidator.validate(creditCard));

    creditCard.setNumber("12341233");
    assertTrue("Credit card should not be valid", cardValidator.validate(creditCard));
    creditCard.setNumber("1");
    assertTrue("Credit card should not be valid", cardValidator.validate(creditCard));
  }
}
