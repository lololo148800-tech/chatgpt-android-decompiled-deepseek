package bo;

import ao.C11131E;
import ao.C11181o0;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.C16644c;
import p523V9.AbstractC8017W3;

/* JADX INFO: renamed from: bo.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C11536x implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11536x f34902a = new C11536x();

    /* JADX INFO: renamed from: b */
    public static final C11535w f34903b = C11535w.f34899b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        AbstractC8017W3.m8339c(decoder);
        return new C16644c((Map) new C11131E(C11181o0.f33827a, C11524l.f34887a, 1).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34903b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C16644c value = (C16644c) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        new C11131E(C11181o0.f33827a, C11524l.f34887a, 1).serialize(encoder, value);
    }
}
