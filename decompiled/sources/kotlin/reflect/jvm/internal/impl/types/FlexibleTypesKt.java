package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;

/* JADX INFO: loaded from: classes2.dex */
public final class FlexibleTypesKt {
    public static final FlexibleType asFlexibleType(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        AbstractC16544l.m18092e(unwrappedTypeUnwrap, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return (FlexibleType) unwrappedTypeUnwrap;
    }

    public static final boolean isFlexible(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof FlexibleType;
    }

    public static final SimpleType lowerIfFlexible(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeUnwrap).getLowerBound();
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return (SimpleType) unwrappedTypeUnwrap;
        }
        throw new C0644w();
    }

    public static final SimpleType upperIfFlexible(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        if (unwrappedTypeUnwrap instanceof FlexibleType) {
            return ((FlexibleType) unwrappedTypeUnwrap).getUpperBound();
        }
        if (unwrappedTypeUnwrap instanceof SimpleType) {
            return (SimpleType) unwrappedTypeUnwrap;
        }
        throw new C0644w();
    }
}
