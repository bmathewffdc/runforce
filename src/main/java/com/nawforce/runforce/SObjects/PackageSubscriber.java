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
public class PackageSubscriber extends SObject {
	public static SObjectType$<PackageSubscriber> SObjectType;
	public static SObjectFields$<PackageSubscriber> Fields;

	public Id Id;
	public String InstalledStatus;
	public String InstanceName;
	public Id MetadataPackageId;
	public MetadataPackage MetadataPackage;
	public Id MetadataPackageVersionId;
	public MetadataPackageVersion MetadataPackageVersion;
	public String OrgKey;
	public String OrgName;
	public String OrgStatus;
	public String OrgType;
	public String ParentOrg;
	public Datetime SystemModstamp;

	public PackageSubscriber clone$() {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public PackageSubscriber clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
