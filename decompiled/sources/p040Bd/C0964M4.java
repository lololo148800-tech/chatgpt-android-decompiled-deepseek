package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
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

/* JADX INFO: renamed from: Bd.M4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0964M4 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0964M4 f2737a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0964M4 c0964m4 = new C0964M4();
        f2737a = c0964m4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.SportsGameTeamInfo", c0964m4, 2);
        pluginGeneratedSerialDescriptor.m18453j("team", false);
        pluginGeneratedSerialDescriptor.m18453j("score", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1097h5.f2997a, AbstractC9961r4.m10615b(C11135I.f33763a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1111j5 c1111j5 = null;
        boolean z6 = true;
        Integer num = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c1111j5 = (C1111j5) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C1097h5.f2997a, c1111j5);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0976O4(i10, c1111j5, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0976O4 value = (C0976O4) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C1097h5.f2997a, value.f2755a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f2756b;
        if (zMo5565F || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
