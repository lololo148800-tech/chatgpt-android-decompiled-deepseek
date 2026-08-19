package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleCapability;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public interface PackageViewDescriptorFactory {
    public static final Companion Companion = Companion.f51589a;

    public static final class Companion {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ Companion f51589a = new Companion();

        /* JADX INFO: renamed from: b */
        public static final ModuleCapability f51590b = new ModuleCapability("PackageViewDescriptorFactory");

        public final ModuleCapability<PackageViewDescriptorFactory> getCAPABILITY() {
            return f51590b;
        }
    }

    public static final class Default implements PackageViewDescriptorFactory {
        public static final Default INSTANCE = new Default();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.PackageViewDescriptorFactory
        public PackageViewDescriptor compute(ModuleDescriptorImpl module, FqName fqName, StorageManager storageManager) {
            AbstractC16544l.m18094g(module, "module");
            AbstractC16544l.m18094g(fqName, "fqName");
            AbstractC16544l.m18094g(storageManager, "storageManager");
            return new LazyPackageViewDescriptorImpl(module, fqName, storageManager);
        }
    }

    PackageViewDescriptor compute(ModuleDescriptorImpl moduleDescriptorImpl, FqName fqName, StorageManager storageManager);
}
