package sg;

import androidx.fragment.app.OwC.wNrQXvwLiB;
import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* JADX INFO: renamed from: sg.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C19565g implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C19565g f62147a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C19565g c19565g = new C19565g();
        f62147a = c19565g;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.reporting.ReportAdditionalField.Id", c19565g);
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
        return new C19567i(value);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] typeParametersSerializers() {
        return AbstractC11153a0.f33790b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = ((C19567i) obj).f62148a;
        AbstractC16544l.m18094g(encoder, wNrQXvwLiB.oqadoDSs);
        AbstractC16544l.m18094g(value, "value");
        Encoder encoderMo5590y = encoder.mo5590y(descriptor);
        if (encoderMo5590y == null) {
            return;
        }
        encoderMo5590y.mo5566G(value);
    }
}
