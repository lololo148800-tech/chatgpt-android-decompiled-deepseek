package sg;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11158d;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
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

/* JADX INFO: renamed from: sg.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C19576r implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C19576r f62165a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C19576r c19576r = new C19576r();
        f62165a = c19576r;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentReason", c19576r, 10);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("cta", false);
        pluginGeneratedSerialDescriptor.m18453j("explanation", false);
        pluginGeneratedSerialDescriptor.m18453j("subReasons", false);
        pluginGeneratedSerialDescriptor.m18453j("hasDetails", false);
        pluginGeneratedSerialDescriptor.m18453j("detailsPlaceholder", true);
        pluginGeneratedSerialDescriptor.m18453j("linkExplanation", true);
        pluginGeneratedSerialDescriptor.m18453j("linkAttachment", true);
        pluginGeneratedSerialDescriptor.m18453j("subtext", true);
        pluginGeneratedSerialDescriptor.m18453j("additionalFields", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C19578t.f62166k;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, AbstractC9961r4.m10615b(c11181o0), new C11158d(f62165a, 0), C11164g.f33804a, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), kSerializerArr[9]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C19578t.f62166k;
        C19576r c19576r = f62165a;
        String str = null;
        List list = null;
        String str2 = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String str3 = null;
        List list2 = null;
        String str4 = null;
        String str5 = null;
        int i10 = 0;
        boolean zMo5481o = false;
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
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    continue;
                case 2:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, new C11158d(c19576r, 0), list2);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str4);
                    i10 |= 32;
                    break;
                case 6:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str5);
                    i10 |= 64;
                    break;
                case 7:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str);
                    i10 |= 128;
                    break;
                case 8:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, C11181o0.f33827a, str2);
                    i10 |= 256;
                    break;
                case 9:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], list);
                    i10 |= 512;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            zMo5481o = zMo5481o;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C19578t(i10, strMo5483q, strMo5483q2, str3, list2, zMo5481o, str4, str5, str, str2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C19578t value = (C19578t) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f62167a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f62168b);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f62169c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, new C11158d(f62165a, 0), value.f62170d);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, value.f62171e);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f62172f;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f62173g;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, c11181o0, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f62174h;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, c11181o0, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f62175i;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, c11181o0, str4);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f62176j;
        if (zMo5565F5 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 9, C19578t.f62166k[9], list);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
