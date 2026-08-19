package kotlin.reflect.jvm.internal.impl.renderer;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[], still in use, count: 1, list:
  (r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) from 0x0029: INVOKE (r3v1 kotlin.reflect.jvm.internal.impl.renderer.AnnotationArgumentsRenderingPolicy[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:42)
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
public final class AnnotationArgumentsRenderingPolicy {
    NO_ARGUMENTS("NO_ARGUMENTS", (boolean) (0 == true ? 1 : 0)),
    UNLESS_EMPTY("UNLESS_EMPTY", (boolean) (1 == true ? 1 : 0)),
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: Y */
    public final boolean f52781Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f52782Z;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        AbstractC7877E4.m8156j(annotationArgumentsRenderingPolicyArr);
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, boolean z6) {
        this((i & 1) != 0 ? false : z6, false);
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) f52780o0.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.f52781Y;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.f52782Z;
    }

    public AnnotationArgumentsRenderingPolicy(boolean z6, boolean z10) {
        super(str, i);
        this.f52781Y = z6;
        this.f52782Z = z10;
    }
}
