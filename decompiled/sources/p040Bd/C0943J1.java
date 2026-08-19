package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.org.webrtc.MediaStreamTrack;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.J1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0943J1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0943J1 f2707a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0943J1 c0943j1 = new C0943J1();
        f2707a = c0943j1;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.Video", c0943j1, 7);
        pluginGeneratedSerialDescriptor.m18453j("startIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("endIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("url", false);
        pluginGeneratedSerialDescriptor.m18453j("videoSite", false);
        pluginGeneratedSerialDescriptor.m18453j("videoId", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0979P1.f2759h;
        C11135I c11135i = C11135I.f33763a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11135i);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11135i);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, c11181o0, kSerializerArr[3], AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0979P1.f2759h;
        int i10 = 0;
        Integer num = null;
        Integer num2 = null;
        String strMo5483q = null;
        EnumC0973O1 enumC0973O1 = null;
        String str = null;
        String str2 = null;
        String strMo5483q2 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11135I.f33763a, num);
                    i10 |= 1;
                    break;
                case 1:
                    num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num2);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    enumC0973O1 = (EnumC0973O1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], enumC0973O1);
                    i10 |= 8;
                    break;
                case 4:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str);
                    i10 |= 16;
                    break;
                case 5:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str2);
                    i10 |= 32;
                    break;
                case 6:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0979P1(i10, num, num2, strMo5483q, enumC0973O1, str, str2, strMo5483q2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0979P1 value = (C0979P1) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C0949K1 c0949k1 = C0979P1.Companion;
        C11135I c11135i = C11135I.f33763a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11135i, value.f2760a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11135i, value.f2761b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f2762c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C0979P1.f2759h[3], value.f2763d);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c11181o0, value.f2764e);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, c11181o0, value.f2765f);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2766g;
        if (zMo5565F || !AbstractC16544l.m18089b(str, MediaStreamTrack.VIDEO_TRACK_KIND)) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
