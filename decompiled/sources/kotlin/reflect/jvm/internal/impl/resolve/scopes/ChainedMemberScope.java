package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.collectionUtils.ScopeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17686t;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class ChainedMemberScope implements MemberScope {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final String f52914a;

    /* JADX INFO: renamed from: b */
    public final MemberScope[] f52915b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final MemberScope create(String debugName, Iterable<? extends MemberScope> scopes) {
            AbstractC16544l.m18094g(debugName, "debugName");
            AbstractC16544l.m18094g(scopes, "scopes");
            SmartList smartList = new SmartList();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.Empty.INSTANCE) {
                    if (memberScope instanceof ChainedMemberScope) {
                        AbstractC17686t.m19399w(smartList, ((ChainedMemberScope) memberScope).f52915b);
                    } else {
                        smartList.add(memberScope);
                    }
                }
            }
            return createOrSingle$descriptors(debugName, smartList);
        }

        public final MemberScope createOrSingle$descriptors(String debugName, List<? extends MemberScope> scopes) {
            AbstractC16544l.m18094g(debugName, "debugName");
            AbstractC16544l.m18094g(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                return size != 1 ? new ChainedMemberScope(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0);
            }
            return MemberScope.Empty.INSTANCE;
        }
    }

    public ChainedMemberScope(String str, MemberScope[] memberScopeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this.f52914a = str;
        this.f52915b = memberScopeArr;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getClassifierNames() {
        return MemberScopeKt.flatMapClassifierNamesOrNull(AbstractC17678l.m19295b(this.f52915b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        ClassifierDescriptor classifierDescriptor = null;
        for (MemberScope memberScope : this.f52915b) {
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
        MemberScope[] memberScopeArr = this.f52915b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return C17689w.f56480Y;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedDescriptors(kindFilter, nameFilter);
        }
        Collection<DeclarationDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedDescriptors(kindFilter, nameFilter));
        }
        return collectionConcat == null ? C17691y.f56482Y : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<SimpleFunctionDescriptor> getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        MemberScope[] memberScopeArr = this.f52915b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return C17689w.f56480Y;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedFunctions(name, location);
        }
        Collection<SimpleFunctionDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedFunctions(name, location));
        }
        return collectionConcat == null ? C17691y.f56482Y : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        MemberScope[] memberScopeArr = this.f52915b;
        int length = memberScopeArr.length;
        if (length == 0) {
            return C17689w.f56480Y;
        }
        if (length == 1) {
            return memberScopeArr[0].getContributedVariables(name, location);
        }
        Collection<PropertyDescriptor> collectionConcat = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionConcat = ScopeUtilsKt.concat(collectionConcat, memberScope.getContributedVariables(name, location));
        }
        return collectionConcat == null ? C17691y.f56482Y : collectionConcat;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getFunctionNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f52915b) {
            AbstractC17686t.m19398v(memberScope.getFunctionNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Set<Name> getVariableNames() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : this.f52915b) {
            AbstractC17686t.m19398v(memberScope.getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        for (MemberScope memberScope : this.f52915b) {
            memberScope.mo22593recordLookup(name, location);
        }
    }

    public String toString() {
        return this.f52914a;
    }
}
