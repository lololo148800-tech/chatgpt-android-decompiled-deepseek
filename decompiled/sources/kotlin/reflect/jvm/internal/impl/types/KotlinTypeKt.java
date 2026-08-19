package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;

/* JADX INFO: loaded from: classes2.dex */
public final class KotlinTypeKt {
    public static final boolean isError(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        UnwrappedType unwrappedTypeUnwrap = kotlinType.unwrap();
        return (unwrappedTypeUnwrap instanceof ErrorType) || ((unwrappedTypeUnwrap instanceof FlexibleType) && (((FlexibleType) unwrappedTypeUnwrap).getDelegate() instanceof ErrorType));
    }

    public static final boolean isNullable(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return TypeUtils.isNullableType(kotlinType);
    }
}
