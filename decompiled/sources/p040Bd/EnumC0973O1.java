package p040Bd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Bd.O1[], still in use, count: 1, list:
  (r2v3 Bd.O1[]) from 0x0021: INVOKE (r2v3 Bd.O1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:34)
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
/* JADX INFO: renamed from: Bd.O1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC0973O1 {
    Youtube("youtube"),
    Other("other");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f2752q0;

    /* JADX INFO: renamed from: Y */
    public final String f2753Y;
    public static final C0967N1 Companion = new C0967N1();

    /* JADX INFO: renamed from: Z */
    public static final Object f2749Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C1063d.f2899o0);

    static {
        f2752q0 = AbstractC7877E4.m8156j(new EnumC0973O1[]{r0, r1});
    }

    public EnumC0973O1(String str) {
        super(str, i);
        this.f2753Y = str;
    }

    public static EnumC0973O1 valueOf(String str) {
        return (EnumC0973O1) Enum.valueOf(EnumC0973O1.class, str);
    }

    public static EnumC0973O1[] values() {
        return (EnumC0973O1[]) f2751p0.clone();
    }
}
