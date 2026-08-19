package p591Y5;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p567X5.C9067q;
import p640a6.C10506a;
import p675c6.C11676k;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14417f;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9661l extends AbstractC9653d {

    /* JADX INFO: renamed from: i */
    public final C11676k f29112i;

    /* JADX INFO: renamed from: j */
    public final Path f29113j;

    /* JADX INFO: renamed from: k */
    public Path f29114k;

    /* JADX INFO: renamed from: l */
    public Path f29115l;

    /* JADX INFO: renamed from: m */
    public ArrayList f29116m;

    public C9661l(List list) {
        super(list);
        this.f29112i = new C11676k();
        this.f29113j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:102:0x027b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0333  */
    /* JADX WARN: Code duplicated, block: B:38:0x0152  */
    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        C11676k c11676k;
        C11676k c11676k2;
        C11676k c11676k3;
        C11676k c11676k4;
        int i10;
        C11676k c11676k5;
        C11676k c11676k6;
        int i11;
        boolean z6;
        int i12;
        int i13;
        boolean z10;
        C11676k c11676k7 = (C11676k) c14935a.f46525b;
        C11676k c11676k8 = (C11676k) c14935a.f46526c;
        C11676k c11676k9 = c11676k8 == null ? c11676k7 : c11676k8;
        C11676k c11676k10 = this.f29112i;
        if (c11676k10.f35379b == null) {
            c11676k10.f35379b = new PointF();
        }
        c11676k10.f35380c = c11676k7.f35380c || c11676k9.f35380c;
        ArrayList arrayList = c11676k7.f35378a;
        int size = arrayList.size();
        int size2 = c11676k9.f35378a.size();
        ArrayList arrayList2 = c11676k9.f35378a;
        if (size != size2) {
            AbstractC14413b.m15913b("Curves must have the same number of control points. Shape 1: " + arrayList.size() + "\tShape 2: " + arrayList2.size());
        }
        int iMin = Math.min(arrayList.size(), arrayList2.size());
        ArrayList arrayList3 = c11676k10.f35378a;
        if (arrayList3.size() < iMin) {
            for (int size3 = arrayList3.size(); size3 < iMin; size3++) {
                arrayList3.add(new C10506a());
            }
        } else if (arrayList3.size() > iMin) {
            for (int size4 = arrayList3.size() - 1; size4 >= iMin; size4--) {
                arrayList3.remove(arrayList3.size() - 1);
            }
        }
        PointF pointF = c11676k7.f35379b;
        PointF pointF2 = c11676k9.f35379b;
        c11676k10.m13024a(AbstractC14417f.m15928e(pointF.x, pointF2.x, f10), AbstractC14417f.m15928e(pointF.y, pointF2.y, f10));
        int size5 = arrayList3.size() - 1;
        while (size5 >= 0) {
            C10506a c10506a = (C10506a) arrayList.get(size5);
            C10506a c10506a2 = (C10506a) arrayList2.get(size5);
            PointF pointF3 = c10506a.f31125a;
            PointF pointF4 = c10506a2.f31125a;
            C11676k c11676k11 = c11676k10;
            ((C10506a) arrayList3.get(size5)).f31125a.set(AbstractC14417f.m15928e(pointF3.x, pointF4.x, f10), AbstractC14417f.m15928e(pointF3.y, pointF4.y, f10));
            C10506a c10506a3 = (C10506a) arrayList3.get(size5);
            PointF pointF5 = c10506a.f31126b;
            float f11 = pointF5.x;
            PointF pointF6 = c10506a2.f31126b;
            c10506a3.f31126b.set(AbstractC14417f.m15928e(f11, pointF6.x, f10), AbstractC14417f.m15928e(pointF5.y, pointF6.y, f10));
            C10506a c10506a4 = (C10506a) arrayList3.get(size5);
            PointF pointF7 = c10506a.f31127c;
            float f12 = pointF7.x;
            PointF pointF8 = c10506a2.f31127c;
            c10506a4.f31127c.set(AbstractC14417f.m15928e(f12, pointF8.x, f10), AbstractC14417f.m15928e(pointF7.y, pointF8.y, f10));
            size5--;
            c11676k10 = c11676k11;
        }
        C11676k c11676k12 = c11676k10;
        ArrayList arrayList4 = this.f29116m;
        if (arrayList4 != null) {
            int size6 = arrayList4.size() - 1;
            c11676k3 = c11676k12;
            while (size6 >= 0) {
                C9067q c9067q = (C9067q) this.f29116m.get(size6);
                c9067q.getClass();
                ArrayList arrayList5 = c11676k3.f35378a;
                if (arrayList5.size() <= 2) {
                    c11676k5 = c11676k7;
                    c11676k6 = c11676k8;
                    i11 = size6;
                } else {
                    float fFloatValue = ((Float) c9067q.f27755b.mo10234e()).floatValue();
                    if (fFloatValue == 0.0f) {
                        c11676k5 = c11676k7;
                        c11676k6 = c11676k8;
                        i11 = size6;
                    } else {
                        boolean z11 = c11676k3.f35380c;
                        int size7 = arrayList5.size() - 1;
                        int i14 = 0;
                        while (size7 >= 0) {
                            C10506a c10506a5 = (C10506a) arrayList5.get(size7);
                            C10506a c10506a6 = (C10506a) arrayList5.get(C9067q.m9624d(size7 - 1, arrayList5.size()));
                            PointF pointF9 = (size7 != 0 || z11) ? c10506a6.f31127c : c11676k3.f35379b;
                            i14 = (((size7 != 0 || z11) ? c10506a6.f31126b : pointF9).equals(pointF9) && c10506a5.f31125a.equals(pointF9) && !(!c11676k3.f35380c && (size7 == 0 || size7 == arrayList5.size() + (-1)))) ? i14 + 2 : i14 + 1;
                            size7--;
                        }
                        C11676k c11676k13 = c9067q.f27756c;
                        if (c11676k13 == null || c11676k13.f35378a.size() != i14) {
                            ArrayList arrayList6 = new ArrayList(i14);
                            for (int i15 = 0; i15 < i14; i15++) {
                                arrayList6.add(new C10506a());
                            }
                            i10 = 0;
                            c9067q.f27756c = new C11676k(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i10 = 0;
                        }
                        C11676k c11676k14 = c9067q.f27756c;
                        c11676k14.f35380c = z11;
                        PointF pointF10 = c11676k3.f35379b;
                        c11676k14.m13024a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = c11676k14.f35378a;
                        boolean z12 = c11676k3.f35380c;
                        int i16 = i10;
                        int i17 = i16;
                        while (i16 < arrayList5.size()) {
                            C10506a c10506a7 = (C10506a) arrayList5.get(i16);
                            C10506a c10506a8 = (C10506a) arrayList5.get(C9067q.m9624d(i16 - 1, arrayList5.size()));
                            C10506a c10506a9 = (C10506a) arrayList5.get(C9067q.m9624d(i16 - 2, arrayList5.size()));
                            PointF pointF11 = (i16 != 0 || z12) ? c10506a8.f31127c : c11676k3.f35379b;
                            PointF pointF12 = (i16 != 0 || z12) ? c10506a8.f31126b : pointF11;
                            PointF pointF13 = c10506a7.f31125a;
                            PointF pointF14 = c10506a9.f31127c;
                            C11676k c11676k15 = c11676k7;
                            if (!c11676k3.f35380c) {
                                if (i16 != 0) {
                                    z10 = true;
                                    if (i16 == arrayList5.size() - 1) {
                                    }
                                    if (pointF12.equals(pointF11) || !pointF13.equals(pointF11) || z6) {
                                        i12 = size6;
                                        i13 = i16;
                                        C10506a c10506a10 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                        C10506a c10506a11 = (C10506a) arrayList7.get(i17);
                                        PointF pointF15 = c10506a8.f31126b;
                                        c10506a10.f31126b.set(pointF15.x, pointF15.y);
                                        PointF pointF16 = c10506a8.f31127c;
                                        c10506a10.f31127c.set(pointF16.x, pointF16.y);
                                        PointF pointF17 = c10506a7.f31125a;
                                        c10506a11.f31125a.set(pointF17.x, pointF17.y);
                                        i17++;
                                    } else {
                                        float f13 = pointF11.x;
                                        float f14 = f13 - pointF14.x;
                                        float f15 = pointF11.y;
                                        float f16 = f15 - pointF14.y;
                                        PointF pointF18 = c10506a7.f31127c;
                                        float f17 = pointF18.x - f13;
                                        float f18 = pointF18.y - f15;
                                        i12 = size6;
                                        i13 = i16;
                                        float fHypot = (float) Math.hypot(f14, f16);
                                        float fHypot2 = (float) Math.hypot(f17, f18);
                                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                                        float f19 = pointF11.x;
                                        float fM13818i = AbstractC12107L1.m13818i(pointF14.x, f19, fMin, f19);
                                        float f20 = pointF11.y;
                                        float fM13818i2 = AbstractC12107L1.m13818i(pointF14.y, f20, fMin, f20);
                                        float fM13818i3 = AbstractC12107L1.m13818i(pointF18.x, f19, fMin2, f19);
                                        float fM13818i4 = AbstractC12107L1.m13818i(pointF18.y, f20, fMin2, f20);
                                        float f21 = fM13818i - ((fM13818i - f19) * 0.5519f);
                                        float f22 = fM13818i2 - ((fM13818i2 - f20) * 0.5519f);
                                        float f23 = fM13818i3 - ((fM13818i3 - f19) * 0.5519f);
                                        float f24 = fM13818i4 - ((fM13818i4 - f20) * 0.5519f);
                                        C10506a c10506a12 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                        C10506a c10506a13 = (C10506a) arrayList7.get(i17);
                                        c10506a12.f31126b.set(fM13818i, fM13818i2);
                                        c10506a12.f31127c.set(fM13818i, fM13818i2);
                                        if (i13 == 0) {
                                            c11676k14.m13024a(fM13818i, fM13818i2);
                                        }
                                        c10506a13.f31125a.set(f21, f22);
                                        C10506a c10506a14 = (C10506a) arrayList7.get(i17 + 1);
                                        c10506a13.f31126b.set(f23, f24);
                                        c10506a13.f31127c.set(fM13818i3, fM13818i4);
                                        c10506a14.f31125a.set(fM13818i3, fM13818i4);
                                        i17 += 2;
                                    }
                                    i16 = i13 + 1;
                                    z12 = z12;
                                    c11676k8 = c11676k8;
                                    c11676k7 = c11676k15;
                                    c11676k3 = c11676k3;
                                    size6 = i12;
                                    arrayList5 = arrayList5;
                                } else {
                                    z10 = true;
                                }
                                z6 = z10;
                                if (pointF12.equals(pointF11)) {
                                    i12 = size6;
                                    i13 = i16;
                                    C10506a c10506a15 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                    C10506a c10506a16 = (C10506a) arrayList7.get(i17);
                                    PointF pointF19 = c10506a8.f31126b;
                                    c10506a15.f31126b.set(pointF19.x, pointF19.y);
                                    PointF pointF110 = c10506a8.f31127c;
                                    c10506a15.f31127c.set(pointF110.x, pointF110.y);
                                    PointF pointF111 = c10506a7.f31125a;
                                    c10506a16.f31125a.set(pointF111.x, pointF111.y);
                                    i17++;
                                } else {
                                    i12 = size6;
                                    i13 = i16;
                                    C10506a c10506a17 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                    C10506a c10506a18 = (C10506a) arrayList7.get(i17);
                                    PointF pointF112 = c10506a8.f31126b;
                                    c10506a17.f31126b.set(pointF112.x, pointF112.y);
                                    PointF pointF113 = c10506a8.f31127c;
                                    c10506a17.f31127c.set(pointF113.x, pointF113.y);
                                    PointF pointF114 = c10506a7.f31125a;
                                    c10506a18.f31125a.set(pointF114.x, pointF114.y);
                                    i17++;
                                }
                                i16 = i13 + 1;
                                z12 = z12;
                                c11676k8 = c11676k8;
                                c11676k7 = c11676k15;
                                c11676k3 = c11676k3;
                                size6 = i12;
                                arrayList5 = arrayList5;
                            }
                            z6 = false;
                            if (pointF12.equals(pointF11)) {
                                i12 = size6;
                                i13 = i16;
                                C10506a c10506a19 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                C10506a c10506a110 = (C10506a) arrayList7.get(i17);
                                PointF pointF115 = c10506a8.f31126b;
                                c10506a19.f31126b.set(pointF115.x, pointF115.y);
                                PointF pointF116 = c10506a8.f31127c;
                                c10506a19.f31127c.set(pointF116.x, pointF116.y);
                                PointF pointF117 = c10506a7.f31125a;
                                c10506a110.f31125a.set(pointF117.x, pointF117.y);
                                i17++;
                            } else {
                                i12 = size6;
                                i13 = i16;
                                C10506a c10506a111 = (C10506a) arrayList7.get(C9067q.m9624d(i17 - 1, arrayList7.size()));
                                C10506a c10506a112 = (C10506a) arrayList7.get(i17);
                                PointF pointF118 = c10506a8.f31126b;
                                c10506a111.f31126b.set(pointF118.x, pointF118.y);
                                PointF pointF119 = c10506a8.f31127c;
                                c10506a111.f31127c.set(pointF119.x, pointF119.y);
                                PointF pointF1110 = c10506a7.f31125a;
                                c10506a112.f31125a.set(pointF1110.x, pointF1110.y);
                                i17++;
                            }
                            i16 = i13 + 1;
                            z12 = z12;
                            c11676k8 = c11676k8;
                            c11676k7 = c11676k15;
                            c11676k3 = c11676k3;
                            size6 = i12;
                            arrayList5 = arrayList5;
                        }
                        c11676k5 = c11676k7;
                        c11676k6 = c11676k8;
                        i11 = size6;
                        c11676k3 = c11676k14;
                    }
                }
                size6 = i11 - 1;
                c11676k8 = c11676k6;
                c11676k7 = c11676k5;
            }
            c11676k = c11676k7;
            c11676k2 = c11676k8;
        } else {
            c11676k = c11676k7;
            c11676k2 = c11676k8;
            c11676k3 = c11676k12;
        }
        Path path = this.f29113j;
        AbstractC14417f.m15927d(c11676k3, path);
        if (this.f29086e == null) {
            return path;
        }
        if (this.f29114k == null) {
            this.f29114k = new Path();
            this.f29115l = new Path();
        }
        AbstractC14417f.m15927d(c11676k, this.f29114k);
        if (c11676k2 != null) {
            c11676k4 = c11676k2;
            AbstractC14417f.m15927d(c11676k4, this.f29115l);
        } else {
            c11676k4 = c11676k2;
        }
        C15384c c15384c = this.f29086e;
        float fFloatValue2 = c14935a.f46531h.floatValue();
        Path path2 = this.f29114k;
        return (Path) c15384c.m16641r(c14935a.f46530g, fFloatValue2, path2, c11676k4 == null ? path2 : this.f29115l, f10, m10233d(), this.f29085d);
    }
}
