package p1108xi;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11158d;
import ao.C11181o0;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1053v3.p1054lN.IGDwkYw;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p774h1.C14365u;

/* JADX INFO: renamed from: xi.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21267d implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21267d f67638a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11181o0.f33827a, AbstractC9961r4.m10615b(C21271h.f67647a), AbstractC9961r4.m10615b(C11135I.f33763a), new C11158d(f67638a, 0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C21267d c21267d = f67638a;
        String strMo5483q = null;
        C14365u c14365u = null;
        Integer num = null;
        List list = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c14365u = (C14365u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21271h.f67647a, c14365u);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11135I.f33763a, num);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, new C11158d(c21267d, 0), list);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21269f(i10, strMo5483q, c14365u, num, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21269f value = (C21269f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f67639a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C14365u c14365u = value.f67640b;
        if (zMo5565F || c14365u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21271h.f67647a, c14365u);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f67641c;
        if (zMo5565F2 || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11135I.f33763a, num);
        }
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, new C11158d(f67638a, 0), value.f67642d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C21267d c21267d = new C21267d();
        f67638a = c21267d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.syntaxhighlighting.CodeBlockMetadata.Node", c21267d, 4);
        pluginGeneratedSerialDescriptor.m18453j("value", false);
        pluginGeneratedSerialDescriptor.m18453j("color", true);
        pluginGeneratedSerialDescriptor.m18453j("fontWeight", true);
        pluginGeneratedSerialDescriptor.m18453j(IGDwkYw.zIohoBaBvi, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
