package p968qi;

import ao.C11163f0;
import bo.AbstractC11523k;
import bo.InterfaceC11522j;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.InlineClassDescriptor;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.JsonNull;
import p1113xn.AbstractC21328v;
import p559Wn.C8976h;
import p606Yn.C10104e;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: qi.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C18725h implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C18725h f59566a = new C18725h();

    /* JADX INFO: renamed from: b */
    public static final C11163f0 f59567b = AbstractC11336c.m12772b("DoubleOrString", C10104e.f29918j);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        AbstractC16544l.m18094g(decoder, "decoder");
        if (!(decoder instanceof InterfaceC11522j)) {
            throw new IllegalStateException("Decoder is not JsonDecoder.");
        }
        AbstractC16643b abstractC16643bMo12907j = ((InterfaceC11522j) decoder).mo12907j();
        boolean z6 = abstractC16643bMo12907j instanceof AbstractC16645d;
        if (z6) {
            AbstractC16645d abstractC16645d = (AbstractC16645d) abstractC16643bMo12907j;
            InlineClassDescriptor inlineClassDescriptor = AbstractC11523k.f34886a;
            AbstractC16544l.m18094g(abstractC16645d, "<this>");
            if (AbstractC21328v.m21719f(abstractC16645d.mo12922f()) != null) {
                return new C18721d(Double.parseDouble(AbstractC11523k.m12918k(abstractC16643bMo12907j).mo12922f()));
            }
        }
        if (z6 && AbstractC11523k.m12913f((AbstractC16645d) abstractC16643bMo12907j) != null) {
            return new C18723f(AbstractC11523k.m12918k(abstractC16643bMo12907j).mo12922f());
        }
        if (abstractC16643bMo12907j instanceof JsonNull) {
            return C18722e.f59564a;
        }
        throw new C8976h("Expected double, string, or null. Got " + abstractC16643bMo12907j);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f59567b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AbstractC18724g value = (AbstractC18724g) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        if (value instanceof C18721d) {
            encoder.mo5573g(((C18721d) value).f59563a);
        } else if (value instanceof C18723f) {
            encoder.mo5566G(((C18723f) value).f59565a);
        } else if (value instanceof C18722e) {
            encoder.mo5572f();
        }
    }
}
