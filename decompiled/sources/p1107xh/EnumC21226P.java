package p1107xh;

import p523V9.AbstractC7877E4;
import p867l8.C16831c;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v4 xh.P[], still in use, count: 1, list:
  (r6v4 xh.P[]) from 0x009e: INVOKE (r6v4 xh.P[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:159)
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
/* JADX INFO: renamed from: xh.P */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21226P {
    /* JADX INFO: Fake field, exist only in values array */
    PYTHON("PYTHON"),
    /* JADX INFO: Fake field, exist only in values array */
    RETRIEVAL("RETRIEVAL"),
    /* JADX INFO: Fake field, exist only in values array */
    BROWSER("BROWSER"),
    /* JADX INFO: Fake field, exist only in values array */
    FUNCTION("FUNCTION"),
    /* JADX INFO: Fake field, exist only in values array */
    DALLE("DALLE"),
    /* JADX INFO: Fake field, exist only in values array */
    PLUGIN("PLUGIN"),
    /* JADX INFO: Fake field, exist only in values array */
    PARALLEL_BROWSE("PARALLEL_BROWSE"),
    /* JADX INFO: Fake field, exist only in values array */
    MEMORY("MEMORY"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_CONNECTOR("CONTEXT_CONNECTOR"),
    /* JADX INFO: Fake field, exist only in values array */
    JIT_PLUGIN("JIT_PLUGIN"),
    /* JADX INFO: Fake field, exist only in values array */
    GIZMO_CONTACTS("GIZMO_CONTACTS"),
    /* JADX INFO: Fake field, exist only in values array */
    INTENT("INTENT"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C16831c f67524Z = new C16831c();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67525o0 = new C17871x("GizmoToolType", AbstractC17681o.m19382k("PYTHON", "RETRIEVAL", "BROWSER", "FUNCTION", "DALLE", "PLUGIN", "PARALLEL_BROWSE", "MEMORY", "CONTEXT_CONNECTOR", "JIT_PLUGIN", "GIZMO_CONTACTS", "INTENT"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67528r0;

    /* JADX INFO: renamed from: Y */
    public final String f67529Y;

    static {
        f67528r0 = AbstractC7877E4.m8156j(new EnumC21226P[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r14, r12, r10, r8});
    }

    public EnumC21226P(String str) {
        super(str, i);
        this.f67529Y = str;
    }

    public static EnumC21226P valueOf(String str) {
        return (EnumC21226P) Enum.valueOf(EnumC21226P.class, str);
    }

    public static EnumC21226P[] values() {
        return (EnumC21226P[]) f67527q0.clone();
    }
}
