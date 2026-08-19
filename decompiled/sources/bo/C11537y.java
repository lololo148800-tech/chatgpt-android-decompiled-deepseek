package bo;

import co.AbstractC11828r;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.JsonNull;
import p008A6.C0383c;
import p523V9.AbstractC8017W3;
import p606Yn.C10104e;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;
import p911o0.AbstractC17792x;

/* JADX INFO: renamed from: bo.y */
/* JADX INFO: loaded from: classes2.dex */
public final class C11537y implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11537y f34904a = new C11537y();

    /* JADX INFO: renamed from: b */
    public static final C10106g f34905b = AbstractC11336c.m12774d("kotlinx.serialization.json.JsonPrimitive", C10104e.f29918j, new SerialDescriptor[0], new C0383c(24));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        AbstractC16643b abstractC16643bMo12907j = AbstractC8017W3.m8339c(decoder).mo12907j();
        if (abstractC16643bMo12907j instanceof AbstractC16645d) {
            return (AbstractC16645d) abstractC16643bMo12907j;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw AbstractC11828r.m13097c(-1, abstractC16643bMo12907j.toString(), AbstractC17792x.m19535r(AbstractC16526C.f51263a, abstractC16643bMo12907j.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34905b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC16645d value = (AbstractC16645d) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        if (value instanceof JsonNull) {
            encoder.mo5560A(C11533u.f34896a, JsonNull.INSTANCE);
        } else {
            encoder.mo5560A(C11529q.f34893a, (C11528p) value);
        }
    }
}
