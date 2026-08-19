package p935p;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import p692d0.AbstractC12978q;
import p692d0.C12960M;
import p692d0.C12977p;
import p714e0.AbstractC13253a;

/* JADX INFO: renamed from: p.b */
/* JADX INFO: loaded from: classes.dex */
public final class C18256b extends Drawable.ConstantState {

    /* JADX INFO: renamed from: A */
    public boolean f58146A;

    /* JADX INFO: renamed from: B */
    public ColorFilter f58147B;

    /* JADX INFO: renamed from: C */
    public boolean f58148C;

    /* JADX INFO: renamed from: D */
    public ColorStateList f58149D;

    /* JADX INFO: renamed from: E */
    public PorterDuff.Mode f58150E;

    /* JADX INFO: renamed from: F */
    public boolean f58151F;

    /* JADX INFO: renamed from: G */
    public boolean f58152G;

    /* JADX INFO: renamed from: H */
    public int[][] f58153H;

    /* JADX INFO: renamed from: I */
    public C12977p f58154I;

    /* JADX INFO: renamed from: J */
    public C12960M f58155J;

    /* JADX INFO: renamed from: a */
    public final C18259e f58156a;

    /* JADX INFO: renamed from: b */
    public Resources f58157b;

    /* JADX INFO: renamed from: c */
    public int f58158c;

    /* JADX INFO: renamed from: d */
    public int f58159d;

    /* JADX INFO: renamed from: e */
    public int f58160e;

    /* JADX INFO: renamed from: f */
    public SparseArray f58161f;

    /* JADX INFO: renamed from: g */
    public Drawable[] f58162g;

    /* JADX INFO: renamed from: h */
    public int f58163h;

    /* JADX INFO: renamed from: i */
    public boolean f58164i;

    /* JADX INFO: renamed from: j */
    public boolean f58165j;

    /* JADX INFO: renamed from: k */
    public Rect f58166k;

    /* JADX INFO: renamed from: l */
    public boolean f58167l;

    /* JADX INFO: renamed from: m */
    public boolean f58168m;

    /* JADX INFO: renamed from: n */
    public int f58169n;

    /* JADX INFO: renamed from: o */
    public int f58170o;

    /* JADX INFO: renamed from: p */
    public int f58171p;

    /* JADX INFO: renamed from: q */
    public int f58172q;

    /* JADX INFO: renamed from: r */
    public boolean f58173r;

    /* JADX INFO: renamed from: s */
    public int f58174s;

    /* JADX INFO: renamed from: t */
    public boolean f58175t;

    /* JADX INFO: renamed from: u */
    public boolean f58176u;

    /* JADX INFO: renamed from: v */
    public boolean f58177v;

    /* JADX INFO: renamed from: w */
    public boolean f58178w;

    /* JADX INFO: renamed from: x */
    public int f58179x;

    /* JADX INFO: renamed from: y */
    public int f58180y;

    /* JADX INFO: renamed from: z */
    public int f58181z;

    public C18256b(C18256b c18256b, C18259e c18259e, Resources resources) {
        this.f58164i = false;
        this.f58167l = false;
        this.f58178w = true;
        this.f58180y = 0;
        this.f58181z = 0;
        this.f58156a = c18259e;
        this.f58157b = resources != null ? resources : c18256b != null ? c18256b.f58157b : null;
        int i10 = c18256b != null ? c18256b.f58158c : 0;
        int i11 = C18259e.f58187F0;
        i10 = resources != null ? resources.getDisplayMetrics().densityDpi : i10;
        i10 = i10 == 0 ? 160 : i10;
        this.f58158c = i10;
        if (c18256b != null) {
            this.f58159d = c18256b.f58159d;
            this.f58160e = c18256b.f58160e;
            this.f58176u = true;
            this.f58177v = true;
            this.f58164i = c18256b.f58164i;
            this.f58167l = c18256b.f58167l;
            this.f58178w = c18256b.f58178w;
            this.f58179x = c18256b.f58179x;
            this.f58180y = c18256b.f58180y;
            this.f58181z = c18256b.f58181z;
            this.f58146A = c18256b.f58146A;
            this.f58147B = c18256b.f58147B;
            this.f58148C = c18256b.f58148C;
            this.f58149D = c18256b.f58149D;
            this.f58150E = c18256b.f58150E;
            this.f58151F = c18256b.f58151F;
            this.f58152G = c18256b.f58152G;
            if (c18256b.f58158c == i10) {
                if (c18256b.f58165j) {
                    this.f58166k = c18256b.f58166k != null ? new Rect(c18256b.f58166k) : null;
                    this.f58165j = true;
                }
                if (c18256b.f58168m) {
                    this.f58169n = c18256b.f58169n;
                    this.f58170o = c18256b.f58170o;
                    this.f58171p = c18256b.f58171p;
                    this.f58172q = c18256b.f58172q;
                    this.f58168m = true;
                }
            }
            if (c18256b.f58173r) {
                this.f58174s = c18256b.f58174s;
                this.f58173r = true;
            }
            if (c18256b.f58175t) {
                this.f58175t = true;
            }
            Drawable[] drawableArr = c18256b.f58162g;
            this.f58162g = new Drawable[drawableArr.length];
            this.f58163h = c18256b.f58163h;
            SparseArray sparseArray = c18256b.f58161f;
            if (sparseArray != null) {
                this.f58161f = sparseArray.clone();
            } else {
                this.f58161f = new SparseArray(this.f58163h);
            }
            int i12 = this.f58163h;
            for (int i13 = 0; i13 < i12; i13++) {
                Drawable drawable = drawableArr[i13];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f58161f.put(i13, constantState);
                    } else {
                        this.f58162g[i13] = drawableArr[i13];
                    }
                }
            }
        } else {
            this.f58162g = new Drawable[10];
            this.f58163h = 0;
        }
        if (c18256b != null) {
            this.f58153H = c18256b.f58153H;
        } else {
            this.f58153H = new int[this.f58162g.length][];
        }
        if (c18256b != null) {
            this.f58154I = c18256b.f58154I;
            this.f58155J = c18256b.f58155J;
        } else {
            this.f58154I = new C12977p((Object) null);
            this.f58155J = new C12960M(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m19774a(Drawable drawable) {
        int i10 = this.f58163h;
        if (i10 >= this.f58162g.length) {
            int i11 = i10 + 10;
            Drawable[] drawableArr = new Drawable[i11];
            Drawable[] drawableArr2 = this.f58162g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i10);
            }
            this.f58162g = drawableArr;
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f58153H, 0, iArr, 0, i10);
            this.f58153H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f58156a);
        this.f58162g[i10] = drawable;
        this.f58163h++;
        this.f58160e = drawable.getChangingConfigurations() | this.f58160e;
        this.f58173r = false;
        this.f58175t = false;
        this.f58166k = null;
        this.f58165j = false;
        this.f58168m = false;
        this.f58176u = false;
        return i10;
    }

    /* JADX INFO: renamed from: b */
    public final void m19775b() {
        this.f58168m = true;
        m19776c();
        int i10 = this.f58163h;
        Drawable[] drawableArr = this.f58162g;
        this.f58170o = -1;
        this.f58169n = -1;
        this.f58172q = 0;
        this.f58171p = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f58169n) {
                this.f58169n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f58170o) {
                this.f58170o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f58171p) {
                this.f58171p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.f58172q) {
                this.f58172q = minimumHeight;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m19776c() {
        SparseArray sparseArray = this.f58161f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iKeyAt = this.f58161f.keyAt(i10);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f58161f.valueAt(i10);
                Drawable[] drawableArr = this.f58162g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.f58157b);
                drawableNewDrawable.setLayoutDirection(this.f58179x);
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.f58156a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f58161f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i10 = this.f58163h;
        Drawable[] drawableArr = this.f58162g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f58161f.get(i11);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final Drawable m19777d(int i10) {
        int iIndexOfKey;
        Drawable drawable = this.f58162g[i10];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f58161f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i10)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f58161f.valueAt(iIndexOfKey)).newDrawable(this.f58157b);
        drawableNewDrawable.setLayoutDirection(this.f58179x);
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.f58156a);
        this.f58162g[i10] = drawableMutate;
        this.f58161f.removeAt(iIndexOfKey);
        if (this.f58161f.size() == 0) {
            this.f58161f = null;
        }
        return drawableMutate;
    }

    /* JADX INFO: renamed from: e */
    public final int m19778e(int i10) {
        Object obj;
        if (i10 < 0) {
            return 0;
        }
        C12960M c12960m = this.f58155J;
        Object obj2 = 0;
        int iM14848a = AbstractC13253a.m14848a(c12960m.f41158p0, i10, c12960m.f41156Z);
        if (iM14848a >= 0 && (obj = c12960m.f41157o0[iM14848a]) != AbstractC12978q.f41193c) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    /* JADX INFO: renamed from: f */
    public final int m19779f(int[] iArr) {
        int[][] iArr2 = this.f58153H;
        int i10 = this.f58163h;
        for (int i11 = 0; i11 < i10; i11++) {
            if (StateSet.stateSetMatches(iArr2[i11], iArr)) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f58159d | this.f58160e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C18259e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C18259e(this, resources);
    }
}
