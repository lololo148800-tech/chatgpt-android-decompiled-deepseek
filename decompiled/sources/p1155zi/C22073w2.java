package p1155zi;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
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

/* JADX INFO: renamed from: zi.w2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22073w2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22073w2 f69788a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C22073w2 c22073w2 = new C22073w2();
        f69788a = c22073w2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.VoiceModeMetadata", c22073w2, 8);
        pluginGeneratedSerialDescriptor.m18453j("defaultModelSlug", false);
        pluginGeneratedSerialDescriptor.m18453j("mode", false);
        pluginGeneratedSerialDescriptor.m18453j("disabledModeMetadata", false);
        pluginGeneratedSerialDescriptor.m18453j("disclosureMessage", false);
        pluginGeneratedSerialDescriptor.m18453j("infoMessage", false);
        pluginGeneratedSerialDescriptor.m18453j("displayName", false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("features", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C22081y2.f69801i[1];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C22037n2.f69703a);
        C22049q2 c22049q2 = C22049q2.f69738a;
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c22049q2);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c22049q2);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(C22061t2.f69760a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, kSerializer, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, c11181o0, c11181o0, kSerializerM10615b4};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22081y2.f69801i;
        String strMo5483q = null;
        EnumC22033m2 enumC22033m2 = null;
        C22045p2 c22045p2 = null;
        C22057s2 c22057s2 = null;
        C22057s2 c22057s3 = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        C22069v2 c22069v2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    enumC22033m2 = (EnumC22033m2) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], enumC22033m2);
                    i10 |= 2;
                    break;
                case 2:
                    c22045p2 = (C22045p2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C22037n2.f69703a, c22045p2);
                    i10 |= 4;
                    break;
                case 3:
                    c22057s2 = (C22057s2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C22049q2.f69738a, c22057s2);
                    i10 |= 8;
                    break;
                case 4:
                    c22057s3 = (C22057s2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C22049q2.f69738a, c22057s3);
                    i10 |= 16;
                    break;
                case 5:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                case 7:
                    c22069v2 = (C22069v2) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C22061t2.f69760a, c22069v2);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22081y2(i10, strMo5483q, enumC22033m2, c22045p2, c22057s2, c22057s3, strMo5483q2, strMo5483q3, c22069v2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22081y2 value = (C22081y2) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f69802a);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C22081y2.f69801i[1], value.f69803b);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C22037n2.f69703a, value.f69804c);
        C22049q2 c22049q2 = C22049q2.f69738a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c22049q2, value.f69805d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, c22049q2, value.f69806e);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, value.f69807f);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 6, value.f69808g);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C22069v2 c22069v2 = value.f69809h;
        if (zMo5565F || c22069v2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C22061t2.f69760a, c22069v2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
