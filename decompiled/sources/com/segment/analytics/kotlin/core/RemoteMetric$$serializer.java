package com.segment.analytics.kotlin.core;

import ao.AbstractC11153a0;
import ao.C11131E;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.Map;
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
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/segment/analytics/kotlin/core/RemoteMetric.$serializer", "Lao/C;", "Lcom/segment/analytics/kotlin/core/RemoteMetric;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/RemoteMetric;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/RemoteMetric;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class RemoteMetric$$serializer implements InterfaceC11127C {
    public static final RemoteMetric$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RemoteMetric$$serializer remoteMetric$$serializer = new RemoteMetric$$serializer();
        INSTANCE = remoteMetric$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.RemoteMetric", remoteMetric$$serializer, 5);
        pluginGeneratedSerialDescriptor.m18453j("type", false);
        pluginGeneratedSerialDescriptor.m18453j("metric", false);
        pluginGeneratedSerialDescriptor.m18453j("value", false);
        pluginGeneratedSerialDescriptor.m18453j("tags", false);
        pluginGeneratedSerialDescriptor.m18453j("log", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RemoteMetric$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, C11135I.f33763a, new C11131E(c11181o0, c11181o0, 1), AbstractC9961r4.m10615b(new C11131E(c11181o0, c11181o0, 1))};
    }

    @Override // kotlinx.serialization.KSerializer
    public RemoteMetric deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        Object objMo5490y = null;
        boolean z6 = true;
        int i10 = 0;
        int iMo5478l = 0;
        Object objMo5486u = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
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
            } else if (iMo10914s == 2) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(descriptor2, 2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                C11181o0 c11181o0 = C11181o0.f33827a;
                objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 3, new C11131E(c11181o0, c11181o0, 1), objMo5490y);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                C11181o0 c11181o1 = C11181o0.f33827a;
                objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 4, new C11131E(c11181o1, c11181o1, 1), objMo5486u);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new RemoteMetric(i10, strMo5483q, strMo5483q2, iMo5478l, (Map) objMo5490y, (Map) objMo5486u);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, RemoteMetric value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 0, value.f40482a);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 1, value.f40483b);
        interfaceC10429bMo5570c.mo5579m(2, value.f40484c, descriptor2);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5575i(descriptor2, 3, new C11131E(c11181o0, c11181o0, 1), value.f40485d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(descriptor2);
        Map map = value.f40486e;
        if (zMo5565F || map != null) {
            interfaceC10429bMo5570c.mo5585s(descriptor2, 4, new C11131E(c11181o0, c11181o0, 1), map);
        }
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
