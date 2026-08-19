package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class DynamicTypesKt {
    public static final boolean isDynamic(KotlinType kotlinType) {
        AbstractC16544l.m18094g(kotlinType, "<this>");
        return kotlinType.unwrap() instanceof DynamicType;
    }
}
