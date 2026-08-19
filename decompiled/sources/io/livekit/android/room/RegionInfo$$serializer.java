package io.livekit.android.room;

import ao.AbstractC11153a0;
import ao.C11141O;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"io/livekit/android/room/RegionInfo.$serializer", "Lao/C;", "Lio/livekit/android/room/RegionInfo;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/livekit/android/room/RegionInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/livekit/android/room/RegionInfo;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "livekit-android-sdk_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class RegionInfo$$serializer implements InterfaceC11127C {
    public static final RegionInfo$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RegionInfo$$serializer regionInfo$$serializer = new RegionInfo$$serializer();
        INSTANCE = regionInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.livekit.android.room.RegionInfo", regionInfo$$serializer, 3);
        pluginGeneratedSerialDescriptor.m18453j("region", false);
        pluginGeneratedSerialDescriptor.m18453j("url", false);
        pluginGeneratedSerialDescriptor.m18453j("distance", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RegionInfo$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, C11141O.f33773a};
    }

    @Override // kotlinx.serialization.KSerializer
    public RegionInfo deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        int i10 = 0;
        String strMo5483q = null;
        String strMo5483q2 = null;
        long jMo5476i = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(descriptor2, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(descriptor2, 1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                jMo5476i = interfaceC10428aMo5471c.mo5476i(descriptor2, 2);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new RegionInfo(strMo5483q, i10, strMo5483q2, jMo5476i);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, RegionInfo value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 0, value.f46933a);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 1, value.f46934b);
        interfaceC10429bMo5570c.mo5564E(descriptor2, 2, value.f46935c);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
