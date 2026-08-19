package p1155zi;

import ao.AbstractC11153a0;
import ao.C11181o0;
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

/* JADX INFO: renamed from: zi.c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21993c2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21993c2 f69625a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21993c2 c21993c2 = new C21993c2();
        f69625a = c21993c2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.UnavailableModel", c21993c2, 4);
        pluginGeneratedSerialDescriptor.m18453j("slug", false);
        pluginGeneratedSerialDescriptor.m18453j("context", false);
        pluginGeneratedSerialDescriptor.m18453j("reason", true);
        pluginGeneratedSerialDescriptor.m18453j("description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C22001e2.f69635e;
        KSerializer kSerializer = kSerializerArr[1];
        KSerializer kSerializer2 = kSerializerArr[2];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, kSerializer, kSerializer2, c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22001e2.f69635e;
        String strMo5483q = null;
        EnumC22004f1 enumC22004f1 = null;
        EnumC22024k1 enumC22024k1 = null;
        String strMo5483q2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                enumC22004f1 = (EnumC22004f1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC22004f1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                enumC22024k1 = (EnumC22024k1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC22024k1);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22001e2(i10, strMo5483q, enumC22004f1, enumC22024k1, strMo5483q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22001e2 value = (C22001e2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f69636a);
        KSerializer[] kSerializerArr = C22001e2.f69635e;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f69637b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC22024k1 enumC22024k1 = value.f69638c;
        if (zMo5565F || enumC22024k1 != EnumC22024k1.UNKNOWN) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC22024k1);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69639d;
        if (zMo5565F2 || !AbstractC16544l.m18089b(str, "")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
