package p072Ci;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p009A7.FlM.nkFZpTrMPpn;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17691y;

/* JADX INFO: renamed from: Ci.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697b implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1697b f4825a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1697b c1697b = new C1697b();
        f4825a = c1697b;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.user.model.RemoteUserSettings", c1697b, 11);
        pluginGeneratedSerialDescriptor.m18453j("memory", true);
        pluginGeneratedSerialDescriptor.m18453j("memoryInSearch", true);
        pluginGeneratedSerialDescriptor.m18453j("trainingAllowed", true);
        pluginGeneratedSerialDescriptor.m18453j("voiceTrainingAllowed", true);
        pluginGeneratedSerialDescriptor.m18453j("videoTrainingAllowed", true);
        pluginGeneratedSerialDescriptor.m18453j("voiceName", true);
        pluginGeneratedSerialDescriptor.m18453j("voiceMainLanguage", true);
        pluginGeneratedSerialDescriptor.m18453j("voiceBackgroundEnabled", true);
        pluginGeneratedSerialDescriptor.m18453j("announcements", true);
        pluginGeneratedSerialDescriptor.m18453j("eligibleAnnouncements", true);
        pluginGeneratedSerialDescriptor.m18453j("preferredWeatherUnit", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1699d.f4826l;
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(C1706k.f4889a), AbstractC9961r4.m10615b(C11181o0.f33827a), AbstractC9961r4.m10615b(c11164g), kSerializerArr[8], kSerializerArr[9], AbstractC9961r4.m10615b(kSerializerArr[10])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1699d.f4826l;
        EnumC1711p enumC1711p = null;
        Set set = null;
        Set set2 = null;
        boolean z6 = true;
        Boolean bool = null;
        int i10 = 0;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        Boolean bool6 = null;
        String str = null;
        String str2 = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    bool2 = bool2;
                    kSerializerArr = kSerializerArr;
                    continue;
                case 0:
                    i10 |= 1;
                    bool2 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool2);
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    continue;
                case 1:
                    bool3 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool3);
                    i10 |= 2;
                    break;
                case 2:
                    bool4 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11164g.f33804a, bool4);
                    i10 |= 4;
                    break;
                case 3:
                    bool5 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool5);
                    i10 |= 8;
                    break;
                case 4:
                    bool6 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool6);
                    i10 |= 16;
                    break;
                case 5:
                    C1708m c1708m = (C1708m) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C1706k.f4889a, str != null ? new C1708m(str) : null);
                    str = c1708m != null ? c1708m.f4890a : null;
                    i10 |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str2);
                    i10 |= 64;
                    break;
                case 7:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11164g.f33804a, bool);
                    i10 |= 128;
                    break;
                case 8:
                    set2 = (Set) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], set2);
                    i10 |= 256;
                    break;
                case 9:
                    set = (Set) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], set);
                    i10 |= 512;
                    break;
                case 10:
                    enumC1711p = (EnumC1711p) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], enumC1711p);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z10;
            bool2 = bool2;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1699d(i10, bool2, bool3, bool4, bool5, bool6, str, str2, bool, set2, set, enumC1711p);
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
        C1699d value = (C1699d) obj;
        AbstractC16544l.m18094g(encoder, nkFZpTrMPpn.gILxVFx);
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1698c c1698c = C1699d.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f4827a;
        if (zMo5565F || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool2 = value.f4828b;
        if (zMo5565F2 || bool2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool3 = value.f4829c;
        if (zMo5565F3 || bool3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11164g.f33804a, bool3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool4 = value.f4830d;
        if (zMo5565F4 || bool4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool4);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool5 = value.f4831e;
        if (zMo5565F5 || bool5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool5);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f4832f;
        if (zMo5565F6 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C1706k.f4889a, str != null ? new C1708m(str) : null);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f4833g;
        if (zMo5565F7 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str2);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool6 = value.f4834h;
        if (zMo5565F8 || bool6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11164g.f33804a, bool6);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C17691y c17691y = C17691y.f56482Y;
        KSerializer[] kSerializerArr = C1699d.f4826l;
        Set set = value.f4835i;
        if (zMo5565F9 || !AbstractC16544l.m18089b(set, c17691y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], set);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Set set2 = value.f4836j;
        if (zMo5565F10 || !AbstractC16544l.m18089b(set2, c17691y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], set2);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC1711p enumC1711p = value.f4837k;
        if (zMo5565F11 || enumC1711p != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], enumC1711p);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }
}
