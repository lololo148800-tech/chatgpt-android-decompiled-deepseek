package com.revenuecat.purchases.common;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a&\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, m18067d2 = {"Lyn/a;", "Ljava/util/Date;", "startTime", "endTime", "Lyn/b;", "between", "(Lyn/a;Ljava/util/Date;Ljava/util/Date;)J", "duration1", "duration2", "min-QTBD994", "(JJ)J", "min", "purchases_customEntitlementComputationRelease"}, m18068k = 2, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DurationExtensionsKt {
    public static final long between(C21554a c21554a, Date startTime, Date endTime) {
        AbstractC16544l.m18094g(c21554a, "<this>");
        AbstractC16544l.m18094g(startTime, "startTime");
        AbstractC16544l.m18094g(endTime, "endTime");
        return AbstractC8128k6.m8645k(endTime.getTime() - startTime.getTime(), EnumC21557d.MILLISECONDS);
    }

    /* JADX INFO: renamed from: min-QTBD994, reason: not valid java name */
    public static final long m22500minQTBD994(long j10, long j11) {
        return C21555b.m21833c(j10, j11) < 0 ? j10 : j11;
    }
}
