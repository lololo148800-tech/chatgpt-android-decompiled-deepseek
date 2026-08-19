package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[], still in use, count: 1, list:
  (r1v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) from 0x0082: INVOKE (r1v3 kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationUseSiteTarget[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:131)
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
public final class AnnotationUseSiteTarget {
    FIELD(null),
    FILE(null),
    PROPERTY(null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: Y */
    public final String f51429Y;

    static {
        AbstractC7877E4.m8156j(annotationUseSiteTargetArr);
    }

    public AnnotationUseSiteTarget(String str) {
        super(str, i);
        this.f51429Y = str == null ? CapitalizeDecapitalizeKt.toLowerCaseAsciiOnly(name()) : str;
    }

    public static AnnotationUseSiteTarget valueOf(String str) {
        return (AnnotationUseSiteTarget) Enum.valueOf(AnnotationUseSiteTarget.class, str);
    }

    public static AnnotationUseSiteTarget[] values() {
        return (AnnotationUseSiteTarget[]) f51428Z.clone();
    }

    public final String getRenderName() {
        return this.f51429Y;
    }
}
