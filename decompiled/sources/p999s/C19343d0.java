package p999s;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import io.sentry.android.core.AbstractC15256t;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p817j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: s.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19343d0 {

    /* JADX INFO: renamed from: l */
    public static final RectF f61261l = new RectF();

    /* JADX INFO: renamed from: m */
    public static final ConcurrentHashMap f61262m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public int f61263a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f61264b = false;

    /* JADX INFO: renamed from: c */
    public float f61265c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f61266d = -1.0f;

    /* JADX INFO: renamed from: e */
    public float f61267e = -1.0f;

    /* JADX INFO: renamed from: f */
    public int[] f61268f = new int[0];

    /* JADX INFO: renamed from: g */
    public boolean f61269g = false;

    /* JADX INFO: renamed from: h */
    public TextPaint f61270h;

    /* JADX INFO: renamed from: i */
    public final TextView f61271i;

    /* JADX INFO: renamed from: j */
    public final Context f61272j;

    /* JADX INFO: renamed from: k */
    public final C19334a0 f61273k;

    public C19343d0(TextView textView) {
        this.f61271i = textView;
        this.f61272j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f61273k = new C19337b0();
        } else {
            this.f61273k = new C19334a0();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int[] m20446b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    /* JADX INFO: renamed from: d */
    public static Method m20447d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f61262m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                concurrentHashMap.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e10) {
            AbstractC15256t.m16483u("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static Object m20448e(Object obj, Object obj2, String str) {
        try {
            return m20447d(str).invoke(obj, null);
        } catch (Exception e10) {
            AbstractC15256t.m16483u("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20449a() {
        if (m20451f()) {
            if (this.f61264b) {
                if (this.f61271i.getMeasuredHeight() <= 0 || this.f61271i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f61273k.mo20434b(this.f61271i) ? 1048576 : (this.f61271i.getMeasuredWidth() - this.f61271i.getTotalPaddingLeft()) - this.f61271i.getTotalPaddingRight();
                int height = (this.f61271i.getHeight() - this.f61271i.getCompoundPaddingBottom()) - this.f61271i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f61261l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fM20450c = m20450c(rectF);
                        if (fM20450c != this.f61271i.getTextSize()) {
                            m20452g(0, fM20450c);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f61264b = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m20450c(RectF rectF) {
        CharSequence transformation;
        int length = this.f61268f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f61268f[i13];
            TextView textView = this.f61271i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f61270h;
            if (textPaint == null) {
                this.f61270h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f61270h.set(textView.getPaint());
            this.f61270h.setTextSize(i14);
            StaticLayout staticLayoutM20431a = AbstractC19331Z.m20431a(text, (Layout.Alignment) m20448e(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment"), Math.round(rectF.right), maxLines, this.f61271i, this.f61270h, this.f61273k);
            if ((maxLines == -1 || (staticLayoutM20431a.getLineCount() <= maxLines && staticLayoutM20431a.getLineEnd(staticLayoutM20431a.getLineCount() - 1) == text.length())) && staticLayoutM20431a.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f61268f[i11];
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20451f() {
        return m20455j() && this.f61263a != 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m20452g(int i10, float f10) {
        Context context = this.f61272j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f61271i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f61264b = false;
                try {
                    Method methodM20447d = m20447d("nullLayouts");
                    if (methodM20447d != null) {
                        methodM20447d.invoke(textView, null);
                    }
                } catch (Exception e10) {
                    AbstractC15256t.m16483u("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m20453h() {
        if (m20455j() && this.f61263a == 1) {
            if (!this.f61269g || this.f61268f.length == 0) {
                int iFloor = ((int) Math.floor((this.f61267e - this.f61266d) / this.f61265c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f61265c) + this.f61266d);
                }
                this.f61268f = m20446b(iArr);
            }
            this.f61264b = true;
        } else {
            this.f61264b = false;
        }
        return this.f61264b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m20454i() {
        int[] iArr = this.f61268f;
        int length = iArr.length;
        boolean z6 = length > 0;
        this.f61269g = z6;
        if (z6) {
            this.f61263a = 1;
            this.f61266d = iArr[0];
            this.f61267e = iArr[length - 1];
            this.f61265c = -1.0f;
        }
        return z6;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m20455j() {
        return !(this.f61271i instanceof C19376s);
    }

    /* JADX INFO: renamed from: k */
    public final void m20456k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f61263a = 1;
        this.f61266d = f10;
        this.f61267e = f11;
        this.f61265c = f12;
        this.f61269g = false;
    }
}
