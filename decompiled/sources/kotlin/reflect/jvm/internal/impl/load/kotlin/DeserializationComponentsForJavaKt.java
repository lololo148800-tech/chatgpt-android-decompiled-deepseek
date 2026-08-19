package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverSettings;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ModuleClassResolver;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.JavaTypeEnhancement;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolverImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.extensions.TypeAttributeTranslators;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponentsForJavaKt {
    public static final DeserializationComponentsForJava makeDeserializationComponentsForJava(ModuleDescriptor module, StorageManager storageManager, NotFoundClasses notFoundClasses, LazyJavaPackageFragmentProvider lazyJavaPackageFragmentProvider, KotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JvmMetadataVersion jvmMetadataVersion) {
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(lazyJavaPackageFragmentProvider, "lazyJavaPackageFragmentProvider");
        AbstractC16544l.m18094g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC16544l.m18094g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC16544l.m18094g(errorReporter, "errorReporter");
        AbstractC16544l.m18094g(jvmMetadataVersion, "jvmMetadataVersion");
        return new DeserializationComponentsForJava(storageManager, module, DeserializationConfiguration.Default.INSTANCE, new JavaClassDataFinder(reflectKotlinClassFinder, deserializedDescriptorResolver), BinaryClassAnnotationAndConstantLoaderImplKt.createBinaryClassAnnotationAndConstantLoader(module, notFoundClasses, storageManager, reflectKotlinClassFinder, jvmMetadataVersion), lazyJavaPackageFragmentProvider, notFoundClasses, errorReporter, LookupTracker.DO_NOTHING.INSTANCE, ContractDeserializer.Companion.getDEFAULT(), NewKotlinTypeChecker.Companion.getDefault(), new TypeAttributeTranslators(AbstractC9393x3.m9974d(DefaultTypeAttributeTranslator.INSTANCE)));
    }

    public static final LazyJavaPackageFragmentProvider makeLazyJavaPackageFragmentProvider(JavaClassFinder javaClassFinder, ModuleDescriptor module, StorageManager storageManager, NotFoundClasses notFoundClasses, KotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, ErrorReporter errorReporter, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver singleModuleClassResolver, PackagePartProvider packagePartProvider) {
        AbstractC16544l.m18094g(javaClassFinder, "javaClassFinder");
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(reflectKotlinClassFinder, "reflectKotlinClassFinder");
        AbstractC16544l.m18094g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC16544l.m18094g(errorReporter, "errorReporter");
        AbstractC16544l.m18094g(javaSourceElementFactory, "javaSourceElementFactory");
        AbstractC16544l.m18094g(singleModuleClassResolver, "singleModuleClassResolver");
        AbstractC16544l.m18094g(packagePartProvider, "packagePartProvider");
        SignaturePropagator DO_NOTHING = SignaturePropagator.DO_NOTHING;
        AbstractC16544l.m18093f(DO_NOTHING, "DO_NOTHING");
        JavaResolverCache EMPTY = JavaResolverCache.EMPTY;
        AbstractC16544l.m18093f(EMPTY, "EMPTY");
        JavaPropertyInitializerEvaluator.DoNothing doNothing = JavaPropertyInitializerEvaluator.DoNothing.INSTANCE;
        SamConversionResolverImpl samConversionResolverImpl = new SamConversionResolverImpl(storageManager, C17689w.f56480Y);
        SupertypeLoopChecker.EMPTY empty = SupertypeLoopChecker.EMPTY.INSTANCE;
        LookupTracker.DO_NOTHING do_nothing = LookupTracker.DO_NOTHING.INSTANCE;
        ReflectionTypes reflectionTypes = new ReflectionTypes(module, notFoundClasses);
        JavaTypeEnhancementState.Companion companion = JavaTypeEnhancementState.Companion;
        AnnotationTypeQualifierResolver annotationTypeQualifierResolver = new AnnotationTypeQualifierResolver(companion.getDEFAULT());
        JavaResolverSettings.Default r15 = JavaResolverSettings.Default.INSTANCE;
        return new LazyJavaPackageFragmentProvider(new JavaResolverComponents(storageManager, javaClassFinder, reflectKotlinClassFinder, deserializedDescriptorResolver, DO_NOTHING, errorReporter, EMPTY, doNothing, samConversionResolverImpl, javaSourceElementFactory, singleModuleClassResolver, packagePartProvider, empty, do_nothing, module, reflectionTypes, annotationTypeQualifierResolver, new SignatureEnhancement(new JavaTypeEnhancement(r15)), JavaClassesTracker.Default.INSTANCE, r15, NewKotlinTypeChecker.Companion.getDefault(), companion.getDEFAULT(), new C16571x79782ac1(), null, 8388608, null));
    }
}
