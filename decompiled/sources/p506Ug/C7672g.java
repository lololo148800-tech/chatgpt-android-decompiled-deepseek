package p506Ug;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.InterfaceC11127C;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Ug.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C7672g implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C7672g f24193a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C7672g c7672g = new C7672g();
        f24193a = c7672g;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.settings.memory.MemoryResponse", c7672g, 3);
        pluginGeneratedSerialDescriptor.m18453j("memories", true);
        pluginGeneratedSerialDescriptor.m18453j("memoryMaxTokens", false);
        pluginGeneratedSerialDescriptor.m18453j("memoryNumTokens", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{AbstractC9961r4.m10615b(C7674i.f24194d[0]), c11135i, c11135i};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C7674i.f24194d;
        List list = null;
        boolean z6 = true;
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                iMo5478l2 = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C7674i(i10, list, iMo5478l, iMo5478l2);
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
        C7674i value = (C7674i) obj;
        AbstractC16544l.m18094g(encoder, VjclRfeKsMflo.BLmUsYYOmXjH);
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C7673h c7673h = C7674i.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f24195a;
        if (zMo5565F || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C7674i.f24194d[0], list);
        }
        interfaceC10429bMo5570c.mo5579m(1, value.f24196b, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5579m(2, value.f24197c, pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }
}
