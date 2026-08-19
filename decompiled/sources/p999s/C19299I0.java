package p999s;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import io.sentry.android.core.AbstractC15256t;
import p353O4.C6119f;
import p353O4.C6130q;
import p935p.C18259e;
import p952q.AbstractC18541a;

/* JADX INFO: renamed from: s.I0 */
/* JADX INFO: loaded from: classes.dex */
public final class C19299I0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61144a;

    public /* synthetic */ C19299I0(int i10) {
        this.f61144a = i10;
    }

    /* JADX INFO: renamed from: a */
    public final Drawable m20375a(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.f61144a) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C19299I0.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    AbstractC18541a.m19910c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e10) {
                    AbstractC15256t.m16466d("DrawableDelegate", "Exception while inflating <drawable>", e10);
                    return null;
                }
            case 1:
                try {
                    return C18259e.m19780c(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception e11) {
                    AbstractC15256t.m16466d("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    C6119f c6119f = new C6119f(context);
                    c6119f.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return c6119f;
                } catch (Exception e12) {
                    AbstractC15256t.m16466d("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e12);
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C6130q c6130q = new C6130q();
                    c6130q.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c6130q;
                } catch (Exception e13) {
                    AbstractC15256t.m16466d("VdcInflateDelegate", "Exception while inflating <vector>", e13);
                    return null;
                }
        }
    }
}
