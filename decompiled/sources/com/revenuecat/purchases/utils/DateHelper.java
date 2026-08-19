package com.revenuecat.purchases.utils;

import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import livekit.LivekitInternal$NodeStats;
import p1135yn.C21554a;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p523V9.AbstractC8128k6;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/DateHelper;", "", "()V", "Companion", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DateHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ENTITLEMENT_GRACE_PERIOD;

    @Metadata(m18066d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\u00020\u00078\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/DateHelper$Companion;", "", "<init>", "()V", "Ljava/util/Date;", "expirationDate", "requestDate", "Lyn/b;", "gracePeriod", "Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive-SxA4cEA", "(Ljava/util/Date;Ljava/util/Date;J)Lcom/revenuecat/purchases/utils/DateActive;", "isDateActive", "ENTITLEMENT_GRACE_PERIOD", "J", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA$default, reason: not valid java name */
        public static /* synthetic */ DateActive m22528isDateActiveSxA4cEA$default(Companion companion, Date date, Date date2, long j10, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                j10 = DateHelper.ENTITLEMENT_GRACE_PERIOD;
            }
            return companion.m22529isDateActiveSxA4cEA(date, date2, j10);
        }

        /* JADX INFO: renamed from: isDateActive-SxA4cEA, reason: not valid java name */
        public final DateActive m22529isDateActiveSxA4cEA(Date expirationDate, Date requestDate, long gracePeriod) {
            AbstractC16544l.m18094g(requestDate, "requestDate");
            if (expirationDate == null) {
                return new DateActive(true, true);
            }
            boolean z6 = new Date().getTime() - requestDate.getTime() <= C21555b.m21835e(gracePeriod);
            if (!z6) {
                requestDate = new Date();
            }
            return new DateActive(expirationDate.after(requestDate), z6);
        }

        private Companion() {
        }
    }

    static {
        C21554a c21554a = C21555b.f68260Z;
        ENTITLEMENT_GRACE_PERIOD = AbstractC8128k6.m8644j(3, EnumC21557d.DAYS);
    }

    private DateHelper() {
    }
}
