package edu.pdx.cs410J.room3;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration Test for {@link Kata}.
 *
 * @author Alex Vassilevski
 * @author Anna Kawasaki
 * @author Tam Nguyen
 * @author Jacob Landstrom
 * @author Vidyavarshini Holenarasipur Jayashankar
 */
class KataIT extends InvokeMainTestCase {


  /**
   * 20 5 /        => 20/5 = 4
   * 4 2 + 3 -     => (4+2)-3 = 3
   * 3 5 8 * 7 + * => ((5*8)+7)*3 = 141
   */
  @Test
  void invokingMainWithNoArgumentsPrintsMissingArgumentsToStandardError() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class);
    assertThat(result.getTextWrittenToStandardError(), containsString("Missing command line arguments"));
  }

  //  20 5 /        => 20/5 = 4
  @Test
  void invokeMainSample1() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "20", "5", "/");
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString("Result: 4"));
  }

  //4 2 + 3 -     => (4+2)-3 = 3
  @Test
  void invokeMainSample2() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "4", "2", "+", "3", "-");
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString("Result: 3"));
  }

  // 3 5 8 * 7 + * => ((5*8)+7)*3 = 141
  @Test
  void invokeMainSample3() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "3", "5", "8", "*", "7", "+", "*");
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString("Result: 141"));
  }
  //
  @Test
  void invokeMainMaxCase() {
    InvokeMainTestCase.MainMethodResult result = invokeMain(Kata.class, "5", "3", "4", "2", "9", "1", "MAX");
    assertThat(result.getTextWrittenToStandardError(), containsString(""));
    assertThat(result.getTextWrittenToStandardOut(), containsString("Result: 9"));
  }
}
