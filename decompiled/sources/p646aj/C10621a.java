package p646aj;

import bo.AbstractC11516d;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import p559Wn.C8969a;
import p606Yn.C10101b;

/* JADX INFO: renamed from: aj.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10621a implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C10621a f31517a = new C10621a();

    /* JADX INFO: renamed from: b */
    public static final C10101b f31518b = (C10101b) new C8969a(AbstractC16526C.f51263a.mo5693b(Object.class), new KSerializer[0]).f27404d;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return "not-implemented";
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f31518b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC16643b abstractC16643bM11002d = AbstractC10628h.m11002d(value);
        AbstractC11516d.f34842d.getClass();
        encoder.mo5560A(AbstractC16643b.Companion.serializer(), abstractC16643bM11002d);
    }
}
