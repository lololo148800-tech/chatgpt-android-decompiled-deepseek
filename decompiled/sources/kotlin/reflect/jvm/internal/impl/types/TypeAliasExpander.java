package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p909nm.AbstractC17681o;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeAliasExpander {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final TypeAliasExpansionReportStrategy f53186a;

    /* JADX INFO: renamed from: b */
    public final boolean f53187b;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static final void access$assertRecursionDepth(Companion companion, int i10, TypeAliasDescriptor typeAliasDescriptor) {
            companion.getClass();
            if (i10 <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }
    }

    static {
        new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);
    }

    public TypeAliasExpander(TypeAliasExpansionReportStrategy reportStrategy, boolean z6) {
        AbstractC16544l.m18094g(reportStrategy, "reportStrategy");
        this.f53186a = reportStrategy;
        this.f53187b = z6;
    }

    /* JADX INFO: renamed from: a */
    public final void m18420a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.f53186a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final SimpleType m18421b(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z6, int i10, boolean z10) {
        TypeProjection typeProjectionM18422c = m18422c(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i10);
        KotlinType type = typeProjectionM18422c.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            return simpleTypeAsSimpleType;
        }
        typeProjectionM18422c.getProjectionKind();
        m18420a(simpleTypeAsSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        if (!KotlinTypeKt.isError(simpleTypeAsSimpleType)) {
            simpleTypeAsSimpleType = TypeSubstitutionKt.replace$default(simpleTypeAsSimpleType, null, KotlinTypeKt.isError(simpleTypeAsSimpleType) ? simpleTypeAsSimpleType.getAttributes() : typeAttributes.add(simpleTypeAsSimpleType.getAttributes()), 1, null);
        }
        SimpleType simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleTypeAsSimpleType, z6);
        AbstractC16544l.m18093f(simpleTypeMakeNullableIfNeeded, "let(...)");
        if (!z10) {
            return simpleTypeMakeNullableIfNeeded;
        }
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        AbstractC16544l.m18093f(typeConstructor, "getTypeConstructor(...)");
        return SpecialTypesKt.withAbbreviation(simpleTypeMakeNullableIfNeeded, KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z6, MemberScope.Empty.INSTANCE));
    }

    /* JADX INFO: renamed from: c */
    public final TypeProjection m18422c(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i10) {
        Variance variance;
        SimpleType simpleTypeMakeNullableIfNeeded;
        TypeAttributes typeAttributesAdd;
        KotlinType kotlinTypeReplace$default;
        Variance variance2;
        Variance variance3;
        Companion.access$assertRecursionDepth(Companion, i10, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            AbstractC16544l.m18091d(typeParameterDescriptor);
            TypeProjection typeProjectionMakeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            AbstractC16544l.m18093f(typeProjectionMakeStarProjection, "makeStarProjection(...)");
            return typeProjectionMakeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        AbstractC16544l.m18093f(type, "getType(...)");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f53186a;
        if (replacement != null) {
            if (replacement.isStarProjection()) {
                AbstractC16544l.m18091d(typeParameterDescriptor);
                TypeProjection typeProjectionMakeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
                AbstractC16544l.m18093f(typeProjectionMakeStarProjection2, "makeStarProjection(...)");
                return typeProjectionMakeStarProjection2;
            }
            UnwrappedType unwrappedTypeUnwrap = replacement.getType().unwrap();
            Variance projectionKind = replacement.getProjectionKind();
            AbstractC16544l.m18093f(projectionKind, "getProjectionKind(...)");
            Variance projectionKind2 = typeProjection.getProjectionKind();
            AbstractC16544l.m18093f(projectionKind2, "getProjectionKind(...)");
            if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
                if (projectionKind == variance3) {
                    projectionKind = projectionKind2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
                variance = Variance.INVARIANT;
            }
            if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
                if (projectionKind == variance2) {
                    projectionKind = variance2;
                } else {
                    typeAliasExpansionReportStrategy.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrappedTypeUnwrap);
                }
            }
            m18420a(type.getAnnotations(), unwrappedTypeUnwrap.getAnnotations());
            if (unwrappedTypeUnwrap instanceof DynamicType) {
                DynamicType dynamicType = (DynamicType) unwrappedTypeUnwrap;
                kotlinTypeReplace$default = dynamicType.replaceAttributes(KotlinTypeKt.isError(dynamicType) ? dynamicType.getAttributes() : type.getAttributes().add(dynamicType.getAttributes()));
            } else {
                simpleTypeMakeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap), type.isMarkedNullable());
                AbstractC16544l.m18093f(simpleTypeMakeNullableIfNeeded, "makeNullableIfNeeded(...)");
                TypeAttributes attributes = type.getAttributes();
                if (!KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded)) {
                    if (KotlinTypeKt.isError(simpleTypeMakeNullableIfNeeded)) {
                        kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
                        typeAttributesAdd = simpleTypeMakeNullableIfNeeded.getAttributes();
                    } else {
                        kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
                        typeAttributesAdd = attributes.add(simpleTypeMakeNullableIfNeeded.getAttributes());
                    }
                    kotlinTypeReplace$default = TypeSubstitutionKt.replace$default(simpleTypeMakeNullableIfNeeded, null, typeAttributesAdd, 1, null);
                }
            }
            kotlinTypeReplace$default = simpleTypeMakeNullableIfNeeded;
            return new TypeProjectionImpl(projectionKind, kotlinTypeReplace$default);
        }
        UnwrappedType unwrappedTypeUnwrap2 = typeProjection.getType().unwrap();
        if (DynamicTypesKt.isDynamic(unwrappedTypeUnwrap2)) {
            return typeProjection;
        }
        SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(unwrappedTypeUnwrap2);
        if (KotlinTypeKt.isError(simpleTypeAsSimpleType) || !TypeUtilsKt.requiresTypeAliasExpansion(simpleTypeAsSimpleType)) {
            return typeProjection;
        }
        TypeConstructor constructor = simpleTypeAsSimpleType.getConstructor();
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = constructor.mo22589getDeclarationDescriptor();
        constructor.getParameters().size();
        simpleTypeAsSimpleType.getArguments().size();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        int i11 = 0;
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeAliasDescriptor) {
            TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) classifierDescriptorMo22589getDeclarationDescriptor;
            if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                typeAliasExpansionReportStrategy.recursiveTypeAlias(typeAliasDescriptor);
                return new TypeProjectionImpl(Variance.INVARIANT, ErrorUtils.createErrorType(ErrorTypeKind.RECURSIVE_TYPE_ALIAS, typeAliasDescriptor.getName().toString()));
            }
            List<TypeProjection> arguments = simpleTypeAsSimpleType.getArguments();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arguments, 10));
            for (Object obj : arguments) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC17681o.m19388q();
                    throw null;
                }
                arrayList.add(m18422c((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i11), i10 + 1));
                i11 = i12;
            }
            SimpleType simpleTypeM18421b = m18421b(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), simpleTypeAsSimpleType.getAttributes(), simpleTypeAsSimpleType.isMarkedNullable(), i10 + 1, false);
            SimpleType simpleTypeM18423d = m18423d(simpleTypeAsSimpleType, typeAliasExpansion, i10);
            if (!DynamicTypesKt.isDynamic(simpleTypeM18421b)) {
                simpleTypeM18421b = SpecialTypesKt.withAbbreviation(simpleTypeM18421b, simpleTypeM18423d);
            }
            return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeM18421b);
        }
        SimpleType simpleTypeM18423d2 = m18423d(simpleTypeAsSimpleType, typeAliasExpansion, i10);
        TypeSubstitutor typeSubstitutorCreate = TypeSubstitutor.create(simpleTypeM18423d2);
        AbstractC16544l.m18093f(typeSubstitutorCreate, "create(...)");
        for (Object obj2 : simpleTypeM18423d2.getArguments()) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            TypeProjection typeProjection2 = (TypeProjection) obj2;
            if (!typeProjection2.isStarProjection()) {
                KotlinType type2 = typeProjection2.getType();
                AbstractC16544l.m18093f(type2, "getType(...)");
                if (!TypeUtilsKt.containsTypeAliasParameters(type2)) {
                    TypeProjection typeProjection3 = simpleTypeAsSimpleType.getArguments().get(i11);
                    TypeParameterDescriptor typeParameterDescriptor2 = simpleTypeAsSimpleType.getConstructor().getParameters().get(i11);
                    if (this.f53187b) {
                        KotlinType type3 = typeProjection3.getType();
                        AbstractC16544l.m18093f(type3, "getType(...)");
                        KotlinType type4 = typeProjection2.getType();
                        AbstractC16544l.m18093f(type4, "getType(...)");
                        AbstractC16544l.m18091d(typeParameterDescriptor2);
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(typeSubstitutorCreate, type3, type4, typeParameterDescriptor2);
                    }
                }
            }
            i11 = i13;
        }
        return new TypeProjectionImpl(typeProjection.getProjectionKind(), simpleTypeM18423d2);
    }

    /* JADX INFO: renamed from: d */
    public final SimpleType m18423d(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i10) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(arguments, 10));
        int i11 = 0;
        for (Object obj : arguments) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC17681o.m19388q();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection typeProjectionM18422c = m18422c(typeProjection, typeAliasExpansion, constructor.getParameters().get(i11), i10 + 1);
            if (!typeProjectionM18422c.isStarProjection()) {
                typeProjectionM18422c = new TypeProjectionImpl(typeProjectionM18422c.getProjectionKind(), TypeUtils.makeNullableIfNeeded(typeProjectionM18422c.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(typeProjectionM18422c);
            i11 = i12;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }

    public final SimpleType expand(TypeAliasExpansion typeAliasExpansion, TypeAttributes attributes) {
        AbstractC16544l.m18094g(typeAliasExpansion, "typeAliasExpansion");
        AbstractC16544l.m18094g(attributes, "attributes");
        return m18421b(typeAliasExpansion, attributes, false, 0, true);
    }
}
