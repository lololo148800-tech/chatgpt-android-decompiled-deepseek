package p1107xh;

import p523V9.AbstractC7877E4;
import p846k4.C16340i;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v4 xh.I[], still in use, count: 1, list:
  (r8v4 xh.I[]) from 0x009e: INVOKE (r8v4 xh.I[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:159)
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
/* JADX INFO: renamed from: xh.I */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21219I {
    FIRST_PARTY("FIRST_PARTY"),
    USES_FUNCTION_CALLS("USES_FUNCTION_CALLS"),
    REPORTABLE("REPORTABLE"),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE("PRIVATE"),
    /* JADX INFO: Fake field, exist only in values array */
    WORKSPACE("WORKSPACE"),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC("PUBLIC"),
    /* JADX INFO: Fake field, exist only in values array */
    BETA("BETA"),
    PINNED("PINNED"),
    WORKSPACE_DISABLED("WORKSPACE_DISABLED"),
    INTERACTIONS_DISABLED("INTERACTIONS_DISABLED"),
    UNREVIEWABLE("UNREVIEWABLE"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C16340i f67500Z = new C16340i();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67501o0 = new C17871x("GizmoTag", AbstractC17681o.m19382k("FIRST_PARTY", "USES_FUNCTION_CALLS", "REPORTABLE", "PRIVATE", "WORKSPACE", "PUBLIC", "BETA", "PINNED", "WORKSPACE_DISABLED", "INTERACTIONS_DISABLED", "UNREVIEWABLE"));

    /* JADX INFO: renamed from: y0 */
    public static final /* synthetic */ C20007b f67511y0;

    /* JADX INFO: renamed from: Y */
    public final String f67512Y;

    static {
        f67511y0 = AbstractC7877E4.m8156j(new EnumC21219I[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10});
    }

    public EnumC21219I(String str) {
        super(str, i);
        this.f67512Y = str;
    }

    public static EnumC21219I valueOf(String str) {
        return (EnumC21219I) Enum.valueOf(EnumC21219I.class, str);
    }

    public static EnumC21219I[] values() {
        return (EnumC21219I[]) f67510x0.clone();
    }
}
