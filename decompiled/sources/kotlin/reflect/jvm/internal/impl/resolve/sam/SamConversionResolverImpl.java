package kotlin.reflect.jvm.internal.impl.resolve.sam;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNullableValues;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;

/* JADX INFO: loaded from: classes2.dex */
public final class SamConversionResolverImpl implements SamConversionResolver {

    /* JADX INFO: renamed from: a */
    public final Iterable f52912a;

    /* JADX INFO: renamed from: b */
    public final CacheWithNullableValues f52913b;

    public SamConversionResolverImpl(StorageManager storageManager, Iterable<? extends Object> samWithReceiverResolvers) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f52912a = samWithReceiverResolvers;
        this.f52913b = storageManager.createCacheWithNullableValues();
    }
}
