package p040Bd;

import androidx.glance.appwidget.protobuf.C11043g0;
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
import p324Mn.C5551u;
import p483Th.C7470a;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Bd.Z3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1040Z3 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1040Z3 f2867a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C1040Z3 c1040z3 = new C1040Z3();
        f2867a = c1040z3;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.api.message.ApiSearchResult", c1040z3, 5);
        pluginGeneratedSerialDescriptor.m18453j("url", false);
        pluginGeneratedSerialDescriptor.m18453j(UiComponentConfig.Title.type, true);
        pluginGeneratedSerialDescriptor.m18453j("snippet", true);
        pluginGeneratedSerialDescriptor.m18453j("pubDate", true);
        pluginGeneratedSerialDescriptor.m18453j("contentAttributionUrl", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(C7470a.f23726a), AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        int i10 = 0;
        C5551u c5551u = null;
        String strMo5483q = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                str = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                c5551u = (C5551u) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C7470a.f23726a, c5551u);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str3);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C1054b4(i10, c5551u, strMo5483q, str, str2, str3);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1054b4 value = (C1054b4) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        String str = value.f2883a;
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, str);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f2884b;
        if (zMo5565F || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C11181o0.f33827a, str2);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f2885c;
        if (zMo5565F2 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str3);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C5551u c5551u = value.f2886d;
        if (zMo5565F3 || c5551u != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C7470a.f23726a, c5551u);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f2887e;
        if (zMo5565F4 || !AbstractC16544l.m18089b(str4, C11043g0.m12021a(str))) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
