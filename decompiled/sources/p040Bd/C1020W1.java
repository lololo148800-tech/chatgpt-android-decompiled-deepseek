package p040Bd;

import android.gov.nist.javax.sip.header.ParameterNames;
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
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p174Gk.uSfJ.HpucjswO;
import p324Mn.C5551u;
import p483Th.C7470a;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.W1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1020W1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1020W1 f2828a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C21977Y0.f69577a, C1038Z1.f2865a, AbstractC9961r4.m10615b(C1108j2.f3014a), C1014V1.f2819d, AbstractC9961r4.m10615b(C7470a.f23726a), C1032Y1.f2849j[5], AbstractC9961r4.m10615b(C11164g.f33804a), AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(C1073e2.f2922a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1032Y1.f2849j;
        C1087g2 c1087g2 = null;
        boolean z6 = true;
        String str = null;
        int i10 = 0;
        String str2 = null;
        C1052b2 c1052b2 = null;
        C1121l2 c1121l2 = null;
        InterfaceC1136o interfaceC1136o = null;
        C5551u c5551u = null;
        EnumC1101i2 enumC1101i2 = null;
        Boolean bool = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                    i10 |= 1;
                    str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                    break;
                case 1:
                    c1052b2 = (C1052b2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C1038Z1.f2865a, c1052b2);
                    i10 |= 2;
                    break;
                case 2:
                    c1121l2 = (C1121l2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C1108j2.f3014a, c1121l2);
                    i10 |= 4;
                    break;
                case 3:
                    interfaceC1136o = (InterfaceC1136o) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C1014V1.f2819d, interfaceC1136o);
                    i10 |= 8;
                    break;
                case 4:
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C7470a.f23726a, c5551u);
                    i10 |= 16;
                    break;
                case 5:
                    enumC1101i2 = (EnumC1101i2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], enumC1101i2);
                    i10 |= 32;
                    break;
                case 6:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11164g.f33804a, bool);
                    i10 |= 64;
                    break;
                case 7:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str);
                    i10 |= 128;
                    break;
                case 8:
                    c1087g2 = (C1087g2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C1073e2.f2922a, c1087g2);
                    i10 |= 256;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1032Y1(i10, str2, c1052b2, c1121l2, interfaceC1136o, c5551u, enumC1101i2, bool, str, c1087g2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1032Y1 value = (C1032Y1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1026X1 c1026x1 = C1032Y1.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, new C21984a1(value.f2850a));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C1038Z1.f2865a, value.f2851b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1121l2 c1121l2 = value.f2852c;
        if (zMo5565F || c1121l2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C1108j2.f3014a, c1121l2);
        }
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C1014V1.f2819d, value.f2853d);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f2854e;
        if (zMo5565F2 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C7470a.f23726a, c5551u);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC1101i2 enumC1101i2 = value.f2855f;
        if (zMo5565F3 || enumC1101i2 != EnumC1101i2.f3001Z) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, C1032Y1.f2849j[5], enumC1101i2);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f2856g;
        if (zMo5565F4 || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11164g.f33804a, bool);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2857h;
        if (zMo5565F5 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1087g2 c1087g2 = value.f2858i;
        if (zMo5565F6 || !AbstractC16544l.m18089b(c1087g2, new C1087g2(null, null, null, null, null, null, false, -1, 15))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, C1073e2.f2922a, c1087g2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C1020W1 c1020w1 = new C1020W1();
        f2828a = c1020w1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiConversationMessage", c1020w1, 9);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j(HpucjswO.iaDWeH, false);
        pluginGeneratedSerialDescriptor.m18453j("user", true);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        pluginGeneratedSerialDescriptor.m18453j("createTime", true);
        pluginGeneratedSerialDescriptor.m18453j("status", true);
        pluginGeneratedSerialDescriptor.m18453j("endTurn", true);
        pluginGeneratedSerialDescriptor.m18453j("recipient", true);
        pluginGeneratedSerialDescriptor.m18453j("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
