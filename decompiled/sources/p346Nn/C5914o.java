package p346Nn;

import com.statsig.androidsdk.ErrorBoundaryKt;
import io.sentry.hints.C15370i;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16527D;
import kotlin.jvm.internal.C16549q;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import p016Ae.C0439a;
import p324Mn.C5523D;
import p324Mn.C5527H;
import p324Mn.C5550t;
import p324Mn.C5551u;
import p369On.AbstractC6273b;

/* JADX INFO: renamed from: Nn.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C5914o {

    /* JADX INFO: renamed from: b */
    public static final C15370i f19277b;

    /* JADX INFO: renamed from: a */
    public final C5916p f19278a;

    public C5914o(C5916p contents) {
        AbstractC16544l.m18094g(contents, "contents");
        this.f19278a = contents;
    }

    /* JADX INFO: renamed from: a */
    public final C5551u m6313a() {
        int i10;
        C5916p c5916p = this.f19278a;
        C5527H c5527hM6284b = c5916p.f19285c.m6284b();
        C5868H c5868h = c5916p.f19284b;
        C5523D c5523dM6281e = c5868h.m6281e();
        C5866F c5866f = c5916p.f19283a;
        C5866F c5866fMo6257a = c5866f.mo6257a();
        Integer num = c5866fMo6257a.f19173a;
        AbstractC5873M.m6303a(num, "year");
        c5866fMo6257a.f19173a = Integer.valueOf(num.intValue() % ErrorBoundaryKt.SAMPLING_RATE);
        try {
            Integer num2 = c5866f.f19173a;
            AbstractC16544l.m18091d(num2);
            long jM6756c = AbstractC6273b.m6756c(num2.intValue() / ErrorBoundaryKt.SAMPLING_RATE, 315569520000L);
            long epochDay = c5866fMo6257a.m6259c().f18006Y.toEpochDay();
            if (epochDay > 2147483647L) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = epochDay < -2147483648L ? Integer.MIN_VALUE : (int) epochDay;
            }
            long jM6755b = AbstractC6273b.m6755b(jM6756c, ((((long) i10) * ((long) 86400)) + ((long) c5523dM6281e.f17976Y.toSecondOfDay())) - ((long) c5527hM6284b.f17978a.getTotalSeconds()));
            C5551u.Companion.getClass();
            if (jM6755b < C5551u.f18002p0.f18004Y.getEpochSecond() || jM6755b > C5551u.f18003q0.f18004Y.getEpochSecond()) {
                throw new C0439a("The parsed date is outside the range representable by Instant");
            }
            Integer num3 = c5868h.f19184f;
            return C5550t.m5943b(jM6755b, num3 != null ? num3.intValue() : 0);
        } catch (ArithmeticException e10) {
            throw new C0439a("The parsed date is outside the range representable by Instant", (Throwable) e10);
        }
    }

    static {
        C16549q c16549q = new C16549q(C5914o.class, "monthNumber", "getMonthNumber()Ljava/lang/Integer;", 0);
        C16527D c16527d = AbstractC16526C.f51263a;
        c16527d.mo5697f(c16549q);
        c16527d.mo5697f(new C16549q(C5914o.class, "dayOfMonth", "getDayOfMonth()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "hour", "getHour()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "hourOfAmPm", "getHourOfAmPm()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "minute", "getMinute()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "second", HJrCuD.diTo, 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "offsetHours", "getOffsetHours()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "offsetMinutesOfHour", "getOffsetMinutesOfHour()Ljava/lang/Integer;", 0));
        c16527d.mo5697f(new C16549q(C5914o.class, "offsetSecondsOfMinute", "getOffsetSecondsOfMinute()Ljava/lang/Integer;", 0));
        f19277b = new C15370i(12);
    }
}
