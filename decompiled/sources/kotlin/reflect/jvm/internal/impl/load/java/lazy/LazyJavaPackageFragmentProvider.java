package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder$$Util;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import mm.C17303f;
import mm.InterfaceC17300c;
import p049Bm.InterfaceC1436k;
import p298Lm.C5150L;
import p379Pb.LVf.efyhmdM;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class LazyJavaPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51862a;

    /* JADX INFO: renamed from: b */
    public final CacheWithNotNullValues f51863b;

    public LazyJavaPackageFragmentProvider(JavaResolverComponents components) {
        AbstractC16544l.m18094g(components, "components");
        LazyJavaResolverContext lazyJavaResolverContext = new LazyJavaResolverContext(components, TypeParameterResolver.EMPTY.INSTANCE, new C17303f());
        this.f51862a = lazyJavaResolverContext;
        this.f51863b = lazyJavaResolverContext.getStorageManager().createCacheWithNotNullValues();
    }

    /* JADX INFO: renamed from: a */
    public final LazyJavaPackageFragment m18185a(FqName fqName) {
        JavaPackage javaPackageFindPackage$default = JavaClassFinder$$Util.findPackage$default(this.f51862a.getComponents().getFinder(), fqName, false, 2, null);
        if (javaPackageFindPackage$default == null) {
            return null;
        }
        return (LazyJavaPackageFragment) this.f51863b.computeIfAbsent(fqName, new C5150L(this, 13, javaPackageFindPackage$default));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, m18185a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC17300c
    public List<LazyJavaPackageFragment> getPackageFragments(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return AbstractC17681o.m19383l(m18185a(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return JavaClassFinder$$Util.findPackage$default(this.f51862a.getComponents().getFinder(), fqName, false, 2, null) == null;
    }

    public String toString() {
        return "LazyJavaPackageFragmentProvider of module " + this.f51862a.getComponents().getModule();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public List<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(fqName, efyhmdM.cMXNWITdeLnL);
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        LazyJavaPackageFragment lazyJavaPackageFragmentM18185a = m18185a(fqName);
        List<FqName> subPackageFqNames$descriptors_jvm = lazyJavaPackageFragmentM18185a != null ? lazyJavaPackageFragmentM18185a.getSubPackageFqNames$descriptors_jvm() : null;
        return subPackageFqNames$descriptors_jvm == null ? C17689w.f56480Y : subPackageFqNames$descriptors_jvm;
    }
}
