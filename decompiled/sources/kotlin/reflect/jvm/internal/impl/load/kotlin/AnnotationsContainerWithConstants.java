package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationsContainerWithConstants<A, C> extends AbstractBinaryClassAnnotationLoader.AnnotationsContainer<A> {

    /* JADX INFO: renamed from: a */
    public final Map f52022a;

    /* JADX INFO: renamed from: b */
    public final Map f52023b;

    /* JADX INFO: renamed from: c */
    public final Map f52024c;

    public AnnotationsContainerWithConstants(Map<MemberSignature, ? extends List<? extends A>> memberAnnotations, Map<MemberSignature, ? extends C> propertyConstants, Map<MemberSignature, ? extends C> annotationParametersDefaultValues) {
        AbstractC16544l.m18094g(memberAnnotations, "memberAnnotations");
        AbstractC16544l.m18094g(propertyConstants, "propertyConstants");
        AbstractC16544l.m18094g(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f52022a = memberAnnotations;
        this.f52023b = propertyConstants;
        this.f52024c = annotationParametersDefaultValues;
    }

    public final Map<MemberSignature, C> getAnnotationParametersDefaultValues() {
        return this.f52024c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.AnnotationsContainer
    public Map<MemberSignature, List<A>> getMemberAnnotations() {
        return this.f52022a;
    }

    public final Map<MemberSignature, C> getPropertyConstants() {
        return this.f52023b;
    }
}
