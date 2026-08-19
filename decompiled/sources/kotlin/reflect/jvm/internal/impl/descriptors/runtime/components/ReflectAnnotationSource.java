package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceFile;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectAnnotationSource implements SourceElement {

    /* JADX INFO: renamed from: a */
    public final Annotation f51662a;

    public ReflectAnnotationSource(Annotation annotation) {
        AbstractC16544l.m18094g(annotation, "annotation");
        this.f51662a = annotation;
    }

    public final Annotation getAnnotation() {
        return this.f51662a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.SourceElement
    public SourceFile getContainingFile() {
        SourceFile NO_SOURCE_FILE = SourceFile.NO_SOURCE_FILE;
        AbstractC16544l.m18093f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }
}
