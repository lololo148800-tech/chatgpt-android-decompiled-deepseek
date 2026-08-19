package p269Kh;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17691y;

/* JADX INFO: renamed from: Kh.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C4686m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C4686m f15250a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C4686m c4686m = new C4686m();
        f15250a = c4686m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.models.model.Models.Model", c4686m, 8);
        pluginGeneratedSerialDescriptor.m18453j("categoryName", false);
        pluginGeneratedSerialDescriptor.m18453j("slug", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("tags", false);
        pluginGeneratedSerialDescriptor.m18453j("maxTokens", true);
        pluginGeneratedSerialDescriptor.m18453j("enabledTools", true);
        pluginGeneratedSerialDescriptor.m18453j("productFeatures", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C4688o.f15251i;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, C22012h1.f69653a, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), kSerializerArr[4], AbstractC9961r4.m10615b(C11135I.f33763a), kSerializerArr[6], AbstractC9961r4.m10615b(C4693t.f15267a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C4688o.f15251i;
        boolean z6 = true;
        C4699z c4699z = null;
        int i10 = 0;
        String strMo5483q = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        Integer num = null;
        Set set = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C22012h1.f69653a, str != null ? new C22020j1(str) : null);
                    str = c22020j1 != null ? c22020j1.f69665a : null;
                    i10 |= 2;
                    break;
                case 2:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                    i10 |= 4;
                    break;
                case 3:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num);
                    i10 |= 32;
                    break;
                case 6:
                    set = (Set) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
                    i10 |= 64;
                    break;
                case 7:
                    c4699z = (C4699z) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C4693t.f15267a, c4699z);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C4688o(i10, strMo5483q, str, str2, str3, list, num, set, c4699z);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C4688o value = (C4688o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f15252a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C22012h1.f69653a, new C22020j1(value.f15253b));
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f15254c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f15255d);
        KSerializer[] kSerializerArr = C4688o.f15251i;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], value.f15256e);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f15257f;
        if (zMo5565F || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Set set = value.f15258g;
        if (zMo5565F2 || !AbstractC16544l.m18089b(set, C17691y.f56482Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C4699z c4699z = value.f15259h;
        if (zMo5565F3 || c4699z != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C4693t.f15267a, c4699z);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
