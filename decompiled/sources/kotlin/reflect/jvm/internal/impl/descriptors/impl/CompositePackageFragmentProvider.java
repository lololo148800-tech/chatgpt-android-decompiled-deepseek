package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.InterfaceC17300c;
import p049Bm.InterfaceC1436k;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class CompositePackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    public final List f51492a;

    /* JADX INFO: renamed from: b */
    public final String f51493b;

    public CompositePackageFragmentProvider(List<? extends PackageFragmentProvider> providers, String debugName) {
        AbstractC16544l.m18094g(providers, "providers");
        AbstractC16544l.m18094g(debugName, "debugName");
        this.f51492a = providers;
        this.f51493b = debugName;
        providers.size();
        AbstractC17680n.m19328G0(providers).size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        Iterator it = this.f51492a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible((PackageFragmentProvider) it.next(), fqName, packageFragments);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC17300c
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f51492a.iterator();
        while (it.hasNext()) {
            PackageFragmentProviderKt.collectPackageFragmentsOptimizedIfPossible((PackageFragmentProvider) it.next(), fqName, arrayList);
        }
        return AbstractC17680n.m19322C0(arrayList);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator it = this.f51492a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((PackageFragmentProvider) it.next()).getSubPackagesOf(fqName, nameFilter));
        }
        return hashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        List list = this.f51492a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!PackageFragmentProviderKt.isEmpty((PackageFragmentProvider) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        return this.f51493b;
    }
}
