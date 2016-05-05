/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.plugin.sample.wizard.ide;

import com.google.gwt.i18n.client.Messages;

/**
 * Localization constants. Interface to represent the constants defined in resource bundle:
 * 'SampleWizardLocalizationConstant.properties'.
 *
 * @author Vitalii PArfonov
 */
public interface SampleWizardLocalizationConstant extends Messages {


    @Key("cpp.action.create.c.file.title")
    @DefaultMessage("New C File")
    String createCFileActionTitle();

    @Key("cpp.action.create.c.file.description")
    @DefaultMessage("Create C File")
    String createCFileActionDescription();

}
