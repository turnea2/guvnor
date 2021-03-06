package org.kie.guvnor.guided.rule.backend.server;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for GuidedRuleEditorService.loadDropDownExpression
 */
public class LoadDropDownDataTest {

    @Test
    public void testLoadDropDown() throws Exception {

        final GuidedRuleEditorServiceImpl service = new GuidedRuleEditorServiceImpl();

        final String[] pairs = new String[]{ "f1=x", "f2=2" };
        final String expression = "['@{f1}', '@{f2}']";
        final String[] r = service.loadDropDownExpression( pairs,
                                                           expression );
        assertEquals( 2,
                      r.length );

        assertEquals( "x",
                      r[ 0 ] );
        assertEquals( "2",
                      r[ 1 ] );

    }

    @Test
    public void testLoadDropDownNoValuePairs() throws Exception {

        final GuidedRuleEditorServiceImpl service = new GuidedRuleEditorServiceImpl();

        final String[] pairs = new String[]{ null };
        final String expression = "['@{f1}', '@{f2}']";
        final String[] r = service.loadDropDownExpression( pairs,
                                                           expression );

        assertEquals( 0,
                      r.length );
    }

}
