package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16553u;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import p225Im.InterfaceC3776x;
import p298Lm.C5140G;
import p509Uk.lpqL.SfpOlmlMATQ;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ InterfaceC3776x[] f51814h = {AbstractC16526C.f51263a.mo5699h(new C16553u(JavaRetentionAnnotationDescriptor.class, "allValueArguments", SfpOlmlMATQ.eJRlIlBJbyfSr, 0))};

    /* JADX INFO: renamed from: g */
    public final NotNullLazyValue f51815g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c9) {
        super(c9, annotation, StandardNames.FqNames.retention);
        AbstractC16544l.m18094g(annotation, "annotation");
        AbstractC16544l.m18094g(c9, "c");
        this.f51815g = c9.getStorageManager().createLazyValue(new C5140G(this, 16));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public Map<Name, ConstantValue<?>> getAllValueArguments() {
        return (Map) StorageKt.getValue(this.f51815g, this, f51814h[0]);
    }
}
