package com.segment.analytics.kotlin.core.platform.plugins;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class SegmentSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public String f40515a;

    /* JADX INFO: renamed from: b */
    public String f40516b;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/platform/plugins/SegmentSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return SegmentSettings$$serializer.INSTANCE;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentSettings)) {
            return false;
        }
        SegmentSettings segmentSettings = (SegmentSettings) obj;
        return AbstractC16544l.m18089b(this.f40515a, segmentSettings.f40515a) && AbstractC16544l.m18089b(this.f40516b, segmentSettings.f40516b);
    }

    public final int hashCode() {
        int iHashCode = this.f40515a.hashCode() * 31;
        String str = this.f40516b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SegmentSettings(apiKey=");
        sb2.append(this.f40515a);
        sb2.append(", apiHost=");
        return AbstractC9306j0.m9892k(sb2, this.f40516b, ')');
    }
}
