package p148Fi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 Fi.N0[], still in use, count: 1, list:
  (r12v3 Fi.N0[]) from 0x005d: INVOKE (r12v3 Fi.N0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:94)
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
/* JADX INFO: renamed from: Fi.N0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC2779N0 {
    Idle("idle"),
    /* JADX INFO: Fake field, exist only in values array */
    Connected("connected"),
    /* JADX INFO: Fake field, exist only in values array */
    Halted("halted"),
    Listening("listening"),
    /* JADX INFO: Fake field, exist only in values array */
    ListeningIntently("listening_intently"),
    /* JADX INFO: Fake field, exist only in values array */
    Thinking("thinking"),
    /* JADX INFO: Fake field, exist only in values array */
    Speaking("speaking");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f8496q0;

    /* JADX INFO: renamed from: Y */
    public final String f8497Y;
    public static final C2777M0 Companion = new C2777M0();

    /* JADX INFO: renamed from: Z */
    public static final Object f8493Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8548s0);

    static {
        f8496q0 = AbstractC7877E4.m8156j(new EnumC2779N0[]{r0, r1, r2, r4, new EnumC2779N0("listening_intently"), new EnumC2779N0("thinking"), new EnumC2779N0("speaking")});
    }

    public EnumC2779N0(String str) {
        super(str, i);
        this.f8497Y = str;
    }

    public static EnumC2779N0 valueOf(String str) {
        return (EnumC2779N0) Enum.valueOf(EnumC2779N0.class, str);
    }

    public static EnumC2779N0[] values() {
        return (EnumC2779N0[]) f8495p0.clone();
    }
}
