package p1105xc;

import ao.AbstractC11153a0;
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
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: xc.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C21174d implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21174d f67313a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21174d c21174d = new C21174d();
        f67313a = c21174d;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.analytics.statsc.Histogram", c21174d, 4);
        pluginGeneratedSerialDescriptor.m18453j("namespace", false);
        pluginGeneratedSerialDescriptor.m18453j("metric", false);
        pluginGeneratedSerialDescriptor.m18453j("tags", false);
        pluginGeneratedSerialDescriptor.m18453j("values", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C21176f.f67314e;
        return new KSerializer[]{kSerializerArr[0], C11181o0.f33827a, kSerializerArr[2], kSerializerArr[3]};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21176f.f67314e;
        EnumC21180j enumC21180j = null;
        String strMo5483q = null;
        List list = null;
        List list2 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                enumC21180j = (EnumC21180j) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC21180j);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                list2 = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], list2);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21176f(i10, enumC21180j, strMo5483q, list, list2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21176f value = (C21176f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C21176f.f67314e;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f67315a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f67316b);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f67317c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], value.f67318d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
