package p193Hf;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Hf.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379l implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C3379l f10309a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C3379l c3379l = new C3379l();
        f10309a = c3379l;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreMessageFromWeb.Download", c3379l, 4);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("fileType", false);
        pluginGeneratedSerialDescriptor.m18453j("extension", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
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
                strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                strMo5483q4 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C3385n(i10, strMo5483q, strMo5483q2, strMo5483q3, strMo5483q4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C3385n value = (C3385n) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f10322a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f10323b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f10324c);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, value.f10325d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
