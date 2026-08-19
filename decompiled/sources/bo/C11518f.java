package bo;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.C16642a;
import p523V9.AbstractC8017W3;
import p594Y9.AbstractC9961r4;

/* JADX INFO: renamed from: bo.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C11518f implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11518f f34849a = new C11518f();

    /* JADX INFO: renamed from: b */
    public static final C11517e f34850b = C11517e.f34846b;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        AbstractC8017W3.m8339c(decoder);
        return new C16642a((List) AbstractC9961r4.m10614a(C11524l.f34887a).deserialize(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34850b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C16642a value = (C16642a) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        AbstractC9961r4.m10614a(C11524l.f34887a).serialize(encoder, value);
    }
}
