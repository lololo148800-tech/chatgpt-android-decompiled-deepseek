package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.jvm.internal.AbstractC16544l;
import p225Im.InterfaceC3776x;

/* JADX INFO: loaded from: classes2.dex */
public final class StorageKt {
    public static final <T> T getValue(NotNullLazyValue<? extends T> notNullLazyValue, Object obj, InterfaceC3776x p10) {
        AbstractC16544l.m18094g(notNullLazyValue, "<this>");
        AbstractC16544l.m18094g(p10, "p");
        return (T) notNullLazyValue.invoke();
    }

    public static final <T> T getValue(NullableLazyValue<? extends T> nullableLazyValue, Object obj, InterfaceC3776x p10) {
        AbstractC16544l.m18094g(nullableLazyValue, "<this>");
        AbstractC16544l.m18094g(p10, "p");
        return (T) nullableLazyValue.invoke();
    }
}
