package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsKt {
    public static final Annotations composeAnnotations(Annotations first, Annotations second) {
        AbstractC16544l.m18094g(first, "first");
        AbstractC16544l.m18094g(second, "second");
        if (first.isEmpty()) {
            return second;
        }
        return second.isEmpty() ? first : new CompositeAnnotations(first, second);
    }
}
