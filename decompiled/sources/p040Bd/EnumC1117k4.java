package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Bd.k4[], still in use, count: 1, list:
  (r2v3 Bd.k4[]) from 0x0021: INVOKE (r2v3 Bd.k4[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:34)
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
/* JADX INFO: renamed from: Bd.k4 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC1117k4 {
    Canmore("canmore"),
    Unknown("unknown");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f3029q0;

    /* JADX INFO: renamed from: Y */
    public final String f3030Y;
    public static final C1110j4 Companion = new C1110j4();

    /* JADX INFO: renamed from: Z */
    public static final Object f3026Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2904t0);

    static {
        f3029q0 = AbstractC7877E4.m8156j(new EnumC1117k4[]{r0, r1});
    }

    public EnumC1117k4(String str) {
        super(str, i);
        this.f3030Y = str;
    }

    public static EnumC1117k4 valueOf(String str) {
        return (EnumC1117k4) Enum.valueOf(EnumC1117k4.class, str);
    }

    public static EnumC1117k4[] values() {
        return (EnumC1117k4[]) f3028p0.clone();
    }
}
