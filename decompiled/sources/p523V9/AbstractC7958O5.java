package p523V9;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Iterator;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import ni.C17632f;
import p092Dc.C2001r;
import p124Ei.C2446D;
import p193Hf.AbstractC3356d0;
import p349O0.C6018n0;
import p349O0.C6021p;
import p895n1.C17425e;
import p959q8.C18639a;

/* JADX INFO: renamed from: V9.O5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7958O5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25197a;

    /* JADX INFO: renamed from: a */
    public static final void m8248a(int i10, C6021p c6021p) {
        Object next;
        Object objM19235b;
        c6021p.m6526U(-126922235);
        if (i10 == 0 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            c6021p.m6524S(617413469);
            Iterator it = ((Iterable) c6021p.m6548k(AbstractC16421b.f50950a)).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof C2001r));
            if (next != null) {
                objM19235b = (C2001r) next;
                c6021p.m6553p(false);
            } else {
                objM19235b = C17632f.f56419a.m19235b(C2001r.class);
                c6021p.m6553p(false);
            }
            if ((((C2001r) objM19235b) != null ? new C18639a(6) : null) != null) {
                c6021p.m6524S(1572139174);
                AbstractC3356d0.m4180a(null, c6021p, 0);
                c6021p.m6553p(false);
            }
        }
        C6018n0 c6018n0M6555r = c6021p.m6555r();
        if (c6018n0M6555r != null) {
            c6018n0M6555r.f19536d = new C2446D(i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m8249b(Reader reader) throws IOException {
        AbstractC16544l.m18094g(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i10 = reader.read(cArr);
        while (i10 >= 0) {
            stringWriter.write(cArr, 0, i10);
            i10 = reader.read(cArr);
        }
        String string = stringWriter.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }
}
