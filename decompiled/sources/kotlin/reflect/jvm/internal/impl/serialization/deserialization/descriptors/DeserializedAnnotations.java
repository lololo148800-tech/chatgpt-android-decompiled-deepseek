package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import p049Bm.InterfaceC1426a;
import p225Im.InterfaceC3776x;

/* JADX INFO: loaded from: classes2.dex */
public class DeserializedAnnotations implements Annotations {

    /* JADX INFO: renamed from: Z */
    public static final /* synthetic */ InterfaceC3776x[] f53062Z = {AbstractC16526C.f51263a.mo5699h(new C16553u(DeserializedAnnotations.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* JADX INFO: renamed from: Y */
    public final NotNullLazyValue f53063Y;

    public DeserializedAnnotations(StorageManager storageManager, InterfaceC1426a compute) {
        AbstractC16544l.m18094g(storageManager, "storageManager");
        AbstractC16544l.m18094g(compute, "compute");
        this.f53063Y = storageManager.createLazyValue(compute);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.findAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return ((List) StorageKt.getValue(this.f53063Y, this, f53062Z[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return ((List) StorageKt.getValue(this.f53063Y, this, f53062Z[0])).iterator();
    }
}
