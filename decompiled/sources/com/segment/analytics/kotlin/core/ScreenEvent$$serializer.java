package com.segment.analytics.kotlin.core;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import bo.C11536x;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.C16644c;
import livekit.LivekitInternal$NodeStats;
import mm.InterfaceC17300c;
import p530Vi.EnumC8319o;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC17300c
@Metadata(m18066d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m18067d2 = {"com/segment/analytics/kotlin/core/ScreenEvent.$serializer", "Lao/C;", "Lcom/segment/analytics/kotlin/core/ScreenEvent;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/segment/analytics/kotlin/core/ScreenEvent;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lmm/C;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/segment/analytics/kotlin/core/ScreenEvent;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "core"}, m18068k = 1, m18069mv = {1, 8, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ScreenEvent$$serializer implements InterfaceC11127C {
    public static final ScreenEvent$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        ScreenEvent$$serializer screenEvent$$serializer = new ScreenEvent$$serializer();
        INSTANCE = screenEvent$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("screen", screenEvent$$serializer, 11);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("category", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.PROPERTIES_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        pluginGeneratedSerialDescriptor.m18453j("messageId", false);
        pluginGeneratedSerialDescriptor.m18453j("anonymousId", false);
        pluginGeneratedSerialDescriptor.m18453j("context", false);
        pluginGeneratedSerialDescriptor.m18453j("integrations", false);
        pluginGeneratedSerialDescriptor.m18453j("userId", true);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("_metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ScreenEvent$$serializer() {
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] childSerializers() {
        KSerializer kSerializerSerializer = EnumC8319o.Companion.serializer();
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11536x c11536x = C11536x.f34902a;
        return new KSerializer[]{c11181o0, c11181o0, c11536x, kSerializerSerializer, c11181o0, c11181o0, c11536x, c11536x, c11181o0, c11181o0, DestinationMetadata$$serializer.INSTANCE};
    }

    @Override // kotlinx.serialization.KSerializer
    public ScreenEvent deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(descriptor2);
        Object objMo5490y = null;
        String strMo5483q = null;
        boolean z6 = true;
        int i10 = 0;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        Object objMo5490y2 = null;
        Object objMo5490y3 = null;
        String strMo5483q4 = null;
        String strMo5483q5 = null;
        Object objMo5490y4 = null;
        Object objMo5490y5 = null;
        String strMo5483q6 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(descriptor2);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(descriptor2, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(descriptor2, 1);
                    i10 |= 2;
                    continue;
                case 2:
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(descriptor2, 2, C11536x.f34902a, objMo5490y2);
                    i10 |= 4;
                    break;
                case 3:
                    objMo5490y3 = interfaceC10428aMo5471c.mo5490y(descriptor2, 3, EnumC8319o.Companion.serializer(), objMo5490y3);
                    i10 |= 8;
                    break;
                case 4:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(descriptor2, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    strMo5483q5 = interfaceC10428aMo5471c.mo5483q(descriptor2, 5);
                    i10 |= 32;
                    continue;
                case 6:
                    objMo5490y4 = interfaceC10428aMo5471c.mo5490y(descriptor2, 6, C11536x.f34902a, objMo5490y4);
                    i10 |= 64;
                    break;
                case 7:
                    objMo5490y5 = interfaceC10428aMo5471c.mo5490y(descriptor2, 7, C11536x.f34902a, objMo5490y5);
                    i10 |= 128;
                    break;
                case 8:
                    strMo5483q6 = interfaceC10428aMo5471c.mo5483q(descriptor2, 8);
                    i10 |= 256;
                    continue;
                case 9:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(descriptor2, 9);
                    i10 |= 512;
                    continue;
                case 10:
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(descriptor2, 10, DestinationMetadata$$serializer.INSTANCE, objMo5490y);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z6;
        }
        interfaceC10428aMo5471c.mo5470b(descriptor2);
        C16644c c16644c = (C16644c) objMo5490y2;
        EnumC8319o enumC8319o = (EnumC8319o) objMo5490y3;
        C16644c c16644c2 = (C16644c) objMo5490y4;
        C16644c c16644c3 = (C16644c) objMo5490y5;
        DestinationMetadata destinationMetadata = (DestinationMetadata) objMo5490y;
        if (759 != (i10 & 759)) {
            AbstractC11153a0.m12389l(i10, 759, INSTANCE.getDescriptor());
            throw null;
        }
        ScreenEvent screenEvent = new ScreenEvent();
        screenEvent.f40487a = strMo5483q2;
        screenEvent.f40488b = strMo5483q3;
        screenEvent.f40489c = c16644c;
        if ((i10 & 8) == 0) {
            screenEvent.f40490d = EnumC8319o.f25936o0;
        } else {
            screenEvent.f40490d = enumC8319o;
        }
        screenEvent.f40491e = strMo5483q4;
        screenEvent.f40492f = strMo5483q5;
        screenEvent.f40493g = c16644c2;
        screenEvent.f40494h = c16644c3;
        if ((i10 & 256) == 0) {
            screenEvent.f40495i = "";
        } else {
            screenEvent.f40495i = strMo5483q6;
        }
        screenEvent.f40496j = strMo5483q;
        if ((i10 & 1024) == 0) {
            screenEvent.f40497k = new DestinationMetadata();
        } else {
            screenEvent.f40497k = destinationMetadata;
        }
        return screenEvent;
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, ScreenEvent value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor descriptor2 = getDescriptor();
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(descriptor2);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 0, value.f40487a);
        interfaceC10429bMo5570c.mo5584r(descriptor2, 1, value.f40488b);
        C11536x c11536x = C11536x.f34902a;
        interfaceC10429bMo5570c.mo5575i(descriptor2, 2, c11536x, value.f40489c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(descriptor2);
        EnumC8319o enumC8319o = value.f40490d;
        if (zMo5565F || enumC8319o != EnumC8319o.f25936o0) {
            interfaceC10429bMo5570c.mo5575i(descriptor2, 3, EnumC8319o.Companion.serializer(), enumC8319o);
        }
        interfaceC10429bMo5570c.mo5584r(descriptor2, 4, value.mo14509f());
        interfaceC10429bMo5570c.mo5584r(descriptor2, 5, value.mo14506c());
        interfaceC10429bMo5570c.mo5575i(descriptor2, 6, c11536x, value.mo14507d());
        interfaceC10429bMo5570c.mo5575i(descriptor2, 7, c11536x, value.mo14508e());
        if (interfaceC10429bMo5570c.mo5565F(descriptor2) || !AbstractC16544l.m18089b(value.f40495i, "")) {
            interfaceC10429bMo5570c.mo5584r(descriptor2, 8, value.f40495i);
        }
        interfaceC10429bMo5570c.mo5584r(descriptor2, 9, value.mo14510g());
        if (interfaceC10429bMo5570c.mo5565F(descriptor2) || !AbstractC16544l.m18089b(value.f40497k, new DestinationMetadata())) {
            interfaceC10429bMo5570c.mo5575i(descriptor2, 10, DestinationMetadata$$serializer.INSTANCE, value.f40497k);
        }
        interfaceC10429bMo5570c.mo5569b(descriptor2);
    }

    @Override // ao.InterfaceC11127C
    public KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
