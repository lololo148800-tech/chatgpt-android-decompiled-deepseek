package p797i1;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p561X.C8990d;
import p774h1.AbstractC14334L;

/* JADX INFO: renamed from: i1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C14915q extends AbstractC14901c {

    /* JADX INFO: renamed from: r */
    public static final C8990d f46452r = new C8990d(11);

    /* JADX INFO: renamed from: d */
    public final C14917s f46453d;

    /* JADX INFO: renamed from: e */
    public final float f46454e;

    /* JADX INFO: renamed from: f */
    public final float f46455f;

    /* JADX INFO: renamed from: g */
    public final C14916r f46456g;

    /* JADX INFO: renamed from: h */
    public final float[] f46457h;

    /* JADX INFO: renamed from: i */
    public final float[] f46458i;

    /* JADX INFO: renamed from: j */
    public final float[] f46459j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC14907i f46460k;

    /* JADX INFO: renamed from: l */
    public final C14914p f46461l;

    /* JADX INFO: renamed from: m */
    public final C14911m f46462m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC14907i f46463n;

    /* JADX INFO: renamed from: o */
    public final C14914p f46464o;

    /* JADX INFO: renamed from: p */
    public final C14911m f46465p;

    /* JADX INFO: renamed from: q */
    public final boolean f46466q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:40:0x022c  */
    /* JADX WARN: Code duplicated, block: B:65:0x027e  */
    /* JADX WARN: Code duplicated, block: B:77:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public C14915q(String str, float[] fArr, C14917s c14917s, float[] fArr2, InterfaceC14907i interfaceC14907i, InterfaceC14907i interfaceC14907i2, float f10, float f11, C14916r c14916r, int i10) {
        int i11;
        boolean z6;
        C14915q c14915q;
        double d10;
        super(AbstractC14900b.f46397a, str, i10);
        int i12 = 0;
        int i13 = 1;
        this.f46453d = c14917s;
        this.f46454e = f10;
        this.f46455f = f11;
        this.f46456g = c14916r;
        this.f46460k = interfaceC14907i;
        this.f46461l = new C14914p(this, i13);
        this.f46462m = new C14911m(this, i12);
        this.f46463n = interfaceC14907i2;
        this.f46464o = new C14914p(this, i12);
        this.f46465p = new C14911m(this, i13);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f10 >= f11) {
            throw new IllegalArgumentException("Invalid range: min=" + f10 + ", max=" + f11 + "; min must be strictly < max");
        }
        float[] fArr3 = new float[6];
        if (fArr.length == 9) {
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = f12 + f13 + fArr[2];
            fArr3[0] = f12 / f14;
            fArr3[1] = f13 / f14;
            float f15 = fArr[3];
            float f16 = fArr[4];
            float f17 = f15 + f16 + fArr[5];
            fArr3[2] = f15 / f17;
            fArr3[3] = f16 / f17;
            float f18 = fArr[6];
            float f19 = fArr[7];
            float f20 = f18 + f19 + fArr[8];
            fArr3[4] = f18 / f20;
            fArr3[5] = f19 / f20;
        } else {
            System.arraycopy(fArr, 0, fArr3, 0, 6);
        }
        this.f46457h = fArr3;
        if (fArr2 == null) {
            float f21 = fArr3[0];
            float f22 = fArr3[1];
            float f23 = fArr3[2];
            float f24 = fArr3[3];
            float f25 = fArr3[4];
            float f26 = fArr3[5];
            float f27 = 1;
            float f28 = (f27 - f21) / f22;
            float f29 = (f27 - f23) / f24;
            float f30 = (f27 - f25) / f26;
            float f31 = c14917s.f46474a;
            float f32 = c14917s.f46475b;
            float f33 = (f27 - f31) / f32;
            float f34 = f21 / f22;
            float f35 = (f23 / f24) - f34;
            float f36 = (f31 / f32) - f34;
            float f37 = f29 - f28;
            float f38 = (f25 / f26) - f34;
            float f39 = (((f33 - f28) * f35) - (f36 * f37)) / (((f30 - f28) * f35) - (f37 * f38));
            float f40 = (f36 - (f38 * f39)) / f35;
            float f41 = (1.0f - f40) - f39;
            float f42 = f41 / f22;
            float f43 = f40 / f24;
            float f44 = f39 / f26;
            this.f46458i = new float[]{f42 * f21, f41, ((1.0f - f21) - f22) * f42, f43 * f23, f40, ((1.0f - f23) - f24) * f43, f44 * f25, f39, ((1.0f - f25) - f26) * f44};
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f46458i = fArr2;
        }
        this.f46459j = AbstractC14908j.m16082g(this.f46458i);
        float fM16077b = AbstractC14908j.m16077b(fArr3);
        float[] fArr4 = C14902d.f46405a;
        if (fM16077b / AbstractC14908j.m16077b(C14902d.f46406b) > 0.9f) {
            float[] fArr5 = C14902d.f46405a;
            float f45 = fArr3[0];
            float f46 = fArr5[0];
            float f47 = fArr3[1];
            float f48 = fArr5[1];
            float f49 = fArr3[2] - fArr5[2];
            float f50 = fArr3[3] - fArr5[3];
            float f51 = fArr3[4];
            float f52 = fArr5[4];
            float f53 = fArr3[5];
            float f54 = fArr5[5];
            float[] fArr6 = {f45 - f46, f47 - f48, f49, f50, f51 - f52, f53 - f54};
            if (AbstractC14908j.m16081f(fArr6[0], fArr6[1], f46 - f52, f48 - f54) < 0.0f) {
                i11 = 0;
            } else if (AbstractC14908j.m16081f(fArr5[0] - fArr5[2], fArr5[1] - fArr5[3], fArr6[0], fArr6[1]) >= 0.0f && AbstractC14908j.m16081f(fArr6[2], fArr6[3], fArr5[2] - fArr5[0], fArr5[3] - fArr5[1]) >= 0.0f && AbstractC14908j.m16081f(fArr5[2] - fArr5[4], fArr5[3] - fArr5[5], fArr6[2], fArr6[3]) >= 0.0f && AbstractC14908j.m16081f(fArr6[4], fArr6[5], fArr5[4] - fArr5[2], fArr5[5] - fArr5[3]) >= 0.0f) {
                i11 = 0;
                if (AbstractC14908j.m16081f(fArr5[4] - fArr5[0], fArr5[5] - fArr5[1], fArr6[4], fArr6[5]) < 0.0f) {
                }
            } else {
                i11 = 0;
            }
            int i14 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        } else {
            i11 = 0;
            int i15 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        }
        if (i10 != 0) {
            float[] fArr7 = C14902d.f46405a;
            if (fArr3 != fArr7) {
                int i16 = i11;
                while (true) {
                    if (i16 < 6) {
                        if (Float.compare(fArr3[i16], fArr7[i16]) == 0 || Math.abs(fArr3[i16] - fArr7[i16]) <= 0.001f) {
                            i16++;
                        }
                    } else {
                        if (AbstractC14908j.m16079d(c14917s, AbstractC14908j.f46437d)) {
                            break;
                        }
                        float[] fArr8 = C14902d.f46405a;
                        c14915q = C14902d.f46407c;
                        d10 = 0.0d;
                        while (true) {
                            if (d10 <= 1.0d) {
                                z6 = 1;
                                break;
                            } else if (Math.abs(interfaceC14907i.mo9580b(d10) - c14915q.f46460k.mo9580b(d10)) <= 0.001d) {
                            }
                            d10 += 0.00392156862745098d;
                        }
                    }
                    z6 = i11;
                    break;
                }
            }
            if (AbstractC14908j.m16079d(c14917s, AbstractC14908j.f46437d) || f10 != 0.0f || f11 != 1.0f) {
                z6 = i11;
                break;
            }
            float[] fArr9 = C14902d.f46405a;
            c14915q = C14902d.f46407c;
            d10 = 0.0d;
            while (true) {
                if (d10 <= 1.0d) {
                    z6 = 1;
                    break;
                } else {
                    if (Math.abs(interfaceC14907i.mo9580b(d10) - c14915q.f46460k.mo9580b(d10)) <= 0.001d || Math.abs(interfaceC14907i2.mo9580b(d10) - c14915q.f46463n.mo9580b(d10)) > 0.001d) {
                        z6 = i11;
                        break;
                    }
                    d10 += 0.00392156862745098d;
                }
            }
        } else {
            z6 = 1;
        }
        this.f46466q = z6;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: a */
    public final float mo16069a(int i10) {
        return this.f46455f;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: b */
    public final float mo16070b(int i10) {
        return this.f46454e;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: c */
    public final boolean mo16071c() {
        return this.f46466q;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: d */
    public final long mo16072d(float f10, float f11, float f12) {
        double d10 = f10;
        C14911m c14911m = this.f46465p;
        float fMo9580b = (float) c14911m.mo9580b(d10);
        float fMo9580b2 = (float) c14911m.mo9580b(f11);
        float fMo9580b3 = (float) c14911m.mo9580b(f12);
        float[] fArr = this.f46458i;
        float f13 = (fArr[6] * fMo9580b3) + (fArr[3] * fMo9580b2) + (fArr[0] * fMo9580b);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo9580b3) + (fArr[4] * fMo9580b2) + (fArr[1] * fMo9580b))) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: e */
    public final float mo16073e(float f10, float f11, float f12) {
        double d10 = f10;
        C14911m c14911m = this.f46465p;
        float fMo9580b = (float) c14911m.mo9580b(d10);
        float fMo9580b2 = (float) c14911m.mo9580b(f11);
        float fMo9580b3 = (float) c14911m.mo9580b(f12);
        float[] fArr = this.f46458i;
        return (fArr[8] * fMo9580b3) + (fArr[5] * fMo9580b2) + (fArr[2] * fMo9580b);
    }

    @Override // p797i1.AbstractC14901c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14915q.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C14915q c14915q = (C14915q) obj;
        if (Float.compare(c14915q.f46454e, this.f46454e) != 0 || Float.compare(c14915q.f46455f, this.f46455f) != 0 || !AbstractC16544l.m18089b(this.f46453d, c14915q.f46453d) || !Arrays.equals(this.f46457h, c14915q.f46457h)) {
            return false;
        }
        C14916r c14916r = c14915q.f46456g;
        C14916r c14916r2 = this.f46456g;
        if (c14916r2 != null) {
            return AbstractC16544l.m18089b(c14916r2, c14916r);
        }
        if (c14916r == null) {
            return true;
        }
        if (AbstractC16544l.m18089b(this.f46460k, c14915q.f46460k)) {
            return AbstractC16544l.m18089b(this.f46463n, c14915q.f46463n);
        }
        return false;
    }

    @Override // p797i1.AbstractC14901c
    /* JADX INFO: renamed from: f */
    public final long mo16074f(float f10, float f11, float f12, float f13, AbstractC14901c abstractC14901c) {
        float[] fArr = this.f46459j;
        float f14 = (fArr[6] * f12) + (fArr[3] * f11) + (fArr[0] * f10);
        float f15 = (fArr[7] * f12) + (fArr[4] * f11) + (fArr[1] * f10);
        float f16 = (fArr[8] * f12) + (fArr[5] * f11) + (fArr[2] * f10);
        C14911m c14911m = this.f46462m;
        return AbstractC14334L.m15624b((float) c14911m.mo9580b(f14), (float) c14911m.mo9580b(f15), (float) c14911m.mo9580b(f16), f13, abstractC14901c);
    }

    @Override // p797i1.AbstractC14901c
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f46457h) + ((this.f46453d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f10 = this.f46454e;
        int iFloatToIntBits = (iHashCode + (f10 == 0.0f ? 0 : Float.floatToIntBits(f10))) * 31;
        float f11 = this.f46455f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f11 == 0.0f ? 0 : Float.floatToIntBits(f11))) * 31;
        C14916r c14916r = this.f46456g;
        int iHashCode2 = iFloatToIntBits2 + (c14916r != null ? c14916r.hashCode() : 0);
        if (c14916r == null) {
            return this.f46463n.hashCode() + ((this.f46460k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public C14915q(String str, float[] fArr, C14917s c14917s, final C14916r c14916r, int i10) {
        InterfaceC14907i interfaceC14907i;
        InterfaceC14907i interfaceC14907i2;
        double d10 = c14916r.f46472f;
        double d11 = c14916r.f46473g;
        if (d10 == 0.0d && d11 == 0.0d) {
            final int i11 = 0;
            interfaceC14907i = new InterfaceC14907i() { // from class: i1.o
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d12) {
                    switch (i11) {
                        case 0:
                            C14916r c14916r2 = c14916r;
                            double d13 = c14916r2.f46471e;
                            double d14 = c14916r2.f46470d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / c14916r2.f46467a) - c14916r2.f46469c) / c14916r2.f46468b : d12 / d14;
                        case 1:
                            C14916r c14916r3 = c14916r;
                            double d15 = c14916r3.f46468b;
                            double d16 = c14916r3.f46471e;
                            double d17 = c14916r3.f46470d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - c14916r3.f46472f, 1.0d / c14916r3.f46467a) - c14916r3.f46469c) / d15 : (d12 - c14916r3.f46473g) / d17;
                        case 2:
                            C14916r c14916r4 = c14916r;
                            return d12 >= c14916r4.f46471e ? Math.pow((c14916r4.f46468b * d12) + c14916r4.f46469c, c14916r4.f46467a) : d12 * c14916r4.f46470d;
                        default:
                            C14916r c14916r5 = c14916r;
                            double d18 = c14916r5.f46468b;
                            if (d12 >= c14916r5.f46471e) {
                                return Math.pow((d18 * d12) + c14916r5.f46469c, c14916r5.f46467a) + c14916r5.f46472f;
                            }
                            return c14916r5.f46473g + (c14916r5.f46470d * d12);
                    }
                }
            };
        } else {
            final int i12 = 1;
            interfaceC14907i = new InterfaceC14907i() { // from class: i1.o
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d12) {
                    switch (i12) {
                        case 0:
                            C14916r c14916r2 = c14916r;
                            double d13 = c14916r2.f46471e;
                            double d14 = c14916r2.f46470d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / c14916r2.f46467a) - c14916r2.f46469c) / c14916r2.f46468b : d12 / d14;
                        case 1:
                            C14916r c14916r3 = c14916r;
                            double d15 = c14916r3.f46468b;
                            double d16 = c14916r3.f46471e;
                            double d17 = c14916r3.f46470d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - c14916r3.f46472f, 1.0d / c14916r3.f46467a) - c14916r3.f46469c) / d15 : (d12 - c14916r3.f46473g) / d17;
                        case 2:
                            C14916r c14916r4 = c14916r;
                            return d12 >= c14916r4.f46471e ? Math.pow((c14916r4.f46468b * d12) + c14916r4.f46469c, c14916r4.f46467a) : d12 * c14916r4.f46470d;
                        default:
                            C14916r c14916r5 = c14916r;
                            double d18 = c14916r5.f46468b;
                            if (d12 >= c14916r5.f46471e) {
                                return Math.pow((d18 * d12) + c14916r5.f46469c, c14916r5.f46467a) + c14916r5.f46472f;
                            }
                            return c14916r5.f46473g + (c14916r5.f46470d * d12);
                    }
                }
            };
        }
        InterfaceC14907i interfaceC14907i3 = interfaceC14907i;
        if (d10 == 0.0d && d11 == 0.0d) {
            final int i13 = 2;
            interfaceC14907i2 = new InterfaceC14907i() { // from class: i1.o
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d12) {
                    switch (i13) {
                        case 0:
                            C14916r c14916r2 = c14916r;
                            double d13 = c14916r2.f46471e;
                            double d14 = c14916r2.f46470d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / c14916r2.f46467a) - c14916r2.f46469c) / c14916r2.f46468b : d12 / d14;
                        case 1:
                            C14916r c14916r3 = c14916r;
                            double d15 = c14916r3.f46468b;
                            double d16 = c14916r3.f46471e;
                            double d17 = c14916r3.f46470d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - c14916r3.f46472f, 1.0d / c14916r3.f46467a) - c14916r3.f46469c) / d15 : (d12 - c14916r3.f46473g) / d17;
                        case 2:
                            C14916r c14916r4 = c14916r;
                            return d12 >= c14916r4.f46471e ? Math.pow((c14916r4.f46468b * d12) + c14916r4.f46469c, c14916r4.f46467a) : d12 * c14916r4.f46470d;
                        default:
                            C14916r c14916r5 = c14916r;
                            double d18 = c14916r5.f46468b;
                            if (d12 >= c14916r5.f46471e) {
                                return Math.pow((d18 * d12) + c14916r5.f46469c, c14916r5.f46467a) + c14916r5.f46472f;
                            }
                            return c14916r5.f46473g + (c14916r5.f46470d * d12);
                    }
                }
            };
        } else {
            final int i14 = 3;
            interfaceC14907i2 = new InterfaceC14907i() { // from class: i1.o
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d12) {
                    switch (i14) {
                        case 0:
                            C14916r c14916r2 = c14916r;
                            double d13 = c14916r2.f46471e;
                            double d14 = c14916r2.f46470d;
                            return d12 >= d13 * d14 ? (Math.pow(d12, 1.0d / c14916r2.f46467a) - c14916r2.f46469c) / c14916r2.f46468b : d12 / d14;
                        case 1:
                            C14916r c14916r3 = c14916r;
                            double d15 = c14916r3.f46468b;
                            double d16 = c14916r3.f46471e;
                            double d17 = c14916r3.f46470d;
                            return d12 >= d16 * d17 ? (Math.pow(d12 - c14916r3.f46472f, 1.0d / c14916r3.f46467a) - c14916r3.f46469c) / d15 : (d12 - c14916r3.f46473g) / d17;
                        case 2:
                            C14916r c14916r4 = c14916r;
                            return d12 >= c14916r4.f46471e ? Math.pow((c14916r4.f46468b * d12) + c14916r4.f46469c, c14916r4.f46467a) : d12 * c14916r4.f46470d;
                        default:
                            C14916r c14916r5 = c14916r;
                            double d18 = c14916r5.f46468b;
                            if (d12 >= c14916r5.f46471e) {
                                return Math.pow((d18 * d12) + c14916r5.f46469c, c14916r5.f46467a) + c14916r5.f46472f;
                            }
                            return c14916r5.f46473g + (c14916r5.f46470d * d12);
                    }
                }
            };
        }
        this(str, fArr, c14917s, null, interfaceC14907i3, interfaceC14907i2, 0.0f, 1.0f, c14916r, i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C14915q(String str, float[] fArr, C14917s c14917s, final double d10, float f10, float f11, int i10) {
        InterfaceC14907i interfaceC14907i;
        InterfaceC14907i interfaceC14907i2 = f46452r;
        if (d10 == 1.0d) {
            interfaceC14907i = interfaceC14907i2;
        } else {
            final int i11 = 0;
            interfaceC14907i = new InterfaceC14907i() { // from class: i1.n
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d11) {
                    switch (i11) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        if (d10 != 1.0d) {
            final int i12 = 1;
            interfaceC14907i2 = new InterfaceC14907i() { // from class: i1.n
                @Override // p797i1.InterfaceC14907i
                /* JADX INFO: renamed from: b */
                public final double mo9580b(double d11) {
                    switch (i12) {
                        case 0:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, 1.0d / d10);
                        default:
                            if (d11 < 0.0d) {
                                d11 = 0.0d;
                            }
                            return Math.pow(d11, d10);
                    }
                }
            };
        }
        this(str, fArr, c14917s, null, interfaceC14907i, interfaceC14907i2, f10, f11, new C14916r(d10, 1.0d, 0.0d, 0.0d, 0.0d), i10);
    }
}
