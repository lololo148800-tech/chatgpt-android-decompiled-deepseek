package p947pd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: pd.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18368h implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C18368h f58641a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C18368h c18368h = new C18368h();
        f58641a = c18368h;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.compliance.impl.api.ComplianceResponse", c18368h, 1);
        pluginGeneratedSerialDescriptor.m18453j("termsOfUse", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C18374n.f58647a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C18376p c18376p = null;
        boolean z6 = true;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else {
                if (iMo10914s != 0) {
                    throw new C8981m(iMo10914s);
                }
                c18376p = (C18376p) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, C18374n.f58647a, c18376p);
                i10 = 1;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C18370j(i10, c18376p);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C18370j value = (C18370j) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C18376p c18376p = value.f58642a;
        if (zMo5565F || !AbstractC16544l.m18089b(c18376p, new C18376p())) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, C18374n.f58647a, c18376p);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
