package com.segment.analytics.kotlin.core;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p530Vi.EnumC8319o;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"com/segment/analytics/kotlin/core/EventType$Companion", "", "Lkotlinx/serialization/KSerializer;", "LVi/o;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class EventType$Companion {
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, mm.i] */
    public final KSerializer serializer() {
        return (KSerializer) EnumC8319o.f25934Y.getValue();
    }
}
