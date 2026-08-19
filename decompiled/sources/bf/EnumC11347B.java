package bf;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v2 bf.B[], still in use, count: 1, list:
  (r13v2 bf.B[]) from 0x0059: INVOKE (r13v2 bf.B[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:90)
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
/* JADX INFO: renamed from: bf.B */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC11347B {
    Python("Python"),
    Retrieval("Retrieval"),
    Browser("Browser"),
    Function("Function"),
    Dalle("Dalle"),
    Memory("Memory"),
    Unknown("Unknown");


    /* JADX INFO: renamed from: v0 */
    public static final /* synthetic */ C20007b f34310v0;

    /* JADX INFO: renamed from: Y */
    public final String f34311Y;
    public static final C11346A Companion = new C11346A();

    /* JADX INFO: renamed from: Z */
    public static final Object f34302Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C11381i.f34391p0);

    static {
        f34310v0 = AbstractC7877E4.m8156j(new EnumC11347B[]{r0, r1, r3, r5, r7, r9, r11});
    }

    public EnumC11347B(String str) {
        super(str, i);
        this.f34311Y = str;
    }

    public static EnumC11347B valueOf(String str) {
        return (EnumC11347B) Enum.valueOf(EnumC11347B.class, str);
    }

    public static EnumC11347B[] values() {
        return (EnumC11347B[]) f34309u0.clone();
    }
}
