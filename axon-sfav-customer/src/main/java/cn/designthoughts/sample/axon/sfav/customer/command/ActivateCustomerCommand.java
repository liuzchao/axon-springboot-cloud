/*
 * Copyright (c) 2016-2026. DesignThoughts Axon Sample
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.designthoughts.sample.axon.sfav.customer.command;

import cn.designthoughts.sample.axon.sfav.customer.domain.*;

/**
 * @author Thomas Yuan
 */

public class ActivateCustomerCommand {

	private CustomerId customerId;
 	
	public ActivateCustomerCommand(CustomerId customerId){
		this.customerId = customerId;
	}
	
    public CustomerId getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerId customerId) {
		this.customerId = customerId;
	}
}
