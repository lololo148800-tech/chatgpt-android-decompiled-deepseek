package p1155zi;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: zi.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22023k0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22023k0 f69666a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C22023k0 c22023k0 = new C22023k0();
        f69666a = c22023k0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gizmo_interaction", c22023k0, 1);
        pluginGeneratedSerialDescriptor.m18453j("gizmoId", false);
        C22019j0 c22019j0 = new C22019j0();
        if (pluginGeneratedSerialDescriptor.f53324g == null) {
            pluginGeneratedSerialDescriptor.f53324g = new ArrayList(1);
        }
        ArrayList arrayList = pluginGeneratedSerialDescriptor.f53324g;
        AbstractC16544l.m18091d(arrayList);
        arrayList.add(c22019j0);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C21928J0.f69475a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else {
                if (iMo10914s != 0) {
                    throw new C8981m(iMo10914s);
                }
                C21936L0 c21936l0 = (C21936L0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, str != null ? new C21936L0(str) : null);
                str = c21936l0 != null ? c21936l0.f69488a : null;
                i10 = 1;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22031m0(i10, str);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22031m0 value = (C22031m0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C22027l0 c22027l0 = C22031m0.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C21928J0.f69475a, new C21936L0(value.f69690b));
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
