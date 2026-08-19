package bo;

import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import p008A6.C0383c;
import p025An.C0644w;
import p523V9.AbstractC8017W3;
import p606Yn.C10102c;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: bo.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C11524l implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C11524l f34887a = new C11524l();

    /* JADX INFO: renamed from: b */
    public static final C10106g f34888b = AbstractC11336c.m12774d("kotlinx.serialization.json.JsonElement", C10102c.f29909c, new SerialDescriptor[0], new C0383c(26));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        return AbstractC8017W3.m8339c(decoder).mo12907j();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f34888b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC16643b value = (AbstractC16643b) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        AbstractC8017W3.m8338b(encoder);
        if (value instanceof AbstractC16645d) {
            encoder.mo5560A(C11537y.f34904a, value);
        } else if (value instanceof C16644c) {
            encoder.mo5560A(C11536x.f34902a, value);
        } else {
            if (!(value instanceof C16642a)) {
                throw new C0644w();
            }
            encoder.mo5560A(C11518f.f34849a, value);
        }
    }
}
