package p597Yd;

import ao.AbstractC11153a0;
import ao.C11181o0;
import ao.InterfaceC11127C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.utils.addToStdlib.GNuz.HJrCuD;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;

/* JADX INFO: renamed from: Yd.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10012a implements InterfaceC11127C {

    /* JADX INFO: renamed from: a */
    public static final C10012a f29697a;
    private static final /* synthetic */ InlineClassDescriptor descriptor;

    static {
        C10012a c10012a = new C10012a();
        f29697a = c10012a;
        InlineClassDescriptor inlineClassDescriptor = new InlineClassDescriptor("com.openai.feature.conversations.domain.plugin.PluginId", c10012a);
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
        return new C10014c(value);
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
        String str = ((C10014c) obj).f29698a;
        AbstractC16544l.m18094g(encoder, HJrCuD.bqu);
        Encoder encoderMo5590y = encoder.mo5590y(descriptor);
        if (encoderMo5590y == null) {
            return;
        }
        encoderMo5590y.mo5566G(str);
    }
}
