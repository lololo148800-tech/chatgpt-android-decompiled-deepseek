package io.livekit.android.room;

import ao.AbstractC11153a0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p559Wn.InterfaceC8975g;
import p571X9.AbstractC9306j0;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lio/livekit/android/room/IceCandidateJSON;", "", "Companion", "$serializer", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class IceCandidateJSON {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a */
    public final String f46930a;

    /* JADX INFO: renamed from: b */
    public final int f46931b;

    /* JADX INFO: renamed from: c */
    public final String f46932c;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lio/livekit/android/room/IceCandidateJSON$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/IceCandidateJSON;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return IceCandidateJSON$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IceCandidateJSON(String str, int i10, int i11, String str2) {
        if (7 != (i10 & 7)) {
            AbstractC11153a0.m12389l(i10, 7, IceCandidateJSON$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.f46930a = str;
        this.f46931b = i11;
        this.f46932c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IceCandidateJSON)) {
            return false;
        }
        IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) obj;
        return AbstractC16544l.m18089b(this.f46930a, iceCandidateJSON.f46930a) && this.f46931b == iceCandidateJSON.f46931b && AbstractC16544l.m18089b(this.f46932c, iceCandidateJSON.f46932c);
    }

    public final int hashCode() {
        int iHashCode = ((this.f46930a.hashCode() * 31) + this.f46931b) * 31;
        String str = this.f46932c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IceCandidateJSON(candidate=");
        sb2.append(this.f46930a);
        sb2.append(", sdpMLineIndex=");
        sb2.append(this.f46931b);
        sb2.append(", sdpMid=");
        return AbstractC9306j0.m9892k(sb2, this.f46932c, ')');
    }

    public IceCandidateJSON(String candidate, int i10, String str) {
        AbstractC16544l.m18094g(candidate, "candidate");
        this.f46930a = candidate;
        this.f46931b = i10;
        this.f46932c = str;
    }
}
