package p017Af;

import com.openai.chatgpt.R;
import p523V9.AbstractC7877E4;
import tm.C20007b;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v4 Af.J[], still in use, count: 1, list:
  (r7v4 Af.J[]) from 0x0093: INVOKE (r7v4 Af.J[]) STATIC call: V9.E4.j(java.lang.Enum[]):tm.b A[MD:(java.lang.Enum[]):tm.b (m), WRAPPED] (LINE:148)
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
/* JADX INFO: renamed from: Af.J */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC0463J {
    OneDay(R.string.stock_1d, R.string.stock_1d_change, "1d"),
    /* JADX INFO: Fake field, exist only in values array */
    FiveDays(R.string.stock_5d, R.string.stock_5d_change, "5d"),
    /* JADX INFO: Fake field, exist only in values array */
    OneMonth(R.string.stock_1m, R.string.stock_1m_change, "1m"),
    /* JADX INFO: Fake field, exist only in values array */
    SixMonths(R.string.stock_6m, R.string.stock_6m_change, "6m"),
    /* JADX INFO: Fake field, exist only in values array */
    YearToDate(R.string.stock_ytd, R.string.stock_ytd_change, "ytd"),
    /* JADX INFO: Fake field, exist only in values array */
    OneYear(R.string.stock_1y, R.string.stock_1y_change, "1y"),
    /* JADX INFO: Fake field, exist only in values array */
    FiveYears(R.string.stock_5y, R.string.stock_5y_change, "5y");


    /* JADX INFO: renamed from: r0 */
    public static final /* synthetic */ C20007b f1503r0;

    /* JADX INFO: renamed from: Y */
    public final int f1504Y;

    /* JADX INFO: renamed from: Z */
    public final int f1505Z;

    /* JADX INFO: renamed from: o0 */
    public final String f1506o0;

    static {
        f1503r0 = AbstractC7877E4.m8156j(enumC0463JArr);
    }

    public EnumC0463J(int i10, int i11, String str) {
        super(str, i);
        this.f1504Y = i10;
        this.f1505Z = i11;
        this.f1506o0 = str;
    }

    public static EnumC0463J valueOf(String str) {
        return (EnumC0463J) Enum.valueOf(EnumC0463J.class, str);
    }

    public static EnumC0463J[] values() {
        return (EnumC0463J[]) f1502q0.clone();
    }
}
