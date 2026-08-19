package p817j$.time.temporal;

import p817j$.time.DayOfWeek;

/* JADX INFO: loaded from: classes4.dex */
public final class TemporalAdjusters {
    public static TemporalAdjuster nextOrSame(DayOfWeek dayOfWeek) {
        return new C15633m(dayOfWeek.getValue(), 0);
    }
}
