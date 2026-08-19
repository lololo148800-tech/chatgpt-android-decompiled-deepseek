package p1155zi;

import ao.AbstractC11153a0;
import ao.C11125B;
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

/* JADX INFO: renamed from: zi.L */
/* JADX INFO: loaded from: classes3.dex */
public final class C21935L implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21935L f69487a;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        C21935L c21935l = new C21935L();
        f69487a = c21935l;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.types.AudioAssetPointer.Metadata", c21935l, 2);
        pluginGeneratedSerialDescriptor.m18453j("start", true);
        pluginGeneratedSerialDescriptor.m18453j("end", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C11125B c11125b = C11125B.f33744a;
        return new KSerializer[]{c11125b, c11125b};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        float fMo5467E = 0.0f;
        boolean z6 = true;
        int i10 = 0;
        float fMo5467E2 = 0.0f;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                fMo5467E = interfaceC10428aMo5471c.mo5467E(pluginGeneratedSerialDescriptor, 0);
                i10 |= 1;
            } else {
                if (iMo10914s != 1) {
                    throw new C8981m(iMo10914s);
                }
                fMo5467E2 = interfaceC10428aMo5471c.mo5467E(pluginGeneratedSerialDescriptor, 1);
                i10 |= 2;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C21943N(fMo5467E, fMo5467E2, i10);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21943N value = (C21943N) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        float f10 = value.f69494a;
        if (zMo5565F || Float.compare(f10, 0.0f) != 0) {
            interfaceC10429bMo5570c.mo5578l(pluginGeneratedSerialDescriptor, 0, f10);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        float f11 = value.f69495b;
        if (zMo5565F2 || Float.compare(f11, 0.0f) != 0) {
            interfaceC10429bMo5570c.mo5578l(pluginGeneratedSerialDescriptor, 1, f11);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
