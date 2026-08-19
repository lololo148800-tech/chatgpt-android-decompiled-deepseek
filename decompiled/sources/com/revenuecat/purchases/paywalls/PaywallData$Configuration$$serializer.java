package com.revenuecat.purchases.paywalls;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
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
import p138F8.vJO.anhfj;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallData$Configuration$$serializer implements InterfaceC11127C {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    private PaywallData$Configuration$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = PaywallData.Configuration.$childSerializers;
        KSerializer kSerializer = kSerializerArr[0];
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(paywallData$Configuration$Images$$serializer);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(paywallData$Configuration$Images$$serializer);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(kSerializerArr[4]);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(optionalURLSerializer);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(optionalURLSerializer);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(kSerializerArr[10]);
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(kSerializerArr[11]);
        KSerializer kSerializerM10615b9 = AbstractC9961r4.m10615b(c11181o0);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializer, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, c11164g, c11164g, kSerializerM10615b5, kSerializerM10615b6, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, kSerializerM10615b7, kSerializerM10615b8, kSerializerM10615b9};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallData.Configuration deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        KSerializer[] kSerializerArr = PaywallData.Configuration.$childSerializers;
        Object objMo5490y = null;
        Object objMo5486u = null;
        Object objMo5486u2 = null;
        Object objMo5486u3 = null;
        Object objMo5486u4 = null;
        Object objMo5486u5 = null;
        Object objMo5486u6 = null;
        Object objMo5490y2 = null;
        Object objMo5486u7 = null;
        Object objMo5486u8 = null;
        Object objMo5486u9 = null;
        int i10 = 0;
        boolean z6 = true;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    kSerializerArr = kSerializerArr;
                    break;
                case 0:
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 0, kSerializerArr[0], objMo5490y);
                    i10 |= 1;
                    kSerializerArr = kSerializerArr;
                    break;
                case 1:
                    objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 1, C11181o0.f33827a, objMo5486u);
                    i10 |= 2;
                    objMo5490y = objMo5490y;
                    break;
                case 2:
                    objMo5486u2 = interfaceC10428aMo5471c.mo5486u(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, objMo5486u2);
                    i10 |= 4;
                    objMo5490y = objMo5490y;
                    break;
                case 3:
                    objMo5486u3 = interfaceC10428aMo5471c.mo5486u(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, objMo5486u3);
                    i10 |= 8;
                    objMo5490y = objMo5490y;
                    break;
                case 4:
                    objMo5486u4 = interfaceC10428aMo5471c.mo5486u(descriptor2, 4, kSerializerArr[4], objMo5486u4);
                    i10 |= 16;
                    objMo5490y = objMo5490y;
                    break;
                case 5:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(descriptor2, 5);
                    i10 |= 32;
                    break;
                case 6:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(descriptor2, 6);
                    i10 |= 64;
                    break;
                case 7:
                    objMo5486u5 = interfaceC10428aMo5471c.mo5486u(descriptor2, 7, OptionalURLSerializer.INSTANCE, objMo5486u5);
                    i10 |= 128;
                    objMo5490y = objMo5490y;
                    break;
                case 8:
                    objMo5486u6 = interfaceC10428aMo5471c.mo5486u(descriptor2, 8, OptionalURLSerializer.INSTANCE, objMo5486u6);
                    i10 |= 256;
                    objMo5490y = objMo5490y;
                    break;
                case 9:
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, objMo5490y2);
                    i10 |= 512;
                    objMo5490y = objMo5490y;
                    break;
                case 10:
                    objMo5486u7 = interfaceC10428aMo5471c.mo5486u(descriptor2, 10, kSerializerArr[10], objMo5486u7);
                    i10 |= 1024;
                    objMo5490y = objMo5490y;
                    break;
                case 11:
                    objMo5486u8 = interfaceC10428aMo5471c.mo5486u(descriptor2, 11, kSerializerArr[11], objMo5486u8);
                    i10 |= 2048;
                    objMo5490y = objMo5490y;
                    break;
                case 12:
                    objMo5486u9 = interfaceC10428aMo5471c.mo5486u(descriptor2, 12, C11181o0.f33827a, objMo5486u9);
                    i10 |= 4096;
                    objMo5490y = objMo5490y;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallData.Configuration(i10, (List) objMo5490y, (String) objMo5486u, (PaywallData.Configuration.Images) objMo5486u2, (PaywallData.Configuration.Images) objMo5486u3, (Map) objMo5486u4, zMo5481o, zMo5481o2, (URL) objMo5486u5, (URL) objMo5486u6, (PaywallData.Configuration.ColorInformation) objMo5490y2, (Map) objMo5486u7, (List) objMo5486u8, (String) objMo5486u9, (AbstractC11171j0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallData.Configuration value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallData.Configuration.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        pluginGeneratedSerialDescriptor.m18453j("packages", true);
        pluginGeneratedSerialDescriptor.m18453j("default_package", true);
        pluginGeneratedSerialDescriptor.m18453j("images_webp", true);
        pluginGeneratedSerialDescriptor.m18453j("images", true);
        pluginGeneratedSerialDescriptor.m18453j("images_by_tier", true);
        pluginGeneratedSerialDescriptor.m18453j(anhfj.HKunDMLDfY, true);
        pluginGeneratedSerialDescriptor.m18453j("display_restore_purchases", true);
        pluginGeneratedSerialDescriptor.m18453j("tos_url", true);
        pluginGeneratedSerialDescriptor.m18453j("privacy_url", true);
        pluginGeneratedSerialDescriptor.m18453j("colors", false);
        pluginGeneratedSerialDescriptor.m18453j("colors_by_tier", true);
        pluginGeneratedSerialDescriptor.m18453j("tiers", true);
        pluginGeneratedSerialDescriptor.m18453j("default_tier", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
