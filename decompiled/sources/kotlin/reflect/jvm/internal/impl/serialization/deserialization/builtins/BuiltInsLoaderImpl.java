package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProviderImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1436k;
import p571X9.AbstractC9306j0;
import p870le.C16863U;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class BuiltInsLoaderImpl implements BuiltInsLoader {

    /* JADX INFO: renamed from: a */
    public final BuiltInsResourceLoader f53061a = new BuiltInsResourceLoader();

    public final PackageFragmentProvider createBuiltInPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor module, Set<FqName> packageFqNames, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z6, InterfaceC1436k loadResource) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(packageFqNames, "packageFqNames");
        AbstractC16544l.m18094g(classDescriptorFactories, "classDescriptorFactories");
        AbstractC16544l.m18094g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC16544l.m18094g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC16544l.m18094g(loadResource, "loadResource");
        Set<FqName> set = packageFqNames;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(set, 10));
        for (FqName fqName : set) {
            String builtInsFilePath = BuiltInSerializerProtocol.INSTANCE.getBuiltInsFilePath(fqName);
            InputStream inputStream = (InputStream) loadResource.invoke(builtInsFilePath);
            if (inputStream == null) {
                throw new IllegalStateException(AbstractC9306j0.m9889h("Resource not found in classpath: ", builtInsFilePath));
            }
            arrayList.add(BuiltInsPackageFragmentImpl.Companion.create(fqName, storageManager, module, inputStream, z6));
        }
        PackageFragmentProviderImpl packageFragmentProviderImpl = new PackageFragmentProviderImpl(arrayList);
        NotFoundClasses notFoundClasses = new NotFoundClasses(storageManager, module);
        DeserializationConfiguration.Default r6 = DeserializationConfiguration.Default.INSTANCE;
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(packageFragmentProviderImpl);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(module, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r10 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        AbstractC16544l.m18093f(DO_NOTHING, "DO_NOTHING");
        DeserializationComponents deserializationComponents = new DeserializationComponents(storageManager, module, r6, deserializedClassDataFinder, annotationAndConstantLoaderImpl, packageFragmentProviderImpl, r10, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, classDescriptorFactories, notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), null, new SamConversionResolverImpl(storageManager, C17689w.f56480Y), null, null, 851968, null);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((BuiltInsPackageFragmentImpl) it.next()).initialize(deserializationComponents);
        }
        return packageFragmentProviderImpl;
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader
    public PackageFragmentProvider createPackageFragmentProvider(StorageManager storageManager, ModuleDescriptor builtInsModule, Iterable<? extends ClassDescriptorFactory> classDescriptorFactories, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, AdditionalClassPartsProvider additionalClassPartsProvider, boolean z6) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(builtInsModule, "builtInsModule");
        AbstractC16544l.m18094g(classDescriptorFactories, "classDescriptorFactories");
        AbstractC16544l.m18094g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC16544l.m18094g(additionalClassPartsProvider, "additionalClassPartsProvider");
        return createBuiltInPackageFragmentProvider(storageManager, builtInsModule, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z6, new C16863U(1, this.f53061a, BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0, 5));
    }
}
