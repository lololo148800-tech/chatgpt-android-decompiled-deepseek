package kotlin.reflect.jvm.internal.impl.load.kotlin;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.CompositePackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.SingleModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JavaDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import p174Gk.uSfJ.HpucjswO;
import p909nm.AbstractC17681o;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponentsForJava {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final DeserializationComponents f52049a;

    public static final class Companion {

        public static final class ModuleData {

            /* JADX INFO: renamed from: a */
            public final DeserializationComponentsForJava f52050a;

            /* JADX INFO: renamed from: b */
            public final DeserializedDescriptorResolver f52051b;

            public ModuleData(DeserializationComponentsForJava deserializationComponentsForJava, DeserializedDescriptorResolver deserializedDescriptorResolver) {
                AbstractC16544l.m18094g(deserializationComponentsForJava, "deserializationComponentsForJava");
                AbstractC16544l.m18094g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
                this.f52050a = deserializationComponentsForJava;
                this.f52051b = deserializedDescriptorResolver;
            }

            public final DeserializationComponentsForJava getDeserializationComponentsForJava() {
                return this.f52050a;
            }

            public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
                return this.f52051b;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final ModuleData createModuleData(KotlinClassFinder kotlinClassFinder, KotlinClassFinder jvmBuiltInsKotlinClassFinder, JavaClassFinder javaClassFinder, String moduleName, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory) {
            AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
            AbstractC16544l.m18094g(jvmBuiltInsKotlinClassFinder, "jvmBuiltInsKotlinClassFinder");
            AbstractC16544l.m18094g(javaClassFinder, HpucjswO.LsEzjEPWRiG);
            AbstractC16544l.m18094g(moduleName, "moduleName");
            AbstractC16544l.m18094g(errorReporter, "errorReporter");
            AbstractC16544l.m18094g(javaSourceElementFactory, "javaSourceElementFactory");
            LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("DeserializationComponentsForJava.ModuleData");
            JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(lockBasedStorageManager, JvmBuiltIns.Kind.FROM_DEPENDENCIES);
            Name nameSpecial = Name.special(Separators.LESS_THAN + moduleName + '>');
            AbstractC16544l.m18093f(nameSpecial, "special(...)");
            ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(nameSpecial, lockBasedStorageManager, jvmBuiltIns, null, null, null, 56, null);
            jvmBuiltIns.setBuiltInsModule(moduleDescriptorImpl);
            jvmBuiltIns.initialize(moduleDescriptorImpl, true);
            DeserializedDescriptorResolver deserializedDescriptorResolver = new DeserializedDescriptorResolver();
            SingleModuleClassResolver singleModuleClassResolver = new SingleModuleClassResolver();
            NotFoundClasses notFoundClasses = new NotFoundClasses(lockBasedStorageManager, moduleDescriptorImpl);
            LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider = DeserializationComponentsForJavaKt.makeLazyJavaPackageFragmentProvider(javaClassFinder, moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, javaSourceElementFactory, singleModuleClassResolver, (512 & 512) != 0 ? PackagePartProvider.Empty.INSTANCE : null);
            DeserializationComponentsForJava deserializationComponentsForJavaMakeDeserializationComponentsForJava = DeserializationComponentsForJavaKt.makeDeserializationComponentsForJava(moduleDescriptorImpl, lockBasedStorageManager, notFoundClasses, lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider, kotlinClassFinder, deserializedDescriptorResolver, errorReporter, JvmMetadataVersion.INSTANCE);
            deserializedDescriptorResolver.setComponents(deserializationComponentsForJavaMakeDeserializationComponentsForJava);
            JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
            AbstractC16544l.m18093f(EMPTY, "EMPTY");
            JavaDescriptorResolver javaDescriptorResolver = new JavaDescriptorResolver(lazyJavaPackageFragmentProviderMakeLazyJavaPackageFragmentProvider, EMPTY);
            singleModuleClassResolver.setResolver(javaDescriptorResolver);
            JvmBuiltInsPackageFragmentProvider jvmBuiltInsPackageFragmentProvider = new JvmBuiltInsPackageFragmentProvider(lockBasedStorageManager, jvmBuiltInsKotlinClassFinder, moduleDescriptorImpl, notFoundClasses, jvmBuiltIns.getCustomizer(), jvmBuiltIns.getCustomizer(), DeserializationConfiguration.Default.INSTANCE, NewKotlinTypeChecker.Companion.getDefault(), new SamConversionResolverImpl(lockBasedStorageManager, C17689w.f56480Y));
            moduleDescriptorImpl.setDependencies(moduleDescriptorImpl);
            moduleDescriptorImpl.initialize(new CompositePackageFragmentProvider(AbstractC17681o.m19382k(javaDescriptorResolver.getPackageFragmentProvider(), jvmBuiltInsPackageFragmentProvider), "CompositeProvider@RuntimeModuleData for " + moduleDescriptorImpl));
            return new ModuleData(deserializationComponentsForJavaMakeDeserializationComponentsForJava, deserializedDescriptorResolver);
        }
    }

    public DeserializationComponentsForJava(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, JavaClassDataFinder classDataFinder, BinaryClassAnnotationAndConstantLoaderImpl annotationAndConstantLoader, LazyJavaPackageFragmentProvider packageFragmentProvider, NotFoundClasses notFoundClasses, ErrorReporter errorReporter, LookupTracker lookupTracker, ContractDeserializer contractDeserializer, NewKotlinTypeChecker kotlinTypeChecker, TypeAttributeTranslators typeAttributeTranslators) {
        PlatformDependentDeclarationFilter customizer;
        AdditionalClassPartsProvider customizer2;
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(configuration, "configuration");
        AbstractC16544l.m18094g(classDataFinder, "classDataFinder");
        AbstractC16544l.m18094g(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC16544l.m18094g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(errorReporter, "errorReporter");
        AbstractC16544l.m18094g(lookupTracker, "lookupTracker");
        AbstractC16544l.m18094g(contractDeserializer, "contractDeserializer");
        AbstractC16544l.m18094g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC16544l.m18094g(typeAttributeTranslators, "typeAttributeTranslators");
        KotlinBuiltIns builtIns = moduleDescriptor.getBuiltIns();
        JvmBuiltIns jvmBuiltIns = builtIns instanceof JvmBuiltIns ? (JvmBuiltIns) builtIns : null;
        LocalClassifierTypeSettings.Default r10 = LocalClassifierTypeSettings.Default.INSTANCE;
        JavaFlexibleTypeDeserializer javaFlexibleTypeDeserializer = JavaFlexibleTypeDeserializer.INSTANCE;
        C17689w c17689w = C17689w.f56480Y;
        this.f52049a = new DeserializationComponents(storageManager, moduleDescriptor, configuration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, r10, errorReporter, lookupTracker, javaFlexibleTypeDeserializer, c17689w, notFoundClasses, contractDeserializer, (jvmBuiltIns == null || (customizer2 = jvmBuiltIns.getCustomizer()) == null) ? AdditionalClassPartsProvider.None.INSTANCE : customizer2, (jvmBuiltIns == null || (customizer = jvmBuiltIns.getCustomizer()) == null) ? PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE : customizer, JvmProtoBufUtil.INSTANCE.getEXTENSION_REGISTRY(), kotlinTypeChecker, new SamConversionResolverImpl(storageManager, c17689w), typeAttributeTranslators.getTranslators(), JvmEnumEntriesDeserializationSupport.INSTANCE);
    }

    public final DeserializationComponents getComponents() {
        return this.f52049a;
    }
}
