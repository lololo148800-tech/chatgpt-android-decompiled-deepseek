package ye;

import ao.C11164g;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import p594Y9.AbstractC9961r4;

/* JADX INFO: renamed from: ye.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C21518g implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C21518g f68144a = new C21518g();

    /* JADX INFO: renamed from: b */
    public static final SerialDescriptor f68145b = AbstractC9961r4.m10615b(C11164g.f33804a).getDescriptor();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        Object next;
        AbstractC16544l.m18094g(decoder, "decoder");
        C11164g c11164g = C11164g.f33804a;
        Boolean bool = (Boolean) decoder.mo5466D();
        Iterator it = EnumC21517f.f68142r0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC16544l.m18089b(((EnumC21517f) next).f68143Y, bool));
        EnumC21517f enumC21517f = (EnumC21517f) next;
        return enumC21517f == null ? EnumC21517f.f68138Z : enumC21517f;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f68145b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        EnumC21517f value = (EnumC21517f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        C11164g c11164g = C11164g.f33804a;
        encoder.mo5571e(value.f68143Y);
    }
}
