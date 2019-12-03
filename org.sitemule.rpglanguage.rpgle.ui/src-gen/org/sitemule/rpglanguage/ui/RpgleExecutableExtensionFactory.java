/*
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.ui;

import com.google.inject.Injector;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.sitemule.rpglanguage.rpgle.ui.internal.RpgleActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class RpgleExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(RpgleActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		RpgleActivator activator = RpgleActivator.getInstance();
		return activator != null ? activator.getInjector(RpgleActivator.ORG_SITEMULE_RPGLANGUAGE_RPGLE) : null;
	}

}
