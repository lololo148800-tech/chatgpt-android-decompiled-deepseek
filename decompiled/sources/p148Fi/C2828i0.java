package p148Fi;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.org.webrtc.MediaStreamTrack;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Fi.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2828i0 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C2828i0 f8567a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C2828i0 c2828i0 = new C2828i0();
        f8567a = c2828i0;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.voice.api.UsageUpdateLimits", c2828i0, 3);
        pluginGeneratedSerialDescriptor.m18453j(MediaStreamTrack.AUDIO_TRACK_KIND, true);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.SESSION, true);
        pluginGeneratedSerialDescriptor.m18453j(MediaStreamTrack.VIDEO_TRACK_KIND, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C2819f0 c2819f0 = C2819f0.f8552a;
        return new KSerializer[]{AbstractC9961r4.m10615b(c2819f0), AbstractC9961r4.m10615b(c2819f0), AbstractC9961r4.m10615b(c2819f0)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        C2825h0 c2825h0 = null;
        boolean z6 = true;
        C2825h0 c2825h1 = null;
        C2825h0 c2825h2 = null;
        int i10 = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                c2825h0 = (C2825h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 0, C2819f0.f8552a, c2825h0);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                c2825h1 = (C2825h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, C2819f0.f8552a, c2825h1);
                i10 |= 2;
            } else {
                if (iMo10914s != 2) {
                    throw new C8981m(iMo10914s);
                }
                c2825h2 = (C2825h0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, C2819f0.f8552a, c2825h2);
                i10 |= 4;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C2834k0(i10, c2825h0, c2825h1, c2825h2);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C2834k0 value = (C2834k0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C2825h0 c2825h0 = value.f8571a;
        if (zMo5565F || c2825h0 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 0, C2819f0.f8552a, c2825h0);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C2825h0 c2825h1 = value.f8572b;
        if (zMo5565F2 || c2825h1 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, C2819f0.f8552a, c2825h1);
        }
        boolean zMo5565F3 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        C2825h0 c2825h2 = value.f8573c;
        if (zMo5565F3 || c2825h2 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, C2819f0.f8552a, c2825h2);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
