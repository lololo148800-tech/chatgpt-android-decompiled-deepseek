package p1107xh;

import p523V9.AbstractC7877E4;
import p909nm.AbstractC17681o;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v2 xh.G[], still in use, count: 1, list:
  (r7v2 xh.G[]) from 0x0027: INVOKE (r7v2 xh.G[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:40)
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
/* JADX INFO: renamed from: xh.G */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC21217G {
    KEEP("KEEP"),
    HIDE("HIDE"),
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN__("UNKNOWN__");


    /* JADX INFO: renamed from: Y */
    public final String f67498Y;

    static {
        AbstractC7877E4.m8156j(enumC21217GArr);
        AbstractC17681o.m19382k("KEEP", "HIDE");
    }

    public EnumC21217G(String str) {
        super(str, i);
        this.f67498Y = str;
    }

    public static EnumC21217G valueOf(String str) {
        return (EnumC21217G) Enum.valueOf(EnumC21217G.class, str);
    }

    public static EnumC21217G[] values() {
        return (EnumC21217G[]) f67497p0.clone();
    }
}
