package p040Bd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p324Mn.C5551u;
import p483Th.C7471b;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.J4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0946J4 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0946J4 f2710a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0946J4 c0946j4 = new C0946J4();
        f2710a = c0946j4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.SportsGame", c0946j4, 5);
        pluginGeneratedSerialDescriptor.m18453j("date", false);
        pluginGeneratedSerialDescriptor.m18453j("details", true);
        pluginGeneratedSerialDescriptor.m18453j("live", true);
        pluginGeneratedSerialDescriptor.m18453j("firstTeamInfo", false);
        pluginGeneratedSerialDescriptor.m18453j("secondTeamInfo", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C11181o0.f33827a);
        C0964M4 c0964m4 = C0964M4.f2737a;
        return new KSerializer[]{C7471b.f23728a, kSerializerM10615b, C11164g.f33804a, c0964m4, c0964m4};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C5551u c5551u = null;
        String str = null;
        C0976O4 c0976o4 = null;
        C0976O4 c0976o5 = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C7471b.f23728a, c5551u);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                c0976o4 = (C0976O4) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C0964M4.f2737a, c0976o4);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                c0976o5 = (C0976O4) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C0964M4.f2737a, c0976o5);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0958L4(i10, c5551u, str, zMo5481o, c0976o4, c0976o5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0958L4 value = (C0958L4) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C7471b.f23728a, value.f2720a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2721b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f2722c;
        if (zMo5565F2 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, z6);
        }
        C0964M4 c0964m4 = C0964M4.f2737a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, c0964m4, value.f2723d);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, c0964m4, value.f2724e);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
