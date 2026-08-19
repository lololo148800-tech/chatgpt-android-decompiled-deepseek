package p575Xd;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import bo.C11518f;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.C16642a;
import p040Bd.C1181v2;
import p040Bd.C1193x2;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p168Gd.C3034b;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Xd.G */
/* JADX INFO: loaded from: classes3.dex */
public final class C9438G implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C9438G f28428a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C9438G c9438g = new C9438G();
        f28428a = c9438g;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.ToolMetadata", c9438g, 11);
        pluginGeneratedSerialDescriptor.m18453j("command", true);
        pluginGeneratedSerialDescriptor.m18453j("args", true);
        pluginGeneratedSerialDescriptor.m18453j("status", true);
        pluginGeneratedSerialDescriptor.m18453j("actionCall", true);
        pluginGeneratedSerialDescriptor.m18453j("actionResponse", true);
        pluginGeneratedSerialDescriptor.m18453j("invokedPlugin", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", true);
        pluginGeneratedSerialDescriptor.m18453j("initialText", true);
        pluginGeneratedSerialDescriptor.m18453j("finishedText", true);
        pluginGeneratedSerialDescriptor.m18453j("summarizationHeadline", true);
        pluginGeneratedSerialDescriptor.m18453j("canvas", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C9440I.f28429l;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(kSerializerArr[0]);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C11518f.f34849a);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(kSerializerArr[2]);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(C9445d.f28448a);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(C9467z.f28491a);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(C1181v2.f3130a);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(C21928J0.f69475a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6, kSerializerM10615b7, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[10])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C9440I.f28429l;
        C3034b c3034b = null;
        String str = null;
        String str2 = null;
        boolean z6 = true;
        String str3 = null;
        int i10 = 0;
        EnumC9437F enumC9437F = null;
        C16642a c16642a = null;
        EnumC9441J enumC9441J = null;
        C9463v c9463v = null;
        C9433B c9433b = null;
        C1193x2 c1193x2 = null;
        String str4 = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    kSerializerArr = kSerializerArr;
                    continue;
                case 0:
                    enumC9437F = (EnumC9437F) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC9437F);
                    i10 |= 1;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    continue;
                case 1:
                    c16642a = (C16642a) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11518f.f34849a, c16642a);
                    i10 |= 2;
                    break;
                case 2:
                    enumC9441J = (EnumC9441J) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC9441J);
                    i10 |= 4;
                    break;
                case 3:
                    c9463v = (C9463v) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C9445d.f28448a, c9463v);
                    i10 |= 8;
                    break;
                case 4:
                    c9433b = (C9433B) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C9467z.f28491a, c9433b);
                    i10 |= 16;
                    break;
                case 5:
                    c1193x2 = (C1193x2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C1181v2.f3130a, c1193x2);
                    i10 |= 32;
                    break;
                case 6:
                    C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C21928J0.f69475a, str4 != null ? new C21936L0(str4) : null);
                    str4 = c21936l0 != null ? c21936l0.f69488a : null;
                    i10 |= 64;
                    break;
                case 7:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str3);
                    i10 |= 128;
                    break;
                case 8:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str2);
                    i10 |= 256;
                    break;
                case 9:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str);
                    i10 |= 512;
                    break;
                case 10:
                    c3034b = (C3034b) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], c3034b);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z10;
            enumC9437F = enumC9437F;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C9440I(i10, enumC9437F, c16642a, enumC9441J, c9463v, c9433b, c1193x2, str4, str3, str2, str, c3034b);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C9440I value = (C9440I) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C9439H c9439h = C9440I.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C9440I.f28429l;
        EnumC9437F enumC9437F = value.f28430a;
        if (zMo5565F || enumC9437F != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC9437F);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C16642a c16642a = value.f28431b;
        if (zMo5565F2 || c16642a != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11518f.f34849a, c16642a);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC9441J enumC9441J = value.f28432c;
        if (zMo5565F3 || enumC9441J != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC9441J);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C9463v c9463v = value.f28433d;
        if (zMo5565F4 || c9463v != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C9445d.f28448a, c9463v);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C9433B c9433b = value.f28434e;
        if (zMo5565F5 || c9433b != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C9467z.f28491a, c9433b);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1193x2 c1193x2 = value.f28435f;
        if (zMo5565F6 || c1193x2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C1181v2.f3130a, c1193x2);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f28436g;
        if (zMo5565F7 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f28437h;
        if (zMo5565F8 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str2);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f28438i;
        if (zMo5565F9 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str3);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f28439j;
        if (zMo5565F10 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str4);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C3034b c3034b = value.f28440k;
        if (zMo5565F11 || c3034b != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], c3034b);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
