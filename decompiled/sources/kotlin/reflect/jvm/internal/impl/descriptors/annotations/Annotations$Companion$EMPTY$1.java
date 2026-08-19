package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.C17688v;

/* JADX INFO: loaded from: classes2.dex */
public final class Annotations$Companion$EMPTY$1 implements Annotations {
    public Void findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<AnnotationDescriptor> iterator() {
        return C17688v.f56479Y;
    }

    public String toString() {
        return "EMPTY";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        return (AnnotationDescriptor) findAnnotation(fqName);
    }
}
