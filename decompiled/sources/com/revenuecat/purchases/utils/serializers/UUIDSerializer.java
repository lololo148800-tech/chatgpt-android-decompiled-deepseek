package com.revenuecat.purchases.utils.serializers;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import livekit.LivekitInternal$NodeStats;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/UUID;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/util/UUID;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/util/UUID;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class UUIDSerializer implements KSerializer {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final SerialDescriptor descriptor = AbstractC11336c.m12772b("UUID", C10104e.f29918j);

    private UUIDSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public UUID deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.mo5479m());
        AbstractC16544l.m18093f(uuidFromString, "fromString(decoder.decodeString())");
        return uuidFromString;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, UUID value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        String string = value.toString();
        AbstractC16544l.m18093f(string, "value.toString()");
        encoder.mo5566G(string);
    }
}
