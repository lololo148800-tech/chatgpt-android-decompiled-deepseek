package ye;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* JADX INFO: renamed from: ye.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C21512a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C21512a f68130a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C21512a c21512a = new C21512a();
        f68130a = c21512a;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.conversations.repository.CanmoreId", c21512a);
        inlineClassDescriptor.m18453j("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String value = decoder.mo5487v(descriptor).mo5479m();
        AbstractC16544l.m18094g(value, "value");
        return new C21514c(value);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = ((C21514c) obj).f68131a;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        Encoder encoderMo5590y = encoder.mo5590y(descriptor);
        if (encoderMo5590y == null) {
            return;
        }
        encoderMo5590y.mo5566G(value);
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }
}
