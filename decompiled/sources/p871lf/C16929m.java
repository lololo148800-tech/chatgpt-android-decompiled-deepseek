package p871lf;

import ai.C10614e;
import ai.C10619j;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11164g;
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
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p324Mn.C5551u;
import p483Th.C7471b;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: lf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C16929m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C16929m f54366a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C16929m c16929m = new C16929m();
        f54366a = c16929m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.jawbone.models.Jawbone", c16929m, 12);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", true);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("scheduleComponents", false);
        pluginGeneratedSerialDescriptor.m18453j("isEnabled", false);
        pluginGeneratedSerialDescriptor.m18453j(SDPKeywords.PROMPT, false);
        pluginGeneratedSerialDescriptor.m18453j("defaultTimezone", false);
        pluginGeneratedSerialDescriptor.m18453j("notificationsEnabled", false);
        pluginGeneratedSerialDescriptor.m18453j("emailEnabled", false);
        pluginGeneratedSerialDescriptor.m18453j("targetTimeUtc", true);
        pluginGeneratedSerialDescriptor.m18453j("lastRunTime", true);
        pluginGeneratedSerialDescriptor.m18453j("nextRunTimes", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C16931o.f54367m;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C22003f0.f69641a);
        C7471b c7471b = C7471b.f23728a;
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c7471b);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c7471b);
        KSerializer kSerializer = kSerializerArr[11];
        C11181o0 c11181o0 = C11181o0.f33827a;
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{C16932p.f54381a, kSerializerM10615b, c11181o0, C10614e.f31495a, c11164g, c11181o0, c11181o0, c11164g, c11164g, kSerializerM10615b2, kSerializerM10615b3, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C16931o.f54367m;
        List list = null;
        C5551u c5551u = null;
        boolean z6 = true;
        C5551u c5551u2 = null;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String strMo5483q = null;
        C10619j c10619j = null;
        boolean zMo5481o = false;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    C16934r c16934r = (C16934r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, str != null ? new C16934r(str) : null);
                    i10 |= 1;
                    str = c16934r != null ? c16934r.f54382a : null;
                    break;
                case 1:
                    C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C22003f0.f69641a, str2 != null ? new C22011h0(str2) : null);
                    i10 |= 2;
                    str2 = c22011h0 != null ? c22011h0.f69652a : null;
                    break;
                case 2:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    continue;
                case 3:
                    c10619j = (C10619j) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C10614e.f31495a, c10619j);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    continue;
                case 5:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    continue;
                case 6:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    continue;
                case 7:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 7);
                    i10 |= 128;
                    continue;
                case 8:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    continue;
                case 9:
                    c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C7471b.f23728a, c5551u2);
                    i10 |= 512;
                    break;
                case 10:
                    c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C7471b.f23728a, c5551u);
                    i10 |= 1024;
                    break;
                case 11:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], list);
                    i10 |= 2048;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z6;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C16931o(i10, str, str2, strMo5483q, c10619j, zMo5481o, strMo5483q2, strMo5483q3, zMo5481o2, zMo5481o3, c5551u2, c5551u, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C16931o value = (C16931o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C16930n c16930n = C16931o.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, new C16934r(value.f54369a));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f54370b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C22003f0.f69641a, str != null ? new C22011h0(str) : null);
        }
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f54371c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C10614e.f31495a, value.f54372d);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, value.f54373e);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, value.f54374f);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, value.f54375g);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 7, value.f54376h);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 8, value.f54377i);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f54378j;
        if (zMo5565F2 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C7471b.f23728a, c5551u);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u2 = value.f54379k;
        if (zMo5565F3 || c5551u2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, C7471b.f23728a, c5551u2);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f54380l;
        if (zMo5565F4 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 11, C16931o.f54367m[11], list);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
