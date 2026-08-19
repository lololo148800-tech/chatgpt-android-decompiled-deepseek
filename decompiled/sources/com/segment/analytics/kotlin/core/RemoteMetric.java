package com.segment.analytics.kotlin.core;

import ao.AbstractC11153a0;
import com.google.protobuf.AbstractC12107L1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p1071w0.AbstractC20734X;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/RemoteMetric;", "", "Companion", "$serializer", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class RemoteMetric {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public final String f40482a;

    /* JADX INFO: renamed from: b */
    public final String f40483b;

    /* JADX INFO: renamed from: c */
    public int f40484c;

    /* JADX INFO: renamed from: d */
    public final Map f40485d;

    /* JADX INFO: renamed from: e */
    public final Map f40486e;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lcom/segment/analytics/kotlin/core/RemoteMetric$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/segment/analytics/kotlin/core/RemoteMetric;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return RemoteMetric$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RemoteMetric(int i10, String str, String str2, int i11, Map map, Map map2) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, RemoteMetric$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f40482a = str;
        this.f40483b = str2;
        this.f40484c = i11;
        this.f40485d = map;
        if ((i10 & 16) == 0) {
            this.f40486e = null;
        } else {
            this.f40486e = map2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteMetric)) {
            return false;
        }
        RemoteMetric remoteMetric = (RemoteMetric) obj;
        return AbstractC16544l.m18089b(this.f40482a, remoteMetric.f40482a) && AbstractC16544l.m18089b(this.f40483b, remoteMetric.f40483b) && this.f40484c == remoteMetric.f40484c && AbstractC16544l.m18089b(this.f40485d, remoteMetric.f40485d) && AbstractC16544l.m18089b(this.f40486e, remoteMetric.f40486e);
    }

    public final int hashCode() {
        int iM21250u = AbstractC20734X.m21250u((AbstractC0168G.m527p(this.f40482a.hashCode() * 31, 31, this.f40483b) + this.f40484c) * 31, 31, this.f40485d);
        Map map = this.f40486e;
        return iM21250u + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RemoteMetric(type=");
        sb2.append(this.f40482a);
        sb2.append(", metric=");
        sb2.append(this.f40483b);
        sb2.append(", value=");
        sb2.append(this.f40484c);
        sb2.append(", tags=");
        sb2.append(this.f40485d);
        sb2.append(", log=");
        return AbstractC12107L1.m13827r(sb2, this.f40486e, ')');
    }

    public RemoteMetric(String str, int i10, LinkedHashMap linkedHashMap, Map map) {
        this.f40482a = "Counter";
        this.f40483b = str;
        this.f40484c = i10;
        this.f40485d = linkedHashMap;
        this.f40486e = map;
    }
}
