package p1155zi;

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

/* JADX INFO: renamed from: zi.M0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21940M0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21940M0 f69493a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21940M0 c21940m0 = new C21940M0();
        f69493a = c21940m0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ImageAssetPointer", c21940m0, 7);
        pluginGeneratedSerialDescriptor.m18453j("assetPointer", false);
        pluginGeneratedSerialDescriptor.m18453j("sizeBytes", false);
        pluginGeneratedSerialDescriptor.m18453j("width", false);
        pluginGeneratedSerialDescriptor.m18453j("height", false);
        pluginGeneratedSerialDescriptor.m18453j("mimeType", true);
        pluginGeneratedSerialDescriptor.m18453j("metadata", true);
        pluginGeneratedSerialDescriptor.m18453j("contentType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C21956R0.f69516a);
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{C21899C.f69433a, c11135i, c11135i, c11135i, kSerializerM10615b, kSerializerM10615b2, c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        int iMo5478l3 = 0;
        String str = null;
        String str2 = null;
        C21962T0 c21962t0 = null;
        String strMo5483q = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    C21907E c21907e = (C21907E) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21899C.f69433a, str != null ? new C21907E(str) : null);
                    str = c21907e != null ? c21907e.f69451a : null;
                    i10 |= 1;
                    break;
                case 1:
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    iMo5478l2 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    iMo5478l3 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str2);
                    i10 |= 16;
                    break;
                case 5:
                    c21962t0 = (C21962T0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C21956R0.f69516a, c21962t0);
                    i10 |= 32;
                    break;
                case 6:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21965U0(i10, str, iMo5478l, iMo5478l2, iMo5478l3, str2, c21962t0, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21965U0 value = (C21965U0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21899C.f69433a, new C21907E(value.f69534a));
        interfaceC10429bMo5570c.mo5579m(1, value.f69535b, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(2, value.f69536c, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(3, value.f69537d, pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69538e;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C21962T0 c21962t0 = value.f69539f;
        if (zMo5565F2 || c21962t0 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C21956R0.f69516a, c21962t0);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f69540g;
        if (zMo5565F3 || !AbstractC16544l.m18089b(str2, "image_asset_pointer")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, str2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
