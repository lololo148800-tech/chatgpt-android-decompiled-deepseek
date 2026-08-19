package p648an;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import p909nm.C17688v;

/* JADX INFO: renamed from: an.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C10755c implements Annotations {

    /* JADX INFO: renamed from: Y */
    public final FqName f31959Y;

    public C10755c(FqName fqNameToMatch) {
        AbstractC16544l.m18094g(fqNameToMatch, "fqNameToMatch");
        this.f31959Y = fqNameToMatch;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    /* JADX INFO: renamed from: findAnnotation */
    public final AnnotationDescriptor mo22585findAnnotation(FqName fqName) {
        AbstractC16544l.m18094g(fqName, "fqName");
        if (fqName.equals(this.f31959Y)) {
            return C10754b.f31958a;
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean hasAnnotation(FqName fqName) {
        return Annotations.DefaultImpls.hasAnnotation(this, fqName);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator<AnnotationDescriptor> iterator() {
        return C17688v.f56479Y;
    }
}
