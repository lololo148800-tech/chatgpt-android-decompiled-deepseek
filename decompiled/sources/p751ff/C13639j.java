package p751ff;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import bf.InterfaceC11374b0;
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

/* JADX INFO: renamed from: ff.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13639j implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13639j f43086a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C13639j c13639j = new C13639j();
        f43086a = c13639j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmoshome.impl.edit.SnorlaxEditState", c13639j, 5);
        pluginGeneratedSerialDescriptor.m18453j("snorlaxId", false);
        pluginGeneratedSerialDescriptor.m18453j("snorlax", true);
        pluginGeneratedSerialDescriptor.m18453j("newName", true);
        pluginGeneratedSerialDescriptor.m18453j("newInstructions", true);
        pluginGeneratedSerialDescriptor.m18453j("isSaving", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C13641l.f43087f[1]);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{C21928J0.f69475a, kSerializerM10615b, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), C11164g.f33804a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C13641l.f43087f;
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        String str = null;
        InterfaceC11374b0 interfaceC11374b0 = null;
        String str2 = null;
        String str3 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
                str = c21936l0 != null ? c21936l0.f69488a : null;
                i10 |= 1;
            } else if (iMo10914s == 1) {
                interfaceC11374b0 = (InterfaceC11374b0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], interfaceC11374b0);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
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
        return new C13641l(i10, str, interfaceC11374b0, str2, str3, zMo5481o);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13641l value = (C13641l) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C13640k c13640k = C13641l.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, new C21936L0(value.f43088a));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        InterfaceC11374b0 interfaceC11374b0 = value.f43089b;
        if (zMo5565F || interfaceC11374b0 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C13641l.f43087f[1], interfaceC11374b0);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f43090c;
        if (zMo5565F2 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f43091d;
        if (zMo5565F3 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str2);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f43092e;
        if (zMo5565F4 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
