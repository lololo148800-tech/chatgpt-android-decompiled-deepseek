package p148Fi;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mm.InterfaceC17306i;
import p040Bd.C1020W1;
import p040Bd.C1032Y1;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p559Wn.C8981m;
import p571X9.AbstractC9227W;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.K */
/* JADX INFO: loaded from: classes3.dex */
public final class C2772K implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2772K f8480a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2772K c2772k = new C2772K();
        f8480a = c2772k;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.StreamingMessageUpdate", c2772k, 6);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("parentMessageId", false);
        pluginGeneratedSerialDescriptor.m18453j("response", false);
        pluginGeneratedSerialDescriptor.m18453j("request", false);
        pluginGeneratedSerialDescriptor.m18453j("responseMessage", true);
        pluginGeneratedSerialDescriptor.m18453j("requestMessage", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C2778N.f8486g;
        return new KSerializer[]{C22003f0.f69641a, C21977Y0.f69577a, AbstractC9961r4.m10615b(C2858v0.f8628a), AbstractC9961r4.m10615b(C1020W1.f2828a), kSerializerArr[4], kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2778N.f8486g;
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        C2862x0 c2862x0 = null;
        C1032Y1 c1032y1 = null;
        InterfaceC17306i interfaceC17306i = null;
        InterfaceC17306i interfaceC17306i2 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, str != null ? new C22011h0(str) : null);
                    str = c22011h0 != null ? c22011h0.f69652a : null;
                    i10 |= 1;
                    break;
                case 1:
                    C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                    str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                    i10 |= 2;
                    break;
                case 2:
                    c2862x0 = (C2862x0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C2858v0.f8628a, c2862x0);
                    i10 |= 4;
                    break;
                case 3:
                    c1032y1 = (C1032Y1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C1020W1.f2828a, c1032y1);
                    i10 |= 8;
                    break;
                case 4:
                    interfaceC17306i = (InterfaceC17306i) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], interfaceC17306i);
                    i10 |= 16;
                    break;
                case 5:
                    interfaceC17306i2 = (InterfaceC17306i) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], interfaceC17306i2);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2778N(i10, str, str2, c2862x0, c1032y1, interfaceC17306i, interfaceC17306i2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int i10 = 1;
        int i11 = 0;
        C2778N value = (C2778N) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C2774L c2774l = C2778N.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, new C22011h0(value.f8487a));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, new C21984a1(value.f8488b));
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C2858v0.f8628a, value.f8489c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C1020W1.f2828a, value.f8490d);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C2778N.f8486g;
        InterfaceC17306i interfaceC17306i = value.f8491e;
        if (zMo5565F || !AbstractC16544l.m18089b(interfaceC17306i, AbstractC9227W.m9800c(new C2776M(value, i10)))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], interfaceC17306i);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        InterfaceC17306i interfaceC17306i2 = value.f8492f;
        if (zMo5565F2 || !AbstractC16544l.m18089b(interfaceC17306i2, AbstractC9227W.m9800c(new C2776M(value, i11)))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], interfaceC17306i2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
