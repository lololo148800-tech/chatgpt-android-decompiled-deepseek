package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import mm.C17314q;
import om.C18240g;
import p025An.C0644w;
import p077Cn.C1756x;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17665J;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import pn.C18515b;
import pn.C18524k;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeParameterUpperBoundEraser {
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a */
    public final ErasureProjectionComputer f53208a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterErasureOptions f53209b;

    /* JADX INFO: renamed from: c */
    public final C17314q f53210c;

    /* JADX INFO: renamed from: d */
    public final MemoizedFunctionToNotNull f53211d;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:57:0x013a  */
        /* JADX WARN: Code duplicated, block: B:88:0x01d5  */
        public final KotlinType replaceArgumentsOfUpperBound(KotlinType kotlinType, TypeSubstitutor substitutor, Set<? extends TypeParameterDescriptor> set, boolean z6) {
            UnwrappedType unwrappedTypeReplace$default;
            KotlinType type;
            KotlinType type2;
            KotlinType type3;
            AbstractC16544l.m18094g(kotlinType, "<this>");
            AbstractC16544l.m18094g(substitutor, "substitutor");
            UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
            if (unwrappedTypeUnwrap instanceof FlexibleType) {
                FlexibleType flexibleType = (FlexibleType) unwrappedTypeUnwrap;
                SimpleType lowerBound = flexibleType.getLowerBound();
                if (!lowerBound.getConstructor().getParameters().isEmpty() && lowerBound.getConstructor().mo22589getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters = lowerBound.getConstructor().getParameters();
                    AbstractC16544l.m18093f(parameters, "getParameters(...)");
                    List<TypeParameterDescriptor> list = parameters;
                    ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor : list) {
                        TypeProjection starProjectionImpl = (TypeProjection) AbstractC17680n.m19344T(typeParameterDescriptor.getIndex(), kotlinType.getArguments());
                        if (!z6 || starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null || TypeUtilsKt.containsTypeParameter(type3)) {
                            boolean z10 = set != null && set.contains(typeParameterDescriptor);
                            if (starProjectionImpl == null || z10) {
                                starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                            } else {
                                TypeSubstitution substitution = substitutor.getSubstitution();
                                KotlinType type4 = starProjectionImpl.getType();
                                AbstractC16544l.m18093f(type4, "getType(...)");
                                if (substitution.mo22592get(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(typeParameterDescriptor);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    lowerBound = TypeSubstitutionKt.replace$default(lowerBound, arrayList, null, 2, null);
                }
                SimpleType upperBound = flexibleType.getUpperBound();
                if (!upperBound.getConstructor().getParameters().isEmpty() && upperBound.getConstructor().mo22589getDeclarationDescriptor() != null) {
                    List<TypeParameterDescriptor> parameters2 = upperBound.getConstructor().getParameters();
                    AbstractC16544l.m18093f(parameters2, "getParameters(...)");
                    List<TypeParameterDescriptor> list2 = parameters2;
                    ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor2 : list2) {
                        TypeProjection starProjectionImpl2 = (TypeProjection) AbstractC17680n.m19344T(typeParameterDescriptor2.getIndex(), kotlinType.getArguments());
                        if (!z6 || starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null || TypeUtilsKt.containsTypeParameter(type2)) {
                            boolean z11 = set != null && set.contains(typeParameterDescriptor2);
                            if (starProjectionImpl2 == null || z11) {
                                starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                            } else {
                                TypeSubstitution substitution2 = substitutor.getSubstitution();
                                KotlinType type5 = starProjectionImpl2.getType();
                                AbstractC16544l.m18093f(type5, "getType(...)");
                                if (substitution2.mo22592get(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(typeParameterDescriptor2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    upperBound = TypeSubstitutionKt.replace$default(upperBound, arrayList2, null, 2, null);
                }
                unwrappedTypeReplace$default = KotlinTypeFactory.flexibleType(lowerBound, upperBound);
            } else {
                if (!(unwrappedTypeUnwrap instanceof SimpleType)) {
                    throw new C0644w();
                }
                SimpleType simpleType = (SimpleType) unwrappedTypeUnwrap;
                if (simpleType.getConstructor().getParameters().isEmpty() || simpleType.getConstructor().mo22589getDeclarationDescriptor() == null) {
                    unwrappedTypeReplace$default = simpleType;
                } else {
                    List<TypeParameterDescriptor> parameters3 = simpleType.getConstructor().getParameters();
                    AbstractC16544l.m18093f(parameters3, "getParameters(...)");
                    List<TypeParameterDescriptor> list3 = parameters3;
                    ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                    for (TypeParameterDescriptor typeParameterDescriptor3 : list3) {
                        TypeProjection starProjectionImpl3 = (TypeProjection) AbstractC17680n.m19344T(typeParameterDescriptor3.getIndex(), kotlinType.getArguments());
                        if (!z6 || starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null || TypeUtilsKt.containsTypeParameter(type)) {
                            boolean z12 = set != null && set.contains(typeParameterDescriptor3);
                            if (starProjectionImpl3 == null || z12) {
                                starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                            } else {
                                TypeSubstitution substitution3 = substitutor.getSubstitution();
                                KotlinType type6 = starProjectionImpl3.getType();
                                AbstractC16544l.m18093f(type6, "getType(...)");
                                if (substitution3.mo22592get(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(typeParameterDescriptor3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    unwrappedTypeReplace$default = TypeSubstitutionKt.replace$default(simpleType, arrayList3, null, 2, null);
                }
            }
            KotlinType kotlinTypeSafeSubstitute = substitutor.safeSubstitute(TypeWithEnhancementKt.inheritEnhancement(unwrappedTypeReplace$default, unwrappedTypeUnwrap), Variance.OUT_VARIANCE);
            AbstractC16544l.m18093f(kotlinTypeSafeSubstitute, "safeSubstitute(...)");
            return kotlinTypeSafeSubstitute;
        }
    }

    public TypeParameterUpperBoundEraser(ErasureProjectionComputer projectionComputer, TypeParameterErasureOptions options) {
        AbstractC16544l.m18094g(projectionComputer, "projectionComputer");
        AbstractC16544l.m18094g(options, "options");
        this.f53208a = projectionComputer;
        this.f53209b = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f53210c = AbstractC9227W.m9800c(new C18515b(this, 2));
        MemoizedFunctionToNotNull memoizedFunctionToNotNullCreateMemoizedFunction = lockBasedStorageManager.createMemoizedFunction(new C1756x(this, 28));
        AbstractC16544l.m18093f(memoizedFunctionToNotNullCreateMemoizedFunction, "createMemoizedFunction(...)");
        this.f53211d = memoizedFunctionToNotNullCreateMemoizedFunction;
    }

    /* JADX INFO: renamed from: a */
    public final KotlinType m18425a(ErasureTypeAttributes erasureTypeAttributes) {
        KotlinType kotlinTypeReplaceArgumentsWithStarProjections;
        SimpleType defaultType = erasureTypeAttributes.getDefaultType();
        return (defaultType == null || (kotlinTypeReplaceArgumentsWithStarProjections = TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) == null) ? (ErrorType) this.f53210c.getValue() : kotlinTypeReplaceArgumentsWithStarProjections;
    }

    /* JADX INFO: renamed from: b */
    public final C18240g m18426b(TypeSubstitutor typeSubstitutor, List list, ErasureTypeAttributes erasureTypeAttributes) {
        C18240g c18240g = new C18240g();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            KotlinType kotlinType = (KotlinType) it.next();
            ClassifierDescriptor classifierDescriptorMo22589getDeclarationDescriptor = kotlinType.getConstructor().mo22589getDeclarationDescriptor();
            boolean z6 = classifierDescriptorMo22589getDeclarationDescriptor instanceof ClassDescriptor;
            TypeParameterErasureOptions typeParameterErasureOptions = this.f53209b;
            if (z6) {
                c18240g.add(Companion.replaceArgumentsOfUpperBound(kotlinType, typeSubstitutor, erasureTypeAttributes.getVisitedTypeParameters(), typeParameterErasureOptions.getLeaveNonTypeParameterTypes()));
            } else if (classifierDescriptorMo22589getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                Set<TypeParameterDescriptor> visitedTypeParameters = erasureTypeAttributes.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(classifierDescriptorMo22589getDeclarationDescriptor)) {
                    List<KotlinType> upperBounds = ((TypeParameterDescriptor) classifierDescriptorMo22589getDeclarationDescriptor).getUpperBounds();
                    AbstractC16544l.m18093f(upperBounds, "getUpperBounds(...)");
                    c18240g.addAll(m18426b(typeSubstitutor, upperBounds, erasureTypeAttributes));
                } else {
                    c18240g.add(m18425a(erasureTypeAttributes));
                }
            }
            if (!typeParameterErasureOptions.getIntersectUpperBounds()) {
                break;
            }
        }
        return AbstractC17665J.m19262b(c18240g);
    }

    public final KotlinType getErasedUpperBound(TypeParameterDescriptor typeParameter, ErasureTypeAttributes typeAttr) {
        AbstractC16544l.m18094g(typeParameter, "typeParameter");
        AbstractC16544l.m18094g(typeAttr, "typeAttr");
        Object objInvoke = this.f53211d.invoke(new C18524k(typeParameter, typeAttr));
        AbstractC16544l.m18093f(objInvoke, "invoke(...)");
        return (KotlinType) objInvoke;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(ErasureProjectionComputer erasureProjectionComputer, TypeParameterErasureOptions typeParameterErasureOptions, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(erasureProjectionComputer, (i10 & 2) != 0 ? new TypeParameterErasureOptions(false, false) : typeParameterErasureOptions);
    }
}
