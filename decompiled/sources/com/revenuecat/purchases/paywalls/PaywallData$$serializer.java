package com.revenuecat.purchases.paywalls;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
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
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/PaywallData.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/PaywallData;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallData$$serializer implements InterfaceC11127C {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 8);
        pluginGeneratedSerialDescriptor.m18453j("template_name", false);
        pluginGeneratedSerialDescriptor.m18453j("config", false);
        pluginGeneratedSerialDescriptor.m18453j("asset_base_url", false);
        pluginGeneratedSerialDescriptor.m18453j("revision", true);
        pluginGeneratedSerialDescriptor.m18453j("localized_strings", false);
        pluginGeneratedSerialDescriptor.m18453j("localized_strings_by_tier", true);
        pluginGeneratedSerialDescriptor.m18453j("zero_decimal_place_countries", true);
        pluginGeneratedSerialDescriptor.m18453j("default_locale", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = PaywallData.$childSerializers;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, C11135I.f33763a, kSerializerArr[4], kSerializerArr[5], GoogleListSerializer.INSTANCE, AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallData deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        KSerializer[] kSerializerArr = PaywallData.$childSerializers;
        Object objMo5490y = null;
        boolean z6 = true;
        Object objMo5490y2 = null;
        Object objMo5490y3 = null;
        String strMo5483q = null;
        Object objMo5490y4 = null;
        Object objMo5490y5 = null;
        Object objMo5486u = null;
        int i10 = 0;
        int iMo5478l = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, objMo5490y);
                    i10 |= 2;
                    break;
                case 2:
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(descriptor2, 2, URLSerializer.INSTANCE, objMo5490y2);
                    i10 |= 4;
                    break;
                case 3:
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(descriptor2, 3);
                    i10 |= 8;
                    break;
                case 4:
                    objMo5490y3 = interfaceC10428aMo5471c.mo5490y(descriptor2, 4, kSerializerArr[4], objMo5490y3);
                    i10 |= 16;
                    break;
                case 5:
                    objMo5490y4 = interfaceC10428aMo5471c.mo5490y(descriptor2, 5, kSerializerArr[5], objMo5490y4);
                    i10 |= 32;
                    break;
                case 6:
                    objMo5490y5 = interfaceC10428aMo5471c.mo5490y(descriptor2, 6, GoogleListSerializer.INSTANCE, objMo5490y5);
                    i10 |= 64;
                    break;
                case 7:
                    objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 7, C11181o0.f33827a, objMo5486u);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallData(i10, strMo5483q, (PaywallData.Configuration) objMo5490y, (URL) objMo5490y2, iMo5478l, (Map) objMo5490y3, (Map) objMo5490y4, (List) objMo5490y5, (String) objMo5486u, (AbstractC11171j0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallData value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallData.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
