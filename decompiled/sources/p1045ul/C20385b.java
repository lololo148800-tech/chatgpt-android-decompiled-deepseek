package p1045ul;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.C11141O;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ul.b */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C20385b implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C20385b f64470a;
    private static final SerialDescriptor descriptor;

    static {
        C20385b c20385b = new C20385b();
        f64470a = c20385b;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.ktor.util.date.GMTDate", c20385b, 9);
        pluginGeneratedSerialDescriptor.m18453j("seconds", false);
        pluginGeneratedSerialDescriptor.m18453j("minutes", false);
        pluginGeneratedSerialDescriptor.m18453j("hours", false);
        pluginGeneratedSerialDescriptor.m18453j("dayOfWeek", false);
        pluginGeneratedSerialDescriptor.m18453j("dayOfMonth", false);
        pluginGeneratedSerialDescriptor.m18453j("dayOfYear", false);
        pluginGeneratedSerialDescriptor.m18453j("month", false);
        pluginGeneratedSerialDescriptor.m18453j("year", false);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.TIMESTAMP_KEY, false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C20387d.f64471v0;
        KSerializer kSerializer = kSerializerArr[3];
        KSerializer kSerializer2 = kSerializerArr[6];
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{c11135i, c11135i, c11135i, kSerializer, c11135i, c11135i, kSerializer2, c11135i, C11141O.f33773a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(serialDescriptor);
        KSerializer[] kSerializerArr = C20387d.f64471v0;
        EnumC20389f enumC20389f = null;
        int i10 = 0;
        int iMo5478l = 0;
        int iMo5478l2 = 0;
        int iMo5478l3 = 0;
        int iMo5478l4 = 0;
        int iMo5478l5 = 0;
        int iMo5478l6 = 0;
        EnumC20390g enumC20390g = null;
        long jMo5476i = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(serialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    iMo5478l2 = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    iMo5478l3 = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    enumC20390g = (EnumC20390g) interfaceC10428aMo5471c.mo5490y(serialDescriptor, 3, kSerializerArr[3], enumC20390g);
                    i10 |= 8;
                    break;
                case 4:
                    iMo5478l4 = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 4);
                    i10 |= 16;
                    break;
                case 5:
                    iMo5478l5 = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    enumC20389f = (EnumC20389f) interfaceC10428aMo5471c.mo5490y(serialDescriptor, 6, kSerializerArr[6], enumC20389f);
                    i10 |= 64;
                    break;
                case 7:
                    iMo5478l6 = interfaceC10428aMo5471c.mo5478l(serialDescriptor, 7);
                    i10 |= 128;
                    break;
                case 8:
                    jMo5476i = interfaceC10428aMo5471c.mo5476i(serialDescriptor, 8);
                    i10 |= 256;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(serialDescriptor);
        return new C20387d(i10, iMo5478l, iMo5478l2, iMo5478l3, enumC20390g, iMo5478l4, iMo5478l5, enumC20389f, iMo5478l6, jMo5476i);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C20387d value = (C20387d) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(serialDescriptor);
        interfaceC10429bMo5570c.mo5579m(0, value.f64472Y, serialDescriptor);
        interfaceC10429bMo5570c.mo5579m(1, value.f64473Z, serialDescriptor);
        interfaceC10429bMo5570c.mo5579m(2, value.f64474o0, serialDescriptor);
        KSerializer[] kSerializerArr = C20387d.f64471v0;
        interfaceC10429bMo5570c.mo5575i(serialDescriptor, 3, kSerializerArr[3], value.f64475p0);
        interfaceC10429bMo5570c.mo5579m(4, value.f64476q0, serialDescriptor);
        interfaceC10429bMo5570c.mo5579m(5, value.f64477r0, serialDescriptor);
        interfaceC10429bMo5570c.mo5575i(serialDescriptor, 6, kSerializerArr[6], value.f64478s0);
        interfaceC10429bMo5570c.mo5579m(7, value.f64479t0, serialDescriptor);
        interfaceC10429bMo5570c.mo5564E(serialDescriptor, 8, value.f64480u0);
        interfaceC10429bMo5570c.mo5569b(serialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
