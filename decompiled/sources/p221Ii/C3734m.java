package p221Ii;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p025An.AbstractC0575H;
import p025An.C0564B0;
import p103Dn.InterfaceC2184i;
import p1135yn.C21555b;
import p1135yn.EnumC21557d;
import p148Fi.AbstractC2805a1;
import p148Fi.AbstractC2817e1;
import p148Fi.AbstractC2829i1;
import p148Fi.C2808b1;
import p148Fi.C2814d1;
import p148Fi.C2820f1;
import p148Fi.C2823g1;
import p148Fi.C2826h1;
import p153Fn.C2925c;
import p228J.AbstractC3794B0;
import p324Mn.C5551u;
import p365Oi.C6256d;
import p365Oi.C6258f;
import p365Oi.InterfaceC6255c;
import p523V9.AbstractC8136l6;
import p530Vi.AbstractC8301I;
import p620Zc.InterfaceC10277b;
import p774h1.AbstractC14334L;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;

/* JADX INFO: renamed from: Ii.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C3734m {

    /* JADX INFO: renamed from: a */
    public final C2925c f11340a;

    /* JADX INFO: renamed from: b */
    public final float f11341b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC10277b f11342c;

    /* JADX INFO: renamed from: d */
    public C3722a f11343d;

    /* JADX INFO: renamed from: e */
    public InterfaceC6255c f11344e;

    /* JADX INFO: renamed from: f */
    public C6256d f11345f;

    /* JADX INFO: renamed from: g */
    public boolean f11346g;

    /* JADX INFO: renamed from: h */
    public float f11347h;

    /* JADX INFO: renamed from: i */
    public final C3735n f11348i;

    /* JADX INFO: renamed from: j */
    public final C5551u f11349j;

    /* JADX INFO: renamed from: k */
    public float f11350k;

    /* JADX INFO: renamed from: l */
    public boolean f11351l;

    /* JADX INFO: renamed from: m */
    public long f11352m;

    /* JADX INFO: renamed from: n */
    public final long f11353n;

    /* JADX INFO: renamed from: o */
    public C0564B0 f11354o;

    /* JADX INFO: renamed from: p */
    public float f11355p;

    /* JADX INFO: renamed from: q */
    public final float f11356q;

    /* JADX INFO: renamed from: r */
    public final float f11357r;

    /* JADX INFO: renamed from: s */
    public AbstractC2829i1 f11358s;

    /* JADX INFO: renamed from: t */
    public AbstractC2829i1 f11359t;

    public C3734m(InterfaceC2184i stateFlow, C2925c c2925c, float f10, InterfaceC10277b hapticEngine, C3722a initialColors, InterfaceC6255c micAmplitudeSource, C6256d bloopAmplitudeSource) {
        AbstractC16544l.m18094g(stateFlow, "stateFlow");
        AbstractC16544l.m18094g(hapticEngine, "hapticEngine");
        AbstractC16544l.m18094g(initialColors, "initialColors");
        AbstractC16544l.m18094g(micAmplitudeSource, "micAmplitudeSource");
        AbstractC16544l.m18094g(bloopAmplitudeSource, "bloopAmplitudeSource");
        this.f11340a = c2925c;
        this.f11341b = f10;
        this.f11342c = hapticEngine;
        this.f11343d = initialColors;
        this.f11344e = micAmplitudeSource;
        this.f11345f = bloopAmplitudeSource;
        C3735n c3735n = new C3735n();
        c3735n.f11360a = 0.0f;
        c3735n.f11361b = 0.0f;
        c3735n.f11362c = Float.MAX_VALUE;
        c3735n.f11363d = Float.MAX_VALUE;
        c3735n.f11364e = 0.0f;
        c3735n.f11365f = 0.0f;
        c3735n.f11366g = 0.0f;
        c3735n.f11367h = 0.0f;
        c3735n.f11368i = 0.0f;
        c3735n.f11369j = 0.0f;
        c3735n.f11370k = Float.MAX_VALUE;
        c3735n.f11371l = 0.0f;
        c3735n.f11372m = 0.0f;
        c3735n.f11373n = 0.0f;
        c3735n.f11374o = 0.0f;
        c3735n.f11375p = new float[4];
        c3735n.f11376q = false;
        c3735n.f11377r = new float[4];
        c3735n.f11378s = new float[4];
        c3735n.f11379t = 0.0f;
        c3735n.f11380u = 0.0f;
        c3735n.f11381v = initialColors;
        this.f11348i = c3735n;
        C5551u.Companion.getClass();
        this.f11349j = new C5551u(AbstractC3794B0.m4501z("instant(...)"));
        this.f11353n = 8L;
        this.f11356q = 0.001f;
        this.f11357r = 2.0f;
        C2820f1 c2820f1 = C2820f1.f8553a;
        this.f11358s = c2820f1;
        this.f11359t = c2820f1;
        AbstractC0575H.m1156D(c2925c, null, null, new C3731j(stateFlow, this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0061 -> B:26:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0076 -> B:26:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m4431a(p221Ii.C3734m r8, sm.AbstractC19687c r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof p221Ii.C3733l
            if (r0 == 0) goto L16
            r0 = r9
            Ii.l r0 = (p221Ii.C3733l) r0
            int r1 = r0.f11339r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f11339r0 = r1
            goto L1b
        L16:
            Ii.l r0 = new Ii.l
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f11337p0
            rm.a r1 = p996rm.EnumC19250a.f61036Y
            int r2 = r0.f11339r0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            int r8 = r0.f11336o0
            int r2 = r0.f11335Z
            Ii.m r5 = r0.f11334Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto L79
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            Ii.m r8 = r0.f11334Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto L51
        L41:
            p571X9.AbstractC9233X.m9807c(r9)
            r0.f11334Y = r8
            r0.f11339r0 = r4
            r5 = 250(0xfa, double:1.235E-321)
            java.lang.Object r9 = p025An.AbstractC0575H.m1184m(r5, r0)
            if (r9 != r1) goto L51
            goto L7d
        L51:
            r9 = 10
            r2 = 0
            r5 = r8
            r8 = r2
            r2 = r9
        L57:
            if (r8 >= r2) goto L7b
            qm.i r9 = r0.getContext()
            boolean r9 = p025An.AbstractC0575H.m1197z(r9)
            if (r9 == 0) goto L79
            Zc.b r9 = r5.f11342c
            r9.mo10877g()
            r0.f11334Y = r5
            r0.f11335Z = r2
            r0.f11336o0 = r8
            r0.f11339r0 = r3
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = p025An.AbstractC0575H.m1184m(r6, r0)
            if (r9 != r1) goto L79
            goto L7d
        L79:
            int r8 = r8 + r4
            goto L57
        L7b:
            mm.C r1 = mm.C17296C.f55119a
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p221Ii.C3734m.m4431a(Ii.m, sm.c):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static float m4432b(float f10, float f11, float f12) {
        return (f11 * f12) + ((1 - f12) * f10);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX INFO: renamed from: c */
    public final C3735n m4433c() {
        float[] fArrM19320A0;
        double dM8662c;
        float f10;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jCurrentTimeMillis - this.f11352m;
        this.f11352m = jCurrentTimeMillis;
        long j11 = this.f11353n;
        C3735n c3735n = this.f11348i;
        if (j10 < j11) {
            return c3735n;
        }
        boolean z6 = this.f11359t instanceof AbstractC2817e1;
        float f11 = this.f11341b;
        if (z6) {
            fArrM19320A0 = this.f11344e.mo6743b(f11);
        } else {
            float[] fArr = c3735n.f11375p;
            ArrayList arrayList = new ArrayList(fArr.length);
            for (float f12 : fArr) {
                arrayList.add(Float.valueOf(m4432b(f12, 0.0f, 0.05f)));
            }
            fArrM19320A0 = AbstractC17680n.m19320A0(arrayList);
        }
        c3735n.f11375p = fArrM19320A0;
        boolean z10 = c3735n.f11376q;
        boolean z11 = this.f11351l;
        if (z10 != z11) {
            if (z11) {
                c3735n.f11362c = c3735n.f11360a;
                c3735n.f11363d = Float.MAX_VALUE;
            } else {
                c3735n.f11363d = c3735n.f11360a;
            }
            c3735n.f11376q = z11;
        }
        c3735n.f11361b = this.f11344e.mo6742a(f11, this.f11346g);
        C5551u.Companion.getClass();
        long jM5946b = new C5551u(AbstractC3794B0.m4501z("instant(...)")).m5946b(this.f11349j);
        EnumC21557d unit = EnumC21557d.SECONDS;
        AbstractC16544l.m18094g(unit, "unit");
        if (jM5946b == C21555b.f68261o0) {
            dM8662c = Double.POSITIVE_INFINITY;
        } else if (jM5946b == C21555b.f68262p0) {
            dM8662c = Double.NEGATIVE_INFINITY;
        } else {
            dM8662c = AbstractC8136l6.m8662c(jM5946b >> 1, (((int) jM5946b) & 1) == 0 ? EnumC21557d.NANOSECONDS : EnumC21557d.MILLISECONDS, unit);
        }
        c3735n.f11360a = (float) dM8662c;
        if (AbstractC16544l.m18089b(this.f11359t, C2823g1.f8561a)) {
            if (this.f11346g) {
                if (this.f11355p == 0.0f) {
                    this.f11355p = c3735n.f11369j;
                }
                float fMin = Math.min(c3735n.f11360a - this.f11355p, 0.2f);
                this.f11355p = c3735n.f11360a;
                float[] fArrM6746a = C6258f.m6746a(this.f11345f.f20331b.f20345f);
                float f13 = this.f11345f.f20331b.f20348i;
                int length = fArrM6746a.length;
                float[] fArrCopyOf = Arrays.copyOf(fArrM6746a, length + 1);
                fArrCopyOf[length] = f13;
                float f14 = 2.5f * fMin;
                float[] fArr2 = {1.0f, 5.0f, 15.0f, 15.0f};
                float[] fArr3 = c3735n.f11377r;
                float[] fArrCopyOf2 = Arrays.copyOf(fArr3, fArr3.length);
                AbstractC16544l.m18093f(fArrCopyOf2, "copyOf(...)");
                int length2 = fArrCopyOf2.length;
                float[] fArr4 = new float[length2];
                int i10 = 0;
                while (i10 < length2) {
                    float f15 = ((i10 < 0 || i10 >= fArrCopyOf.length) ? 0.0f : fArrCopyOf[i10]) * fArr2[i10];
                    fArr4[i10] = (f15 / ((0.6f * f15) + 1)) - fArrCopyOf2[i10];
                    i10++;
                }
                int length3 = fArrCopyOf2.length;
                for (int i11 = 0; i11 < length3; i11++) {
                    fArrCopyOf2[i11] = (fArr4[i11] * f14) + fArrCopyOf2[i11];
                }
                float[] fArr5 = c3735n.f11378s;
                float[] fArrCopyOf3 = Arrays.copyOf(fArr5, fArr5.length);
                AbstractC16544l.m18093f(fArrCopyOf3, "copyOf(...)");
                int length4 = fArrCopyOf3.length;
                int i12 = 0;
                while (i12 < length4) {
                    fArrCopyOf3[i12] = (((i12 < 0 || i12 >= fArrCopyOf2.length) ? 0.0f : fArrCopyOf2[i12]) * 40.0f * fMin) + fArrCopyOf3[i12];
                    i12++;
                }
                c3735n.f11377r = fArrCopyOf2;
                c3735n.f11378s = fArrCopyOf3;
            } else {
                c3735n.f11377r = this.f11345f.f20331b.m6748b(f11);
            }
            float fM19289L = AbstractC17678l.m19289L(c3735n.f11377r);
            float f16 = this.f11356q;
            if (fM19289L <= f16) {
                float f17 = c3735n.f11360a;
                if (f17 - c3735n.f11369j > this.f11357r) {
                    float f18 = c3735n.f11379t;
                    if (f18 <= f16) {
                        c3735n.f11380u = f17;
                    }
                    c3735n.f11379t = m4432b(f18, 1.0f, 0.1f);
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    c3735n.f11379t = m4432b(c3735n.f11379t, 0.0f, 0.05f);
                }
            } else {
                f10 = 0.0f;
                c3735n.f11379t = m4432b(c3735n.f11379t, 0.0f, 0.05f);
            }
            if (c3735n.f11379t < f16) {
                c3735n.f11379t = f10;
            }
        } else if (!this.f11346g) {
            float[] fArr6 = c3735n.f11377r;
            ArrayList arrayList2 = new ArrayList(fArr6.length);
            for (float f19 : fArr6) {
                arrayList2.add(Float.valueOf(m4432b(f19, 0.0f, 0.05f)));
            }
            c3735n.f11377r = AbstractC17680n.m19320A0(arrayList2);
            c3735n.f11379t = m4432b(c3735n.f11379t, 0.0f, 0.1f);
        }
        if (this.f11346g) {
            C3722a c3722a = c3735n.f11381v;
            long jM15646x = AbstractC14334L.m15646x(c3735n.f11361b, this.f11343d.f11278a, C3722a.f11276f);
            C3722a c3722a2 = this.f11343d;
            long j12 = c3722a2.f11279b;
            long jM15646x2 = AbstractC14334L.m15646x(c3735n.f11361b, c3722a2.f11280c, C3722a.f11277g);
            long j13 = this.f11343d.f11281d;
            c3722a.getClass();
            c3735n.f11381v = new C3722a(jM15646x, j12, jM15646x2, j13);
        }
        float f20 = 0.65f;
        if (this.f11346g) {
            AbstractC2829i1 abstractC2829i1 = this.f11358s;
            if ((abstractC2829i1 instanceof C2820f1) && (this.f11359t instanceof AbstractC2817e1)) {
                f20 = 0.3f;
            } else if ((abstractC2829i1 instanceof AbstractC2817e1) && (this.f11359t instanceof C2823g1)) {
                f20 = 0.4f;
            } else if ((abstractC2829i1 instanceof C2823g1) && (this.f11359t instanceof AbstractC2817e1)) {
                f20 = 1.0f;
            }
        }
        float fAtan = ((((float) Math.atan(((float) Math.sin((AbstractC8301I.m8920k(((c3735n.f11360a - this.f11350k) - 0.0f) / (f20 - 0.0f), 0.0f, 1.0f) - 0.5f) * 3.1415927f)) * 4.0f)) / ((float) Math.atan(4.0f))) * 0.5f) + 0.5f;
        c3735n.f11364e = this.f11359t instanceof C2814d1 ? fAtan : Math.min(1 - fAtan, c3735n.f11364e);
        c3735n.f11366g = this.f11359t instanceof C2826h1 ? fAtan : Math.min(1 - fAtan, c3735n.f11366g);
        c3735n.f11368i = this.f11359t instanceof C2823g1 ? fAtan : Math.min(1 - fAtan, c3735n.f11368i);
        c3735n.f11371l = this.f11359t instanceof C2808b1 ? fAtan : Math.min(1 - fAtan, c3735n.f11371l);
        float f21 = c3735n.f11373n;
        if (!(this.f11359t instanceof AbstractC2805a1)) {
            fAtan = Math.min(1 - fAtan, f21);
        }
        c3735n.f11373n = fAtan;
        return c3735n;
    }
}
