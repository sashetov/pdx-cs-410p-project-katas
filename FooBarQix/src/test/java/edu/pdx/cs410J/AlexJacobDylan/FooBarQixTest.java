package edu.pdx.cs410J.AlexJacobDylan;

import org.junit.jupiter.api.BeforeEach;
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
   */
  @Test
  void compute1As1() {
    assertThat(this.fooBarQix.compute("1"), equalTo("1"));
  }

  @Test
  void compute2As2() {
    assertThat(this.fooBarQix.compute("2"), equalTo("2"));
  }

  @Test
  void compute3AsFooFoo() {
    assertThat(this.fooBarQix.compute("3"), equalTo("FooFoo"));
  }

  @Test
  void compute4As4() {
    assertThat(this.fooBarQix.compute("4"), equalTo("4"));
  }


  @Test
  void compute5AsBarBar() {
    assertThat(this.fooBarQix.compute("5"), equalTo("BarBar"));
  }

  @Test
  void compute6AsFoo() {
    assertThat(this.fooBarQix.compute("6"), equalTo("Foo"));
  }

  @Test
  void compute7AsQixQix() {
    assertThat(this.fooBarQix.compute("7"), equalTo("QixQix"));
  }

  @Test
  void compute8As8() {
    assertThat(this.fooBarQix.compute("8"), equalTo("8"));
  }

  @Test
  void compute9AsFoo() {
    assertThat(this.fooBarQix.compute("9"), equalTo("Foo"));
  }

  @Test
  void compute10AsBar() {
    assertThat(this.fooBarQix.compute("10"), equalTo("Bar"));
  }

  @Test
  void compute13AsFoo() {
    assertThat(this.fooBarQix.compute("13"), equalTo("Foo"));
  }

  @Test
  void compute15AsFooBarBar() {
    assertThat(this.fooBarQix.compute("15"), equalTo("FooBarBar"));
  }

  @Test
  void compute21AsFooQix() {
    assertThat(this.fooBarQix.compute("21"), equalTo("FooQix"));
  }

  @Test
  void compute33AsFooFooFoo() {
    assertThat(this.fooBarQix.compute("33"), equalTo("FooFooFoo"));
  }

  @Test
  void compute51AsFooBar() {
    assertThat(this.fooBarQix.compute("51"), equalTo("FooBar"));
  }

  @Test
  void compute53AsBarFoo() {
    assertThat(this.fooBarQix.compute("53"), equalTo("BarFoo"));
  }
}