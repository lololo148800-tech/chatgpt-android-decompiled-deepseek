package p148Fi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 Fi.A0[], still in use, count: 1, list:
  (r8v3 Fi.A0[]) from 0x004c: INVOKE (r8v3 Fi.A0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:78)
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
/* JADX INFO: renamed from: Fi.A0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC2753A0 {
    Unknown("unknown"),
    StartListeningIntently("start_listening"),
    StopListeningIntently("stop_listening"),
    ResumeListening("resume_listening"),
    f8444r0("relay_message");


    /* JADX INFO: renamed from: t0 */
    public static final /* synthetic */ C20007b f8446t0;

    /* JADX INFO: renamed from: Y */
    public final String f8447Y;
    public static final C2866z0 Companion = new C2866z0();

    /* JADX INFO: renamed from: Z */
    public static final Object f8440Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C2815e.f8547r0);

    public EnumC2753A0(String str) {
        super(str, i);
        this.f8447Y = str;
    }

    public static EnumC2753A0 valueOf(String str) {
        return (EnumC2753A0) Enum.valueOf(EnumC2753A0.class, str);
    }

    public static EnumC2753A0[] values() {
        return (EnumC2753A0[]) f8445s0.clone();
    }

    static {
        f8446t0 = AbstractC7877E4.m8156j(new EnumC2753A0[]{r0, r1, r2, r4, r6});
    }
}
