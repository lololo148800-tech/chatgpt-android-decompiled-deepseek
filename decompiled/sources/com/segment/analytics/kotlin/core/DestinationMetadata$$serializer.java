package com.segment.analytics.kotlin.core;

import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
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
import p909nm.C17689w;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/segment/analytics/kotlin/core/DestinationMetadata.$serializer", "Lao/C;", "Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/DestinationMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/DestinationMetadata;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DestinationMetadata$$serializer implements InterfaceC11127C {
    public static final DestinationMetadata$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        DestinationMetadata$$serializer destinationMetadata$$serializer = new DestinationMetadata$$serializer();
        INSTANCE = destinationMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.segment.analytics.kotlin.core.DestinationMetadata", destinationMetadata$$serializer, 3);
        pluginGeneratedSerialDescriptor.m18453j("bundled", true);
        pluginGeneratedSerialDescriptor.m18453j("unbundled", true);
        pluginGeneratedSerialDescriptor.m18453j("bundledIds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private DestinationMetadata$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{AbstractC9961r4.m10615b(new C11158d(c11181o0, 0)), AbstractC9961r4.m10615b(new C11158d(c11181o0, 0)), AbstractC9961r4.m10615b(new C11158d(c11181o0, 0))};
    }

    @Override // kotlinx.serialization.KSerializer
    public DestinationMetadata deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        Object objMo5486u = null;
        boolean z6 = true;
        int i10 = 0;
        Object objMo5486u2 = null;
        Object objMo5486u3 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 0, new C11158d(C11181o0.f33827a, 0), objMo5486u);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                objMo5486u2 = interfaceC10428aMo5471c.mo5486u(descriptor2, 1, new C11158d(C11181o0.f33827a, 0), objMo5486u2);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                objMo5486u3 = interfaceC10428aMo5471c.mo5486u(descriptor2, 2, new C11158d(C11181o0.f33827a, 0), objMo5486u3);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        List list = (List) objMo5486u;
        List list2 = (List) objMo5486u2;
        List list3 = (List) objMo5486u3;
        DestinationMetadata destinationMetadata = new DestinationMetadata();
        int i11 = i10 & 1;
        C17689w c17689w = C17689w.f56480Y;
        if (i11 == 0) {
            destinationMetadata.f40460a = c17689w;
        } else {
            destinationMetadata.f40460a = list;
        }
        if ((i10 & 2) == 0) {
            destinationMetadata.f40461b = c17689w;
        } else {
            destinationMetadata.f40461b = list2;
        }
        if ((i10 & 4) == 0) {
            destinationMetadata.f40462c = c17689w;
        } else {
            destinationMetadata.f40462c = list3;
        }
        return destinationMetadata;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, DestinationMetadata value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(descriptor2);
        C17689w c17689w = C17689w.f56480Y;
        if (zMo5565F || !AbstractC16544l.m18089b(value.f40460a, c17689w)) {
            interfaceC10429bMo5570c.mo5585s(descriptor2, 0, new C11158d(C11181o0.f33827a, 0), value.f40460a);
        }
        if (interfaceC10429bMo5570c.mo5565F(descriptor2) || !AbstractC16544l.m18089b(value.f40461b, c17689w)) {
            interfaceC10429bMo5570c.mo5585s(descriptor2, 1, new C11158d(C11181o0.f33827a, 0), value.f40461b);
        }
        if (interfaceC10429bMo5570c.mo5565F(descriptor2) || !AbstractC16544l.m18089b(value.f40462c, c17689w)) {
            interfaceC10429bMo5570c.mo5585s(descriptor2, 2, new C11158d(C11181o0.f33827a, 0), value.f40462c);
        }
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
