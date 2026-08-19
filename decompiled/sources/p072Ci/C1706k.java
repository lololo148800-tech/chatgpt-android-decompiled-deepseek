package p072Ci;

import android.gov.nist.javax.sip.header.ParameterNames;
import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* JADX INFO: renamed from: Ci.k */
/* JADX INFO: loaded from: classes3.dex */
public final class C1706k implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C1706k f4889a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C1706k c1706k = new C1706k();
        f4889a = c1706k;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.user.model.VoiceName", c1706k);
        inlineClassDescriptor.m18453j(ParameterNames.TAG, false);
        descriptor = inlineClassDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String tag = decoder.mo5487v(descriptor).mo5479m();
        AbstractC16544l.m18094g(tag, "tag");
        return new C1708m(tag);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = ((C1708m) obj).f4890a;
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
