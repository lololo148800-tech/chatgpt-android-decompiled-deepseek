package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeKt;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p298Lm.C5140G;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmPackageScope implements MemberScope {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ InterfaceC3776x[] f51879e = {AbstractC16526C.f51263a.mo5699h(new C16553u(JvmPackageScope.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0))};

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51880a;

    /* JADX INFO: renamed from: b */
    public final LazyJavaPackageFragment f51881b;

    /* JADX INFO: renamed from: c */
    public final LazyJavaPackageScope f51882c;

    /* JADX INFO: renamed from: d */
    public final NotNullLazyValue f51883d;

    public JvmPackageScope(LazyJavaResolverContext c9, JavaPackage jPackage, LazyJavaPackageFragment packageFragment) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(jPackage, "jPackage");
        AbstractC16544l.m18094g(packageFragment, "packageFragment");
        this.f51880a = c9;
        this.f51881b = packageFragment;
        this.f51882c = new LazyJavaPackageScope(c9, jPackage, packageFragment);
        this.f51883d = c9.getStorageManager().createLazyValue(new C5140G(this, 18));
    }

    /* JADX INFO: renamed from: a */
    public final MemberScope[] m18186a() {
        return (MemberScope[]) StorageKt.getValue(this.f51883d, this, f51879e[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        Set<Name> setFlatMapClassifierNamesOrNull = MemberScopeKt.flatMapClassifierNamesOrNull(AbstractC17678l.m19295b(m18186a()));
        if (setFlatMapClassifierNamesOrNull == null) {
            return null;
        }
        setFlatMapClassifierNamesOrNull.addAll(this.f51882c.getClassifierNames());
        return setFlatMapClassifierNamesOrNull;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        ClassDescriptor classDescriptorMo22590getContributedClassifier = this.f51882c.mo22590getContributedClassifier(name, location);
        if (classDescriptorMo22590getContributedClassifier != null) {
            return classDescriptorMo22590getContributedClassifier;
        }
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : m18186a()) {
            ClassifierDescriptor classifierDescriptorMo22590getContributedClassifier = memberScope.mo22590getContributedClassifier(name, location);
            if (classifierDescriptorMo22590getContributedClassifier != null) {
                if (!(classifierDescriptorMo22590getContributedClassifier instanceof ClassifierDescriptorWithTypeParameters) || !((MemberDescriptor) classifierDescriptorMo22590getContributedClassifier).isExpect()) {
                    return classifierDescriptorMo22590getContributedClassifier;
                }
                if (classifierDescriptor == null) {
                    classifierDescriptor = classifierDescriptorMo22590getContributedClassifier;
                }
            }
        }
        return classifierDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        MemberScope[] memberScopeArrM18186a = m18186a();
        Collection<DeclarationDescriptor> contributedDescriptors = this.f51882c.getContributedDescriptors(kindFilter, nameFilter);
        for (MemberScope memberScope : memberScopeArrM18186a) {
            contributedDescriptors = ScopeUtilsKt.concat(contributedDescriptors, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return contributedDescriptors == null ? C17691y.f56482Y : contributedDescriptors;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        MemberScope[] memberScopeArrM18186a = m18186a();
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = this.f51882c.getContributedFunctions(name, location);
        int length = memberScopeArrM18186a.length;
        int i10 = 0;
        Collection collection = contributedFunctions;
        while (i10 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrM18186a[i10].getContributedFunctions(name, location));
            i10++;
            collection = collectionConcat;
        }
        return collection == null ? C17691y.f56482Y : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        MemberScope[] memberScopeArrM18186a = m18186a();
        Collection<? extends PropertyDescriptor> contributedVariables = this.f51882c.getContributedVariables(name, location);
        int length = memberScopeArrM18186a.length;
        int i10 = 0;
        Collection collection = contributedVariables;
        while (i10 < length) {
            Collection collectionConcat = ScopeUtilsKt.concat(collection, memberScopeArrM18186a[i10].getContributedVariables(name, location));
            i10++;
            collection = collectionConcat;
        }
        return collection == null ? C17691y.f56482Y : collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        MemberScope[] memberScopeArrM18186a = m18186a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM18186a) {
            AbstractC17686t.m19398v(memberScope.getFunctionNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f51882c.getFunctionNames());
        return linkedHashSet;
    }

    public final LazyJavaPackageScope getJavaScope$descriptors_jvm() {
        return this.f51882c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        MemberScope[] memberScopeArrM18186a = m18186a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArrM18186a) {
            AbstractC17686t.m19398v(memberScope.getVariableNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f51882c.getVariableNames());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        UtilsKt.record(this.f51880a.getComponents().getLookupTracker(), location, this.f51881b, name);
    }

    public String toString() {
        return "scope for " + this.f51881b;
    }
}
