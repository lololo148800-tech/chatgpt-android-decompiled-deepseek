package p216Id;

import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 Id.k[], still in use, count: 1, list:
  (r8v3 Id.k[]) from 0x0049: INVOKE (r8v3 Id.k[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:74)
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
/* JADX INFO: renamed from: Id.k */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3703k {
    Submit("submit"),
    HiddenMessage("hidden_message"),
    Reroll("reroll"),
    /* JADX INFO: Fake field, exist only in values array */
    Continue("continue"),
    Edit("edit");


    /* JADX INFO: renamed from: Y */
    public final String f11241Y;

    static {
        AbstractC7877E4.m8156j(enumC3703kArr);
    }

    public EnumC3703k(String str) {
        super(str, i);
        this.f11241Y = str;
    }

    public static EnumC3703k valueOf(String str) {
        return (EnumC3703k) Enum.valueOf(EnumC3703k.class, str);
    }

    public static EnumC3703k[] values() {
        return (EnumC3703k[]) f11240r0.clone();
    }
}
