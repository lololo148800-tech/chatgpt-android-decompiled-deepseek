package p698d6;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import io.sentry.internal.debugmeta.C15384c;
import java.io.IOException;
import java.util.HashMap;
import p117Eb.C2392v;
import p520V5.C7781j;
import p520V5.C7794w;
import p520V5.C7796y;
import p520V5.InterfaceC7763A;
import p540W5.C8430a;
import p591Y5.AbstractC9653d;
import p591Y5.C9655f;
import p591Y5.C9665p;
import p614Z5.C10166a;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: d6.d */
/* JADX INFO: loaded from: classes.dex */
public final class C13031d extends AbstractC13029b {

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ int f41368D;

    /* JADX INFO: renamed from: E */
    public final C8430a f41369E;

    /* JADX INFO: renamed from: F */
    public C9665p f41370F;

    /* JADX INFO: renamed from: G */
    public C9665p f41371G;

    /* JADX INFO: renamed from: H */
    public final Parcelable f41372H;

    /* JADX INFO: renamed from: I */
    public final Object f41373I;

    /* JADX INFO: renamed from: J */
    public final Object f41374J;

    /* JADX INFO: renamed from: K */
    public final Object f41375K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13031d(C7794w c7794w, C13032e c13032e, int i10) {
        super(c7794w, c13032e);
        this.f41368D = i10;
        switch (i10) {
            case 1:
                super(c7794w, c13032e);
                this.f41372H = new RectF();
                C8430a c8430a = new C8430a();
                this.f41369E = c8430a;
                this.f41373I = new float[8];
                this.f41374J = new Path();
                this.f41375K = c13032e;
                c8430a.setAlpha(0);
                c8430a.setStyle(Paint.Style.FILL);
                c8430a.setColor(c13032e.f41387l);
                break;
            default:
                this.f41369E = new C8430a(3, 0);
                this.f41372H = new Rect();
                this.f41373I = new Rect();
                C7781j c7781j = c7794w.f24658Y;
                this.f41374J = c7781j == null ? null : (C7796y) ((HashMap) c7781j.m8041c()).get(c13032e.f41382g);
                C2392v c2392v = this.f41350p.f41399x;
                if (c2392v != null) {
                    this.f41375K = new C9655f(this, this, c2392v);
                }
                break;
        }
    }

    @Override // p698d6.AbstractC13029b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        switch (this.f41368D) {
            case 0:
                super.mo9612c(rectF, matrix, z6);
                C7796y c7796y = (C7796y) this.f41374J;
                if (c7796y != null) {
                    float fM15932c = AbstractC14418g.m15932c();
                    rectF.set(0.0f, 0.0f, c7796y.f24679a * fM15932c, c7796y.f24680b * fM15932c);
                    this.f41348n.mapRect(rectF);
                }
                break;
            default:
                super.mo9612c(rectF, matrix, z6);
                RectF rectF2 = (RectF) this.f41372H;
                C13032e c13032e = (C13032e) this.f41375K;
                rectF2.set(0.0f, 0.0f, c13032e.f41385j, c13032e.f41386k);
                this.f41348n.mapRect(rectF2);
                rectF.set(rectF2);
                break;
        }
    }

    @Override // p698d6.AbstractC13029b, p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        switch (this.f41368D) {
            case 0:
                super.mo9614f(c15384c, obj);
                if (obj == InterfaceC7763A.f24507F) {
                    this.f41370F = new C9665p(c15384c, null);
                } else if (obj == InterfaceC7763A.f24510I) {
                    this.f41371G = new C9665p(c15384c, null);
                }
                break;
            default:
                super.mo9614f(c15384c, obj);
                if (obj == InterfaceC7763A.f24507F) {
                    this.f41370F = new C9665p(c15384c, null);
                } else if (obj == 1) {
                    this.f41371G = new C9665p(c15384c, null);
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x011e  */
    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: j */
    public final void mo14775j(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmapM15933d;
        switch (this.f41368D) {
            case 0:
                C9665p c9665p = this.f41371G;
                C7794w c7794w = this.f41349o;
                C7796y c7796y = (C7796y) this.f41374J;
                if (c9665p == null || (bitmap2 = (Bitmap) c9665p.mo10234e()) == null) {
                    String str = this.f41350p.f41382g;
                    C10166a c10166a = c7794w.f24669s0;
                    if (c10166a != null) {
                        Context contextM8060h = c7794w.m8060h();
                        Context context = c10166a.f30105a;
                        if (contextM8060h != null) {
                            if (context instanceof Application) {
                                contextM8060h = contextM8060h.getApplicationContext();
                            }
                            if (contextM8060h != context) {
                                c7794w.f24669s0 = null;
                            }
                        } else if (context != null) {
                            c7794w.f24669s0 = null;
                        }
                    }
                    if (c7794w.f24669s0 == null) {
                        c7794w.f24669s0 = new C10166a(c7794w.getCallback(), c7794w.f24670t0, c7794w.f24658Y.m8041c());
                    }
                    C10166a c10166a2 = c7794w.f24669s0;
                    if (c10166a2 != null) {
                        String str2 = c10166a2.f30106b;
                        C7796y c7796y2 = (C7796y) c10166a2.f30107c.get(str);
                        if (c7796y2 != null) {
                            bitmapM15933d = c7796y2.f24684f;
                            if (bitmapM15933d != null) {
                                bitmap = null;
                            } else {
                                Context context2 = c10166a2.f30105a;
                                if (context2 == null) {
                                    bitmap = null;
                                } else {
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inScaled = true;
                                    options.inDensity = 160;
                                    String str3 = c7796y2.f24682d;
                                    boolean zStartsWith = str3.startsWith("data:");
                                    int i11 = c7796y2.f24680b;
                                    int i12 = c7796y2.f24679a;
                                    if (!zStartsWith || str3.indexOf("base64,") <= 0) {
                                        try {
                                            if (TextUtils.isEmpty(str2)) {
                                                bitmap = null;
                                                try {
                                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                                } catch (IOException e10) {
                                                    e = e10;
                                                }
                                            } else {
                                                bitmap = null;
                                                try {
                                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                                    if (bitmapDecodeStream == null) {
                                                        AbstractC14413b.m15913b("Decoded image `" + str + "` is null.");
                                                    } else {
                                                        bitmapM15933d = AbstractC14418g.m15933d(bitmapDecodeStream, i12, i11);
                                                        c10166a2.m10762a(str, bitmapM15933d);
                                                    }
                                                } catch (IllegalArgumentException e11) {
                                                    AbstractC14413b.m15914c("Unable to decode image `" + str + "`.", e11);
                                                }
                                            }
                                        } catch (IOException e12) {
                                            e = e12;
                                            bitmap = null;
                                        }
                                        AbstractC14413b.m15914c("Unable to open asset.", e);
                                    } else {
                                        try {
                                            byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                            bitmapM15933d = AbstractC14418g.m15933d(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options), i12, i11);
                                            synchronized (C10166a.f30104d) {
                                                ((C7796y) c10166a2.f30107c.get(str)).f24684f = bitmapM15933d;
                                                break;
                                            }
                                            bitmap = null;
                                        } catch (IllegalArgumentException e13) {
                                            AbstractC14413b.m15914c("data URL did not have correct base64 format.", e13);
                                            bitmap = null;
                                            bitmapM15933d = null;
                                        }
                                    }
                                }
                                bitmapM15933d = bitmap;
                            }
                        } else {
                            bitmap = null;
                            bitmapM15933d = bitmap;
                        }
                        bitmap2 = bitmapM15933d;
                    } else {
                        bitmap = null;
                        bitmap2 = null;
                    }
                    if (bitmap2 == null) {
                        bitmap2 = c7796y != null ? c7796y.f24684f : bitmap;
                    }
                }
                if (bitmap2 == null || bitmap2.isRecycled() || c7796y == null) {
                    return;
                }
                float fM15932c = AbstractC14418g.m15932c();
                C8430a c8430a = this.f41369E;
                c8430a.setAlpha(i10);
                C9665p c9665p2 = this.f41370F;
                if (c9665p2 != null) {
                    c8430a.setColorFilter((ColorFilter) c9665p2.mo10234e());
                }
                canvas.save();
                canvas.concat(matrix);
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                Rect rect = (Rect) this.f41372H;
                rect.set(0, 0, width, height);
                boolean z6 = c7794w.f24675y0;
                Rect rect2 = (Rect) this.f41373I;
                if (z6) {
                    rect2.set(0, 0, (int) (c7796y.f24679a * fM15932c), (int) (c7796y.f24680b * fM15932c));
                } else {
                    rect2.set(0, 0, (int) (bitmap2.getWidth() * fM15932c), (int) (bitmap2.getHeight() * fM15932c));
                }
                C9655f c9655f = (C9655f) this.f41375K;
                if (c9655f != null) {
                    c9655f.m10241b(c8430a, matrix, i10);
                }
                canvas.drawBitmap(bitmap2, rect, rect2, c8430a);
                canvas.restore();
                return;
            default:
                C13032e c13032e = (C13032e) this.f41375K;
                int iAlpha = Color.alpha(c13032e.f41387l);
                if (iAlpha == 0) {
                    return;
                }
                C9665p c9665p3 = this.f41371G;
                Integer num = c9665p3 == null ? null : (Integer) c9665p3.mo10234e();
                Paint paint = this.f41369E;
                if (num != null) {
                    paint.setColor(num.intValue());
                } else {
                    paint.setColor(c13032e.f41387l);
                }
                AbstractC9653d abstractC9653d = this.f41357w.f29135j;
                int iIntValue = (int) ((((iAlpha / 255.0f) * (abstractC9653d == null ? 100 : ((Integer) abstractC9653d.mo10234e()).intValue())) / 100.0f) * (i10 / 255.0f) * 255.0f);
                paint.setAlpha(iIntValue);
                C9665p c9665p4 = this.f41370F;
                if (c9665p4 != null) {
                    paint.setColorFilter((ColorFilter) c9665p4.mo10234e());
                }
                if (iIntValue > 0) {
                    float[] fArr = (float[]) this.f41373I;
                    fArr[0] = 0.0f;
                    fArr[1] = 0.0f;
                    float f10 = c13032e.f41385j;
                    fArr[2] = f10;
                    fArr[3] = 0.0f;
                    fArr[4] = f10;
                    float f11 = c13032e.f41386k;
                    fArr[5] = f11;
                    fArr[6] = 0.0f;
                    fArr[7] = f11;
                    matrix.mapPoints(fArr);
                    Path path = (Path) this.f41374J;
                    path.reset();
                    path.moveTo(fArr[0], fArr[1]);
                    path.lineTo(fArr[2], fArr[3]);
                    path.lineTo(fArr[4], fArr[5]);
                    path.lineTo(fArr[6], fArr[7]);
                    path.lineTo(fArr[0], fArr[1]);
                    path.close();
                    canvas.drawPath(path, paint);
                    return;
                }
                return;
        }
    }
}
