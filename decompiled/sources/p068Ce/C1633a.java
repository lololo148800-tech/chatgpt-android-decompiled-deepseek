package p068Ce;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Ce.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C1633a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1633a f4626a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1633a c1633a = new C1633a();
        f4626a = c1633a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.tangled.impl.api.share.ApiUpdateSharedConversationRequest", c1633a, 4);
        pluginGeneratedSerialDescriptor.m18453j("isAnonymous", false);
        pluginGeneratedSerialDescriptor.m18453j("isPublic", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("previewAssetPointer", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11164g c11164g = C11164g.f33804a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11164g);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11164g);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                bool2 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool2);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str2);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1635c(i10, bool, bool2, str, str2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1635c value = (C1635c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C11164g c11164g = C11164g.f33804a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11164g, value.f4627a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11164g, value.f4628b);
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, c11181o0, value.f4629c);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f4630d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
