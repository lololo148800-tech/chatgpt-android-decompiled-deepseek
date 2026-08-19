package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageFragmentProviderKt {
    public static final void collectPackageFragmentsOptimizedIfPossible(PackageFragmentProvider packageFragmentProvider, FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(packageFragmentProvider, "<this>");
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        if (packageFragmentProvider instanceof PackageFragmentProviderOptimized) {
            ((PackageFragmentProviderOptimized) packageFragmentProvider).collectPackageFragments(fqName, packageFragments);
        } else {
            packageFragments.addAll(packageFragmentProvider.getPackageFragments(fqName));
        }
    }

    public static final boolean isEmpty(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        AbstractC16544l.m18094g(packageFragmentProvider, "<this>");
        AbstractC16544l.m18094g(fqName, "fqName");
        return packageFragmentProvider instanceof PackageFragmentProviderOptimized ? ((PackageFragmentProviderOptimized) packageFragmentProvider).isEmpty(fqName) : packageFragments(packageFragmentProvider, fqName).isEmpty();
    }

    public static final List<PackageFragmentDescriptor> packageFragments(PackageFragmentProvider packageFragmentProvider, FqName fqName) {
        AbstractC16544l.m18094g(packageFragmentProvider, "<this>");
        AbstractC16544l.m18094g(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        collectPackageFragmentsOptimizedIfPossible(packageFragmentProvider, fqName, arrayList);
        return arrayList;
    }
}
