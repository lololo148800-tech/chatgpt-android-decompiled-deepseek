package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.sentry.android.core.AbstractC15256t;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import p030B2.AbstractC0761i;
import p030B2.AbstractC0763j;
import p030B2.AbstractC0773o;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p544W9.AbstractC8746y3;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k */
    public static final PorterDuff.Mode f32890k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a */
    public int f32891a;

    /* JADX INFO: renamed from: b */
    public Object f32892b;

    /* JADX INFO: renamed from: c */
    public byte[] f32893c;

    /* JADX INFO: renamed from: d */
    public Parcelable f32894d;

    /* JADX INFO: renamed from: e */
    public int f32895e;

    /* JADX INFO: renamed from: f */
    public int f32896f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f32897g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f32898h;

    /* JADX INFO: renamed from: i */
    public String f32899i;

    /* JADX INFO: renamed from: j */
    public String f32900j;

    public IconCompat() {
        this.f32891a = -1;
        this.f32893c = null;
        this.f32894d = null;
        this.f32895e = 0;
        this.f32896f = 0;
        this.f32897g = null;
        this.f32898h = f32890k;
        this.f32899i = null;
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m11383a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z6) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public static IconCompat m11384b(Resources resources, String str, int i10) {
        str.getClass();
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f32895e = i10;
        if (resources != null) {
            try {
                iconCompat.f32892b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f32892b = str;
        }
        iconCompat.f32900j = str;
        return iconCompat;
    }

    /* JADX INFO: renamed from: c */
    public final int m11385c() {
        int i10 = this.f32891a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f32895e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f32892b;
        if (i11 >= 28) {
            return AbstractC0761i.m1673e(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon resource", e10);
            return 0;
        } catch (NoSuchMethodException e11) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon resource", e11);
            return 0;
        } catch (InvocationTargetException e12) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon resource", e12);
            return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m11386d() {
        int i10 = this.f32891a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f32892b;
        if (i11 >= 28) {
            return AbstractC0761i.m1681m(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
        } catch (IllegalAccessException e10) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon type " + obj, e10);
            return -1;
        } catch (NoSuchMethodException e11) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon type " + obj, e11);
            return -1;
        } catch (InvocationTargetException e12) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon type " + obj, e12);
            return -1;
        }
    }

    /* JADX INFO: renamed from: e */
    public final Uri m11387e() {
        int i10 = this.f32891a;
        if (i10 != -1) {
            if (i10 == 4 || i10 == 6) {
                return Uri.parse((String) this.f32892b);
            }
            throw new IllegalStateException("called getUri() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f32892b;
        if (i11 >= 28) {
            return AbstractC0761i.m1682n(obj);
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
        } catch (IllegalAccessException e10) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon uri", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon uri", e11);
            return null;
        } catch (InvocationTargetException e12) {
            AbstractC15256t.m16466d("IconCompat", "Unable to get icon uri", e12);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final InputStream m11388f(Context context) {
        Uri uriM11387e = m11387e();
        String scheme = uriM11387e.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriM11387e);
            } catch (Exception e10) {
                AbstractC15256t.m16483u("IconCompat", "Unable to load image from URI: " + uriM11387e, e10);
                return null;
            }
        }
        try {
            File file = new File((String) this.f32892b);
            return AbstractC8746y3.m9492c(file, new FileInputStream(file));
        } catch (FileNotFoundException e11) {
            AbstractC15256t.m16483u("IconCompat", "Unable to load image from path: " + uriM11387e, e11);
            return null;
        }
    }

    public final String toString() {
        String str;
        if (this.f32891a == -1) {
            return String.valueOf(this.f32892b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        switch (this.f32891a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = SDPKeywords.URI;
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb2.append(str);
        switch (this.f32891a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f32892b).getWidth());
                sb2.append("x");
                sb2.append(((Bitmap) this.f32892b).getHeight());
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f32900j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m11385c())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f32895e);
                if (this.f32896f != 0) {
                    sb2.append(" off=");
                    sb2.append(this.f32896f);
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f32892b);
                break;
        }
        if (this.f32897g != null) {
            sb2.append(" tint=");
            sb2.append(this.f32897g);
        }
        if (this.f32898h != f32890k) {
            sb2.append(" mode=");
            sb2.append(this.f32898h);
        }
        sb2.append(Separators.RPAREN);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: g */
    public final Icon m11389g(Context context) {
        Icon iconCreateWithBitmap;
        String strM1674f;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f32891a;
        switch (i11) {
            case -1:
                return (Icon) this.f32892b;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) this.f32892b);
                break;
            case 2:
                if (i11 == -1) {
                    Object obj = this.f32892b;
                    String str = QzvfuIgrngtl.sTVvzdwI;
                    if (i10 >= 28) {
                        strM1674f = AbstractC0761i.m1674f(obj);
                    } else {
                        try {
                            strM1674f = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e10) {
                            AbstractC15256t.m16466d("IconCompat", str, e10);
                            strM1674f = null;
                        } catch (NoSuchMethodException e11) {
                            AbstractC15256t.m16466d("IconCompat", str, e11);
                            strM1674f = null;
                        } catch (InvocationTargetException e12) {
                            AbstractC15256t.m16466d("IconCompat", str, e12);
                            strM1674f = null;
                        }
                    }
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("called getResPackage() on " + this);
                    }
                    String str2 = this.f32900j;
                    strM1674f = (str2 == null || TextUtils.isEmpty(str2)) ? ((String) this.f32892b).split(":", -1)[0] : this.f32900j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strM1674f, this.f32895e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) this.f32892b, this.f32895e, this.f32896f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) this.f32892b);
                break;
            case 5:
                iconCreateWithBitmap = i10 < 26 ? Icon.createWithBitmap(m11383a((Bitmap) this.f32892b, false)) : AbstractC0773o.m1717a((Bitmap) this.f32892b);
                break;
            case 6:
                if (i10 >= 30) {
                    iconCreateWithBitmap = AbstractC0763j.m1693b(m11387e());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + m11387e());
                    }
                    InputStream inputStreamM11388f = m11388f(context);
                    if (inputStreamM11388f == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + m11387e());
                    }
                    if (i10 < 26) {
                        iconCreateWithBitmap = Icon.createWithBitmap(m11383a(BitmapFactory.decodeStream(inputStreamM11388f), false));
                    } else {
                        iconCreateWithBitmap = AbstractC0773o.m1717a(BitmapFactory.decodeStream(inputStreamM11388f));
                    }
                }
                break;
        }
        ColorStateList colorStateList = this.f32897g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.f32898h;
        if (mode == f32890k) {
            return iconCreateWithBitmap;
        }
        iconCreateWithBitmap.setTintMode(mode);
        return iconCreateWithBitmap;
    }

    public IconCompat(int i10) {
        this.f32893c = null;
        this.f32894d = null;
        this.f32895e = 0;
        this.f32896f = 0;
        this.f32897g = null;
        this.f32898h = f32890k;
        this.f32899i = null;
        this.f32891a = i10;
    }
}
