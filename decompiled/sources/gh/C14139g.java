package gh;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p072Ci.EnumC1711p;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: gh.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C14139g implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C14139g f44482a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C14139g c14139g = new C14139g();
        f44482a = c14139g;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.settings.ApiUserSettingsSettings", c14139g, 9);
        pluginGeneratedSerialDescriptor.m18453j("sunshine", true);
        pluginGeneratedSerialDescriptor.m18453j("memory_in_search", true);
        pluginGeneratedSerialDescriptor.m18453j("training_allowed", true);
        pluginGeneratedSerialDescriptor.m18453j("voice_training_allowed", true);
        pluginGeneratedSerialDescriptor.m18453j("video_training_allowed", true);
        pluginGeneratedSerialDescriptor.m18453j("voice_name", true);
        pluginGeneratedSerialDescriptor.m18453j("voice_main_language", true);
        pluginGeneratedSerialDescriptor.m18453j("voice_background_enabled", true);
        pluginGeneratedSerialDescriptor.m18453j("preferred_weather_unit", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C14141i.f44483j;
        C11164g c11164g = C11164g.f33804a;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(c11164g);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(c11164g);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11164g);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11164g);
        KSerializer kSerializerM10615b5 = AbstractC9961r4.m10615b(c11164g);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, kSerializerM10615b5, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11164g), AbstractC9961r4.m10615b(kSerializerArr[8])};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C14141i.f44483j;
        EnumC1711p enumC1711p = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        Boolean bool5 = null;
        String str = null;
        String str2 = null;
        Boolean bool6 = null;
        boolean z6 = true;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    bool = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
                    i10 |= 1;
                    break;
                case 1:
                    bool2 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool2);
                    i10 |= 2;
                    break;
                case 2:
                    bool3 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11164g.f33804a, bool3);
                    i10 |= 4;
                    break;
                case 3:
                    bool4 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool4);
                    i10 |= 8;
                    break;
                case 4:
                    bool5 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool5);
                    i10 |= 16;
                    break;
                case 5:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str);
                    i10 |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str2);
                    i10 |= 64;
                    break;
                case 7:
                    bool6 = (Boolean) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11164g.f33804a, bool6);
                    i10 |= 128;
                    break;
                case 8:
                    enumC1711p = (EnumC1711p) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 8, kSerializerArr[8], enumC1711p);
                    i10 |= 256;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C14141i(i10, bool, bool2, bool3, bool4, bool5, str, str2, bool6, enumC1711p);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C14141i value = (C14141i) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C14140h c14140h = C14141i.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool = value.f44484a;
        if (zMo5565F || bool != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C11164g.f33804a, bool);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool2 = value.f44485b;
        if (zMo5565F2 || bool2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11164g.f33804a, bool2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool3 = value.f44486c;
        if (zMo5565F3 || bool3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11164g.f33804a, bool3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool4 = value.f44487d;
        if (zMo5565F4 || bool4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11164g.f33804a, bool4);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool5 = value.f44488e;
        if (zMo5565F5 || bool5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11164g.f33804a, bool5);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f44489f;
        if (zMo5565F6 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11181o0.f33827a, str);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f44490g;
        if (zMo5565F7 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11181o0.f33827a, str2);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Boolean bool6 = value.f44491h;
        if (zMo5565F8 || bool6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11164g.f33804a, bool6);
        }
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 8, C14141i.f44483j[8], value.f44492i);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
