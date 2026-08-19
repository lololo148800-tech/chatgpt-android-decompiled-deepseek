package p148Fi;

import ao.AbstractC11153a0;
import ao.C11192u;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mm.InterfaceC17306i;
import p002A0.C0130g;
import p559Wn.C8981m;
import p571X9.AbstractC9227W;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.E */
/* JADX INFO: loaded from: classes3.dex */
public final class C2760E implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2760E f8458a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2760E c2760e = new C2760E();
        f8458a = c2760e;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.SpeakingUpdate", c2760e, 3);
        pluginGeneratedSerialDescriptor.m18453j("response", false);
        pluginGeneratedSerialDescriptor.m18453j("durationS", false);
        pluginGeneratedSerialDescriptor.m18453j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C2858v0.f8628a), AbstractC9961r4.m10615b(C11192u.f33846a), C2764G.f8468d[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2764G.f8468d;
        C2862x0 c2862x0 = null;
        boolean z6 = true;
        Double d10 = null;
        InterfaceC17306i interfaceC17306i = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c2862x0 = (C2862x0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C2858v0.f8628a, c2862x0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                d10 = (Double) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11192u.f33846a, d10);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                interfaceC17306i = (InterfaceC17306i) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], interfaceC17306i);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2764G(i10, c2862x0, d10, interfaceC17306i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2764G value = (C2764G) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C2762F c2762f = C2764G.Companion;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C2858v0.f8628a, value.f8469a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11192u.f33846a, value.f8470b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        InterfaceC17306i interfaceC17306i = value.f8471c;
        if (zMo5565F || !AbstractC16544l.m18089b(interfaceC17306i, AbstractC9227W.m9800c(new C0130g(value, 23)))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C2764G.f8468d[2], interfaceC17306i);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
