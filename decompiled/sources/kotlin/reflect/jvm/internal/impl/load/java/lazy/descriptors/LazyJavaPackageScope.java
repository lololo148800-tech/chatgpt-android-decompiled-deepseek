package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.DescriptorKindFilter;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import p007A5.C0372g;
import p049Bm.InterfaceC1436k;
import p298Lm.C5150L;
import p605Ym.C10095i;
import p909nm.C17689w;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageScope extends LazyJavaStaticScope {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ int f51927q = 0;

    /* JADX INFO: renamed from: m */
    public final JavaPackage f51928m;

    /* JADX INFO: renamed from: n */
    public final LazyJavaPackageFragment f51929n;

    /* JADX INFO: renamed from: o */
    public final NullableLazyValue f51930o;

    /* JADX INFO: renamed from: p */
    public final MemoizedFunctionToNullable f51931p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope(LazyJavaResolverContext c9, JavaPackage jPackage, LazyJavaPackageFragment ownerDescriptor) {
        super(c9);
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(jPackage, "jPackage");
        AbstractC16544l.m18094g(ownerDescriptor, "ownerDescriptor");
        this.f51928m = jPackage;
        this.f51929n = ownerDescriptor;
        this.f51930o = c9.getStorageManager().createNullableLazyValue(new C5150L(c9, 14, this));
        this.f51931p = c9.getStorageManager().createMemoizedFunctionWithNullableValues(new C0372g(this, 3, c9));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: a */
    public final Set mo18197a(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        if (!kindFilter.acceptsKinds(DescriptorKindFilter.Companion.getNON_SINGLETON_CLASSIFIERS_MASK())) {
            return C17691y.f56482Y;
        }
        Set set = (Set) this.f51930o.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(Name.identifier((String) it.next()));
            }
            return hashSet;
        }
        if (interfaceC1436k == null) {
            interfaceC1436k = FunctionsKt.alwaysTrue();
        }
        Collection<JavaClass> classes = this.f51928m.getClasses(interfaceC1436k);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (JavaClass javaClass : classes) {
            Name name = javaClass.getLightClassOriginKind() == LightClassOriginKind.SOURCE ? null : javaClass.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final Set computeFunctionNames(DescriptorKindFilter kindFilter, InterfaceC1436k interfaceC1436k) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public final DeclaredMemberIndex computeMemberIndex() {
        return DeclaredMemberIndex.Empty.INSTANCE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: d */
    public final void mo18199d(LinkedHashSet linkedHashSet, Name name) {
        AbstractC16544l.m18094g(name, "name");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    /* JADX INFO: renamed from: f */
    public final Set mo18201f(DescriptorKindFilter kindFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        return C17691y.f56482Y;
    }

    public final ClassDescriptor findClassifierByJavaClass$descriptors_jvm(JavaClass javaClass) {
        AbstractC16544l.m18094g(javaClass, "javaClass");
        return m18214l(javaClass.getName(), javaClass);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    public Collection<DeclarationDescriptor> getContributedDescriptors(DescriptorKindFilter kindFilter, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(kindFilter, "kindFilter");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        DescriptorKindFilter.Companion companion = DescriptorKindFilter.Companion;
        if (!kindFilter.acceptsKinds(companion.getNON_SINGLETON_CLASSIFIERS_MASK() | companion.getCLASSIFIERS_MASK())) {
            return C17689w.f56480Y;
        }
        Iterable iterable = (Iterable) this.f51936c.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            DeclarationDescriptor declarationDescriptor = (DeclarationDescriptor) obj;
            if (declarationDescriptor instanceof ClassDescriptor) {
                Name name = ((ClassDescriptor) declarationDescriptor).getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                if (((Boolean) nameFilter.invoke(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    public Collection<PropertyDescriptor> getContributedVariables(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return C17689w.f56480Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    public DeclarationDescriptor getOwnerDescriptor() {
        return this.f51929n;
    }

    /* JADX INFO: renamed from: l */
    public final ClassDescriptor m18214l(Name name, JavaClass javaClass) {
        if (!SpecialNames.INSTANCE.isSafeIdentifier(name)) {
            return null;
        }
        Set set = (Set) this.f51930o.invoke();
        if (javaClass == null && set != null && !set.contains(name.asString())) {
            return null;
        }
        return (ClassDescriptor) this.f51931p.invoke(new C10095i(name, javaClass));
    }

    /* JADX INFO: renamed from: m */
    public final JvmMetadataVersion m18215m() {
        return DeserializationHelpersKt.jvmMetadataVersionOrDefault(this.f51934a.getComponents().getDeserializedDescriptorResolver().getComponents().getConfiguration());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScopeImpl, kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope
    /* JADX INFO: renamed from: getContributedClassifier */
    public ClassDescriptor mo22590getContributedClassifier(Name name, LookupLocation location) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(location, "location");
        return m18214l(name, null);
    }
}
