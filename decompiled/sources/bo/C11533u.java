package bo;

import co.C11823m;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import p008A6.C0383c;
import p523V9.AbstractC8017W3;
import p606Yn.C10106g;
import p606Yn.C10109j;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: bo.u */
/* JADX INFO: loaded from: classes2.dex */
public final class C11533u implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11533u f34896a = new C11533u();

    /* JADX INFO: renamed from: b */
    public static final C10106g f34897b = AbstractC11336c.m12774d("kotlinx.serialization.json.JsonNull", C10109j.f29934b, new SerialDescriptor[0], new C0383c(24));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        AbstractC8017W3.m8339c(decoder);
        if (decoder.mo5484r()) {
            throw new C11823m("Expected 'null' literal");
        }
        return JsonNull.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34897b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        JsonNull value = (JsonNull) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        encoder.mo5572f();
    }
}
