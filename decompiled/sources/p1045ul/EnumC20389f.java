package p1045ul;

import p523V9.AbstractC7877E4;
import p874lj.C17057a;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 ul.f[], still in use, count: 1, list:
  (r7v4 ul.f[]) from 0x00a7: INVOKE (r7v4 ul.f[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:168)
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
/* JADX INFO: renamed from: ul.f */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC20389f {
    /* JADX INFO: Fake field, exist only in values array */
    JANUARY("Jan"),
    /* JADX INFO: Fake field, exist only in values array */
    FEBRUARY("Feb"),
    /* JADX INFO: Fake field, exist only in values array */
    MARCH("Mar"),
    /* JADX INFO: Fake field, exist only in values array */
    APRIL("Apr"),
    /* JADX INFO: Fake field, exist only in values array */
    MAY("May"),
    /* JADX INFO: Fake field, exist only in values array */
    JUNE("Jun"),
    /* JADX INFO: Fake field, exist only in values array */
    JULY("Jul"),
    /* JADX INFO: Fake field, exist only in values array */
    AUGUST("Aug"),
    /* JADX INFO: Fake field, exist only in values array */
    SEPTEMBER("Sep"),
    /* JADX INFO: Fake field, exist only in values array */
    OCTOBER("Oct"),
    /* JADX INFO: Fake field, exist only in values array */
    NOVEMBER("Nov"),
    /* JADX INFO: Fake field, exist only in values array */
    DECEMBER("Dec");


    /* JADX INFO: renamed from: Z */
    public static final C17057a f64481Z = new C17057a(6);

    /* JADX INFO: renamed from: p0 */
    public static final /* synthetic */ C20007b f64483p0 = AbstractC7877E4.m8156j(new EnumC20389f[]{new EnumC20389f("Jan"), new EnumC20389f("Feb"), new EnumC20389f("Mar"), new EnumC20389f("Apr"), new EnumC20389f("May"), new EnumC20389f("Jun"), new EnumC20389f("Jul"), new EnumC20389f("Aug"), new EnumC20389f("Sep"), new EnumC20389f("Oct"), new EnumC20389f("Nov"), new EnumC20389f("Dec")});

    /* JADX INFO: renamed from: Y */
    public final String f64484Y;

    static {
    }

    public EnumC20389f(String str) {
        super(str, i);
        this.f64484Y = str;
    }

    public static EnumC20389f valueOf(String str) {
        return (EnumC20389f) Enum.valueOf(EnumC20389f.class, str);
    }

    public static EnumC20389f[] values() {
        return (EnumC20389f[]) f64482o0.clone();
    }
}
