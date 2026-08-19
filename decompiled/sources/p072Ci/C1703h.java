package p072Ci;

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
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Ci.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C1703h implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1703h f4866a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1703h c1703h = new C1703h();
        f4866a = c1703h;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.user.model.UserSettings", c1703h, 21);
        pluginGeneratedSerialDescriptor.m18453j("history_disabled", true);
        pluginGeneratedSerialDescriptor.m18453j("languageCode", true);
        pluginGeneratedSerialDescriptor.m18453j("nightMode", true);
        pluginGeneratedSerialDescriptor.m18453j("seenDisclosures", true);
        pluginGeneratedSerialDescriptor.m18453j("seenCustomInstructionsIntroduction", true);
        pluginGeneratedSerialDescriptor.m18453j("seenVisionDisclosure", true);
        pluginGeneratedSerialDescriptor.m18453j("seenMemoryDisclosure", true);
        pluginGeneratedSerialDescriptor.m18453j("seenMemoryInSearchDisclosure", true);
        pluginGeneratedSerialDescriptor.m18453j("seenTemporaryChatDisclosure", true);
        pluginGeneratedSerialDescriptor.m18453j("seenDalleOperationDisclosure", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenAdvancedVoice", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenAdvancedVoiceSelection", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenAdvancedVideo", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenVoiceBackgroundPrompt", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenVoiceAlphaTooltip", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenSearchTooltip", true);
        pluginGeneratedSerialDescriptor.m18453j("lastShownTooltipText", true);
        pluginGeneratedSerialDescriptor.m18453j("hapticEnabled", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenStrawSelection", true);
        pluginGeneratedSerialDescriptor.m18453j("hasHadStrawConversation", true);
        pluginGeneratedSerialDescriptor.m18453j("hasSeenStrawComposer", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1705j.f4867v;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11164g, kSerializerM10615b, kSerializer, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, c11164g, kSerializerM10615b2, c11164g, c11164g, c11164g, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        int i11;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1705j.f4867v;
        String str = null;
        String str2 = null;
        EnumC1696a enumC1696a = null;
        boolean z6 = true;
        int i12 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        boolean zMo5481o4 = false;
        boolean zMo5481o5 = false;
        boolean zMo5481o6 = false;
        boolean zMo5481o7 = false;
        boolean zMo5481o8 = false;
        boolean zMo5481o9 = false;
        boolean zMo5481o10 = false;
        boolean zMo5481o11 = false;
        boolean zMo5481o12 = false;
        boolean zMo5481o13 = false;
        boolean zMo5481o14 = false;
        boolean zMo5481o15 = false;
        boolean zMo5481o16 = false;
        boolean zMo5481o17 = false;
        boolean zMo5481o18 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 0);
                    i12 |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
                    i12 |= 2;
                    break;
                case 2:
                    enumC1696a = (EnumC1696a) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC1696a);
                    i12 |= 4;
                    break;
                case 3:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                    i12 |= 8;
                    break;
                case 4:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i12 |= 16;
                    break;
                case 5:
                    zMo5481o4 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i12 |= 32;
                    break;
                case 6:
                    zMo5481o5 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 6);
                    i12 |= 64;
                    break;
                case 7:
                    zMo5481o6 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 7);
                    i12 |= 128;
                    break;
                case 8:
                    zMo5481o7 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 8);
                    i12 |= 256;
                    break;
                case 9:
                    zMo5481o8 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 9);
                    i12 |= 512;
                    break;
                case 10:
                    zMo5481o9 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 10);
                    i12 |= 1024;
                    break;
                case 11:
                    zMo5481o10 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 11);
                    i12 |= 2048;
                    break;
                case 12:
                    zMo5481o11 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 12);
                    i12 |= 4096;
                    break;
                case 13:
                    zMo5481o12 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 13);
                    i12 |= 8192;
                    break;
                case 14:
                    zMo5481o13 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 14);
                    i12 |= 16384;
                    break;
                case 15:
                    zMo5481o14 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 15);
                    i11 = 32768;
                    i12 |= i11;
                    break;
                case 16:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 16, C11181o0.f33827a, str);
                    i11 = 65536;
                    i12 |= i11;
                    break;
                case 17:
                    zMo5481o15 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 17);
                    i10 = 131072;
                    i12 |= i10;
                    break;
                case 18:
                    zMo5481o16 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 18);
                    i10 = 262144;
                    i12 |= i10;
                    break;
                case 19:
                    zMo5481o17 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 19);
                    i10 = 524288;
                    i12 |= i10;
                    break;
                case 20:
                    zMo5481o18 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 20);
                    i10 = 1048576;
                    i12 |= i10;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1705j(i12, zMo5481o, str2, enumC1696a, zMo5481o2, zMo5481o3, zMo5481o4, zMo5481o5, zMo5481o6, zMo5481o7, zMo5481o8, zMo5481o9, zMo5481o10, zMo5481o11, zMo5481o12, zMo5481o13, zMo5481o14, str, zMo5481o15, zMo5481o16, zMo5481o17, zMo5481o18);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1705j value = (C1705j) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1704i c1704i = C1705j.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f4868a;
        if (zMo5565F || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 0, z6);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f4869b;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC1696a enumC1696a = value.f4870c;
        if (zMo5565F3 || enumC1696a != EnumC1696a.System) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C1705j.f4867v[2], enumC1696a);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f4871d;
        if (zMo5565F4 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, z10);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f4872e;
        if (zMo5565F5 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z11);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z12 = value.f4873f;
        if (zMo5565F6 || z12) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z12);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z13 = value.f4874g;
        if (zMo5565F7 || z13) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 6, z13);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z14 = value.f4875h;
        if (zMo5565F8 || z14) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 7, z14);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z15 = value.f4876i;
        if (zMo5565F9 || z15) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 8, z15);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z16 = value.f4877j;
        if (zMo5565F10 || z16) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 9, z16);
        }
        boolean zMo5565F11 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z17 = value.f4878k;
        if (zMo5565F11 || z17) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 10, z17);
        }
        boolean zMo5565F12 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z18 = value.f4879l;
        if (zMo5565F12 || z18) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 11, z18);
        }
        boolean zMo5565F13 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z19 = value.f4880m;
        if (zMo5565F13 || z19) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 12, z19);
        }
        boolean zMo5565F14 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z20 = value.f4881n;
        if (zMo5565F14 || z20) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 13, z20);
        }
        boolean zMo5565F15 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z21 = value.f4882o;
        if (zMo5565F15 || z21) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 14, z21);
        }
        boolean zMo5565F16 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z22 = value.f4883p;
        if (zMo5565F16 || z22) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 15, z22);
        }
        boolean zMo5565F17 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f4884q;
        if (zMo5565F17 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 16, C11181o0.f33827a, str2);
        }
        boolean zMo5565F18 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z23 = value.f4885r;
        if (zMo5565F18 || !z23) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 17, z23);
        }
        boolean zMo5565F19 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z24 = value.f4886s;
        if (zMo5565F19 || z24) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 18, z24);
        }
        boolean zMo5565F20 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z25 = value.f4887t;
        if (zMo5565F20 || z25) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 19, z25);
        }
        boolean zMo5565F21 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z26 = value.f4888u;
        if (zMo5565F21 || z26) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 20, z26);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
