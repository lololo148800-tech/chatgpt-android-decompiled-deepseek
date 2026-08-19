package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.SuspendFunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.ExpandedTypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.SimpleClassicTypeSystemContext;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import p049Bm.InterfaceC1440o;
import p1113xn.AbstractC21329w;

/* JADX INFO: loaded from: classes2.dex */
public final class DescriptorBasedTypeSignatureMappingKt {
    public static final String computeInternalName(ClassDescriptor klass, TypeMappingConfiguration<?> typeMappingConfiguration) {
        AbstractC16544l.m18094g(klass, "klass");
        AbstractC16544l.m18094g(typeMappingConfiguration, "typeMappingConfiguration");
        String predefinedFullInternalNameForClass = typeMappingConfiguration.getPredefinedFullInternalNameForClass(klass);
        if (predefinedFullInternalNameForClass != null) {
            return predefinedFullInternalNameForClass;
        }
        DeclarationDescriptor containingDeclaration = klass.getContainingDeclaration();
        AbstractC16544l.m18093f(containingDeclaration, "getContainingDeclaration(...)");
        String identifier = SpecialNames.safeIdentifier(klass.getName()).getIdentifier();
        AbstractC16544l.m18093f(identifier, "getIdentifier(...)");
        if (containingDeclaration instanceof PackageFragmentDescriptor) {
            FqName fqName = ((PackageFragmentDescriptor) containingDeclaration).getFqName();
            if (fqName.isRoot()) {
                return identifier;
            }
            return AbstractC21329w.m21730q(fqName.asString(), '.', '/') + '/' + identifier;
        }
        ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + containingDeclaration + " for " + klass);
        }
        String predefinedInternalNameForClass = typeMappingConfiguration.getPredefinedInternalNameForClass(classDescriptor);
        if (predefinedInternalNameForClass == null) {
            predefinedInternalNameForClass = computeInternalName(classDescriptor, typeMappingConfiguration);
        }
        return predefinedInternalNameForClass + '$' + identifier;
    }

    public static /* synthetic */ String computeInternalName$default(ClassDescriptor classDescriptor, TypeMappingConfiguration typeMappingConfiguration, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMappingConfiguration = TypeMappingConfigurationImpl.INSTANCE;
        }
        return computeInternalName(classDescriptor, typeMappingConfiguration);
    }

    public static final boolean hasVoidReturnType(CallableDescriptor descriptor) {
        AbstractC16544l.m18094g(descriptor, "descriptor");
        if (descriptor instanceof ConstructorDescriptor) {
            return true;
        }
        KotlinType returnType = descriptor.getReturnType();
        AbstractC16544l.m18091d(returnType);
        if (KotlinBuiltIns.isUnit(returnType)) {
            KotlinType returnType2 = descriptor.getReturnType();
            AbstractC16544l.m18091d(returnType2);
            if (!TypeUtils.isNullableType(returnType2) && !(descriptor instanceof PropertyGetterDescriptor)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T mapType(KotlinType kotlinType, JvmTypeFactory<T> factory, TypeMappingMode mode, TypeMappingConfiguration<? extends T> typeMappingConfiguration, JvmDescriptorTypeWriter<T> jvmDescriptorTypeWriter, InterfaceC1440o writeGenericType) {
        Object obj;
        KotlinType kotlinType2;
        Object objMapType;
        AbstractC16544l.m18094g(kotlinType, "kotlinType");
        AbstractC16544l.m18094g(factory, "factory");
        AbstractC16544l.m18094g(mode, "mode");
        AbstractC16544l.m18094g(typeMappingConfiguration, "typeMappingConfiguration");
        AbstractC16544l.m18094g(writeGenericType, "writeGenericType");
        KotlinType kotlinTypePreprocessType = typeMappingConfiguration.preprocessType(kotlinType);
        if (kotlinTypePreprocessType != null) {
            return (T) mapType(kotlinTypePreprocessType, factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (FunctionTypesKt.isSuspendFunctionType(kotlinType)) {
            return (T) mapType(SuspendFunctionTypesKt.transformSuspendFunctionToRuntimeFunctionType(kotlinType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        SimpleClassicTypeSystemContext simpleClassicTypeSystemContext = SimpleClassicTypeSystemContext.INSTANCE;
        Object objMapBuiltInType = TypeSignatureMappingKt.mapBuiltInType(simpleClassicTypeSystemContext, kotlinType, factory, mode);
        if (objMapBuiltInType != null) {
            T t10 = (T) TypeSignatureMappingKt.boxTypeIfNeeded(factory, objMapBuiltInType, mode.getNeedPrimitiveBoxing());
            writeGenericType.invoke(kotlinType, t10, mode);
            return t10;
        }
        TypeConstructor constructor = kotlinType.getConstructor();
        if (constructor instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) constructor;
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = typeMappingConfiguration.commonSupertype(intersectionTypeConstructor.getSupertypes());
            }
            return (T) mapType(TypeUtilsKt.replaceArgumentsWithStarProjections(alternativeType), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = constructor.mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (ErrorUtils.isError(classifierDescriptorMo22589getDeclarationDescriptor)) {
            T t11 = (T) factory.createObjectType("error/NonExistentClass");
            typeMappingConfiguration.processErrorType(kotlinType, (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            if (jvmDescriptorTypeWriter != 0) {
                jvmDescriptorTypeWriter.writeClass(t11);
            }
            return t11;
        }
        boolean z6 = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor;
        if (z6 && KotlinBuiltIns.isArray(kotlinType)) {
            if (kotlinType.getArguments().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            TypeProjection typeProjection = kotlinType.getArguments().get(0);
            KotlinType type = typeProjection.getType();
            AbstractC16544l.m18093f(type, "getType(...)");
            if (typeProjection.getProjectionKind() == Variance.IN_VARIANCE) {
                objMapType = factory.createObjectType("java/lang/Object");
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                    jvmDescriptorTypeWriter.writeClass(objMapType);
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            } else {
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayType();
                }
                Variance projectionKind = typeProjection.getProjectionKind();
                AbstractC16544l.m18093f(projectionKind, "getProjectionKind(...)");
                objMapType = mapType(type, factory, mode.toGenericArgumentMode(projectionKind, true), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                if (jvmDescriptorTypeWriter != 0) {
                    jvmDescriptorTypeWriter.writeArrayEnd();
                }
            }
            return (T) factory.createFromString("[" + factory.toString(objMapType));
        }
        if (!z6) {
            if (!(classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor)) {
                if ((classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeAliasDescriptor) && mode.getMapTypeAliases()) {
                    return (T) mapType(((TypeAliasDescriptor) classifierDescriptorMo22589getDeclarationDescriptor).getExpandedType(), factory, mode, typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
            KotlinType representativeUpperBound = TypeUtilsKt.getRepresentativeUpperBound((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor);
            if (kotlinType.isMarkedNullable()) {
                representativeUpperBound = TypeUtilsKt.makeNullable(representativeUpperBound);
            }
            T t12 = (T) mapType(representativeUpperBound, factory, mode, typeMappingConfiguration, null, FunctionsKt.getDO_NOTHING_3());
            if (jvmDescriptorTypeWriter != 0) {
                Name name = classifierDescriptorMo22589getDeclarationDescriptor.getName();
                AbstractC16544l.m18093f(name, "getName(...)");
                jvmDescriptorTypeWriter.writeTypeVariable(name, t12);
            }
            return t12;
        }
        if (InlineClassesUtilsKt.isInlineClass(classifierDescriptorMo22589getDeclarationDescriptor) && !mode.getNeedInlineClassWrapping() && (kotlinType2 = (KotlinType) ExpandedTypeUtilsKt.computeExpandedTypeForInlineClass(simpleClassicTypeSystemContext, kotlinType)) != null) {
            return (T) mapType(kotlinType2, factory, mode.wrapInlineClassesMode(), typeMappingConfiguration, jvmDescriptorTypeWriter, writeGenericType);
        }
        if (mode.isForAnnotationParameter() && KotlinBuiltIns.isKClass((ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor)) {
            obj = (T) factory.getJavaLangClassType();
        } else {
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
            ClassDescriptor original = classDescriptor.getOriginal();
            AbstractC16544l.m18093f(original, "getOriginal(...)");
            Object predefinedTypeForClass = typeMappingConfiguration.getPredefinedTypeForClass(original);
            if (predefinedTypeForClass == null) {
                if (classDescriptor.getKind() == ClassKind.ENUM_ENTRY) {
                    DeclarationDescriptor containingDeclaration = classDescriptor.getContainingDeclaration();
                    AbstractC16544l.m18092e(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    classDescriptor = (ClassDescriptor) containingDeclaration;
                }
                ClassDescriptor original2 = classDescriptor.getOriginal();
                AbstractC16544l.m18093f(original2, "getOriginal(...)");
                obj = (T) factory.createObjectType(computeInternalName(original2, typeMappingConfiguration));
            } else {
                obj = (T) predefinedTypeForClass;
            }
        }
        writeGenericType.invoke(kotlinType, obj, mode);
        return (T) obj;
    }

    public static /* synthetic */ Object mapType$default(KotlinType kotlinType, JvmTypeFactory jvmTypeFactory, TypeMappingMode typeMappingMode, TypeMappingConfiguration typeMappingConfiguration, JvmDescriptorTypeWriter jvmDescriptorTypeWriter, InterfaceC1440o interfaceC1440o, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            interfaceC1440o = FunctionsKt.getDO_NOTHING_3();
        }
        return mapType(kotlinType, jvmTypeFactory, typeMappingMode, typeMappingConfiguration, jvmDescriptorTypeWriter, interfaceC1440o);
    }
}
