package jmri.jmrix.anyma;

import jmri.jmrix.SystemConnectionMemoTestBase;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for AnymaDMX_SystemConnectionMemo class.
 *
 * @author George Warner Copyright (C) 2017
 * @since 4.9.6
 */
public class AnymaDMX_SystemConnectionMemoTest extends SystemConnectionMemoTestBase {
    @Test
    public void ConstructorTest() {
        Assert.assertNotNull("ConnectionConfig constructor", new AnymaDMX_SystemConnectionMemo());
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
        jmri.util.JUnitUtil.initDefaultUserMessagePreferences();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }
}
