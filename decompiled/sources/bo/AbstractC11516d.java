package bo;

import co.AbstractC11828r;
import co.C11804E;
import co.C11807H;
import co.C11816f;
import co.C11830t;
import co.C11831u;
import co.C11832v;
import co.C11833w;
import co.EnumC11810K;
import com.openai.feature.serverstatus.impl.sunset.p684ZP.VjclRfeKsMflo;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC16643b;
import kotlinx.serialization.json.AbstractC16645d;
import kotlinx.serialization.json.C16642a;
import kotlinx.serialization.json.C16644c;
import kotlinx.serialization.json.JsonNull;
import p001A.C0042V0;
import p008A6.C0386f;
import p025An.C0644w;
import p559Wn.InterfaceC8980l;
import p733eo.AbstractC13456d;
import p826j6.C16137F;
import p909nm.C17677k;
import p960q9.C18655i;

/* JADX INFO: renamed from: bo.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11516d implements InterfaceC8980l {

    /* JADX INFO: renamed from: d */
    public static final C11515c f34842d = new C11515c(new C11521i(false, false, false, false, false, true, "    ", false, false, "type", false, true, null, false, false, false, EnumC11513a.f34837Z), AbstractC13456d.f42591a);

    /* JADX INFO: renamed from: a */
    public final C11521i f34843a;

    /* JADX INFO: renamed from: b */
    public final C0042V0 f34844b;

    /* JADX INFO: renamed from: c */
    public final C18655i f34845c = new C18655i(26);

    public AbstractC11516d(C11521i c11521i, C0042V0 c0042v0) {
        this.f34843a = c11521i;
        this.f34844b = c0042v0;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12902a(KSerializer deserializer, AbstractC16643b element) {
        Decoder c11830t;
        AbstractC16544l.m18094g(deserializer, "deserializer");
        AbstractC16544l.m18094g(element, "element");
        String str = null;
        if (element instanceof C16644c) {
            c11830t = new C11832v(this, (C16644c) element, str, 12);
        } else if (element instanceof C16642a) {
            c11830t = new C11833w(this, (C16642a) element);
        } else {
            if (!(element instanceof C11528p) && !element.equals(JsonNull.INSTANCE)) {
                throw new C0644w();
            }
            c11830t = new C11830t(this, (AbstractC16645d) element, null);
        }
        return c11830t.mo5482p(deserializer);
    }

    /* JADX INFO: renamed from: b */
    public final Object m12903b(String string, KSerializer deserializer) {
        AbstractC16544l.m18094g(deserializer, "deserializer");
        AbstractC16544l.m18094g(string, "string");
        C11807H c11807hM13099e = AbstractC11828r.m13099e(this, string);
        Object objMo5482p = new C11804E(this, EnumC11810K.OBJ, c11807hM13099e, deserializer.getDescriptor(), null).mo5482p(deserializer);
        c11807hM13099e.m6932p();
        return objMo5482p;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC16643b m12904c(KSerializer serializer, Object obj) {
        AbstractC16544l.m18094g(serializer, "serializer");
        C16525B c16525b = new C16525B();
        new C11831u(this, new C0386f(c16525b, 24), 1).mo5560A(serializer, obj);
        Object obj2 = c16525b.f51262Y;
        if (obj2 != null) {
            return (AbstractC16643b) obj2;
        }
        AbstractC16544l.m18103p("result");
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public final String m12905d(KSerializer kSerializer, Object obj) {
        char[] cArr;
        AbstractC16544l.m18094g(kSerializer, VjclRfeKsMflo.euMFFGSjNbVNt);
        C16137F c16137f = new C16137F(8, (byte) 0);
        C11816f c11816f = C11816f.f35819o0;
        synchronized (c11816f) {
            C17677k c17677k = (C17677k) c11816f.f2131Z;
            cArr = null;
            char[] cArr2 = (char[]) (c17677k.isEmpty() ? null : c17677k.removeLast());
            if (cArr2 != null) {
                c11816f.f2130Y -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c16137f.f50064o0 = cArr;
        try {
            AbstractC11828r.m13107m(this, c16137f, kSerializer, obj);
            return c16137f.toString();
        } finally {
            c16137f.m17697r();
        }
    }
}
