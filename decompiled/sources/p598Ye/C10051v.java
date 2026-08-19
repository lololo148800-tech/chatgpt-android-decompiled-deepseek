package p598Ye;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Ye.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C10051v implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10051v f29766a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10051v c10051v = new C10051v();
        f29766a = c10051v;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiSnorlaxUpsertRequest.Sharing.Capabilities", c10051v, 6);
        pluginGeneratedSerialDescriptor.m18453j("canRead", true);
        pluginGeneratedSerialDescriptor.m18453j("canViewConfig", true);
        pluginGeneratedSerialDescriptor.m18453j("canWrite", true);
        pluginGeneratedSerialDescriptor.m18453j("canDelete", true);
        pluginGeneratedSerialDescriptor.m18453j("canExport", true);
        pluginGeneratedSerialDescriptor.m18453j("canShare", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11164g, c11164g, c11164g, c11164g, c11164g, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean zMo5481o3 = false;
        boolean zMo5481o4 = false;
        boolean zMo5481o5 = false;
        boolean zMo5481o6 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    zMo5481o3 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    zMo5481o4 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    zMo5481o5 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    zMo5481o6 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10053x(i10, zMo5481o, zMo5481o2, zMo5481o3, zMo5481o4, zMo5481o5, zMo5481o6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10053x value = (C10053x) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f29767a;
        if (zMo5565F || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 0, z6);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f29768b;
        if (zMo5565F2 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, z10);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z11 = value.f29769c;
        if (zMo5565F3 || z11) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 2, z11);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z12 = value.f29770d;
        if (zMo5565F4 || z12) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, z12);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z13 = value.f29771e;
        if (zMo5565F5 || z13) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 4, z13);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z14 = value.f29772f;
        if (zMo5565F6 || z14) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 5, z14);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
