package p528Vg;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p025An.C0644w;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Vg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C8283b implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C8283b f25821a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C8283b c8283b = new C8283b();
        f25821a = c8283b;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.settings.settings.DeveloperSettings", c8283b, 10);
        pluginGeneratedSerialDescriptor.m18453j("apiEnvironment", true);
        pluginGeneratedSerialDescriptor.m18453j("saServerAdHocEnvironment", true);
        pluginGeneratedSerialDescriptor.m18453j("useAuth0Staging", true);
        pluginGeneratedSerialDescriptor.m18453j("useVoiceCanary", true);
        pluginGeneratedSerialDescriptor.m18453j("showVoiceDebugOverlay", true);
        pluginGeneratedSerialDescriptor.m18453j("noNewChatTitle", true);
        pluginGeneratedSerialDescriptor.m18453j("emulatorOverride", true);
        pluginGeneratedSerialDescriptor.m18453j("useMediaAudioForVoice", true);
        pluginGeneratedSerialDescriptor.m18453j("forceStandardVoice", true);
        pluginGeneratedSerialDescriptor.m18453j("canEditAuth0ForApiEnv", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C8285d.f25822k[0];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C11181o0.f33827a);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializer, kSerializerM10615b, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C8285d.f25822k;
        EnumC8282a enumC8282a = null;
        String str = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        boolean zMo5481o4 = false;
        boolean zMo5481o5 = false;
        boolean zMo5481o6 = false;
        boolean zMo5481o7 = false;
        boolean zMo5481o8 = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    enumC8282a = (EnumC8282a) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC8282a);
                    i10 |= 1;
                    break;
                case 1:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                    i10 |= 2;
                    break;
                case 2:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    zMo5481o4 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    zMo5481o5 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                case 7:
                    zMo5481o6 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    zMo5481o7 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    break;
                case 9:
                    zMo5481o8 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 9);
                    i10 |= 512;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C8285d(i10, enumC8282a, str, zMo5481o, zMo5481o2, zMo5481o3, zMo5481o4, zMo5481o5, zMo5481o6, zMo5481o7, zMo5481o8);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c1  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C8285d value = (C8285d) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C8284c c8284c = C8285d.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = false;
        EnumC8282a enumC8282a = value.f25823a;
        if (zMo5565F || enumC8282a != EnumC8282a.f25819Y) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C8285d.f25822k[0], enumC8282a);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f25824b;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f25825c;
        if (zMo5565F3 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, z10);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f25826d;
        if (zMo5565F4 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, z11);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z12 = value.f25827e;
        if (zMo5565F5 || z12) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z12);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z13 = value.f25828f;
        if (zMo5565F6 || z13) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z13);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z14 = value.f25829g;
        if (zMo5565F7 || z14) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 6, z14);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z15 = value.f25830h;
        if (zMo5565F8 || z15) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 7, z15);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z16 = value.f25831i;
        if (zMo5565F9 || z16) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 8, z16);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z17 = value.f25832j;
        if (zMo5565F10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 9, z17);
        } else {
            int iOrdinal = enumC8282a.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                z6 = true;
            } else if (iOrdinal != 2) {
                throw new C0644w();
            }
            if (z17 != z6) {
                interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 9, z17);
            }
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
