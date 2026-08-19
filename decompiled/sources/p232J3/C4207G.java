package p232J3;

import bb.AbstractC11278C;
import bb.AbstractC11320m;
import bb.C11276A;
import bb.C11287L;
import bb.C11294T;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import p1016t3.AbstractC19764N;
import p1016t3.C19751A;
import p1016t3.C19791r;
import p1016t3.C19792s;
import p1016t3.C19793t;
import p1016t3.C19795v;
import p1016t3.C19797x;
import p1073w3.AbstractC20817s;
import p1142z3.InterfaceC21730C;
import p305M3.C5285e;
import p372P3.C6337s;
import p525Vb.C8258a;

/* JADX INFO: renamed from: J3.G */
/* JADX INFO: loaded from: classes.dex */
public final class C4207G extends AbstractC4237i {

    /* JADX INFO: renamed from: r */
    public static final C19797x f13670r;

    /* JADX INFO: renamed from: k */
    public final AbstractC4226a[] f13671k;

    /* JADX INFO: renamed from: l */
    public final AbstractC19764N[] f13672l;

    /* JADX INFO: renamed from: m */
    public final ArrayList f13673m;

    /* JADX INFO: renamed from: n */
    public final C8258a f13674n;

    /* JADX INFO: renamed from: o */
    public int f13675o;

    /* JADX INFO: renamed from: p */
    public long[][] f13676p;

    /* JADX INFO: renamed from: q */
    public C4206F f13677q;

    static {
        C6337s c6337s = new C6337s(5);
        C11276A c11276a = AbstractC11278C.f34162Z;
        C11294T c11294t = C11294T.f34185q0;
        Collections.emptyList();
        C11294T c11294t2 = C11294T.f34185q0;
        C19792s c19792s = new C19792s();
        f13670r = new C19797x("MergingMediaSource", new C19791r(c6337s), null, new C19793t(c19792s), C19751A.f62530y, C19795v.f62784a);
    }

    public C4207G(AbstractC4226a... abstractC4226aArr) {
        C8258a c8258a = new C8258a();
        this.f13671k = abstractC4226aArr;
        this.f13674n = c8258a;
        this.f13673m = new ArrayList(Arrays.asList(abstractC4226aArr));
        this.f13675o = -1;
        this.f13672l = new AbstractC19764N[abstractC4226aArr.length];
        this.f13676p = new long[0][];
        new HashMap();
        AbstractC11320m.m12724c(8, "expectedKeys");
        new C11287L().m12741a().m10204Q();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: a */
    public final InterfaceC4251w mo4929a(C4253y c4253y, C5285e c5285e, long j10) {
        AbstractC4226a[] abstractC4226aArr = this.f13671k;
        int length = abstractC4226aArr.length;
        InterfaceC4251w[] interfaceC4251wArr = new InterfaceC4251w[length];
        AbstractC19764N[] abstractC19764NArr = this.f13672l;
        int iMo2413b = abstractC19764NArr[0].mo2413b(c4253y.f13895a);
        for (int i10 = 0; i10 < length; i10++) {
            interfaceC4251wArr[i10] = abstractC4226aArr[i10].mo4929a(c4253y.m5016a(abstractC19764NArr[i10].mo2419l(iMo2413b)), c5285e, j10 - this.f13676p[iMo2413b][i10]);
        }
        return new C4205E(this.f13674n, this.f13676p[iMo2413b], interfaceC4251wArr);
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: g */
    public final C19797x mo4930g() {
        AbstractC4226a[] abstractC4226aArr = this.f13671k;
        return abstractC4226aArr.length > 0 ? abstractC4226aArr[0].mo4930g() : f13670r;
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: i */
    public final void mo4931i() throws C4206F {
        C4206F c4206f = this.f13677q;
        if (c4206f != null) {
            throw c4206f;
        }
        super.mo4931i();
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: k */
    public final void mo4932k(InterfaceC21730C interfaceC21730C) {
        this.f13848j = interfaceC21730C;
        this.f13847i = AbstractC20817s.m21411l(null);
        int i10 = 0;
        while (true) {
            AbstractC4226a[] abstractC4226aArr = this.f13671k;
            if (i10 >= abstractC4226aArr.length) {
                return;
            }
            m5008w(Integer.valueOf(i10), abstractC4226aArr[i10]);
            i10++;
        }
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: m */
    public final void mo4933m(InterfaceC4251w interfaceC4251w) {
        C4205E c4205e = (C4205E) interfaceC4251w;
        int i10 = 0;
        while (true) {
            AbstractC4226a[] abstractC4226aArr = this.f13671k;
            if (i10 >= abstractC4226aArr.length) {
                return;
            }
            AbstractC4226a abstractC4226a = abstractC4226aArr[i10];
            InterfaceC4251w interfaceC4251w2 = c4205e.f13661Y[i10];
            if (interfaceC4251w2 instanceof C4225Z) {
                interfaceC4251w2 = ((C4225Z) interfaceC4251w2).f13804Y;
            }
            abstractC4226a.mo4933m(interfaceC4251w2);
            i10++;
        }
    }

    @Override // p232J3.AbstractC4237i, p232J3.AbstractC4226a
    /* JADX INFO: renamed from: o */
    public final void mo4934o() {
        super.mo4934o();
        Arrays.fill(this.f13672l, (Object) null);
        this.f13675o = -1;
        this.f13677q = null;
        ArrayList arrayList = this.f13673m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f13671k);
    }

    @Override // p232J3.AbstractC4226a
    /* JADX INFO: renamed from: r */
    public final void mo4935r(C19797x c19797x) {
        this.f13671k[0].mo4935r(c19797x);
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: s */
    public final C4253y mo4936s(Object obj, C4253y c4253y) {
        if (((Integer) obj).intValue() == 0) {
            return c4253y;
        }
        return null;
    }

    @Override // p232J3.AbstractC4237i
    /* JADX INFO: renamed from: v */
    public final void mo4937v(Object obj, AbstractC4226a abstractC4226a, AbstractC19764N abstractC19764N) {
        Integer num = (Integer) obj;
        if (this.f13677q != null) {
            return;
        }
        if (this.f13675o == -1) {
            this.f13675o = abstractC19764N.mo2417h();
        } else if (abstractC19764N.mo2417h() != this.f13675o) {
            this.f13677q = new C4206F();
            return;
        }
        int length = this.f13676p.length;
        AbstractC19764N[] abstractC19764NArr = this.f13672l;
        if (length == 0) {
            this.f13676p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f13675o, abstractC19764NArr.length);
        }
        ArrayList arrayList = this.f13673m;
        arrayList.remove(abstractC4226a);
        abstractC19764NArr[num.intValue()] = abstractC19764N;
        if (arrayList.isEmpty()) {
            m4995l(abstractC19764NArr[0]);
        }
    }
}
