package jmri.jmrix.ecos;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Paul Bender Copyright (C) 2017	
 */
public class EcosDccThrottleManagerTest {

    @Test
    public void testCTor() {
        EcosTrafficController tc = new EcosInterfaceScaffold();
        EcosDccThrottleManager t = new EcosDccThrottleManager(new jmri.jmrix.ecos.EcosSystemConnectionMemo(tc));
        Assert.assertNotNull("exists",t);
    }

    // The minimal setup for log4J
    @Before
    public void setUp() {
        apps.tests.Log4JFixture.setUp();
        jmri.util.JUnitUtil.resetInstanceManager();
    }

    @After
    public void tearDown() {
        jmri.util.JUnitUtil.resetInstanceManager();
        apps.tests.Log4JFixture.tearDown();
    }

    private final static Logger log = LoggerFactory.getLogger(EcosDccThrottleManagerTest.class.getName());

}