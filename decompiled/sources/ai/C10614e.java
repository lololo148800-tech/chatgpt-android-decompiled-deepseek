package ai;

import ao.AbstractC11153a0;
import ao.C11135I;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p211I8.lPE.sRXLFOsOgS;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: ai.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10614e implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10614e f31495a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C10619j.f31502i;
        KSerializer kSerializer = kSerializerArr[0];
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{kSerializer, AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(kSerializerArr[4]), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10619j.f31502i;
        EnumC10617h enumC10617h = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        EnumC10612c enumC10612c = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    enumC10617h = (EnumC10617h) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC10617h);
                    i10 |= 1;
                    break;
                case 1:
                    num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num);
                    i10 |= 2;
                    break;
                case 2:
                    num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11135I.f33763a, num2);
                    i10 |= 4;
                    break;
                case 3:
                    num3 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11135I.f33763a, num3);
                    i10 |= 8;
                    break;
                case 4:
                    enumC10612c = (EnumC10612c) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC10612c);
                    i10 |= 16;
                    break;
                case 5:
                    num4 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num4);
                    i10 |= 32;
                    break;
                case 6:
                    num5 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 6, C11135I.f33763a, num5);
                    i10 |= 64;
                    break;
                case 7:
                    num6 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 7, C11135I.f33763a, num6);
                    i10 |= 128;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C10619j(i10, enumC10617h, num, num2, num3, enumC10612c, num4, num5, num6);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C10619j value = (C10619j) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C10619j.f31502i;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f31503a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num = value.f31504b;
        if (zMo5565F || num != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num2 = value.f31505c;
        if (zMo5565F2 || num2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11135I.f33763a, num2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num3 = value.f31506d;
        if (zMo5565F3 || num3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11135I.f33763a, num3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        EnumC10612c enumC10612c = value.f31507e;
        if (zMo5565F4 || enumC10612c != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC10612c);
        }
        boolean zMo5565F5 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num4 = value.f31508f;
        if (zMo5565F5 || num4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 5, C11135I.f33763a, num4);
        }
        boolean zMo5565F6 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num5 = value.f31509g;
        if (zMo5565F6 || num5 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 6, C11135I.f33763a, num5);
        }
        boolean zMo5565F7 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Integer num6 = value.f31510h;
        if (zMo5565F7 || num6 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 7, C11135I.f33763a, num6);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    static {
        C10614e c10614e = new C10614e();
        f31495a = c10614e;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.platform.datetime.ScheduleComponents", c10614e, 8);
        pluginGeneratedSerialDescriptor.m18453j("frequency", false);
        pluginGeneratedSerialDescriptor.m18453j("byHour", true);
        pluginGeneratedSerialDescriptor.m18453j("byMinute", true);
        pluginGeneratedSerialDescriptor.m18453j(sRXLFOsOgS.tOBJy, true);
        pluginGeneratedSerialDescriptor.m18453j("byDay", true);
        pluginGeneratedSerialDescriptor.m18453j("byMonthDay", true);
        pluginGeneratedSerialDescriptor.m18453j("byYearDay", true);
        pluginGeneratedSerialDescriptor.m18453j("byMonth", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }
}
