package p1028u;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p806ia.nJAW.FpwNpGDhomXHZ;

/* JADX INFO: renamed from: u.f */
/* JADX INFO: loaded from: classes.dex */
public class C20089f implements Iterable {

    /* JADX INFO: renamed from: Y */
    public C20086c f63612Y;

    /* JADX INFO: renamed from: Z */
    public C20086c f63613Z;

    /* JADX INFO: renamed from: o0 */
    public final WeakHashMap f63614o0 = new WeakHashMap();

    /* JADX INFO: renamed from: p0 */
    public int f63615p0 = 0;

    public final boolean equals(Object obj) {
        C20085b c20085b;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C20089f)) {
            return false;
        }
        C20089f c20089f = (C20089f) obj;
        if (this.f63615p0 != c20089f.f63615p0) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c20089f.iterator();
        while (true) {
            c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                break;
            }
            C20085b c20085b2 = (C20085b) it2;
            if (!c20085b2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c20085b.next();
            Object next = c20085b2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c20085b.hasNext() || ((C20085b) it2).hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public C20086c mo20916f(Object obj) {
        C20086c c20086c = this.f63612Y;
        while (c20086c != null && !c20086c.f63605Y.equals(obj)) {
            c20086c = c20086c.f63607o0;
        }
        return c20086c;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C20085b c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c20085b.next()).hashCode();
        }
    }

    /* JADX INFO: renamed from: i */
    public Object mo20917i(Object obj, Object obj2) {
        C20086c c20086cMo20916f = mo20916f(obj);
        if (c20086cMo20916f != null) {
            return c20086cMo20916f.f63606Z;
        }
        C20086c c20086c = new C20086c(obj, obj2);
        this.f63615p0++;
        C20086c c20086c2 = this.f63613Z;
        if (c20086c2 == null) {
            this.f63612Y = c20086c;
            this.f63613Z = c20086c;
            return null;
        }
        c20086c2.f63607o0 = c20086c;
        c20086c.f63608p0 = c20086c2;
        this.f63613Z = c20086c;
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C20085b c20085b = new C20085b(this.f63612Y, this.f63613Z, 0);
        this.f63614o0.put(c20085b, Boolean.FALSE);
        return c20085b;
    }

    /* JADX INFO: renamed from: j */
    public Object mo20918j(Object obj) {
        C20086c c20086cMo20916f = mo20916f(obj);
        if (c20086cMo20916f == null) {
            return null;
        }
        this.f63615p0--;
        WeakHashMap weakHashMap = this.f63614o0;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC20088e) it.next()).mo20919a(c20086cMo20916f);
            }
        }
        C20086c c20086c = c20086cMo20916f.f63608p0;
        if (c20086c != null) {
            c20086c.f63607o0 = c20086cMo20916f.f63607o0;
        } else {
            this.f63612Y = c20086cMo20916f.f63607o0;
        }
        C20086c c20086c2 = c20086cMo20916f.f63607o0;
        if (c20086c2 != null) {
            c20086c2.f63608p0 = c20086c;
        } else {
            this.f63613Z = c20086c;
        }
        c20086cMo20916f.f63607o0 = null;
        c20086cMo20916f.f63608p0 = null;
        return c20086cMo20916f.f63606Z;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C20085b c20085b = (C20085b) it;
            if (!c20085b.hasNext()) {
                sb2.append(FpwNpGDhomXHZ.pwKWmPN);
                return sb2.toString();
            }
            sb2.append(((Map.Entry) c20085b.next()).toString());
            if (c20085b.hasNext()) {
                sb2.append(", ");
            }
        }
    }
}
