package p038Ba;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.protobuf.AbstractC12107L1;
import java.util.WeakHashMap;
import p030B2.AbstractC0738T;
import p330N4.AbstractC5642H;
import p330N4.C5654e;
import p523V9.AbstractC8070d4;
import p544W9.AbstractC8596Z3;
import p897n3.C17474a;

/* JADX INFO: renamed from: Ba.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0857g extends Property {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2387a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0857g(Class cls, String str, int i10) {
        super(cls, str);
        this.f2387a = i10;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2387a) {
            case 0:
                return Float.valueOf(((C0858h) obj).f2398i);
            case 1:
                return Float.valueOf(((C0858h) obj).f2399j);
            case 2:
                return Float.valueOf(((AbstractC0863m) obj).m1924b());
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return null;
            case 6:
                return null;
            case 7:
                return null;
            case 8:
                return null;
            case 9:
                return Float.valueOf(AbstractC5642H.f18332a.mo6076b((View) obj));
            default:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2387a) {
            case 0:
                C0858h c0858h = (C0858h) obj;
                float fFloatValue = ((Float) obj2).floatValue();
                c0858h.f2398i = fFloatValue;
                int i10 = (int) (5400.0f * fFloatValue);
                float f10 = fFloatValue * 1520.0f;
                float[] fArr = (float[]) c0858h.f2432b;
                fArr[0] = (-20.0f) + f10;
                fArr[1] = f10;
                int i11 = 0;
                while (true) {
                    C17474a c17474a = c0858h.f2395f;
                    if (i11 >= 4) {
                        float f11 = fArr[0];
                        float f12 = fArr[1];
                        float f13 = ((f12 - f11) * c0858h.f2399j) + f11;
                        fArr[0] = f13;
                        fArr[0] = f13 / 360.0f;
                        fArr[1] = f12 / 360.0f;
                        for (int i12 = 0; i12 < 4; i12++) {
                            float f14 = (i10 - C0858h.f2390n[i12]) / 333;
                            if (f14 >= 0.0f && f14 <= 1.0f) {
                                int i13 = i12 + c0858h.f2397h;
                                C0859i c0859i = c0858h.f2396g;
                                int[] iArr = c0859i.f2403c;
                                int length = i13 % iArr.length;
                                int length2 = (1 + length) % iArr.length;
                                int iM8476c = AbstractC8070d4.m8476c(iArr[length], ((C0866p) c0858h.f2431a).f2428v0);
                                int iM8476c2 = AbstractC8070d4.m8476c(c0859i.f2403c[length2], ((C0866p) c0858h.f2431a).f2428v0);
                                float interpolation = c17474a.getInterpolation(f14);
                                Integer numValueOf = Integer.valueOf(iM8476c);
                                Integer numValueOf2 = Integer.valueOf(iM8476c2);
                                int iIntValue = numValueOf.intValue();
                                float f15 = ((iIntValue >> 24) & 255) / 255.0f;
                                int iIntValue2 = numValueOf2.intValue();
                                float f16 = ((iIntValue2 >> 24) & 255) / 255.0f;
                                float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
                                float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
                                float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
                                float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
                                float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
                                float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
                                float fM13818i = AbstractC12107L1.m13818i(f16, f15, interpolation, f15);
                                float fM13818i2 = AbstractC12107L1.m13818i(fPow4, fPow, interpolation, fPow);
                                float fM13818i3 = AbstractC12107L1.m13818i(fPow5, fPow2, interpolation, fPow2);
                                float fM13818i4 = AbstractC12107L1.m13818i(fPow6, fPow3, interpolation, fPow3);
                                float fPow7 = ((float) Math.pow(fM13818i2, 0.45454545454545453d)) * 255.0f;
                                float fPow8 = ((float) Math.pow(fM13818i3, 0.45454545454545453d)) * 255.0f;
                                ((int[]) c0858h.f2433c)[0] = Integer.valueOf(Math.round(((float) Math.pow(fM13818i4, 0.45454545454545453d)) * 255.0f) | (Math.round(fM13818i * 255.0f) << 24) | (Math.round(fPow7) << 16) | (Math.round(fPow8) << 8)).intValue();
                                ((C0866p) c0858h.f2431a).invalidateSelf();
                            }
                            break;
                        }
                        ((C0866p) c0858h.f2431a).invalidateSelf();
                    } else {
                        float f17 = 667;
                        fArr[1] = (c17474a.getInterpolation((i10 - C0858h.f2388l[i11]) / f17) * 250.0f) + fArr[1];
                        fArr[0] = (c17474a.getInterpolation((i10 - C0858h.f2389m[i11]) / f17) * 250.0f) + fArr[0];
                        i11++;
                    }
                    break;
                }
                break;
            case 1:
                ((C0858h) obj).f2399j = ((Float) obj2).floatValue();
                break;
            case 2:
                AbstractC0863m abstractC0863m = (AbstractC0863m) obj;
                float fFloatValue2 = ((Float) obj2).floatValue();
                if (abstractC0863m.f2426t0 != fFloatValue2) {
                    abstractC0863m.f2426t0 = fFloatValue2;
                    abstractC0863m.invalidateSelf();
                }
                break;
            case 3:
                C5654e c5654e = (C5654e) obj;
                PointF pointF = (PointF) obj2;
                c5654e.getClass();
                c5654e.f18362a = Math.round(pointF.x);
                int iRound = Math.round(pointF.y);
                c5654e.f18363b = iRound;
                int i14 = c5654e.f18367f + 1;
                c5654e.f18367f = i14;
                if (i14 == c5654e.f18368g) {
                    AbstractC5642H.m6071a(c5654e.f18366e, c5654e.f18362a, iRound, c5654e.f18364c, c5654e.f18365d);
                    c5654e.f18367f = 0;
                    c5654e.f18368g = 0;
                }
                break;
            case 4:
                C5654e c5654e2 = (C5654e) obj;
                PointF pointF2 = (PointF) obj2;
                c5654e2.getClass();
                c5654e2.f18364c = Math.round(pointF2.x);
                int iRound2 = Math.round(pointF2.y);
                c5654e2.f18365d = iRound2;
                int i15 = c5654e2.f18368g + 1;
                c5654e2.f18368g = i15;
                if (c5654e2.f18367f == i15) {
                    AbstractC5642H.m6071a(c5654e2.f18366e, c5654e2.f18362a, c5654e2.f18363b, c5654e2.f18364c, iRound2);
                    c5654e2.f18367f = 0;
                    c5654e2.f18368g = 0;
                }
                break;
            case 5:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC5642H.m6071a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 6:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC5642H.m6071a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 7:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int iRound3 = Math.round(pointF5.x);
                int iRound4 = Math.round(pointF5.y);
                AbstractC5642H.m6071a(view3, iRound3, iRound4, view3.getWidth() + iRound3, view3.getHeight() + iRound4);
                break;
            case 8:
                ImageView imageView = (ImageView) obj;
                Matrix matrix = (Matrix) obj2;
                if (Build.VERSION.SDK_INT >= 29) {
                    imageView.animateTransform(matrix);
                } else if (matrix == null) {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable != null) {
                        drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                        imageView.invalidate();
                    }
                } else if (AbstractC8596Z3.f26421a) {
                    try {
                        imageView.animateTransform(matrix);
                    } catch (NoSuchMethodError unused) {
                        AbstractC8596Z3.f26421a = false;
                        return;
                    }
                }
                break;
            case 9:
                AbstractC5642H.f18332a.mo6077c((View) obj, ((Float) obj2).floatValue());
                break;
            default:
                WeakHashMap weakHashMap = AbstractC0738T.f2096a;
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
