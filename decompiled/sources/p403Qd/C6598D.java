package p403Qd;

import ao.InterfaceC11127C;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p479Td.AbstractC7343b0;
import p559Wn.C8981m;
import p594Y9.AbstractC9961r4;
import p631Zn.InterfaceC10428a;
import p631Zn.InterfaceC10429b;

/* JADX INFO: renamed from: Qd.D */
/* JADX INFO: loaded from: classes3.dex */
public final class C6598D implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ KSerializer f21308a;
    private final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    public C6598D(KSerializer typeSerial0) {
        AbstractC16544l.m18094g(typeSerial0, "typeSerial0");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.ConversationItem.Tool", this, 4);
        pluginGeneratedSerialDescriptor.m18453j("status", false);
        pluginGeneratedSerialDescriptor.m18453j("messages", false);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        pluginGeneratedSerialDescriptor.m18453j("summary", false);
        this.descriptor = pluginGeneratedSerialDescriptor;
        this.f21308a = typeSerial0;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr = C6600F.f21309g;
        return new KSerializer[]{kSerializerArr[0], kSerializerArr[1], AbstractC9961r4.m10615b(kSerializerArr[2]), C6655r0.f21419a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10428a interfaceC10428aMo5471c = decoder.mo5471c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6600F.f21309g;
        EnumC6606L enumC6606L = null;
        List list = null;
        AbstractC7343b0 abstractC7343b0 = null;
        AbstractC6653q0 abstractC6653q0 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int iMo10914s = interfaceC10428aMo5471c.mo10914s(pluginGeneratedSerialDescriptor);
            if (iMo10914s == -1) {
                z6 = false;
            } else if (iMo10914s == 0) {
                enumC6606L = (EnumC6606L) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], enumC6606L);
                i10 |= 1;
            } else if (iMo10914s == 1) {
                list = (List) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], list);
                i10 |= 2;
            } else if (iMo10914s == 2) {
                abstractC7343b0 = (AbstractC7343b0) interfaceC10428aMo5471c.mo5486u(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], abstractC7343b0);
                i10 |= 4;
            } else {
                if (iMo10914s != 3) {
                    throw new C8981m(iMo10914s);
                }
                abstractC6653q0 = (AbstractC6653q0) interfaceC10428aMo5471c.mo5490y(pluginGeneratedSerialDescriptor, 3, C6655r0.f21419a, abstractC6653q0);
                i10 |= 8;
            }
        }
        interfaceC10428aMo5471c.mo5470b(pluginGeneratedSerialDescriptor);
        return new C6600F(i10, enumC6606L, list, abstractC7343b0, abstractC6653q0);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C6600F value = (C6600F) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.descriptor;
        InterfaceC10429b interfaceC10429bMo5570c = encoder.mo5570c(pluginGeneratedSerialDescriptor);
        KSerializer[] kSerializerArr = C6600F.f21309g;
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 0, kSerializerArr[0], value.f21311c);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 1, kSerializerArr[1], value.f21312d);
        interfaceC10429bMo5570c.mo5585s(pluginGeneratedSerialDescriptor, 2, kSerializerArr[2], value.f21313e);
        interfaceC10429bMo5570c.mo5575i(pluginGeneratedSerialDescriptor, 3, C6655r0.f21419a, value.f21314f);
        interfaceC10429bMo5570c.mo5569b(pluginGeneratedSerialDescriptor);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return new KSerializer[]{this.f21308a};
    }
}
