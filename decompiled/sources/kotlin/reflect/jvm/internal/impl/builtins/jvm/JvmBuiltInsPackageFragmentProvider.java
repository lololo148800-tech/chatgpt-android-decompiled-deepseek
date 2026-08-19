package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.io.InputStream;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoaderImpl;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ContractDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedClassDataFinder;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.JvmEnumEntriesDeserializationSupport;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.LocalClassifierTypeSettings;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInSerializerProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsPackageFragmentImpl;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class JvmBuiltInsPackageFragmentProvider extends AbstractDeserializedPackageFragmentProvider {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltInsPackageFragmentProvider(StorageManager storageManager, KotlinClassFinder finder, ModuleDescriptor moduleDescriptor, NotFoundClasses notFoundClasses, AdditionalClassPartsProvider additionalClassPartsProvider, PlatformDependentDeclarationFilter platformDependentDeclarationFilter, DeserializationConfiguration deserializationConfiguration, NewKotlinTypeChecker kotlinTypeChecker, SamConversionResolver samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(finder, "finder");
        AbstractC16544l.m18094g(moduleDescriptor, "moduleDescriptor");
        AbstractC16544l.m18094g(notFoundClasses, "notFoundClasses");
        AbstractC16544l.m18094g(additionalClassPartsProvider, "additionalClassPartsProvider");
        AbstractC16544l.m18094g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        AbstractC16544l.m18094g(deserializationConfiguration, "deserializationConfiguration");
        AbstractC16544l.m18094g(kotlinTypeChecker, "kotlinTypeChecker");
        AbstractC16544l.m18094g(samConversionResolver, "samConversionResolver");
        DeserializedClassDataFinder deserializedClassDataFinder = new DeserializedClassDataFinder(this);
        BuiltInSerializerProtocol builtInSerializerProtocol = BuiltInSerializerProtocol.INSTANCE;
        AnnotationAndConstantLoaderImpl annotationAndConstantLoaderImpl = new AnnotationAndConstantLoaderImpl(moduleDescriptor, notFoundClasses, builtInSerializerProtocol);
        LocalClassifierTypeSettings.Default r10 = LocalClassifierTypeSettings.Default.INSTANCE;
        ErrorReporter DO_NOTHING = ErrorReporter.DO_NOTHING;
        AbstractC16544l.m18093f(DO_NOTHING, "DO_NOTHING");
        this.f52979d = new DeserializationComponents(storageManager, moduleDescriptor, deserializationConfiguration, deserializedClassDataFinder, annotationAndConstantLoaderImpl, this, r10, DO_NOTHING, LookupTracker.DO_NOTHING.INSTANCE, FlexibleTypeDeserializer.ThrowException.INSTANCE, AbstractC17681o.m19382k(new BuiltInFictitiousFunctionClassFactory(storageManager, moduleDescriptor), new JvmBuiltInClassDescriptorFactory(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, ContractDeserializer.Companion.getDEFAULT(), additionalClassPartsProvider, platformDependentDeclarationFilter, builtInSerializerProtocol.getExtensionRegistry(), kotlinTypeChecker, samConversionResolver, null, JvmEnumEntriesDeserializationSupport.INSTANCE, 262144, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider
    /* JADX INFO: renamed from: a */
    public final BuiltInsPackageFragmentImpl mo18123a(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        InputStream inputStreamFindBuiltInsData = this.f52977b.findBuiltInsData(fqName);
        if (inputStreamFindBuiltInsData != null) {
            return BuiltInsPackageFragmentImpl.Companion.create(fqName, this.f52976a, this.f52978c, inputStreamFindBuiltInsData, false);
        }
        return null;
    }
}
