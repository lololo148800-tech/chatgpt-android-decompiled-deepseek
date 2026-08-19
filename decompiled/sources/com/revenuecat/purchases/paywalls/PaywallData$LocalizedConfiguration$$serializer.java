package com.revenuecat.purchases.paywalls;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
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
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallData$LocalizedConfiguration$$serializer implements InterfaceC11127C {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("subtitle", true);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action", false);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action_with_intro_offer", true);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action_with_multiple_intro_offers", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_details", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_details_with_intro_offer", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_details_with_multiple_intro_offers", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_name", true);
        pluginGeneratedSerialDescriptor.m18453j("features", true);
        pluginGeneratedSerialDescriptor.m18453j("tier_name", true);
        pluginGeneratedSerialDescriptor.m18453j("offer_overrides", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = PaywallData.LocalizedConfiguration.$childSerializers;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializer = kSerializerArr[9];
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(emptyStringToNullSerializer);
        KSerializer kSerializer2 = kSerializerArr[11];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, kSerializerM10615b, c11181o0, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6, kSerializerM10615b7, kSerializer, kSerializerM10615b8, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallData.LocalizedConfiguration deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        KSerializer[] kSerializerArr = PaywallData.LocalizedConfiguration.$childSerializers;
        Object objMo5486u = null;
        Object objMo5486u2 = null;
        Object objMo5486u3 = null;
        String strMo5483q = null;
        Object objMo5486u4 = null;
        Object objMo5486u5 = null;
        Object objMo5486u6 = null;
        Object objMo5486u7 = null;
        Object objMo5490y = null;
        Object objMo5486u8 = null;
        Object objMo5490y2 = null;
        String strMo5483q2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    i10 |= 1;
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(descriptor2, 0);
                    continue;
                case 1:
                    objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objMo5486u);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(descriptor2, 2);
                    i10 |= 4;
                    continue;
                case 3:
                    objMo5486u2 = interfaceC10428aMo5471c.mo5486u(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objMo5486u2);
                    i10 |= 8;
                    break;
                case 4:
                    objMo5486u3 = interfaceC10428aMo5471c.mo5486u(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objMo5486u3);
                    i10 |= 16;
                    break;
                case 5:
                    objMo5486u4 = interfaceC10428aMo5471c.mo5486u(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, objMo5486u4);
                    i10 |= 32;
                    break;
                case 6:
                    objMo5486u5 = interfaceC10428aMo5471c.mo5486u(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, objMo5486u5);
                    i10 |= 64;
                    break;
                case 7:
                    objMo5486u6 = interfaceC10428aMo5471c.mo5486u(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, objMo5486u6);
                    i10 |= 128;
                    break;
                case 8:
                    objMo5486u7 = interfaceC10428aMo5471c.mo5486u(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, objMo5486u7);
                    i10 |= 256;
                    break;
                case 9:
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 9, kSerializerArr[9], objMo5490y);
                    i10 |= 512;
                    break;
                case 10:
                    objMo5486u8 = interfaceC10428aMo5471c.mo5486u(descriptor2, 10, EmptyStringToNullSerializer.INSTANCE, objMo5486u8);
                    i10 |= 1024;
                    break;
                case 11:
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(descriptor2, 11, kSerializerArr[11], objMo5490y2);
                    i10 |= 2048;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            strMo5483q = strMo5483q;
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallData.LocalizedConfiguration(i10, strMo5483q, (String) objMo5486u, strMo5483q2, (String) objMo5486u2, (String) objMo5486u3, (String) objMo5486u4, (String) objMo5486u5, (String) objMo5486u6, (String) objMo5486u7, (List) objMo5490y, (String) objMo5486u8, (Map) objMo5490y2, (AbstractC11171j0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallData.LocalizedConfiguration value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
