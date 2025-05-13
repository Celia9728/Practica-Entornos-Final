package Test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testMaximo.class, TestMedia.class, TestMediana.class, TestMinimo.class })
public class AllTests {

}
