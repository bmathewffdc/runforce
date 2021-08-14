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
public class AuthorizationFormConsentChangeEvent extends SObject {
	public static SObjectType$<AuthorizationFormConsentChangeEvent> SObjectType;
	public static SObjectFields$<AuthorizationFormConsentChangeEvent> Fields;

	public Id AuthorizationFormTextId;
	public AuthorizationFormText AuthorizationFormText;
	public Object ChangeEventHeader;
	public Datetime ConsentCapturedDateTime;
	public String ConsentCapturedSource;
	public String ConsentCapturedSourceType;
	public Id ConsentGiverId;
	public SObject ConsentGiver;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Id DocumentVersionId;
	public ContentVersion DocumentVersion;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedRecordId;
	public Account RelatedRecord;
	public String ReplayId;
	public String Status;

	public AuthorizationFormConsentChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AuthorizationFormConsentChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
