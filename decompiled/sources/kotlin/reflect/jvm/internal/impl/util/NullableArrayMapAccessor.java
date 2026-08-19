package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.AbstractC16544l;
import p128Em.InterfaceC2579b;
import p225Im.InterfaceC3776x;

/* JADX INFO: loaded from: classes2.dex */
public final class NullableArrayMapAccessor<K, V, T extends V> extends AbstractArrayMapOwner.AbstractArrayMapAccessor<K, V, T> implements InterfaceC2579b {
    public NullableArrayMapAccessor(int i10) {
        super(i10);
    }

    @Override // p128Em.InterfaceC2579b
    public T getValue(AbstractArrayMapOwner<K, V> thisRef, InterfaceC3776x property) {
        AbstractC16544l.m18094g(thisRef, "thisRef");
        AbstractC16544l.m18094g(property, "property");
        return (T) thisRef.mo18443f().get(this.f53280a);
    }
}
