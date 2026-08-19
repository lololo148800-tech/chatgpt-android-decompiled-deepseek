package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType;
import p909nm.AbstractC17682p;

/* JADX INFO: loaded from: classes2.dex */
public final class SpecialTypesKt {
    /* JADX INFO: renamed from: a */
    public static final SimpleType m18418a(UnwrappedType unwrappedType) {
        IntersectionTypeConstructor alternative;
        TypeConstructor constructor = unwrappedType.getConstructor();
        IntersectionTypeConstructor intersectionTypeConstructor = constructor instanceof IntersectionTypeConstructor ? (IntersectionTypeConstructor) constructor : null;
        if (intersectionTypeConstructor == null) {
            return null;
        }
        Collection<KotlinType> supertypes = intersectionTypeConstructor.getSupertypes();
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(supertypes, 10));
        boolean z6 = false;
        for (KotlinType kotlinTypeMakeDefinitelyNotNullOrNotNull$default : supertypes) {
            if (TypeUtils.isNullableType(kotlinTypeMakeDefinitelyNotNullOrNotNull$default)) {
                kotlinTypeMakeDefinitelyNotNullOrNotNull$default = makeDefinitelyNotNullOrNotNull$default(kotlinTypeMakeDefinitelyNotNullOrNotNull$default.unwrap(), false, 1, null);
                z6 = true;
            }
            arrayList.add(kotlinTypeMakeDefinitelyNotNullOrNotNull$default);
        }
        if (z6) {
            KotlinType alternativeType = intersectionTypeConstructor.getAlternativeType();
            if (alternativeType == null) {
                alternativeType = null;
            } else if (TypeUtils.isNullableType(alternativeType)) {
                alternativeType = makeDefinitelyNotNullOrNotNull$default(alternativeType.unwrap(), false, 1, null);
            }
            alternative = new IntersectionTypeConstructor(arrayList).setAlternative(alternativeType);
        } else {
            alternative = null;
        }
        if (alternative == null) {
            return null;
        }
        return alternative.createType();
    }

    public static final AbbreviatedType getAbbreviatedType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof AbbreviatedType) {
            return (AbbreviatedType) unwrappedTypeUnwrap;
        }
        return null;
    }

    public static final SimpleType getAbbreviation(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        AbbreviatedType abbreviatedType = getAbbreviatedType(kotlinType);
        if (abbreviatedType != null) {
            return abbreviatedType.getAbbreviation();
        }
        return null;
    }

    public static final boolean isDefinitelyNotNullType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DefinitelyNotNullType;
    }

    public static final UnwrappedType makeDefinitelyNotNullOrNotNull(UnwrappedType unwrappedType, boolean z6) {
        AbstractC16544l.m18094g(unwrappedType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, unwrappedType, z6, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeM18418a = m18418a(unwrappedType);
        return simpleTypeM18418a != null ? simpleTypeM18418a : unwrappedType.makeNullableAsSpecified(false);
    }

    public static /* synthetic */ UnwrappedType makeDefinitelyNotNullOrNotNull$default(UnwrappedType unwrappedType, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        return makeDefinitelyNotNullOrNotNull(unwrappedType, z6);
    }

    public static final SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull(SimpleType simpleType, boolean z6) {
        AbstractC16544l.m18094g(simpleType, "<this>");
        DefinitelyNotNullType definitelyNotNullTypeMakeDefinitelyNotNull$default = DefinitelyNotNullType.Companion.makeDefinitelyNotNull$default(DefinitelyNotNullType.Companion, simpleType, z6, false, 4, null);
        if (definitelyNotNullTypeMakeDefinitelyNotNull$default != null) {
            return definitelyNotNullTypeMakeDefinitelyNotNull$default;
        }
        SimpleType simpleTypeM18418a = m18418a(simpleType);
        return simpleTypeM18418a == null ? simpleType.makeNullableAsSpecified(false) : simpleTypeM18418a;
    }

    public static /* synthetic */ SimpleType makeSimpleTypeDefinitelyNotNullOrNotNull$default(SimpleType simpleType, boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = false;
        }
        return makeSimpleTypeDefinitelyNotNullOrNotNull(simpleType, z6);
    }

    public static final SimpleType withAbbreviation(SimpleType simpleType, SimpleType abbreviatedType) {
        AbstractC16544l.m18094g(simpleType, "<this>");
        AbstractC16544l.m18094g(abbreviatedType, "abbreviatedType");
        return KotlinTypeKt.isError(simpleType) ? simpleType : new AbbreviatedType(simpleType, abbreviatedType);
    }

    public static final NewCapturedType withNotNullProjection(NewCapturedType newCapturedType) {
        AbstractC16544l.m18094g(newCapturedType, "<this>");
        return new NewCapturedType(newCapturedType.getCaptureStatus(), newCapturedType.getConstructor(), newCapturedType.getLowerType(), newCapturedType.getAttributes(), newCapturedType.isMarkedNullable(), true);
    }
}
