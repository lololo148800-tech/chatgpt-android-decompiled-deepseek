package p245Jh;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p195Hh.C3430e;
import p523V9.AbstractC8168p6;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Jh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C4355m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C4355m f14169a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C4355m c4355m = new C4355m();
        f14169a = c4355m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.api.ModelsResponseModel", c4355m, 8);
        pluginGeneratedSerialDescriptor.m18453j("slug", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("tags", false);
        pluginGeneratedSerialDescriptor.m18453j("maxTokens", true);
        pluginGeneratedSerialDescriptor.m18453j("enabledTools", true);
        pluginGeneratedSerialDescriptor.m18453j("productFeatures", true);
        pluginGeneratedSerialDescriptor.m18453j("logger", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C4357o.f14170i;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C11135I.f33763a);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(kSerializerArr[5]);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(C4358p.f14179a);
        KSerializer kSerializer2 = kSerializerArr[7];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{C22012h1.f69653a, c11181o0, c11181o0, kSerializer, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C4357o.f14170i;
        boolean z6 = true;
        C3430e c3430e = null;
        int i10 = 0;
        String str = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
        List list = null;
        Integer num = null;
        List list2 = null;
        C4360r c4360r = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22012h1.f69653a, str != null ? new C22020j1(str) : null);
                    i10 |= 1;
                    str = c22020j1 != null ? c22020j1.f69665a : null;
                    break;
                case 1:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
                    i10 |= 8;
                    break;
                case 4:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11135I.f33763a, num);
                    i10 |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
                    i10 |= 32;
                    break;
                case 6:
                    c4360r = (C4360r) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C4358p.f14179a, c4360r);
                    i10 |= 64;
                    break;
                case 7:
                    c3430e = (C3430e) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], c3430e);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C4357o(i10, str, strMo5483q, strMo5483q2, list, num, list2, c4360r, c3430e);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4357o value = (C4357o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C4356n c4356n = C4357o.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22012h1.f69653a, new C22020j1(value.f14171a));
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f14172b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f14173c);
        KSerializer[] kSerializerArr = C4357o.f14170i;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], value.f14174d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f14175e;
        if (zMo5565F || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11135I.f33763a, num);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f14176f;
        if (zMo5565F2 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C4360r c4360r = value.f14177g;
        if (zMo5565F3 || c4360r != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C4358p.f14179a, c4360r);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C3430e c3430e = value.f14178h;
        if (zMo5565F4 || !AbstractC16544l.m18089b(c3430e, AbstractC8168p6.m8749b("ModelsResponseModel", null))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], c3430e);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
