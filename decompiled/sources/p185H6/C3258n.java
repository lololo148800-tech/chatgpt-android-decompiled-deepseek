package p185H6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17314q;
import mo.AbstractC17329F;
import mo.C17327D;
import mo.C17348o;
import mo.C17355v;
import mo.C17356w;
import mo.C17358y;
import mo.InterfaceC17337d;
import p025An.C0624m;
import p026Ao.InterfaceC0677k;
import p033B5.C0819c;
import p060C6.C1606c;
import p162G6.AbstractC3005b;
import p200Hm.C3507f;
import p200Hm.C3508g;
import p523V9.AbstractC8154o0;
import p530Vi.AbstractC8301I;
import p571X9.AbstractC9227W;
import p571X9.AbstractC9233X;
import p658b5.C11238i;
import p791hj.C14522e;
import p909nm.AbstractC17682p;
import p942p6.C18299c;
import p942p6.C18301e;
import p942p6.EnumC18300d;
import p942p6.InterfaceC18298b;
import p974qo.C18792h;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: renamed from: H6.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3258n implements InterfaceC3247c {

    /* JADX INFO: renamed from: o0 */
    public static final C3248d f9919o0 = new C3248d();

    /* JADX INFO: renamed from: Y */
    public final C0819c f9920Y;

    /* JADX INFO: renamed from: Z */
    public final C17314q f9921Z;

    public C3258n(long j10) {
        C17355v c17355v = (C17355v) AbstractC3005b.f9031a.getValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c17355v.m19031a(j10, timeUnit);
        c17355v.m19033c(j10, timeUnit);
        this.f9920Y = new C0819c(new C17356w(c17355v), 3);
        this.f9921Z = AbstractC9227W.m9800c(new C0819c(this, 4));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // p185H6.InterfaceC3247c
    /* JADX INFO: renamed from: w */
    public final Object mo4137w(C11238i c11238i, AbstractC19687c abstractC19687c) {
        C3257m c3257m;
        C3248d c3248d;
        if (abstractC19687c instanceof C3257m) {
            c3257m = (C3257m) abstractC19687c;
            int i10 = c3257m.f9918p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3257m.f9918p0 = i10 - Integer.MIN_VALUE;
            } else {
                c3257m = new C3257m(this, abstractC19687c);
            }
        } else {
            c3257m = new C3257m(this, abstractC19687c);
        }
        Object obj = c3257m.f9916Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = c3257m.f9918p0;
        if (i11 == 0) {
            AbstractC9233X.m9807c(obj);
            C3248d c3248d2 = f9919o0;
            InterfaceC17337d interfaceC17337d = (InterfaceC17337d) this.f9921Z.getValue();
            AbstractC16544l.m18094g(c11238i, "<this>");
            C14522e c14522e = new C14522e(3);
            c14522e.m16010B((String) c11238i.f34009Z);
            c14522e.m16025s(AbstractC3005b.m3830a((ArrayList) c11238i.f34010o0));
            C17327D c17327dM20063e = null;
            if (((EnumC18300d) c11238i.f34008Y) == EnumC18300d.f58413Y) {
                c14522e.m16028v("GET", null);
            } else {
                InterfaceC18298b interfaceC18298b = (InterfaceC18298b) c11238i.f34011p0;
                if (interfaceC18298b == null) {
                    throw new IllegalStateException("HTTP POST requires a request body");
                }
                c14522e.m16028v("POST", new C3256l(interfaceC18298b, 0));
            }
            C17358y c17358yM16017i = c14522e.m16017i();
            c3257m.f9915Y = c3248d2;
            c3257m.f9918p0 = 1;
            C0624m c0624m = new C0624m(1, AbstractC8154o0.m8714e(c3257m));
            c0624m.m1262r();
            C18792h c18792hM19035b = ((C17356w) interfaceC17337d).m19035b(c17358yM16017i);
            c0624m.m1264u(new C3255k(c18792hM19035b, 0));
            try {
                c17327dM20063e = c18792hM19035b.m20063e();
                e = null;
            } catch (IOException e10) {
                e = e10;
            }
            if (e != null) {
                c0624m.resumeWith(AbstractC9233X.m9806b(new C1606c("Failed to execute GraphQL http network request", e)));
            } else {
                AbstractC16544l.m18091d(c17327dM20063e);
                c0624m.resumeWith(c17327dM20063e);
            }
            Object objM1261q = c0624m.m1261q();
            EnumC19250a enumC19250a2 = EnumC19250a.f61036Y;
            if (objM1261q == enumC19250a) {
                return enumC19250a;
            }
            obj = objM1261q;
            c3248d = c3248d2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3248d = c3257m.f9915Y;
            AbstractC9233X.m9807c(obj);
        }
        C17327D c17327d = (C17327D) obj;
        c3248d.getClass();
        AbstractC16544l.m18094g(c17327d, "<this>");
        ArrayList arrayList = new ArrayList();
        AbstractC17329F abstractC17329F = c17327d.f55179s0;
        AbstractC16544l.m18091d(abstractC17329F);
        InterfaceC0677k bodySource = abstractC17329F.mo18988O0();
        AbstractC16544l.m18094g(bodySource, "bodySource");
        C17348o c17348o = c17327d.f55178r0;
        C3508g c3508gM8929t = AbstractC8301I.m8929t(0, c17348o.size());
        ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(c3508gM8929t, 10));
        C3507f it = c3508gM8929t.iterator();
        while (it.f10596o0) {
            int iMo4199a = it.mo4199a();
            arrayList2.add(new C18299c(c17348o.m19014m(iMo4199a), c17348o.m19018s(iMo4199a)));
        }
        arrayList.addAll(arrayList2);
        return new C18301e(c17327d.f55176p0, arrayList, bodySource);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
