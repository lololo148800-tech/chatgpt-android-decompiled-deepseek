package p132F2;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17304g;
import p025An.C0624m;
import p025An.C0644w;
import p1027tp.C20048M;
import p1027tp.C20072p;
import p1027tp.InterfaceC20059c;
import p1027tp.InterfaceC20062f;
import p157G2.AbstractC2979e;
import p571X9.AbstractC9233X;

/* JADX INFO: renamed from: F2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2643g implements InterfaceC2644h, InterfaceC20062f {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C0624m f8157Y;

    public /* synthetic */ C2643g(C0624m c0624m) {
        this.f8157Y = c0624m;
    }

    /* JADX INFO: renamed from: a */
    public void m3624a(Object obj) {
        AbstractC2979e e10 = (AbstractC2979e) obj;
        AbstractC16544l.m18094g(e10, "e");
        C0624m c0624m = this.f8157Y;
        if (c0624m.m1266w()) {
            c0624m.resumeWith(AbstractC9233X.m9806b(e10));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3625b(Object obj) {
        C2651o result = (C2651o) obj;
        AbstractC16544l.m18094g(result, "result");
        C0624m c0624m = this.f8157Y;
        if (c0624m.m1266w()) {
            c0624m.resumeWith(result);
        }
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: s */
    public void mo3626s(InterfaceC20059c call, Throwable th2) {
        AbstractC16544l.m18095h(call, "call");
        this.f8157Y.resumeWith(AbstractC9233X.m9806b(th2));
    }

    @Override // p1027tp.InterfaceC20062f
    /* JADX INFO: renamed from: v */
    public void mo3627v(InterfaceC20059c call, C20048M c20048m) {
        AbstractC16544l.m18095h(call, "call");
        boolean zM18985a = c20048m.f63525a.m18985a();
        C0624m c0624m = this.f8157Y;
        if (!zM18985a) {
            c0624m.resumeWith(AbstractC9233X.m9806b(new C0644w(c20048m)));
            return;
        }
        Object obj = c20048m.f63526b;
        if (obj != null) {
            c0624m.resumeWith(obj);
            return;
        }
        Object objCast = C20072p.class.cast(call.mo20894P().f55383e.get(C20072p.class));
        if (objCast == null) {
            AbstractC16544l.m18101n();
            throw null;
        }
        StringBuilder sb2 = new StringBuilder("Response from ");
        Method method = ((C20072p) objCast).f63568a;
        AbstractC16544l.m18090c(method, "method");
        Class<?> declaringClass = method.getDeclaringClass();
        AbstractC16544l.m18090c(declaringClass, "method.declaringClass");
        sb2.append(declaringClass.getName());
        sb2.append('.');
        sb2.append(method.getName());
        sb2.append(" was null but response body type was declared as non-null");
        c0624m.resumeWith(AbstractC9233X.m9806b(new C17304g(sb2.toString())));
    }
}
