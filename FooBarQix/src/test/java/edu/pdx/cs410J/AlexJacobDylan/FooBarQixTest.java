package edu.pdx.cs410J.AlexJacobDylan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * Test class for {@link FooBarQix}.
 *
 * @author Alex
 * @author Jacob
 * @version 1.0
 * @since 1.0
 */

public class FooBarQixTest {
  /**
   * Instance of {@link FooBarQix} being used for testing.
   */
  private FooBarQix fooBarQix;


  @BeforeEach
  void setUp() {
    fooBarQix = new FooBarQix();
  }

  @Test
  void canInstantiateKataClass() {
  }

  /*
  1  => 1
  2  => 2
  3  => FooFoo (divisible by 3, contains 3)
  4  => 4
  5  => BarBar (divisible by 5, contains 5)
  6  => Foo (divisible by 3)
  7  => QixQix (divisible by 7, contains 7)
  8  => 8
  9  => Foo
  10 => Bar
  13 => Foo
  15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
  21 => FooQix
  33 => FooFooFoo (divisible by 3, contains two 3)
  51 => FooBar
  53 => BarFoo

STEP 2:
replace 0 with *
101   => 1*1
303   => FooFoo*Foo
105   => FooBarQix*Bar
10101 => FooQix**
   */
  @Test
  void compute1As1() {
    assertThat(FooBarQix.compute("1"), equalTo("1"));
  }

  @Test
  void compute2As2() {
    assertThat(FooBarQix.compute("2"), equalTo("2"));
  }

  @Test
  void compute3AsFooFoo() {
    assertThat(FooBarQix.compute("3"), equalTo("FooFoo"));
  }

  @Test
  void compute4As4() {
    assertThat(FooBarQix.compute("4"), equalTo("4"));
  }


  @Test
  void compute5AsBarBar() {
    assertThat(FooBarQix.compute("5"), equalTo("BarBar"));
  }

  @Test
  void compute6AsFoo() {
    assertThat(FooBarQix.compute("6"), equalTo("Foo"));
  }

  @Test
  void compute7AsQixQix() {
    assertThat(FooBarQix.compute("7"), equalTo("QixQix"));
  }

  @Test
  void compute8As8() {
    assertThat(FooBarQix.compute("8"), equalTo("8"));
  }

  @Test
  void compute9AsFoo() {
    assertThat(FooBarQix.compute("9"), equalTo("Foo"));
  }

  @Disabled("not sure about correct behavior")
  void compute10AsBar() {
    assertThat(FooBarQix.compute("10"), equalTo("Bar"));
  }

  @Test
  void compute13AsFoo() {
    assertThat(FooBarQix.compute("13"), equalTo("Foo"));
  }

  @Test
  void compute15AsFooBarBar() {
    assertThat(FooBarQix.compute("15"), equalTo("FooBarBar"));
  }

  @Test
  void compute21AsFooQix() {
    assertThat(FooBarQix.compute("21"), equalTo("FooQix"));
  }

  @Test
  void compute33AsFooFooFoo() {
    assertThat(FooBarQix.compute("33"), equalTo("FooFooFoo"));
  }

  @Test
  void compute51AsFooBar() {
    assertThat(FooBarQix.compute("51"), equalTo("FooBar"));
  }

  @Test
  void compute53AsBarFoo() {
    assertThat(FooBarQix.compute("53"), equalTo("BarFoo"));
  }

  @Test
  void compute101As1Star1() {
    assertThat(FooBarQix.compute("101"), equalTo("1*1"));
  }

  @Test
  void compute303AsFooFooStarFoo() {
    assertThat(FooBarQix.compute("303"), equalTo("FooFoo*Foo"));
  }

  @Test
  void compute105AsFooBarQixStarBar() {
    assertThat(FooBarQix.compute("105"), equalTo("FooBarQix*Bar"));
  }

  @Test
  void compute10101AsFooQixStarStar() {
    assertThat(FooBarQix.compute("10101"), equalTo("FooQix**"));
  }
}