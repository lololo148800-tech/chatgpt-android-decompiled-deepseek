package com.revenuecat.purchases.paywalls;

import ao.AbstractC11153a0;
import ao.AbstractC11171j0;
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
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Colors.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallData$Configuration$Colors$$serializer implements InterfaceC11127C {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 15);
        pluginGeneratedSerialDescriptor.m18453j("background", false);
        pluginGeneratedSerialDescriptor.m18453j("text_1", false);
        pluginGeneratedSerialDescriptor.m18453j("text_2", true);
        pluginGeneratedSerialDescriptor.m18453j("text_3", true);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action_background", false);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action_foreground", false);
        pluginGeneratedSerialDescriptor.m18453j("call_to_action_secondary_background", true);
        pluginGeneratedSerialDescriptor.m18453j("accent_1", true);
        pluginGeneratedSerialDescriptor.m18453j("accent_2", true);
        pluginGeneratedSerialDescriptor.m18453j("accent_3", true);
        pluginGeneratedSerialDescriptor.m18453j("close_button", true);
        pluginGeneratedSerialDescriptor.m18453j("tier_control_background", true);
        pluginGeneratedSerialDescriptor.m18453j("tier_control_foreground", true);
        pluginGeneratedSerialDescriptor.m18453j("tier_control_selected_background", true);
        pluginGeneratedSerialDescriptor.m18453j("tier_control_selected_foreground", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new KSerializer[]{serializer, serializer, AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), serializer, serializer, AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer), AbstractC9961r4.m10615b(serializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallData.Configuration.Colors deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        Object objMo5486u = null;
        Object objMo5486u2 = null;
        Object objMo5486u3 = null;
        Object objMo5486u4 = null;
        Object objMo5486u5 = null;
        Object objMo5490y = null;
        Object objMo5490y2 = null;
        Object objMo5486u6 = null;
        Object objMo5486u7 = null;
        Object objMo5486u8 = null;
        Object objMo5486u9 = null;
        Object objMo5486u10 = null;
        Object objMo5486u11 = null;
        Object objMo5490y3 = null;
        Object objMo5490y4 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            Object obj = objMo5486u4;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            switch (iMo10914s) {
                case -1:
                    objMo5486u4 = obj;
                    z6 = false;
                    objMo5486u3 = objMo5486u3;
                    objMo5486u2 = objMo5486u2;
                    objMo5486u5 = objMo5486u5;
                    objMo5486u = objMo5486u;
                    objMo5490y3 = objMo5490y3;
                    objMo5486u11 = objMo5486u11;
                    break;
                case 0:
                    i10 |= 1;
                    objMo5486u5 = objMo5486u5;
                    objMo5486u3 = objMo5486u3;
                    objMo5486u11 = objMo5486u11;
                    objMo5486u = objMo5486u;
                    objMo5490y3 = interfaceC10428aMo5471c.mo5490y(descriptor2, 0, PaywallColor.Serializer.INSTANCE, objMo5490y3);
                    objMo5486u4 = obj;
                    objMo5486u2 = objMo5486u2;
                    break;
                case 1:
                    objMo5490y4 = interfaceC10428aMo5471c.mo5490y(descriptor2, 1, PaywallColor.Serializer.INSTANCE, objMo5490y4);
                    i10 |= 2;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    objMo5486u3 = objMo5486u3;
                    objMo5486u2 = objMo5486u2;
                    objMo5486u = objMo5486u;
                    break;
                case 2:
                    objMo5486u4 = interfaceC10428aMo5471c.mo5486u(descriptor2, 2, PaywallColor.Serializer.INSTANCE, obj);
                    i10 |= 4;
                    objMo5486u5 = objMo5486u5;
                    objMo5486u2 = objMo5486u2;
                    objMo5486u = objMo5486u;
                    break;
                case 3:
                    objMo5486u = objMo5486u;
                    objMo5486u5 = interfaceC10428aMo5471c.mo5486u(descriptor2, 3, PaywallColor.Serializer.INSTANCE, objMo5486u5);
                    i10 |= 8;
                    objMo5486u4 = obj;
                    objMo5486u = objMo5486u;
                    break;
                case 4:
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 4, PaywallColor.Serializer.INSTANCE, objMo5490y);
                    i10 |= 16;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 5:
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(descriptor2, 5, PaywallColor.Serializer.INSTANCE, objMo5490y2);
                    i10 |= 32;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 6:
                    objMo5486u6 = interfaceC10428aMo5471c.mo5486u(descriptor2, 6, PaywallColor.Serializer.INSTANCE, objMo5486u6);
                    i10 |= 64;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 7:
                    objMo5486u7 = interfaceC10428aMo5471c.mo5486u(descriptor2, 7, PaywallColor.Serializer.INSTANCE, objMo5486u7);
                    i10 |= 128;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 8:
                    objMo5486u8 = interfaceC10428aMo5471c.mo5486u(descriptor2, 8, PaywallColor.Serializer.INSTANCE, objMo5486u8);
                    i10 |= 256;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 9:
                    objMo5486u9 = interfaceC10428aMo5471c.mo5486u(descriptor2, 9, PaywallColor.Serializer.INSTANCE, objMo5486u9);
                    i10 |= 512;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 10:
                    objMo5486u10 = interfaceC10428aMo5471c.mo5486u(descriptor2, 10, PaywallColor.Serializer.INSTANCE, objMo5486u10);
                    i10 |= 1024;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 11:
                    objMo5486u11 = interfaceC10428aMo5471c.mo5486u(descriptor2, 11, PaywallColor.Serializer.INSTANCE, objMo5486u11);
                    i10 |= 2048;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 12:
                    objMo5486u3 = interfaceC10428aMo5471c.mo5486u(descriptor2, 12, PaywallColor.Serializer.INSTANCE, objMo5486u3);
                    i10 |= 4096;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 13:
                    objMo5486u2 = interfaceC10428aMo5471c.mo5486u(descriptor2, 13, PaywallColor.Serializer.INSTANCE, objMo5486u2);
                    i10 |= 8192;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                case 14:
                    objMo5486u = interfaceC10428aMo5471c.mo5486u(descriptor2, 14, PaywallColor.Serializer.INSTANCE, objMo5486u);
                    i10 |= 16384;
                    objMo5486u4 = obj;
                    objMo5486u5 = objMo5486u5;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        Object obj2 = objMo5486u2;
        Object obj3 = objMo5486u3;
        Object obj4 = objMo5486u;
        Object obj5 = objMo5490y3;
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallData.Configuration.Colors(i10, (PaywallColor) obj5, (PaywallColor) objMo5490y4, (PaywallColor) objMo5486u4, (PaywallColor) objMo5486u5, (PaywallColor) objMo5490y, (PaywallColor) objMo5490y2, (PaywallColor) objMo5486u6, (PaywallColor) objMo5486u7, (PaywallColor) objMo5486u8, (PaywallColor) objMo5486u9, (PaywallColor) objMo5486u10, (PaywallColor) objMo5486u11, (PaywallColor) obj3, (PaywallColor) obj2, (PaywallColor) obj4, (AbstractC11171j0) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallData.Configuration.Colors value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallData.Configuration.Colors.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
