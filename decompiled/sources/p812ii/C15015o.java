package p812ii;

import bo.AbstractC11523k;
import bo.C11534v;
import bo.InterfaceC11522j;
import bo.InterfaceC11526n;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p1113xn.AbstractC21329w;
import p559Wn.C8976h;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;

/* JADX INFO: renamed from: ii.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C15015o implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C15015o f46709a = new C15015o();

    /* JADX INFO: renamed from: b */
    public static final C10106g f46710b = AbstractC11336c.m12773c("PatchOperation", new SerialDescriptor[0], C15011k.f46704o0);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        EnumC15004d enumC15004d;
        AbstractC16643b abstractC16643b;
        String strMo12922f;
        String strMo12922f2;
        Object next;
        AbstractC16544l.m18094g(decoder, "decoder");
        if (!(decoder instanceof InterfaceC11522j)) {
            throw new IllegalArgumentException("This serializer only works with JSON");
        }
        AbstractC16643b abstractC16643bMo12907j = ((InterfaceC11522j) decoder).mo12907j();
        C16644c c16644c = abstractC16643bMo12907j instanceof C16644c ? (C16644c) abstractC16643bMo12907j : null;
        if (c16644c == null) {
            throw new C8976h("PatchOperation must be a JSON object");
        }
        AbstractC16643b abstractC16643b2 = (AbstractC16643b) c16644c.get("o");
        if (abstractC16643b2 == null || (strMo12922f2 = AbstractC11523k.m12918k(abstractC16643b2).mo12922f()) == null) {
            enumC15004d = null;
        } else {
            Iterator it = EnumC15004d.f46695o0.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!AbstractC21329w.m21726m(((EnumC15004d) next).name(), strMo12922f2));
            enumC15004d = (EnumC15004d) next;
            if (enumC15004d == null) {
                throw new C15001a("Missing operation: ".concat(strMo12922f2), null);
            }
        }
        AbstractC16643b abstractC16643b3 = (AbstractC16643b) c16644c.get("p");
        C15012l c15012l = (abstractC16643b3 == null || (strMo12922f = AbstractC11523k.m12918k(abstractC16643b3).mo12922f()) == null) ? null : new C15012l(strMo12922f);
        if (c16644c.containsKey("v")) {
            AbstractC16643b abstractC16643b4 = (AbstractC16643b) c16644c.get("v");
            if (abstractC16643b4 == null) {
                abstractC16643b4 = JsonNull.INSTANCE;
            }
            abstractC16643b = abstractC16643b4;
        } else {
            abstractC16643b = null;
        }
        AbstractC16643b abstractC16643b5 = (AbstractC16643b) c16644c.get("f");
        String strMo12922f3 = abstractC16643b5 != null ? AbstractC11523k.m12918k(abstractC16643b5).mo12922f() : null;
        AbstractC16643b abstractC16643b6 = (AbstractC16643b) c16644c.get("c");
        return new C15006f(enumC15004d, c15012l, abstractC16643b, strMo12922f3, abstractC16643b6 != null ? AbstractC11523k.m12915h(AbstractC11523k.m12918k(abstractC16643b6)) : null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f46710b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C15006f value = (C15006f) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        if (!(encoder instanceof InterfaceC11526n)) {
            throw new IllegalArgumentException("This serializer only works with JSON");
        }
        InterfaceC11526n interfaceC11526n = (InterfaceC11526n) encoder;
        C11534v c11534v = new C11534v(0);
        EnumC15004d enumC15004d = value.f46696a;
        if (enumC15004d != null) {
            String lowerCase = enumC15004d.name().toLowerCase(Locale.ROOT);
            AbstractC16544l.m18093f(lowerCase, "toLowerCase(...)");
            c11534v.m12927c("o", AbstractC11523k.m12910c(lowerCase));
        }
        C15012l c15012l = value.f46697b;
        if (c15012l != null) {
            c11534v.m12927c("p", AbstractC11523k.m12910c(c15012l.m16136a()));
        }
        AbstractC16643b abstractC16643b = value.f46698c;
        if (abstractC16643b != null) {
            c11534v.m12927c("v", abstractC16643b);
        }
        String str = value.f46699d;
        if (str != null) {
            c11534v.m12927c("f", AbstractC11523k.m12910c(str));
        }
        Integer num = value.f46700e;
        if (num != null) {
            c11534v.m12927c("c", AbstractC11523k.m12909b(Integer.valueOf(num.intValue())));
        }
        interfaceC11526n.mo12921w(c11534v.m12925a());
    }
}
