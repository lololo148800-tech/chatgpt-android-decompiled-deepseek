package p605Ym;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindExclude;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ym.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C10096j implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f29889Y;

    /* JADX INFO: renamed from: Z */
    public final LazyJavaScope f29890Z;

    public /* synthetic */ C10096j(LazyJavaScope lazyJavaScope, int i10) {
        this.f29889Y = i10;
        this.f29890Z = lazyJavaScope;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyJavaScope lazyJavaScope = this.f29890Z;
        switch (this.f29889Y) {
            case 0:
                InterfaceC3776x[] interfaceC3776xArr = LazyJavaScope.f51933l;
                DescriptorKindFilter kindFilter = DescriptorKindFilter.ALL;
                InterfaceC1436k nameFilter = MemberScope.Companion.getALL_NAME_FILTER();
                lazyJavaScope.getClass();
                AbstractC16544l.m18094g(kindFilter, "kindFilter");
                AbstractC16544l.m18094g(nameFilter, "nameFilter");
                NoLookupLocation noLookupLocation = NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getCLASSIFIERS_MASK())) {
                    for (Name name : lazyJavaScope.mo18197a(kindFilter, nameFilter)) {
                        if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                            CollectionsKt.addIfNotNull(linkedHashSet, lazyJavaScope.mo22590getContributedClassifier(name, noLookupLocation));
                        }
                    }
                }
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getFUNCTIONS_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                    for (Name name2 : lazyJavaScope.computeFunctionNames(kindFilter, nameFilter)) {
                        if (((Boolean) nameFilter.invoke(name2)).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope.getContributedFunctions(name2, noLookupLocation));
                        }
                    }
                }
                if (kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getVARIABLES_MASK()) && !kindFilter.getExcludes().contains(DescriptorKindExclude.NonExtensions.INSTANCE)) {
                    for (Name name3 : lazyJavaScope.mo18201f(kindFilter)) {
                        if (((Boolean) nameFilter.invoke(name3)).booleanValue()) {
                            linkedHashSet.addAll(lazyJavaScope.getContributedVariables(name3, noLookupLocation));
                        }
                    }
                }
                return AbstractC17680n.m19322C0(linkedHashSet);
            case 1:
                InterfaceC3776x[] interfaceC3776xArr2 = LazyJavaScope.f51933l;
                return lazyJavaScope.computeMemberIndex();
            case 2:
                InterfaceC3776x[] interfaceC3776xArr3 = LazyJavaScope.f51933l;
                return lazyJavaScope.computeFunctionNames(DescriptorKindFilter.FUNCTIONS, null);
            case 3:
                InterfaceC3776x[] interfaceC3776xArr4 = LazyJavaScope.f51933l;
                return lazyJavaScope.mo18201f(DescriptorKindFilter.VARIABLES);
            default:
                InterfaceC3776x[] interfaceC3776xArr5 = LazyJavaScope.f51933l;
                return lazyJavaScope.mo18197a(DescriptorKindFilter.CLASSIFIERS, null);
        }
    }
}
