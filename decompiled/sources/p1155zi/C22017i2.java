package p1155zi;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1053v3.p1054lN.IGDwkYw;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;
import p909nm.C17690x;

/* JADX INFO: renamed from: zi.i2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22017i2 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22017i2 f69663a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C22017i2 c22017i2 = new C22017i2();
        f69663a = c22017i2;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.VoiceDisabledMessage", c22017i2, 4);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("descriptionMarkdown", false);
        pluginGeneratedSerialDescriptor.m18453j("buttons", true);
        pluginGeneratedSerialDescriptor.m18453j("analyticsProperties", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C22025k2.f69672e;
        KSerializer kSerializer = kSerializerArr[2];
        KSerializer kSerializer2 = kSerializerArr[3];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, kSerializer, kSerializer2};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22025k2.f69672e;
        String strMo5483q = null;
        String strMo5483q2 = null;
        List list = null;
        Map map = null;
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
                strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C22025k2(i10, strMo5483q, strMo5483q2, list, map);
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
        C22025k2 value = (C22025k2) obj;
        AbstractC16544l.m18094g(encoder, IGDwkYw.VaIXlofwZdLa);
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f69673a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f69674b);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C22025k2.f69672e;
        List list = value.f69675c;
        if (zMo5565F || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], list);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Map map = value.f69676d;
        if (zMo5565F2 || !AbstractC16544l.m18089b(map, C17690x.f56481Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, kSerializerArr[3], map);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }
}
