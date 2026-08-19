package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifierWithMigrationStatus;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import mm.C17309l;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17659D;
import p909nm.AbstractC17681o;

/* JADX INFO: loaded from: classes2.dex */
public final class JavaDefaultQualifiersKt {

    /* JADX INFO: renamed from: a */
    public static final List f51734a;

    /* JADX INFO: renamed from: b */
    public static final List f51735b;

    /* JADX INFO: renamed from: c */
    public static final Object f51736c;

    /* JADX INFO: renamed from: d */
    public static final Object f51737d;

    /* JADX INFO: renamed from: e */
    public static final LinkedHashMap f51738e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List listM19382k = AbstractC17681o.m19382k(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f51734a = listM19382k;
        List listM9974d = AbstractC9393x3.m9974d(annotationQualifierApplicabilityType);
        f51735b = listM9974d;
        FqName jspecify_old_null_marked_annotation_fq_name = JvmAnnotationNamesKt.getJSPECIFY_OLD_NULL_MARKED_ANNOTATION_FQ_NAME();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        List list = listM19382k;
        Map mapM19244f = AbstractC17659D.m19244f(new C17309l(jspecify_old_null_marked_annotation_fq_name, new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), list, false)), new C17309l(JvmAnnotationNamesKt.getJSPECIFY_NULL_MARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), list, false)), new C17309l(JvmAnnotationNamesKt.getJSPECIFY_NULL_UNMARKED_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), list, false, 4, null)));
        f51736c = mapM19244f;
        List list2 = listM9974d;
        Map mapM19244f2 = AbstractC17659D.m19244f(new C17309l(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NONNULL_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(nullabilityQualifier, false, 2, null), list2, false, 4, null)), new C17309l(JvmAnnotationNamesKt.getJAVAX_PARAMETERS_ARE_NULLABLE_BY_DEFAULT_ANNOTATION_FQ_NAME(), new JavaDefaultQualifiers(new NullabilityQualifierWithMigrationStatus(NullabilityQualifier.NULLABLE, false, 2, null), list2, false, 4, null)));
        f51737d = mapM19244f2;
        f51738e = AbstractC17659D.m19248j(mapM19244f, mapM19244f2);
    }

    public static final Map<FqName, JavaDefaultQualifiers> getBUILT_IN_TYPE_QUALIFIER_DEFAULT_ANNOTATIONS() {
        return f51738e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<kotlin.reflect.jvm.internal.impl.name.FqName, kotlin.reflect.jvm.internal.impl.load.java.JavaDefaultQualifiers>] */
    public static final Map<FqName, JavaDefaultQualifiers> getJSPECIFY_DEFAULT_ANNOTATIONS() {
        return f51736c;
    }
}
