package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p647ak.C10707i0;

/* JADX INFO: renamed from: com.google.android.material.datepicker.q */
/* JADX INFO: loaded from: classes.dex */
public final class C12052q implements Comparable, Parcelable {
    public static final Parcelable.Creator<C12052q> CREATOR = new C10707i0(14);

    /* JADX INFO: renamed from: Y */
    public final Calendar f36614Y;

    /* JADX INFO: renamed from: Z */
    public final int f36615Z;

    /* JADX INFO: renamed from: o0 */
    public final int f36616o0;

    /* JADX INFO: renamed from: p0 */
    public final int f36617p0;

    /* JADX INFO: renamed from: q0 */
    public final int f36618q0;

    /* JADX INFO: renamed from: r0 */
    public final long f36619r0;

    /* JADX INFO: renamed from: s0 */
    public String f36620s0;

    public C12052q(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM13638a = AbstractC12060y.m13638a(calendar);
        this.f36614Y = calendarM13638a;
        this.f36615Z = calendarM13638a.get(2);
        this.f36616o0 = calendarM13638a.get(1);
        this.f36617p0 = calendarM13638a.getMaximum(7);
        this.f36618q0 = calendarM13638a.getActualMaximum(5);
        this.f36619r0 = calendarM13638a.getTimeInMillis();
    }

    /* JADX INFO: renamed from: a */
    public static C12052q m13631a(int i10, int i11) {
        Calendar calendarM13640c = AbstractC12060y.m13640c(null);
        calendarM13640c.set(1, i10);
        calendarM13640c.set(2, i11);
        return new C12052q(calendarM13640c);
    }

    /* JADX INFO: renamed from: b */
    public static C12052q m13632b(long j10) {
        Calendar calendarM13640c = AbstractC12060y.m13640c(null);
        calendarM13640c.setTimeInMillis(j10);
        return new C12052q(calendarM13640c);
    }

    /* JADX INFO: renamed from: c */
    public final String m13633c() {
        String dateTime;
        if (this.f36620s0 == null) {
            long timeInMillis = this.f36614Y.getTimeInMillis();
            if (Build.VERSION.SDK_INT >= 24) {
                Locale locale = Locale.getDefault();
                AtomicReference atomicReference = AbstractC12060y.f36634a;
                DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
                instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
                instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
                dateTime = instanceForSkeleton.format(new Date(timeInMillis));
            } else {
                dateTime = DateUtils.formatDateTime(null, timeInMillis, 8228);
            }
            this.f36620s0 = dateTime;
        }
        return this.f36620s0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f36614Y.compareTo(((C12052q) obj).f36614Y);
    }

    /* JADX INFO: renamed from: d */
    public final int m13634d(C12052q c12052q) {
        if (!(this.f36614Y instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c12052q.f36615Z - this.f36615Z) + ((c12052q.f36616o0 - this.f36616o0) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12052q)) {
            return false;
        }
        C12052q c12052q = (C12052q) obj;
        return this.f36615Z == c12052q.f36615Z && this.f36616o0 == c12052q.f36616o0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f36615Z), Integer.valueOf(this.f36616o0)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f36616o0);
        parcel.writeInt(this.f36615Z);
    }
}
