package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import androidx.work.impl.utils.p651oZ.HhJS;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptorWithTypeParameters;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.types.AbstractStubType;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;
import p379Pb.LVf.efyhmdM;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17656A;
import p909nm.C17692z;
import sn.C19695a;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeUtilsKt {
    /* JADX INFO: renamed from: a */
    public static final boolean m18440a(KotlinType kotlinType, TypeConstructor typeConstructor, Set set) {
        boolean zM18440a;
        if (AbstractC16544l.m18089b(kotlinType.getConstructor(), typeConstructor)) {
            return true;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo22589getDeclarationDescriptor : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        Iterable iterableM19332I0 = AbstractC17680n.m19332I0(kotlinType.getArguments());
        if (!(iterableM19332I0 instanceof Collection) || !((Collection) iterableM19332I0).isEmpty()) {
            Iterator it = iterableM19332I0.iterator();
            do {
                C17656A c17656a = (C17656A) it;
                if (c17656a.f56445Z.hasNext()) {
                    C17692z c17692z = (C17692z) c17656a.next();
                    int i10 = c17692z.f56483a;
                    TypeProjection typeProjection = (TypeProjection) c17692z.f56484b;
                    TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) AbstractC17680n.m19344T(i10, declaredTypeParameters) : null;
                    if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection()) {
                        KotlinType type = typeProjection.getType();
                        AbstractC16544l.m18093f(type, "getType(...)");
                        zM18440a = m18440a(type, typeConstructor, set);
                    } else {
                        zM18440a = false;
                    }
                }
            } while (!zM18440a);
            return true;
        }
        return false;
    }

    public static final TypeProjection asTypeProjection(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return new TypeProjectionImpl(kotlinType);
    }

    /* JADX INFO: renamed from: b */
    public static final void m18441b(KotlinType kotlinType, KotlinType kotlinType2, LinkedHashSet linkedHashSet, Set set) {
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
            if (!AbstractC16544l.m18089b(kotlinType.getConstructor(), kotlinType2.getConstructor())) {
                linkedHashSet.add(classifierDescriptorMo22589getDeclarationDescriptor);
                return;
            }
            for (KotlinType kotlinType3 : ((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor).getUpperBounds()) {
                AbstractC16544l.m18091d(kotlinType3);
                m18441b(kotlinType3, kotlinType2, linkedHashSet, set);
            }
            return;
        }
        ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor2 = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
        ClassifierDescriptorWithTypeParameters classifierDescriptorWithTypeParameters = classifierDescriptorMo22589getDeclarationDescriptor2 instanceof ClassifierDescriptorWithTypeParameters ? (ClassifierDescriptorWithTypeParameters) classifierDescriptorMo22589getDeclarationDescriptor2 : null;
        List<TypeParameterDescriptor> declaredTypeParameters = classifierDescriptorWithTypeParameters != null ? classifierDescriptorWithTypeParameters.getDeclaredTypeParameters() : null;
        int i10 = 0;
        for (TypeProjection typeProjection : kotlinType.getArguments()) {
            int i11 = i10 + 1;
            TypeParameterDescriptor typeParameterDescriptor = declaredTypeParameters != null ? (TypeParameterDescriptor) AbstractC17680n.m19344T(i10, declaredTypeParameters) : null;
            if ((typeParameterDescriptor == null || set == null || !set.contains(typeParameterDescriptor)) && !typeProjection.isStarProjection() && !AbstractC17680n.m19333J(linkedHashSet, typeProjection.getType().getConstructor().mo22589getDeclarationDescriptor()) && !AbstractC16544l.m18089b(typeProjection.getType().getConstructor(), kotlinType2.getConstructor())) {
                KotlinType type = typeProjection.getType();
                AbstractC16544l.m18093f(type, "getType(...)");
                m18441b(type, kotlinType2, linkedHashSet, set);
            }
            i10 = i11;
        }
    }

    public static final boolean contains(KotlinType kotlinType, InterfaceC1436k predicate) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AbstractC16544l.m18094g(predicate, "predicate");
        return TypeUtils.contains(kotlinType, predicate);
    }

    public static final boolean containsTypeParameter(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return TypeUtils.contains(kotlinType, C19695a.f62381Z);
    }

    public static final TypeProjection createProjection(KotlinType type, Variance projectionKind, TypeParameterDescriptor typeParameterDescriptor) {
        AbstractC16544l.m18094g(type, "type");
        AbstractC16544l.m18094g(projectionKind, "projectionKind");
        if ((typeParameterDescriptor != null ? typeParameterDescriptor.getVariance() : null) == projectionKind) {
            projectionKind = Variance.INVARIANT;
        }
        return new TypeProjectionImpl(projectionKind, type);
    }

    public static final Set<TypeParameterDescriptor> extractTypeParametersFromUpperBounds(KotlinType kotlinType, Set<? extends TypeParameterDescriptor> set) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m18441b(kotlinType, kotlinType, linkedHashSet, set);
        return linkedHashSet;
    }

    public static final KotlinBuiltIns getBuiltIns(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        KotlinBuiltIns builtIns = kotlinType.getConstructor().getBuiltIns();
        AbstractC16544l.m18093f(builtIns, "getBuiltIns(...)");
        return builtIns;
    }

    public static final KotlinType getRepresentativeUpperBound(TypeParameterDescriptor typeParameterDescriptor) {
        Object obj;
        AbstractC16544l.m18094g(typeParameterDescriptor, "<this>");
        List<KotlinType> upperBounds = typeParameterDescriptor.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
        upperBounds.isEmpty();
        List<KotlinType> upperBounds2 = typeParameterDescriptor.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds2, "getUpperBounds(...)");
        Iterator<T> it = upperBounds2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = ((KotlinType) next).getConstructor().mo22589getDeclarationDescriptor();
            ClassDescriptor classDescriptor = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo22589getDeclarationDescriptor : null;
            if (classDescriptor != null && classDescriptor.getKind() != ClassKind.INTERFACE && classDescriptor.getKind() != ClassKind.ANNOTATION_CLASS) {
                obj = next;
                break;
            }
        }
        KotlinType kotlinType = (KotlinType) obj;
        if (kotlinType != null) {
            return kotlinType;
        }
        List<KotlinType> upperBounds3 = typeParameterDescriptor.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds3, "getUpperBounds(...)");
        Object objM19341Q = AbstractC17680n.m19341Q(upperBounds3);
        AbstractC16544l.m18093f(objM19341Q, "first(...)");
        return (KotlinType) objM19341Q;
    }

    public static final boolean hasTypeParameterRecursiveBounds(TypeParameterDescriptor typeParameter) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        return hasTypeParameterRecursiveBounds$default(typeParameter, null, null, 6, null);
    }

    public static /* synthetic */ boolean hasTypeParameterRecursiveBounds$default(TypeParameterDescriptor typeParameterDescriptor, TypeConstructor typeConstructor, Set set, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeConstructor = null;
        }
        if ((i10 & 4) != 0) {
            set = null;
        }
        return hasTypeParameterRecursiveBounds(typeParameterDescriptor, typeConstructor, set);
    }

    public static final boolean isBoolean(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return KotlinBuiltIns.isBoolean(kotlinType);
    }

    public static final boolean isNothing(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return KotlinBuiltIns.isNothing(kotlinType);
    }

    public static final boolean isStubTypeForBuilderInference(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return (kotlinType instanceof StubTypeForBuilderInference) || ((kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof StubTypeForBuilderInference));
    }

    public static final boolean isSubtypeOf(KotlinType kotlinType, KotlinType superType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AbstractC16544l.m18094g(superType, "superType");
        return KotlinTypeChecker.DEFAULT.isSubtypeOf(kotlinType, superType);
    }

    public static final boolean isTypeAliasParameter(ClassifierDescriptor classifierDescriptor) {
        AbstractC16544l.m18094g(classifierDescriptor, "<this>");
        return (classifierDescriptor instanceof TypeParameterDescriptor) && (((TypeParameterDescriptor) classifierDescriptor).getContainingDeclaration() instanceof TypeAliasDescriptor);
    }

    public static final boolean isTypeParameter(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return TypeUtils.isTypeParameter(kotlinType);
    }

    public static final boolean isUnresolvedType(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        return (type instanceof ErrorType) && ((ErrorType) type).getKind().isUnresolved();
    }

    public static final KotlinType makeNotNullable(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        KotlinType kotlinTypeMakeNotNullable = TypeUtils.makeNotNullable(kotlinType);
        AbstractC16544l.m18093f(kotlinTypeMakeNotNullable, "makeNotNullable(...)");
        return kotlinTypeMakeNotNullable;
    }

    public static final KotlinType makeNullable(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        KotlinType kotlinTypeMakeNullable = TypeUtils.makeNullable(kotlinType);
        AbstractC16544l.m18093f(kotlinTypeMakeNullable, "makeNullable(...)");
        return kotlinTypeMakeNullable;
    }

    public static final KotlinType replaceAnnotations(KotlinType kotlinType, Annotations newAnnotations) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AbstractC16544l.m18094g(newAnnotations, "newAnnotations");
        return (kotlinType.getAnnotations().isEmpty() && newAnnotations.isEmpty()) ? kotlinType : kotlinType.unwrap().replaceAttributes(TypeAttributesKt.replaceAnnotations(kotlinType.getAttributes(), newAnnotations));
    }

    public static final KotlinType replaceArgumentsWithStarProjections(KotlinType kotlinType) {
        SimpleType simpleType;
        UnwrappedType unwrappedTypeReplace$default;
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
            SimpleType lowerBound = flexibleType.getLowerBound();
            if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo22589getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                AbstractC16544l.m18093f(parameters, "getParameters(...)");
                List<TypeParameterDescriptor> list = parameters;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new StarProjectionImpl((TypeParameterDescriptor) it.next()));
                }
                lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
            }
            SimpleType upperBound = flexibleType.getUpperBound();
            if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo22589getDeclarationDescriptor() != null) {
                List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                AbstractC16544l.m18093f(parameters2, "getParameters(...)");
                List<TypeParameterDescriptor> list2 = parameters2;
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new StarProjectionImpl((TypeParameterDescriptor) it2.next()));
                }
                upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
            }
            unwrappedTypeReplace$default = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
        } else {
            if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                throw new C0644w();
            }
            simpleType = (SimpleType) unwrappedTypeUnwrap;
            if (!simpleType.getConstructor().getParameters().isEmpty() && simpleType.getConstructor().mo22589getDeclarationDescriptor() != null) {
                unwrappedTypeReplace$default = simpleType;
                unwrappedTypeReplace$default = simpleType;
                List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                AbstractC16544l.m18093f(parameters3, "getParameters(...)");
                List<TypeParameterDescriptor> list3 = parameters3;
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new StarProjectionImpl((TypeParameterDescriptor) it3.next()));
                }
                unwrappedTypeReplace$default = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
            }
        }
        unwrappedTypeReplace$default = simpleType;
        unwrappedTypeReplace$default = simpleType;
        unwrappedTypeReplace$default = simpleType;
        return TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeReplace$default, unwrappedTypeUnwrap);
    }

    public static final boolean requiresTypeAliasExpansion(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return contains(kotlinType, C19695a.f62383p0);
    }

    public static final boolean shouldBeUpdated(KotlinType kotlinType) {
        return kotlinType == null || contains(kotlinType, C19695a.f62384q0);
    }

    public static final boolean containsTypeAliasParameters(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, HhJS.eMsxPWcsJgzOfs);
        return contains(kotlinType, C19695a.f62382o0);
    }

    public static final boolean hasTypeParameterRecursiveBounds(TypeParameterDescriptor typeParameter, TypeConstructor typeConstructor, Set<? extends TypeParameterDescriptor> set) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        List<KotlinType> upperBounds = typeParameter.getUpperBounds();
        AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
        List<KotlinType> list = upperBounds;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (KotlinType kotlinType : list) {
            AbstractC16544l.m18091d(kotlinType);
            if (m18440a(kotlinType, typeParameter.getDefaultType().getConstructor(), set) && (typeConstructor == null || AbstractC16544l.m18089b(kotlinType.getConstructor(), typeConstructor))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isStubType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, efyhmdM.JZoIQbUW);
        return (kotlinType instanceof AbstractStubType) || ((kotlinType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) kotlinType).getOriginal() instanceof AbstractStubType));
    }
}
