/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package com.paulograbin.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.paulograbin.fulfilmentprocess.constants.GrabinFulfilmentProcessConstants;

@SuppressWarnings("PMD")
public class GrabinFulfilmentProcessManager extends GeneratedGrabinFulfilmentProcessManager
{
	public static final GrabinFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (GrabinFulfilmentProcessManager) em.getExtension(GrabinFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
