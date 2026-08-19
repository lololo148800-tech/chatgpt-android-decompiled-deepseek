package gf;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
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
import p909nm.C17689w;

/* JADX INFO: renamed from: gf.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C14128m implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C14128m f44466a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C14128m c14128m = new C14128m();
        f44466a = c14128m;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListState", c14128m, 4);
        pluginGeneratedSerialDescriptor.m18453j("list", true);
        pluginGeneratedSerialDescriptor.m18453j("isLoadingMore", true);
        pluginGeneratedSerialDescriptor.m18453j("cursor", true);
        pluginGeneratedSerialDescriptor.m18453j("newDialogOpen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C14130o.f44467e[0];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C11181o0.f33827a);
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{kSerializer, c11164g, kSerializerM10615b, c11164g};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C14130o.f44467e;
        String str = null;
        List list = null;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], list);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                zMo5481o2 = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C14130o(i10, str, list, zMo5481o, zMo5481o2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C14130o value = (C14130o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C14129n c14129n = C14130o.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f44468a;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C14130o.f44467e[0], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f44469b;
        if (zMo5565F2 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 1, z6);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f44470c;
        if (zMo5565F3 || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z10 = value.f44471d;
        if (zMo5565F4 || z10) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 3, z10);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
