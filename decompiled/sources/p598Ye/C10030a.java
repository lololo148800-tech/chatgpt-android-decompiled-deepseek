package p598Ye;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10030a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10030a f29726a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10030a c10030a = new C10030a();
        f29726a = c10030a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiSnorlax", c10030a, 10);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("display", false);
        pluginGeneratedSerialDescriptor.m18453j("model", false);
        pluginGeneratedSerialDescriptor.m18453j("instructions", false);
        pluginGeneratedSerialDescriptor.m18453j("tags", true);
        pluginGeneratedSerialDescriptor.m18453j("lastInteractedAt", false);
        pluginGeneratedSerialDescriptor.m18453j("vanityMetrics", false);
        pluginGeneratedSerialDescriptor.m18453j("shareRecipient", false);
        pluginGeneratedSerialDescriptor.m18453j("gizmoType", false);
        pluginGeneratedSerialDescriptor.m18453j("updatedAt", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C10044o.f29748k;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[4];
        C7156i c7156i = C7156i.f22754a;
        return new KSerializer[]{c11181o0, C10035f.f29732a, kSerializerM10615b, kSerializerM10615b2, kSerializer, AbstractC9961r4.m10615b(c7156i), AbstractC9961r4.m10615b(C10041l.f29746a), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c7156i)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10044o.f29748k;
        String str = null;
        C5551u c5551u = null;
        String strMo5483q = null;
        C10037h c10037h = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        C5551u c5551u2 = null;
        C10043n c10043n = null;
        String str4 = null;
        int i10 = 0;
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
                    c10037h = (C10037h) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C10035f.f29732a, c10037h);
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
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C7156i.f22754a, c5551u2);
                    i10 |= 32;
                    break;
                case 6:
                    c10043n = (C10043n) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C10041l.f29746a, c10043n);
                    i10 |= 64;
                    break;
                case 7:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str4);
                    i10 |= 128;
                    break;
                case 8:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str);
                    i10 |= 256;
                    break;
                case 9:
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C7156i.f22754a, c5551u);
                    i10 |= 512;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10044o(i10, strMo5483q, c10037h, str2, str3, list, c5551u2, c10043n, str4, str, c5551u);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10044o value = (C10044o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f29749a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C10035f.f29732a, value.f29750b);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f29751c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f29752d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f29753e;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C10044o.f29748k[4], list);
        }
        C7156i c7156i = C7156i.f22754a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c7156i, value.f29754f);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C10041l.f29746a, value.f29755g);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, c11181o0, value.f29756h);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, c11181o0, value.f29757i);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, c7156i, value.f29758j);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
