package p148Fi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 Fi.g[], still in use, count: 1, list:
  (r6v3 Fi.g[]) from 0x003e: INVOKE (r6v3 Fi.g[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:64)
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
/* JADX INFO: renamed from: Fi.g */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC2821g {
    Unknown("unknown"),
    RelayMessage("relay_message"),
    ActionRequest("action_request"),
    TurnContext("turn_context");


    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C20007b f8559s0;

    /* JADX INFO: renamed from: Y */
    public final String f8560Y;
    public static final C2818f Companion = new C2818f();

    /* JADX INFO: renamed from: Z */
    public static final Object f8554Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8543Z);

    public EnumC2821g(String str) {
        super(str, i);
        this.f8560Y = str;
    }

    public static EnumC2821g valueOf(String str) {
        return (EnumC2821g) Enum.valueOf(EnumC2821g.class, str);
    }

    public static EnumC2821g[] values() {
        return (EnumC2821g[]) f8558r0.clone();
    }

    static {
        f8559s0 = AbstractC7877E4.m8156j(new EnumC2821g[]{r0, r1, r2, r4});
    }
}
