package p567X5;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.List;
import p001A.AbstractC0010F;
import p349O0.C5980U0;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p591Y5.AbstractC9653d;
import p591Y5.C9656g;
import p591Y5.InterfaceC9650a;
import p640a6.C10510e;
import p675c6.C11673h;
import p698d6.AbstractC13029b;
import p779h6.AbstractC14417f;

/* JADX INFO: renamed from: X5.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9064n implements InterfaceC9063m, InterfaceC9650a, InterfaceC9061k {

    /* JADX INFO: renamed from: e */
    public final String f27719e;

    /* JADX INFO: renamed from: f */
    public final C7794w f27720f;

    /* JADX INFO: renamed from: g */
    public final int f27721g;

    /* JADX INFO: renamed from: h */
    public final boolean f27722h;

    /* JADX INFO: renamed from: i */
    public final boolean f27723i;

    /* JADX INFO: renamed from: j */
    public final C9656g f27724j;

    /* JADX INFO: renamed from: k */
    public final AbstractC9653d f27725k;

    /* JADX INFO: renamed from: l */
    public final C9656g f27726l;

    /* JADX INFO: renamed from: m */
    public final C9656g f27727m;

    /* JADX INFO: renamed from: n */
    public final C9656g f27728n;

    /* JADX INFO: renamed from: o */
    public final C9656g f27729o;

    /* JADX INFO: renamed from: p */
    public final C9656g f27730p;

    /* JADX INFO: renamed from: r */
    public boolean f27732r;

    /* JADX INFO: renamed from: a */
    public final Path f27715a = new Path();

    /* JADX INFO: renamed from: b */
    public final Path f27716b = new Path();

    /* JADX INFO: renamed from: c */
    public final PathMeasure f27717c = new PathMeasure();

    /* JADX INFO: renamed from: d */
    public final float[] f27718d = new float[2];

    /* JADX INFO: renamed from: q */
    public final C5980U0 f27731q = new C5980U0(1);

    public C9064n(C7794w c7794w, AbstractC13029b abstractC13029b, C11673h c11673h) {
        this.f27720f = c7794w;
        this.f27719e = c11673h.f35360a;
        int i10 = c11673h.f35361b;
        this.f27721g = i10;
        this.f27722h = c11673h.f35369j;
        this.f27723i = c11673h.f35370k;
        C9656g c9656gMo10670p = c11673h.f35362c.mo10670p();
        this.f27724j = c9656gMo10670p;
        AbstractC9653d abstractC9653dMo10670p = c11673h.f35363d.mo10670p();
        this.f27725k = abstractC9653dMo10670p;
        C9656g c9656gMo10670p2 = c11673h.f35364e.mo10670p();
        this.f27726l = c9656gMo10670p2;
        C9656g c9656gMo10670p3 = c11673h.f35366g.mo10670p();
        this.f27728n = c9656gMo10670p3;
        C9656g c9656gMo10670p4 = c11673h.f35368i.mo10670p();
        this.f27730p = c9656gMo10670p4;
        if (i10 == 1) {
            this.f27727m = c11673h.f35365f.mo10670p();
            this.f27729o = c11673h.f35367h.mo10670p();
        } else {
            this.f27727m = null;
            this.f27729o = null;
        }
        abstractC13029b.m14772d(c9656gMo10670p);
        abstractC13029b.m14772d(abstractC9653dMo10670p);
        abstractC13029b.m14772d(c9656gMo10670p2);
        abstractC13029b.m14772d(c9656gMo10670p3);
        abstractC13029b.m14772d(c9656gMo10670p4);
        if (i10 == 1) {
            abstractC13029b.m14772d(this.f27727m);
            abstractC13029b.m14772d(this.f27729o);
        }
        c9656gMo10670p.m10230a(this);
        abstractC9653dMo10670p.m10230a(this);
        c9656gMo10670p2.m10230a(this);
        c9656gMo10670p3.m10230a(this);
        c9656gMo10670p4.m10230a(this);
        if (i10 == 1) {
            this.f27727m.m10230a(this);
            this.f27729o.m10230a(this);
        }
    }

    @Override // p591Y5.InterfaceC9650a
    /* JADX INFO: renamed from: a */
    public final void mo9610a() {
        this.f27732r = false;
        this.f27720f.invalidateSelf();
    }

    @Override // p567X5.InterfaceC9053c
    /* JADX INFO: renamed from: b */
    public final void mo9611b(List list, List list2) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i10 >= arrayList.size()) {
                return;
            }
            InterfaceC9053c interfaceC9053c = (InterfaceC9053c) arrayList.get(i10);
            if (interfaceC9053c instanceof C9070t) {
                C9070t c9070t = (C9070t) interfaceC9053c;
                if (c9070t.f27771c == 1) {
                    this.f27731q.f19461a.add(c9070t);
                    c9070t.m9625d(this);
                }
            }
            i10++;
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        C9656g c9656g;
        C9656g c9656g2;
        if (obj == InterfaceC7763A.f24530r) {
            this.f27724j.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24531s) {
            this.f27726l.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24521i) {
            this.f27725k.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24532t && (c9656g2 = this.f27727m) != null) {
            c9656g2.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24533u) {
            this.f27728n.m10239j(c15384c);
            return;
        }
        if (obj == InterfaceC7763A.f24534v && (c9656g = this.f27729o) != null) {
            c9656g.m10239j(c15384c);
        } else if (obj == InterfaceC7763A.f24535w) {
            this.f27730p.m10239j(c15384c);
        }
    }

    @Override // p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: g */
    public final void mo9615g(C10510e c10510e, int i10, ArrayList arrayList, C10510e c10510e2) {
        AbstractC14417f.m15929f(c10510e, i10, arrayList, c10510e2, this);
    }

    @Override // p567X5.InterfaceC9053c
    public final String getName() {
        return this.f27719e;
    }

    @Override // p567X5.InterfaceC9063m
    /* JADX INFO: renamed from: n */
    public final Path mo9617n() {
        double d10;
        float fCos;
        float fSin;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        double d11;
        float f14;
        boolean z6 = this.f27732r;
        Path path = this.f27715a;
        if (z6) {
            return path;
        }
        path.reset();
        if (this.f27722h) {
            this.f27732r = true;
            return path;
        }
        int iM24h = AbstractC0010F.m24h(this.f27721g);
        AbstractC9653d abstractC9653d = this.f27725k;
        C9656g c9656g = this.f27728n;
        C9656g c9656g2 = this.f27730p;
        C9656g c9656g3 = this.f27726l;
        C9656g c9656g4 = this.f27724j;
        if (iM24h == 0) {
            float fFloatValue = ((Float) c9656g4.mo10234e()).floatValue();
            double radians = Math.toRadians((c9656g3 != null ? ((Float) c9656g3.mo10234e()).floatValue() : 0.0d) - 90.0d);
            double d12 = fFloatValue;
            float f15 = (float) (6.283185307179586d / d12);
            if (this.f27723i) {
                f15 *= -1.0f;
            }
            float f16 = f15;
            float f17 = 2.0f;
            float f18 = f16 / 2.0f;
            float f19 = fFloatValue - ((int) fFloatValue);
            if (f19 != 0.0f) {
                radians += (double) ((1.0f - f19) * f18);
            }
            float fFloatValue2 = ((Float) c9656g.mo10234e()).floatValue();
            float fFloatValue3 = ((Float) this.f27727m.mo10234e()).floatValue();
            C9656g c9656g5 = this.f27729o;
            float fFloatValue4 = c9656g5 != null ? ((Float) c9656g5.mo10234e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = c9656g2 != null ? ((Float) c9656g2.mo10234e()).floatValue() / 100.0f : 0.0f;
            if (f19 != 0.0f) {
                float fM13818i = AbstractC12107L1.m13818i(fFloatValue2, fFloatValue3, f19, fFloatValue3);
                double d13 = fM13818i;
                f10 = fM13818i;
                fCos = (float) (Math.cos(radians) * d13);
                fSin = (float) (Math.sin(radians) * d13);
                path.moveTo(fCos, fSin);
                d10 = radians + ((double) ((f16 * f19) / 2.0f));
            } else {
                double d14 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d14);
                float fSin2 = (float) (d14 * Math.sin(radians));
                path.moveTo(fCos2, fSin2);
                d10 = radians + ((double) f18);
                fCos = fCos2;
                fSin = fSin2;
                f10 = 0.0f;
            }
            double dCeil = Math.ceil(d12);
            double d15 = 2.0d;
            double d16 = dCeil * 2.0d;
            double d17 = d10;
            int i11 = 0;
            boolean z10 = false;
            while (true) {
                double d18 = i11;
                if (d18 >= d16) {
                    break;
                }
                float f20 = z10 ? fFloatValue2 : fFloatValue3;
                float f21 = (f10 == 0.0f || d18 != d16 - d15) ? f18 : (f16 * f19) / f17;
                if (f10 != 0.0f && d18 == d16 - 1.0d) {
                    f20 = f10;
                }
                double d19 = f20;
                float f22 = fFloatValue2;
                float f23 = f16;
                float fCos3 = (float) (Math.cos(d17) * d19);
                float fSin3 = (float) (d19 * Math.sin(d17));
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f11 = fSin3;
                    f12 = f18;
                    f13 = f21;
                } else {
                    float f24 = f21;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f25 = f18;
                    f11 = fSin3;
                    double dAtan3 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan3);
                    float fSin5 = (float) Math.sin(dAtan3);
                    float f26 = z10 ? fFloatValue4 : fFloatValue5;
                    float f27 = z10 ? fFloatValue5 : fFloatValue4;
                    float f28 = (z10 ? fFloatValue3 : f22) * f26 * 0.47829f;
                    float f29 = fCos4 * f28;
                    float f30 = f28 * fSin4;
                    float f31 = (z10 ? f22 : fFloatValue3) * f27 * 0.47829f;
                    float f32 = fCos5 * f31;
                    float f33 = f31 * fSin5;
                    if (f19 != 0.0f) {
                        if (i11 == 0) {
                            f29 *= f19;
                            f30 *= f19;
                        } else if (d18 == d16 - 1.0d) {
                            f32 *= f19;
                            f33 *= f19;
                        }
                    }
                    f12 = f25;
                    path.cubicTo(fCos - f29, fSin - f30, fCos3 + f32, f11 + f33, fCos3, f11);
                    f13 = f24;
                }
                d17 += (double) f13;
                z10 = !z10;
                i11++;
                fFloatValue3 = fFloatValue3;
                fFloatValue2 = f22;
                f19 = f19;
                fCos = fCos3;
                f18 = f12;
                f16 = f23;
                fSin = f11;
                d15 = 2.0d;
                f17 = 2.0f;
            }
            PointF pointF = (PointF) abstractC9653d.mo10234e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iM24h == 1) {
            int iFloor = (int) Math.floor(((Float) c9656g4.mo10234e()).floatValue());
            double radians2 = Math.toRadians((c9656g3 != null ? ((Float) c9656g3.mo10234e()).floatValue() : 0.0d) - 90.0d);
            double d20 = iFloor;
            float fFloatValue6 = ((Float) c9656g2.mo10234e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) c9656g.mo10234e()).floatValue();
            double d21 = fFloatValue7;
            float fCos6 = (float) (Math.cos(radians2) * d21);
            float fSin6 = (float) (Math.sin(radians2) * d21);
            path.moveTo(fCos6, fSin6);
            double d22 = (float) (6.283185307179586d / d20);
            double dCeil2 = Math.ceil(d20);
            double d23 = radians2 + d22;
            int i12 = 0;
            while (true) {
                double d24 = i12;
                if (d24 >= dCeil2) {
                    break;
                }
                float fCos7 = (float) (Math.cos(d23) * d21);
                double d25 = d22;
                float fSin7 = (float) (Math.sin(d23) * d21);
                if (fFloatValue6 != 0.0f) {
                    d11 = d21;
                    double dAtan4 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan4);
                    float fSin8 = (float) Math.sin(dAtan4);
                    i10 = i12;
                    float f34 = fCos6;
                    double dAtan5 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f35 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f36 = fCos8 * f35;
                    float f37 = fSin8 * f35;
                    float fCos9 = ((float) Math.cos(dAtan5)) * f35;
                    float fSin9 = f35 * ((float) Math.sin(dAtan5));
                    if (d24 == dCeil2 - 1.0d) {
                        Path path2 = this.f27716b;
                        path2.reset();
                        path2.moveTo(f34, fSin6);
                        float f38 = f34 - f36;
                        float f39 = fSin6 - f37;
                        float f40 = fCos9 + fCos7;
                        float f41 = fSin7 + fSin9;
                        path2.cubicTo(f38, f39, f40, f41, fCos7, fSin7);
                        PathMeasure pathMeasure = this.f27717c;
                        pathMeasure.setPath(path2, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        f14 = fFloatValue7;
                        float[] fArr = this.f27718d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path.cubicTo(f38, f39, f40, f41, fArr[0], fArr[1]);
                    } else {
                        f14 = fFloatValue7;
                        path.cubicTo(f34 - f36, fSin6 - f37, fCos7 + fCos9, fSin7 + fSin9, fCos7, fSin7);
                    }
                } else {
                    i10 = i12;
                    d11 = d21;
                    f14 = fFloatValue7;
                    if (d24 != dCeil2 - 1.0d) {
                        path.lineTo(fCos7, fSin7);
                    }
                    i12 = i10 + 1;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    fFloatValue7 = f14;
                    d21 = d11;
                    d22 = d25;
                }
                d23 += d25;
                i12 = i10 + 1;
                fCos6 = fCos7;
                fSin6 = fSin7;
                fFloatValue7 = f14;
                d21 = d11;
                d22 = d25;
            }
            PointF pointF2 = (PointF) abstractC9653d.mo10234e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.f27731q.m6404a(path);
        this.f27732r = true;
        return path;
    }
}
