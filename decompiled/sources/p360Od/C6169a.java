package p360Od;

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
import p403Qd.EnumC6606L;
import p559Wn.C8981m;
import p575Xd.C9445d;
import p575Xd.C9463v;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Od.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6169a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C6169a f20084a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C6169a c6169a = new C6169a();
        f20084a = c6169a;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.actions.CustomAction", c6169a, 5);
        pluginGeneratedSerialDescriptor.m18453j("details", false);
        pluginGeneratedSerialDescriptor.m18453j("toolRole", false);
        pluginGeneratedSerialDescriptor.m18453j("actionState", true);
        pluginGeneratedSerialDescriptor.m18453j("toolStatus", true);
        pluginGeneratedSerialDescriptor.m18453j("isLocal", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6172d.f20090f;
        return new KSerializer[]{C9445d.f28448a, AbstractC9961r4.m10615b(C11181o0.f33827a), kSerializerArr[2], kSerializerArr[3], C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6172d.f20090f;
        C9463v c9463v = null;
        String str = null;
        EnumC6170b enumC6170b = null;
        EnumC6606L enumC6606L = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c9463v = (C9463v) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C9445d.f28448a, c9463v);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                enumC6170b = (EnumC6170b) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC6170b);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                enumC6606L = (EnumC6606L) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], enumC6606L);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6172d(i10, c9463v, str, enumC6170b, enumC6606L, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6172d value = (C6172d) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C6171c c6171c = C6172d.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C9445d.f28448a, value.f20091a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, value.f20092b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6172d.f20090f;
        EnumC6170b enumC6170b = value.f20093c;
        if (zMo5565F || enumC6170b != EnumC6170b.f20088p0) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], enumC6170b);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC6606L enumC6606L = value.f20094d;
        if (zMo5565F2 || enumC6606L != EnumC6606L.f21327Y) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], enumC6606L);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f20095e;
        if (zMo5565F3 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
