package p955q2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import io.sentry.android.core.AbstractC15256t;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001A.RunnableC0080p;
import p013Ab.C0420b;
import p1096x2.C21109d;
import p883m2.AbstractC17141a;
import p979r2.AbstractC18861b;

/* JADX INFO: renamed from: q2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18610b {

    /* JADX INFO: renamed from: a */
    public static final float[][] f59274a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};

    /* JADX INFO: renamed from: b */
    public static final float[][] f59275b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};

    /* JADX INFO: renamed from: c */
    public static final float[] f59276c = {95.047f, 100.0f, 108.883f};

    /* JADX INFO: renamed from: d */
    public static final float[][] f59277d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    /* JADX INFO: renamed from: e */
    public static final Object f59278e = new Object();

    /* JADX INFO: renamed from: f */
    public static Method f59279f;

    /* JADX INFO: renamed from: g */
    public static boolean f59280g;

    /* JADX INFO: renamed from: b */
    public static ColorStateList m19958b(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!m19961e(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i10 = typedValue.type;
        if (i10 == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i10 >= 28 && i10 <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = AbstractC18611c.f59281a;
        try {
            return AbstractC18611c.m19970a(resources, resources.getXml(resourceId), theme);
        } catch (Exception e10) {
            AbstractC15256t.m16466d("CSLCompat", "Failed to inflate ColorStateList.", e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C0420b m19959c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        C0420b c0420bM1036j;
        if (m19961e(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return new C0420b((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                c0420bM1036j = C0420b.m1036j(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            } catch (Exception e10) {
                AbstractC15256t.m16466d("ComplexColorCompat", "Failed to inflate ComplexColor.", e10);
                c0420bM1036j = null;
            }
            if (c0420bM1036j != null) {
                return c0420bM1036j;
            }
        }
        return new C0420b((Shader) null, (ColorStateList) null, 0);
    }

    /* JADX INFO: renamed from: d */
    public static String m19960d(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i10) {
        if (m19961e(xmlResourceParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m19961e(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX INFO: renamed from: f */
    public static int m19962f(float f10) {
        if (f10 < 1.0f) {
            return -16777216;
        }
        if (f10 > 99.0f) {
            return -1;
        }
        float f11 = (f10 + 16.0f) / 116.0f;
        float f12 = f10 > 8.0f ? f11 * f11 * f11 : f10 / 903.2963f;
        float f13 = f11 * f11 * f11;
        boolean z6 = f13 > 0.008856452f;
        float f14 = z6 ? f13 : ((f11 * 116.0f) - 16.0f) / 903.2963f;
        if (!z6) {
            f13 = ((f11 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = f59276c;
        return AbstractC18861b.m20163a(f14 * fArr[0], f12 * fArr[1], f13 * fArr[2]);
    }

    /* JADX INFO: renamed from: g */
    public static float m19963g(int i10) {
        float f10 = i10 / 255.0f;
        return (f10 <= 0.04045f ? f10 / 12.92f : (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX INFO: renamed from: h */
    public static TypedArray m19964h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: k */
    public static InterfaceC18612d m19965k(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC17141a.f54809b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(5);
            String string3 = typedArrayObtainAttributes.getString(6);
            String string4 = typedArrayObtainAttributes.getString(2);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(3, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(4, 500);
            String string5 = typedArrayObtainAttributes.getString(7);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m19967m(xmlResourceParser);
                }
                List listM19966l = m19966l(resources, resourceId);
                return new C18615g(new C21109d(string, string2, string3, listM19966l), string4 != null ? new C21109d(string, string2, string4, listM19966l) : null, integer, integer2, string5);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC17141a.f54810c);
                        int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, RCHTTPStatusCodes.BAD_REQUEST);
                        boolean z6 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string6 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                        String string7 = typedArrayObtainAttributes2.getString(i13);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m19967m(xmlResourceParser);
                        }
                        arrayList.add(new C18614f(i10, i12, resourceId2, string7, string6, z6));
                    } else {
                        m19967m(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C18613e((C18614f[]) arrayList.toArray(new C18614f[0]));
            }
        } else {
            m19967m(xmlResourceParser);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static List m19966l(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m19967m(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static float m19968n() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m19969a(int i10) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0080p(this, i10, 4));
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo2477i(int i10);

    /* JADX INFO: renamed from: j */
    public abstract void mo2478j(Typeface typeface);
}
