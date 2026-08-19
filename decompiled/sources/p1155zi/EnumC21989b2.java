package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 zi.b2[], still in use, count: 1, list:
  (r4v3 zi.b2[]) from 0x0030: INVOKE (r4v3 zi.b2[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:50)
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
/* JADX INFO: renamed from: zi.b2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21989b2 {
    f69617o0("google_play"),
    NOT_PURCHASED("not_purchased"),
    OTHER("other");

    public static final C21985a2 Companion;

    /* JADX INFO: renamed from: Z */
    public static final Object f69616Z;

    /* JADX INFO: renamed from: Y */
    public final String f69621Y;

    public EnumC21989b2(String str) {
        super(str, i);
        this.f69621Y = str;
    }

    public static EnumC21989b2 valueOf(String str) {
        return (EnumC21989b2) Enum.valueOf(EnumC21989b2.class, str);
    }

    public static EnumC21989b2[] values() {
        return (EnumC21989b2[]) f69620r0.clone();
    }

    static {
        AbstractC7877E4.m8156j(enumC21989b2Arr);
        Companion = new C21985a2();
        f69616Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69588B0);
    }
}
