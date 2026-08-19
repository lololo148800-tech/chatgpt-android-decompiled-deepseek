package p910nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import p049Bm.InterfaceC1436k;

/* JADX INFO: renamed from: nn.h */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC17700h {
    /* JADX INFO: renamed from: a */
    Set mo19404a();

    /* JADX INFO: renamed from: b */
    TypeAliasDescriptor mo19405b(Name name);

    /* JADX INFO: renamed from: c */
    void mo19406c(ArrayList arrayList, DescriptorKindFilter descriptorKindFilter, InterfaceC1436k interfaceC1436k, NoLookupLocation noLookupLocation);

    Collection getContributedFunctions(Name name, LookupLocation lookupLocation);

    Collection getContributedVariables(Name name, LookupLocation lookupLocation);

    Set getFunctionNames();

    Set getVariableNames();
}
