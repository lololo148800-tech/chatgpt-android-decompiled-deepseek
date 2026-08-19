package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractScopeAdapter implements MemberScope {
    /* JADX INFO: renamed from: a */
    public abstract MemberScope mo18363a();

    public final MemberScope getActualScope() {
        if (!(mo18363a() instanceof AbstractScopeAdapter)) {
            return mo18363a();
        }
        MemberScope memberScopeMo18363a = mo18363a();
        AbstractC16544l.m18092e(memberScopeMo18363a, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((AbstractScopeAdapter) memberScopeMo18363a).getActualScope();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return mo18363a().getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return mo18363a().mo22590getContributedClassifier(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return mo18363a().getContributedDescriptors(kindFilter, nameFilter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return mo18363a().getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return mo18363a().getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return mo18363a().getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return mo18363a().getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo18363a().mo22593recordLookup(name, location);
    }
}
