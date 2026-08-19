package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaResolverComponents {

    /* JADX INFO: renamed from: a */
    public final StorageManager f51833a;

    /* JADX INFO: renamed from: b */
    public final JavaClassFinder f51834b;

    /* JADX INFO: renamed from: c */
    public final KotlinClassFinder f51835c;

    /* JADX INFO: renamed from: d */
    public final DeserializedDescriptorResolver f51836d;

    /* JADX INFO: renamed from: e */
    public final SignaturePropagator f51837e;

    /* JADX INFO: renamed from: f */
    public final ErrorReporter f51838f;

    /* JADX INFO: renamed from: g */
    public final JavaResolverCache f51839g;

    /* JADX INFO: renamed from: h */
    public final JavaPropertyInitializerEvaluator f51840h;

    /* JADX INFO: renamed from: i */
    public final SamConversionResolver f51841i;

    /* JADX INFO: renamed from: j */
    public final JavaSourceElementFactory f51842j;

    /* JADX INFO: renamed from: k */
    public final ModuleClassResolver f51843k;

    /* JADX INFO: renamed from: l */
    public final PackagePartProvider f51844l;

    /* JADX INFO: renamed from: m */
    public final SupertypeLoopChecker f51845m;

    /* JADX INFO: renamed from: n */
    public final LookupTracker f51846n;

    /* JADX INFO: renamed from: o */
    public final ModuleDescriptor f51847o;

    /* JADX INFO: renamed from: p */
    public final ReflectionTypes f51848p;

    /* JADX INFO: renamed from: q */
    public final AnnotationTypeQualifierResolver f51849q;

    /* JADX INFO: renamed from: r */
    public final SignatureEnhancement f51850r;

    /* JADX INFO: renamed from: s */
    public final JavaClassesTracker f51851s;

    /* JADX INFO: renamed from: t */
    public final JavaResolverSettings f51852t;

    /* JADX INFO: renamed from: u */
    public final NewKotlinTypeChecker f51853u;

    /* JADX INFO: renamed from: v */
    public final JavaTypeEnhancementState f51854v;

    /* JADX INFO: renamed from: w */
    public final JavaModuleAnnotationsProvider f51855w;

    /* JADX INFO: renamed from: x */
    public final SyntheticJavaPartsProvider f51856x;

    public JavaResolverComponents(StorageManager storageManager, JavaClassFinder finder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory sourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor module, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings settings, NewKotlinTypeChecker kotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleResolver, SyntheticJavaPartsProvider syntheticPartsProvider) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(finder, "finder");
        AbstractC16544l.m18094g(kotlinClassFinder, "kotlinClassFinder");
        AbstractC16544l.m18094g(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        AbstractC16544l.m18094g(signaturePropagator, "signaturePropagator");
        AbstractC16544l.m18094g(errorReporter, "errorReporter");
        AbstractC16544l.m18094g(javaResolverCache, "javaResolverCache");
        AbstractC16544l.m18094g(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        AbstractC16544l.m18094g(samConversionResolver, "samConversionResolver");
        AbstractC16544l.m18094g(sourceElementFactory, "sourceElementFactory");
        AbstractC16544l.m18094g(moduleClassResolver, "moduleClassResolver");
        AbstractC16544l.m18094g(packagePartProvider, "packagePartProvider");
        AbstractC16544l.m18094g(supertypeLoopChecker, "supertypeLoopChecker");
        AbstractC16544l.m18094g(lookupTracker, "lookupTracker");
        AbstractC16544l.m18094g(module, "module");
        AbstractC16544l.m18094g(reflectionTypes, "reflectionTypes");
        AbstractC16544l.m18094g(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        AbstractC16544l.m18094g(signatureEnhancement, "signatureEnhancement");
        AbstractC16544l.m18094g(javaClassesTracker, "javaClassesTracker");
        AbstractC16544l.m18094g(settings, "settings");
        AbstractC16544l.m18094g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC16544l.m18094g(javaTypeEnhancementState, "javaTypeEnhancementState");
        AbstractC16544l.m18094g(javaModuleResolver, "javaModuleResolver");
        AbstractC16544l.m18094g(syntheticPartsProvider, "syntheticPartsProvider");
        this.f51833a = storageManager;
        this.f51834b = finder;
        this.f51835c = kotlinClassFinder;
        this.f51836d = deserializedDescriptorResolver;
        this.f51837e = signaturePropagator;
        this.f51838f = errorReporter;
        this.f51839g = javaResolverCache;
        this.f51840h = javaPropertyInitializerEvaluator;
        this.f51841i = samConversionResolver;
        this.f51842j = sourceElementFactory;
        this.f51843k = moduleClassResolver;
        this.f51844l = packagePartProvider;
        this.f51845m = supertypeLoopChecker;
        this.f51846n = lookupTracker;
        this.f51847o = module;
        this.f51848p = reflectionTypes;
        this.f51849q = annotationTypeQualifierResolver;
        this.f51850r = signatureEnhancement;
        this.f51851s = javaClassesTracker;
        this.f51852t = settings;
        this.f51853u = kotlinTypeChecker;
        this.f51854v = javaTypeEnhancementState;
        this.f51855w = javaModuleResolver;
        this.f51856x = syntheticPartsProvider;
    }

    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f51849q;
    }

    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.f51836d;
    }

    public final ErrorReporter getErrorReporter() {
        return this.f51838f;
    }

    public final JavaClassFinder getFinder() {
        return this.f51834b;
    }

    public final JavaClassesTracker getJavaClassesTracker() {
        return this.f51851s;
    }

    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.f51855w;
    }

    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.f51840h;
    }

    public final JavaResolverCache getJavaResolverCache() {
        return this.f51839g;
    }

    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.f51854v;
    }

    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f51835c;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f51853u;
    }

    public final LookupTracker getLookupTracker() {
        return this.f51846n;
    }

    public final ModuleDescriptor getModule() {
        return this.f51847o;
    }

    public final ModuleClassResolver getModuleClassResolver() {
        return this.f51843k;
    }

    public final PackagePartProvider getPackagePartProvider() {
        return this.f51844l;
    }

    public final ReflectionTypes getReflectionTypes() {
        return this.f51848p;
    }

    public final JavaResolverSettings getSettings() {
        return this.f51852t;
    }

    public final SignatureEnhancement getSignatureEnhancement() {
        return this.f51850r;
    }

    public final SignaturePropagator getSignaturePropagator() {
        return this.f51837e;
    }

    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.f51842j;
    }

    public final StorageManager getStorageManager() {
        return this.f51833a;
    }

    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.f51845m;
    }

    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.f51856x;
    }

    public final JavaResolverComponents replace(JavaResolverCache javaResolverCache) {
        AbstractC16544l.m18094g(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f51833a, this.f51834b, this.f51835c, this.f51836d, this.f51837e, this.f51838f, javaResolverCache, this.f51840h, this.f51841i, this.f51842j, this.f51843k, this.f51844l, this.f51845m, this.f51846n, this.f51847o, this.f51848p, this.f51849q, this.f51850r, this.f51851s, this.f51852t, this.f51853u, this.f51854v, this.f51855w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i10 & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }
}
