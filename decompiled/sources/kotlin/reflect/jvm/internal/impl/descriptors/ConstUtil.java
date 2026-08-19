package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes2.dex */
public final class ConstUtil {
    public static final ConstUtil INSTANCE = new ConstUtil();

    public static final boolean canBeUsedForConstVal(KotlinType type) {
        AbstractC16544l.m18094g(type, "type");
        return ConstUtilKt.canBeUsedForConstVal(type);
    }
}
