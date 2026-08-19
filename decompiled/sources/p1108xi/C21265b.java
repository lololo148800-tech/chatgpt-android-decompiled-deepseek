package p1108xi;

import ao.AbstractC11153a0;
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
import p774h1.C14365u;

/* JADX INFO: renamed from: xi.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C21265b implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21265b f67637a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21265b c21265b = new C21265b();
        f67637a = c21265b;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.syntaxhighlighting.CodeBlockMetadata", c21265b, 3);
        pluginGeneratedSerialDescriptor.m18453j("background", true);
        pluginGeneratedSerialDescriptor.m18453j("color", true);
        pluginGeneratedSerialDescriptor.m18453j("children", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21270g.f67643d;
        C21271h c21271h = C21271h.f67647a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c21271h), AbstractC9961r4.m10615b(c21271h), kSerializerArr[2]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21270g.f67643d;
        C14365u c14365u = null;
        boolean z6 = true;
        C14365u c14365u2 = null;
        List list = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c14365u = (C14365u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C21271h.f67647a, c14365u);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c14365u2 = (C14365u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21271h.f67647a, c14365u2);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21270g(i10, c14365u, c14365u2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21270g value = (C21270g) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C21266c c21266c = C21270g.Companion;
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C14365u c14365u = value.f67644a;
        if (zMo5565F || c14365u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C21271h.f67647a, c14365u);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C14365u c14365u2 = value.f67645b;
        if (zMo5565F2 || c14365u2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21271h.f67647a, c14365u2);
        }
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C21270g.f67643d[2], value.f67646c);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
