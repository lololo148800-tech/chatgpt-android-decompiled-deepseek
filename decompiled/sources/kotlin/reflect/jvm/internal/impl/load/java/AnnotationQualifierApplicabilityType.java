package kotlin.reflect.jvm.internal.impl.load.java;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[], still in use, count: 1, list:
  (r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) from 0x0051: INVOKE (r10v3 kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:82)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class AnnotationQualifierApplicabilityType {
    METHOD_RETURN_TYPE("METHOD"),
    VALUE_PARAMETER("PARAMETER"),
    FIELD("FIELD"),
    TYPE_USE("TYPE_USE"),
    TYPE_PARAMETER_BOUNDS("TYPE_USE"),
    TYPE_PARAMETER("TYPE_PARAMETER");


    /* JADX INFO: renamed from: Y */
    public final String f51720Y;

    static {
        AbstractC7877E4.m8156j(annotationQualifierApplicabilityTypeArr);
    }

    public AnnotationQualifierApplicabilityType(String str) {
        super(str, i);
        this.f51720Y = str;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) f51719Z.clone();
    }

    public final String getJavaTarget() {
        return this.f51720Y;
    }
}
