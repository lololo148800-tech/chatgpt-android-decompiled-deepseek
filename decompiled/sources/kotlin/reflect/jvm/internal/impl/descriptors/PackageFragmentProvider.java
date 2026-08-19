package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.InterfaceC17300c;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageFragmentProvider {
    @InterfaceC17300c
    List<PackageFragmentDescriptor> getPackageFragments(FqName fqName);

    Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k interfaceC1436k);
}
