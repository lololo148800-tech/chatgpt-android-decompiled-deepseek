package p148Fi;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p072Ci.C1706k;
import p072Ci.C1708m;
import p324Mn.C5551u;
import p387Pl.EnumC6481b;
import p463Sn.C7156i;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.P0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2783P0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2783P0 f8500a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2783P0 c2783p0 = new C2783P0();
        f8500a = c2783p0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.VoiceOptions", c2783p0, 5);
        pluginGeneratedSerialDescriptor.m18453j("voices", false);
        pluginGeneratedSerialDescriptor.m18453j("selected", false);
        pluginGeneratedSerialDescriptor.m18453j("cameraPosition", true);
        pluginGeneratedSerialDescriptor.m18453j("lastUpdated", true);
        pluginGeneratedSerialDescriptor.m18453j("lastVideoWarningShown", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C7156i c7156i = C7156i.f22754a;
        return new KSerializer[]{C2786R0.f8501f[0], C1706k.f4889a, C2812d.f8540a, c7156i, c7156i};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2786R0.f8501f;
        boolean z6 = true;
        int i10 = 0;
        List list = null;
        String str = null;
        EnumC6481b enumC6481b = null;
        C5551u c5551u = null;
        C5551u c5551u2 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C1708m c1708m = (C1708m) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C1706k.f4889a, str != null ? new C1708m(str) : null);
                str = c1708m != null ? c1708m.f4890a : null;
                i10 |= 2;
            } else if (iMo10914s == 2) {
                enumC6481b = (EnumC6481b) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C2812d.f8540a, enumC6481b);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                c5551u2 = (C5551u) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C7156i.f22754a, c5551u2);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2786R0(i10, list, str, enumC6481b, c5551u, c5551u2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2786R0 value = (C2786R0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C2786R0.f8501f[0], value.f8502a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C1706k.f4889a, new C1708m(value.f8503b));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC6481b enumC6481b = value.f8504c;
        if (zMo5565F || enumC6481b != EnumC6481b.f21035Z) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C2812d.f8540a, enumC6481b);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f8505d;
        if (zMo5565F2) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
        } else {
            C5551u.Companion.getClass();
            if (!AbstractC16544l.m18089b(c5551u, C5551u.f18000Z)) {
                interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C7156i.f22754a, c5551u);
            }
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u2 = value.f8506e;
        if (zMo5565F3) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C7156i.f22754a, c5551u2);
        } else {
            C5551u.Companion.getClass();
            if (!AbstractC16544l.m18089b(c5551u2, C5551u.f18000Z)) {
                interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C7156i.f22754a, c5551u2);
            }
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
