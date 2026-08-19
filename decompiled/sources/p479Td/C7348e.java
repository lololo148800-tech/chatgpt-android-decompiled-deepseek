package p479Td;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21912F0;
import p1155zi.C21920H0;
import p1155zi.C21940M0;
import p1155zi.C21965U0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p926of.yRae.sVDIzpC;

/* JADX INFO: renamed from: Td.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C7348e implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C7348e f23263a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C7348e c7348e = new C7348e();
        f23263a = c7348e;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Content.Charts.Chart", c7348e, 3);
        pluginGeneratedSerialDescriptor.m18453j("chartType", false);
        pluginGeneratedSerialDescriptor.m18453j("fileId", false);
        pluginGeneratedSerialDescriptor.m18453j("image", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(C21912F0.f69461a), C21940M0.f69493a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C7352g value = (C7352g) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, value.f23312a);
        C21912F0 c21912f0 = C21912F0.f69461a;
        String str = value.f23313b;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c21912f0, str != null ? new C21920H0(str) : null);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C21940M0.f69493a, value.f23314c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, sVDIzpC.NhY);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        C21965U0 c21965u0 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C21920H0 c21920h0 = (C21920H0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21912F0.f69461a, str2 != null ? new C21920H0(str2) : null);
                str2 = c21920h0 != null ? c21920h0.f69471a : null;
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c21965u0 = (C21965U0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C21940M0.f69493a, c21965u0);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C7352g(i10, str, str2, c21965u0);
    }
}
