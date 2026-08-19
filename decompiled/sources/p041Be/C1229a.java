package p041Be;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21928J0;
import p1155zi.C21936L0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Be.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1229a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1229a f3241a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1229a c1229a = new C1229a();
        f3241a = c1229a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.conversation.ConversationInitStateRequest", c1229a, 3);
        pluginGeneratedSerialDescriptor.m18453j("conversationId", true);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", true);
        pluginGeneratedSerialDescriptor.m18453j("requestedDefaultModel", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C21928J0.f69475a), AbstractC9961r4.m10615b(c11181o0)};
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
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21928J0.f69475a, str2 != null ? new C21936L0(str2) : null);
                str2 = c21936l0 != null ? c21936l0.f69488a : null;
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1231c(i10, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1231c value = (C1231c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f3242a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f3243b;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21928J0.f69475a, str2 != null ? new C21936L0(str2) : null);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f3244c;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
