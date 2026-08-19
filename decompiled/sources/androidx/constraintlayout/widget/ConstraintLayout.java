package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.statsig.androidsdk.StatsigLoggerKt;
import io.sentry.android.core.AbstractC15256t;
import io.sentry.android.core.internal.threaddump.C15227b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import livekit.LivekitInternal$NodeStats;
import org.xmlpull.v1.XmlPullParserException;
import p655b2.C11219c;
import p658b5.C11232c;
import p760g2.AbstractC13812i;
import p760g2.C13807d;
import p760g2.C13808e;
import p760g2.C13811h;
import p822j2.AbstractC16045b;
import p822j2.AbstractC16046c;
import p822j2.AbstractC16057n;
import p822j2.AbstractC16059p;
import p822j2.C16047d;
import p822j2.C16048e;
import p822j2.C16049f;
import p822j2.C16056m;
import p822j2.C16060q;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: F0 */
    public static C16060q f32840F0;

    /* JADX INFO: renamed from: A0 */
    public HashMap f32841A0;

    /* JADX INFO: renamed from: B0 */
    public final SparseArray f32842B0;

    /* JADX INFO: renamed from: C0 */
    public final C16048e f32843C0;

    /* JADX INFO: renamed from: D0 */
    public int f32844D0;

    /* JADX INFO: renamed from: E0 */
    public int f32845E0;

    /* JADX INFO: renamed from: o0 */
    public final SparseArray f32846o0;

    /* JADX INFO: renamed from: p0 */
    public final ArrayList f32847p0;

    /* JADX INFO: renamed from: q0 */
    public final C13808e f32848q0;

    /* JADX INFO: renamed from: r0 */
    public int f32849r0;

    /* JADX INFO: renamed from: s0 */
    public int f32850s0;

    /* JADX INFO: renamed from: t0 */
    public int f32851t0;

    /* JADX INFO: renamed from: u0 */
    public int f32852u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f32853v0;

    /* JADX INFO: renamed from: w0 */
    public int f32854w0;

    /* JADX INFO: renamed from: x0 */
    public C16056m f32855x0;

    /* JADX INFO: renamed from: y0 */
    public C11232c f32856y0;

    /* JADX INFO: renamed from: z0 */
    public int f32857z0;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32846o0 = new SparseArray();
        this.f32847p0 = new ArrayList(4);
        this.f32848q0 = new C13808e();
        this.f32849r0 = 0;
        this.f32850s0 = 0;
        this.f32851t0 = Integer.MAX_VALUE;
        this.f32852u0 = Integer.MAX_VALUE;
        this.f32853v0 = true;
        this.f32854w0 = 257;
        this.f32855x0 = null;
        this.f32856y0 = null;
        this.f32857z0 = -1;
        this.f32841A0 = new HashMap();
        this.f32842B0 = new SparseArray();
        this.f32843C0 = new C16048e(this, this);
        this.f32844D0 = 0;
        this.f32845E0 = 0;
        m11363i(attributeSet, 0);
    }

    /* JADX INFO: renamed from: a */
    public static C16047d m11361a() {
        C16047d c16047d = new C16047d(-2, -2);
        c16047d.f49529a = -1;
        c16047d.f49531b = -1;
        c16047d.f49533c = -1.0f;
        c16047d.f49535d = true;
        c16047d.f49537e = -1;
        c16047d.f49539f = -1;
        c16047d.f49541g = -1;
        c16047d.f49543h = -1;
        c16047d.f49545i = -1;
        c16047d.f49547j = -1;
        c16047d.f49549k = -1;
        c16047d.f49551l = -1;
        c16047d.f49553m = -1;
        c16047d.f49555n = -1;
        c16047d.f49557o = -1;
        c16047d.f49559p = -1;
        c16047d.f49561q = 0;
        c16047d.f49562r = 0.0f;
        c16047d.f49563s = -1;
        c16047d.f49564t = -1;
        c16047d.f49565u = -1;
        c16047d.f49566v = -1;
        c16047d.f49567w = Integer.MIN_VALUE;
        c16047d.f49568x = Integer.MIN_VALUE;
        c16047d.f49569y = Integer.MIN_VALUE;
        c16047d.f49570z = Integer.MIN_VALUE;
        c16047d.f49503A = Integer.MIN_VALUE;
        c16047d.f49504B = Integer.MIN_VALUE;
        c16047d.f49505C = Integer.MIN_VALUE;
        c16047d.f49506D = 0;
        c16047d.f49507E = 0.5f;
        c16047d.f49508F = 0.5f;
        c16047d.f49509G = null;
        c16047d.f49510H = -1.0f;
        c16047d.f49511I = -1.0f;
        c16047d.f49512J = 0;
        c16047d.f49513K = 0;
        c16047d.f49514L = 0;
        c16047d.f49515M = 0;
        c16047d.f49516N = 0;
        c16047d.f49517O = 0;
        c16047d.f49518P = 0;
        c16047d.f49519Q = 0;
        c16047d.f49520R = 1.0f;
        c16047d.f49521S = 1.0f;
        c16047d.f49522T = -1;
        c16047d.f49523U = -1;
        c16047d.f49524V = -1;
        c16047d.f49525W = false;
        c16047d.f49526X = false;
        c16047d.f49527Y = null;
        c16047d.f49528Z = 0;
        c16047d.f49530a0 = true;
        c16047d.f49532b0 = true;
        c16047d.f49534c0 = false;
        c16047d.f49536d0 = false;
        c16047d.f49538e0 = false;
        c16047d.f49540f0 = -1;
        c16047d.f49542g0 = -1;
        c16047d.f49544h0 = -1;
        c16047d.f49546i0 = -1;
        c16047d.f49548j0 = Integer.MIN_VALUE;
        c16047d.f49550k0 = Integer.MIN_VALUE;
        c16047d.f49552l0 = 0.5f;
        c16047d.f49560p0 = new C13807d();
        return c16047d;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C16060q getSharedValues() {
        if (f32840F0 == null) {
            C16060q c16060q = new C16060q();
            new SparseIntArray();
            new HashMap();
            f32840F0 = c16060q;
        }
        return f32840F0;
    }

    /* JADX INFO: renamed from: b */
    public final C13807d m11362b(View view) {
        if (view == this) {
            return this.f32848q0;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C16047d) {
            return ((C16047d) view.getLayoutParams()).f49560p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C16047d) {
            return ((C16047d) view.getLayoutParams()).f49560p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16047d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f32847p0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((AbstractC16045b) arrayList.get(i10)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(Separators.COMMA);
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f32853v0 = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m11361a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C16047d c16047d = new C16047d(context, attributeSet);
        c16047d.f49529a = -1;
        c16047d.f49531b = -1;
        c16047d.f49533c = -1.0f;
        c16047d.f49535d = true;
        c16047d.f49537e = -1;
        c16047d.f49539f = -1;
        c16047d.f49541g = -1;
        c16047d.f49543h = -1;
        c16047d.f49545i = -1;
        c16047d.f49547j = -1;
        c16047d.f49549k = -1;
        c16047d.f49551l = -1;
        c16047d.f49553m = -1;
        c16047d.f49555n = -1;
        c16047d.f49557o = -1;
        c16047d.f49559p = -1;
        c16047d.f49561q = 0;
        c16047d.f49562r = 0.0f;
        c16047d.f49563s = -1;
        c16047d.f49564t = -1;
        c16047d.f49565u = -1;
        c16047d.f49566v = -1;
        c16047d.f49567w = Integer.MIN_VALUE;
        c16047d.f49568x = Integer.MIN_VALUE;
        c16047d.f49569y = Integer.MIN_VALUE;
        c16047d.f49570z = Integer.MIN_VALUE;
        c16047d.f49503A = Integer.MIN_VALUE;
        c16047d.f49504B = Integer.MIN_VALUE;
        c16047d.f49505C = Integer.MIN_VALUE;
        c16047d.f49506D = 0;
        c16047d.f49507E = 0.5f;
        c16047d.f49508F = 0.5f;
        c16047d.f49509G = null;
        c16047d.f49510H = -1.0f;
        c16047d.f49511I = -1.0f;
        c16047d.f49512J = 0;
        c16047d.f49513K = 0;
        c16047d.f49514L = 0;
        c16047d.f49515M = 0;
        c16047d.f49516N = 0;
        c16047d.f49517O = 0;
        c16047d.f49518P = 0;
        c16047d.f49519Q = 0;
        c16047d.f49520R = 1.0f;
        c16047d.f49521S = 1.0f;
        c16047d.f49522T = -1;
        c16047d.f49523U = -1;
        c16047d.f49524V = -1;
        c16047d.f49525W = false;
        c16047d.f49526X = false;
        c16047d.f49527Y = null;
        c16047d.f49528Z = 0;
        c16047d.f49530a0 = true;
        c16047d.f49532b0 = true;
        c16047d.f49534c0 = false;
        c16047d.f49536d0 = false;
        c16047d.f49538e0 = false;
        c16047d.f49540f0 = -1;
        c16047d.f49542g0 = -1;
        c16047d.f49544h0 = -1;
        c16047d.f49546i0 = -1;
        c16047d.f49548j0 = Integer.MIN_VALUE;
        c16047d.f49550k0 = Integer.MIN_VALUE;
        c16047d.f49552l0 = 0.5f;
        c16047d.f49560p0 = new C13807d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            int i11 = AbstractC16046c.f49502a.get(index);
            switch (i11) {
                case 1:
                    c16047d.f49524V = typedArrayObtainStyledAttributes.getInt(index, c16047d.f49524V);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49559p);
                    c16047d.f49559p = resourceId;
                    if (resourceId == -1) {
                        c16047d.f49559p = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 3:
                    c16047d.f49561q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49561q);
                    break;
                case 4:
                    float f10 = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49562r) % 360.0f;
                    c16047d.f49562r = f10;
                    if (f10 < 0.0f) {
                        c16047d.f49562r = (360.0f - f10) % 360.0f;
                    }
                    break;
                case 5:
                    c16047d.f49529a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16047d.f49529a);
                    break;
                case 6:
                    c16047d.f49531b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16047d.f49531b);
                    break;
                case 7:
                    c16047d.f49533c = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49533c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49537e);
                    c16047d.f49537e = resourceId2;
                    if (resourceId2 == -1) {
                        c16047d.f49537e = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 9:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49539f);
                    c16047d.f49539f = resourceId3;
                    if (resourceId3 == -1) {
                        c16047d.f49539f = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 10:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49541g);
                    c16047d.f49541g = resourceId4;
                    if (resourceId4 == -1) {
                        c16047d.f49541g = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49543h);
                    c16047d.f49543h = resourceId5;
                    if (resourceId5 == -1) {
                        c16047d.f49543h = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 12:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49545i);
                    c16047d.f49545i = resourceId6;
                    if (resourceId6 == -1) {
                        c16047d.f49545i = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49547j);
                    c16047d.f49547j = resourceId7;
                    if (resourceId7 == -1) {
                        c16047d.f49547j = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49549k);
                    c16047d.f49549k = resourceId8;
                    if (resourceId8 == -1) {
                        c16047d.f49549k = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49551l);
                    c16047d.f49551l = resourceId9;
                    if (resourceId9 == -1) {
                        c16047d.f49551l = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49553m);
                    c16047d.f49553m = resourceId10;
                    if (resourceId10 == -1) {
                        c16047d.f49553m = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 17:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49563s);
                    c16047d.f49563s = resourceId11;
                    if (resourceId11 == -1) {
                        c16047d.f49563s = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 18:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49564t);
                    c16047d.f49564t = resourceId12;
                    if (resourceId12 == -1) {
                        c16047d.f49564t = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49565u);
                    c16047d.f49565u = resourceId13;
                    if (resourceId13 == -1) {
                        c16047d.f49565u = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49566v);
                    c16047d.f49566v = resourceId14;
                    if (resourceId14 == -1) {
                        c16047d.f49566v = typedArrayObtainStyledAttributes.getInt(index, -1);
                    }
                    break;
                case 21:
                    c16047d.f49567w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49567w);
                    break;
                case 22:
                    c16047d.f49568x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49568x);
                    break;
                case 23:
                    c16047d.f49569y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49569y);
                    break;
                case 24:
                    c16047d.f49570z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49570z);
                    break;
                case 25:
                    c16047d.f49503A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49503A);
                    break;
                case 26:
                    c16047d.f49504B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49504B);
                    break;
                case 27:
                    c16047d.f49525W = typedArrayObtainStyledAttributes.getBoolean(index, c16047d.f49525W);
                    break;
                case 28:
                    c16047d.f49526X = typedArrayObtainStyledAttributes.getBoolean(index, c16047d.f49526X);
                    break;
                case 29:
                    c16047d.f49507E = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49507E);
                    break;
                case 30:
                    c16047d.f49508F = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49508F);
                    break;
                case 31:
                    int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c16047d.f49514L = i12;
                    if (i12 == 1) {
                        AbstractC15256t.m16465c("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                    }
                    break;
                case 32:
                    int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c16047d.f49515M = i13;
                    if (i13 == 1) {
                        AbstractC15256t.m16465c("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                    }
                    break;
                case 33:
                    try {
                        c16047d.f49516N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49516N);
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c16047d.f49516N) == -2) {
                            c16047d.f49516N = -2;
                        }
                    }
                    break;
                case 34:
                    try {
                        c16047d.f49518P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49518P);
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c16047d.f49518P) == -2) {
                            c16047d.f49518P = -2;
                        }
                    }
                    break;
                case 35:
                    c16047d.f49520R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49520R));
                    c16047d.f49514L = 2;
                    break;
                case 36:
                    try {
                        c16047d.f49517O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49517O);
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c16047d.f49517O) == -2) {
                            c16047d.f49517O = -2;
                        }
                    }
                    break;
                case 37:
                    try {
                        c16047d.f49519Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49519Q);
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c16047d.f49519Q) == -2) {
                            c16047d.f49519Q = -2;
                        }
                    }
                    break;
                case 38:
                    c16047d.f49521S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49521S));
                    c16047d.f49515M = 2;
                    break;
                default:
                    switch (i11) {
                        case 44:
                            C16056m.m17632m(c16047d, typedArrayObtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c16047d.f49510H = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49510H);
                            break;
                        case 46:
                            c16047d.f49511I = typedArrayObtainStyledAttributes.getFloat(index, c16047d.f49511I);
                            break;
                        case 47:
                            c16047d.f49512J = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER /* 48 */:
                            c16047d.f49513K = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case LivekitInternal$NodeStats.FORWARD_JITTER_FIELD_NUMBER /* 49 */:
                            c16047d.f49522T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16047d.f49522T);
                            break;
                        case StatsigLoggerKt.MAX_EVENTS /* 50 */:
                            c16047d.f49523U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c16047d.f49523U);
                            break;
                        case 51:
                            c16047d.f49527Y = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49555n);
                            c16047d.f49555n = resourceId15;
                            if (resourceId15 == -1) {
                                c16047d.f49555n = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 53:
                            int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, c16047d.f49557o);
                            c16047d.f49557o = resourceId16;
                            if (resourceId16 == -1) {
                                c16047d.f49557o = typedArrayObtainStyledAttributes.getInt(index, -1);
                            }
                            break;
                        case 54:
                            c16047d.f49506D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49506D);
                            break;
                        case 55:
                            c16047d.f49505C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c16047d.f49505C);
                            break;
                        default:
                            switch (i11) {
                                case 64:
                                    C16056m.m17631l(c16047d, typedArrayObtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C16056m.m17631l(c16047d, typedArrayObtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c16047d.f49528Z = typedArrayObtainStyledAttributes.getInt(index, c16047d.f49528Z);
                                    break;
                                case 67:
                                    c16047d.f49535d = typedArrayObtainStyledAttributes.getBoolean(index, c16047d.f49535d);
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c16047d.m17617a();
        return c16047d;
    }

    public int getMaxHeight() {
        return this.f32852u0;
    }

    public int getMaxWidth() {
        return this.f32851t0;
    }

    public int getMinHeight() {
        return this.f32850s0;
    }

    public int getMinWidth() {
        return this.f32849r0;
    }

    public int getOptimizationLevel() {
        return this.f32848q0.f43702E0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        C13808e c13808e = this.f32848q0;
        if (c13808e.f43675k == null) {
            int id3 = getId();
            if (id3 != -1) {
                c13808e.f43675k = getContext().getResources().getResourceEntryName(id3);
            } else {
                c13808e.f43675k = "parent";
            }
        }
        if (c13808e.f43672i0 == null) {
            c13808e.f43672i0 = c13808e.f43675k;
            Log.v("ConstraintLayout", " setDebugName " + c13808e.f43672i0);
        }
        for (C13807d c13807d : c13808e.f43711r0) {
            View view = (View) c13807d.f43668g0;
            if (view != null) {
                if (c13807d.f43675k == null && (id2 = view.getId()) != -1) {
                    c13807d.f43675k = getContext().getResources().getResourceEntryName(id2);
                }
                if (c13807d.f43672i0 == null) {
                    c13807d.f43672i0 = c13807d.f43675k;
                    Log.v("ConstraintLayout", " setDebugName " + c13807d.f43672i0);
                }
            }
        }
        c13808e.mo15386o(sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: i */
    public final void m11363i(AttributeSet attributeSet, int i10) {
        C13808e c13808e = this.f32848q0;
        c13808e.f43668g0 = this;
        C16048e c16048e = this.f32843C0;
        c13808e.f43715v0 = c16048e;
        c13808e.f43713t0.f1988g = c16048e;
        this.f32846o0.put(getId(), this);
        this.f32855x0 = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC16059p.f49705b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f32849r0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f32849r0);
                } else if (index == 17) {
                    this.f32850s0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f32850s0);
                } else if (index == 14) {
                    this.f32851t0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f32851t0);
                } else if (index == 15) {
                    this.f32852u0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f32852u0);
                } else if (index == 113) {
                    this.f32854w0 = typedArrayObtainStyledAttributes.getInt(index, this.f32854w0);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m11364j(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f32856y0 = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C16056m c16056m = new C16056m();
                        this.f32855x0 = c16056m;
                        c16056m.m17641j(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f32855x0 = null;
                    }
                    this.f32857z0 = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c13808e.f43702E0 = this.f32854w0;
        C11219c.f33946p = c13808e.m15402a0(512);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: j */
    public final void m11364j(int i10) {
        Context context = getContext();
        C11232c c11232c = new C11232c();
        c11232c.f33996Y = new SparseArray();
        c11232c.f33997Z = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            C15227b c15227b = null;
            while (true) {
                byte b = 1;
                if (eventType != 1) {
                    if (eventType == 0) {
                        xml.getName();
                    } else if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (!name.equals("ConstraintSet")) {
                                    b = -1;
                                } else {
                                    b = 4;
                                }
                                break;
                            case 80204913:
                                if (!name.equals("State")) {
                                    b = -1;
                                } else {
                                    b = 2;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b = -1;
                                }
                                break;
                            case 1657696882:
                                if (!name.equals("layoutDescription")) {
                                    b = -1;
                                } else {
                                    b = 0;
                                }
                                break;
                            case 1901439077:
                                if (!name.equals("Variant")) {
                                    b = -1;
                                } else {
                                    b = 3;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        if (b == 2) {
                            c15227b = new C15227b(context, xml);
                            ((SparseArray) c11232c.f33996Y).put(c15227b.f47505a, c15227b);
                        } else if (b == 3) {
                            C16049f c16049f = new C16049f(context, xml);
                            if (c15227b != null) {
                                c15227b.f47506b.add(c16049f);
                            }
                        } else if (b == 4) {
                            c11232c.m12492p(context, xml);
                        }
                    }
                    eventType = xml.next();
                }
                this.f32856y0 = c11232c;
                return;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11365k(C13807d c13807d, C16047d c16047d, SparseArray sparseArray, int i10, int i11) {
        View view = (View) this.f32846o0.get(i10);
        C13807d c13807d2 = (C13807d) sparseArray.get(i10);
        if (c13807d2 == null || view == null || !(view.getLayoutParams() instanceof C16047d)) {
            return;
        }
        c16047d.f49534c0 = true;
        if (i11 == 6) {
            C16047d c16047d2 = (C16047d) view.getLayoutParams();
            c16047d2.f49534c0 = true;
            c16047d2.f49560p0.f43634F = true;
        }
        c13807d.mo15381j(6).m15343b(c13807d2.mo15381j(i11), c16047d.f49506D, c16047d.f49505C, true);
        c13807d.f43634F = true;
        c13807d.mo15381j(3).m15351j();
        c13807d.mo15381j(5).m15351j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C16047d c16047d = (C16047d) childAt.getLayoutParams();
            C13807d c13807d = c16047d.f49560p0;
            if (childAt.getVisibility() != 8 || c16047d.f49536d0 || c16047d.f49538e0 || zIsInEditMode) {
                int iM15388s = c13807d.m15388s();
                int iM15389t = c13807d.m15389t();
                childAt.layout(iM15388s, iM15389t, c13807d.m15387r() + iM15388s, c13807d.m15383l() + iM15389t);
            }
        }
        ArrayList arrayList = this.f32847p0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((AbstractC16045b) arrayList.get(i15)).getClass();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:154:0x02df  */
    /* JADX WARN: Code duplicated, block: B:160:0x0300  */
    /* JADX WARN: Code duplicated, block: B:162:0x030a  */
    /* JADX WARN: Code duplicated, block: B:163:0x031d  */
    /* JADX WARN: Code duplicated, block: B:170:0x0344  */
    /* JADX WARN: Code duplicated, block: B:172:0x034e  */
    /* JADX WARN: Code duplicated, block: B:173:0x0362  */
    /* JADX WARN: Code duplicated, block: B:180:0x0388  */
    /* JADX WARN: Code duplicated, block: B:182:0x0395  */
    /* JADX WARN: Code duplicated, block: B:184:0x039a  */
    /* JADX WARN: Code duplicated, block: B:185:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:187:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:190:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:193:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:233:0x0460  */
    /* JADX WARN: Code duplicated, block: B:268:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:310:0x05fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:311:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:313:0x0601  */
    /* JADX WARN: Code duplicated, block: B:314:0x0604  */
    /* JADX WARN: Code duplicated, block: B:315:0x060e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:316:0x0610  */
    /* JADX WARN: Code duplicated, block: B:318:0x061b  */
    /* JADX WARN: Code duplicated, block: B:319:0x061d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0620  */
    /* JADX WARN: Code duplicated, block: B:322:0x0628  */
    /* JADX WARN: Code duplicated, block: B:325:0x0630  */
    /* JADX WARN: Code duplicated, block: B:330:0x063b  */
    /* JADX WARN: Code duplicated, block: B:333:0x066c  */
    /* JADX WARN: Code duplicated, block: B:334:0x066f  */
    /* JADX WARN: Code duplicated, block: B:337:0x0676  */
    /* JADX WARN: Code duplicated, block: B:338:0x0679  */
    /* JADX WARN: Code duplicated, block: B:341:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:343:0x06c0  */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        boolean z6;
        boolean z10;
        int iMin;
        int iMin2;
        boolean z11;
        int i17;
        C13807d c13807d;
        int i18;
        int i19;
        C13807d c13807d2;
        int i20;
        int i21;
        C13807d c13807d3;
        int i22;
        int i23;
        int i24;
        int i25;
        float f10;
        C13807d c13807d4;
        C13807d c13807d5;
        C13807d c13807d6;
        String str;
        int i26;
        int i27;
        int i28;
        float fAbs;
        int i29;
        C13807d c13807d7;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f32844D0 == i10) {
            int i30 = constraintLayout.f32845E0;
        }
        int i31 = 0;
        if (!constraintLayout.f32853v0) {
            int childCount = getChildCount();
            for (int i32 = 0; i32 < childCount; i32++) {
                if (constraintLayout.getChildAt(i32).isLayoutRequested()) {
                    constraintLayout.f32853v0 = true;
                    break;
                }
            }
        }
        constraintLayout.f32844D0 = i10;
        constraintLayout.f32845E0 = i11;
        boolean z12 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C13808e c13808e = constraintLayout.f32848q0;
        c13808e.f43716w0 = z12;
        if (constraintLayout.f32853v0) {
            constraintLayout.f32853v0 = false;
            int childCount2 = getChildCount();
            int i33 = 0;
            while (true) {
                if (i33 >= childCount2) {
                    z11 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i33).isLayoutRequested()) {
                        z11 = true;
                        break;
                    }
                    i33++;
                }
            }
            if (z11) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i34 = 0; i34 < childCount3; i34++) {
                    C13807d c13807dM11362b = constraintLayout.m11362b(constraintLayout.getChildAt(i34));
                    if (c13807dM11362b != null) {
                        c13807dM11362b.mo15359D();
                    }
                }
                Object obj = null;
                if (zIsInEditMode) {
                    for (int i35 = 0; i35 < childCount3; i35++) {
                        View childAt = constraintLayout.getChildAt(i35);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            Integer numValueOf = Integer.valueOf(childAt.getId());
                            if (resourceName instanceof String) {
                                if (constraintLayout.f32841A0 == null) {
                                    constraintLayout.f32841A0 = new HashMap();
                                }
                                int iIndexOf = resourceName.indexOf(Separators.SLASH);
                                constraintLayout.f32841A0.put(iIndexOf != -1 ? resourceName.substring(iIndexOf + 1) : resourceName, numValueOf);
                            }
                            int iIndexOf2 = resourceName.indexOf(47);
                            if (iIndexOf2 != -1) {
                                resourceName = resourceName.substring(iIndexOf2 + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = (View) constraintLayout.f32846o0.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = constraintLayout.findViewById(id2)) != null && viewFindViewById != constraintLayout && viewFindViewById.getParent() == constraintLayout) {
                                    constraintLayout.onViewAdded(viewFindViewById);
                                }
                                c13807d7 = viewFindViewById == constraintLayout ? c13808e : viewFindViewById == null ? null : ((C16047d) viewFindViewById.getLayoutParams()).f49560p0;
                            }
                            c13807d7.f43672i0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (constraintLayout.f32857z0 != -1) {
                    for (int i36 = 0; i36 < childCount3; i36++) {
                        constraintLayout.getChildAt(i36).getId();
                    }
                }
                C16056m c16056m = constraintLayout.f32855x0;
                if (c16056m != null) {
                    c16056m.m17635b(constraintLayout);
                }
                c13808e.f43711r0.clear();
                ArrayList arrayList = constraintLayout.f32847p0;
                int size = arrayList.size();
                if (size > 0) {
                    int i37 = 0;
                    while (i37 < size) {
                        AbstractC16045b abstractC16045b = (AbstractC16045b) arrayList.get(i37);
                        if (abstractC16045b.isInEditMode()) {
                            abstractC16045b.setIds(abstractC16045b.f49499s0);
                        }
                        AbstractC13812i abstractC13812i = abstractC16045b.f49498r0;
                        if (abstractC13812i != null) {
                            abstractC13812i.f43781s0 = i31;
                            Arrays.fill(abstractC13812i.f43780r0, obj);
                            for (int i38 = i31; i38 < abstractC16045b.f49496p0; i38++) {
                                int i39 = abstractC16045b.f49495o0[i38];
                                View view = (View) constraintLayout.f32846o0.get(i39);
                                if (view == null) {
                                    Integer numValueOf2 = Integer.valueOf(i39);
                                    HashMap map = abstractC16045b.f49501u0;
                                    String str2 = (String) map.get(numValueOf2);
                                    int iM17615f = abstractC16045b.m17615f(constraintLayout, str2);
                                    if (iM17615f != 0) {
                                        abstractC16045b.f49495o0[i38] = iM17615f;
                                        map.put(Integer.valueOf(iM17615f), str2);
                                        view = (View) constraintLayout.f32846o0.get(iM17615f);
                                    }
                                }
                                if (view != null) {
                                    abstractC16045b.f49498r0.m15415U(constraintLayout.m11362b(view));
                                }
                            }
                            abstractC16045b.f49498r0.mo15409W();
                        }
                        i37++;
                        obj = null;
                        i31 = 0;
                    }
                }
                for (int i40 = 0; i40 < childCount3; i40++) {
                    constraintLayout.getChildAt(i40);
                }
                SparseArray sparseArray = constraintLayout.f32842B0;
                sparseArray.clear();
                sparseArray.put(0, c13808e);
                sparseArray.put(getId(), c13808e);
                for (int i41 = 0; i41 < childCount3; i41++) {
                    View childAt2 = constraintLayout.getChildAt(i41);
                    sparseArray.put(childAt2.getId(), constraintLayout.m11362b(childAt2));
                }
                int i42 = 0;
                while (i42 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i42);
                    C13807d c13807dM11362b2 = constraintLayout.m11362b(childAt3);
                    if (c13807dM11362b2 != null) {
                        C16047d c16047d = (C16047d) childAt3.getLayoutParams();
                        c13808e.f43711r0.add(c13807dM11362b2);
                        C13808e c13808e2 = c13807dM11362b2.f43649U;
                        if (c13808e2 != null) {
                            c13808e2.f43711r0.remove(c13807dM11362b2);
                            c13807dM11362b2.mo15359D();
                        }
                        c13807dM11362b2.f43649U = c13808e;
                        c16047d.m17617a();
                        c13807dM11362b2.f43670h0 = childAt3.getVisibility();
                        c13807dM11362b2.f43668g0 = childAt3;
                        if (childAt3 instanceof AbstractC16045b) {
                            ((AbstractC16045b) childAt3).mo11359h(c13807dM11362b2, c13808e.f43716w0);
                        }
                        if (c16047d.f49536d0) {
                            C13811h c13811h = (C13811h) c13807dM11362b2;
                            int i43 = c16047d.f49554m0;
                            int i44 = c16047d.f49556n0;
                            float f11 = c16047d.f49558o0;
                            if (f11 != -1.0f) {
                                if (f11 > -1.0f) {
                                    c13811h.f43774r0 = f11;
                                    c13811h.f43775s0 = -1;
                                    c13811h.f43776t0 = -1;
                                }
                            } else if (i43 != -1) {
                                if (i43 > -1) {
                                    c13811h.f43774r0 = -1.0f;
                                    c13811h.f43775s0 = i43;
                                    c13811h.f43776t0 = -1;
                                }
                            } else if (i44 != -1 && i44 > -1) {
                                c13811h.f43774r0 = -1.0f;
                                c13811h.f43775s0 = -1;
                                c13811h.f43776t0 = i44;
                            }
                        } else {
                            int i45 = c16047d.f49540f0;
                            int i46 = c16047d.f49542g0;
                            int i47 = c16047d.f49544h0;
                            int i48 = c16047d.f49546i0;
                            int i49 = c16047d.f49548j0;
                            int i50 = c16047d.f49550k0;
                            float f12 = c16047d.f49552l0;
                            int i51 = c16047d.f49559p;
                            if (i51 != -1) {
                                C13807d c13807d8 = (C13807d) sparseArray.get(i51);
                                if (c13807d8 != null) {
                                    float f13 = c16047d.f49562r;
                                    c13807dM11362b2.m15392w(7, 7, c16047d.f49561q, 0, c13807d8);
                                    c13807dM11362b2.f43633E = f13;
                                }
                                i23 = -1;
                            } else {
                                if (i45 != -1) {
                                    C13807d c13807d9 = (C13807d) sparseArray.get(i45);
                                    if (c13807d9 != null) {
                                        c13807dM11362b2.m15392w(2, 2, ((ViewGroup.MarginLayoutParams) c16047d).leftMargin, i49, c13807d9);
                                    }
                                } else {
                                    i17 = -1;
                                    if (i46 == -1) {
                                        if (i47 != i17) {
                                            c13807d6 = (C13807d) sparseArray.get(i47);
                                            if (c13807d6 != null) {
                                                c13807dM11362b2.m15392w(4, 2, ((ViewGroup.MarginLayoutParams) c16047d).rightMargin, i50, c13807d6);
                                            }
                                        } else if (i48 != i17 && (c13807d = (C13807d) sparseArray.get(i48)) != null) {
                                            c13807dM11362b2.m15392w(4, 4, ((ViewGroup.MarginLayoutParams) c16047d).rightMargin, i50, c13807d);
                                        }
                                        i18 = c16047d.f49545i;
                                        if (i18 != -1) {
                                            c13807d5 = (C13807d) sparseArray.get(i18);
                                            if (c13807d5 != null) {
                                                c13807dM11362b2.m15392w(3, 3, ((ViewGroup.MarginLayoutParams) c16047d).topMargin, c16047d.f49568x, c13807d5);
                                            }
                                        } else {
                                            i19 = c16047d.f49547j;
                                            if (i19 != -1 && (c13807d2 = (C13807d) sparseArray.get(i19)) != null) {
                                                c13807dM11362b2.m15392w(3, 5, ((ViewGroup.MarginLayoutParams) c16047d).topMargin, c16047d.f49568x, c13807d2);
                                            }
                                        }
                                        i20 = c16047d.f49549k;
                                        if (i20 != -1) {
                                            c13807d4 = (C13807d) sparseArray.get(i20);
                                            if (c13807d4 != null) {
                                                c13807dM11362b2.m15392w(5, 3, ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin, c16047d.f49570z, c13807d4);
                                            }
                                        } else {
                                            i21 = c16047d.f49551l;
                                            if (i21 != -1 && (c13807d3 = (C13807d) sparseArray.get(i21)) != null) {
                                                c13807dM11362b2.m15392w(5, 5, ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin, c16047d.f49570z, c13807d3);
                                            }
                                        }
                                        i22 = c16047d.f49553m;
                                        if (i22 != -1) {
                                            i23 = -1;
                                            m11365k(c13807dM11362b2, c16047d, sparseArray, i22, 6);
                                        } else {
                                            i23 = -1;
                                            i24 = c16047d.f49555n;
                                            if (i24 != -1) {
                                                m11365k(c13807dM11362b2, c16047d, sparseArray, i24, 3);
                                            } else {
                                                i25 = c16047d.f49557o;
                                                if (i25 != -1) {
                                                    m11365k(c13807dM11362b2, c16047d, sparseArray, i25, 5);
                                                }
                                            }
                                        }
                                        if (f12 >= 0.0f) {
                                            c13807dM11362b2.f43664e0 = f12;
                                        }
                                        f10 = c16047d.f49508F;
                                        if (f10 >= 0.0f) {
                                            c13807dM11362b2.f43666f0 = f10;
                                        }
                                    } else {
                                        C13807d c13807d10 = (C13807d) sparseArray.get(i46);
                                        if (c13807d10 != null) {
                                            c13807dM11362b2.m15392w(2, 4, ((ViewGroup.MarginLayoutParams) c16047d).leftMargin, i49, c13807d10);
                                        }
                                    }
                                }
                                i17 = -1;
                                if (i47 != i17) {
                                    c13807d6 = (C13807d) sparseArray.get(i47);
                                    if (c13807d6 != null) {
                                        c13807dM11362b2.m15392w(4, 2, ((ViewGroup.MarginLayoutParams) c16047d).rightMargin, i50, c13807d6);
                                    }
                                } else if (i48 != i17) {
                                    c13807dM11362b2.m15392w(4, 4, ((ViewGroup.MarginLayoutParams) c16047d).rightMargin, i50, c13807d);
                                }
                                i18 = c16047d.f49545i;
                                if (i18 != -1) {
                                    c13807d5 = (C13807d) sparseArray.get(i18);
                                    if (c13807d5 != null) {
                                        c13807dM11362b2.m15392w(3, 3, ((ViewGroup.MarginLayoutParams) c16047d).topMargin, c16047d.f49568x, c13807d5);
                                    }
                                } else {
                                    i19 = c16047d.f49547j;
                                    if (i19 != -1) {
                                        c13807dM11362b2.m15392w(3, 5, ((ViewGroup.MarginLayoutParams) c16047d).topMargin, c16047d.f49568x, c13807d2);
                                    }
                                }
                                i20 = c16047d.f49549k;
                                if (i20 != -1) {
                                    c13807d4 = (C13807d) sparseArray.get(i20);
                                    if (c13807d4 != null) {
                                        c13807dM11362b2.m15392w(5, 3, ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin, c16047d.f49570z, c13807d4);
                                    }
                                } else {
                                    i21 = c16047d.f49551l;
                                    if (i21 != -1) {
                                        c13807dM11362b2.m15392w(5, 5, ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin, c16047d.f49570z, c13807d3);
                                    }
                                }
                                i22 = c16047d.f49553m;
                                if (i22 != -1) {
                                    i23 = -1;
                                    m11365k(c13807dM11362b2, c16047d, sparseArray, i22, 6);
                                } else {
                                    i23 = -1;
                                    i24 = c16047d.f49555n;
                                    if (i24 != -1) {
                                        m11365k(c13807dM11362b2, c16047d, sparseArray, i24, 3);
                                    } else {
                                        i25 = c16047d.f49557o;
                                        if (i25 != -1) {
                                            m11365k(c13807dM11362b2, c16047d, sparseArray, i25, 5);
                                        }
                                    }
                                }
                                if (f12 >= 0.0f) {
                                    c13807dM11362b2.f43664e0 = f12;
                                }
                                f10 = c16047d.f49508F;
                                if (f10 >= 0.0f) {
                                    c13807dM11362b2.f43666f0 = f10;
                                }
                            }
                            if (zIsInEditMode && ((i29 = c16047d.f49522T) != i23 || c16047d.f49523U != i23)) {
                                int i52 = c16047d.f49523U;
                                c13807dM11362b2.f43654Z = i29;
                                c13807dM11362b2.f43656a0 = i52;
                            }
                            if (c16047d.f49530a0) {
                                c13807dM11362b2.m15367N(1);
                                c13807dM11362b2.m15371R(((ViewGroup.MarginLayoutParams) c16047d).width);
                                if (((ViewGroup.MarginLayoutParams) c16047d).width == -2) {
                                    c13807dM11362b2.m15367N(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c16047d).width == i23) {
                                if (c16047d.f49525W) {
                                    c13807dM11362b2.m15367N(3);
                                } else {
                                    c13807dM11362b2.m15367N(4);
                                }
                                c13807dM11362b2.mo15381j(2).f43626g = ((ViewGroup.MarginLayoutParams) c16047d).leftMargin;
                                c13807dM11362b2.mo15381j(4).f43626g = ((ViewGroup.MarginLayoutParams) c16047d).rightMargin;
                            } else {
                                c13807dM11362b2.m15367N(3);
                                c13807dM11362b2.m15371R(0);
                            }
                            if (c16047d.f49532b0) {
                                c13807dM11362b2.m15369P(1);
                                c13807dM11362b2.m15366M(((ViewGroup.MarginLayoutParams) c16047d).height);
                                if (((ViewGroup.MarginLayoutParams) c16047d).height == -2) {
                                    c13807dM11362b2.m15369P(2);
                                }
                                str = c16047d.f49509G;
                                if (str != null || str.length() == 0) {
                                    c13807dM11362b2.f43652X = 0.0f;
                                } else {
                                    int length = str.length();
                                    int iIndexOf3 = str.indexOf(44);
                                    if (iIndexOf3 <= 0 || iIndexOf3 >= length - 1) {
                                        i27 = i23;
                                        i28 = 0;
                                    } else {
                                        String strSubstring = str.substring(0, iIndexOf3);
                                        int i53 = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : i23;
                                        i28 = iIndexOf3 + 1;
                                        i27 = i53;
                                    }
                                    int iIndexOf4 = str.indexOf(58);
                                    if (iIndexOf4 < 0 || iIndexOf4 >= length - 1) {
                                        String strSubstring2 = str.substring(i28);
                                        if (strSubstring2.length() > 0) {
                                            fAbs = Float.parseFloat(strSubstring2);
                                        } else {
                                            fAbs = 0.0f;
                                        }
                                    } else {
                                        String strSubstring3 = str.substring(i28, iIndexOf4);
                                        String strSubstring4 = str.substring(iIndexOf4 + 1);
                                        if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                            fAbs = 0.0f;
                                        } else {
                                            try {
                                                float f14 = Float.parseFloat(strSubstring3);
                                                float f15 = Float.parseFloat(strSubstring4);
                                                if (f14 <= 0.0f || f15 <= 0.0f) {
                                                    fAbs = 0.0f;
                                                } else {
                                                    fAbs = i27 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                                                }
                                            } catch (NumberFormatException unused2) {
                                            }
                                        }
                                    }
                                    if (fAbs > 0.0f) {
                                        c13807dM11362b2.f43652X = fAbs;
                                        c13807dM11362b2.f43653Y = i27;
                                    }
                                }
                                float f16 = c16047d.f49510H;
                                float[] fArr = c13807dM11362b2.f43678l0;
                                fArr[0] = f16;
                                fArr[1] = c16047d.f49511I;
                                c13807dM11362b2.f43674j0 = c16047d.f49512J;
                                c13807dM11362b2.f43676k0 = c16047d.f49513K;
                                i26 = c16047d.f49528Z;
                                if (i26 >= 0 && i26 <= 3) {
                                    c13807dM11362b2.f43689r = i26;
                                }
                                c13807dM11362b2.m15368O(c16047d.f49514L, c16047d.f49516N, c16047d.f49518P, c16047d.f49520R);
                                c13807dM11362b2.m15370Q(c16047d.f49515M, c16047d.f49517O, c16047d.f49519Q, c16047d.f49521S);
                            } else if (((ViewGroup.MarginLayoutParams) c16047d).height == i23) {
                                if (c16047d.f49526X) {
                                    c13807dM11362b2.m15369P(3);
                                } else {
                                    c13807dM11362b2.m15369P(4);
                                }
                                c13807dM11362b2.mo15381j(3).f43626g = ((ViewGroup.MarginLayoutParams) c16047d).topMargin;
                                c13807dM11362b2.mo15381j(5).f43626g = ((ViewGroup.MarginLayoutParams) c16047d).bottomMargin;
                            } else {
                                c13807dM11362b2.m15369P(3);
                                c13807dM11362b2.m15366M(0);
                            }
                            str = c16047d.f49509G;
                            if (str != null) {
                                c13807dM11362b2.f43652X = 0.0f;
                            } else {
                                c13807dM11362b2.f43652X = 0.0f;
                            }
                            float f17 = c16047d.f49510H;
                            float[] fArr2 = c13807dM11362b2.f43678l0;
                            fArr2[0] = f17;
                            fArr2[1] = c16047d.f49511I;
                            c13807dM11362b2.f43674j0 = c16047d.f49512J;
                            c13807dM11362b2.f43676k0 = c16047d.f49513K;
                            i26 = c16047d.f49528Z;
                            if (i26 >= 0) {
                                c13807dM11362b2.f43689r = i26;
                            }
                            c13807dM11362b2.m15368O(c16047d.f49514L, c16047d.f49516N, c16047d.f49518P, c16047d.f49520R);
                            c13807dM11362b2.m15370Q(c16047d.f49515M, c16047d.f49517O, c16047d.f49519Q, c16047d.f49521S);
                        }
                    }
                    i42++;
                    constraintLayout = this;
                    childCount3 = childCount3;
                }
            }
            if (z11) {
                c13808e.f43712s0.m12610L(c13808e);
            }
        }
        int i54 = this.f32854w0;
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size3 = View.MeasureSpec.getSize(i11);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i55 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C16048e c16048e = this.f32843C0;
        c16048e.f49572b = iMax3;
        c16048e.f49573c = iMax4;
        c16048e.f49574d = paddingWidth;
        c16048e.f49575e = i55;
        c16048e.f49576f = i10;
        c16048e.f49577g = i11;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        int iMax7 = (iMax5 > 0 || iMax6 > 0) ? ((getContext().getApplicationInfo().flags & 4194304) == 0 || 1 != getLayoutDirection()) ? iMax5 : iMax6 : Math.max(0, getPaddingLeft());
        int i56 = size2 - paddingWidth;
        int i57 = size3 - i55;
        int i58 = c16048e.f49575e;
        int i59 = c16048e.f49574d;
        int childCount4 = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                iMax = childCount4 == 0 ? Math.max(0, this.f32849r0) : 0;
            } else if (mode != 1073741824) {
                i12 = Integer.MIN_VALUE;
                i13 = 1;
                iMax = 0;
            } else {
                i12 = Integer.MIN_VALUE;
                iMax = Math.min(this.f32851t0 - i59, i56);
                i13 = 1;
            }
            if (mode2 != i12) {
                if (mode2 != 0) {
                    if (mode2 != 1073741824) {
                        i14 = 1;
                        iMax2 = 0;
                    } else {
                        iMax2 = Math.min(this.f32852u0 - i58, i57);
                        i14 = 1;
                    }
                } else if (childCount4 == 0) {
                    iMax2 = Math.max(0, this.f32850s0);
                } else {
                    iMax2 = 0;
                }
                if (iMax == c13808e.m15387r() || iMax2 != c13808e.m15383l()) {
                    c13808e.f43713t0.f1984c = true;
                }
                c13808e.f43654Z = 0;
                c13808e.f43656a0 = 0;
                int i60 = this.f32851t0 - i59;
                int i61 = iMax7;
                int[] iArr = c13808e.f43632D;
                iArr[0] = i60;
                iArr[1] = this.f32852u0 - i58;
                c13808e.f43660c0 = 0;
                c13808e.f43662d0 = 0;
                c13808e.m15367N(i13);
                c13808e.m15371R(iMax);
                c13808e.m15369P(i14);
                c13808e.m15366M(iMax2);
                i15 = this.f32849r0 - i59;
                if (i15 < 0) {
                    c13808e.f43660c0 = 0;
                } else {
                    c13808e.f43660c0 = i15;
                }
                i16 = this.f32850s0 - i58;
                if (i16 < 0) {
                    c13808e.f43662d0 = 0;
                } else {
                    c13808e.f43662d0 = i16;
                }
                c13808e.m15401Y(i54, mode, i56, mode2, i57, i61, iMax3);
                int iM15387r = c13808e.m15387r();
                int iM15383l = c13808e.m15383l();
                z6 = c13808e.f43703F0;
                z10 = c13808e.f43704G0;
                C16048e c16048e2 = this.f32843C0;
                int i62 = c16048e2.f49575e;
                int iResolveSizeAndState = View.resolveSizeAndState(iM15387r + c16048e2.f49574d, i10, 0);
                int iResolveSizeAndState2 = View.resolveSizeAndState(iM15383l + i62, i11, 0) & 16777215;
                iMin = Math.min(this.f32851t0, iResolveSizeAndState & 16777215);
                iMin2 = Math.min(this.f32852u0, iResolveSizeAndState2);
                if (z6) {
                    iMin |= 16777216;
                }
                if (z10) {
                    iMin2 |= 16777216;
                }
                setMeasuredDimension(iMin, iMin2);
            }
            if (childCount4 == 0) {
                iMax2 = Math.max(0, this.f32850s0);
            } else {
                iMax2 = i57;
            }
            i14 = 2;
            if (iMax == c13808e.m15387r()) {
                c13808e.f43713t0.f1984c = true;
            } else {
                c13808e.f43713t0.f1984c = true;
            }
            c13808e.f43654Z = 0;
            c13808e.f43656a0 = 0;
            int i63 = this.f32851t0 - i59;
            int i64 = iMax7;
            int[] iArr2 = c13808e.f43632D;
            iArr2[0] = i63;
            iArr2[1] = this.f32852u0 - i58;
            c13808e.f43660c0 = 0;
            c13808e.f43662d0 = 0;
            c13808e.m15367N(i13);
            c13808e.m15371R(iMax);
            c13808e.m15369P(i14);
            c13808e.m15366M(iMax2);
            i15 = this.f32849r0 - i59;
            if (i15 < 0) {
                c13808e.f43660c0 = 0;
            } else {
                c13808e.f43660c0 = i15;
            }
            i16 = this.f32850s0 - i58;
            if (i16 < 0) {
                c13808e.f43662d0 = 0;
            } else {
                c13808e.f43662d0 = i16;
            }
            c13808e.m15401Y(i54, mode, i56, mode2, i57, i64, iMax3);
            int iM15387r2 = c13808e.m15387r();
            int iM15383l2 = c13808e.m15383l();
            z6 = c13808e.f43703F0;
            z10 = c13808e.f43704G0;
            C16048e c16048e3 = this.f32843C0;
            int i65 = c16048e3.f49575e;
            int iResolveSizeAndState3 = View.resolveSizeAndState(iM15387r2 + c16048e3.f49574d, i10, 0);
            int iResolveSizeAndState4 = View.resolveSizeAndState(iM15383l2 + i65, i11, 0) & 16777215;
            iMin = Math.min(this.f32851t0, iResolveSizeAndState3 & 16777215);
            iMin2 = Math.min(this.f32852u0, iResolveSizeAndState4);
            if (z6) {
                iMin |= 16777216;
            }
            if (z10) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        iMax = childCount4 == 0 ? Math.max(0, this.f32849r0) : i56;
        i12 = Integer.MIN_VALUE;
        i13 = 2;
        if (mode2 != i12) {
            if (mode2 != 0) {
                if (mode2 != 1073741824) {
                    i14 = 1;
                    iMax2 = 0;
                } else {
                    iMax2 = Math.min(this.f32852u0 - i58, i57);
                    i14 = 1;
                }
            } else if (childCount4 == 0) {
                iMax2 = Math.max(0, this.f32850s0);
            } else {
                iMax2 = 0;
            }
            if (iMax == c13808e.m15387r()) {
                c13808e.f43713t0.f1984c = true;
            } else {
                c13808e.f43713t0.f1984c = true;
            }
            c13808e.f43654Z = 0;
            c13808e.f43656a0 = 0;
            int i66 = this.f32851t0 - i59;
            int i67 = iMax7;
            int[] iArr3 = c13808e.f43632D;
            iArr3[0] = i66;
            iArr3[1] = this.f32852u0 - i58;
            c13808e.f43660c0 = 0;
            c13808e.f43662d0 = 0;
            c13808e.m15367N(i13);
            c13808e.m15371R(iMax);
            c13808e.m15369P(i14);
            c13808e.m15366M(iMax2);
            i15 = this.f32849r0 - i59;
            if (i15 < 0) {
                c13808e.f43660c0 = 0;
            } else {
                c13808e.f43660c0 = i15;
            }
            i16 = this.f32850s0 - i58;
            if (i16 < 0) {
                c13808e.f43662d0 = 0;
            } else {
                c13808e.f43662d0 = i16;
            }
            c13808e.m15401Y(i54, mode, i56, mode2, i57, i67, iMax3);
            int iM15387r3 = c13808e.m15387r();
            int iM15383l3 = c13808e.m15383l();
            z6 = c13808e.f43703F0;
            z10 = c13808e.f43704G0;
            C16048e c16048e4 = this.f32843C0;
            int i68 = c16048e4.f49575e;
            int iResolveSizeAndState5 = View.resolveSizeAndState(iM15387r3 + c16048e4.f49574d, i10, 0);
            int iResolveSizeAndState6 = View.resolveSizeAndState(iM15383l3 + i68, i11, 0) & 16777215;
            iMin = Math.min(this.f32851t0, iResolveSizeAndState5 & 16777215);
            iMin2 = Math.min(this.f32852u0, iResolveSizeAndState6);
            if (z6) {
                iMin |= 16777216;
            }
            if (z10) {
                iMin2 |= 16777216;
            }
            setMeasuredDimension(iMin, iMin2);
        }
        if (childCount4 == 0) {
            iMax2 = Math.max(0, this.f32850s0);
        } else {
            iMax2 = i57;
        }
        i14 = 2;
        if (iMax == c13808e.m15387r()) {
            c13808e.f43713t0.f1984c = true;
        } else {
            c13808e.f43713t0.f1984c = true;
        }
        c13808e.f43654Z = 0;
        c13808e.f43656a0 = 0;
        int i69 = this.f32851t0 - i59;
        int i610 = iMax7;
        int[] iArr4 = c13808e.f43632D;
        iArr4[0] = i69;
        iArr4[1] = this.f32852u0 - i58;
        c13808e.f43660c0 = 0;
        c13808e.f43662d0 = 0;
        c13808e.m15367N(i13);
        c13808e.m15371R(iMax);
        c13808e.m15369P(i14);
        c13808e.m15366M(iMax2);
        i15 = this.f32849r0 - i59;
        if (i15 < 0) {
            c13808e.f43660c0 = 0;
        } else {
            c13808e.f43660c0 = i15;
        }
        i16 = this.f32850s0 - i58;
        if (i16 < 0) {
            c13808e.f43662d0 = 0;
        } else {
            c13808e.f43662d0 = i16;
        }
        c13808e.m15401Y(i54, mode, i56, mode2, i57, i610, iMax3);
        int iM15387r4 = c13808e.m15387r();
        int iM15383l4 = c13808e.m15383l();
        z6 = c13808e.f43703F0;
        z10 = c13808e.f43704G0;
        C16048e c16048e5 = this.f32843C0;
        int i611 = c16048e5.f49575e;
        int iResolveSizeAndState7 = View.resolveSizeAndState(iM15387r4 + c16048e5.f49574d, i10, 0);
        int iResolveSizeAndState8 = View.resolveSizeAndState(iM15383l4 + i611, i11, 0) & 16777215;
        iMin = Math.min(this.f32851t0, iResolveSizeAndState7 & 16777215);
        iMin2 = Math.min(this.f32852u0, iResolveSizeAndState8);
        if (z6) {
            iMin |= 16777216;
        }
        if (z10) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C13807d c13807dM11362b = m11362b(view);
        if ((view instanceof Guideline) && !(c13807dM11362b instanceof C13811h)) {
            C16047d c16047d = (C16047d) view.getLayoutParams();
            C13811h c13811h = new C13811h();
            c16047d.f49560p0 = c13811h;
            c16047d.f49536d0 = true;
            c13811h.m15414V(c16047d.f49524V);
        }
        if (view instanceof AbstractC16045b) {
            AbstractC16045b abstractC16045b = (AbstractC16045b) view;
            abstractC16045b.m17616i();
            ((C16047d) view.getLayoutParams()).f49538e0 = true;
            ArrayList arrayList = this.f32847p0;
            if (!arrayList.contains(abstractC16045b)) {
                arrayList.add(abstractC16045b);
            }
        }
        this.f32846o0.put(view.getId(), view);
        this.f32853v0 = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f32846o0.remove(view.getId());
        C13807d c13807dM11362b = m11362b(view);
        this.f32848q0.f43711r0.remove(c13807dM11362b);
        c13807dM11362b.mo15359D();
        this.f32847p0.remove(view);
        this.f32853v0 = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f32853v0 = true;
        super.requestLayout();
    }

    public void setConstraintSet(C16056m c16056m) {
        this.f32855x0 = c16056m;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray sparseArray = this.f32846o0;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f32852u0) {
            return;
        }
        this.f32852u0 = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f32851t0) {
            return;
        }
        this.f32851t0 = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f32850s0) {
            return;
        }
        this.f32850s0 = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f32849r0) {
            return;
        }
        this.f32849r0 = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC16057n abstractC16057n) {
        C11232c c11232c = this.f32856y0;
        if (c11232c != null) {
            c11232c.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f32854w0 = i10;
        C13808e c13808e = this.f32848q0;
        c13808e.f43702E0 = i10;
        C11219c.f33946p = c13808e.m15402a0(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f32846o0 = new SparseArray();
        this.f32847p0 = new ArrayList(4);
        this.f32848q0 = new C13808e();
        this.f32849r0 = 0;
        this.f32850s0 = 0;
        this.f32851t0 = Integer.MAX_VALUE;
        this.f32852u0 = Integer.MAX_VALUE;
        this.f32853v0 = true;
        this.f32854w0 = 257;
        this.f32855x0 = null;
        this.f32856y0 = null;
        this.f32857z0 = -1;
        this.f32841A0 = new HashMap();
        this.f32842B0 = new SparseArray();
        this.f32843C0 = new C16048e(this, this);
        this.f32844D0 = 0;
        this.f32845E0 = 0;
        m11363i(attributeSet, i10);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C16047d c16047d = new C16047d(layoutParams);
        c16047d.f49529a = -1;
        c16047d.f49531b = -1;
        c16047d.f49533c = -1.0f;
        c16047d.f49535d = true;
        c16047d.f49537e = -1;
        c16047d.f49539f = -1;
        c16047d.f49541g = -1;
        c16047d.f49543h = -1;
        c16047d.f49545i = -1;
        c16047d.f49547j = -1;
        c16047d.f49549k = -1;
        c16047d.f49551l = -1;
        c16047d.f49553m = -1;
        c16047d.f49555n = -1;
        c16047d.f49557o = -1;
        c16047d.f49559p = -1;
        c16047d.f49561q = 0;
        c16047d.f49562r = 0.0f;
        c16047d.f49563s = -1;
        c16047d.f49564t = -1;
        c16047d.f49565u = -1;
        c16047d.f49566v = -1;
        c16047d.f49567w = Integer.MIN_VALUE;
        c16047d.f49568x = Integer.MIN_VALUE;
        c16047d.f49569y = Integer.MIN_VALUE;
        c16047d.f49570z = Integer.MIN_VALUE;
        c16047d.f49503A = Integer.MIN_VALUE;
        c16047d.f49504B = Integer.MIN_VALUE;
        c16047d.f49505C = Integer.MIN_VALUE;
        c16047d.f49506D = 0;
        c16047d.f49507E = 0.5f;
        c16047d.f49508F = 0.5f;
        c16047d.f49509G = null;
        c16047d.f49510H = -1.0f;
        c16047d.f49511I = -1.0f;
        c16047d.f49512J = 0;
        c16047d.f49513K = 0;
        c16047d.f49514L = 0;
        c16047d.f49515M = 0;
        c16047d.f49516N = 0;
        c16047d.f49517O = 0;
        c16047d.f49518P = 0;
        c16047d.f49519Q = 0;
        c16047d.f49520R = 1.0f;
        c16047d.f49521S = 1.0f;
        c16047d.f49522T = -1;
        c16047d.f49523U = -1;
        c16047d.f49524V = -1;
        c16047d.f49525W = false;
        c16047d.f49526X = false;
        c16047d.f49527Y = null;
        c16047d.f49528Z = 0;
        c16047d.f49530a0 = true;
        c16047d.f49532b0 = true;
        c16047d.f49534c0 = false;
        c16047d.f49536d0 = false;
        c16047d.f49538e0 = false;
        c16047d.f49540f0 = -1;
        c16047d.f49542g0 = -1;
        c16047d.f49544h0 = -1;
        c16047d.f49546i0 = -1;
        c16047d.f49548j0 = Integer.MIN_VALUE;
        c16047d.f49550k0 = Integer.MIN_VALUE;
        c16047d.f49552l0 = 0.5f;
        c16047d.f49560p0 = new C13807d();
        return c16047d;
    }
}
