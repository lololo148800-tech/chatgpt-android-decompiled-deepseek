package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Substitutable;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import mm.C17314q;
import p049Bm.InterfaceC1436k;
import p298Lm.C5140G;
import p571X9.AbstractC9227W;

/* JADX INFO: loaded from: classes2.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: a */
    public final MemberScope f52943a;

    /* JADX INFO: renamed from: b */
    public final TypeSubstitutor f52944b;

    /* JADX INFO: renamed from: c */
    public HashMap f52945c;

    /* JADX INFO: renamed from: d */
    public final C17314q f52946d;

    public SubstitutingScope(MemberScope workerScope, TypeSubstitutor givenSubstitutor) {
        AbstractC16544l.m18094g(workerScope, "workerScope");
        AbstractC16544l.m18094g(givenSubstitutor, "givenSubstitutor");
        this.f52943a = workerScope;
        AbstractC9227W.m9800c(new C5140G(givenSubstitutor, 23));
        TypeSubstitution substitution = givenSubstitutor.getSubstitution();
        AbstractC16544l.m18093f(substitution, "getSubstitution(...)");
        this.f52944b = CapturedTypeConstructorKt.wrapWithCapturingSubstitution$default(substitution, false, 1, null).buildSubstitutor();
        this.f52946d = AbstractC9227W.m9800c(new C5140G(this, 24));
    }

    /* JADX INFO: renamed from: a */
    public final Collection m18364a(Collection collection) {
        if (this.f52944b.isEmpty() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetNewLinkedHashSetWithExpectedSize = CollectionsKt.newLinkedHashSetWithExpectedSize(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetNewLinkedHashSetWithExpectedSize.add(m18365b((DeclarationDescriptor) it.next()));
        }
        return linkedHashSetNewLinkedHashSetWithExpectedSize;
    }

    /* JADX INFO: renamed from: b */
    public final DeclarationDescriptor m18365b(DeclarationDescriptor declarationDescriptor) {
        TypeSubstitutor typeSubstitutor = this.f52944b;
        if (typeSubstitutor.isEmpty()) {
            return declarationDescriptor;
        }
        if (this.f52945c == null) {
            this.f52945c = new HashMap();
        }
        HashMap map = this.f52945c;
        AbstractC16544l.m18091d(map);
        Object objSubstitute = map.get(declarationDescriptor);
        if (objSubstitute == null) {
            if (!(declarationDescriptor instanceof Substitutable)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + declarationDescriptor).toString());
            }
            objSubstitute = ((Substitutable) declarationDescriptor).substitute(typeSubstitutor);
            if (objSubstitute == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + declarationDescriptor + " substitution fails");
            }
            map.put(declarationDescriptor, objSubstitute);
        }
        return (DeclarationDescriptor) objSubstitute;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return this.f52943a.getClassifierNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = this.f52943a.mo22590getContributedClassifier(name, location);
        if (classifierDescriptorMo22590getContributedClassifier != null) {
            return (ClassifierDescriptor) m18365b(classifierDescriptorMo22590getContributedClassifier);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return (Collection) this.f52946d.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<? extends SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return m18364a(this.f52943a.getContributedFunctions(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<? extends PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return m18364a(this.f52943a.getContributedVariables(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        return this.f52943a.getFunctionNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        return this.f52943a.getVariableNames();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation lookupLocation) {
        MemberScope.DefaultImpls.recordLookup(this, name, lookupLocation);
    }
}
