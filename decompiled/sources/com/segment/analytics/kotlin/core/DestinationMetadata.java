package com.segment.analytics.kotlin.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p559Wn.InterfaceC8975g;
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class DestinationMetadata {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public List f40460a;

    /* JADX INFO: renamed from: b */
    public List f40461b;

    /* JADX INFO: renamed from: c */
    public List f40462c;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/DestinationMetadata$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return DestinationMetadata$$serializer.INSTANCE;
        }
    }

    public DestinationMetadata() {
        C17689w c17689w = C17689w.f56480Y;
        this.f40460a = c17689w;
        this.f40461b = c17689w;
        this.f40462c = c17689w;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DestinationMetadata)) {
            return false;
        }
        DestinationMetadata destinationMetadata = (DestinationMetadata) obj;
        return AbstractC16544l.m18089b(this.f40460a, destinationMetadata.f40460a) && AbstractC16544l.m18089b(this.f40461b, destinationMetadata.f40461b) && AbstractC16544l.m18089b(this.f40462c, destinationMetadata.f40462c);
    }

    public final int hashCode() {
        List list = this.f40460a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f40461b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f40462c;
        return iHashCode2 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "DestinationMetadata(bundled=" + this.f40460a + ", unbundled=" + this.f40461b + ", bundledIds=" + this.f40462c + ')';
    }
}
