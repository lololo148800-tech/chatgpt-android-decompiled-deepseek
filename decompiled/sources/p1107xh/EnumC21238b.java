package p1107xh;

import p523V9.AbstractC7877E4;
import p846k4.C16340i;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 xh.b[], still in use, count: 1, list:
  (r14v3 xh.b[]) from 0x0045: INVOKE (r14v3 xh.b[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:70)
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
/* JADX INFO: renamed from: xh.b */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21238b {
    /* JADX INFO: Fake field, exist only in values array */
    CODE_INTERPRETER("CODE_INTERPRETER"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIMODAL("MULTIMODAL"),
    /* JADX INFO: Fake field, exist only in values array */
    RETRIEVAL("RETRIEVAL"),
    /* JADX INFO: Fake field, exist only in values array */
    CONTEXT_CONNECTOR("CONTEXT_CONNECTOR"),
    /* JADX INFO: Fake field, exist only in values array */
    MULTIMODAL_AUDIO("MULTIMODAL_AUDIO"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C16340i f67556Z = new C16340i();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67557o0 = new C17871x("AttachmentsType", AbstractC17681o.m19382k("CODE_INTERPRETER", "MULTIMODAL", "RETRIEVAL", "CONTEXT_CONNECTOR", "MULTIMODAL_AUDIO"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67560r0;

    /* JADX INFO: renamed from: Y */
    public final String f67561Y;

    static {
        f67560r0 = AbstractC7877E4.m8156j(new EnumC21238b[]{r0, r3, r6, r9, r12, r15});
    }

    public EnumC21238b(String str) {
        super(str, i);
        this.f67561Y = str;
    }

    public static EnumC21238b valueOf(String str) {
        return (EnumC21238b) Enum.valueOf(EnumC21238b.class, str);
    }

    public static EnumC21238b[] values() {
        return (EnumC21238b[]) f67559q0.clone();
    }
}
