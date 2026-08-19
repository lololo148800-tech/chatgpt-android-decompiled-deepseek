package com.revenuecat.purchases.paywalls.events;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11141O;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.Backend;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
import p582Xk.HXHG.bQBnquXS;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/revenuecat/purchases/paywalls/events/PaywallBackendEvent.$serializer", "Lao/C;", "Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/revenuecat/purchases/paywalls/events/PaywallBackendEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "purchases_customEntitlementComputationRelease"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class PaywallBackendEvent$$serializer implements InterfaceC11127C {
    public static final PaywallBackendEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        PaywallBackendEvent$$serializer paywallBackendEvent$$serializer = new PaywallBackendEvent$$serializer();
        INSTANCE = paywallBackendEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revenuecat.purchases.paywalls.events.PaywallBackendEvent", paywallBackendEvent$$serializer, 11);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("version", false);
        pluginGeneratedSerialDescriptor.m18453j("type", false);
        pluginGeneratedSerialDescriptor.m18453j(Backend.APP_USER_ID, false);
        pluginGeneratedSerialDescriptor.m18453j("session_id", false);
        pluginGeneratedSerialDescriptor.m18453j("offering_id", false);
        pluginGeneratedSerialDescriptor.m18453j("paywall_revision", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("display_mode", false);
        pluginGeneratedSerialDescriptor.m18453j("dark_mode", false);
        pluginGeneratedSerialDescriptor.m18453j("locale", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private PaywallBackendEvent$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{c11181o0, c11135i, c11181o0, c11181o0, c11181o0, c11181o0, c11135i, C11141O.f33773a, c11181o0, C11164g.f33804a, c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public PaywallBackendEvent deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        boolean zMo5481o = false;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
        String strMo5483q5 = null;
        String strMo5483q6 = null;
        String strMo5483q7 = null;
        long jMo5476i = 0;
        boolean z6 = true;
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
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(descriptor2, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(descriptor2, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(descriptor2, 3);
                    i10 |= 8;
                    break;
                case 4:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(descriptor2, 4);
                    i10 |= 16;
                    break;
                case 5:
                    strMo5483q5 = interfaceC10428aMo5471c.mo5483q(descriptor2, 5);
                    i10 |= 32;
                    break;
                case 6:
                    iMo5478l2 = interfaceC10428aMo5471c.mo5478l(descriptor2, 6);
                    i10 |= 64;
                    break;
                case 7:
                    jMo5476i = interfaceC10428aMo5471c.mo5476i(descriptor2, 7);
                    i10 |= 128;
                    break;
                case 8:
                    strMo5483q6 = interfaceC10428aMo5471c.mo5483q(descriptor2, 8);
                    i10 |= 256;
                    break;
                case 9:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(descriptor2, 9);
                    i10 |= 512;
                    break;
                case 10:
                    strMo5483q7 = interfaceC10428aMo5471c.mo5483q(descriptor2, 10);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        return new PaywallBackendEvent(i10, strMo5483q, iMo5478l, strMo5483q2, strMo5483q3, strMo5483q4, strMo5483q5, iMo5478l2, jMo5476i, strMo5483q6, zMo5481o, strMo5483q7, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, PaywallBackendEvent value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, bQBnquXS.hJAsR);
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        PaywallBackendEvent.write$Self(value, interfaceC10429bMo5570c, descriptor2);
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
