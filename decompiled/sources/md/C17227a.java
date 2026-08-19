package md;

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
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: md.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17227a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C17227a f54979a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C17227a c17227a = new C17227a();
        f54979a = c17227a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.assistant.AssistStructureNode", c17227a, 5);
        pluginGeneratedSerialDescriptor.m18453j("className", false);
        pluginGeneratedSerialDescriptor.m18453j("text", false);
        pluginGeneratedSerialDescriptor.m18453j("contentDesc", false);
        pluginGeneratedSerialDescriptor.m18453j("top", true);
        pluginGeneratedSerialDescriptor.m18453j("left", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, c11135i, c11135i};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        String str = null;
        String str2 = null;
        String str3 = null;
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                iMo5478l2 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C17229c(i10, str, str2, str3, iMo5478l, iMo5478l2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C17229c value = (C17229c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11181o0, value.f54980a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f54981b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f54982c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        int i10 = value.f54983d;
        if (zMo5565F || i10 != 0) {
            interfaceC10429bMo5570c.mo5579m(3, i10, pluginGeneratedSerialDescriptor);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        int i11 = value.f54984e;
        if (zMo5565F2 || i11 != 0) {
            interfaceC10429bMo5570c.mo5579m(4, i11, pluginGeneratedSerialDescriptor);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
