package p1156zj;

import mm.C17314q;
import p523V9.AbstractC7877E4;
import p571X9.AbstractC9227W;
import p849k7.C16361n;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v3 zj.V0[], still in use, count: 1, list:
  (r8v3 zj.V0[]) from 0x004b: INVOKE (r8v3 zj.V0[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:76)
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
/* JADX INFO: renamed from: zj.V0 */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC22128V0 {
    Front("front"),
    Back("back"),
    FrontOrBack("front_or_back"),
    BarcodePdf417("barcode_pdf417"),
    PassportSignature("passport_signature");


    /* JADX INFO: renamed from: Z */
    public static final C16361n f69944Z;

    /* JADX INFO: renamed from: o0 */
    public static final C17314q f69945o0;

    /* JADX INFO: renamed from: Y */
    public final String f69952Y;

    static {
        AbstractC7877E4.m8156j(enumC22128V0Arr);
        f69944Z = new C16361n();
        f69945o0 = AbstractC9227W.m9800c(C22138a0.f69984p0);
    }

    public EnumC22128V0(String str) {
        super(str, i);
        this.f69952Y = str;
    }

    public static EnumC22128V0 valueOf(String str) {
        return (EnumC22128V0) Enum.valueOf(EnumC22128V0.class, str);
    }

    public static EnumC22128V0[] values() {
        return (EnumC22128V0[]) f69951u0.clone();
    }
}
