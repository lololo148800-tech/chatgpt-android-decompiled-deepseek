package p1126yd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.AbstractC22035n0;
import p1155zi.C21960S1;
import p1155zi.C21966U1;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p1155zi.C22012h1;
import p1155zi.C22020j1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import ye.C21518g;
import ye.EnumC21517f;
import ye.EnumC21521j;

/* JADX INFO: renamed from: yd.T */
/* JADX INFO: loaded from: classes3.dex */
public final class C21442T implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21442T f68013a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21442T c21442t = new C21442T();
        f68013a = c21442t;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamRequest", c21442t, 16);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("action", false);
        pluginGeneratedSerialDescriptor.m18453j("parentMessageId", false);
        pluginGeneratedSerialDescriptor.m18453j("messages", false);
        pluginGeneratedSerialDescriptor.m18453j("model", false);
        pluginGeneratedSerialDescriptor.m18453j("historyAndTrainingDisabled", true);
        pluginGeneratedSerialDescriptor.m18453j("continueFromSharedConversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("conversationMode", true);
        pluginGeneratedSerialDescriptor.m18453j("suggestions", true);
        pluginGeneratedSerialDescriptor.m18453j("forceUseSse", true);
        pluginGeneratedSerialDescriptor.m18453j("forceUseSearch", true);
        pluginGeneratedSerialDescriptor.m18453j("clientReportedSearchSource", true);
        pluginGeneratedSerialDescriptor.m18453j("forceParagen", true);
        pluginGeneratedSerialDescriptor.m18453j("supportedEncodings", true);
        pluginGeneratedSerialDescriptor.m18453j("supportsBuffering", true);
        pluginGeneratedSerialDescriptor.m18453j("timezone", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21446V.f68015q;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C22003f0.f69641a);
        KSerializer kSerializer = kSerializerArr[1];
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(kSerializerArr[3]);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(C21960S1.f69525a);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(kSerializerArr[7]);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(kSerializerArr[8]);
        KSerializer kSerializerM10615b6 = AbstractC9961r4.m10615b(C21518g.f68144a);
        KSerializer kSerializerM10615b7 = AbstractC9961r4.m10615b(kSerializerArr[11]);
        KSerializer kSerializerM10615b8 = AbstractC9961r4.m10615b(kSerializerArr[13]);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializerM10615b, kSerializer, C21977Y0.f69577a, kSerializerM10615b2, C22012h1.f69653a, c11164g, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, c11164g, kSerializerM10615b6, kSerializerM10615b7, c11164g, kSerializerM10615b8, c11164g, C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        C22011h0 c22011h0;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21446V.f68015q;
        EnumC21521j enumC21521j = null;
        EnumC21517f enumC21517f = null;
        List list = null;
        boolean z6 = true;
        AbstractC22035n0 abstractC22035n0 = null;
        int i11 = 0;
        String str = null;
        EnumC21452Y enumC21452Y = null;
        String str2 = null;
        List list2 = null;
        String str3 = null;
        List list3 = null;
        String str4 = null;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        boolean zMo5481o4 = false;
        String strMo5483q = null;
        while (z6) {
            boolean z10 = z6;
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    kSerializerArr = kSerializerArr;
                    z6 = false;
                    kSerializerArr = kSerializerArr;
                    break;
                case 0:
                    String str5 = str;
                    C22003f0 c22003f0 = C22003f0.f69641a;
                    if (str5 != null) {
                        c22011h0 = new C22011h0(str5);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        c22011h0 = null;
                    }
                    C22011h0 c22011h1 = (C22011h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, i10, c22003f0, c22011h0);
                    str = c22011h1 != null ? c22011h1.f69652a : null;
                    i11 |= 1;
                    z6 = z10;
                    kSerializerArr = kSerializerArr;
                    break;
                case 1:
                    enumC21452Y = (EnumC21452Y) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC21452Y);
                    i11 |= 2;
                    z6 = z10;
                    str = str;
                    break;
                case 2:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                    str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i11 |= 4;
                    z6 = z10;
                    str = str;
                    break;
                case 3:
                    list2 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
                    i11 |= 8;
                    z6 = z10;
                    str = str;
                    break;
                case 4:
                    C22020j1 c22020j1 = (C22020j1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, C22012h1.f69653a, str3 != null ? new C22020j1(str3) : null);
                    str3 = c22020j1 != null ? c22020j1.f69665a : null;
                    i11 |= 16;
                    z6 = z10;
                    str = str;
                    break;
                case 5:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i11 |= 32;
                    z6 = z10;
                    break;
                case 6:
                    C21966U1 c21966u1 = (C21966U1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C21960S1.f69525a, str4 != null ? new C21966U1(str4) : null);
                    str4 = c21966u1 != null ? c21966u1.f69541a : null;
                    i11 |= 64;
                    z6 = z10;
                    str = str;
                    break;
                case 7:
                    abstractC22035n0 = (AbstractC22035n0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], abstractC22035n0);
                    i11 |= 128;
                    z6 = z10;
                    str = str;
                    break;
                case 8:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
                    i11 |= 256;
                    z6 = z10;
                    str = str;
                    break;
                case 9:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 9);
                    i11 |= 512;
                    z6 = z10;
                    break;
                case 10:
                    enumC21517f = (EnumC21517f) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 10, C21518g.f68144a, enumC21517f);
                    i11 |= 1024;
                    z6 = z10;
                    str = str;
                    break;
                case 11:
                    enumC21521j = (EnumC21521j) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], enumC21521j);
                    i11 |= 2048;
                    z6 = z10;
                    str = str;
                    break;
                case 12:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 12);
                    i11 |= 4096;
                    z6 = z10;
                    break;
                case 13:
                    list3 = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], list3);
                    i11 |= 8192;
                    z6 = z10;
                    str = str;
                    break;
                case 14:
                    zMo5481o4 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 14);
                    i11 |= 16384;
                    z6 = z10;
                    break;
                case 15:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 15);
                    i11 |= 32768;
                    z6 = z10;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21446V(i11, str, enumC21452Y, str2, list2, str3, zMo5481o2, str4, abstractC22035n0, list, zMo5481o, enumC21517f, enumC21521j, zMo5481o3, list3, zMo5481o4, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21446V value = (C21446V) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C21444U c21444u = C21446V.Companion;
        C22003f0 c22003f0 = C22003f0.f69641a;
        String str = value.f68016a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c22003f0, str != null ? new C22011h0(str) : null);
        KSerializer[] kSerializerArr = C21446V.f68015q;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f68017b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, new C21984a1(value.f68018c));
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], value.f68019d);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C22012h1.f69653a, new C22020j1(value.f68020e));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f68021f;
        if (zMo5565F || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z6);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f68022g;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C21960S1.f69525a, str2 != null ? new C21966U1(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        AbstractC22035n0 abstractC22035n0 = value.f68023h;
        if (zMo5565F3 || abstractC22035n0 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], abstractC22035n0);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f68024i;
        if (zMo5565F4 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], list);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f68025j;
        if (zMo5565F5 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 9, z10);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC21517f enumC21517f = value.f68026k;
        if (zMo5565F6 || enumC21517f != EnumC21517f.f68138Z) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 10, C21518g.f68144a, enumC21517f);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC21521j enumC21521j = value.f68027l;
        if (zMo5565F7 || enumC21521j != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 11, kSerializerArr[11], enumC21521j);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f68028m;
        if (zMo5565F8 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 12, z11);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f68029n;
        if (zMo5565F9 || list2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 13, kSerializerArr[13], list2);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z12 = value.f68030o;
        if (zMo5565F10 || z12) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 14, z12);
        }
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 15, value.f68031p);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
