package p1155zi;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
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

/* JADX INFO: renamed from: zi.A2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21894A2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21894A2 f69417a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21894A2 c21894a2 = new C21894A2();
        f69417a = c21894a2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.VoiceStatus", c21894a2, 3);
        pluginGeneratedSerialDescriptor.m18453j("defaultVoiceMode", false);
        pluginGeneratedSerialDescriptor.m18453j("modes", false);
        pluginGeneratedSerialDescriptor.m18453j("chatreqToken", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21902C2.f69435d;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], AbstractC9961r4.m10615b(C11181o0.f33827a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21902C2.f69435d;
        EnumC22033m2 enumC22033m2 = null;
        boolean z6 = true;
        List list = null;
        String str = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                enumC22033m2 = (EnumC22033m2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC22033m2);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21902C2(i10, enumC22033m2, list, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21902C2 value = (C21902C2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21902C2.f69435d;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f69436a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f69437b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69438c;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
