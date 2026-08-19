package p381Pe;

import ao.C11131E;
import ao.C11135I;
import ao.InterfaceC11127C;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Pe.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C6390a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KSerializer f20807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KSerializer f20808b;
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public C6390a(KSerializer typeSerial0, KSerializer typeSerial1) {
        AbstractC16544l.m18094g(typeSerial0, "typeSerial0");
        AbstractC16544l.m18094g(typeSerial1, "typeSerial1");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.Tree", this, 3);
        pluginGeneratedSerialDescriptor.m18453j("rootNodeId", false);
        pluginGeneratedSerialDescriptor.m18453j("nodes", false);
        pluginGeneratedSerialDescriptor.m18453j("size", true);
        this.descriptor = pluginGeneratedSerialDescriptor;
        this.f20807a = typeSerial0;
        this.f20808b = typeSerial1;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        C6396g c6396g = C6397h.Companion;
        KSerializer kSerializer = this.f20807a;
        return new KSerializer[]{kSerializer, new C11131E(kSerializer, c6396g.serializer(kSerializer, this.f20808b), 1), C11135I.f33763a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        Object objMo5490y = null;
        boolean z6 = true;
        Map map = null;
        int i10 = 0;
        int iMo5478l = 0;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s != -1) {
                KSerializer kSerializer = this.f20807a;
                if (iMo10914s == 0) {
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializer, objMo5490y);
                    i10 |= 1;
                } else if (iMo10914s == 1) {
                    map = (Map) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, new C11131E(kSerializer, C6397h.Companion.serializer(kSerializer, this.f20808b), 1), map);
                    i10 |= 2;
                } else {
                    if (iMo10914s != 2) {
                        throw new C8981m(iMo10914s);
                    }
                    iMo5478l = interfaceC10428aMo5471c.mo5478l(pluginGeneratedSerialDescriptor, 2);
                    i10 |= 4;
                }
            } else {
                z6 = false;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6394e(i10, objMo5490y, map, iMo5478l);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6394e value = (C6394e) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        Object obj2 = value.f20813a;
        KSerializer kSerializer = this.f20807a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializer, obj2);
        C11131E c11131e = new C11131E(kSerializer, C6397h.Companion.serializer(kSerializer, this.f20808b), 1);
        Map map = value.f20814b;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, c11131e, map);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        int i10 = value.f20815c;
        if (zMo5565F || i10 != map.size()) {
            interfaceC10429bMo5570c.mo5579m(2, i10, pluginGeneratedSerialDescriptor);
        }
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f20807a, this.f20808b};
    }
}
