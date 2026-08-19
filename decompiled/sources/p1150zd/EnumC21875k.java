package p1150zd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 zd.k[], still in use, count: 1, list:
  (r7v2 zd.k[]) from 0x002f: INVOKE (r7v2 zd.k[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:48)
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
/* JADX INFO: renamed from: zd.k */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21875k {
    /* JADX INFO: Fake field, exist only in values array */
    HarmfulOrUnsafe(true),
    /* JADX INFO: Fake field, exist only in values array */
    False(true),
    /* JADX INFO: Fake field, exist only in values array */
    NotHelpful(true),
    BadTranscription(false);

    public static final C21874j Companion = new C21874j();

    /* JADX INFO: renamed from: Z */
    public static final Object f69357Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21865a.f69337o0);

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f69360q0;

    /* JADX INFO: renamed from: Y */
    public final boolean f69361Y;

    static {
        f69360q0 = AbstractC7877E4.m8156j(new EnumC21875k[]{r0, r1, r4, r5});
    }

    public EnumC21875k(boolean z6) {
        super(str, i);
        this.f69361Y = z6;
    }

    public static EnumC21875k valueOf(String str) {
        return (EnumC21875k) Enum.valueOf(EnumC21875k.class, str);
    }

    public static EnumC21875k[] values() {
        return (EnumC21875k[]) f69359p0.clone();
    }
}
