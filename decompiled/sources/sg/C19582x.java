package sg;

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
import p909nm.C17690x;

/* JADX INFO: renamed from: sg.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C19582x implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C19582x f62182a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C19582x c19582x = new C19582x();
        f62182a = c19582x;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentRequest", c19582x, 4);
        pluginGeneratedSerialDescriptor.m18453j("reason", false);
        pluginGeneratedSerialDescriptor.m18453j("entityType", false);
        pluginGeneratedSerialDescriptor.m18453j("entityId", false);
        pluginGeneratedSerialDescriptor.m18453j("additionalFieldsValues", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C19584z.f62183e;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{C19537A.f62067a, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C19584z.f62183e;
        C19539C c19539c = null;
        String str = null;
        String str2 = null;
        Map map = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c19539c = (C19539C) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C19537A.f62067a, c19539c);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C19584z(i10, c19539c, str, str2, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C19584z value = (C19584z) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C19583y c19583y = C19584z.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C19537A.f62067a, value.f62184a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11181o0, value.f62185b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f62186c);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Map map = value.f62187d;
        if (zMo5565F || !AbstractC16544l.m18089b(map, C17690x.f56481Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C19584z.f62183e[3], map);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
