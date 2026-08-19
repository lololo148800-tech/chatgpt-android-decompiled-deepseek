package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.concurrent.atomic.AtomicReference;
import p817j$.util.DesugarTimeZone;

/* JADX INFO: renamed from: com.google.android.material.datepicker.y */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12060y {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f36634a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static Calendar m13638a(Calendar calendar) {
        Calendar calendarM13640c = m13640c(calendar);
        Calendar calendarM13640c2 = m13640c(null);
        calendarM13640c2.set(calendarM13640c.get(1), calendarM13640c.get(2), calendarM13640c.get(5));
        return calendarM13640c2;
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m13639b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* JADX INFO: renamed from: c */
    public static Calendar m13640c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
