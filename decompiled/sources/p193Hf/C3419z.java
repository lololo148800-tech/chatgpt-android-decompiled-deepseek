package p193Hf;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p040Bd.C1020W1;
import p040Bd.C1032Y1;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Hf.z */
/* JADX INFO: loaded from: classes3.dex */
public final class C3419z implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C3419z f10415a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C3419z c3419z = new C3419z();
        f10415a = c3419z;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreMessageToWeb.CanmoreMessage.Content", c3419z, 1);
        pluginGeneratedSerialDescriptor.m18453j("message", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C1020W1.f2828a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1032Y1 c1032y1 = null;
        boolean z6 = true;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else {
                if (iMo10914s != 0) {
                    throw new C8981m(iMo10914s);
                }
                c1032y1 = (C1032Y1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C1020W1.f2828a, c1032y1);
                i10 = 1;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C3297B(i10, c1032y1);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3297B value = (C3297B) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C3295A c3295a = C3297B.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C1020W1.f2828a, value.f10054a);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
