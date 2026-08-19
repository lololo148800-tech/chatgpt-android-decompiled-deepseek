package p475T9;

import com.statsig.androidsdk.StatsigLoggerKt;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: renamed from: T9.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7283f {

    /* JADX INFO: renamed from: a */
    public static final StringBuilder f23083a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        f23083a = new StringBuilder(33);
    }

    /* JADX INFO: renamed from: a */
    public static void m7734a(long j10, StringBuilder sb2) {
        if (j10 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z6 = false;
        if (j10 < 0) {
            sb2.append("-");
            if (j10 != Long.MIN_VALUE) {
                j10 = -j10;
            } else {
                j10 = Long.MAX_VALUE;
                z6 = true;
            }
        }
        if (j10 >= 86400000) {
            sb2.append(j10 / 86400000);
            sb2.append("d");
            j10 %= 86400000;
        }
        if (true == z6) {
            j10 = 25975808;
        }
        if (j10 >= 3600000) {
            sb2.append(j10 / 3600000);
            sb2.append("h");
            j10 %= 3600000;
        }
        if (j10 >= StatsigLoggerKt.FLUSH_TIMER_MS) {
            sb2.append(j10 / StatsigLoggerKt.FLUSH_TIMER_MS);
            sb2.append("m");
            j10 %= StatsigLoggerKt.FLUSH_TIMER_MS;
        }
        if (j10 >= 1000) {
            sb2.append(j10 / 1000);
            sb2.append("s");
            j10 %= 1000;
        }
        if (j10 > 0) {
            sb2.append(j10);
            sb2.append("ms");
        }
    }
}
