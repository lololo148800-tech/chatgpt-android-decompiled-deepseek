package p1135yn;

import java.util.concurrent.TimeUnit;
import p523V9.AbstractC7877E4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v3 yn.d[], still in use, count: 1, list:
  (r12v3 yn.d[]) from 0x0065: INVOKE (r12v3 yn.d[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m)] (LINE:102)
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
/* JADX INFO: renamed from: yn.d */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC21557d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    /* JADX INFO: Fake field, exist only in values array */
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: Y */
    public final TimeUnit f68272Y;

    static {
        AbstractC7877E4.m8156j(enumC21557dArr);
    }

    public EnumC21557d(TimeUnit timeUnit) {
        super(str, i);
        this.f68272Y = timeUnit;
    }

    public static EnumC21557d valueOf(String str) {
        return (EnumC21557d) Enum.valueOf(EnumC21557d.class, str);
    }

    public static EnumC21557d[] values() {
        return (EnumC21557d[]) f68271t0.clone();
    }
}
