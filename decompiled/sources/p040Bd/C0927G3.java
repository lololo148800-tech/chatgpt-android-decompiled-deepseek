package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21935L;
import p1155zi.C21943N;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.G3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0927G3 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0927G3 f2673a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0927G3 c0927g3 = new C0927G3();
        f2673a = c0927g3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiMultimodalTextContentPart.AudioAssetPointer", c0927g3, 5);
        pluginGeneratedSerialDescriptor.m18453j("assetPointer", false);
        pluginGeneratedSerialDescriptor.m18453j("sizeBytes", false);
        pluginGeneratedSerialDescriptor.m18453j("format", false);
        pluginGeneratedSerialDescriptor.m18453j("contentType", true);
        pluginGeneratedSerialDescriptor.m18453j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C21935L.f69487a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, C11135I.f33763a, c11181o0, c11181o0, kSerializerM10615b};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        C21943N c21943n = null;
        int i10 = 0;
        int iMo5478l = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                c21943n = (C21943N) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C21935L.f69487a, c21943n);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0939I3(i10, strMo5483q, iMo5478l, strMo5483q2, strMo5483q3, c21943n);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0939I3 value = (C0939I3) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f2693a);
        interfaceC10429bMo5570c.mo5579m(1, value.f2694b, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f2695c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2696d;
        if (zMo5565F || !AbstractC16544l.m18089b(str, "audio_asset_pointer")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C21943N c21943n = value.f2697e;
        if (zMo5565F2 || c21943n != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C21935L.f69487a, c21943n);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
