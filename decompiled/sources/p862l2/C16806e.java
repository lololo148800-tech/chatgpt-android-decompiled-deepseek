package p862l2;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p571X9.AbstractC9306j0;
import p844k2.AbstractC16323a;

/* JADX INFO: renamed from: l2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16806e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public AbstractC16803b f53917a;

    /* JADX INFO: renamed from: b */
    public boolean f53918b;

    /* JADX INFO: renamed from: c */
    public final int f53919c;

    /* JADX INFO: renamed from: d */
    public final int f53920d;

    /* JADX INFO: renamed from: e */
    public final int f53921e;

    /* JADX INFO: renamed from: f */
    public final int f53922f;

    /* JADX INFO: renamed from: g */
    public int f53923g;

    /* JADX INFO: renamed from: h */
    public int f53924h;

    /* JADX INFO: renamed from: i */
    public int f53925i;

    /* JADX INFO: renamed from: j */
    public int f53926j;

    /* JADX INFO: renamed from: k */
    public View f53927k;

    /* JADX INFO: renamed from: l */
    public View f53928l;

    /* JADX INFO: renamed from: m */
    public boolean f53929m;

    /* JADX INFO: renamed from: n */
    public boolean f53930n;

    /* JADX INFO: renamed from: o */
    public boolean f53931o;

    /* JADX INFO: renamed from: p */
    public final Rect f53932p;

    public C16806e() {
        super(-2, -2);
        this.f53918b = false;
        this.f53919c = 0;
        this.f53920d = 0;
        this.f53921e = -1;
        this.f53922f = -1;
        this.f53923g = 0;
        this.f53924h = 0;
        this.f53932p = new Rect();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18559a(int i10) {
        if (i10 == 0) {
            return this.f53929m;
        }
        if (i10 != 1) {
            return false;
        }
        return this.f53930n;
    }

    /* JADX INFO: renamed from: b */
    public final void m18560b(AbstractC16803b abstractC16803b) {
        AbstractC16803b abstractC16803b2 = this.f53917a;
        if (abstractC16803b2 != abstractC16803b) {
            if (abstractC16803b2 != null) {
                abstractC16803b2.mo13595e();
            }
            this.f53917a = abstractC16803b;
            this.f53918b = true;
            if (abstractC16803b != null) {
                abstractC16803b.mo13594c(this);
            }
        }
    }

    public C16806e(Context context, AttributeSet attributeSet) {
        AbstractC16803b abstractC16803b;
        super(context, attributeSet);
        this.f53918b = false;
        this.f53919c = 0;
        this.f53920d = 0;
        this.f53921e = -1;
        this.f53922f = -1;
        this.f53923g = 0;
        this.f53924h = 0;
        this.f53932p = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC16323a.f50637b);
        this.f53919c = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f53922f = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f53920d = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.f53921e = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f53923g = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f53924h = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f53918b = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f32859H0;
            if (TextUtils.isEmpty(string)) {
                abstractC16803b = null;
            } else {
                if (string.startsWith(Separators.DOT)) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f32859H0;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f32861J0;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f32860I0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC16803b = (AbstractC16803b) constructor.newInstance(context, attributeSet);
                } catch (Exception e10) {
                    throw new RuntimeException(AbstractC9306j0.m9889h("Could not inflate Behavior subclass ", string), e10);
                }
            }
            this.f53917a = abstractC16803b;
        }
        typedArrayObtainStyledAttributes.recycle();
        AbstractC16803b abstractC16803b2 = this.f53917a;
        if (abstractC16803b2 != null) {
            abstractC16803b2.mo13594c(this);
        }
    }

    public C16806e(C16806e c16806e) {
        super((ViewGroup.MarginLayoutParams) c16806e);
        this.f53918b = false;
        this.f53919c = 0;
        this.f53920d = 0;
        this.f53921e = -1;
        this.f53922f = -1;
        this.f53923g = 0;
        this.f53924h = 0;
        this.f53932p = new Rect();
    }

    public C16806e(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f53918b = false;
        this.f53919c = 0;
        this.f53920d = 0;
        this.f53921e = -1;
        this.f53922f = -1;
        this.f53923g = 0;
        this.f53924h = 0;
        this.f53932p = new Rect();
    }

    public C16806e(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f53918b = false;
        this.f53919c = 0;
        this.f53920d = 0;
        this.f53921e = -1;
        this.f53922f = -1;
        this.f53923g = 0;
        this.f53924h = 0;
        this.f53932p = new Rect();
    }
}
