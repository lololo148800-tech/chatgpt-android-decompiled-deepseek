package p1155zi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 zi.o1[], still in use, count: 1, list:
  (r6v3 zi.o1[]) from 0x003d: INVOKE (r6v3 zi.o1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:62)
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
/* JADX INFO: renamed from: zi.o1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC22040o1 {
    LimitResets("limit_resets"),
    Tasks("tasks"),
    Recommendations("recommendations"),
    None("none");


    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C20007b f69728s0;

    /* JADX INFO: renamed from: Y */
    public final String f69729Y;
    public static final C22036n1 Companion = new C22036n1();

    /* JADX INFO: renamed from: Z */
    public static final Object f69723Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69602w0);

    static {
        f69728s0 = AbstractC7877E4.m8156j(new EnumC22040o1[]{r0, r1, r2, r4});
    }

    public EnumC22040o1(String str) {
        super(str, i);
        this.f69729Y = str;
    }

    public static EnumC22040o1 valueOf(String str) {
        return (EnumC22040o1) Enum.valueOf(EnumC22040o1.class, str);
    }

    public static EnumC22040o1[] values() {
        return (EnumC22040o1[]) f69727r0.clone();
    }
}
