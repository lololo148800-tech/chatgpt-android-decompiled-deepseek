package p353O4;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
import p013Ab.C0420b;
import p692d0.C12966e;
import p979r2.C18864e;

/* JADX INFO: renamed from: O4.n */
/* JADX INFO: loaded from: classes.dex */
public final class C6127n {

    /* JADX INFO: renamed from: p */
    public static final Matrix f19949p = new Matrix();

    /* JADX INFO: renamed from: a */
    public final Path f19950a;

    /* JADX INFO: renamed from: b */
    public final Path f19951b;

    /* JADX INFO: renamed from: c */
    public final Matrix f19952c;

    /* JADX INFO: renamed from: d */
    public Paint f19953d;

    /* JADX INFO: renamed from: e */
    public Paint f19954e;

    /* JADX INFO: renamed from: f */
    public PathMeasure f19955f;

    /* JADX INFO: renamed from: g */
    public final C6124k f19956g;

    /* JADX INFO: renamed from: h */
    public float f19957h;

    /* JADX INFO: renamed from: i */
    public float f19958i;

    /* JADX INFO: renamed from: j */
    public float f19959j;

    /* JADX INFO: renamed from: k */
    public float f19960k;

    /* JADX INFO: renamed from: l */
    public int f19961l;

    /* JADX INFO: renamed from: m */
    public String f19962m;

    /* JADX INFO: renamed from: n */
    public Boolean f19963n;

    /* JADX INFO: renamed from: o */
    public final C12966e f19964o;

    public C6127n() {
        this.f19952c = new Matrix();
        this.f19957h = 0.0f;
        this.f19958i = 0.0f;
        this.f19959j = 0.0f;
        this.f19960k = 0.0f;
        this.f19961l = 255;
        this.f19962m = null;
        this.f19963n = null;
        this.f19964o = new C12966e(0);
        this.f19956g = new C6124k();
        this.f19950a = new Path();
        this.f19951b = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0139  */
    /* JADX WARN: Code duplicated, block: B:50:0x0146  */
    /* JADX WARN: Code duplicated, block: B:52:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0170  */
    /* JADX WARN: Code duplicated, block: B:59:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x0194  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:72:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.graphics.PathMeasure] */
    /* JADX INFO: renamed from: a */
    public final void m6673a(C6124k c6124k, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        C0420b c0420b;
        ?? r6;
        C0420b c0420b2;
        Paint paint;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        Paint paint2;
        Shader shader2;
        Path.FillType fillType;
        int i13 = 1;
        c6124k.f19935a.set(matrix);
        Matrix matrix2 = c6124k.f19935a;
        matrix2.preConcat(c6124k.f19944j);
        canvas.save();
        ?? r11 = 0;
        int i14 = 0;
        while (true) {
            ArrayList arrayList = c6124k.f19936b;
            if (i14 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC6125l abstractC6125l = (AbstractC6125l) arrayList.get(i14);
            if (abstractC6125l instanceof C6124k) {
                m6673a((C6124k) abstractC6125l, matrix2, canvas, i10, i11);
                i12 = i13;
            } else if (abstractC6125l instanceof AbstractC6126m) {
                AbstractC6126m abstractC6126m = (AbstractC6126m) abstractC6125l;
                float f12 = i10 / this.f19959j;
                float f13 = i11 / this.f19960k;
                float fMin = Math.min(f12, f13);
                Matrix matrix3 = this.f19952c;
                matrix3.set(matrix2);
                matrix3.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float fHypot = (float) Math.hypot(fArr[r11], fArr[i13]);
                float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f14 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float fMax = Math.max(fHypot, fHypot2);
                float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                if (fAbs != 0.0f) {
                    Path path = this.f19950a;
                    abstractC6126m.getClass();
                    path.reset();
                    C18864e[] c18864eArr = abstractC6126m.f19946a;
                    if (c18864eArr != null) {
                        C18864e.m20175b(c18864eArr, path);
                    }
                    Path path2 = this.f19951b;
                    path2.reset();
                    if (abstractC6126m instanceof C6122i) {
                        path2.setFillType(abstractC6126m.f19948c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix3);
                        canvas.clipPath(path2);
                    } else {
                        C6123j c6123j = (C6123j) abstractC6126m;
                        float f15 = c6123j.f19929i;
                        if (f15 == 0.0f) {
                            f10 = 1.0f;
                            if (c6123j.f19930j != 1.0f) {
                            }
                            path2.addPath(path, matrix3);
                            c0420b = c6123j.f19926f;
                            if (((Shader) c0420b.f1382o0) != null && c0420b.f1381Z == 0) {
                                r6 = r11;
                            } else {
                                r6 = 1;
                            }
                            if (r6 != 0) {
                                if (this.f19954e == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f19954e = paint3;
                                    paint3.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.f19954e;
                                shader2 = (Shader) c0420b.f1382o0;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(c6123j.f19928h * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i15 = c0420b.f1381Z;
                                    float f16 = c6123j.f19928h;
                                    PorterDuff.Mode mode = C6130q.f19978v0;
                                    paint2.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f16)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (c6123j.f19948c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            c0420b2 = c6123j.f19924d;
                            if (((Shader) c0420b2.f1382o0) == null || c0420b2.f1381Z != 0) {
                                if (this.f19953d == null) {
                                    Paint paint4 = new Paint(1);
                                    this.f19953d = paint4;
                                    paint4.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.f19953d;
                                join = c6123j.f19933m;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = c6123j.f19932l;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(c6123j.f19934n);
                                shader = (Shader) c0420b2.f1382o0;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix3);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(c6123j.f19927g * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i16 = c0420b2.f1381Z;
                                    float f17 = c6123j.f19927g;
                                    PorterDuff.Mode mode2 = C6130q.f19978v0;
                                    paint.setColor((i16 & 16777215) | (((int) (Color.alpha(i16) * f17)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(c6123j.f19925e * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        } else {
                            f10 = 1.0f;
                        }
                        float f18 = c6123j.f19931k;
                        float f19 = (f15 + f18) % f10;
                        float f20 = (c6123j.f19930j + f18) % f10;
                        if (this.f19955f == null) {
                            this.f19955f = new PathMeasure();
                        }
                        this.f19955f.setPath(path, r11);
                        float length = this.f19955f.getLength();
                        float f21 = f19 * length;
                        float f22 = f20 * length;
                        path.reset();
                        if (f21 > f22) {
                            this.f19955f.getSegment(f21, length, path, true);
                            f11 = 0.0f;
                            this.f19955f.getSegment(0.0f, f22, path, true);
                        } else {
                            f11 = 0.0f;
                            this.f19955f.getSegment(f21, f22, path, true);
                        }
                        path.rLineTo(f11, f11);
                        path2.addPath(path, matrix3);
                        c0420b = c6123j.f19926f;
                        if (((Shader) c0420b.f1382o0) != null) {
                            r6 = 1;
                        } else {
                            r6 = r11;
                        }
                        if (r6 != 0) {
                            if (this.f19954e == null) {
                                Paint paint5 = new Paint(1);
                                this.f19954e = paint5;
                                paint5.setStyle(Paint.Style.FILL);
                            }
                            paint2 = this.f19954e;
                            shader2 = (Shader) c0420b.f1382o0;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix3);
                                paint2.setShader(shader2);
                                paint2.setAlpha(Math.round(c6123j.f19928h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i17 = c0420b.f1381Z;
                                float f110 = c6123j.f19928h;
                                PorterDuff.Mode mode3 = C6130q.f19978v0;
                                paint2.setColor((i17 & 16777215) | (((int) (Color.alpha(i17) * f110)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (c6123j.f19948c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        }
                        c0420b2 = c6123j.f19924d;
                        if (((Shader) c0420b2.f1382o0) == null) {
                            if (this.f19953d == null) {
                                Paint paint6 = new Paint(1);
                                this.f19953d = paint6;
                                paint6.setStyle(Paint.Style.STROKE);
                            }
                            paint = this.f19953d;
                            join = c6123j.f19933m;
                            if (join != null) {
                                paint.setStrokeJoin(join);
                            }
                            cap = c6123j.f19932l;
                            if (cap != null) {
                                paint.setStrokeCap(cap);
                            }
                            paint.setStrokeMiter(c6123j.f19934n);
                            shader = (Shader) c0420b2.f1382o0;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(c6123j.f19927g * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                int i18 = c0420b2.f1381Z;
                                float f111 = c6123j.f19927g;
                                PorterDuff.Mode mode4 = C6130q.f19978v0;
                                paint.setColor((i18 & 16777215) | (((int) (Color.alpha(i18) * f111)) << 24));
                            }
                            paint.setColorFilter(null);
                            paint.setStrokeWidth(c6123j.f19925e * fAbs * fMin);
                            canvas.drawPath(path2, paint);
                        } else {
                            if (this.f19953d == null) {
                                Paint paint7 = new Paint(1);
                                this.f19953d = paint7;
                                paint7.setStyle(Paint.Style.STROKE);
                            }
                            paint = this.f19953d;
                            join = c6123j.f19933m;
                            if (join != null) {
                                paint.setStrokeJoin(join);
                            }
                            cap = c6123j.f19932l;
                            if (cap != null) {
                                paint.setStrokeCap(cap);
                            }
                            paint.setStrokeMiter(c6123j.f19934n);
                            shader = (Shader) c0420b2.f1382o0;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix3);
                                paint.setShader(shader);
                                paint.setAlpha(Math.round(c6123j.f19927g * 255.0f));
                            } else {
                                paint.setShader(null);
                                paint.setAlpha(255);
                                int i19 = c0420b2.f1381Z;
                                float f112 = c6123j.f19927g;
                                PorterDuff.Mode mode5 = C6130q.f19978v0;
                                paint.setColor((i19 & 16777215) | (((int) (Color.alpha(i19) * f112)) << 24));
                            }
                            paint.setColorFilter(null);
                            paint.setStrokeWidth(c6123j.f19925e * fAbs * fMin);
                            canvas.drawPath(path2, paint);
                        }
                    }
                }
                i12 = 1;
            } else {
                i12 = i13;
            }
            i14 += i12;
            i13 = i12;
            matrix2 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f19961l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f19961l = i10;
    }

    public C6127n(C6127n c6127n) {
        this.f19952c = new Matrix();
        this.f19957h = 0.0f;
        this.f19958i = 0.0f;
        this.f19959j = 0.0f;
        this.f19960k = 0.0f;
        this.f19961l = 255;
        this.f19962m = null;
        this.f19963n = null;
        C12966e c12966e = new C12966e(0);
        this.f19964o = c12966e;
        this.f19956g = new C6124k(c6127n.f19956g, c12966e);
        this.f19950a = new Path(c6127n.f19950a);
        this.f19951b = new Path(c6127n.f19951b);
        this.f19957h = c6127n.f19957h;
        this.f19958i = c6127n.f19958i;
        this.f19959j = c6127n.f19959j;
        this.f19960k = c6127n.f19960k;
        this.f19961l = c6127n.f19961l;
        this.f19962m = c6127n.f19962m;
        String str = c6127n.f19962m;
        if (str != null) {
            c12966e.put(str, this);
        }
        this.f19963n = c6127n.f19963n;
    }
}
