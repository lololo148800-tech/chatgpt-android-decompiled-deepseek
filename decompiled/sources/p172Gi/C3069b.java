package p172Gi;

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
import p1155zi.AbstractC22035n0;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p1155zi.EnumC22033m2;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Gi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C3069b implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C3069b f9256a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C3069b c3069b = new C3069b();
        f9256a = c3069b;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.model.GetTokenRequest", c3069b, 14);
        pluginGeneratedSerialDescriptor.m18453j("voice", false);
        pluginGeneratedSerialDescriptor.m18453j("modelSlug", false);
        pluginGeneratedSerialDescriptor.m18453j("modelSlugAdvanced", false);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("parentMessageId", false);
        pluginGeneratedSerialDescriptor.m18453j("languageCode", false);
        pluginGeneratedSerialDescriptor.m18453j("voiceSessionId", false);
        pluginGeneratedSerialDescriptor.m18453j("conversationMode", false);
        pluginGeneratedSerialDescriptor.m18453j("voiceTrainingAllowed", false);
        pluginGeneratedSerialDescriptor.m18453j("voiceMode", false);
        pluginGeneratedSerialDescriptor.m18453j("videoTrainingAllowed", false);
        pluginGeneratedSerialDescriptor.m18453j("open_voice_from_voice_picker", false);
        pluginGeneratedSerialDescriptor.m18453j("systemPromptType", false);
        pluginGeneratedSerialDescriptor.m18453j("chatreqToken", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C3071d.f9257o;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(C22003f0.f69641a);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(C21977Y0.f69577a);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(C3093z.f9305a);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(kSerializerArr[7]);
        KSerializer kSerializer = kSerializerArr[9];
        KSerializer kSerializer2 = kSerializerArr[12];
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(c11181o0);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializerM10615b, C22012h1.f69653a, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, kSerializerM10615b6, kSerializerM10615b7, c11164g, kSerializer, c11164g, c11164g, kSerializer2, kSerializerM10615b8};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C3071d.f9257o;
        String str = null;
        EnumC3064F enumC3064F = null;
        EnumC22033m2 enumC22033m2 = null;
        boolean z6 = true;
        AbstractC22035n0 abstractC22035n0 = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    kSerializerArr = kSerializerArr;
                    break;
                case 0:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str2);
                    i10 |= 1;
                    kSerializerArr = kSerializerArr;
                    z6 = z10;
                    break;
                case 1:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C22012h1.f69653a, str3 != null ? new C22020j1(str3) : null);
                    i10 |= 2;
                    str3 = c22020j1 != null ? c22020j1.f69665a : null;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 2:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str4);
                    i10 |= 4;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 3:
                    C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C22003f0.f69641a, str5 != null ? new C22011h0(str5) : null);
                    str5 = c22011h0 != null ? c22011h0.f69652a : null;
                    i10 |= 8;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 4:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C21977Y0.f69577a, str6 != null ? new C21984a1(str6) : null);
                    str6 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i10 |= 16;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 5:
                    str7 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str7);
                    i10 |= 32;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 6:
                    C3060B c3060b = (C3060B) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C3093z.f9305a, str8 != null ? new C3060B(str8) : null);
                    str8 = c3060b != null ? c3060b.f9228a : null;
                    i10 |= 64;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 7:
                    abstractC22035n0 = (AbstractC22035n0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], abstractC22035n0);
                    i10 |= 128;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 8:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    z6 = z10;
                    break;
                case 9:
                    enumC22033m2 = (EnumC22033m2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], enumC22033m2);
                    i10 |= 512;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 10:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 10);
                    i10 |= 1024;
                    z6 = z10;
                    break;
                case 11:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 11);
                    i10 |= 2048;
                    z6 = z10;
                    break;
                case 12:
                    enumC3064F = (EnumC3064F) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], enumC3064F);
                    i10 |= 4096;
                    z6 = z10;
                    str2 = str2;
                    break;
                case 13:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, C11181o0.f33827a, str);
                    i10 |= 8192;
                    z6 = z10;
                    str2 = str2;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C3071d(i10, str2, str3, str4, str5, str6, str7, str8, abstractC22035n0, zMo5481o, enumC22033m2, zMo5481o2, zMo5481o3, enumC3064F, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3071d value = (C3071d) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C3070c c3070c = C3071d.Companion;
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11181o0, value.f9258a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C22012h1.f69653a, new C22020j1(value.f9259b));
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f9260c);
        C22003f0 c22003f0 = C22003f0.f69641a;
        String str = value.f9261d;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c22003f0, str != null ? new C22011h0(str) : null);
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        String str2 = value.f9262e;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c21977y0, str2 != null ? new C21984a1(str2) : null);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, value.f9263f);
        C3093z c3093z = C3093z.f9305a;
        String str3 = value.f9264g;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, c3093z, str3 != null ? new C3060B(str3) : null);
        KSerializer[] kSerializerArr = C3071d.f9257o;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], value.f9265h);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 8, value.f9266i);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 9, kSerializerArr[9], value.f9267j);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 10, value.f9268k);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 11, value.f9269l);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 12, kSerializerArr[12], value.f9270m);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 13, c11181o0, value.f9271n);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
