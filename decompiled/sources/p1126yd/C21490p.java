package p1126yd;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p040Bd.C1020W1;
import p040Bd.C1032Y1;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: yd.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C21490p implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21490p f68101a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21490p c21490p = new C21490p();
        f68101a = c21490p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationResponseNode", c21490p, 4);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("parent", true);
        pluginGeneratedSerialDescriptor.m18453j("children", false);
        pluginGeneratedSerialDescriptor.m18453j("message", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21494r.f68103e;
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        return new KSerializer[]{c21977y0, AbstractC9961r4.m10615b(c21977y0), kSerializerArr[2], AbstractC9961r4.m10615b(C1020W1.f2828a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21494r.f68103e;
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        C1032Y1 c1032y1 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21977Y0.f69577a, str != null ? new C21984a1(str) : null);
                str = c21984a1 != null ? c21984a1.f69607Y : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C21984a1 c21984a2 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                str2 = c21984a2 != null ? c21984a2.f69607Y : null;
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                c1032y1 = (C1032Y1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C1020W1.f2828a, c1032y1);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21494r(i10, str, str2, list, c1032y1);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21494r value = (C21494r) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C21492q c21492q = C21494r.Companion;
        C21977Y0 c21977y0 = C21977Y0.f69577a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, c21977y0, new C21984a1(value.f68104a));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f68105b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c21977y0, str != null ? new C21984a1(str) : null);
        }
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C21494r.f68103e[2], value.f68106c);
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C1032Y1 c1032y1 = value.f68107d;
        if (zMo5565F2 || c1032y1 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C1020W1.f2828a, c1032y1);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
