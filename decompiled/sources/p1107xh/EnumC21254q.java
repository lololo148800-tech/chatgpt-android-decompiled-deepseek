package p1107xh;

import p523V9.AbstractC7877E4;
import p874lj.C17057a;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v2 xh.q[], still in use, count: 1, list:
  (r10v2 xh.q[]) from 0x0033: INVOKE (r10v2 xh.q[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:52)
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
/* JADX INFO: renamed from: xh.q */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21254q {
    FEATURED("FEATURED"),
    RANKED("RANKED"),
    /* JADX INFO: Fake field, exist only in values array */
    NONE("NONE"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C17057a f67618Z = new C17057a(8);

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67619o0 = new C17871x("GizmoDiscoveryCutDisplayType", AbstractC17681o.m19382k("FEATURED", "RANKED", "NONE"));

    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ C20007b f67624t0;

    /* JADX INFO: renamed from: Y */
    public final String f67625Y;

    static {
        f67624t0 = AbstractC7877E4.m8156j(new EnumC21254q[]{r0, r3, r6, r9});
    }

    public EnumC21254q(String str) {
        super(str, i);
        this.f67625Y = str;
    }

    public static EnumC21254q valueOf(String str) {
        return (EnumC21254q) Enum.valueOf(EnumC21254q.class, str);
    }

    public static EnumC21254q[] values() {
        return (EnumC21254q[]) f67623s0.clone();
    }
}
