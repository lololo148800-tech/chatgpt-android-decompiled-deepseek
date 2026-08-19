package p1155zi;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
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

/* JADX INFO: renamed from: zi.Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C21979Z implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21979Z f69578a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21979Z c21979z = new C21979Z();
        f69578a = c21979z;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.ConversationBannerInfo", c21979z, 6);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("callToAction", false);
        pluginGeneratedSerialDescriptor.m18453j("resetsAfter", true);
        pluginGeneratedSerialDescriptor.m18453j("isDismissible", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21987b0.f69608g;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, AbstractC9961r4.m10615b(c11181o0), c11181o0, AbstractC9961r4.m10615b(kSerializerArr[3]), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C11164g.f33804a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21987b0.f69608g;
        int i10 = 0;
        String strMo5483q = null;
        String str = null;
        String strMo5483q2 = null;
        List list = null;
        String str2 = null;
        Boolean bool = null;
        boolean z6 = true;
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
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
                    i10 |= 8;
                    break;
                case 4:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str2);
                    i10 |= 16;
                    break;
                case 5:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21987b0(i10, strMo5483q, str, strMo5483q2, list, str2, bool);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21987b0 value = (C21987b0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f69609a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f69610b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f69611c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C21987b0.f69608g[3], value.f69612d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69613e;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c11181o0, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f69614f;
        if (zMo5565F2 || !AbstractC16544l.m18089b(bool, Boolean.TRUE)) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11164g.f33804a, bool);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
