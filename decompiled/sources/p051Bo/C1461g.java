package p051Bo;

import android.gov.nist.core.Separators;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import mm.C17314q;
import p002A0.C0130g;
import p026Ao.AbstractC0668b;
import p026Ao.AbstractC0682p;
import p026Ao.C0654C;
import p026Ao.C0681o;
import p026Ao.C0690x;
import p026Ao.C0691y;
import p026Ao.InterfaceC0661J;
import p026Ao.InterfaceC0663L;
import p1061vb.C20513d;
import p1113xn.AbstractC21322p;
import p1113xn.AbstractC21329w;
import p140Fa.C2685e;
import p571X9.AbstractC9227W;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.AbstractC17686t;

/* JADX INFO: renamed from: Bo.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1461g extends AbstractC0682p {

    /* JADX INFO: renamed from: f */
    public static final C0654C f3841f;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f3842c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0682p f3843d;

    /* JADX INFO: renamed from: e */
    public final C17314q f3844e;

    static {
        String str = C0654C.f1910Z;
        f3841f = C20513d.m21169n(Separators.SLASH, false);
    }

    public C1461g(ClassLoader classLoader) {
        C0691y systemFileSystem = AbstractC0682p.f1991a;
        AbstractC16544l.m18094g(systemFileSystem, "systemFileSystem");
        this.f3842c = classLoader;
        this.f3843d = systemFileSystem;
        this.f3844e = AbstractC9227W.m9800c(new C0130g(this, 10));
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: b */
    public final void mo1395b(C0654C path) throws IOException {
        AbstractC16544l.m18094g(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: e */
    public final List mo1396e(C0654C dir) throws FileNotFoundException {
        AbstractC16544l.m18094g(dir, "dir");
        C0654C c0654c = f3841f;
        c0654c.getClass();
        String strM1452r = AbstractC1457c.m2071b(c0654c, dir, true).m1320d(c0654c).f1911Y.m1452r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z6 = false;
        for (C17309l c17309l : (List) this.f3844e.getValue()) {
            AbstractC0682p abstractC0682p = (AbstractC0682p) c17309l.f55136Y;
            C0654C c0654c2 = (C0654C) c17309l.f55137Z;
            try {
                List listMo1396e = abstractC0682p.mo1396e(c0654c2.m1321e(strM1452r));
                ArrayList<C0654C> arrayList = new ArrayList();
                for (Object obj : listMo1396e) {
                    if (C2685e.m3659e((C0654C) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(arrayList, 10));
                for (C0654C c0654c3 : arrayList) {
                    AbstractC16544l.m18094g(c0654c3, "<this>");
                    arrayList2.add(c0654c.m1321e(AbstractC21329w.m21730q(AbstractC21322p.m21688V(c0654c3.f1911Y.m1452r(), c0654c2.f1911Y.m1452r()), '\\', '/')));
                }
                AbstractC17686t.m19398v(arrayList2, linkedHashSet);
                z6 = true;
            } catch (IOException unused) {
            }
        }
        if (z6) {
            return AbstractC17680n.m19322C0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: g */
    public final C0681o mo1397g(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        if (!C2685e.m3659e(path)) {
            return null;
        }
        C0654C c0654c = f3841f;
        c0654c.getClass();
        String strM1452r = AbstractC1457c.m2071b(c0654c, path, true).m1320d(c0654c).f1911Y.m1452r();
        for (C17309l c17309l : (List) this.f3844e.getValue()) {
            C0681o c0681oMo1397g = ((AbstractC0682p) c17309l.f55136Y).mo1397g(((C0654C) c17309l.f55137Z).m1321e(strM1452r));
            if (c0681oMo1397g != null) {
                return c0681oMo1397g;
            }
        }
        return null;
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: h */
    public final C0690x mo1398h(C0654C c0654c) throws FileNotFoundException {
        if (!C2685e.m3659e(c0654c)) {
            throw new FileNotFoundException("file not found: " + c0654c);
        }
        C0654C c0654c2 = f3841f;
        c0654c2.getClass();
        String strM1452r = AbstractC1457c.m2071b(c0654c2, c0654c, true).m1320d(c0654c2).f1911Y.m1452r();
        for (C17309l c17309l : (List) this.f3844e.getValue()) {
            try {
                return ((AbstractC0682p) c17309l.f55136Y).mo1398h(((C0654C) c17309l.f55137Z).m1321e(strM1452r));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c0654c);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: i */
    public final InterfaceC0661J mo1399i(C0654C file, boolean z6) throws IOException {
        AbstractC16544l.m18094g(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: j */
    public final InterfaceC0663L mo1400j(C0654C file) throws IOException {
        AbstractC16544l.m18094g(file, "file");
        if (!C2685e.m3659e(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        C0654C c0654c = f3841f;
        c0654c.getClass();
        URL resource = this.f3842c.getResource(AbstractC1457c.m2071b(c0654c, file, false).m1320d(c0654c).f1911Y.m1452r());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + file);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        AbstractC16544l.m18093f(inputStream, "getInputStream(...)");
        return AbstractC0668b.m1410j(inputStream);
    }
}
