package p1126yd;

import ao.AbstractC11153a0;
import ao.C11125B;
import ao.C11141O;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: yd.y0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C21509y0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21509y0 f68129a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21509y0 c21509y0 = new C21509y0();
        f68129a = c21509y0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.MessageComparisonFeedback", c21509y0, 20);
        pluginGeneratedSerialDescriptor.m18453j("feedbackVersion", false);
        pluginGeneratedSerialDescriptor.m18453j("originalMessageId", false);
        pluginGeneratedSerialDescriptor.m18453j("newMessageId", false);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("completionComparisonRating", false);
        pluginGeneratedSerialDescriptor.m18453j("newCompletionPlacement", false);
        pluginGeneratedSerialDescriptor.m18453j("feedbackStartTime", false);
        pluginGeneratedSerialDescriptor.m18453j("compareStepStartTime", false);
        pluginGeneratedSerialDescriptor.m18453j("originalCompletionLoadStartTime", false);
        pluginGeneratedSerialDescriptor.m18453j("originalCompletionLoadEndTime", false);
        pluginGeneratedSerialDescriptor.m18453j("newCompletionLoadStartTime", false);
        pluginGeneratedSerialDescriptor.m18453j("newCompletionLoadEndTime", false);
        pluginGeneratedSerialDescriptor.m18453j("leftVisibilityInitial", true);
        pluginGeneratedSerialDescriptor.m18453j("leftVisibilityMax", true);
        pluginGeneratedSerialDescriptor.m18453j("rightVisibilityInitial", true);
        pluginGeneratedSerialDescriptor.m18453j("rightVisibilityMax", true);
        pluginGeneratedSerialDescriptor.m18453j("rating", true);
        pluginGeneratedSerialDescriptor.m18453j("text", true);
        pluginGeneratedSerialDescriptor.m18453j("tags", true);
        pluginGeneratedSerialDescriptor.m18453j("frontendSubmissionTime", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21406A0.f67952u;
        KSerializer kSerializer = kSerializerArr[0];
        KSerializer kSerializer2 = kSerializerArr[4];
        KSerializer kSerializer3 = kSerializerArr[5];
        C11125B c11125b = C11125B.f33744a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11125b);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11125b);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11125b);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11125b);
        KSerializer kSerializer4 = kSerializerArr[18];
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        C11141O c11141o = C11141O.f33773a;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializer, c21977y0, c21977y0, C22003f0.f69641a, kSerializer2, kSerializer3, c11141o, c11141o, c11141o, c11141o, c11141o, c11141o, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, c11181o0, c11181o0, kSerializer4, c11141o};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        int i10;
        int i11;
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21406A0.f67952u;
        long jMo5476i = 0;
        long jMo5476i2 = 0;
        long jMo5476i3 = 0;
        long jMo5476i4 = 0;
        long jMo5476i5 = 0;
        long jMo5476i6 = 0;
        long jMo5476i7 = 0;
        List list = null;
        Float f10 = null;
        Float f11 = null;
        Float f12 = null;
        Float f13 = null;
        int i12 = 0;
        EnumC21418G0 enumC21418G0 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        EnumC21414E0 enumC21414E0 = null;
        EnumC21410C0 enumC21410C0 = null;
        boolean z6 = true;
        String strMo5483q = null;
        String strMo5483q2 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    kSerializerArr = kSerializerArr;
                    break;
                case 0:
                    enumC21418G0 = (EnumC21418G0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC21418G0);
                    i12 |= 1;
                    kSerializerArr = kSerializerArr;
                    break;
                case 1:
                    enumC21418G0 = enumC21418G0;
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, str != null ? new C21984a1(str) : null);
                    i12 |= 2;
                    str = c21984a1 != null ? c21984a1.f69607Y : null;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 2:
                    enumC21418G0 = enumC21418G0;
                    C21984a1 c21984a2 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                    str2 = c21984a2 != null ? c21984a2.f69607Y : null;
                    i12 |= 4;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 3:
                    enumC21418G0 = enumC21418G0;
                    C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C22003f0.f69641a, str3 != null ? new C22011h0(str3) : null);
                    str3 = c22011h0 != null ? c22011h0.f69652a : null;
                    i12 |= 8;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 4:
                    enumC21418G0 = enumC21418G0;
                    enumC21414E0 = (EnumC21414E0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC21414E0);
                    i12 |= 16;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 5:
                    enumC21418G0 = enumC21418G0;
                    enumC21410C0 = (EnumC21410C0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], enumC21410C0);
                    i12 |= 32;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 6:
                    jMo5476i = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 6);
                    i12 |= 64;
                    break;
                case 7:
                    jMo5476i2 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 7);
                    i12 |= 128;
                    break;
                case 8:
                    jMo5476i3 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 8);
                    i12 |= 256;
                    break;
                case 9:
                    jMo5476i4 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 9);
                    i12 |= 512;
                    break;
                case 10:
                    jMo5476i5 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 10);
                    i12 |= 1024;
                    break;
                case 11:
                    jMo5476i6 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 11);
                    i12 |= 2048;
                    break;
                case 12:
                    enumC21418G0 = enumC21418G0;
                    f11 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 12, C11125B.f33744a, f11);
                    i12 |= 4096;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 13:
                    enumC21418G0 = enumC21418G0;
                    f12 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 13, C11125B.f33744a, f12);
                    i12 |= 8192;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 14:
                    enumC21418G0 = enumC21418G0;
                    f13 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 14, C11125B.f33744a, f13);
                    i12 |= 16384;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 15:
                    f10 = (Float) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 15, C11125B.f33744a, f10);
                    i11 = 32768;
                    i12 |= i11;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 16:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 16);
                    i10 = 65536;
                    i12 |= i10;
                    break;
                case 17:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 17);
                    i10 = 131072;
                    i12 |= i10;
                    break;
                case 18:
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 18, kSerializerArr[18], list);
                    i11 = 262144;
                    i12 |= i11;
                    enumC21418G0 = enumC21418G0;
                    break;
                case 19:
                    jMo5476i7 = interfaceC10428aMo5471c.mo5476i(pluginGeneratedSerialDescriptor, 19);
                    i10 = 524288;
                    i12 |= i10;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21406A0(i12, enumC21418G0, str, str2, str3, enumC21414E0, enumC21410C0, jMo5476i, jMo5476i2, jMo5476i3, jMo5476i4, jMo5476i5, jMo5476i6, f11, f12, f13, f10, strMo5483q, strMo5483q2, list, jMo5476i7);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21406A0 value = (C21406A0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21406A0.f67952u;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f67953a);
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, c21977y0, new C21984a1(value.f67954b));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, c21977y0, new C21984a1(value.f67955c));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C22003f0.f69641a, new C22011h0(value.f67956d));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], value.f67957e);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], value.f67958f);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 6, value.f67959g);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 7, value.f67960h);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 8, value.f67961i);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 9, value.f67962j);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 10, value.f67963k);
        interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 11, value.f67964l);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f10 = value.f67965m;
        if (zMo5565F || !AbstractC16544l.m18089b(f10, Float.valueOf(1.0f))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 12, C11125B.f33744a, f10);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f11 = value.f67966n;
        if (zMo5565F2 || !AbstractC16544l.m18089b(f11, Float.valueOf(1.0f))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 13, C11125B.f33744a, f11);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f12 = value.f67967o;
        if (zMo5565F3 || !AbstractC16544l.m18089b(f12, Float.valueOf(0.0f))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 14, C11125B.f33744a, f12);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Float f13 = value.f67968p;
        if (zMo5565F4 || !AbstractC16544l.m18089b(f13, Float.valueOf(0.0f))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 15, C11125B.f33744a, f13);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f67969q;
        if (zMo5565F5 || !AbstractC16544l.m18089b(str, "none")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 16, str);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f67970r;
        if (zMo5565F6 || !AbstractC16544l.m18089b(str2, "")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 17, str2);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f67971s;
        if (zMo5565F7 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 18, kSerializerArr[18], list);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        long j10 = value.f67972t;
        if (zMo5565F8 || j10 != System.currentTimeMillis()) {
            interfaceC10429bMo5570c.mo5564E(pluginGeneratedSerialDescriptor, 19, j10);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
