package p040Bd;

import ao.AbstractC11153a0;
import ao.C11135I;
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

/* JADX INFO: renamed from: Bd.J */
/* JADX INFO: loaded from: classes3.dex */
public final class C0941J implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0941J f2705a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C0941J c0941j = new C0941J();
        f2705a = c0941j;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiContentReference.FileNavList", c0941j, 4);
        pluginGeneratedSerialDescriptor.m18453j("startIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("endIdx", false);
        pluginGeneratedSerialDescriptor.m18453j("items", true);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C0971O.f2744e;
        C11135I c11135i = C11135I.f33763a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c11135i), AbstractC9961r4.m10615b(c11135i), kSerializerArr[2], C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C0971O.f2744e;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        String strMo5483q = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                num = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C11135I.f33763a, num);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                num2 = (Integer) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11135I.f33763a, num2);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C0971O(i10, num, num2, list, strMo5483q);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C0971O value = (C0971O) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        C0947K c0947k = C0971O.Companion;
        C11135I c11135i = C11135I.f33763a;
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, c11135i, value.f2745a);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, c11135i, value.f2746b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f2747c;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, C0971O.f2744e[2], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f2748d;
        if (zMo5565F2 || !AbstractC16544l.m18089b(str, "file_navlist")) {
            interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, str);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
