package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;
import p315Me.Myis.CxcULo;
import p379Pb.LVf.efyhmdM;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class InnerClassesScopeWrapper extends MemberScopeImpl {

    /* JADX INFO: renamed from: a */
    public final MemberScope f52935a;

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return this.f52935a.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.f52935a.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.f52935a.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        this.f52935a.mo22593recordLookup(name, location);
    }

    public String toString() {
        return "Classes from " + this.f52935a;
    }

    public InnerClassesScopeWrapper(MemberScope memberScope) {
        AbstractC16544l.m18094g(memberScope, CxcULo.DcZJRxrY);
        this.f52935a = memberScope;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation lookupLocation) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(lookupLocation, efyhmdM.EfAo);
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = this.f52935a.mo22590getContributedClassifier(name, lookupLocation);
        if (classifierDescriptorMo22590getContributedClassifier == null) {
            return null;
        }
        ClassDescriptor classDescriptor = classifierDescriptorMo22590getContributedClassifier instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22590getContributedClassifier : null;
        if (classDescriptor != null) {
            return classDescriptor;
        }
        if (classifierDescriptorMo22590getContributedClassifier instanceof TypeAliasDescriptor) {
            return (TypeAliasDescriptor) classifierDescriptorMo22590getContributedClassifier;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public List<ClassifierDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        DescriptorKindFilter descriptorKindFilterRestrictedToKindsOrNull = kindFilter.restrictedToKindsOrNull(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK());
        if (descriptorKindFilterRestrictedToKindsOrNull == null) {
            return C17689w.f56480Y;
        }
        Collection<DeclarationDescriptor> contributedDescriptors = this.f52935a.getContributedDescriptors(descriptorKindFilterRestrictedToKindsOrNull, nameFilter);
        ArrayList arrayList = new ArrayList();
        for (Object obj : contributedDescriptors) {
            if (obj instanceof ClassifierDescriptorWithTypeParameters) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
