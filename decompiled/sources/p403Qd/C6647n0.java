package p403Qd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p040Bd.C0930H0;
import p040Bd.C0960M0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Qd.n0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6647n0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C6647n0 f21412a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C6647n0 c6647n0 = new C6647n0();
        f21412a = c6647n0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.ToolSummaryData.Search", c6647n0, 2);
        pluginGeneratedSerialDescriptor.m18453j("navigationReference", false);
        pluginGeneratedSerialDescriptor.m18453j("faviconDomains", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C0930H0.f2679a), C6651p0.f21414d[1]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6651p0.f21414d;
        C0960M0 c0960m0 = null;
        boolean z6 = true;
        List list = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c0960m0 = (C0960M0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C0930H0.f2679a, c0960m0);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6651p0(i10, c0960m0, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6651p0 value = (C6651p0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C6649o0 c6649o0 = C6651p0.Companion;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C0930H0.f2679a, value.f21415b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C6651p0.f21414d[1], value.f21416c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
