package p353O4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p239Ja.C4308k;
import p523V9.AbstractC8234y0;
import p692d0.C12966e;
import p955q2.AbstractC18610b;
import p955q2.AbstractC18619k;

/* JADX INFO: renamed from: O4.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6119f extends AbstractC6121h implements Animatable {

    /* JADX INFO: renamed from: s0 */
    public static final /* synthetic */ int f19916s0 = 0;

    /* JADX INFO: renamed from: o0 */
    public final Context f19918o0;

    /* JADX INFO: renamed from: p0 */
    public C4308k f19919p0 = null;

    /* JADX INFO: renamed from: q0 */
    public ArrayList f19920q0 = null;

    /* JADX INFO: renamed from: r0 */
    public final C6116c f19921r0 = new C6116c(this, 0);

    /* JADX INFO: renamed from: Z */
    public final C6117d f19917Z = new C6117d();

    public C6119f(Context context) {
        this.f19918o0 = context;
    }

    @Override // p353O4.AbstractC6121h, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C6117d c6117d = this.f19917Z;
        c6117d.f19910a.draw(canvas);
        if (c6117d.f19911b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getAlpha() : this.f19917Z.f19910a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f19917Z.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getColorFilter() : this.f19917Z.f19910a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f19923Y == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C6118e(this.f19923Y.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f19917Z.f19910a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f19917Z.f19910a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.getOpacity() : this.f19917Z.f19910a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C6117d c6117d;
        Animator animatorM6665a;
        C6130q c6130q;
        int next;
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c6117d = this.f19917Z;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources, theme, attributeSet, AbstractC6114a.f19900e);
                    int resourceId = typedArrayM19964h.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = C6130q.f19978v0;
                        if (Build.VERSION.SDK_INT >= 24) {
                            c6130q = new C6130q();
                            ThreadLocal threadLocal = AbstractC18619k.f59299a;
                            c6130q.f19923Y = resources.getDrawable(resourceId, theme);
                            new C6129p(c6130q.f19923Y.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                c6130q = new C6130q();
                                c6130q.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e10) {
                                AbstractC15256t.m16466d("VectorDrawableCompat", "parser error", e10);
                                c6130q = null;
                            } catch (XmlPullParserException e11) {
                                AbstractC15256t.m16466d("VectorDrawableCompat", "parser error", e11);
                                c6130q = null;
                            }
                        }
                        c6130q.f19983r0 = false;
                        c6130q.setCallback(this.f19921r0);
                        C6130q c6130q2 = c6117d.f19910a;
                        if (c6130q2 != null) {
                            c6130q2.setCallback(null);
                        }
                        c6117d.f19910a = c6130q;
                    }
                    typedArrayM19964h.recycle();
                } else {
                    XmlResourceParser animation = null;
                    if ("target".equals(name)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC6114a.f19901f);
                        String string = typedArrayObtainAttributes.getString(0);
                        int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f19918o0;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                animatorM6665a = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        try {
                                            animation = resources2.getAnimation(resourceId2);
                                            animatorM6665a = AbstractC6114a.m6665a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                            animation.close();
                                        } catch (IOException e12) {
                                            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException.initCause(e12);
                                            throw notFoundException;
                                        }
                                    } catch (XmlPullParserException e13) {
                                        Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                        notFoundException2.initCause(e13);
                                        throw notFoundException2;
                                    }
                                } catch (Throwable th2) {
                                    if (animation != null) {
                                        animation.close();
                                    }
                                    throw th2;
                                }
                            }
                            animatorM6665a.setTarget(c6117d.f19910a.f19979Z.f19966b.f19964o.get(string));
                            if (c6117d.f19912c == null) {
                                c6117d.f19912c = new ArrayList();
                                c6117d.f19913d = new C12966e(0);
                            }
                            c6117d.f19912c.add(animatorM6665a);
                            c6117d.f19913d.put(animatorM6665a, string);
                        }
                        typedArrayObtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c6117d.f19911b == null) {
            c6117d.f19911b = new AnimatorSet();
        }
        c6117d.f19911b.playTogether(c6117d.f19912c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.isAutoMirrored() : this.f19917Z.f19910a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f19917Z.f19911b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.isStateful() : this.f19917Z.f19910a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f19917Z.f19910a.setBounds(rect);
        }
    }

    @Override // p353O4.AbstractC6121h, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.setLevel(i10) : this.f19917Z.f19910a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f19923Y;
        return drawable != null ? drawable.setState(iArr) : this.f19917Z.f19910a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f19917Z.f19910a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z6) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setAutoMirrored(z6);
        } else {
            this.f19917Z.f19910a.setAutoMirrored(z6);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f19917Z.f19910a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            AbstractC8234y0.m8874b(drawable, i10);
        } else {
            this.f19917Z.f19910a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f19917Z.f19910a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f19917Z.f19910a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z10) {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            return drawable.setVisible(z6, z10);
        }
        this.f19917Z.f19910a.setVisible(z6, z10);
        return super.setVisible(z6, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C6117d c6117d = this.f19917Z;
        if (c6117d.f19911b.isStarted()) {
            return;
        }
        c6117d.f19911b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f19923Y;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f19917Z.f19911b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
