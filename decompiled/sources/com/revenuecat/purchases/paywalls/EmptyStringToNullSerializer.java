package com.revenuecat.purchases.paywalls;

import ao.C11181o0;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import livekit.LivekitInternal$NodeStats;
import p1113xn.AbstractC21322p;
import p594Y9.AbstractC9961r4;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m18067d2 = {"Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/String;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/String;)V", "delegate", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class EmptyStringToNullSerializer implements KSerializer {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final KSerializer delegate = AbstractC9961r4.m10615b(C11181o0.f33827a);
    private static final SerialDescriptor descriptor = AbstractC11336c.m12772b("EmptyStringToNullSerializer", C10104e.f29918j);

    private EmptyStringToNullSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public String deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String str = (String) delegate.deserialize(decoder);
        if (str == null || AbstractC21322p.m21681O(str)) {
            return null;
        }
        return str;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, String value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        if (value == null) {
            encoder.mo5566G("");
        } else {
            encoder.mo5566G(value);
        }
    }
}
