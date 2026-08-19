package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.components.DescriptorResolverUtils;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.UtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p571X9.AbstractC9393x3;
import p605Ym.C10092f;
import p605Ym.C10099m;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaStaticClassScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ int f51953o = 0;

    /* JADX INFO: renamed from: m */
    public final JavaClass f51954m;

    /* JADX INFO: renamed from: n */
    public final JavaClassDescriptor f51955n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaStaticClassScope(LazyJavaResolverContext c9, JavaClass jClass, JavaClassDescriptor ownerDescriptor) {
        super(c9);
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(jClass, "jClass");
        AbstractC16544l.m18094g(ownerDescriptor, "ownerDescriptor");
        this.f51954m = jClass;
        this.f51955n = ownerDescriptor;
    }

    /* JADX INFO: renamed from: l */
    public static PropertyDescriptor m18219l(PropertyDescriptor propertyDescriptor) {
        if (propertyDescriptor.getKind().isReal()) {
            return propertyDescriptor;
        }
        Collection<? extends PropertyDescriptor> overriddenDescriptors = propertyDescriptor.getOverriddenDescriptors();
        AbstractC16544l.m18093f(overriddenDescriptors, "getOverriddenDescriptors(...)");
        Collection<? extends PropertyDescriptor> collection = overriddenDescriptors;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(collection, 10));
        for (PropertyDescriptor propertyDescriptor2 : collection) {
            AbstractC16544l.m18091d(propertyDescriptor2);
            arrayList.add(m18219l(propertyDescriptor2));
        }
        return (PropertyDescriptor) AbstractC17680n.m19365o0(AbstractC17680n.m19335K(arrayList));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: a */
    public final Set mo18197a(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: b */
    public final void mo18198b(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().generateStaticFunctions(this.f51955n, name, arrayList, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeFunctionNames(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        Set setM19326F0 = AbstractC17680n.m19326F0(((DeclaredMemberIndex) this.f51937d.invoke()).getMethodNames());
        JavaClassDescriptor javaClassDescriptor = this.f51955n;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Set<Name> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = C17691y.f56482Y;
        }
        setM19326F0.addAll(functionNames);
        if (this.f51954m.isEnum()) {
            setM19326F0.addAll(AbstractC17681o.m19382k(StandardNames.ENUM_VALUE_OF, StandardNames.ENUM_VALUES));
        }
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        setM19326F0.addAll(lazyJavaResolverContext.getComponents().getSyntheticPartsProvider().getStaticFunctionNames(javaClassDescriptor, lazyJavaResolverContext));
        return setM19326F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclaredMemberIndex computeMemberIndex() {
        return new ClassDeclaredMemberIndex(this.f51954m, C10092f.f29879p0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: d */
    public final void mo18199d(LinkedHashSet linkedHashSet, Name name) {
        AbstractC16544l.m18094g(name, "name");
        JavaClassDescriptor javaClassDescriptor = this.f51955n;
        LazyJavaStaticClassScope parentJavaStaticClassScope = UtilKt.getParentJavaStaticClassScope(javaClassDescriptor);
        Collection collectionM19328G0 = parentJavaStaticClassScope == null ? C17691y.f56482Y : AbstractC17680n.m19328G0(parentJavaStaticClassScope.getContributedFunctions(name, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, collectionM19328G0, linkedHashSet, this.f51955n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
        AbstractC16544l.m18093f(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
        linkedHashSet.addAll(collectionResolveOverridesForStaticMembers);
        if (this.f51954m.isEnum()) {
            if (name.equals(StandardNames.ENUM_VALUE_OF)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(javaClassDescriptor);
                AbstractC16544l.m18093f(simpleFunctionDescriptorCreateEnumValueOfMethod, "createEnumValueOfMethod(...)");
                linkedHashSet.add(simpleFunctionDescriptorCreateEnumValueOfMethod);
            } else if (name.equals(StandardNames.ENUM_VALUES)) {
                SimpleFunctionDescriptor simpleFunctionDescriptorCreateEnumValuesMethod = DescriptorFactory.createEnumValuesMethod(javaClassDescriptor);
                AbstractC16544l.m18093f(simpleFunctionDescriptorCreateEnumValuesMethod, "createEnumValuesMethod(...)");
                linkedHashSet.add(simpleFunctionDescriptorCreateEnumValuesMethod);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticScope, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: e */
    public final void mo18200e(Name name, ArrayList arrayList) {
        AbstractC16544l.m18094g(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C1756x c1756x = new C1756x(name, 16);
        JavaClassDescriptor javaClassDescriptor = this.f51955n;
        DFS.dfs(AbstractC9393x3.m9974d(javaClassDescriptor), C10099m.f29897Y, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, linkedHashSet, c1756x));
        boolean zIsEmpty = arrayList.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.f51934a;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                PropertyDescriptor propertyDescriptorM18219l = m18219l((PropertyDescriptor) obj);
                Object arrayList2 = linkedHashMap.get(propertyDescriptorM18219l);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(propertyDescriptorM18219l, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collectionResolveOverridesForStaticMembers = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, (Collection) ((Map.Entry) it.next()).getValue(), arrayList, this.f51955n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
                AbstractC16544l.m18093f(collectionResolveOverridesForStaticMembers, "resolveOverridesForStaticMembers(...)");
                AbstractC17686t.m19398v(collectionResolveOverridesForStaticMembers, arrayList3);
            }
            arrayList.addAll(arrayList3);
        } else {
            Collection collectionResolveOverridesForStaticMembers2 = DescriptorResolverUtils.resolveOverridesForStaticMembers(name, linkedHashSet, arrayList, this.f51955n, lazyJavaResolverContext.getComponents().getErrorReporter(), lazyJavaResolverContext.getComponents().getKotlinTypeChecker().getOverridingUtil());
            AbstractC16544l.m18093f(collectionResolveOverridesForStaticMembers2, "resolveOverridesForStaticMembers(...)");
            arrayList.addAll(collectionResolveOverridesForStaticMembers2);
        }
        if (this.f51954m.isEnum() && name.equals(StandardNames.ENUM_ENTRIES)) {
            CollectionsKt.addIfNotNull(arrayList, DescriptorFactory.createEnumEntriesProperty(javaClassDescriptor));
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: f */
    public final Set mo18201f(DescriptorKindFilter kindFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        Set setM19326F0 = AbstractC17680n.m19326F0(((DeclaredMemberIndex) this.f51937d.invoke()).getFieldNames());
        C10092f c10092f = C10092f.f29880q0;
        JavaClassDescriptor javaClassDescriptor = this.f51955n;
        DFS.dfs(AbstractC9393x3.m9974d(javaClassDescriptor), C10099m.f29897Y, new LazyJavaStaticClassScope$flatMapJavaStaticSupertypesScopes$2(javaClassDescriptor, setM19326F0, c10092f));
        if (this.f51954m.isEnum()) {
            setM19326F0.add(StandardNames.ENUM_ENTRIES);
        }
        return setM19326F0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassifierDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.f51955n;
    }
}
