package p148Fi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 Fi.S[], still in use, count: 1, list:
  (r4v3 Fi.S[]) from 0x002b: INVOKE (r4v3 Fi.S[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:44)
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
/* JADX INFO: renamed from: Fi.S */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC2787S {
    Unknown("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    MemorySaved("memory_saved"),
    /* JADX INFO: Fake field, exist only in values array */
    Hangup("hangup");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f8509p0;

    /* JADX INFO: renamed from: Y */
    public final String f8510Y;
    public static final C2784Q Companion = new C2784Q();

    /* JADX INFO: renamed from: Z */
    public static final Object f8507Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8545p0);

    static {
        f8509p0 = AbstractC7877E4.m8156j(new EnumC2787S[]{r0, new EnumC2787S("memory_saved"), new EnumC2787S("hangup")});
    }

    public EnumC2787S(String str) {
        super(str, i);
        this.f8510Y = str;
    }

    public static EnumC2787S valueOf(String str) {
        return (EnumC2787S) Enum.valueOf(EnumC2787S.class, str);
    }

    public static EnumC2787S[] values() {
        return (EnumC2787S[]) f8508o0.clone();
    }
}
