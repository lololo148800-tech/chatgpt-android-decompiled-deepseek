package bf;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p1155zi.C21912F0;
import p1155zi.C21920H0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: bf.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C11375c implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C11375c f34380a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C11375c c11375c = new C11375c();
        f34380a = c11375c;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.gizmos.model.Gizmo.GizmoFile", c11375c, 5);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("fileId", true);
        pluginGeneratedSerialDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, true);
        pluginGeneratedSerialDescriptor.m18453j("type", true);
        pluginGeneratedSerialDescriptor.m18453j("location", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11181o0 c11181o0 = C11181o0.f33827a;
        return new KSerializer[]{c11181o0, AbstractC9961r4.m10615b(C21912F0.f69461a), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0), AbstractC9961r4.m10615b(c11181o0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        boolean z6 = true;
        int i10 = 0;
        String strMo5483q = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                strMo5483q = interfaceC10428aMo5471c.mo5483q(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                C21920H0 c21920h0 = (C21920H0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C21912F0.f69461a, str != null ? new C21920H0(str) : null);
                str = c21920h0 != null ? c21920h0.f69471a : null;
                i10 |= 2;
            } else if (iMo10914s == 2) {
                str2 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
                i10 |= 4;
            } else if (iMo10914s == 3) {
                str3 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
                i10 |= 8;
            } else {
                if (iMo10914s != 4) {
                    throw new C8981m(iMo10914s);
                }
                str4 = (String) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str4);
                i10 |= 16;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C11377e(i10, strMo5483q, str, str2, str3, str4);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C11377e value = (C11377e) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        interfaceC10429bMo5570c.mo5584r(pluginGeneratedSerialDescriptor, 0, value.f34381a);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str = value.f34382b;
        if (zMo5565F || str != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C21912F0.f69461a, str != null ? new C21920H0(str) : null);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str2 = value.f34383c;
        if (zMo5565F2 || str2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C11181o0.f33827a, str2);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str3 = value.f34384d;
        if (zMo5565F3 || str3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 3, C11181o0.f33827a, str3);
        }
        boolean zMo5565F4 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        String str4 = value.f34385e;
        if (zMo5565F4 || str4 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 4, C11181o0.f33827a, str4);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
