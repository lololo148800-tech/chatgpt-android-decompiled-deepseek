package p1155zi;

import mm.EnumC17307j;
import p037B9.MeDP.MpoABj;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 zi.D1[], still in use, count: 1, list:
  (r12v3 zi.D1[]) from 0x0067: INVOKE (r12v3 zi.D1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:105)
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
/* JADX INFO: renamed from: zi.D1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21905D1 {
    FREE("free"),
    PLUS(MpoABj.ssrZSBtUFGViSAm),
    PRO("pro"),
    TEAM("team"),
    ENTERPRISE("enterprise"),
    EDU("edu"),
    UNKNOWN(null);

    public static final C21901C1 Companion = new C21901C1();

    /* JADX INFO: renamed from: Z */
    public static final Object f69439Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69605z0);

    /* JADX INFO: renamed from: w0 */
    public static final /* synthetic */ C20007b f69448w0;

    /* JADX INFO: renamed from: Y */
    public final String f69449Y;

    public EnumC21905D1(String str) {
        super(str, i);
        this.f69449Y = str;
    }

    public static EnumC21905D1 valueOf(String str) {
        return (EnumC21905D1) Enum.valueOf(EnumC21905D1.class, str);
    }

    public static EnumC21905D1[] values() {
        return (EnumC21905D1[]) f69447v0.clone();
    }

    static {
        f69448w0 = AbstractC7877E4.m8156j(new EnumC21905D1[]{r0, r1, r2, r4, r6, r8, r10});
    }
}
