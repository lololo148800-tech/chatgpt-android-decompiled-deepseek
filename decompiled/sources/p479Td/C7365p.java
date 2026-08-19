package p479Td;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Td.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C7365p implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C7365p f23364a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C7365p c7365p = new C7365p();
        f23364a = c7365p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Content.CreateTextdoc", c7365p, 2);
        pluginGeneratedSerialDescriptor.m18453j("transcriptionUnavailable", true);
        pluginGeneratedSerialDescriptor.m18453j("text", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11164g.f33804a, C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        String strMo5483q = null;
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C7370u(strMo5483q, i10, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C7370u value = (C7370u) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C7366q c7366q = C7370u.Companion;
        AbstractC7343b0.m7780b(value, interfaceC10429bMo5570c, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f23370c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
