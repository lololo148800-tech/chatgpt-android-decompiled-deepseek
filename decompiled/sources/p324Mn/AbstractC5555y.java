package p324Mn;

import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p025An.C0644w;
import p369On.AbstractC6273b;
import p817j$.time.DateTimeException;
import p817j$.time.LocalDate;

/* JADX INFO: renamed from: Mn.y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5555y {

    /* JADX INFO: renamed from: a */
    public static final long f18007a = LocalDate.MIN.toEpochDay();

    /* JADX INFO: renamed from: b */
    public static final long f18008b = LocalDate.MAX.toEpochDay();

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f18009c = 0;

    /* JADX INFO: renamed from: a */
    public static final C5554x m5948a(C5554x c5554x, long j10, AbstractC5539i unit) throws Exception {
        LocalDate localDatePlusMonths;
        AbstractC16544l.m18094g(unit, "unit");
        try {
            boolean z6 = unit instanceof C5541k;
            LocalDate localDate = c5554x.f18006Y;
            if (z6) {
                long jM6755b = AbstractC6273b.m6755b(localDate.toEpochDay(), AbstractC6273b.m6756c(j10, ((C5541k) unit).f17992c));
                if (jM6755b > f18008b || f18007a > jM6755b) {
                    throw new DateTimeException(AbstractC0168G.m533v("The resulting day ", jM6755b, " is out of supported LocalDate range."));
                }
                localDatePlusMonths = LocalDate.ofEpochDay(jM6755b);
                AbstractC16544l.m18093f(localDatePlusMonths, "ofEpochDay(...)");
            } else {
                if (!(unit instanceof C5543m)) {
                    throw new C0644w();
                }
                localDatePlusMonths = localDate.plusMonths(AbstractC6273b.m6756c(j10, ((C5543m) unit).f17993c));
            }
            return new C5554x(localDatePlusMonths);
        } catch (Exception e10) {
            if (!(e10 instanceof DateTimeException) && !(e10 instanceof ArithmeticException)) {
                throw e10;
            }
            String message = "The result of adding " + j10 + " of " + unit + " to " + c5554x + " is out of LocalDate range.";
            AbstractC16544l.m18094g(message, "message");
            throw new C0644w(message, e10);
        }
    }
}
