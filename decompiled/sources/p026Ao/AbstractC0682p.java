package p026Ao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p051Bo.C1461g;
import p1061vb.C20513d;
import p909nm.C17677k;

/* JADX INFO: renamed from: Ao.p */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0682p {

    /* JADX INFO: renamed from: a */
    public static final C0691y f1991a;

    /* JADX INFO: renamed from: b */
    public static final C0654C f1992b;

    static {
        C0691y c0691y;
        try {
            Class.forName("java.nio.file.Files");
            c0691y = new C0692z();
        } catch (ClassNotFoundException unused) {
            c0691y = new C0691y();
        }
        f1991a = c0691y;
        String str = C0654C.f1910Z;
        String property = System.getProperty("java.io.tmpdir");
        AbstractC16544l.m18093f(property, "getProperty(...)");
        f1992b = C20513d.m21169n(property, false);
        ClassLoader classLoader = C1461g.class.getClassLoader();
        AbstractC16544l.m18093f(classLoader, "getClassLoader(...)");
        new C1461g(classLoader);
    }

    /* JADX INFO: renamed from: a */
    public final void m1461a(C0654C c0654c) throws IOException {
        C0681o c0681oMo1397g;
        C17677k<C0654C> c17677k = new C17677k();
        while (c0654c != null && !m1463d(c0654c)) {
            c17677k.addFirst(c0654c);
            c0654c = c0654c.m1319c();
        }
        for (C0654C dir : c17677k) {
            AbstractC16544l.m18094g(dir, "dir");
            C0691y c0691y = ((AbstractC0683q) this).f1993c;
            c0691y.getClass();
            if (!dir.m1322f().mkdir() && ((c0681oMo1397g = c0691y.mo1397g(dir)) == null || !c0681oMo1397g.f1984c)) {
                throw new IOException("failed to create directory: " + dir);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1395b(C0654C c0654c);

    /* JADX INFO: renamed from: c */
    public final void m1462c(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        mo1395b(path);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m1463d(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        return mo1397g(path) != null;
    }

    /* JADX INFO: renamed from: e */
    public abstract List mo1396e(C0654C c0654c);

    /* JADX INFO: renamed from: f */
    public final C0681o m1464f(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        C0681o c0681oMo1397g = mo1397g(path);
        if (c0681oMo1397g != null) {
            return c0681oMo1397g;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    /* JADX INFO: renamed from: g */
    public abstract C0681o mo1397g(C0654C c0654c);

    /* JADX INFO: renamed from: h */
    public abstract C0690x mo1398h(C0654C c0654c);

    /* JADX INFO: renamed from: i */
    public abstract InterfaceC0661J mo1399i(C0654C c0654c, boolean z6);

    /* JADX INFO: renamed from: j */
    public abstract InterfaceC0663L mo1400j(C0654C c0654c);
}
