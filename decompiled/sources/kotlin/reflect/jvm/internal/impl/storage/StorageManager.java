package kotlin.reflect.jvm.internal.impl.storage;

import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;

/* JADX INFO: loaded from: classes2.dex */
public interface StorageManager {
    <T> T compute(InterfaceC1426a interfaceC1426a);

    <K, V> CacheWithNotNullValues<K, V> createCacheWithNotNullValues();

    <K, V> CacheWithNullableValues<K, V> createCacheWithNullableValues();

    <T> NotNullLazyValue<T> createLazyValue(InterfaceC1426a interfaceC1426a);

    <T> NotNullLazyValue<T> createLazyValueWithPostCompute(InterfaceC1426a interfaceC1426a, InterfaceC1436k interfaceC1436k, InterfaceC1436k interfaceC1436k2);

    <K, V> MemoizedFunctionToNotNull<K, V> createMemoizedFunction(InterfaceC1436k interfaceC1436k);

    <K, V> MemoizedFunctionToNullable<K, V> createMemoizedFunctionWithNullableValues(InterfaceC1436k interfaceC1436k);

    <T> NullableLazyValue<T> createNullableLazyValue(InterfaceC1426a interfaceC1426a);

    <T> NotNullLazyValue<T> createRecursionTolerantLazyValue(InterfaceC1426a interfaceC1426a, T t10);
}
