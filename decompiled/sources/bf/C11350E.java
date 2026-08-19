package bf;

import ao.AbstractC11153a0;
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

/* JADX INFO: renamed from: bf.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C11350E implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C11350E f34344a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C11350E c11350e = new C11350E();
        f34344a = c11350e;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.GizmoAbout", c11350e, 4);
        pluginGeneratedSerialDescriptor.m18453j("gizmo", false);
        pluginGeneratedSerialDescriptor.m18453j("toolTypes", false);
        pluginGeneratedSerialDescriptor.m18453j("aboutBlocks", true);
        pluginGeneratedSerialDescriptor.m18453j("ratingData", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C11352G.f34345e;
        return new KSerializer[]{C11371a.f34378a, kSerializerArr[1], AbstractC9961r4.m10615b(kSerializerArr[2]), AbstractC9961r4.m10615b(kSerializerArr[3])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C11352G.f34345e;
        C11349D c11349d = null;
        List list = null;
        List list2 = null;
        List list3 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c11349d = (C11349D) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C11371a.f34378a, c11349d);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list2 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                list3 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C11352G(i10, c11349d, list, list2, list3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C11352G value = (C11352G) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11351F c11351f = C11352G.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C11371a.f34378a, value.f34346a);
        KSerializer[] kSerializerArr = C11352G.f34345e;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f34347b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f34348c;
        if (zMo5565F || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f34349d;
        if (zMo5565F2 || list2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
