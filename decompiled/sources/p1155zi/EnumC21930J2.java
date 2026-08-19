package p1155zi;

import mm.EnumC17307j;
import p040Bd.C0961M1;
import p523V9.AbstractC7877E4;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9227W;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v3 zi.J2[], still in use, count: 1, list:
  (r4v3 zi.J2[]) from 0x002b: INVOKE (r4v3 zi.J2[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:44)
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
/* JADX INFO: renamed from: zi.J2 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g(with = C0961M1.class)
public final class EnumC21930J2 {
    Primary("primary"),
    /* JADX INFO: Fake field, exist only in values array */
    Secondary("secondary"),
    /* JADX INFO: Fake field, exist only in values array */
    Tertiary("tertiary");


    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f69479p0;

    /* JADX INFO: renamed from: Y */
    public final String f69480Y;
    public static final C21926I2 Companion = new C21926I2();

    /* JADX INFO: renamed from: Z */
    public static final Object f69477Z = AbstractC9227W.m9799b(EnumC17307j.f55133Y, C21982a.f69591E0);

    static {
        f69479p0 = AbstractC7877E4.m8156j(new EnumC21930J2[]{r0, new EnumC21930J2("secondary"), new EnumC21930J2("tertiary")});
    }

    public EnumC21930J2(String str) {
        super(str, i);
        this.f69480Y = str;
    }

    public static EnumC21930J2 valueOf(String str) {
        return (EnumC21930J2) Enum.valueOf(EnumC21930J2.class, str);
    }

    public static EnumC21930J2[] values() {
        return (EnumC21930J2[]) f69478o0.clone();
    }
}
