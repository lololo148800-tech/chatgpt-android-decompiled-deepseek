package p1107xh;

import p523V9.AbstractC7877E4;
import p874lj.C17057a;
import p909nm.AbstractC17681o;
import p917o6.C17871x;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 xh.V[], still in use, count: 1, list:
  (r13v2 xh.V[]) from 0x0039: INVOKE (r13v2 xh.V[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:58)
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
/* JADX INFO: renamed from: xh.V */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21231V {
    /* JADX INFO: Fake field, exist only in values array */
    LINKEDIN("LINKEDIN"),
    /* JADX INFO: Fake field, exist only in values array */
    TWITTER("TWITTER"),
    /* JADX INFO: Fake field, exist only in values array */
    INSTAGRAM("INSTAGRAM"),
    /* JADX INFO: Fake field, exist only in values array */
    GITHUB("GITHUB"),
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Z */
    public static final C17057a f67534Z = new C17057a(9);

    /* JADX INFO: renamed from: o0 */
    public static final C17871x f67535o0 = new C17871x("GizmoVerifierType", AbstractC17681o.m19382k("LINKEDIN", "TWITTER", "INSTAGRAM", "GITHUB"));

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f67538r0;

    /* JADX INFO: renamed from: Y */
    public final String f67539Y;

    static {
        f67538r0 = AbstractC7877E4.m8156j(new EnumC21231V[]{r0, r3, r6, r9, r12});
    }

    public EnumC21231V(String str) {
        super(str, i);
        this.f67539Y = str;
    }

    public static EnumC21231V valueOf(String str) {
        return (EnumC21231V) Enum.valueOf(EnumC21231V.class, str);
    }

    public static EnumC21231V[] values() {
        return (EnumC21231V[]) f67537q0.clone();
    }
}
