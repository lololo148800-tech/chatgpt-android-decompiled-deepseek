package p040Bd;

import ao.AbstractC11153a0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import p1155zi.C21940M0;
import p1155zi.C21965U0;

/* JADX INFO: renamed from: Bd.N3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0969N3 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C0969N3 f2743a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C0969N3 c0969n3 = new C0969N3();
        f2743a = c0969n3;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.conversations.api.message.ApiMultimodalTextContentPart.Image", c0969n3);
        inlineClassDescriptor.m18453j("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C21940M0.f69493a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        C21965U0 value = (C21965U0) decoder.mo5487v(descriptor).mo5482p(C21940M0.f69493a);
        AbstractC16544l.m18094g(value, "value");
        return new C0981P3(value);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C21965U0 value = ((C0981P3) obj).f2767a;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        Encoder encoderMo5590y = encoder.mo5590y(descriptor);
        if (encoderMo5590y == null) {
            return;
        }
        encoderMo5590y.mo5560A(C21940M0.f69493a, value);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
