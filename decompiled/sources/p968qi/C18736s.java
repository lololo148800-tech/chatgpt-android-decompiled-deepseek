package p968qi;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p1009s9.C19506i;
import p1061vb.C20513d;
import p332N8.C5678b;
import p332N8.C5679c;
import p571X9.AbstractC9221V;
import p571X9.AbstractC9393x3;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17689w;
import p960q9.C18655i;

/* JADX INFO: renamed from: qi.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C18736s {
    /* JADX INFO: renamed from: a */
    public static C18737t m20044a(String string) throws IOException {
        AbstractC16544l.m18094g(string, "string");
        C20513d c20513d = new C20513d();
        Charset charsetCode = Charset.forName("UTF-8");
        AbstractC16544l.m18093f(charsetCode, "charsetCode");
        byte[] bytes = string.getBytes(charsetCode);
        AbstractC16544l.m18093f(bytes, "this as java.lang.String).getBytes(charset)");
        C19506i c19506i = new C19506i(new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), charsetCode), 8192), 14);
        C5679c c5679c = C5679c.f18443Y;
        C5678b c5678b = new C5678b(c20513d, c19506i);
        C18655i c18655i = c5678b.f18440b;
        try {
            Object objInvoke = c5679c.invoke(c5678b);
            ((BufferedReader) ((C19506i) c18655i.f59414Z).f61960Z).close();
            List list = (List) objInvoke;
            if (list.isEmpty()) {
                return new C18737t(C17689w.f56480Y);
            }
            Set<String> setKeySet = ((Map) AbstractC17680n.m19341Q(list)).keySet();
            ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(setKeySet, 10));
            for (String str : setKeySet) {
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) ((Map) it.next()).get(str);
                    if (str2 != null) {
                        arrayList2.add(str2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(new C18723f((String) it2.next()));
                }
                arrayList.add(new C18729l(str, arrayList3));
            }
            return new C18737t(AbstractC9393x3.m9974d(new C18742y(arrayList)));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    ((BufferedReader) ((C19506i) c18655i.f59414Z).f61960Z).close();
                } catch (Throwable th4) {
                    AbstractC9221V.m9789a(th2, th4);
                }
                throw th3;
            }
        }
    }

    public final KSerializer serializer() {
        return C18735r.f59595a;
    }
}
