
package org.apereo.cas;

import org.apereo.cas.web.flow.actions.AuthenticationExceptionHandlerActionTests;
import org.apereo.cas.web.flow.actions.CasDefaultFlowUrlHandlerTests;
import org.apereo.cas.web.flow.actions.InjectResponseHeadersActionTests;
import org.apereo.cas.web.flow.actions.RedirectToServiceActionTests;

import org.junit.platform.suite.api.SelectClasses;

/**
 * This is {@link AllTestsSuite}.
 *
 * @author Auto-generated by Gradle Build
 * @since 6.0.0-RC3
 */
@SelectClasses({
    InjectResponseHeadersActionTests.class,
    CasDefaultFlowUrlHandlerTests.class,
    RedirectToServiceActionTests.class,
    AuthenticationExceptionHandlerActionTests.class
})
public class AllTestsSuite {
}
