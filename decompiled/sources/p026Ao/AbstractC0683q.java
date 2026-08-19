package p026Ao;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import kotlin.jvm.internal.AbstractC16526C;
import kotlin.jvm.internal.AbstractC16544l;
import p544W9.AbstractC8752z3;
import p909nm.AbstractC17685s;

/* JADX INFO: renamed from: Ao.q */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0683q extends AbstractC0682p {

    /* JADX INFO: renamed from: c */
    public final C0691y f1993c;

    public AbstractC0683q(C0691y delegate) {
        AbstractC16544l.m18094g(delegate, "delegate");
        this.f1993c = delegate;
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: b */
    public final void mo1395b(C0654C path) throws IOException {
        AbstractC16544l.m18094g(path, "path");
        this.f1993c.mo1395b(path);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: e */
    public final List mo1396e(C0654C dir) throws IOException {
        AbstractC16544l.m18094g(dir, "dir");
        List<C0654C> listMo1396e = this.f1993c.mo1396e(dir);
        ArrayList arrayList = new ArrayList();
        for (C0654C path : listMo1396e) {
            AbstractC16544l.m18094g(path, "path");
            arrayList.add(path);
        }
        AbstractC17685s.m19391t(arrayList);
        return arrayList;
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: g */
    public final C0681o mo1397g(C0654C path) {
        AbstractC16544l.m18094g(path, "path");
        C0681o c0681oMo1397g = this.f1993c.mo1397g(path);
        if (c0681oMo1397g == null) {
            return null;
        }
        C0654C c0654c = (C0654C) c0681oMo1397g.f1985d;
        if (c0654c == null) {
            return c0681oMo1397g;
        }
        Map extras = (Map) c0681oMo1397g.f1990i;
        AbstractC16544l.m18094g(extras, "extras");
        return new C0681o(c0681oMo1397g.f1983b, c0681oMo1397g.f1984c, c0654c, (Long) c0681oMo1397g.f1986e, (Long) c0681oMo1397g.f1987f, (Long) c0681oMo1397g.f1988g, (Long) c0681oMo1397g.f1989h, extras);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: h */
    public final C0690x mo1398h(C0654C c0654c) {
        return this.f1993c.mo1398h(c0654c);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: i */
    public InterfaceC0661J mo1399i(C0654C file, boolean z6) {
        AbstractC16544l.m18094g(file, "file");
        return this.f1993c.mo1399i(file, z6);
    }

    @Override // p026Ao.AbstractC0682p
    /* JADX INFO: renamed from: j */
    public final InterfaceC0663L mo1400j(C0654C file) {
        AbstractC16544l.m18094g(file, "file");
        return this.f1993c.mo1400j(file);
    }

    /* JADX INFO: renamed from: k */
    public final InterfaceC0661J m1465k(C0654C file) {
        AbstractC16544l.m18094g(file, "file");
        this.f1993c.getClass();
        AbstractC16544l.m18094g(file, "file");
        File fileM1322f = file.m1322f();
        Logger logger = AbstractC0652A.f1907a;
        return new C0670d(AbstractC8752z3.m9508c(fileM1322f, new FileOutputStream(fileM1322f, true), true), 1, new C0665N());
    }

    /* JADX INFO: renamed from: l */
    public final void m1466l(C0654C source, C0654C target) throws IOException {
        AbstractC16544l.m18094g(source, "source");
        AbstractC16544l.m18094g(target, "target");
        this.f1993c.mo1472k(source, target);
    }

    public final String toString() {
        return AbstractC16526C.f51263a.mo5693b(getClass()).mo4448c() + '(' + this.f1993c + ')';
    }
}
