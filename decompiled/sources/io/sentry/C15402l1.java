package io.sentry;

import java.util.Date;
import p544W9.AbstractC8656j3;

/* JADX INFO: renamed from: io.sentry.l1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C15402l1 extends AbstractC15169V0 {

    /* JADX INFO: renamed from: Y */
    public final Date f48017Y;

    /* JADX INFO: renamed from: Z */
    public final long f48018Z;

    public C15402l1(Date date, long j10) {
        this.f48017Y = date;
        this.f48018Z = j10;
    }

    @Override // io.sentry.AbstractC15169V0, java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public final int compareTo(AbstractC15169V0 abstractC15169V0) {
        if (!(abstractC15169V0 instanceof C15402l1)) {
            return super.compareTo(abstractC15169V0);
        }
        C15402l1 c15402l1 = (C15402l1) abstractC15169V0;
        long time = this.f48017Y.getTime();
        long time2 = c15402l1.f48017Y.getTime();
        return time == time2 ? Long.valueOf(this.f48018Z).compareTo(Long.valueOf(c15402l1.f48018Z)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC15169V0
    /* JADX INFO: renamed from: b */
    public final long mo16354b(AbstractC15169V0 abstractC15169V0) {
        return abstractC15169V0 instanceof C15402l1 ? this.f48018Z - ((C15402l1) abstractC15169V0).f48018Z : super.mo16354b(abstractC15169V0);
    }

    @Override // io.sentry.AbstractC15169V0
    /* JADX INFO: renamed from: c */
    public final long mo16355c(AbstractC15169V0 abstractC15169V0) {
        if (abstractC15169V0 == null || !(abstractC15169V0 instanceof C15402l1)) {
            return super.mo16355c(abstractC15169V0);
        }
        C15402l1 c15402l1 = (C15402l1) abstractC15169V0;
        int iCompareTo = compareTo(abstractC15169V0);
        long j10 = this.f48018Z;
        long j11 = c15402l1.f48018Z;
        if (iCompareTo < 0) {
            return mo16356d() + (j11 - j10);
        }
        return c15402l1.mo16356d() + (j10 - j11);
    }

    @Override // io.sentry.AbstractC15169V0
    /* JADX INFO: renamed from: d */
    public final long mo16356d() {
        return this.f48017Y.getTime() * 1000000;
    }

    public C15402l1() {
        this(AbstractC8656j3.m9340h(), System.nanoTime());
    }
}
