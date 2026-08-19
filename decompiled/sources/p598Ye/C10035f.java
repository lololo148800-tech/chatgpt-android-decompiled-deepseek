package p598Ye;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
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
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C10035f implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10035f f29732a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10035f c10035f = new C10035f();
        f29732a = c10035f;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiSnorlax.Display", c10035f, 6);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("theme", false);
        pluginGeneratedSerialDescriptor.m18453j("profilePictureUrl", false);
        pluginGeneratedSerialDescriptor.m18453j("promptStarters", true);
        pluginGeneratedSerialDescriptor.m18453j("commands", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C10037h.f29733g;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10037h.f29733g;
        int i10 = 0;
        String strMo5483q = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
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
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10037h(i10, strMo5483q, str, str2, str3, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10037h value = (C10037h) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f29734a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f29735b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f29736c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f29737d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C17689w c17689w = C17689w.f56480Y;
        KSerializer[] kSerializerArr = C10037h.f29733g;
        List list = value.f29738e;
        if (zMo5565F || !AbstractC16544l.m18089b(list, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f29739f;
        if (zMo5565F2 || !AbstractC16544l.m18089b(list2, c17689w)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
