package p822j2;

import android.view.ViewGroup;
import p760g2.C13807d;
import p760g2.C13811h;

/* JADX INFO: renamed from: j2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C16047d extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f49503A;

    /* JADX INFO: renamed from: B */
    public int f49504B;

    /* JADX INFO: renamed from: C */
    public int f49505C;

    /* JADX INFO: renamed from: D */
    public int f49506D;

    /* JADX INFO: renamed from: E */
    public float f49507E;

    /* JADX INFO: renamed from: F */
    public float f49508F;

    /* JADX INFO: renamed from: G */
    public String f49509G;

    /* JADX INFO: renamed from: H */
    public float f49510H;

    /* JADX INFO: renamed from: I */
    public float f49511I;

    /* JADX INFO: renamed from: J */
    public int f49512J;

    /* JADX INFO: renamed from: K */
    public int f49513K;

    /* JADX INFO: renamed from: L */
    public int f49514L;

    /* JADX INFO: renamed from: M */
    public int f49515M;

    /* JADX INFO: renamed from: N */
    public int f49516N;

    /* JADX INFO: renamed from: O */
    public int f49517O;

    /* JADX INFO: renamed from: P */
    public int f49518P;

    /* JADX INFO: renamed from: Q */
    public int f49519Q;

    /* JADX INFO: renamed from: R */
    public float f49520R;

    /* JADX INFO: renamed from: S */
    public float f49521S;

    /* JADX INFO: renamed from: T */
    public int f49522T;

    /* JADX INFO: renamed from: U */
    public int f49523U;

    /* JADX INFO: renamed from: V */
    public int f49524V;

    /* JADX INFO: renamed from: W */
    public boolean f49525W;

    /* JADX INFO: renamed from: X */
    public boolean f49526X;

    /* JADX INFO: renamed from: Y */
    public String f49527Y;

    /* JADX INFO: renamed from: Z */
    public int f49528Z;

    /* JADX INFO: renamed from: a */
    public int f49529a;

    /* JADX INFO: renamed from: a0 */
    public boolean f49530a0;

    /* JADX INFO: renamed from: b */
    public int f49531b;

    /* JADX INFO: renamed from: b0 */
    public boolean f49532b0;

    /* JADX INFO: renamed from: c */
    public float f49533c;

    /* JADX INFO: renamed from: c0 */
    public boolean f49534c0;

    /* JADX INFO: renamed from: d */
    public boolean f49535d;

    /* JADX INFO: renamed from: d0 */
    public boolean f49536d0;

    /* JADX INFO: renamed from: e */
    public int f49537e;

    /* JADX INFO: renamed from: e0 */
    public boolean f49538e0;

    /* JADX INFO: renamed from: f */
    public int f49539f;

    /* JADX INFO: renamed from: f0 */
    public int f49540f0;

    /* JADX INFO: renamed from: g */
    public int f49541g;

    /* JADX INFO: renamed from: g0 */
    public int f49542g0;

    /* JADX INFO: renamed from: h */
    public int f49543h;

    /* JADX INFO: renamed from: h0 */
    public int f49544h0;

    /* JADX INFO: renamed from: i */
    public int f49545i;

    /* JADX INFO: renamed from: i0 */
    public int f49546i0;

    /* JADX INFO: renamed from: j */
    public int f49547j;

    /* JADX INFO: renamed from: j0 */
    public int f49548j0;

    /* JADX INFO: renamed from: k */
    public int f49549k;

    /* JADX INFO: renamed from: k0 */
    public int f49550k0;

    /* JADX INFO: renamed from: l */
    public int f49551l;

    /* JADX INFO: renamed from: l0 */
    public float f49552l0;

    /* JADX INFO: renamed from: m */
    public int f49553m;

    /* JADX INFO: renamed from: m0 */
    public int f49554m0;

    /* JADX INFO: renamed from: n */
    public int f49555n;

    /* JADX INFO: renamed from: n0 */
    public int f49556n0;

    /* JADX INFO: renamed from: o */
    public int f49557o;

    /* JADX INFO: renamed from: o0 */
    public float f49558o0;

    /* JADX INFO: renamed from: p */
    public int f49559p;

    /* JADX INFO: renamed from: p0 */
    public C13807d f49560p0;

    /* JADX INFO: renamed from: q */
    public int f49561q;

    /* JADX INFO: renamed from: r */
    public float f49562r;

    /* JADX INFO: renamed from: s */
    public int f49563s;

    /* JADX INFO: renamed from: t */
    public int f49564t;

    /* JADX INFO: renamed from: u */
    public int f49565u;

    /* JADX INFO: renamed from: v */
    public int f49566v;

    /* JADX INFO: renamed from: w */
    public int f49567w;

    /* JADX INFO: renamed from: x */
    public int f49568x;

    /* JADX INFO: renamed from: y */
    public int f49569y;

    /* JADX INFO: renamed from: z */
    public int f49570z;

    /* JADX INFO: renamed from: a */
    public final void m17617a() {
        this.f49536d0 = false;
        this.f49530a0 = true;
        this.f49532b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.f49525W) {
            this.f49530a0 = false;
            if (this.f49514L == 0) {
                this.f49514L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.f49526X) {
            this.f49532b0 = false;
            if (this.f49515M == 0) {
                this.f49515M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f49530a0 = false;
            if (i10 == 0 && this.f49514L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f49525W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f49532b0 = false;
            if (i11 == 0 && this.f49515M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f49526X = true;
            }
        }
        if (this.f49533c == -1.0f && this.f49529a == -1 && this.f49531b == -1) {
            return;
        }
        this.f49536d0 = true;
        this.f49530a0 = true;
        this.f49532b0 = true;
        if (!(this.f49560p0 instanceof C13811h)) {
            this.f49560p0 = new C13811h();
        }
        ((C13811h) this.f49560p0).m15414V(this.f49524V);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i10);
        boolean z6 = false;
        boolean z10 = 1 == getLayoutDirection();
        this.f49544h0 = -1;
        this.f49546i0 = -1;
        this.f49540f0 = -1;
        this.f49542g0 = -1;
        this.f49548j0 = this.f49567w;
        this.f49550k0 = this.f49569y;
        float f10 = this.f49507E;
        this.f49552l0 = f10;
        int i17 = this.f49529a;
        this.f49554m0 = i17;
        int i18 = this.f49531b;
        this.f49556n0 = i18;
        float f11 = this.f49533c;
        this.f49558o0 = f11;
        if (z10) {
            int i19 = this.f49563s;
            if (i19 != -1) {
                this.f49544h0 = i19;
            } else {
                int i20 = this.f49564t;
                if (i20 != -1) {
                    this.f49546i0 = i20;
                } else {
                    i11 = this.f49565u;
                    if (i11 != -1) {
                        this.f49542g0 = i11;
                        z6 = true;
                    }
                    i12 = this.f49566v;
                    if (i12 != -1) {
                        this.f49540f0 = i12;
                        z6 = true;
                    }
                    i13 = this.f49503A;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f49550k0 = i13;
                    }
                    i14 = this.f49504B;
                    if (i14 != Integer.MIN_VALUE) {
                        this.f49548j0 = i14;
                    }
                    if (z6) {
                        this.f49552l0 = 1.0f - f10;
                    }
                    if (this.f49536d0 && this.f49524V == 1 && this.f49535d) {
                        if (f11 != -1.0f) {
                            this.f49558o0 = 1.0f - f11;
                            this.f49554m0 = -1;
                            this.f49556n0 = -1;
                        } else if (i17 != -1) {
                            this.f49556n0 = i17;
                            this.f49554m0 = -1;
                            this.f49558o0 = -1.0f;
                        } else if (i18 != -1) {
                            this.f49554m0 = i18;
                            this.f49556n0 = -1;
                            this.f49558o0 = -1.0f;
                        }
                    }
                }
            }
            z6 = true;
            i11 = this.f49565u;
            if (i11 != -1) {
                this.f49542g0 = i11;
                z6 = true;
            }
            i12 = this.f49566v;
            if (i12 != -1) {
                this.f49540f0 = i12;
                z6 = true;
            }
            i13 = this.f49503A;
            if (i13 != Integer.MIN_VALUE) {
                this.f49550k0 = i13;
            }
            i14 = this.f49504B;
            if (i14 != Integer.MIN_VALUE) {
                this.f49548j0 = i14;
            }
            if (z6) {
                this.f49552l0 = 1.0f - f10;
            }
            if (this.f49536d0) {
                if (f11 != -1.0f) {
                    this.f49558o0 = 1.0f - f11;
                    this.f49554m0 = -1;
                    this.f49556n0 = -1;
                } else if (i17 != -1) {
                    this.f49556n0 = i17;
                    this.f49554m0 = -1;
                    this.f49558o0 = -1.0f;
                } else if (i18 != -1) {
                    this.f49554m0 = i18;
                    this.f49556n0 = -1;
                    this.f49558o0 = -1.0f;
                }
            }
        } else {
            int i21 = this.f49563s;
            if (i21 != -1) {
                this.f49542g0 = i21;
            }
            int i22 = this.f49564t;
            if (i22 != -1) {
                this.f49540f0 = i22;
            }
            int i23 = this.f49565u;
            if (i23 != -1) {
                this.f49544h0 = i23;
            }
            int i24 = this.f49566v;
            if (i24 != -1) {
                this.f49546i0 = i24;
            }
            int i25 = this.f49503A;
            if (i25 != Integer.MIN_VALUE) {
                this.f49548j0 = i25;
            }
            int i26 = this.f49504B;
            if (i26 != Integer.MIN_VALUE) {
                this.f49550k0 = i26;
            }
        }
        if (this.f49565u == -1 && this.f49566v == -1 && this.f49564t == -1 && this.f49563s == -1) {
            int i27 = this.f49541g;
            if (i27 != -1) {
                this.f49544h0 = i27;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                }
            } else {
                int i28 = this.f49543h;
                if (i28 != -1) {
                    this.f49546i0 = i28;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                }
            }
            int i29 = this.f49537e;
            if (i29 != -1) {
                this.f49540f0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                return;
            }
            int i30 = this.f49539f;
            if (i30 != -1) {
                this.f49542g0 = i30;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
            }
        }
    }
}
