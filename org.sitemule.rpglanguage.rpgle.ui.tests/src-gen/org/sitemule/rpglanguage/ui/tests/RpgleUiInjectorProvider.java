/*
 * generated by Xtext 2.19.0
 */
package org.sitemule.rpglanguage.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.sitemule.rpglanguage.rpgle.ui.internal.RpgleActivator;

public class RpgleUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return RpgleActivator.getInstance().getInjector("org.sitemule.rpglanguage.Rpgle");
	}

}
