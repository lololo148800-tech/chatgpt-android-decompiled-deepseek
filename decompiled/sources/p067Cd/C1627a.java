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
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Cd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1627a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1627a f4615a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1627a c1627a = new C1627a();
        f4615a = c1627a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.moderation.ApiModerationResponse", c1627a, 3);
        pluginGeneratedSerialDescriptor.m18453j("flagged", false);
        pluginGeneratedSerialDescriptor.m18453j("blocked", false);
        pluginGeneratedSerialDescriptor.m18453j("disclaimers", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C1629c.f4616d[2];
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11164g, c11164g, kSerializer};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1629c.f4616d;
        List list = null;
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
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
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
        return new C1629c(i10, zMo5481o, zMo5481o2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1629c value = (C1629c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 0, value.f4617a);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, value.f4618b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C1629c.f4616d[2], value.f4619c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
