/*
 Copyright (c) 2019 Kevin Jones, All rights reserved.
 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class ContactPointPhoneChangeEvent extends SObject {
	public static SObjectType$<ContactPointPhoneChangeEvent> SObjectType;
	public static SObjectFields$<ContactPointPhoneChangeEvent> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public String AreaCode;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExtensionNumber;
	public String FormattedInternationalPhoneNumber;
	public String FormattedNationalPhoneNumber;
	public Id Id;
	public Boolean IsBusinessPhone;
	public Boolean IsFaxCapable;
	public Boolean IsPersonalPhone;
	public Boolean IsPrimary;
	public Boolean IsSmsCapable;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id ParentId;
	public SObject Parent;
	public String PhoneType;
	public String ReplayId;
	public String TelephoneNumber;

	public ContactPointPhoneChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhoneChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
