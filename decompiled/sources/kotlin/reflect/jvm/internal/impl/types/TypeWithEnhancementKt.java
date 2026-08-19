package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import p025An.C0644w;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeWithEnhancementKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final KotlinType getEnhancement(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        if (kotlinType instanceof TypeWithEnhancement) {
            return ((TypeWithEnhancement) kotlinType).getEnhancement();
        }
        return null;
    }

    public static final UnwrappedType inheritEnhancement(UnwrappedType unwrappedType, KotlinType origin, InterfaceC1436k transform) {
        AbstractC16544l.m18094g(unwrappedType, "<this>");
        AbstractC16544l.m18094g(origin, "origin");
        AbstractC16544l.m18094g(transform, "transform");
        KotlinType enhancement = getEnhancement(origin);
        return wrapEnhancement(unwrappedType, enhancement != null ? (KotlinType) transform.invoke(enhancement) : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final UnwrappedType wrapEnhancement(UnwrappedType unwrappedType, KotlinType kotlinType) {
        AbstractC16544l.m18094g(unwrappedType, "<this>");
        if (unwrappedType instanceof TypeWithEnhancement) {
            return wrapEnhancement(((TypeWithEnhancement) unwrappedType).getOrigin(), kotlinType);
        }
        if (kotlinType == null || kotlinType.equals(unwrappedType)) {
            return unwrappedType;
        }
        if (unwrappedType instanceof SimpleType) {
            return new SimpleTypeWithEnhancement((SimpleType) unwrappedType, kotlinType);
        }
        if (unwrappedType instanceof FlexibleType) {
            return new FlexibleTypeWithEnhancement((FlexibleType) unwrappedType, kotlinType);
        }
        throw new C0644w();
    }

    public static final UnwrappedType inheritEnhancement(UnwrappedType unwrappedType, KotlinType origin) {
        AbstractC16544l.m18094g(unwrappedType, "<this>");
        AbstractC16544l.m18094g(origin, "origin");
        return wrapEnhancement(unwrappedType, getEnhancement(origin));
    }
}
