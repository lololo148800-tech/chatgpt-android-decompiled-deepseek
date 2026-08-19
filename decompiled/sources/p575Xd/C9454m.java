package p575Xd;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21977Y0;
import p1155zi.C21984a1;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: Xd.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C9454m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C9454m f28463a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C9454m c9454m = new C9454m();
        f28463a = c9454m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.metadata.CustomActionCall.Action.DenyAction", c9454m, 3);
        pluginGeneratedSerialDescriptor.m18453j("actionType", true);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, true);
        pluginGeneratedSerialDescriptor.m18453j("targetMessageId", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbstractC9961r4.m10615b(C11181o0.f33827a), C9457p.f28468d[1], AbstractC9961r4.m10615b(C21977Y0.f69577a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C9457p value = (C9457p) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C9456o c9456o = C9457p.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f28469a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC9455n enumC9455n = value.f28470b;
        if (zMo5565F2 || enumC9455n != EnumC9455n.f28465Z) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C9457p.f28468d[1], enumC9455n);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f28471c;
        if (zMo5565F3 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, MMVKXkcLpuHFDi.HmhFgzXlgJK);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C9457p.f28468d;
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        EnumC9455n enumC9455n = null;
        String str2 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                enumC9455n = (EnumC9455n) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC9455n);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                C21984a1 c21984a1 = (C21984a1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C21977Y0.f69577a, str2 != null ? new C21984a1(str2) : null);
                str2 = c21984a1 != null ? c21984a1.f69607Y : null;
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C9457p(i10, str, enumC9455n, str2);
    }
}
