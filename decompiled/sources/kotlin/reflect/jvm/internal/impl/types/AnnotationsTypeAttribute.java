package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import p225Im.InterfaceC3756d;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsTypeAttribute extends TypeAttribute<AnnotationsTypeAttribute> {

    /* JADX INFO: renamed from: a */
    public final Annotations f53145a;

    public AnnotationsTypeAttribute(Annotations annotations) {
        AbstractC16544l.m18094g(annotations, "annotations");
        this.f53145a = annotations;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AnnotationsTypeAttribute) {
            return AbstractC16544l.m18089b(((AnnotationsTypeAttribute) obj).f53145a, this.f53145a);
        }
        return false;
    }

    public final Annotations getAnnotations() {
        return this.f53145a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public InterfaceC3756d getKey() {
        return AbstractC16526C.f51263a.mo5693b(AnnotationsTypeAttribute.class);
    }

    public int hashCode() {
        return this.f53145a.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute add(AnnotationsTypeAttribute annotationsTypeAttribute) {
        return annotationsTypeAttribute == null ? this : new AnnotationsTypeAttribute(AnnotationsKt.composeAnnotations(this.f53145a, annotationsTypeAttribute.f53145a));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeAttribute
    public AnnotationsTypeAttribute intersect(AnnotationsTypeAttribute annotationsTypeAttribute) {
        if (AbstractC16544l.m18089b(annotationsTypeAttribute, this)) {
            return this;
        }
        return null;
    }
}
