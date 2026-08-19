package p479Td;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21919H;
import p1155zi.C21947O;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Td.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7340a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C7340a f23249a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C7340a c7340a = new C7340a();
        f23249a = c7340a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.message.Content.Audio", c7340a, 3);
        pluginGeneratedSerialDescriptor.m18453j("transcriptionUnavailable", true);
        pluginGeneratedSerialDescriptor.m18453j("assetPointer", false);
        pluginGeneratedSerialDescriptor.m18453j("hasVideo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C21919H.f69470a);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11164g, kSerializerM10615b, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C21947O c21947o = null;
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c21947o = (C21947O) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21919H.f69470a, c21947o);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C7344c(i10, zMo5481o, c21947o, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C7344c value = (C7344c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C7342b c7342b = C7344c.Companion;
        AbstractC7343b0.m7780b(value, interfaceC10429bMo5570c, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21919H.f69470a, value.f23254c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f23255d;
        if (zMo5565F || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, z6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
