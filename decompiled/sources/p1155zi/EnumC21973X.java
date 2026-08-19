package p1155zi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 zi.X[], still in use, count: 1, list:
  (r8v3 zi.X[]) from 0x0047: INVOKE (r8v3 zi.X[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:72)
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
/* JADX INFO: renamed from: zi.X */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC21973X {
    Unknown("unknown"),
    GetPlus("get_plus"),
    /* JADX INFO: Fake field, exist only in values array */
    NewChat("new_chat"),
    /* JADX INFO: Fake field, exist only in values array */
    Authenticate("authenticate"),
    GetPro("get_pro");


    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f69553r0;

    /* JADX INFO: renamed from: Y */
    public final String f69554Y;
    public static final C21970W Companion = new C21970W();

    /* JADX INFO: renamed from: Z */
    public static final Object f69549Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69596q0);

    static {
        f69553r0 = AbstractC7877E4.m8156j(new EnumC21973X[]{r0, r1, r2, r4, r6});
    }

    public EnumC21973X(String str) {
        super(str, i);
        this.f69554Y = str;
    }

    public static EnumC21973X valueOf(String str) {
        return (EnumC21973X) Enum.valueOf(EnumC21973X.class, str);
    }

    public static EnumC21973X[] values() {
        return (EnumC21973X[]) f69552q0.clone();
    }
}
