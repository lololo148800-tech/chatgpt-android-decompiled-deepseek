package com.revenuecat.purchases.common.caching;

import com.google.protobuf.AbstractC12107L1;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.strings.ReceiptStrings;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\u0005\u001a\u00020\u0001*\u0004\u0018\u00010\u00002\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\"\u0017\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, m18067d2 = {"Ljava/util/Date;", "", "appInBackground", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "isCacheStale", "(Ljava/util/Date;ZLcom/revenuecat/purchases/common/DateProvider;)Z", "Lyn/b;", "cacheDuration", "isCacheStale-8Mi8wO0", "(Ljava/util/Date;JLcom/revenuecat/purchases/common/DateProvider;)Z", "CACHE_REFRESH_PERIOD_IN_FOREGROUND", "J", "CACHE_REFRESH_PERIOD_IN_BACKGROUND", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DateExtensionsKt {
    private static final long CACHE_REFRESH_PERIOD_IN_BACKGROUND;
    private static final long CACHE_REFRESH_PERIOD_IN_FOREGROUND;

    static {
        C21554a c21554a = C21555b.f68260Z;
        CACHE_REFRESH_PERIOD_IN_FOREGROUND = AbstractC8128k6.m8644j(5, EnumC21557d.MINUTES);
        CACHE_REFRESH_PERIOD_IN_BACKGROUND = AbstractC8128k6.m8644j(25, EnumC21557d.HOURS);
    }

    public static final boolean isCacheStale(Date date, boolean z6, DateProvider dateProvider) {
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        AbstractC12107L1.m13831v(new Object[]{Boolean.valueOf(z6)}, 1, ReceiptStrings.CHECKING_IF_CACHE_STALE, LogIntent.DEBUG);
        return m22501isCacheStale8Mi8wO0(date, z6 ? CACHE_REFRESH_PERIOD_IN_BACKGROUND : CACHE_REFRESH_PERIOD_IN_FOREGROUND, dateProvider);
    }

    public static /* synthetic */ boolean isCacheStale$default(Date date, boolean z6, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return isCacheStale(date, z6, dateProvider);
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0, reason: not valid java name */
    public static final boolean m22501isCacheStale8Mi8wO0(Date date, long j10, DateProvider dateProvider) {
        AbstractC16544l.m18094g(dateProvider, "dateProvider");
        if (date == null) {
            return true;
        }
        C21554a c21554a = C21555b.f68260Z;
        return C21555b.m21833c(AbstractC8128k6.m8645k(dateProvider.getNow().getTime() - date.getTime(), EnumC21557d.MILLISECONDS), j10) >= 0;
    }

    /* JADX INFO: renamed from: isCacheStale-8Mi8wO0$default, reason: not valid java name */
    public static /* synthetic */ boolean m22502isCacheStale8Mi8wO0$default(Date date, long j10, DateProvider dateProvider, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dateProvider = new DefaultDateProvider();
        }
        return m22501isCacheStale8Mi8wO0(date, j10, dateProvider);
    }
}
