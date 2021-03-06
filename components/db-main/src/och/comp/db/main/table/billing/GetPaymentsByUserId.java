/*
 * Copyright 2015 Evgeny Dolganov (evgenij.dolganov@gmail.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package och.comp.db.main.table.billing;

import static och.comp.db.main.table.MainTables.*;
import och.api.model.billing.PaymentExt;
import och.comp.db.base.universal.SelectRows;
import och.comp.db.base.universal.query.AndCondition;
import och.comp.db.base.universal.query.SortCondition;
import och.comp.db.main.table._f.Updated;
import och.comp.db.main.table._f.UserId;



public class GetPaymentsByUserId extends SelectRows<PaymentExt>{

	public GetPaymentsByUserId(long userId, int limit, int offset) {
		super(payments, 
				PaymentExt.class, 
				new PaymentFields(), 
				new AndCondition(new UserId(userId)),
				new SortCondition(Updated.class, false), 
				limit,
				offset);
	}

}
