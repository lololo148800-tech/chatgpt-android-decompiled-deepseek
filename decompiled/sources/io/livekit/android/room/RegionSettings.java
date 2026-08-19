package io.livekit.android.room;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import livekit.LivekitInternal$NodeStats;
import p559Wn.InterfaceC8975g;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, m18067d2 = {"Lio/livekit/android/room/RegionSettings;", "", "Companion", "$serializer", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final /* data */ class RegionSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f46936b = {new C11158d(RegionInfo$$serializer.INSTANCE, 0)};

    /* JADX INFO: renamed from: a */
    public final List f46937a;

    @Metadata(m18066d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m18067d2 = {"Lio/livekit/android/room/RegionSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/RegionSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public static final class Companion {
        public final KSerializer serializer() {
            return RegionSettings$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RegionSettings(int i10, List list) {
        if (1 == (i10 & 1)) {
            this.f46937a = list;
        } else {
            AbstractC11153a0.m12389l(i10, 1, RegionSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RegionSettings) && AbstractC16544l.m18089b(this.f46937a, ((RegionSettings) obj).f46937a);
    }

    public final int hashCode() {
        return this.f46937a.hashCode();
    }

    public final String toString() {
        return "RegionSettings(regions=" + this.f46937a + ')';
    }

    public RegionSettings(ArrayList arrayList) {
        this.f46937a = arrayList;
    }
}
