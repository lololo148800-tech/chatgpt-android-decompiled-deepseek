package p1107xh;

import p523V9.AbstractC7877E4;
import p885m4.C17151a;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 xh.B[], still in use, count: 1, list:
  (r10v2 xh.B[]) from 0x002f: INVOKE (r10v2 xh.B[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:48)
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
/* JADX INFO: renamed from: xh.B */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21212B {
    /* JADX INFO: Fake field, exist only in values array */
    VALID("VALID"),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED("EXPIRED"),
    /* JADX INFO: Fake field, exist only in values array */
    MISSING("MISSING"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C17151a f67480Z = new C17151a();

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67481o0 = new C17871x("GizmoOauthStatus", AbstractC17681o.m19382k("VALID", "EXPIRED", "MISSING"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67484r0;

    /* JADX INFO: renamed from: Y */
    public final String f67485Y;

    static {
        f67484r0 = AbstractC7877E4.m8156j(new EnumC21212B[]{r0, r3, r6, r9});
    }

    public EnumC21212B(String str) {
        super(str, i);
        this.f67485Y = str;
    }

    public static EnumC21212B valueOf(String str) {
        return (EnumC21212B) Enum.valueOf(EnumC21212B.class, str);
    }

    public static EnumC21212B[] values() {
        return (EnumC21212B[]) f67483q0.clone();
    }
}
