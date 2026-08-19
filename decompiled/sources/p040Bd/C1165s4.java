package p040Bd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.s4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165s4 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1165s4 f3089a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C1177u4.f3128a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C1207z4 c1207z4 = null;
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
                c1207z4 = (C1207z4) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C1177u4.f3128a, c1207z4);
                i10 = 1;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0892A4(i10, c1207z4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0892A4 value = (C0892A4) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1207z4 c1207z4 = value.f2616a;
        if (zMo5565F || c1207z4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C1177u4.f3128a, c1207z4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C1165s4 c1165s4 = new C1165s4();
        f3089a = c1165s4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(QzvfuIgrngtl.aiAWEM, c1165s4, 1);
        pluginGeneratedSerialDescriptor.m18453j("fromClient", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
