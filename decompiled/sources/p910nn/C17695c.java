package p910nn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDeclarationsFromSupertypeConflictDataKey;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.UtilsKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import p049Bm.InterfaceC1436k;
import p160G5.p161rK.TVCuK;
import p298Lm.C5140G;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17689w;

/* JADX INFO: renamed from: nn.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C17695c extends DeserializedMemberScope {

    /* JADX INFO: renamed from: f */
    public final KotlinTypeRefiner f56489f;

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f56490g;

    /* JADX INFO: renamed from: h */
    public final NotNullLazyValue f56491h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DeserializedClassDescriptor f56492i;

    public C17695c(DeserializedClassDescriptor deserializedClassDescriptor, KotlinTypeRefiner kotlinTypeRefiner) {
        AbstractC16544l.m18094g(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f56492i = deserializedClassDescriptor;
        DeserializationContext c9 = deserializedClassDescriptor.getC();
        List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
        AbstractC16544l.m18093f(functionList, "getFunctionList(...)");
        List<ProtoBuf.Property> propertyList = deserializedClassDescriptor.getClassProto().getPropertyList();
        AbstractC16544l.m18093f(propertyList, "getPropertyList(...)");
        List<ProtoBuf.TypeAlias> typeAliasList = deserializedClassDescriptor.getClassProto().getTypeAliasList();
        AbstractC16544l.m18093f(typeAliasList, "getTypeAliasList(...)");
        List<Integer> nestedClassNameList = deserializedClassDescriptor.getClassProto().getNestedClassNameList();
        AbstractC16544l.m18093f(nestedClassNameList, "getNestedClassNameList(...)");
        List<Integer> list = nestedClassNameList;
        NameResolver nameResolver = deserializedClassDescriptor.getC().getNameResolver();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(NameResolverUtilKt.getName(nameResolver, ((Number) it.next()).intValue()));
        }
        super(c9, functionList, propertyList, typeAliasList, new C5140G(arrayList, 26));
        this.f56489f = kotlinTypeRefiner;
        this.f56490g = this.f53093a.getStorageManager().createLazyValue(new C17694b(this, 0));
        this.f56491h = this.f53093a.getStorageManager().createLazyValue(new C17694b(this, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: a */
    public final void mo18381a(ArrayList arrayList, InterfaceC1436k nameFilter) {
        ?? arrayList2;
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        C17697e c17697e = this.f56492i.f53071B0;
        if (c17697e != null) {
            Set<Name> setKeySet = c17697e.f56495a.keySet();
            arrayList2 = new ArrayList();
            for (Name name : setKeySet) {
                AbstractC16544l.m18094g(name, "name");
                ClassDescriptor classDescriptor = (ClassDescriptor) c17697e.f56496b.invoke(name);
                if (classDescriptor != null) {
                    arrayList2.add(classDescriptor);
                }
            }
        } else {
            arrayList2 = 0;
        }
        if (arrayList2 == 0) {
            arrayList2 = C17689w.f56480Y;
        }
        arrayList.addAll(arrayList2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: c */
    public final void mo18383c(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f56491h.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((KotlinType) it.next()).getMemberScope().getContributedFunctions(name, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        arrayList.addAll(this.f53093a.getComponents().getAdditionalClassPartsProvider().getFunctions(name, this.f56492i));
        m19403k(name, arrayList2, arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: e */
    public final ClassId mo18385e(Name name) {
        AbstractC16544l.m18094g(name, "name");
        return this.f56492i.f53083t0.createNestedClassId(name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: f */
    public final Set mo18386f() {
        List<KotlinType> supertypes = this.f56492i.f53089z0.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            Set<Name> classifierNames = ((KotlinType) it.next()).getMemberScope().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            AbstractC17686t.m19398v(classifierNames, linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: g */
    public final Set mo18387g() {
        DeserializedClassDescriptor deserializedClassDescriptor = this.f56492i;
        List<KotlinType> supertypes = deserializedClassDescriptor.f53089z0.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((KotlinType) it.next()).getMemberScope().getFunctionNames(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f53093a.getComponents().getAdditionalClassPartsProvider().getFunctionsNames(deserializedClassDescriptor));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public final ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        ClassDescriptor classDescriptor;
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        C17697e c17697e = this.f56492i.f53071B0;
        return (c17697e == null || (classDescriptor = (ClassDescriptor) c17697e.f56496b.invoke(name)) == null) ? super.mo22590getContributedClassifier(name, location) : classDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return (Collection) this.f56490g.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public final Collection getContributedFunctions(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        return super.getContributedFunctions(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public final Collection getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        mo22593recordLookup(name, location);
        return super.getContributedVariables(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: h */
    public final Set mo18388h() {
        List<KotlinType> supertypes = this.f56492i.f53089z0.getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = supertypes.iterator();
        while (it.hasNext()) {
            AbstractC17686t.m19398v(((KotlinType) it.next()).getMemberScope().getVariableNames(), linkedHashSet);
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: j */
    public final boolean mo18390j(SimpleFunctionDescriptor function) {
        AbstractC16544l.m18094g(function, "function");
        return this.f53093a.getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.f56492i, function);
    }

    /* JADX INFO: renamed from: k */
    public final void m19403k(Name name, ArrayList arrayList, final ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList(arrayList2);
        this.f53093a.getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(name, arrayList, arrayList3, this.f56492i, new NonReportingOverrideStrategy() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor$DeserializedClassMemberScope$generateFakeOverrides$1
            @Override // kotlin.reflect.jvm.internal.impl.resolve.NonReportingOverrideStrategy
            /* JADX INFO: renamed from: a */
            public final void mo7325a(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
                AbstractC16544l.m18094g(fromSuper, "fromSuper");
                AbstractC16544l.m18094g(fromCurrent, "fromCurrent");
                if (fromCurrent instanceof FunctionDescriptorImpl) {
                    ((FunctionDescriptorImpl) fromCurrent).putInUserDataMap(DeserializedDeclarationsFromSupertypeConflictDataKey.INSTANCE, fromSuper);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy
            public void addFakeOverride(CallableMemberDescriptor fakeOverride) {
                AbstractC16544l.m18094g(fakeOverride, "fakeOverride");
                OverridingUtil.resolveUnknownVisibilityForMember(fakeOverride, null);
                arrayList2.add(fakeOverride);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: recordLookup */
    public final void mo22593recordLookup(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        UtilsKt.record(this.f53093a.getComponents().getLookupTracker(), location, this.f56492i, name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberScope
    /* JADX INFO: renamed from: d */
    public final void mo18384d(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, TVCuK.VjbejV);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Collection) this.f56491h.invoke()).iterator();
        while (it.hasNext()) {
            arrayList2.addAll(((KotlinType) it.next()).getMemberScope().getContributedVariables(name, NoLookupLocation.FOR_ALREADY_TRACKED));
        }
        m19403k(name, arrayList2, arrayList);
    }
}
