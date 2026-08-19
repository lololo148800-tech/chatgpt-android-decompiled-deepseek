package p1155zi;

import ao.AbstractC11153a0;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Set;
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
import p909nm.C17691y;

/* JADX INFO: renamed from: zi.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C22018j implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22018j f69664a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C22018j c22018j = new C22018j();
        f69664a = c22018j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.Account", c22018j, 11);
        pluginGeneratedSerialDescriptor.m18453j("accountId", false);
        pluginGeneratedSerialDescriptor.m18453j("accountUserId", true);
        pluginGeneratedSerialDescriptor.m18453j("accountResidencyRegion", true);
        pluginGeneratedSerialDescriptor.m18453j("subscription", true);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, true);
        pluginGeneratedSerialDescriptor.m18453j("structure", true);
        pluginGeneratedSerialDescriptor.m18453j("features", true);
        pluginGeneratedSerialDescriptor.m18453j("planType", true);
        pluginGeneratedSerialDescriptor.m18453j("isDeactivated", true);
        pluginGeneratedSerialDescriptor.m18453j("profilePictureUrl", true);
        pluginGeneratedSerialDescriptor.m18453j("accessInfo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C22038o.f69704l;
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C22074x.f69789a);
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{C22042p.f69730a, kSerializerM10615b, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C21969V1.f69548a), AbstractC9961r4.m10615b(c11181o0), kSerializerArr[5], kSerializerArr[6], AbstractC9961r4.m10615b(kSerializerArr[7]), C11164g.f33804a, AbstractC9961r4.m10615b(c11181o0), kSerializerArr[10]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22038o.f69704l;
        AbstractC22014i abstractC22014i = null;
        String str = null;
        boolean z6 = true;
        EnumC21905D1 enumC21905D1 = null;
        int i10 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        C21975X1 c21975x1 = null;
        String str5 = null;
        EnumC22034n enumC22034n = null;
        Set set = null;
        boolean zMo5481o = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    continue;
                case 0:
                    C22050r c22050r = (C22050r) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C22042p.f69730a, str2 != null ? new C22050r(str2) : null);
                    i10 |= 1;
                    str2 = c22050r != null ? c22050r.f69739a : null;
                    break;
                case 1:
                    C22082z c22082z = (C22082z) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C22074x.f69789a, str3 != null ? new C22082z(str3) : null);
                    i10 |= 2;
                    str3 = c22082z != null ? c22082z.f69810a : null;
                    break;
                case 2:
                    str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str4);
                    i10 |= 4;
                    break;
                case 3:
                    c21975x1 = (C21975X1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C21969V1.f69548a, c21975x1);
                    i10 |= 8;
                    break;
                case 4:
                    str5 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str5);
                    i10 |= 16;
                    break;
                case 5:
                    enumC22034n = (EnumC22034n) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], enumC22034n);
                    i10 |= 32;
                    break;
                case 6:
                    set = (Set) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
                    i10 |= 64;
                    break;
                case 7:
                    enumC21905D1 = (EnumC21905D1) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], enumC21905D1);
                    i10 |= 128;
                    break;
                case 8:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(pluginGeneratedSerialDescriptor, 8);
                    i10 |= 256;
                    continue;
                case 9:
                    str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str);
                    i10 |= 512;
                    break;
                case 10:
                    abstractC22014i = (AbstractC22014i) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], abstractC22014i);
                    i10 |= 1024;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
            z6 = z6;
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22038o(i10, str2, str3, str4, c21975x1, str5, enumC22034n, set, enumC21905D1, zMo5481o, str, abstractC22014i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C22038o value = (C22038o) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C22022k c22022k = C22038o.Companion;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C22042p.f69730a, new C22050r(value.f69711a));
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f69712b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C22074x.f69789a, str != null ? new C22082z(str) : null);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f69713c;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C21975X1 c21975x1 = value.f69714d;
        if (zMo5565F3 || c21975x1 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C21969V1.f69548a, c21975x1);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f69715e;
        if (zMo5565F4 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str3);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22038o.f69704l;
        EnumC22034n enumC22034n = value.f69716f;
        if (zMo5565F5 || enumC22034n != EnumC22034n.f69698Z) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 5, kSerializerArr[5], enumC22034n);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Set set = value.f69717g;
        if (zMo5565F6 || !AbstractC16544l.m18089b(set, C17691y.f56482Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 6, kSerializerArr[6], set);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC21905D1 enumC21905D1 = value.f69718h;
        if (zMo5565F7 || enumC21905D1 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, kSerializerArr[7], enumC21905D1);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        boolean z6 = value.f69719i;
        if (zMo5565F8 || z6) {
            interfaceC10429bMo5570c.mo5583q(pluginGeneratedSerialDescriptor, 8, z6);
        }
        boolean zMo5565F9 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f69720j;
        if (zMo5565F9 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 9, C11181o0.f33827a, str4);
        }
        boolean zMo5565F10 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        AbstractC22014i abstractC22014i = value.f69721k;
        if (zMo5565F10 || !AbstractC16544l.m18089b(abstractC22014i, new C21998e(true))) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 10, kSerializerArr[10], abstractC22014i);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
