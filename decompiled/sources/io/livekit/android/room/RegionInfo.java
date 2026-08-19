package io.livekit.android.room;

import ao.AbstractC11153a0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p003A1.AbstractC0168G;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lio/livekit/android/room/RegionInfo;", "", "Companion", "$serializer", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class RegionInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public final String f46933a;

    /* JADX INFO: renamed from: b */
    public final String f46934b;

    /* JADX INFO: renamed from: c */
    public final long f46935c;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lio/livekit/android/room/RegionInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/RegionInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return RegionInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegionInfo(String str, int i10, String str2, long j10) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, RegionInfo$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f46933a = str;
        this.f46934b = str2;
        this.f46935c = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionInfo)) {
            return false;
        }
        RegionInfo regionInfo = (RegionInfo) obj;
        return AbstractC16544l.m18089b(this.f46933a, regionInfo.f46933a) && AbstractC16544l.m18089b(this.f46934b, regionInfo.f46934b) && this.f46935c == regionInfo.f46935c;
    }

    public final int hashCode() {
        int iM527p = AbstractC0168G.m527p(this.f46933a.hashCode() * 31, 31, this.f46934b);
        long j10 = this.f46935c;
        return iM527p + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "RegionInfo(region=" + this.f46933a + ", url=" + this.f46934b + ", distance=" + this.f46935c + ')';
    }

    public RegionInfo(String str, long j10, String str2) {
        this.f46933a = str;
        this.f46934b = str2;
        this.f46935c = j10;
    }
}
