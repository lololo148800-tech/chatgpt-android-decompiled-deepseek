package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.TypeAttribute;
import p225Im.InterfaceC3756d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeAttribute<T extends TypeAttribute<? extends T>> {
    public abstract T add(T t10);

    public abstract InterfaceC3756d getKey();

    public abstract T intersect(T t10);
}
