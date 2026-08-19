package p041Be;

import android.gov.nist.javax.sip.header.ParameterNames;
import bo.AbstractC11516d;
import bo.AbstractC11523k;
import bo.InterfaceC11522j;
import bo.InterfaceC11526n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import p195Hh.C3430e;
import p523V9.AbstractC8160o6;
import p523V9.AbstractC8168p6;
import p559Wn.C8976h;
import p606Yn.C10106g;
import p664bc.AbstractC11336c;
import p909nm.AbstractC17682p;
import p909nm.C17689w;

/* JADX INFO: renamed from: Be.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C1238j implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final C1238j f3261a = new C1238j();

    /* JADX INFO: renamed from: b */
    public static final C3430e f3262b = AbstractC8168p6.m8749b("ConversationListResponseDeserializer", null);

    /* JADX INFO: renamed from: c */
    public static final C10106g f3263c = AbstractC11336c.m12773c("ConversationListResponse", new SerialDescriptor[0], C1237i.f3255Z);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [nm.w] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        ?? arrayList;
        Integer numM12915h;
        String strMo12922f;
        C1241m c1241m;
        AbstractC16544l.m18094g(decoder, "decoder");
        InterfaceC11522j interfaceC11522j = decoder instanceof InterfaceC11522j ? (InterfaceC11522j) decoder : null;
        if (interfaceC11522j == null) {
            throw new C8976h();
        }
        C16644c c16644cM12917j = AbstractC11523k.m12917j(interfaceC11522j.mo12907j());
        AbstractC16643b abstractC16643b = (AbstractC16643b) c16644cM12917j.get("items");
        if (abstractC16643b != null) {
            C16642a c16642aM12916i = AbstractC11523k.m12916i(abstractC16643b);
            arrayList = new ArrayList();
            for (AbstractC16643b abstractC16643b2 : c16642aM12916i.f53330Y) {
                try {
                    AbstractC11516d abstractC11516dMo12906d = interfaceC11522j.mo12906d();
                    abstractC11516dMo12906d.getClass();
                    c1241m = (C1241m) abstractC11516dMo12906d.m12902a(C1241m.Companion.serializer(), abstractC16643b2);
                } catch (Exception e10) {
                    AbstractC16643b abstractC16643b3 = (AbstractC16643b) AbstractC11523k.m12917j(abstractC16643b2).get(ParameterNames.f31999ID);
                    if (abstractC16643b3 == null || (strMo12922f = AbstractC11523k.m12918k(abstractC16643b3).mo12922f()) == null) {
                        strMo12922f = "unknown";
                    }
                    AbstractC8160o6.m8728c(f3262b, "Failed to deserialize conversation ".concat(strMo12922f), e10, null, 4);
                    c1241m = null;
                }
                if (c1241m != null) {
                    arrayList.add(c1241m);
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C17689w.f56480Y;
        }
        AbstractC16643b abstractC16643b4 = (AbstractC16643b) c16644cM12917j.get("total");
        int iIntValue = (abstractC16643b4 == null || (numM12915h = AbstractC11523k.m12915h(AbstractC11523k.m12918k(abstractC16643b4))) == null) ? 0 : numM12915h.intValue();
        AbstractC16643b abstractC16643b5 = (AbstractC16643b) c16644cM12917j.get("cursor");
        return new C1236h(abstractC16643b5 != null ? AbstractC11523k.m12913f(AbstractC11523k.m12918k(abstractC16643b5)) : null, iIntValue, arrayList);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f3263c;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        C1236h value = (C1236h) obj;
        AbstractC16544l.m18094g(encoder, "encoder");
        AbstractC16544l.m18094g(value, "value");
        InterfaceC11526n interfaceC11526n = encoder instanceof InterfaceC11526n ? (InterfaceC11526n) encoder : null;
        if (interfaceC11526n == null) {
            throw new C8976h();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterable<C1241m> iterable = (Iterable) value.f3252a;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
        for (C1241m c1241m : iterable) {
            AbstractC11516d abstractC11516dMo12920d = interfaceC11526n.mo12920d();
            abstractC11516dMo12920d.getClass();
            arrayList.add(abstractC11516dMo12920d.m12904c(C1241m.Companion.serializer(), c1241m));
        }
        AbstractC16645d element = AbstractC11523k.m12909b(Integer.valueOf(value.f3253b));
        AbstractC16544l.m18094g(element, "element");
        String str = value.f3254c;
        if (str != null) {
            AbstractC11516d abstractC11516dMo12920d2 = interfaceC11526n.mo12920d();
            abstractC11516dMo12920d2.getClass();
        }
        interfaceC11526n.mo12921w(new C16644c(linkedHashMap));
    }
}
