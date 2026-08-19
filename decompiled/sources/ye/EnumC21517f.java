package ye;

import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 ye.f[], still in use, count: 1, list:
  (r4v3 ye.f[]) from 0x002e: INVOKE (r4v3 ye.f[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:47)
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
/* JADX INFO: renamed from: ye.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C21518g.class)
public final class EnumC21517f {
    f68138Z("Auto"),
    f68139o0("ForceSearch"),
    f68140p0("ForceNoSearch");

    public static final C21516e Companion = new C21516e();

    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f68142r0;

    /* JADX INFO: renamed from: Y */
    public final Boolean f68143Y;

    static {
        f68142r0 = AbstractC7877E4.m8156j(new EnumC21517f[]{r0, r1, r2});
    }

    public EnumC21517f(String str) {
        super(str, i);
        this.f68143Y = bool;
    }

    public static EnumC21517f valueOf(String str) {
        return (EnumC21517f) Enum.valueOf(EnumC21517f.class, str);
    }

    public static EnumC21517f[] values() {
        return (EnumC21517f[]) f68141q0.clone();
    }
}
