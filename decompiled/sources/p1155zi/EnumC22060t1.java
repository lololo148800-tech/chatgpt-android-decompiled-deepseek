package p1155zi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 zi.t1[], still in use, count: 1, list:
  (r4v3 zi.t1[]) from 0x0030: INVOKE (r4v3 zi.t1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:50)
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
/* JADX INFO: renamed from: zi.t1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC22060t1 {
    Push("push"),
    Email("email"),
    None("none");


    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f69758r0;

    /* JADX INFO: renamed from: Y */
    public final String f69759Y;
    public static final C22056s1 Companion = new C22056s1();

    /* JADX INFO: renamed from: Z */
    public static final Object f69754Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69603x0);

    public EnumC22060t1(String str) {
        super(str, i);
        this.f69759Y = str;
    }

    public static EnumC22060t1 valueOf(String str) {
        return (EnumC22060t1) Enum.valueOf(EnumC22060t1.class, str);
    }

    public static EnumC22060t1[] values() {
        return (EnumC22060t1[]) f69757q0.clone();
    }

    static {
        f69758r0 = AbstractC7877E4.m8156j(new EnumC22060t1[]{r0, r1, r2});
    }
}
