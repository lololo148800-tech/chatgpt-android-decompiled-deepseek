package p598Ye;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1053v3.p1054lN.IGDwkYw;
import p245Jh.C4358p;
import p245Jh.C4360r;
import p548Wd.p549VF.zakks;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: Ye.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C10045p implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10045p f29759a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C10045p c10045p = new C10045p();
        f29759a = c10045p;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.impl.api.ApiSnorlaxResource", c10045p, 3);
        pluginGeneratedSerialDescriptor.m18453j("gizmo", false);
        pluginGeneratedSerialDescriptor.m18453j("files", true);
        pluginGeneratedSerialDescriptor.m18453j("productFeatures", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C10030a.f29726a, C10047r.f29760d[1], AbstractC9961r4.m10615b(C4358p.f14179a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10047r.f29760d;
        C10044o c10044o = null;
        boolean z6 = true;
        List list = null;
        C4360r c4360r = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c10044o = (C10044o) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C10030a.f29726a, c10044o);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c4360r = (C4360r) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C4358p.f14179a, c4360r);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10047r(i10, c10044o, list, c4360r);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10047r c10047r = (C10047r) obj;
        AbstractC16544l.m18094g(encoder, zakks.QPwyeBNoFEK);
        AbstractC16544l.m18094g(c10047r, IGDwkYw.cDmRC);
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C10046q c10046q = C10047r.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C10030a.f29726a, c10047r.f29761a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = c10047r.f29762b;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C10047r.f29760d[1], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C4360r c4360r = c10047r.f29763c;
        if (zMo5565F2 || c4360r != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C4358p.f14179a, c4360r);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }
}
