package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMapper;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.UtilsKt;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifier;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPrimitiveType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaWildcardType;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p571X9.AbstractC9393x3;
import p606Yn.C10107h;
import p630Zm.C10425a;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: a */
    public final LazyJavaResolverContext f51968a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterResolver f51969b;

    /* JADX INFO: renamed from: c */
    public final RawProjectionComputer f51970c;

    /* JADX INFO: renamed from: d */
    public final TypeParameterUpperBoundEraser f51971d;

    /* JADX WARN: Multi-variable type inference failed */
    public JavaTypeResolver(LazyJavaResolverContext c9, TypeParameterResolver typeParameterResolver) {
        AbstractC16544l.m18094g(c9, "c");
        AbstractC16544l.m18094g(typeParameterResolver, "typeParameterResolver");
        this.f51968a = c9;
        this.f51969b = typeParameterResolver;
        RawProjectionComputer rawProjectionComputer = new RawProjectionComputer();
        this.f51970c = rawProjectionComputer;
        this.f51971d = new TypeParameterUpperBoundEraser(rawProjectionComputer, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KotlinType transformArrayType$default(JavaTypeResolver javaTypeResolver, JavaArrayType javaArrayType, JavaTypeAttributes javaTypeAttributes, boolean z6, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z6 = false;
        }
        return javaTypeResolver.transformArrayType(javaArrayType, javaTypeAttributes, z6);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0166  */
    /* JADX INFO: renamed from: a */
    public final SimpleType m18220a(JavaClassifierType javaClassifierType, JavaTypeAttributes javaTypeAttributes, SimpleType simpleType) {
        TypeAttributes defaultAttributes;
        TypeConstructor typeConstructor;
        ClassDescriptor classDescriptorConvertReadOnlyToMutable;
        Variance variance;
        boolean z6;
        boolean z10;
        List listM19322C0;
        Object typeProjectionImpl;
        List list;
        TypeProjection typeProjectionComputeProjection;
        if (simpleType == null || (defaultAttributes = simpleType.getAttributes()) == null) {
            defaultAttributes = TypeAttributesKt.toDefaultAttributes(new LazyJavaAnnotations(this.f51968a, javaClassifierType, false, 4, null));
        }
        TypeAttributes typeAttributes = defaultAttributes;
        JavaClassifier classifier = javaClassifierType.getClassifier();
        LazyJavaResolverContext lazyJavaResolverContext = this.f51968a;
        TypeConstructor typeConstructor2 = null;
        if (classifier == null) {
            typeConstructor = m18221b(javaClassifierType);
        } else if (classifier instanceof JavaClass) {
            JavaClass javaClass = (JavaClass) classifier;
            FqName fqName = javaClass.getFqName();
            if (fqName == null) {
                throw new AssertionError("Class type should have a FQ name: " + classifier);
            }
            if (javaTypeAttributes.isForAnnotationParameter() && fqName.equals(JavaTypeResolverKt.f51972a)) {
                classDescriptorConvertReadOnlyToMutable = lazyJavaResolverContext.getComponents().getReflectionTypes().getKClass();
            } else {
                JavaToKotlinClassMapper javaToKotlinClassMapper = JavaToKotlinClassMapper.INSTANCE;
                ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(javaToKotlinClassMapper, fqName, lazyJavaResolverContext.getModule().getBuiltIns(), null, 4, null);
                if (classDescriptorMapJavaToKotlin$default == null) {
                    classDescriptorConvertReadOnlyToMutable = null;
                } else if (javaToKotlinClassMapper.isReadOnly(classDescriptorMapJavaToKotlin$default)) {
                    if (javaTypeAttributes.getFlexibility() != JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND && javaTypeAttributes.getHowThisTypeIsUsed() != TypeUsage.SUPERTYPE) {
                        if (JavaTypesKt.isSuperWildcard((JavaType) AbstractC17680n.m19353c0(javaClassifierType.getTypeArguments()))) {
                            List<TypeParameterDescriptor> parameters = javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default).getTypeConstructor().getParameters();
                            AbstractC16544l.m18093f(parameters, "getParameters(...)");
                            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) AbstractC17680n.m19353c0(parameters);
                            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null || variance == Variance.OUT_VARIANCE) {
                            }
                        }
                        classDescriptorConvertReadOnlyToMutable = classDescriptorMapJavaToKotlin$default;
                    }
                    classDescriptorConvertReadOnlyToMutable = javaToKotlinClassMapper.convertReadOnlyToMutable(classDescriptorMapJavaToKotlin$default);
                } else {
                    classDescriptorConvertReadOnlyToMutable = classDescriptorMapJavaToKotlin$default;
                }
            }
            if (classDescriptorConvertReadOnlyToMutable == null) {
                classDescriptorConvertReadOnlyToMutable = lazyJavaResolverContext.getComponents().getModuleClassResolver().resolveClass(javaClass);
            }
            if (classDescriptorConvertReadOnlyToMutable == null || (typeConstructor = classDescriptorConvertReadOnlyToMutable.getTypeConstructor()) == null) {
                typeConstructor = m18221b(javaClassifierType);
            }
        } else {
            if (!(classifier instanceof JavaTypeParameter)) {
                throw new IllegalStateException("Unknown classifier kind: " + classifier);
            }
            TypeParameterDescriptor typeParameterDescriptorResolveTypeParameter = this.f51969b.resolveTypeParameter((JavaTypeParameter) classifier);
            typeConstructor = typeParameterDescriptorResolveTypeParameter != null ? typeParameterDescriptorResolveTypeParameter.getTypeConstructor() : null;
        }
        TypeConstructor typeConstructor3 = typeConstructor;
        if (typeConstructor3 == null) {
            return null;
        }
        boolean z11 = false;
        if (javaTypeAttributes.getFlexibility() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND) {
            z6 = false;
        } else {
            z6 = (javaTypeAttributes.isForAnnotationParameter() || javaTypeAttributes.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
        }
        if (AbstractC16544l.m18089b(simpleType != null ? simpleType.getConstructor() : null, typeConstructor3) && !javaClassifierType.isRaw() && z6) {
            return simpleType.makeNullableAsSpecified(true);
        }
        if (javaClassifierType.isRaw()) {
            z11 = true;
        } else if (javaClassifierType.getTypeArguments().isEmpty()) {
            List<TypeParameterDescriptor> parameters2 = typeConstructor3.getParameters();
            AbstractC16544l.m18093f(parameters2, "getParameters(...)");
            if (!parameters2.isEmpty()) {
                z11 = true;
            }
        }
        List<TypeParameterDescriptor> parameters3 = typeConstructor3.getParameters();
        AbstractC16544l.m18093f(parameters3, "getParameters(...)");
        if (z11) {
            List<TypeParameterDescriptor> list2 = parameters3;
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                TypeParameterDescriptor typeParameterDescriptor2 = (TypeParameterDescriptor) it.next();
                if (TypeUtilsKt.hasTypeParameterRecursiveBounds(typeParameterDescriptor2, typeConstructor2, javaTypeAttributes.getVisitedTypeParameters())) {
                    typeProjectionComputeProjection = TypeUtils.makeStarProjection(typeParameterDescriptor2, javaTypeAttributes);
                } else {
                    typeProjectionComputeProjection = this.f51970c.computeProjection(typeParameterDescriptor2, javaTypeAttributes.markIsRaw(javaClassifierType.isRaw()), this.f51971d, new LazyWrappedType(lazyJavaResolverContext.getStorageManager(), new C10425a(this, typeParameterDescriptor2, javaTypeAttributes, typeConstructor3, javaClassifierType)));
                }
                arrayList.add(typeProjectionComputeProjection);
                it = it;
                z6 = z6;
                typeConstructor2 = null;
            }
            z10 = z6;
            list = arrayList;
        } else {
            z10 = z6;
            if (parameters3.size() != javaClassifierType.getTypeArguments().size()) {
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator<T> it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new TypeProjectionImpl(ErrorUtils.createErrorType(ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER, ((TypeParameterDescriptor) it2.next()).getName().asString())));
                }
                listM19322C0 = AbstractC17680n.m19322C0(arrayList2);
            } else {
                C10107h c10107hM19332I0 = AbstractC17680n.m19332I0(javaClassifierType.getTypeArguments());
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(c10107hM19332I0, 10));
                Iterator it3 = c10107hM19332I0.iterator();
                while (true) {
                    C17656A c17656a = (C17656A) it3;
                    if (!c17656a.f56445Z.hasNext()) {
                        break;
                    }
                    C17692z c17692z = (C17692z) c17656a.next();
                    JavaType javaType = (JavaType) c17692z.f56484b;
                    parameters3.size();
                    TypeParameterDescriptor typeParameterDescriptor3 = parameters3.get(c17692z.f56483a);
                    TypeUsage typeUsage = TypeUsage.COMMON;
                    JavaTypeAttributes attributes$default = JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null);
                    AbstractC16544l.m18091d(typeParameterDescriptor3);
                    if (javaType instanceof JavaWildcardType) {
                        JavaWildcardType javaWildcardType = (JavaWildcardType) javaType;
                        JavaType bound = javaWildcardType.getBound();
                        Variance variance2 = javaWildcardType.isExtends() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
                        if (bound == null || !(typeParameterDescriptor3.getVariance() == Variance.INVARIANT || variance2 == typeParameterDescriptor3.getVariance())) {
                            typeProjectionImpl = TypeUtils.makeStarProjection(typeParameterDescriptor3, attributes$default);
                            AbstractC16544l.m18093f(typeProjectionImpl, "makeStarProjection(...)");
                        } else {
                            AnnotationDescriptor annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard = UtilsKt.extractNullabilityAnnotationOnBoundedWildcard(lazyJavaResolverContext, javaWildcardType);
                            KotlinType kotlinTypeTransformJavaType = transformJavaType(bound, JavaTypeAttributesKt.toAttributes$default(typeUsage, false, false, null, 7, null));
                            if (annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard != null) {
                                kotlinTypeTransformJavaType = TypeUtilsKt.replaceAnnotations(kotlinTypeTransformJavaType, Annotations.Companion.create(AbstractC17680n.m19360j0(kotlinTypeTransformJavaType.getAnnotations(), annotationDescriptorExtractNullabilityAnnotationOnBoundedWildcard)));
                            }
                            typeProjectionImpl = TypeUtilsKt.createProjection(kotlinTypeTransformJavaType, variance2, typeParameterDescriptor3);
                        }
                    } else {
                        typeProjectionImpl = new TypeProjectionImpl(Variance.INVARIANT, transformJavaType(javaType, attributes$default));
                    }
                    arrayList3.add(typeProjectionImpl);
                }
                listM19322C0 = AbstractC17680n.m19322C0(arrayList3);
            }
            list = listM19322C0;
        }
        return KotlinTypeFactory.simpleType$default(typeAttributes, typeConstructor3, list, z10, (KotlinTypeRefiner) null, 16, (Object) null);
    }

    /* JADX INFO: renamed from: b */
    public final TypeConstructor m18221b(JavaClassifierType javaClassifierType) {
        TypeConstructor typeConstructor = this.f51968a.getComponents().getDeserializedDescriptorResolver().getComponents().getNotFoundClasses().getClass(ClassId.Companion.topLevel(new FqName(javaClassifierType.getClassifierQualifiedName())), AbstractC9393x3.m9974d(0)).getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return typeConstructor;
    }

    public final KotlinType transformArrayType(JavaArrayType arrayType, JavaTypeAttributes attr, boolean z6) {
        AbstractC16544l.m18094g(arrayType, "arrayType");
        AbstractC16544l.m18094g(attr, "attr");
        JavaType componentType = arrayType.getComponentType();
        JavaPrimitiveType javaPrimitiveType = componentType instanceof JavaPrimitiveType ? (JavaPrimitiveType) componentType : null;
        PrimitiveType type = javaPrimitiveType != null ? javaPrimitiveType.getType() : null;
        LazyJavaResolverContext lazyJavaResolverContext = this.f51968a;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(lazyJavaResolverContext, arrayType, true);
        if (type != null) {
            SimpleType primitiveArrayKotlinType = lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveArrayKotlinType(type);
            AbstractC16544l.m18091d(primitiveArrayKotlinType);
            KotlinType kotlinTypeReplaceAnnotations = TypeUtilsKt.replaceAnnotations(primitiveArrayKotlinType, new CompositeAnnotations(primitiveArrayKotlinType.getAnnotations(), lazyJavaAnnotations));
            AbstractC16544l.m18092e(kotlinTypeReplaceAnnotations, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            SimpleType simpleType = (SimpleType) kotlinTypeReplaceAnnotations;
            return attr.isForAnnotationParameter() ? simpleType : KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        KotlinType kotlinTypeTransformJavaType = transformJavaType(componentType, JavaTypeAttributesKt.toAttributes$default(TypeUsage.COMMON, attr.isForAnnotationParameter(), false, null, 6, null));
        if (attr.isForAnnotationParameter()) {
            SimpleType arrayType2 = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(z6 ? Variance.OUT_VARIANCE : Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
            AbstractC16544l.m18093f(arrayType2, "getArrayType(...)");
            return arrayType2;
        }
        SimpleType arrayType3 = lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.INVARIANT, kotlinTypeTransformJavaType, lazyJavaAnnotations);
        AbstractC16544l.m18093f(arrayType3, "getArrayType(...)");
        return KotlinTypeFactory.flexibleType(arrayType3, lazyJavaResolverContext.getModule().getBuiltIns().getArrayType(Variance.OUT_VARIANCE, kotlinTypeTransformJavaType, lazyJavaAnnotations).makeNullableAsSpecified(true));
    }

    public final KotlinType transformJavaType(JavaType javaType, JavaTypeAttributes attr) {
        KotlinType kotlinTypeTransformJavaType;
        AbstractC16544l.m18094g(attr, "attr");
        boolean z6 = javaType instanceof JavaPrimitiveType;
        LazyJavaResolverContext lazyJavaResolverContext = this.f51968a;
        if (z6) {
            PrimitiveType type = ((JavaPrimitiveType) javaType).getType();
            SimpleType primitiveKotlinType = type != null ? lazyJavaResolverContext.getModule().getBuiltIns().getPrimitiveKotlinType(type) : lazyJavaResolverContext.getModule().getBuiltIns().getUnitType();
            AbstractC16544l.m18091d(primitiveKotlinType);
            return primitiveKotlinType;
        }
        if (javaType instanceof JavaClassifierType) {
            JavaClassifierType javaClassifierType = (JavaClassifierType) javaType;
            boolean z10 = (attr.isForAnnotationParameter() || attr.getHowThisTypeIsUsed() == TypeUsage.SUPERTYPE) ? false : true;
            boolean zIsRaw = javaClassifierType.isRaw();
            if (!zIsRaw && !z10) {
                SimpleType simpleTypeM18220a = m18220a(javaClassifierType, attr, null);
                if (simpleTypeM18220a == null) {
                    simpleTypeM18220a = ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
                }
                return simpleTypeM18220a;
            }
            SimpleType simpleTypeM18220a2 = m18220a(javaClassifierType, attr.withFlexibility(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
            if (simpleTypeM18220a2 == null) {
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            SimpleType simpleTypeM18220a3 = m18220a(javaClassifierType, attr.withFlexibility(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), simpleTypeM18220a2);
            if (simpleTypeM18220a3 == null) {
                return ErrorUtils.createErrorType(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, javaClassifierType.getPresentableText());
            }
            return zIsRaw ? new RawTypeImpl(simpleTypeM18220a2, simpleTypeM18220a3) : KotlinTypeFactory.flexibleType(simpleTypeM18220a2, simpleTypeM18220a3);
        }
        if (javaType instanceof JavaArrayType) {
            return transformArrayType$default(this, (JavaArrayType) javaType, attr, false, 4, null);
        }
        if (javaType instanceof JavaWildcardType) {
            JavaType bound = ((JavaWildcardType) javaType).getBound();
            if (bound != null && (kotlinTypeTransformJavaType = transformJavaType(bound, attr)) != null) {
                return kotlinTypeTransformJavaType;
            }
            SimpleType defaultBound = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
            AbstractC16544l.m18093f(defaultBound, "getDefaultBound(...)");
            return defaultBound;
        }
        if (javaType == null) {
            SimpleType defaultBound2 = lazyJavaResolverContext.getModule().getBuiltIns().getDefaultBound();
            AbstractC16544l.m18093f(defaultBound2, "getDefaultBound(...)");
            return defaultBound2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + javaType);
    }
}
