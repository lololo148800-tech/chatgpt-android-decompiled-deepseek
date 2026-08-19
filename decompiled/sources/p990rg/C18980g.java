package p990rg;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
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

/* JADX INFO: renamed from: rg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C18980g implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C18980g f60540a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C18980g c18980g = new C18980g();
        f60540a = c18980g;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.prompts.model.CustomPrompts.Prompt", c18980g, 6);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, false);
        pluginGeneratedSerialDescriptor.m18453j("description", false);
        pluginGeneratedSerialDescriptor.m18453j("oneliner", false);
        pluginGeneratedSerialDescriptor.m18453j(SDPKeywords.PROMPT, false);
        pluginGeneratedSerialDescriptor.m18453j("category", false);
        pluginGeneratedSerialDescriptor.m18453j("theme", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = C18982i.f60541g[4];
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, c11181o0, c11181o0, c11181o0, kSerializer, c11181o0};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C18982i.f60541g;
        int i10 = 0;
        String strMo5483q = null;
        String strMo5483q2 = null;
        String strMo5483q3 = null;
        String strMo5483q4 = null;
        EnumC18976c enumC18976c = null;
        String strMo5483q5 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            switch (iMo10914s) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    strMo5483q2 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    strMo5483q3 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    strMo5483q4 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    enumC18976c = (EnumC18976c) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 4, kSerializerArr[4], enumC18976c);
                    i10 |= 16;
                    break;
                case 5:
                    strMo5483q5 = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 5);
                    i10 |= 32;
                    break;
                default:
                    throw new C8981m(iMo10914s);
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C18982i(i10, strMo5483q, strMo5483q2, strMo5483q3, strMo5483q4, enumC18976c, strMo5483q5);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C18982i value = (C18982i) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f60542a);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 1, value.f60543b);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 2, value.f60544c);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 3, value.f60545d);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 4, C18982i.f60541g[4], value.f60546e);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 5, value.f60547f);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
