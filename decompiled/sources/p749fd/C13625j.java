package p749fd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC16544l;
import p1081wc.C20859E;
import p1081wc.InterfaceC20904w;
import p349O0.C5975S;
import p349O0.C5994b0;
import p349O0.C5997d;
import p349O0.C6002f0;
import p492U1.C7545j;
import p523V9.AbstractC8088f6;
import p586Y0.C9566r;
import p586Y0.C9572x;
import p759g1.C13800b;
import p774h1.C14365u;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p909nm.C17690x;

/* JADX INFO: renamed from: fd.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C13625j {

    /* JADX INFO: renamed from: a */
    public final String f43048a;

    /* JADX INFO: renamed from: b */
    public final C9566r f43049b;

    /* JADX INFO: renamed from: c */
    public final C9566r f43050c;

    /* JADX INFO: renamed from: d */
    public final C9566r f43051d;

    /* JADX INFO: renamed from: e */
    public final C5994b0 f43052e;

    /* JADX INFO: renamed from: f */
    public final C5994b0 f43053f;

    /* JADX INFO: renamed from: g */
    public final C6002f0 f43054g;

    /* JADX INFO: renamed from: h */
    public long f43055h;

    /* JADX INFO: renamed from: i */
    public long f43056i;

    public C13625j(String image) {
        AbstractC16544l.m18094g(image, "image");
        this.f43048a = image;
        this.f43049b = new C9566r();
        this.f43050c = new C9566r();
        this.f43051d = new C9566r();
        this.f43052e = C5997d.m6428O(1.0f);
        this.f43053f = C5997d.m6428O(AbstractC13627l.f43058a);
        this.f43054g = C5997d.m6430Q(new C14365u(C14365u.f45052b), C5975S.f19448r0);
        this.f43055h = 0L;
        this.f43056i = 0L;
    }

    /* JADX INFO: renamed from: a */
    public final void m15146a(long j10, InterfaceC20904w analyticsService) {
        AbstractC16544l.m18094g(analyticsService, "analyticsService");
        analyticsService.mo21447a(C20859E.f66350d, C17690x.f56481Y);
        C13800b[] c13800bArr = {new C13800b(j10)};
        C9566r c9566r = new C9566r();
        c9566r.addAll(AbstractC17678l.m19291N(c13800bArr));
        C13621f c13621f = new C13621f(c9566r, this.f43053f.m6409g(), ((C14365u) this.f43054g.getValue()).f45062a, this.f43052e.m6409g());
        this.f43049b.add(c13621f);
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c9566r, 10));
        Iterator<E> it = c9566r.iterator();
        while (it.hasNext()) {
            long j11 = ((C13800b) it.next()).f43584a;
            float fM15149a = AbstractC13627l.m15149a(this.f43055h, this.f43056i);
            arrayList.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j11) / fM15149a, C13800b.m15307h(j11) / fM15149a)));
        }
        this.f43051d.add(C13621f.m15145a(c13621f, AbstractC17680n.m19323D0(arrayList), 0.0f, 14));
        this.f43050c.clear();
    }

    /* JADX INFO: renamed from: b */
    public final void m15147b(long j10) {
        long j11 = this.f43056i;
        this.f43056i = j10;
        if (C7545j.m7886a(j11, j10) || C7545j.m7886a(this.f43055h, 0L)) {
            return;
        }
        float fM15149a = AbstractC13627l.m15149a(this.f43055h, j10);
        C9566r c9566r = this.f43051d;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(c9566r, 10));
        ListIterator listIterator = c9566r.listIterator();
        while (true) {
            C9572x c9572x = (C9572x) listIterator;
            if (!c9572x.hasNext()) {
                C9566r c9566r2 = this.f43049b;
                c9566r2.clear();
                c9566r2.addAll(arrayList);
                return;
            }
            C13621f c13621f = (C13621f) c9572x.next();
            float f10 = c13621f.f43032b * fM15149a;
            List list = c13621f.f43031a;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long j12 = ((C13800b) it.next()).f43584a;
                float fM15149a2 = AbstractC13627l.m15149a(this.f43055h, this.f43056i);
                arrayList2.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j12) * fM15149a2, C13800b.m15307h(j12) * fM15149a2)));
            }
            arrayList.add(C13621f.m15145a(c13621f, AbstractC17680n.m19323D0(arrayList2), f10, 12));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m15148c(long j10) {
        C9566r c9566r = this.f43049b;
        if (c9566r.isEmpty()) {
            return;
        }
        ((C13621f) AbstractC17680n.m19351a0(c9566r)).f43031a.add(new C13800b(j10));
        List list = ((C13621f) AbstractC17680n.m19351a0(this.f43051d)).f43031a;
        float fM15149a = AbstractC13627l.m15149a(this.f43055h, this.f43056i);
        list.add(new C13800b(AbstractC8088f6.m8536b(C13800b.m15306g(j10) / fM15149a, C13800b.m15307h(j10) / fM15149a)));
    }
}
