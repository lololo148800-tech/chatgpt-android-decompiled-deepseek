package p172Gi;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 Gi.D[], still in use, count: 1, list:
  (r2v3 Gi.D[]) from 0x0021: INVOKE (r2v3 Gi.D[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:34)
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
/* JADX INFO: renamed from: Gi.D */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3062D {
    Voice("voice-redesign"),
    QuickTile("quick-tile");


    /* JADX INFO: renamed from: Y */
    public final String f9238Y;

    static {
        AbstractC7877E4.m8156j(enumC3062DArr);
    }

    public EnumC3062D(String str) {
        super(str, i);
        this.f9238Y = str;
    }

    public static EnumC3062D valueOf(String str) {
        return (EnumC3062D) Enum.valueOf(EnumC3062D.class, str);
    }

    public static EnumC3062D[] values() {
        return (EnumC3062D[]) f9237p0.clone();
    }
}
