package p040Bd;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import bo.C11524l;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import no.AbstractC17708b;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0920F2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0920F2 f2658a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0920F2 c0920f2 = new C0920F2();
        f2658a = c0920f2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiJitPluginData.FromServer.JitBody", c0920f2, 6);
        pluginGeneratedSerialDescriptor.m18453j("domain", true);
        pluginGeneratedSerialDescriptor.m18453j("privacyPolicy", true);
        pluginGeneratedSerialDescriptor.m18453j("operation", false);
        pluginGeneratedSerialDescriptor.m18453j("params", true);
        pluginGeneratedSerialDescriptor.m18453j("files", true);
        pluginGeneratedSerialDescriptor.m18453j("actions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C1021W2.f2829g;
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C11524l.f34887a), AbstractC9961r4.m10615b(kSerializerArr[4]), kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1021W2.f2829g;
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        AbstractC16643b abstractC16643b = null;
        List list = null;
        List list2 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    abstractC16643b = (AbstractC16643b) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11524l.f34887a, abstractC16643b);
                    i10 |= 8;
                    break;
                case 4:
                    list = (List) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
                    i10 |= 16;
                    break;
                case 5:
                    list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1021W2(i10, str, str2, str3, abstractC16643b, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1021W2 value = (C1021W2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C1015V2 c1015v2 = C1021W2.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2830a;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11181o0.f33827a, str);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f2831b;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
        }
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, value.f2832c);
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        AbstractC16643b abstractC16643b = value.f2833d;
        if (zMo5565F3 || abstractC16643b != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11524l.f34887a, abstractC16643b);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C1021W2.f2829g;
        List list = value.f2834e;
        if (zMo5565F4 || list != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], list);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list2 = value.f2835f;
        if (zMo5565F5 || !AbstractC16544l.m18089b(list2, AbstractC17708b.m19421m(new C1009U2[0]))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], list2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
