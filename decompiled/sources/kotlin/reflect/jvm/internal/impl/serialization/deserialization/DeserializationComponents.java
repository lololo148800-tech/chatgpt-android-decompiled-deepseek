package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.ClassDescriptorFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DefaultTypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import p571X9.AbstractC9393x3;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes2.dex */
public final class DeserializationComponents {

    /* JADX INFO: renamed from: a */
    public final StorageManager f52994a;

    /* JADX INFO: renamed from: b */
    public final ModuleDescriptor f52995b;

    /* JADX INFO: renamed from: c */
    public final DeserializationConfiguration f52996c;

    /* JADX INFO: renamed from: d */
    public final ClassDataFinder f52997d;

    /* JADX INFO: renamed from: e */
    public final AnnotationAndConstantLoader f52998e;

    /* JADX INFO: renamed from: f */
    public final PackageFragmentProvider f52999f;

    /* JADX INFO: renamed from: g */
    public final LocalClassifierTypeSettings f53000g;

    /* JADX INFO: renamed from: h */
    public final ErrorReporter f53001h;

    /* JADX INFO: renamed from: i */
    public final LookupTracker f53002i;

    /* JADX INFO: renamed from: j */
    public final FlexibleTypeDeserializer f53003j;

    /* JADX INFO: renamed from: k */
    public final Iterable f53004k;

    /* JADX INFO: renamed from: l */
    public final NotFoundClasses f53005l;

    /* JADX INFO: renamed from: m */
    public final ContractDeserializer f53006m;

    /* JADX INFO: renamed from: n */
    public final AdditionalClassPartsProvider f53007n;

    /* JADX INFO: renamed from: o */
    public final PlatformDependentDeclarationFilter f53008o;

    /* JADX INFO: renamed from: p */
    public final ExtensionRegistryLite f53009p;

    /* JADX INFO: renamed from: q */
    public final NewKotlinTypeChecker f53010q;

    /* JADX INFO: renamed from: r */
    public final SamConversionResolver f53011r;

    /* JADX INFO: renamed from: s */
    public final List f53012s;

    /* JADX INFO: renamed from: t */
    public final EnumEntriesDeserializationSupport f53013t;

    /* JADX INFO: renamed from: u */
    public final ClassDeserializer f53014u;

    public DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration configuration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader<? extends AnnotationDescriptor, ? extends ConstantValue<?>> annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable<? extends ClassDescriptorFactory> fictitiousClassDescriptorFactories, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver, List<? extends TypeAttributeTranslator> typeAttributeTranslators, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(configuration, "configuration");
        AbstractC16544l.m18094g(classDataFinder, "classDataFinder");
        AbstractC16544l.m18094g(annotationAndConstantLoader, "annotationAndConstantLoader");
        AbstractC16544l.m18094g(packageFragmentProvider, "packageFragmentProvider");
        AbstractC16544l.m18094g(localClassifierTypeSettings, "localClassifierTypeSettings");
        AbstractC16544l.m18094g(errorReporter, "errorReporter");
        AbstractC16544l.m18094g(lookupTracker, "lookupTracker");
        AbstractC16544l.m18094g(flexibleTypeDeserializer, "flexibleTypeDeserializer");
        AbstractC16544l.m18094g(fictitiousClassDescriptorFactories, "fictitiousClassDescriptorFactories");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(contractDeserializer, "contractDeserializer");
        AbstractC16544l.m18094g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC16544l.m18094g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC16544l.m18094g(extensionRegistryLite, "extensionRegistryLite");
        AbstractC16544l.m18094g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC16544l.m18094g(samConversionResolver, "samConversionResolver");
        AbstractC16544l.m18094g(typeAttributeTranslators, "typeAttributeTranslators");
        AbstractC16544l.m18094g(enumEntriesDeserializationSupport, "enumEntriesDeserializationSupport");
        this.f52994a = storageManager;
        this.f52995b = moduleDescriptor;
        this.f52996c = configuration;
        this.f52997d = classDataFinder;
        this.f52998e = annotationAndConstantLoader;
        this.f52999f = packageFragmentProvider;
        this.f53000g = localClassifierTypeSettings;
        this.f53001h = errorReporter;
        this.f53002i = lookupTracker;
        this.f53003j = flexibleTypeDeserializer;
        this.f53004k = fictitiousClassDescriptorFactories;
        this.f53005l = notFoundClasses;
        this.f53006m = contractDeserializer;
        this.f53007n = additionalClassPartsProvider;
        this.f53008o = platformDependentDeclarationFilter;
        this.f53009p = extensionRegistryLite;
        this.f53010q = kotlinTypeChecker;
        this.f53011r = samConversionResolver;
        this.f53012s = typeAttributeTranslators;
        this.f53013t = enumEntriesDeserializationSupport;
        this.f53014u = new ClassDeserializer(this);
    }

    public final DeserializationContext createContext(PackageFragmentDescriptor descriptor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, DeserializedContainerSource deserializedContainerSource) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        AbstractC16544l.m18094g(nameResolver, "nameResolver");
        AbstractC16544l.m18094g(typeTable, "typeTable");
        AbstractC16544l.m18094g(versionRequirementTable, "versionRequirementTable");
        AbstractC16544l.m18094g(metadataVersion, "metadataVersion");
        return new DeserializationContext(this, nameResolver, descriptor, typeTable, versionRequirementTable, metadataVersion, deserializedContainerSource, null, C17689w.f56480Y);
    }

    public final ClassDescriptor deserializeClass(ClassId classId) {
        AbstractC16544l.m18094g(classId, "classId");
        return ClassDeserializer.deserializeClass$default(this.f53014u, classId, null, 2, null);
    }

    public final AdditionalClassPartsProvider getAdditionalClassPartsProvider() {
        return this.f53007n;
    }

    public final AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> getAnnotationAndConstantLoader() {
        return this.f52998e;
    }

    public final ClassDataFinder getClassDataFinder() {
        return this.f52997d;
    }

    public final ClassDeserializer getClassDeserializer() {
        return this.f53014u;
    }

    public final DeserializationConfiguration getConfiguration() {
        return this.f52996c;
    }

    public final ContractDeserializer getContractDeserializer() {
        return this.f53006m;
    }

    public final EnumEntriesDeserializationSupport getEnumEntriesDeserializationSupport() {
        return this.f53013t;
    }

    public final ErrorReporter getErrorReporter() {
        return this.f53001h;
    }

    public final ExtensionRegistryLite getExtensionRegistryLite() {
        return this.f53009p;
    }

    public final Iterable<ClassDescriptorFactory> getFictitiousClassDescriptorFactories() {
        return this.f53004k;
    }

    public final FlexibleTypeDeserializer getFlexibleTypeDeserializer() {
        return this.f53003j;
    }

    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f53010q;
    }

    public final LocalClassifierTypeSettings getLocalClassifierTypeSettings() {
        return this.f53000g;
    }

    public final LookupTracker getLookupTracker() {
        return this.f53002i;
    }

    public final ModuleDescriptor getModuleDescriptor() {
        return this.f52995b;
    }

    public final NotFoundClasses getNotFoundClasses() {
        return this.f53005l;
    }

    public final PackageFragmentProvider getPackageFragmentProvider() {
        return this.f52999f;
    }

    public final PlatformDependentDeclarationFilter getPlatformDependentDeclarationFilter() {
        return this.f53008o;
    }

    public final StorageManager getStorageManager() {
        return this.f52994a;
    }

    public final List<TypeAttributeTranslator> getTypeAttributeTranslators() {
        return this.f53012s;
    }

    public /* synthetic */ DeserializationComponents(StorageManager storageManager, ModuleDescriptor moduleDescriptor, DeserializationConfiguration deserializationConfiguration, ClassDataFinder classDataFinder, AnnotationAndConstantLoader annotationAndConstantLoader, PackageFragmentProvider packageFragmentProvider, LocalClassifierTypeSettings localClassifierTypeSettings, ErrorReporter errorReporter, LookupTracker lookupTracker, FlexibleTypeDeserializer flexibleTypeDeserializer, Iterable iterable, NotFoundClasses notFoundClasses, ContractDeserializer contractDeserializer, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, ExtensionRegistryLite extensionRegistryLite, NewKotlinTypeChecker newKotlinTypeChecker, SamConversionResolver samConversionResolver, List list, EnumEntriesDeserializationSupport enumEntriesDeserializationSupport, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, moduleDescriptor, deserializationConfiguration, classDataFinder, annotationAndConstantLoader, packageFragmentProvider, localClassifierTypeSettings, errorReporter, lookupTracker, flexibleTypeDeserializer, iterable, notFoundClasses, contractDeserializer, (i10 & 8192) != 0 ? AdditionalClassPartsProvider.None.INSTANCE : additionalClassPartsProvider, (i10 & 16384) != 0 ? PlatformDependentDeclarationFilter.All.INSTANCE : platformDependentDeclarationFilter, extensionRegistryLite, (65536 & i10) != 0 ? NewKotlinTypeChecker.Companion.getDefault() : newKotlinTypeChecker, samConversionResolver, (262144 & i10) != 0 ? AbstractC9393x3.m9974d(DefaultTypeAttributeTranslator.INSTANCE) : list, (i10 & 524288) != 0 ? EnumEntriesDeserializationSupport.Default.INSTANCE : enumEntriesDeserializationSupport);
    }
}
