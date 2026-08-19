package kotlin.reflect.jvm.internal.impl.load.java;

import cn.UfGr.EhBykzn;
import java.util.EnumMap;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaTypeQualifiersByElementType {

    /* JADX INFO: renamed from: a */
    public final EnumMap f51752a;

    public final JavaDefaultQualifiers get(AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return (JavaDefaultQualifiers) this.f51752a.get(annotationQualifierApplicabilityType);
    }

    public final EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> getDefaultQualifiers() {
        return this.f51752a;
    }

    public JavaTypeQualifiersByElementType(EnumMap<AnnotationQualifierApplicabilityType, JavaDefaultQualifiers> enumMap) {
        AbstractC16544l.m18094g(enumMap, EhBykzn.UmwVq);
        this.f51752a = enumMap;
    }
}
