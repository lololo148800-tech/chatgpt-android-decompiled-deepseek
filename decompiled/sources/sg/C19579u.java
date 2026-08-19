package sg;

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
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: sg.u */
/* JADX INFO: loaded from: classes3.dex */
public final class C19579u implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C19579u f62177a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C19579u c19579u = new C19579u();
        f62177a = c19579u;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentReasonsResponse", c19579u, 3);
        pluginGeneratedSerialDescriptor.m18453j("header", false);
        pluginGeneratedSerialDescriptor.m18453j("headerExplanation", false);
        pluginGeneratedSerialDescriptor.m18453j("reasons", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C19581w.f62178d[2];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C19581w.f62178d;
        String strMo5483q = null;
        boolean z6 = true;
        String strMo5483q2 = null;
        List list = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C19581w(i10, strMo5483q, strMo5483q2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C19581w value = (C19581w) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f62179a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f62180b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C19581w.f62178d[2], value.f62181c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
