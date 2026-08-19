package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v4 zi.y1[], still in use, count: 1, list:
  (r4v4 zi.y1[]) from 0x0031: INVOKE (r4v4 zi.y1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:50)
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
/* JADX INFO: renamed from: zi.y1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC22080y1 {
    f69795p0("default", "plus"),
    f69796q0("pro", "pro"),
    f69797r0("all", "all");

    public static final C22076x1 Companion;

    /* JADX INFO: renamed from: o0 */
    public static final Object f69794o0;

    /* JADX INFO: renamed from: Y */
    public final String f69799Y;

    /* JADX INFO: renamed from: Z */
    public final String f69800Z;

    static {
        AbstractC7877E4.m8156j(enumC22080y1Arr);
        Companion = new C22076x1();
        f69794o0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69604y0);
    }

    public EnumC22080y1(String str, String str2) {
        super(str, i);
        this.f69799Y = str;
        this.f69800Z = str2;
    }

    public static EnumC22080y1 valueOf(String str) {
        return (EnumC22080y1) Enum.valueOf(EnumC22080y1.class, str);
    }

    public static EnumC22080y1[] values() {
        return (EnumC22080y1[]) f69798s0.clone();
    }
}
