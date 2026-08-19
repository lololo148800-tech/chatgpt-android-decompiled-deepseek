package p041Be;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Be.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1232d implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1232d f3245a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1232d c1232d = new C1232d();
        f3245a = c1232d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.ConversationListRequest", c1232d, 5);
        pluginGeneratedSerialDescriptor.m18453j("offset", false);
        pluginGeneratedSerialDescriptor.m18453j("limit", false);
        pluginGeneratedSerialDescriptor.m18453j("order", false);
        pluginGeneratedSerialDescriptor.m18453j("expand", true);
        pluginGeneratedSerialDescriptor.m18453j("isArchived", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C1234f.f3246f[2];
        C11135I c11135i = C11135I.f33763a;
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11135i, c11135i, kSerializer, c11164g, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1234f.f3246f;
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        EnumC1244p enumC1244p = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                iMo5478l2 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                enumC1244p = (EnumC1244p) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC1244p);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1234f(i10, iMo5478l, iMo5478l2, enumC1244p, zMo5481o, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1234f value = (C1234f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(0, value.f3247a, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(1, value.f3248b, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C1234f.f3246f[2], value.f3249c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f3250d;
        if (zMo5565F || !z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, z6);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f3251e;
        if (zMo5565F2 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z10);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
