package p148Fi;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p040Bd.C1020W1;
import p040Bd.C1032Y1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.v0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2858v0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2858v0 f8628a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2858v0 c2858v0 = new C2858v0();
        f8628a = c2858v0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.VoiceConversationStreamMessageResponse", c2858v0, 3);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("message", false);
        pluginGeneratedSerialDescriptor.m18453j("error", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C22003f0.f69641a, AbstractC9961r4.m10615b(C1020W1.f2828a), AbstractC9961r4.m10615b(C11181o0.f33827a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        C1032Y1 c1032y1 = null;
        String str2 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, str != null ? new C22011h0(str) : null);
                str = c22011h0 != null ? c22011h0.f69652a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c1032y1 = (C1032Y1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C1020W1.f2828a, c1032y1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2862x0(i10, str, c1032y1, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2862x0 value = (C2862x0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C2860w0 c2860w0 = C2862x0.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, new C22011h0(value.f8632a));
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C1020W1.f2828a, value.f8633b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, value.f8634c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
