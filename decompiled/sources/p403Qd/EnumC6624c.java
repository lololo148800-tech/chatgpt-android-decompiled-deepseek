package p403Qd;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Qd.c[], still in use, count: 1, list:
  (r2v3 Qd.c[]) from 0x001d: INVOKE (r2v3 Qd.c[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:30)
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
/* JADX INFO: renamed from: Qd.c */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC6624c {
    Streaming(3),
    /* JADX INFO: Fake field, exist only in values array */
    Unread(4);

    public static final C6622b Companion = new C6622b();

    /* JADX INFO: renamed from: Z */
    public static final Object f21356Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C6620a.f21346Z);

    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f21359q0;

    /* JADX INFO: renamed from: Y */
    public final int f21360Y;

    static {
        f21359q0 = AbstractC7877E4.m8156j(new EnumC6624c[]{r0, new EnumC6624c(4)});
    }

    public EnumC6624c(int i10) {
        super(str, i);
        this.f21360Y = i10;
    }

    public static EnumC6624c valueOf(String str) {
        return (EnumC6624c) Enum.valueOf(EnumC6624c.class, str);
    }

    public static EnumC6624c[] values() {
        return (EnumC6624c[]) f21358p0.clone();
    }
}
