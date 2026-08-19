package p1126yd;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p067Cd.C1627a;
import p067Cd.C1629c;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: yd.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C21435P implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21435P f68005a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21435P c21435p = new C21435P();
        f68005a = c21435p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.conversation.ConversationStreamModerationResponse", c21435p, 4);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", false);
        pluginGeneratedSerialDescriptor.m18453j("messageId", false);
        pluginGeneratedSerialDescriptor.m18453j("isCompletion", false);
        pluginGeneratedSerialDescriptor.m18453j("moderationResponse", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C22003f0.f69641a, C21977Y0.f69577a, C11164g.f33804a, C1627a.f4615a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        String str = null;
        String str2 = null;
        C1629c c1629c = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, str != null ? new C22011h0(str) : null);
                str = c22011h0 != null ? c22011h0.f69652a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                i10 |= 2;
            } else if (iMo10914s == 2) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                c1629c = (C1629c) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C1627a.f4615a, c1629c);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21440S(i10, str, str2, zMo5481o, c1629c);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21440S value = (C21440S) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22003f0.f69641a, new C22011h0(value.f68008a));
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C21977Y0.f69577a, new C21984a1(value.f68009b));
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, value.f68010c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C1627a.f4615a, value.f68011d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
