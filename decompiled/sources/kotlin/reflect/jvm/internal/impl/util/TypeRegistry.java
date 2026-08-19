package kotlin.reflect.jvm.internal.impl.util;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p1047un.C20393b;
import p225Im.InterfaceC3756d;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f53302a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f53303b = new AtomicInteger(0);

    public final Map<String, Integer> allValuesThreadUnsafeForRendering() {
        return this.f53302a;
    }

    public abstract int customComputeIfAbsent(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, InterfaceC1436k interfaceC1436k);

    public final <T extends V, KK extends K> NullableArrayMapAccessor<K, V, T> generateNullableAccessor(InterfaceC3756d kClass) {
        AbstractC16544l.m18094g(kClass, "kClass");
        return new NullableArrayMapAccessor<>(getId(kClass));
    }

    public final <T extends K> int getId(InterfaceC3756d kClass) {
        AbstractC16544l.m18094g(kClass, "kClass");
        String strMo4447a = kClass.mo4447a();
        AbstractC16544l.m18091d(strMo4447a);
        return getId(strMo4447a);
    }

    public final int getId(String keyQualifiedName) {
        AbstractC16544l.m18094g(keyQualifiedName, "keyQualifiedName");
        return customComputeIfAbsent(this.f53302a, keyQualifiedName, new C20393b(this));
    }
}
