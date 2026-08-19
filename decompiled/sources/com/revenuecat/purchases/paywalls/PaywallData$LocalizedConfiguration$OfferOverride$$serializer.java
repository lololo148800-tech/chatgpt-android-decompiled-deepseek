package com.revenuecat.purchases.paywalls;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
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
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.OfferOverride.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration$OfferOverride;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallData$LocalizedConfiguration$OfferOverride$$serializer implements InterfaceC11127C {
    public static final PaywallData$LocalizedConfiguration$OfferOverride$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallData$LocalizedConfiguration$OfferOverride$$serializer paywallData$LocalizedConfiguration$OfferOverride$$serializer = new PaywallData$LocalizedConfiguration$OfferOverride$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$OfferOverride$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride", paywallData$LocalizedConfiguration$OfferOverride$$serializer, 5);
        pluginGeneratedSerialDescriptor.m18453j("offer_name", false);
        pluginGeneratedSerialDescriptor.m18453j("offer_details", false);
        pluginGeneratedSerialDescriptor.m18453j("offer_details_with_intro_offer", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_details_with_multiple_intro_offers", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_badge", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$LocalizedConfiguration$OfferOverride$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallData.LocalizedConfiguration.OfferOverride deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        Object objMo5486u = null;
        boolean z6 = true;
        int i10 = 0;
        Object objMo5486u2 = null;
        Object objMo5486u3 = null;
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
                objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objMo5486u);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                objMo5486u2 = interfaceC10428aMo5471c.mo5486u(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objMo5486u2);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                objMo5486u3 = interfaceC10428aMo5471c.mo5486u(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objMo5486u3);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallData.LocalizedConfiguration.OfferOverride(i10, strMo5483q, strMo5483q2, (String) objMo5486u, (String) objMo5486u2, (String) objMo5486u3, (AbstractC11171j0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallData.LocalizedConfiguration.OfferOverride value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallData.LocalizedConfiguration.OfferOverride.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
