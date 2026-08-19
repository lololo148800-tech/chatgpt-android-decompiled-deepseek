package sg;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p1155zi.C21960S1;
import p1155zi.C21966U1;
import p1155zi.C22003f0;
import p1155zi.C22011h0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: sg.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C19573o implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C19573o f62161a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C19573o c19573o = new C19573o();
        f62161a = c19573o;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.reporting.ReportContentId", c19573o, 3);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", true);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("sharedConversationId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C21928J0.f69475a), AbstractC9961r4.m10615b(C22003f0.f69641a), AbstractC9961r4.m10615b(C21960S1.f69525a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
                str = c21936l0 != null ? c21936l0.f69488a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C22011h0 c22011h0 = (C22011h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C22003f0.f69641a, str2 != null ? new C22011h0(str2) : null);
                str2 = c22011h0 != null ? c22011h0.f69652a : null;
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                C21966U1 c21966u1 = (C21966U1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C21960S1.f69525a, str3 != null ? new C21966U1(str3) : null);
                str3 = c21966u1 != null ? c21966u1.f69541a : null;
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C19575q(i10, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C19575q value = (C19575q) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f62162a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f62163b;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C22003f0.f69641a, str2 != null ? new C22011h0(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f62164c;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C21960S1.f69525a, str3 != null ? new C21966U1(str3) : null);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
