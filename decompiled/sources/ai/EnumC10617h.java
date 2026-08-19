package ai;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 ai.h[], still in use, count: 1, list:
  (r12v3 ai.h[]) from 0x005d: INVOKE (r12v3 ai.h[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:94)
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
/* JADX INFO: renamed from: ai.h */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC10617h {
    /* JADX INFO: Fake field, exist only in values array */
    Once("once"),
    /* JADX INFO: Fake field, exist only in values array */
    Daily("daily"),
    Weekly("weekly"),
    /* JADX INFO: Fake field, exist only in values array */
    Monthly("monthly"),
    /* JADX INFO: Fake field, exist only in values array */
    Yearly("yearly"),
    /* JADX INFO: Fake field, exist only in values array */
    Custom("custom"),
    Unknown("unknown");


    /* JADX INFO: renamed from: q0 */
    public static final /* synthetic */ C20007b f31499q0;

    /* JADX INFO: renamed from: Y */
    public final String f31500Y;
    public static final C10616g Companion = new C10616g();

    /* JADX INFO: renamed from: Z */
    public static final Object f31496Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C10610a.f31486o0);

    static {
        f31499q0 = AbstractC7877E4.m8156j(new EnumC10617h[]{r0, r1, r2, r4, r6, r8, r10});
    }

    public EnumC10617h(String str) {
        super(str, i);
        this.f31500Y = str;
    }

    public static EnumC10617h valueOf(String str) {
        return (EnumC10617h) Enum.valueOf(EnumC10617h.class, str);
    }

    public static EnumC10617h[] values() {
        return (EnumC10617h[]) f31498p0.clone();
    }
}
