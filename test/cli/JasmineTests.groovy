import grails.test.AbstractCliTestCase

class JasmineTests extends AbstractCliTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testJasmine() {

        execute(["jasmine"])

        assertEquals 0, waitForProcess()
        verifyHeader()
    }
}
