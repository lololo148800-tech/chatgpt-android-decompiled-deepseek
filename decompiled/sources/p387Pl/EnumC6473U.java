package p387Pl;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 Pl.U[], still in use, count: 1, list:
  (r6v3 Pl.U[]) from 0x0035: INVOKE (r6v3 Pl.U[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:54)
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
/* JADX INFO: renamed from: Pl.U */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC6473U {
    /* JADX INFO: Fake field, exist only in values array */
    VP8("vp8"),
    /* JADX INFO: Fake field, exist only in values array */
    H264("h264"),
    /* JADX INFO: Fake field, exist only in values array */
    VP9("vp9"),
    /* JADX INFO: Fake field, exist only in values array */
    AV1("av1");

    public static final C6472T Companion;

    /* JADX INFO: renamed from: Y */
    public final String f21004Y;

    static {
        AbstractC7877E4.m8156j(enumC6473UArr);
        Companion = new C6472T();
    }

    public EnumC6473U(String str) {
        super(str, i);
        this.f21004Y = str;
    }

    public static EnumC6473U valueOf(String str) {
        return (EnumC6473U) Enum.valueOf(EnumC6473U.class, str);
    }

    public static EnumC6473U[] values() {
        return (EnumC6473U[]) f21003Z.clone();
    }
}
