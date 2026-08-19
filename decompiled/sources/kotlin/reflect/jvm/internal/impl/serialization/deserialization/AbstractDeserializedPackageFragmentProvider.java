package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
import mm.InterfaceC17300c;
import p049Bm.InterfaceC1436k;
import p077Cn.C1756x;
import p909nm.AbstractC17681o;
import p909nm.C17691y;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements PackageFragmentProviderOptimized {

    /* JADX INFO: renamed from: a */
    public final StorageManager f52976a;

    /* JADX INFO: renamed from: b */
    public final KotlinMetadataFinder f52977b;

    /* JADX INFO: renamed from: c */
    public final ModuleDescriptor f52978c;

    /* JADX INFO: renamed from: d */
    public DeserializationComponents f52979d;

    /* JADX INFO: renamed from: e */
    public final MemoizedFunctionToNullable f52980e;

    public AbstractDeserializedPackageFragmentProvider(StorageManager storageManager, KotlinMetadataFinder finder, ModuleDescriptor moduleDescriptor) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(finder, "finder");
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        this.f52976a = storageManager;
        this.f52977b = finder;
        this.f52978c = moduleDescriptor;
        this.f52980e = storageManager.createMemoizedFunctionWithNullableValues(new C1756x(this, 23));
    }

    /* JADX INFO: renamed from: a */
    public abstract BuiltInsPackageFragmentImpl mo18123a(FqName fqName);

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public void collectPackageFragments(FqName fqName, Collection<PackageFragmentDescriptor> packageFragments) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(packageFragments, "packageFragments");
        CollectionsKt.addIfNotNull(packageFragments, this.f52980e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    @InterfaceC17300c
    public List<PackageFragmentDescriptor> getPackageFragments(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return AbstractC17681o.m19383l(this.f52980e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider
    public Collection<FqName> getSubPackagesOf(FqName fqName, InterfaceC1436k nameFilter) {
        AbstractC16544l.m18094g(fqName, "fqName");
        AbstractC16544l.m18094g(nameFilter, "nameFilter");
        return C17691y.f56482Y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderOptimized
    public boolean isEmpty(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        MemoizedFunctionToNullable memoizedFunctionToNullable = this.f52980e;
        return (memoizedFunctionToNullable.isComputed(fqName) ? (PackageFragmentDescriptor) memoizedFunctionToNullable.invoke(fqName) : mo18123a(fqName)) == null;
    }
}
