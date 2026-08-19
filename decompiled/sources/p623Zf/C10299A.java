package p623Zf;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import p160G5.p161rK.TVCuK;

/* JADX INFO: renamed from: Zf.A */
/* JADX INFO: loaded from: classes3.dex */
public final class C10299A implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10299A f30586a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C10299A c10299a = new C10299A();
        f30586a = c10299a;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.onboarding.PhoneVerificationId", c10299a);
        inlineClassDescriptor.m18453j("value", false);
        descriptor = inlineClassDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = ((C10301C) obj).f30587a;
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

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String strMo5479m = decoder.mo5487v(descriptor).mo5479m();
        AbstractC16544l.m18094g(strMo5479m, TVCuK.CwzzYreGt);
        return new C10301C(strMo5479m);
    }
}
