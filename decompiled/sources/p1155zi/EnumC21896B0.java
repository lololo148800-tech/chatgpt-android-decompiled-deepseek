package p1155zi;

import mm.EnumC17307j;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r11v4 zi.B0[], still in use, count: 1, list:
  (r11v4 zi.B0[]) from 0x0094: INVOKE (r11v4 zi.B0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:150)
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
/* JADX INFO: renamed from: zi.B0 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class EnumC21896B0 {
    Account("account"),
    /* JADX INFO: Fake field, exist only in values array */
    DallE("dalle"),
    f69423p0("voice-advanced"),
    Vision("vision"),
    Memory("memory"),
    MemoryInSearch("memory-in-search"),
    TemporaryConversation("conversation"),
    NoMemoryTemporaryConversation("conversation"),
    /* JADX INFO: Fake field, exist only in values array */
    Straw("straw"),
    /* JADX INFO: Fake field, exist only in values array */
    Search("search");

    public static final C21892A0 Companion;

    /* JADX INFO: renamed from: Z */
    public static final Object f69421Z;

    /* JADX INFO: renamed from: Y */
    public final String f69430Y;

    public EnumC21896B0(String str) {
        super(str, i);
        this.f69430Y = str;
    }

    public static EnumC21896B0 valueOf(String str) {
        return (EnumC21896B0) Enum.valueOf(EnumC21896B0.class, str);
    }

    public static EnumC21896B0[] values() {
        return (EnumC21896B0[]) f69429v0.clone();
    }

    static {
        AbstractC7877E4.m8156j(enumC21896B0Arr);
        Companion = new C21892A0();
        f69421Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69600u0);
    }
}
