package p436Rm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SubpackagesScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ChainedMemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;

/* JADX INFO: renamed from: Rm.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C6942h implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22230Y;

    /* JADX INFO: renamed from: Z */
    public final LazyPackageViewDescriptorImpl f22231Z;

    public /* synthetic */ C6942h(LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl, int i10) {
        this.f22230Y = i10;
        this.f22231Z = lazyPackageViewDescriptorImpl;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        LazyPackageViewDescriptorImpl lazyPackageViewDescriptorImpl = this.f22231Z;
        switch (this.f22230Y) {
            case 0:
                InterfaceC3776x[] interfaceC3776xArr = LazyPackageViewDescriptorImpl.f51554t0;
                return PackageFragmentProviderKt.packageFragments(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName());
            case 1:
                InterfaceC3776x[] interfaceC3776xArr2 = LazyPackageViewDescriptorImpl.f51554t0;
                return Boolean.valueOf(PackageFragmentProviderKt.isEmpty(lazyPackageViewDescriptorImpl.getModule().getPackageFragmentProvider(), lazyPackageViewDescriptorImpl.getFqName()));
            default:
                InterfaceC3776x[] interfaceC3776xArr3 = LazyPackageViewDescriptorImpl.f51554t0;
                if (lazyPackageViewDescriptorImpl.isEmpty()) {
                    return MemberScope.Empty.INSTANCE;
                }
                List<PackageFragmentDescriptor> fragments = lazyPackageViewDescriptorImpl.getFragments();
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(fragments, 10));
                Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    arrayList.add(((PackageFragmentDescriptor) it.next()).getMemberScope());
                }
                ArrayList arrayListM19362l0 = AbstractC17680n.m19362l0(arrayList, new SubpackagesScope(lazyPackageViewDescriptorImpl.getModule(), lazyPackageViewDescriptorImpl.getFqName()));
                return ChainedMemberScope.Companion.create("package view scope for " + lazyPackageViewDescriptorImpl.getFqName() + " in " + lazyPackageViewDescriptorImpl.getModule().getName(), arrayListM19362l0);
        }
    }
}
