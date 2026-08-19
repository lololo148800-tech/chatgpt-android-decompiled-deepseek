package p040Bd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.y2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1199y2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1199y2 f3157a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1199y2 c1199y2 = new C1199y2();
        f3157a = c1199y2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData", c1199y2, 2);
        pluginGeneratedSerialDescriptor.m18453j("fromServer", true);
        pluginGeneratedSerialDescriptor.m18453j("from_client", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C0908D2.f2641a), AbstractC9961r4.m10615b(C0890A2.f2614a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1027X2 c1027x2 = null;
        boolean z6 = true;
        C0902C2 c0902c2 = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1027x2 = (C1027X2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C0908D2.f2641a, c1027x2);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                c0902c2 = (C0902C2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C0890A2.f2614a, c0902c2);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1033Y2(i10, c1027x2, c0902c2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1033Y2 value = (C1033Y2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1027X2 c1027x2 = value.f2859a;
        if (zMo5565F || c1027x2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C0908D2.f2641a, c1027x2);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C0902C2 c0902c2 = value.f2860b;
        if (zMo5565F2 || c0902c2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C0890A2.f2614a, c0902c2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
