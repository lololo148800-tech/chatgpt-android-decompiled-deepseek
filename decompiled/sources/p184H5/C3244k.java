package p184H5;

import android.content.Context;
import java.util.List;
import p033B5.C0825i;
import p374P5.C6354g;
import p374P5.C6359l;
import p374P5.InterfaceC6357j;
import p397Q5.C6579h;
import p571X9.AbstractC9233X;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H5.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3244k {

    /* JADX INFO: renamed from: a */
    public final C6354g f9880a;

    /* JADX INFO: renamed from: b */
    public final List f9881b;

    /* JADX INFO: renamed from: c */
    public final int f9882c;

    /* JADX INFO: renamed from: d */
    public final C6354g f9883d;

    /* JADX INFO: renamed from: e */
    public final C6579h f9884e;

    /* JADX INFO: renamed from: f */
    public final C0825i f9885f;

    /* JADX INFO: renamed from: g */
    public final boolean f9886g;

    public C3244k(C6354g c6354g, List list, int i10, C6354g c6354g2, C6579h c6579h, C0825i c0825i, boolean z6) {
        this.f9880a = c6354g;
        this.f9881b = list;
        this.f9882c = i10;
        this.f9883d = c6354g2;
        this.f9884e = c6579h;
        this.f9885f = c0825i;
        this.f9886g = z6;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m4132a(AbstractC19687c abstractC19687c) throws Throwable {
        C3243j c3243j;
        C3241h c3241h;
        C3244k c3244k;
        if (abstractC19687c instanceof C3243j) {
            c3243j = (C3243j) abstractC19687c;
            int i10 = c3243j.f9879q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3243j.f9879q0 = i10 - Integer.MIN_VALUE;
            } else {
                c3243j = new C3243j(this, abstractC19687c);
            }
        } else {
            c3243j = new C3243j(this, abstractC19687c);
        }
        Object obj = c3243j.f9877o0;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3243j.f9879q0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            List list = this.f9881b;
            int i12 = this.f9882c;
            C3241h c3241h2 = (C3241h) list.get(i12);
            C3244k c3244k2 = new C3244k(this.f9880a, this.f9881b, i12 + 1, this.f9883d, this.f9884e, this.f9885f, this.f9886g);
            c3243j.f9875Y = this;
            c3243j.f9876Z = c3241h2;
            c3243j.f9879q0 = 1;
            Object objM4131d = c3241h2.m4131d(c3244k2, c3243j);
            if (objM4131d == enumC19250a) {
                return enumC19250a;
            }
            c3241h = c3241h2;
            obj = objM4131d;
            c3244k = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3241h = c3243j.f9876Z;
            c3244k = c3243j.f9875Y;
            AbstractC9233X.m9807c(obj);
        }
        InterfaceC6357j interfaceC6357j = (InterfaceC6357j) obj;
        C6354g request = interfaceC6357j.getRequest();
        c3244k.getClass();
        Context context = request.f20661a;
        C6354g c6354g = c3244k.f9880a;
        if (context != c6354g.f20661a) {
            throw new IllegalStateException(("Interceptor '" + c3241h + "' cannot modify the request's context.").toString());
        }
        if (request.f20662b == C6359l.f20696a) {
            throw new IllegalStateException(("Interceptor '" + c3241h + "' cannot set the request's data to null.").toString());
        }
        if (request.f20663c != c6354g.f20663c) {
            throw new IllegalStateException(("Interceptor '" + c3241h + "' cannot modify the request's target.").toString());
        }
        if (request.f20676p == c6354g.f20676p) {
            return interfaceC6357j;
        }
        throw new IllegalStateException(("Interceptor '" + c3241h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }
}
