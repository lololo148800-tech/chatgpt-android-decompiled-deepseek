package p1045ul;

import p523V9.AbstractC7877E4;
import p885m4.C17151a;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 ul.g[], still in use, count: 1, list:
  (r12v3 ul.g[]) from 0x0059: INVOKE (r12v3 ul.g[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:90)
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
/* JADX INFO: renamed from: ul.g */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20390g {
    /* JADX INFO: Fake field, exist only in values array */
    MONDAY("Mon"),
    /* JADX INFO: Fake field, exist only in values array */
    TUESDAY("Tue"),
    /* JADX INFO: Fake field, exist only in values array */
    WEDNESDAY("Wed"),
    /* JADX INFO: Fake field, exist only in values array */
    THURSDAY("Thu"),
    /* JADX INFO: Fake field, exist only in values array */
    FRIDAY("Fri"),
    /* JADX INFO: Fake field, exist only in values array */
    SATURDAY("Sat"),
    /* JADX INFO: Fake field, exist only in values array */
    SUNDAY("Sun");


    /* JADX INFO: renamed from: Z */
    public static final C17151a f64485Z = new C17151a();

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f64487p0 = AbstractC7877E4.m8156j(new EnumC20390g[]{new EnumC20390g("Mon"), new EnumC20390g("Tue"), new EnumC20390g("Wed"), new EnumC20390g("Thu"), new EnumC20390g("Fri"), new EnumC20390g("Sat"), new EnumC20390g("Sun")});

    /* JADX INFO: renamed from: Y */
    public final String f64488Y;

    static {
    }

    public EnumC20390g(String str) {
        super(str, i);
        this.f64488Y = str;
    }

    public static EnumC20390g valueOf(String str) {
        return (EnumC20390g) Enum.valueOf(EnumC20390g.class, str);
    }

    public static EnumC20390g[] values() {
        return (EnumC20390g[]) f64486o0.clone();
    }
}
