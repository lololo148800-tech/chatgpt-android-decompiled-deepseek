package p228J;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17348o;
import no.AbstractC17708b;
import org.json.JSONArray;
import org.json.JSONObject;
import p1113xn.AbstractC21322p;
import p571X9.AbstractC9276e0;
import p690cp.C12940z;
import p712dp.C13191g;
import p826j6.C16160n;

/* JADX INFO: renamed from: J.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3847l0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f11629a;

    public C3847l0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new C16160n(jSONObjectOptJSONObject));
                }
            }
        }
        this.f11629a = arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static String m4573j(C3847l0 c3847l0) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c3847l0.f11629a.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3839h0) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) " | ");
            }
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m4574a(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        AbstractC9276e0.m9845b(name);
        AbstractC9276e0.m9846c(value, name);
        m4575b(name, value);
    }

    /* JADX INFO: renamed from: b */
    public void m4575b(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        ArrayList arrayList = this.f11629a;
        arrayList.add(name);
        arrayList.add(AbstractC21322p.m21711s0(value).toString());
    }

    /* JADX INFO: renamed from: c */
    public void m4576c(String name, String value) {
        AbstractC16544l.m18094g(name, "name");
        AbstractC16544l.m18094g(value, "value");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(AbstractC17708b.m19418j("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), name).toString());
            }
        }
        m4575b(name, value);
    }

    /* JADX INFO: renamed from: d */
    public C17348o m4577d() {
        return new C17348o((String[]) this.f11629a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: e */
    public boolean m4578e(Class cls) {
        Iterator it = this.f11629a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((InterfaceC3839h0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC3839h0 m4579f(Class cls) {
        for (InterfaceC3839h0 interfaceC3839h0 : this.f11629a) {
            if (interfaceC3839h0.getClass() == cls) {
                return interfaceC3839h0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public String m4580g() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11629a;
            if (i10 >= arrayList.size()) {
                return sb2.toString();
            }
            if (i10 != 0) {
                sb2.append('\n');
            }
            sb2.append(((C13191g) arrayList.get(i10)).f41860a);
            i10++;
        }
    }

    /* JADX INFO: renamed from: h */
    public ArrayList m4581h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11629a.iterator();
        while (it.hasNext()) {
            C12940z c12940z = ((C13191g) it.next()).f41861b;
            if (c12940z != null) {
                arrayList.add(c12940z);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public void m4582i(String name) {
        AbstractC16544l.m18094g(name, "name");
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f11629a;
            if (i10 >= arrayList.size()) {
                return;
            }
            if (name.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public C3847l0(int i10) {
        switch (i10) {
            case 3:
                this.f11629a = new ArrayList(20);
                break;
            case 4:
                this.f11629a = new ArrayList();
                break;
            default:
                this.f11629a = new ArrayList();
                break;
        }
    }

    public C3847l0(List list) {
        this.f11629a = new ArrayList(list);
    }
}
