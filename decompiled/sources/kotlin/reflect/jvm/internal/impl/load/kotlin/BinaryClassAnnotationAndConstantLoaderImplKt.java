package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryClassAnnotationAndConstantLoaderImplKt {
    public static final BinaryClassAnnotationAndConstantLoaderImpl createBinaryClassAnnotationAndConstantLoader(ModuleDescriptor module, NotFoundClasses notFoundClasses, StorageManager storageManager, KotlinClassFinder kotlinClassFinder, JvmMetadataVersion jvmMetadataVersion) {
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        BinaryClassAnnotationAndConstantLoaderImpl binaryClassAnnotationAndConstantLoaderImpl = new BinaryClassAnnotationAndConstantLoaderImpl(module, notFoundClasses, storageManager, kotlinClassFinder);
        binaryClassAnnotationAndConstantLoaderImpl.setJvmMetadataVersion(jvmMetadataVersion);
        return binaryClassAnnotationAndConstantLoaderImpl;
    }
}
