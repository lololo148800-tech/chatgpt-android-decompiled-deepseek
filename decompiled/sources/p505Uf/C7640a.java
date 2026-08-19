package p505Uf;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
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

/* JADX INFO: renamed from: Uf.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C7640a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C7640a f24152a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C7640a c7640a = new C7640a();
        f24152a = c7640a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.notification.models.ApiPermission", c7640a, 4);
        pluginGeneratedSerialDescriptor.m18453j("type", false);
        pluginGeneratedSerialDescriptor.m18453j("notificationChannelId", true);
        pluginGeneratedSerialDescriptor.m18453j("notificationChannelName", true);
        pluginGeneratedSerialDescriptor.m18453j("notificationPriority", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C7650k.f24169e;
        return new KSerializer[]{kSerializerArr[0], AbstractC9961r4.m10615b(kSerializerArr[1]), AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(C7646g.f24162a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C7650k.f24169e;
        EnumC7649j enumC7649j = null;
        EnumC7643d enumC7643d = null;
        String str = null;
        Integer num = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                enumC7649j = (EnumC7649j) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC7649j);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                enumC7643d = (EnumC7643d) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC7643d);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C7646g.f24162a, num);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C7650k(i10, enumC7649j, enumC7643d, str, num);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C7650k value = (C7650k) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C7650k.f24169e;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f24170a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC7643d enumC7643d = value.f24171b;
        if (zMo5565F || enumC7643d != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC7643d);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f24172c;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f24173d;
        if (zMo5565F3 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C7646g.f24162a, num);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
