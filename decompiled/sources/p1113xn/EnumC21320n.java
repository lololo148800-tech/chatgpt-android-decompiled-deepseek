package p1113xn;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 xn.n[], still in use, count: 1, list:
  (r14v2 xn.n[]) from 0x0055: INVOKE (r14v2 xn.n[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:86)
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
/* JADX INFO: renamed from: xn.n */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC21320n implements InterfaceC21310d {
    /* JADX INFO: Fake field, exist only in values array */
    IGNORE_CASE(2),
    MULTILINE(8),
    /* JADX INFO: Fake field, exist only in values array */
    LITERAL(16),
    /* JADX INFO: Fake field, exist only in values array */
    UNIX_LINES(1),
    /* JADX INFO: Fake field, exist only in values array */
    COMMENTS(4),
    /* JADX INFO: Fake field, exist only in values array */
    DOT_MATCHES_ALL(32),
    /* JADX INFO: Fake field, exist only in values array */
    CANON_EQ(128);


    /* JADX INFO: renamed from: Y */
    public final int f67761Y;

    static {
        AbstractC7877E4.m8156j(enumC21320nArr);
    }

    public EnumC21320n(int i10) {
        super(str, i);
        this.f67761Y = i10;
    }

    public static EnumC21320n valueOf(String str) {
        return (EnumC21320n) Enum.valueOf(EnumC21320n.class, str);
    }

    public static EnumC21320n[] values() {
        return (EnumC21320n[]) f67760o0.clone();
    }
}
