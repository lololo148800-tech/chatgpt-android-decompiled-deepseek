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

/* JADX INFO: renamed from: zi.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21991c0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21991c0 f69623a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21991c0 c21991c0 = new C21991c0();
        f69623a = c21991c0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ConversationDetails", c21991c0, 4);
        pluginGeneratedSerialDescriptor.m18453j("modelLimits", false);
        pluginGeneratedSerialDescriptor.m18453j("banner_info", false);
        pluginGeneratedSerialDescriptor.m18453j("blockedFeatures", false);
        pluginGeneratedSerialDescriptor.m18453j("defaultModelSlug", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21999e0.f69627e;
        return new KSerializer[]{AbstractC9961r4.m10615b(kSerializerArr[0]), AbstractC9961r4.m10615b(C21979Z.f69578a), kSerializerArr[2], AbstractC9961r4.m10615b(C11181o0.f33827a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21999e0.f69627e;
        List list = null;
        C21987b0 c21987b0 = null;
        List list2 = null;
        String str = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c21987b0 = (C21987b0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21979Z.f69578a, c21987b0);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21999e0(i10, list, c21987b0, list2, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21999e0 value = (C21999e0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21999e0.f69627e;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f69628a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21979Z.f69578a, value.f69629b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f69630c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, value.f69631d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
