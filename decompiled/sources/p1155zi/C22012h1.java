package p1155zi;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* JADX INFO: renamed from: zi.h1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C22012h1 implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C22012h1 f69653a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C22012h1 c22012h1 = new C22012h1();
        f69653a = c22012h1;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.types.ModelSlug", c22012h1);
        inlineClassDescriptor.m18453j(DiagnosticsEntry.NAME_KEY, false);
        descriptor = inlineClassDescriptor;
    }

    @Override // ao.InterfaceC11127C
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{C11181o0.f33827a};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        String name = decoder.mo5487v(descriptor).mo5479m();
        AbstractC16544l.m18094g(name, "name");
        return new C22020j1(name);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String value = ((C22020j1) obj).f69665a;
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
