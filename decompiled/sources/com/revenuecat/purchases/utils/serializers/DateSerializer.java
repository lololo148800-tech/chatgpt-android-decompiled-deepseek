package com.revenuecat.purchases.utils.serializers;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.Date;
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
@Metadata(m18066d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m18067d2 = {"Lcom/revenuecat/purchases/utils/serializers/DateSerializer;", "Lkotlinx/serialization/KSerializer;", "Ljava/util/Date;", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/util/Date;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Ljava/util/Date;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DateSerializer implements KSerializer {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return AbstractC11336c.m12772b(SIPHeaderNames.DATE, C10104e.f29916h);
    }

    @Override // kotlinx.serialization.KSerializer
    public Date deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return new Date(decoder.mo5480n());
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Date value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        encoder.mo5562C(value.getTime());
    }
}
