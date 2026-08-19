package p1155zi;

import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 zi.f1[], still in use, count: 1, list:
  (r4v3 zi.f1[]) from 0x002f: INVOKE (r4v3 zi.f1[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:48)
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
/* JADX INFO: renamed from: zi.f1 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22004f1 {
    REGENERATE("regenerate"),
    CONVERSATION("conversation"),
    UNKNOWN("unknown");


    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f69646r0;

    /* JADX INFO: renamed from: Y */
    public final String f69647Y;

    static {
        f69646r0 = AbstractC7877E4.m8156j(enumC22004f1Arr);
    }

    public EnumC22004f1(String str) {
        super(str, i);
        this.f69647Y = str;
    }

    public static EnumC22004f1 valueOf(String str) {
        return (EnumC22004f1) Enum.valueOf(EnumC22004f1.class, str);
    }

    public static EnumC22004f1[] values() {
        return (EnumC22004f1[]) f69645q0.clone();
    }
}
