package ve;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v3 ve.f[], still in use, count: 1, list:
  (r6v3 ve.f[]) from 0x003d: INVOKE (r6v3 ve.f[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:62)
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
/* JADX INFO: renamed from: ve.f */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC20582f {
    Browser("browser"),
    Dalle("dalle"),
    Python("python"),
    Unknown("unknown");


    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ C20007b f65311s0;

    /* JADX INFO: renamed from: Y */
    public final String f65312Y;
    public static final C20581e Companion = new C20581e();

    /* JADX INFO: renamed from: Z */
    public static final Object f65306Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C20580d.f65305Y);

    static {
        f65311s0 = AbstractC7877E4.m8156j(new EnumC20582f[]{r0, r1, r2, r4});
    }

    public EnumC20582f(String str) {
        super(str, i);
        this.f65312Y = str;
    }

    public static EnumC20582f valueOf(String str) {
        return (EnumC20582f) Enum.valueOf(EnumC20582f.class, str);
    }

    public static EnumC20582f[] values() {
        return (EnumC20582f[]) f65310r0.clone();
    }
}
