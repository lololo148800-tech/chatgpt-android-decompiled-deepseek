package p1049up;

import bj.AbstractC11471r;
import bj.C11479z;
import java.io.EOFException;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC16544l;
import mo.C17352s;
import mo.C17359z;
import p026Ao.C0675i;
import p026Ao.C0678l;
import p1027tp.InterfaceC20067k;
import p571X9.AbstractC9282f0;

/* JADX INFO: renamed from: up.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C20409b implements InterfaceC20067k {

    /* JADX INFO: renamed from: Z */
    public static final C17352s f64528Z;

    /* JADX INFO: renamed from: Y */
    public final AbstractC11471r f64529Y;

    static {
        Pattern pattern = C17352s.f55296e;
        f64528Z = AbstractC9282f0.m9857c("application/json; charset=UTF-8");
    }

    public C20409b(AbstractC11471r abstractC11471r) {
        this.f64529Y = abstractC11471r;
    }

    @Override // p1027tp.InterfaceC20067k
    /* JADX INFO: renamed from: a */
    public final Object mo15962a(Object obj) throws EOFException {
        C0675i c0675i = new C0675i();
        this.f64529Y.toJson(new C11479z(c0675i), obj);
        C0678l content = c0675i.m1417C0(c0675i.f1970Z);
        AbstractC16544l.m18094g(content, "content");
        return new C17359z(f64528Z, content, 1);
    }
}
