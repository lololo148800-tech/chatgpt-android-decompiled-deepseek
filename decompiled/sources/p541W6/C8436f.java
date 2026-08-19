package p541W6;

import java.io.InputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p1113xn.AbstractC21322p;
import p909nm.AbstractC17660E;

/* JADX INFO: renamed from: W6.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8436f {

    /* JADX INFO: renamed from: a */
    public final int f26258a;

    /* JADX INFO: renamed from: b */
    public final InputStream f26259b;

    /* JADX INFO: renamed from: c */
    public final AbstractMap f26260c;

    public C8436f(int i10, InputStream body, AbstractMap abstractMap) {
        AbstractC16544l.m18094g(body, "body");
        this.f26258a = i10;
        this.f26259b = body;
        this.f26260c = abstractMap;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m9038a() {
        AbstractMap abstractMap = this.f26260c;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC17660E.m19257b(abstractMap.size()));
        for (Map.Entry entry : abstractMap.entrySet()) {
            String str = (String) entry.getKey();
            Locale locale = Locale.getDefault();
            AbstractC16544l.m18093f(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            AbstractC16544l.m18093f(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            linkedHashMap.put(lowerCase, entry.getValue());
        }
        List list = (List) linkedHashMap.get("content-type");
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (AbstractC21322p.m21667A((String) it.next(), "application/json", true)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8436f)) {
            return false;
        }
        C8436f c8436f = (C8436f) obj;
        return this.f26258a == c8436f.f26258a && AbstractC16544l.m18089b(this.f26259b, c8436f.f26259b) && this.f26260c.equals(c8436f.f26260c);
    }

    public final int hashCode() {
        return this.f26260c.hashCode() + ((this.f26259b.hashCode() + (this.f26258a * 31)) * 31);
    }

    public final String toString() {
        return "ServerResponse(statusCode=" + this.f26258a + ", body=" + this.f26259b + ", headers=" + this.f26260c + ')';
    }
}
