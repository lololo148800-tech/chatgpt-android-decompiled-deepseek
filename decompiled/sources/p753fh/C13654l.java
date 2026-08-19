package p753fh;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C22042p;
import p1155zi.C22050r;
import p1155zi.C22074x;
import p1155zi.C22082z;
import p315Me.Myis.CxcULo;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: fh.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C13654l implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C13654l f43120a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C22074x.f69789a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{kSerializerM10615b, C22042p.f69730a, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), c11181o0, c11181o0, C11164g.f33804a, AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String str5 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    C22082z c22082z = (C22082z) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C22074x.f69789a, str != null ? new C22082z(str) : null);
                    str = c22082z != null ? c22082z.f69810a : null;
                    i10 |= 1;
                    break;
                case 1:
                    C22050r c22050r = (C22050r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, C22042p.f69730a, str2 != null ? new C22050r(str2) : null);
                    str2 = c22050r != null ? c22050r.f69739a : null;
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 6);
                    i10 |= 64;
                    break;
                case 7:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11181o0.f33827a, str5);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C13656n(i10, str, str2, str3, str4, strMo5483q, strMo5483q2, zMo5481o, str5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003b  */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C13656n value = (C13656n) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C13655m c13655m = C13656n.Companion;
        C22074x c22074x = C22074x.f69789a;
        String str = value.f43122a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c22074x, str != null ? new C22082z(str) : null);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f43123b;
        if (zMo5565F) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C22042p.f69730a, new C22050r(str2));
        } else {
            C22050r.Companion.getClass();
            if (!AbstractC16544l.m18089b(str2, "default")) {
                interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, C22042p.f69730a, new C22050r(str2));
            }
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f43124c;
        if (zMo5565F2 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
        }
        C11181o0 c11181o0 = C11181o0.f33827a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, c11181o0, value.f43125d);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 4, value.f43126e);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, value.f43127f);
        interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 6, value.f43128g);
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f43129h;
        if (zMo5565F3 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, c11181o0, str4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C13654l c13654l = new C13654l();
        f43120a = c13654l;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.user.impl.api.account.AccountStatusResponseAccount", c13654l, 8);
        pluginGeneratedSerialDescriptor.m18453j("accountUserId", false);
        pluginGeneratedSerialDescriptor.m18453j(CxcULo.BBG, true);
        pluginGeneratedSerialDescriptor.m18453j("accountResidencyRegion", true);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("structure", false);
        pluginGeneratedSerialDescriptor.m18453j("planType", false);
        pluginGeneratedSerialDescriptor.m18453j("isDeactivated", false);
        pluginGeneratedSerialDescriptor.m18453j("profilePictureUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
