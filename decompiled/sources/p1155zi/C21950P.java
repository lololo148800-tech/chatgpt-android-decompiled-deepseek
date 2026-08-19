package p1155zi;

import ao.AbstractC11153a0;
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
import p279L1.VOxZ.sVoFrD;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: zi.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C21950P implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21950P f69510a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21958S.f69518g;
        KSerializer kSerializer = kSerializerArr[0];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializer, c11181o0, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(kSerializerArr[5])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21958S.f69518g;
        EnumC21964U enumC21964U = null;
        String strMo5483q = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    enumC21964U = (EnumC21964U) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC21964U);
                    i10 |= 1;
                    break;
                case 1:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
                    i10 |= 4;
                    break;
                case 3:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str2);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str3);
                    i10 |= 16;
                    break;
                case 5:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21958S(i10, enumC21964U, strMo5483q, str, str2, str3, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21958S value = (C21958S) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21958S.f69518g;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f69519a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f69520b);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f69521c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f69522d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c11181o0, value.f69523e);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], value.f69524f);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C21950P c21950p = new C21950P();
        f69510a = c21950p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.BlockedFeature", c21950p, 6);
        pluginGeneratedSerialDescriptor.m18453j(sVoFrD.uPcK, false);
        pluginGeneratedSerialDescriptor.m18453j("resetsAfter", false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("blockReason", false);
        pluginGeneratedSerialDescriptor.m18453j("callToAction", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
