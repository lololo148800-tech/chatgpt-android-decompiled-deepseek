package p1155zi;

import mm.EnumC17307j;
import p509Uk.lpqL.SfpOlmlMATQ;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v3 zi.X0[], still in use, count: 1, list:
  (r14v3 zi.X0[]) from 0x0077: INVOKE (r14v3 zi.X0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:121)
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
/* JADX INFO: renamed from: zi.X0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21974X0 {
    f69556p0("whisper", false),
    f69557q0("voice", false),
    f69558r0("voice", false),
    f69559s0("vision-and-file", false),
    f69560t0(SfpOlmlMATQ.GFKjQTyMaMRRB, false),
    f69561u0("read-aloud", false),
    f69562v0("welcome-back", true),
    f69563w0("no-auth-rate-limit", true);

    public static final C21971W0 Companion;

    /* JADX INFO: renamed from: o0 */
    public static final Object f69555o0;

    /* JADX INFO: renamed from: Y */
    public final String f69565Y;

    /* JADX INFO: renamed from: Z */
    public final boolean f69566Z;

    public EnumC21974X0(String str, boolean z6) {
        super(str, i);
        this.f69565Y = str;
        this.f69566Z = z6;
    }

    public static EnumC21974X0 valueOf(String str) {
        return (EnumC21974X0) Enum.valueOf(EnumC21974X0.class, str);
    }

    public static EnumC21974X0[] values() {
        return (EnumC21974X0[]) f69564x0.clone();
    }

    static {
        AbstractC7877E4.m8156j(enumC21974X0Arr);
        Companion = new C21971W0();
        f69555o0 = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69601v0);
    }
}
