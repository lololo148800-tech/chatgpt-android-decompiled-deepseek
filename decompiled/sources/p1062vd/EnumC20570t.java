package p1062vd;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 vd.t[], still in use, count: 1, list:
  (r4v3 vd.t[]) from 0x002d: INVOKE (r4v3 vd.t[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:46)
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
/* JADX INFO: renamed from: vd.t */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20570t {
    History("history"),
    /* JADX INFO: Fake field, exist only in values array */
    Gizmos("gizmos"),
    Snorlax("snorlax");


    /* JADX INFO: renamed from: Y */
    public final String f65297Y;

    static {
        AbstractC7877E4.m8156j(enumC20570tArr);
    }

    public EnumC20570t(String str) {
        super(str, i);
        this.f65297Y = str;
    }

    public static EnumC20570t valueOf(String str) {
        return (EnumC20570t) Enum.valueOf(EnumC20570t.class, str);
    }

    public static EnumC20570t[] values() {
        return (EnumC20570t[]) f65296p0.clone();
    }
}
