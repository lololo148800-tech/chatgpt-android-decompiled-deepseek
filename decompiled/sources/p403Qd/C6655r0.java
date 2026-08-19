package p403Qd;

import ao.AbstractC11153a0;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p008A6.C0383c;
import p225Im.InterfaceC3756d;
import p559Wn.C8976h;
import p594Y9.AbstractC9816U3;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: Qd.r0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6655r0 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C6655r0 f21419a = new C6655r0();

    /* JADX INFO: renamed from: b */
    public static final C10106g f21420b = AbstractC11336c.m12773c("ToolSummaryData", new SerialDescriptor[0], new C0383c(23));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        throw new C8976h("Deserialization is not supported for ToolSummaryData");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f21420b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC6653q0 value = (AbstractC6653q0) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        InterfaceC3756d interfaceC3756dMo5693b = AbstractC16526C.f51263a.mo5693b(value.getClass());
        KSerializer kSerializerM10454e = AbstractC9816U3.m10454e(interfaceC3756dMo5693b);
        if (kSerializerM10454e != null) {
            encoder.mo5560A(kSerializerM10454e, value);
        } else {
            AbstractC11153a0.m12388k(interfaceC3756dMo5693b);
            throw null;
        }
    }
}
