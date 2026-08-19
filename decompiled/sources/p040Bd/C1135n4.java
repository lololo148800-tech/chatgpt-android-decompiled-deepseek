package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11192u;
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

/* JADX INFO: renamed from: Bd.n4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1135n4 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1135n4 f3051a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1135n4 c1135n4 = new C1135n4();
        f3051a = c1135n4;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ContentReferenceDateRange", c1135n4, 4);
        pluginGeneratedSerialDescriptor.m18453j("startTimestamp", false);
        pluginGeneratedSerialDescriptor.m18453j("startUtcOffsetSec", false);
        pluginGeneratedSerialDescriptor.m18453j("endTimestamp", false);
        pluginGeneratedSerialDescriptor.m18453j("endUtcOffsetSec", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11135I c11135i = C11135I.f33763a;
        C11192u c11192u = C11192u.f33846a;
        return new KSerializer[]{c11135i, c11192u, c11135i, c11192u};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        double dMo5489x = 0.0d;
        double dMo5489x2 = 0.0d;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                dMo5489x = interfaceC10428aMo5471c.mo5489x(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                iMo5478l2 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                dMo5489x2 = interfaceC10428aMo5471c.mo5489x(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1147p4(i10, iMo5478l, dMo5489x, iMo5478l2, dMo5489x2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1147p4 value = (C1147p4) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(0, value.f3066a, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5561B(pluginGeneratedSerialDescriptor, 1, value.f3067b);
        interfaceC10429bMo5570c.mo5579m(2, value.f3068c, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5561B(pluginGeneratedSerialDescriptor, 3, value.f3069d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
