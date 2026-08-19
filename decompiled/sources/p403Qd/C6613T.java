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
import p168Gd.C3034b;
import p315Me.Myis.CxcULo;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Qd.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C6613T implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C6613T f21340a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C6613T c6613t = new C6613T();
        f21340a = c6613t;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.ToolSummaryData.Canmore", c6613t, 2);
        pluginGeneratedSerialDescriptor.m18453j("metadata", false);
        pluginGeneratedSerialDescriptor.m18453j("canOptOut", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C6615V.f21341d[0]), C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6615V.f21341d;
        C3034b c3034b = null;
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c3034b = (C3034b) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], c3034b);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6615V(i10, c3034b, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6615V value = (C6615V) obj;
        AbstractC16544l.m18094g(encoder, CxcULo.DaMhGzFDWXjgx);
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C6615V.f21341d[0], value.f21342b);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, value.f21343c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }
}
