package p857kl;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11164g;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1045ul.C20385b;
import p1045ul.C20387d;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17690x;

/* JADX INFO: renamed from: kl.j */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16462j implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C16462j f51068a;
    private static final SerialDescriptor descriptor;

    static {
        C16462j c16462j = new C16462j();
        f51068a = c16462j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.http.Cookie", c16462j, 10);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.m18453j("value", false);
        pluginGeneratedSerialDescriptor.m18453j("encoding", true);
        pluginGeneratedSerialDescriptor.m18453j("maxAge", true);
        pluginGeneratedSerialDescriptor.m18453j("expires", true);
        pluginGeneratedSerialDescriptor.m18453j("domain", true);
        pluginGeneratedSerialDescriptor.m18453j("path", true);
        pluginGeneratedSerialDescriptor.m18453j("secure", true);
        pluginGeneratedSerialDescriptor.m18453j("httpOnly", true);
        pluginGeneratedSerialDescriptor.m18453j("extensions", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C16464l.f51069k;
        C11181o0 c11181o0 = C11181o0.f33827a;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializerM10615b = AbstractC9961r4.m10615b(C11135I.f33763a);
        KSerializer kSerializerM10615b2 = AbstractC9961r4.m10615b(C20385b.f64470a);
        KSerializer kSerializerM10615b3 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializerM10615b4 = AbstractC9961r4.m10615b(c11181o0);
        KSerializer kSerializer2 = kSerializerArr[9];
        C11164g c11164g = C11164g.f33804a;
        return new KSerializer[]{c11181o0, c11181o0, kSerializer, kSerializerM10615b, kSerializerM10615b2, kSerializerM10615b3, kSerializerM10615b4, c11164g, c11164g, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(serialDescriptor);
        KSerializer[] kSerializerArr = C16464l.f51069k;
        Map map = null;
        String strMo5483q = null;
        String strMo5483q2 = null;
        EnumC16465m enumC16465m = null;
        Integer num = null;
        C20387d c20387d = null;
        String str = null;
        String str2 = null;
        boolean z6 = true;
        int i10 = 0;
        boolean zMo5481o = false;
        boolean zMo5481o2 = false;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(serialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    enumC16465m = (EnumC16465m) interfaceC10428aMo5471c.mo5490y(serialDescriptor, 2, kSerializerArr[2], enumC16465m);
                    i10 |= 4;
                    break;
                case 3:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(serialDescriptor, 3, C11135I.f33763a, num);
                    i10 |= 8;
                    break;
                case 4:
                    c20387d = (C20387d) interfaceC10428aMo5471c.mo5486u(serialDescriptor, 4, C20385b.f64470a, c20387d);
                    i10 |= 16;
                    break;
                case 5:
                    str = (String) interfaceC10428aMo5471c.mo5486u(serialDescriptor, 5, C11181o0.f33827a, str);
                    i10 |= 32;
                    break;
                case 6:
                    str2 = (String) interfaceC10428aMo5471c.mo5486u(serialDescriptor, 6, C11181o0.f33827a, str2);
                    i10 |= 64;
                    break;
                case 7:
                    zMo5481o = interfaceC10428aMo5471c.mo5481o(serialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    zMo5481o2 = interfaceC10428aMo5471c.mo5481o(serialDescriptor, 8);
                    i10 |= 256;
                    break;
                case 9:
                    map = (Map) interfaceC10428aMo5471c.mo5490y(serialDescriptor, 9, kSerializerArr[9], map);
                    i10 |= 512;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(serialDescriptor);
        return new C16464l(i10, strMo5483q, strMo5483q2, enumC16465m, num, c20387d, str, str2, zMo5481o, zMo5481o2, map);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C16464l value = (C16464l) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(serialDescriptor);
        interfaceC10429bMo5570c.mo5584r(serialDescriptor, 0, value.f51070a);
        interfaceC10429bMo5570c.mo5584r(serialDescriptor, 1, value.f51071b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        KSerializer[] kSerializerArr = C16464l.f51069k;
        EnumC16465m enumC16465m = value.f51072c;
        if (zMo5565F || enumC16465m != EnumC16465m.f51081Z) {
            interfaceC10429bMo5570c.mo5575i(serialDescriptor, 2, kSerializerArr[2], enumC16465m);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Integer num = value.f51073d;
        if (zMo5565F2 || num != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 3, C11135I.f33763a, num);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        C20387d c20387d = value.f51074e;
        if (zMo5565F3 || c20387d != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 4, C20385b.f64470a, c20387d);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str = value.f51075f;
        if (zMo5565F4 || str != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 5, C11181o0.f33827a, str);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        String str2 = value.f51076g;
        if (zMo5565F5 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(serialDescriptor, 6, C11181o0.f33827a, str2);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        boolean z6 = value.f51077h;
        if (zMo5565F6 || z6) {
            interfaceC10429bMo5570c.mo5583q(serialDescriptor, 7, z6);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        boolean z10 = value.f51078i;
        if (zMo5565F7 || z10) {
            interfaceC10429bMo5570c.mo5583q(serialDescriptor, 8, z10);
        }
        boolean zMo5565F8 = interfaceC10429bMo5570c.mo5565F(serialDescriptor);
        Map map = value.f51079j;
        if (zMo5565F8 || !AbstractC16544l.m18089b(map, C17690x.f56481Y)) {
            interfaceC10429bMo5570c.mo5575i(serialDescriptor, 9, kSerializerArr[9], map);
        }
        interfaceC10429bMo5570c.mo5569b(serialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
