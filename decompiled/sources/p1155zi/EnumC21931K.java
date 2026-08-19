package p1155zi;

import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 zi.K[], still in use, count: 1, list:
  (r2v3 zi.K[]) from 0x001f: INVOKE (r2v3 zi.K[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:32)
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
/* JADX INFO: renamed from: zi.K */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C21924I0.class)
public final class EnumC21931K {
    /* JADX INFO: Fake field, exist only in values array */
    Wav("wav"),
    Unknown("");

    public static final C21927J Companion = new C21927J();

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f69483p0;

    /* JADX INFO: renamed from: Y */
    public final String f69484Y;

    static {
        f69483p0 = AbstractC7877E4.m8156j(new EnumC21931K[]{r0, r1});
    }

    public EnumC21931K(String str) {
        super(str, i);
        this.f69484Y = str;
    }

    public static EnumC21931K valueOf(String str) {
        return (EnumC21931K) Enum.valueOf(EnumC21931K.class, str);
    }

    public static EnumC21931K[] values() {
        return (EnumC21931K[]) f69482o0.clone();
    }
}
