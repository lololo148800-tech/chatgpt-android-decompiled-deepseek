package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1426a;

/* JADX INFO: loaded from: classes2.dex */
public final class NonEmptyDeserializedAnnotations extends DeserializedAnnotations {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NonEmptyDeserializedAnnotations(StorageManager storageManager, InterfaceC1426a compute) {
        super(storageManager, compute);
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(compute, "compute");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedAnnotations, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return false;
    }
}
