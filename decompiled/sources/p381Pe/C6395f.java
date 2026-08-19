package p381Pe;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.C11158d;
import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;
import p909nm.C17689w;

/* JADX INFO: renamed from: Pe.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C6395f implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KSerializer f20816a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KSerializer f20817b;
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public C6395f(KSerializer typeSerial0, KSerializer typeSerial1) {
        AbstractC16544l.m18094g(typeSerial0, "typeSerial0");
        AbstractC16544l.m18094g(typeSerial1, "typeSerial1");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.util.TreeNode", this, 4);
        pluginGeneratedSerialDescriptor.m18453j(ParameterNames.f31999ID, false);
        pluginGeneratedSerialDescriptor.m18453j("parent", true);
        pluginGeneratedSerialDescriptor.m18453j("children", true);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
        this.f20816a = typeSerial0;
        this.f20817b = typeSerial1;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = this.f20816a;
        return new KSerializer[]{kSerializer, AbstractC9961r4.m10615b(kSerializer), new C11158d(kSerializer, 0), this.f20817b};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        Object objMo5490y = null;
        Object objMo5486u = null;
        Object objMo5490y2 = null;
        List list = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s != -1) {
                KSerializer kSerializer = this.f20816a;
                if (iMo10914s == 0) {
                    objMo5490y = interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializer, objMo5490y);
                    i10 |= 1;
                } else if (iMo10914s == 1) {
                    objMo5486u = interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 1, kSerializer, objMo5486u);
                    i10 |= 2;
                } else if (iMo10914s == 2) {
                    list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 2, new C11158d(kSerializer, 0), list);
                    i10 |= 4;
                } else {
                    if (iMo10914s != 3) {
                        throw new C8981m(iMo10914s);
                    }
                    objMo5490y2 = interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, this.f20817b, objMo5490y2);
                    i10 |= 8;
                }
            } else {
                z6 = false;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6397h(i10, objMo5490y, objMo5486u, objMo5490y2, list);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6397h value = (C6397h) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        Object obj2 = value.f20819a;
        KSerializer kSerializer = this.f20816a;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializer, obj2);
        boolean zMo5565F = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        Object obj3 = value.f20820b;
        if (zMo5565F || obj3 != null) {
            interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 1, kSerializer, obj3);
        }
        boolean zMo5565F2 = interfaceC10429bMo5570c.mo5565F(pluginGeneratedSerialDescriptor);
        List list = value.f20821c;
        if (zMo5565F2 || !AbstractC16544l.m18089b(list, C17689w.f56480Y)) {
            interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 2, new C11158d(kSerializer, 0), list);
        }
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, this.f20817b, value.f20822d);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f20816a, this.f20817b};
    }
}
