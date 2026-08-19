package p403Qd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p324Mn.C5551u;
import p463Sn.C7156i;
import p505Uf.C7638A;
import p505Uf.C7664y;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p871lf.C16932p;
import p871lf.C16934r;

/* JADX INFO: renamed from: Qd.e0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6629e0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C6629e0 f21365a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C6629e0 c6629e0 = new C6629e0();
        f21365a = c6629e0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.ToolSummaryData.Jawbone", c6629e0, 4);
        pluginGeneratedSerialDescriptor.m18453j("jawboneId", false);
        pluginGeneratedSerialDescriptor.m18453j("isStream", false);
        pluginGeneratedSerialDescriptor.m18453j("permission", false);
        pluginGeneratedSerialDescriptor.m18453j("createdDate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C16932p.f54381a, C11164g.f33804a, AbstractC9961r4.m10615b(C7664y.f24187a), AbstractC9961r4.m10615b(C7156i.f22754a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        String str = null;
        C7638A c7638a = null;
        C5551u c5551u = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C16934r c16934r = (C16934r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, str != null ? new C16934r(str) : null);
                str = c16934r != null ? c16934r.f54382a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                c7638a = (C7638A) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C7664y.f24187a, c7638a);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6633g0(i10, str, zMo5481o, c7638a, c5551u);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6633g0 value = (C6633g0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C6631f0 c6631f0 = C6633g0.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C16932p.f54381a, new C16934r(value.f21370b));
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, value.f21371c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C7664y.f24187a, value.f21372d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, value.f21373e);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
