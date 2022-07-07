package edu.pdx.cs410J.AlexJacobDylan;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.core.StringContains.containsString;

class FooBarQixIT extends InvokeMainTestCase {

  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }


  @Test
  void compute1As1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "1");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("1"));
  }

  @Test
  void compute2As2() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "2");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("2"));
  }

  @Test
  void compute3AsFooFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "3");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFoo"));
  }

  @Test
  void compute4As4() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "4");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("4"));
  }


  @Test
  void compute5AsBarBar() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "5");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("BarBar"));
  }

  @Test
  void compute6AsFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "6");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  @Test
  void compute7AsQixQix() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "7");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("QixQix"));
  }

  @Test
  void compute8As8() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "8");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("8"));
  }

  @Test
  void compute9AsFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "9");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  @Test
  void compute10AsBar() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "10");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Bar"));
  }

  @Test
  void compute13AsFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "13");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("Foo"));
  }

  @Test
  void compute15AsFooBarBar() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "15");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBarBar"));
  }

  @Test
  void compute21AsFooQix() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "21");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooQix"));
  }

  @Test
  void compute33AsFooFooFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "33");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooFooFoo"));
  }

  @Test
  void compute51AsFooBar() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "51");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("FooBar"));
  }

  @Test
  void compute53AsBarFoo() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(FooBarQix.class, "53");
    assertThat(result.getTextWrittenToStandardOut(), equalTo("BarFoo"));
  }
}