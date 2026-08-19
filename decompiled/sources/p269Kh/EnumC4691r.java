package p269Kh;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Kh.r[], still in use, count: 1, list:
  (r2v3 Kh.r[]) from 0x0021: INVOKE (r2v3 Kh.r[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:34)
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
/* JADX INFO: renamed from: Kh.r */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC4691r {
    Search("search"),
    Unknown("");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f15264q0;

    /* JADX INFO: renamed from: Y */
    public final String f15265Y;
    public static final C4690q Companion = new C4690q();

    /* JADX INFO: renamed from: Z */
    public static final Object f15261Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C4689p.f15260Y);

    static {
        f15264q0 = AbstractC7877E4.m8156j(new EnumC4691r[]{r0, r1});
    }

    public EnumC4691r(String str) {
        super(str, i);
        this.f15265Y = str;
    }

    public static EnumC4691r valueOf(String str) {
        return (EnumC4691r) Enum.valueOf(EnumC4691r.class, str);
    }

    public static EnumC4691r[] values() {
        return (EnumC4691r[]) f15263p0.clone();
    }
}
