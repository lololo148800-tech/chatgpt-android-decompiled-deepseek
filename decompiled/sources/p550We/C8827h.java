package p550We;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.Map;
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

/* JADX INFO: renamed from: We.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C8827h implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C8827h f27013a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C8827h c8827h = new C8827h();
        f27013a = c8827h;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.api.GizmoActionSettingsItem", c8827h, 4);
        pluginGeneratedSerialDescriptor.m18453j("actionId", false);
        pluginGeneratedSerialDescriptor.m18453j("oauthStatus", true);
        pluginGeneratedSerialDescriptor.m18453j("actionSettings", false);
        pluginGeneratedSerialDescriptor.m18453j("operations", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C8829j.f27014e;
        return new KSerializer[]{C11181o0.f33827a, AbstractC9961r4.m10615b(kSerializerArr[1]), AbstractC9961r4.m10615b(kSerializerArr[2]), AbstractC9961r4.m10615b(kSerializerArr[3])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C8829j.f27014e;
        String strMo5483q = null;
        EnumC8820a enumC8820a = null;
        Map map = null;
        Map map2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                enumC8820a = (EnumC8820a) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC8820a);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                map = (Map) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], map);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                map2 = (Map) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map2);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C8829j(i10, strMo5483q, enumC8820a, map, map2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C8829j value = (C8829j) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f27015a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C8829j.f27014e;
        EnumC8820a enumC8820a = value.f27016b;
        if (zMo5565F || enumC8820a != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC8820a);
        }
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f27017c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], value.f27018d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
