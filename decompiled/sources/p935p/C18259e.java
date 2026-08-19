package p935p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p353O4.C6116c;
import p353O4.C6119f;
import p353O4.C6130q;
import p594Y9.AbstractC9740H4;
import p952q.AbstractC18541a;
import p952q.AbstractC18542b;
import p955q2.AbstractC18610b;
import p999s.C19301J0;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes.dex */
public final class C18259e extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: F0 */
    public static final /* synthetic */ int f58187F0 = 0;

    /* JADX INFO: renamed from: A0 */
    public C18256b f58188A0;

    /* JADX INFO: renamed from: B0 */
    public AbstractC9740H4 f58189B0;

    /* JADX INFO: renamed from: E0 */
    public boolean f58192E0;

    /* JADX INFO: renamed from: Y */
    public C18256b f58193Y;

    /* JADX INFO: renamed from: Z */
    public Rect f58194Z;

    /* JADX INFO: renamed from: o0 */
    public Drawable f58195o0;

    /* JADX INFO: renamed from: p0 */
    public Drawable f58196p0;

    /* JADX INFO: renamed from: r0 */
    public boolean f58198r0;

    /* JADX INFO: renamed from: t0 */
    public boolean f58200t0;

    /* JADX INFO: renamed from: u0 */
    public RunnableC18260f f58201u0;

    /* JADX INFO: renamed from: v0 */
    public long f58202v0;

    /* JADX INFO: renamed from: w0 */
    public long f58203w0;

    /* JADX INFO: renamed from: x0 */
    public C6116c f58204x0;

    /* JADX INFO: renamed from: y0 */
    public C18256b f58205y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f58206z0;

    /* JADX INFO: renamed from: q0 */
    public int f58197q0 = 255;

    /* JADX INFO: renamed from: s0 */
    public int f58199s0 = -1;

    /* JADX INFO: renamed from: C0 */
    public int f58190C0 = -1;

    /* JADX INFO: renamed from: D0 */
    public int f58191D0 = -1;

    public C18259e(C18256b c18256b, Resources resources) {
        m19788i(new C18256b(c18256b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX INFO: renamed from: c */
    public static C18259e m19780c(Context context, Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int next;
        int next2;
        Context context2 = context;
        Resources resources2 = resources;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        String name = xmlResourceParser.getName();
        if (!name.equals("animated-selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        C18259e c18259e = new C18259e(null, null);
        TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources2, theme, attributeSet, AbstractC18542b.f59070a);
        int i10 = 1;
        c18259e.setVisible(typedArrayM19964h.getBoolean(1, true), true);
        C18256b c18256b = c18259e.f58188A0;
        c18256b.f58159d |= AbstractC18541a.m19909b(typedArrayM19964h);
        int i11 = 2;
        c18256b.f58164i = typedArrayM19964h.getBoolean(2, c18256b.f58164i);
        int i12 = 3;
        c18256b.f58167l = typedArrayM19964h.getBoolean(3, c18256b.f58167l);
        c18256b.f58180y = typedArrayM19964h.getInt(4, c18256b.f58180y);
        c18256b.f58181z = typedArrayM19964h.getInt(5, c18256b.f58181z);
        boolean z6 = false;
        c18259e.setDither(typedArrayM19964h.getBoolean(0, c18256b.f58178w));
        C18256b c18256b2 = c18259e.f58193Y;
        if (resources2 != null) {
            c18256b2.f58157b = resources2;
            int i13 = resources.getDisplayMetrics().densityDpi;
            if (i13 == 0) {
                i13 = 160;
            }
            int i14 = c18256b2.f58158c;
            c18256b2.f58158c = i13;
            if (i14 != i13) {
                c18256b2.f58168m = false;
                c18256b2.f58165j = false;
            }
        } else {
            c18256b2.getClass();
        }
        typedArrayM19964h.recycle();
        int depth2 = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next3 = xmlResourceParser.next();
            if (next3 == i10 || ((depth = xmlResourceParser.getDepth()) < depth2 && next3 == i12)) {
                break;
            }
            if (next3 == i11 && depth <= depth2) {
                if (xmlResourceParser.getName().equals("item")) {
                    TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources2, theme, attributeSet, AbstractC18542b.f59071b);
                    int resourceId = typedArrayM19964h2.getResourceId(z6 ? 1 : 0, z6 ? 1 : 0);
                    int resourceId2 = typedArrayM19964h2.getResourceId(i10, -1);
                    Drawable drawableM20384f = resourceId2 > 0 ? C19301J0.m20377d().m20384f(context2, resourceId2) : null;
                    typedArrayM19964h2.recycle();
                    int attributeCount = attributeSet.getAttributeCount();
                    int[] iArr = new int[attributeCount];
                    int i15 = z6 ? 1 : 0;
                    for (int i16 = i15 == true ? 1 : 0; i16 < attributeCount; i16++) {
                        int attributeNameResource = attributeSet.getAttributeNameResource(i16);
                        if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                            int i17 = (i15 == true ? 1 : 0) + 1;
                            if (!attributeSet.getAttributeBooleanValue(i16, z6)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr[i15 == true ? 1 : 0] = attributeNameResource;
                            i15 = i17;
                        }
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i15 == true ? 1 : 0);
                    if (drawableM20384f == null) {
                        do {
                            next2 = xmlResourceParser.next();
                        } while (next2 == 4);
                        if (next2 != 2) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (xmlResourceParser.getName().equals("vector")) {
                            drawableM20384f = new C6130q();
                            drawableM20384f.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                        } else {
                            drawableM20384f = AbstractC18541a.m19908a(resources, xmlResourceParser, attributeSet, theme);
                        }
                    }
                    if (drawableM20384f == null) {
                        throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    C18256b c18256b3 = c18259e.f58188A0;
                    int iM19774a = c18256b3.m19774a(drawableM20384f);
                    c18256b3.f58153H[iM19774a] = iArrTrimStateSet;
                    c18256b3.f58155J.m14654e(iM19774a, Integer.valueOf(resourceId));
                } else {
                    if (xmlResourceParser.getName().equals("transition")) {
                        TypedArray typedArrayM19964h3 = AbstractC18610b.m19964h(resources2, theme, attributeSet, AbstractC18542b.f59072c);
                        int resourceId3 = typedArrayM19964h3.getResourceId(2, -1);
                        int resourceId4 = typedArrayM19964h3.getResourceId(1, -1);
                        int resourceId5 = typedArrayM19964h3.getResourceId(z6 ? 1 : 0, -1);
                        Drawable drawableM20384f2 = resourceId5 > 0 ? C19301J0.m20377d().m20384f(context2, resourceId5) : null;
                        boolean z10 = typedArrayM19964h3.getBoolean(3, z6);
                        typedArrayM19964h3.recycle();
                        if (drawableM20384f2 == null) {
                            do {
                                next = xmlResourceParser.next();
                            } while (next == 4);
                            if (next != 2) {
                                throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                            }
                            if (xmlResourceParser.getName().equals("animated-vector")) {
                                drawableM20384f2 = new C6119f(context2);
                                drawableM20384f2.inflate(resources2, xmlResourceParser2, attributeSet, theme);
                            } else {
                                drawableM20384f2 = AbstractC18541a.m19908a(resources, xmlResourceParser, attributeSet, theme);
                            }
                        }
                        if (drawableM20384f2 == null) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                        }
                        if (resourceId3 == -1 || resourceId4 == -1) {
                            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
                        }
                        C18256b c18256b4 = c18259e.f58188A0;
                        int iM19774a2 = c18256b4.m19774a(drawableM20384f2);
                        long j10 = resourceId3;
                        long j11 = resourceId4;
                        long j12 = (j10 << 32) | j11;
                        long j13 = z10 ? 8589934592L : 0L;
                        long j14 = iM19774a2;
                        c18256b4.f58154I.m14661a(j12, Long.valueOf(j14 | j13));
                        if (z10) {
                            c18256b4.f58154I.m14661a((j11 << 32) | j10, Long.valueOf(j14 | 4294967296L | j13));
                        }
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                        i10 = 1;
                        z6 = false;
                    } else {
                        context2 = context;
                        resources2 = resources;
                        xmlResourceParser2 = xmlResourceParser;
                    }
                    i11 = 2;
                    i12 = 3;
                }
                i10 = 1;
                i11 = 2;
                i12 = 3;
            }
        }
        c18259e.onStateChange(c18259e.getState());
        return c18259e;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m19781a(boolean z6) {
        boolean z10;
        Drawable drawable;
        long j10;
        boolean z11 = true;
        this.f58198r0 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f58195o0;
        if (drawable2 != null) {
            long j11 = this.f58202v0;
            if (j11 != 0) {
                if (j11 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f58197q0);
                    this.f58202v0 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j11 - jUptimeMillis) * 255)) / this.f58193Y.f58180y)) * this.f58197q0) / 255);
                    z10 = true;
                }
            }
            drawable = this.f58196p0;
            if (drawable != null) {
                j10 = this.f58203w0;
                if (j10 == 0) {
                    if (j10 <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f58196p0 = null;
                        this.f58203w0 = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f58193Y.f58181z) * this.f58197q0) / 255);
                    }
                }
                if (z6 || !z11) {
                }
                scheduleSelf(this.f58201u0, jUptimeMillis + 16);
                return;
            }
            this.f58203w0 = 0L;
            z11 = z10;
            if (z6) {
            }
        }
        this.f58202v0 = 0L;
        z10 = false;
        drawable = this.f58196p0;
        if (drawable != null) {
            j10 = this.f58203w0;
            if (j10 == 0) {
                if (j10 <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f58196p0 = null;
                    this.f58203w0 = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j10 - jUptimeMillis) * 255)) / this.f58193Y.f58181z) * this.f58197q0) / 255);
                }
            }
            if (z6) {
            }
        }
        this.f58203w0 = 0L;
        z11 = z10;
        if (z6) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        m19782b(theme);
        onStateChange(getState());
    }

    /* JADX INFO: renamed from: b */
    public final void m19782b(Resources.Theme theme) {
        C18256b c18256b = this.f58193Y;
        if (theme == null) {
            c18256b.getClass();
            return;
        }
        c18256b.m19776c();
        int i10 = c18256b.f58163h;
        Drawable[] drawableArr = c18256b.f58162g;
        for (int i11 = 0; i11 < i10; i11++) {
            Drawable drawable = drawableArr[i11];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i11].applyTheme(theme);
                c18256b.f58160e |= drawableArr[i11].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c18256b.f58157b = resources;
            int i12 = resources.getDisplayMetrics().densityDpi;
            if (i12 == 0) {
                i12 = 160;
            }
            int i13 = c18256b.f58158c;
            c18256b.f58158c = i12;
            if (i13 != i12) {
                c18256b.f58168m = false;
                c18256b.f58165j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f58193Y.canApplyTheme();
    }

    /* JADX INFO: renamed from: d */
    public final void m19783d(Drawable drawable) {
        if (this.f58204x0 == null) {
            this.f58204x0 = new C6116c();
        }
        C6116c c6116c = this.f58204x0;
        c6116c.f19909Z = drawable.getCallback();
        drawable.setCallback(c6116c);
        try {
            if (this.f58193Y.f58180y <= 0 && this.f58198r0) {
                drawable.setAlpha(this.f58197q0);
            }
            C18256b c18256b = this.f58193Y;
            if (c18256b.f58148C) {
                drawable.setColorFilter(c18256b.f58147B);
            } else {
                if (c18256b.f58151F) {
                    drawable.setTintList(c18256b.f58149D);
                }
                C18256b c18256b2 = this.f58193Y;
                if (c18256b2.f58152G) {
                    drawable.setTintMode(c18256b2.f58150E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f58193Y.f58178w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f58193Y.f58146A);
            Rect rect = this.f58194Z;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C6116c c6116c2 = this.f58204x0;
            Drawable.Callback callback = (Drawable.Callback) c6116c2.f19909Z;
            c6116c2.f19909Z = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f58196p0;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m19784e() {
        boolean z6;
        Drawable drawable = this.f58196p0;
        boolean z10 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f58196p0 = null;
            z6 = true;
        } else {
            z6 = false;
        }
        Drawable drawable2 = this.f58195o0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f58198r0) {
                this.f58195o0.setAlpha(this.f58197q0);
            }
        }
        if (this.f58203w0 != 0) {
            this.f58203w0 = 0L;
            z6 = true;
        }
        if (this.f58202v0 != 0) {
            this.f58202v0 = 0L;
        } else {
            z10 = z6;
        }
        if (z10) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m19785f() {
        if (!this.f58200t0 && super.mutate() == this) {
            C18256b c18256b = new C18256b(this.f58188A0, this, null);
            c18256b.f58154I = c18256b.f58154I.clone();
            c18256b.f58155J = c18256b.f58155J.clone();
            m19788i(c18256b);
            this.f58200t0 = true;
        }
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final Drawable m19786g() {
        if (!this.f58206z0) {
            m19785f();
            C18256b c18256b = this.f58205y0;
            c18256b.f58154I = c18256b.f58154I.clone();
            c18256b.f58155J = c18256b.f58155J.clone();
            this.f58206z0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f58197q0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f58193Y.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z6;
        C18256b c18256b = this.f58193Y;
        if (!c18256b.f58176u) {
            c18256b.m19776c();
            c18256b.f58176u = true;
            int i10 = c18256b.f58163h;
            Drawable[] drawableArr = c18256b.f58162g;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    c18256b.f58177v = true;
                    z6 = true;
                    break;
                }
                if (drawableArr[i11].getConstantState() == null) {
                    c18256b.f58177v = false;
                    z6 = false;
                    break;
                }
                i11++;
            }
        } else {
            z6 = c18256b.f58177v;
        }
        if (!z6) {
            return null;
        }
        this.f58193Y.f58159d = getChangingConfigurations();
        return this.f58193Y;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f58195o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f58194Z;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58167l) {
            if (!c18256b.f58168m) {
                c18256b.m19775b();
            }
            return c18256b.f58170o;
        }
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58167l) {
            if (!c18256b.f58168m) {
                c18256b.m19775b();
            }
            return c18256b.f58169n;
        }
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58167l) {
            if (!c18256b.f58168m) {
                c18256b.m19775b();
            }
            return c18256b.f58172q;
        }
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58167l) {
            if (!c18256b.f58168m) {
                c18256b.m19775b();
            }
            return c18256b.f58171p;
        }
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f58195o0;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58173r) {
            return c18256b.f58174s;
        }
        c18256b.m19776c();
        int i10 = c18256b.f58163h;
        Drawable[] drawableArr = c18256b.f58162g;
        int opacity = i10 > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i11 = 1; i11 < i10; i11++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i11].getOpacity());
        }
        c18256b.f58174s = opacity;
        c18256b.f58173r = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C18256b c18256b = this.f58193Y;
        boolean padding = false;
        Rect rect2 = null;
        if (!c18256b.f58164i) {
            Rect rect3 = c18256b.f58166k;
            if (rect3 != null || c18256b.f58165j) {
                rect2 = rect3;
            } else {
                c18256b.m19776c();
                Rect rect4 = new Rect();
                int i10 = c18256b.f58163h;
                Drawable[] drawableArr = c18256b.f58162g;
                for (int i11 = 0; i11 < i10; i11++) {
                    if (drawableArr[i11].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i12 = rect4.left;
                        if (i12 > rect2.left) {
                            rect2.left = i12;
                        }
                        int i13 = rect4.top;
                        if (i13 > rect2.top) {
                            rect2.top = i13;
                        }
                        int i14 = rect4.right;
                        if (i14 > rect2.right) {
                            rect2.right = i14;
                        }
                        int i15 = rect4.bottom;
                        if (i15 > rect2.bottom) {
                            rect2.bottom = i15;
                        }
                    }
                }
                c18256b.f58165j = true;
                c18256b.f58166k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            }
        } else {
            Drawable drawable = this.f58195o0;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f58193Y.f58146A && getLayoutDirection() == 1) {
            int i16 = rect.left;
            rect.left = rect.right;
            rect.right = i16;
        }
        return padding;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX INFO: renamed from: h */
    public final boolean m19787h(int i10) {
        if (i10 == this.f58199s0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f58193Y.f58181z > 0) {
            Drawable drawable = this.f58196p0;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f58195o0;
            if (drawable2 != null) {
                this.f58196p0 = drawable2;
                this.f58203w0 = ((long) this.f58193Y.f58181z) + jUptimeMillis;
            } else {
                this.f58196p0 = null;
                this.f58203w0 = 0L;
            }
        } else {
            Drawable drawable3 = this.f58195o0;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i10 >= 0) {
            C18256b c18256b = this.f58193Y;
            if (i10 < c18256b.f58163h) {
                Drawable drawableM19777d = c18256b.m19777d(i10);
                this.f58195o0 = drawableM19777d;
                this.f58199s0 = i10;
                if (drawableM19777d != null) {
                    int i11 = this.f58193Y.f58180y;
                    if (i11 > 0) {
                        this.f58202v0 = jUptimeMillis + ((long) i11);
                    }
                    m19783d(drawableM19777d);
                }
            } else {
                this.f58195o0 = null;
                this.f58199s0 = -1;
            }
        } else {
            this.f58195o0 = null;
            this.f58199s0 = -1;
        }
        if (this.f58202v0 != 0 || this.f58203w0 != 0) {
            RunnableC18260f runnableC18260f = this.f58201u0;
            if (runnableC18260f == null) {
                this.f58201u0 = new RunnableC18260f(this, 0);
            } else {
                unscheduleSelf(runnableC18260f);
            }
            m19781a(true);
        }
        invalidateSelf();
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m19788i(C18256b c18256b) {
        this.f58193Y = c18256b;
        int i10 = this.f58199s0;
        if (i10 >= 0) {
            Drawable drawableM19777d = c18256b.m19777d(i10);
            this.f58195o0 = drawableM19777d;
            if (drawableM19777d != null) {
                m19783d(drawableM19777d);
            }
        }
        this.f58196p0 = null;
        this.f58205y0 = c18256b;
        this.f58188A0 = c18256b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C18256b c18256b = this.f58193Y;
        if (c18256b != null) {
            c18256b.f58173r = false;
            c18256b.f58175t = false;
        }
        if (drawable != this.f58195o0 || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f58193Y.f58146A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19789j(boolean z6, boolean z10) {
        boolean visible = super.setVisible(z6, z10);
        Drawable drawable = this.f58196p0;
        if (drawable != null) {
            drawable.setVisible(z6, z10);
        }
        Drawable drawable2 = this.f58195o0;
        if (drawable2 != null) {
            drawable2.setVisible(z6, z10);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        m19784e();
        AbstractC9740H4 abstractC9740H4 = this.f58189B0;
        if (abstractC9740H4 != null) {
            abstractC9740H4.mo10334d();
            this.f58189B0 = null;
            m19787h(this.f58190C0);
            this.f58190C0 = -1;
            this.f58191D0 = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f58192E0) {
            m19786g();
            C18256b c18256b = this.f58188A0;
            c18256b.f58154I = c18256b.f58154I.clone();
            c18256b.f58155J = c18256b.f58155J.clone();
            this.f58192E0 = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f58196p0;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f58195o0;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        C18256b c18256b = this.f58193Y;
        int i11 = this.f58199s0;
        int i12 = c18256b.f58163h;
        Drawable[] drawableArr = c18256b.f58162g;
        boolean z6 = false;
        for (int i13 = 0; i13 < i12; i13++) {
            Drawable drawable = drawableArr[i13];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i10);
                if (i13 == i11) {
                    z6 = layoutDirection;
                }
            }
        }
        c18256b.f58179x = i10;
        return z6;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f58196p0;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        Drawable drawable2 = this.f58195o0;
        if (drawable2 != null) {
            return drawable2.setLevel(i10);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3  */
    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int iM19778e;
        AbstractC9740H4 c18255a;
        C18256b c18256b = this.f58188A0;
        int iM19779f = c18256b.m19779f(iArr);
        if (iM19779f < 0) {
            iM19779f = c18256b.m19779f(StateSet.WILD_CARD);
        }
        int i10 = this.f58199s0;
        boolean z6 = false;
        if (iM19779f != i10) {
            AbstractC9740H4 abstractC9740H4 = this.f58189B0;
            if (abstractC9740H4 == null) {
                this.f58189B0 = null;
                this.f58191D0 = -1;
                this.f58190C0 = -1;
                C18256b c18256b2 = this.f58188A0;
                int iM19778e2 = c18256b2.m19778e(i10);
                iM19778e = c18256b2.m19778e(iM19779f);
                if (iM19778e == 0 && iM19778e2 != 0) {
                    long j10 = ((long) iM19778e) | (((long) iM19778e2) << 32);
                    int iLongValue = (int) ((Long) c18256b2.f58154I.m14665e(j10)).longValue();
                    if (iLongValue >= 0) {
                        boolean z10 = (((Long) c18256b2.f58154I.m14665e(j10)).longValue() & 8589934592L) != 0;
                        m19787h(iLongValue);
                        Object obj = this.f58195o0;
                        if (obj instanceof AnimationDrawable) {
                            c18255a = new C18257c((AnimationDrawable) obj, (((Long) c18256b2.f58154I.m14665e(j10)).longValue() & 4294967296L) != 0, z10);
                        } else if (obj instanceof C6119f) {
                            c18255a = new C18255a((C6119f) obj, 1);
                        } else if (obj instanceof Animatable) {
                            c18255a = new C18255a((Animatable) obj, 0);
                        } else if (m19787h(iM19779f)) {
                            z6 = true;
                        }
                        c18255a.mo10333c();
                        this.f58189B0 = c18255a;
                        this.f58191D0 = i10;
                        this.f58190C0 = iM19779f;
                        z6 = true;
                    } else if (m19787h(iM19779f)) {
                        z6 = true;
                    }
                } else if (m19787h(iM19779f)) {
                    z6 = true;
                }
            } else {
                if (iM19779f != this.f58190C0) {
                    if (iM19779f == this.f58191D0 && abstractC9740H4.mo10331a()) {
                        abstractC9740H4.mo10332b();
                        this.f58190C0 = this.f58191D0;
                        this.f58191D0 = iM19779f;
                    } else {
                        i10 = this.f58190C0;
                        abstractC9740H4.mo10334d();
                        this.f58189B0 = null;
                        this.f58191D0 = -1;
                        this.f58190C0 = -1;
                        C18256b c18256b3 = this.f58188A0;
                        int iM19778e3 = c18256b3.m19778e(i10);
                        iM19778e = c18256b3.m19778e(iM19779f);
                        if (iM19778e == 0) {
                            if (m19787h(iM19779f)) {
                            }
                        } else if (m19787h(iM19779f)) {
                        }
                    }
                }
                z6 = true;
            }
        }
        Drawable drawable = this.f58195o0;
        return drawable != null ? z6 | drawable.setState(iArr) : z6;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable != this.f58195o0 || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.f58198r0 && this.f58197q0 == i10) {
            return;
        }
        this.f58198r0 = true;
        this.f58197q0 = i10;
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            if (this.f58202v0 == 0) {
                drawable.setAlpha(i10);
            } else {
                m19781a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58146A != z6) {
            c18256b.f58146A = z6;
            Drawable drawable = this.f58195o0;
            if (drawable != null) {
                drawable.setAutoMirrored(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C18256b c18256b = this.f58193Y;
        c18256b.f58148C = true;
        if (c18256b.f58147B != colorFilter) {
            c18256b.f58147B = colorFilter;
            Drawable drawable = this.f58195o0;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z6) {
        C18256b c18256b = this.f58193Y;
        if (c18256b.f58178w != z6) {
            c18256b.f58178w = z6;
            Drawable drawable = this.f58195o0;
            if (drawable != null) {
                drawable.setDither(z6);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        Rect rect = this.f58194Z;
        if (rect == null) {
            this.f58194Z = new Rect(i10, i11, i12, i13);
        } else {
            rect.set(i10, i11, i12, i13);
        }
        Drawable drawable = this.f58195o0;
        if (drawable != null) {
            drawable.setHotspotBounds(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C18256b c18256b = this.f58193Y;
        c18256b.f58151F = true;
        if (c18256b.f58149D != colorStateList) {
            c18256b.f58149D = colorStateList;
            this.f58195o0.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C18256b c18256b = this.f58193Y;
        c18256b.f58152G = true;
        if (c18256b.f58150E != mode) {
            c18256b.f58150E = mode;
            this.f58195o0.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        boolean zM19789j = m19789j(z6, z10);
        AbstractC9740H4 abstractC9740H4 = this.f58189B0;
        if (abstractC9740H4 != null && (zM19789j || z10)) {
            if (z6) {
                abstractC9740H4.mo10333c();
            } else {
                jumpToCurrentState();
            }
        }
        return zM19789j;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f58195o0 || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
