package p067Cd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Cd.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1630d implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1630d f4620a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1630d c1630d = new C1630d();
        f4620a = c1630d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.moderation.ModerationResult", c1630d, 4);
        pluginGeneratedSerialDescriptor.m18453j("messageId", false);
        pluginGeneratedSerialDescriptor.m18453j("flagged", false);
        pluginGeneratedSerialDescriptor.m18453j("blocked", false);
        pluginGeneratedSerialDescriptor.m18453j("disclaimers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C1632f.f4621e[3];
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{C21977Y0.f69577a, c11164g, c11164g, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1632f.f4621e;
        boolean z6 = true;
        String str = null;
        List list = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, str != null ? new C21984a1(str) : null);
                str = c21984a1 != null ? c21984a1.f69607Y : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1632f(i10, str, list, zMo5481o, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1632f value = (C1632f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1631e c1631e = C1632f.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, new C21984a1(value.f4622a));
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, value.f4623b);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, value.f4624c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C1632f.f4621e[3], value.f4625d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
