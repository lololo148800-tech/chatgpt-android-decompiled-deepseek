package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.InterfaceC17300c;
import p049Bm.InterfaceC1436k;
import p1091wn.AbstractC21031l;
import p388Pm.C6510d;
import p388Pm.C6514h;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderImpl implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    public final Collection f51412a;

    public PackageFragmentProviderImpl(Collection<? extends PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        this.f51412a = packageFragments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        for (Object obj : this.f51412a) {
            if (AbstractC16544l.m18089b(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                packageFragments.add(obj);
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC17300c
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        Collection collection = this.f51412a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (AbstractC16544l.m18089b(((PackageFragmentDescriptor) obj).getFqName(), fqName)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return AbstractC21031l.m21499w(AbstractC21031l.m21487k(AbstractC21031l.m21495s(AbstractC17680n.m19329H(this.f51412a), C6510d.f21113o0), new C6514h(fqName, 0)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        Collection collection = this.f51412a;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC16544l.m18089b(((PackageFragmentDescriptor) it.next()).getFqName(), fqName)) {
                return false;
            }
        }
        return true;
    }
}
