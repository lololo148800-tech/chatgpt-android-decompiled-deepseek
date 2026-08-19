package p952q;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18541a {
    /* JADX INFO: renamed from: a */
    public static Drawable m19908a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX INFO: renamed from: b */
    public static int m19909b(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    /* JADX INFO: renamed from: c */
    public static void m19910c(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}
