package p955q2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.openai.chatgpt.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p523V9.AbstractC7925K4;
import p883m2.AbstractC17141a;

/* JADX INFO: renamed from: q2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC18611c {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f59281a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static ColorStateList m19970a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m19971b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r33v0, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* JADX INFO: renamed from: b */
    public static ColorStateList m19971b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int[] iArr;
        boolean z6;
        int iM19962f;
        float f10;
        float f11;
        TypedValue typedValue;
        resources = resources;
        attributeSet = attributeSet;
        theme = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        ?? r6 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        Object[] objArr = new int[20][];
        int[] iArr2 = new int[20];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == r6 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr3 = AbstractC17141a.f54808a;
                ?? ObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr3) : theme.obtainStyledAttributes(attributeSet, iArr3, i10, i10);
                int resourceId = ObtainAttributes.getResourceId(i10, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f59281a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    resources.getValue(resourceId, typedValue, r6);
                    int i12 = typedValue.type;
                    if (i12 < 28 || i12 > 31) {
                        try {
                            color = m19970a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i10, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i10, -65281);
                    }
                } else {
                    color = ObtainAttributes.getColor(i10, -65281);
                }
                float f12 = ObtainAttributes.hasValue(r6) ? ObtainAttributes.getFloat(r6, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                float f13 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                ObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr4 = new int[attributeCount];
                int i13 = i10;
                for (int i14 = i13; i14 < attributeCount; i14++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i14);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                        int i15 = i13 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i14, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr4[i13] = attributeNameResource;
                        i13 = i15;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr4, i13);
                float f14 = 0.0f;
                float f15 = 100.0f;
                boolean z10 = f13 >= 0.0f && f13 <= 100.0f;
                if (f12 != 1.0f || z10) {
                    int iM8214e = AbstractC7925K4.m8214e((int) ((Color.alpha(color) * f12) + 0.5f), 0, 255);
                    if (z10) {
                        C18609a c18609aM19955a = C18609a.m19955a(color);
                        C18620l c18620l = C18620l.f59302k;
                        float f16 = c18609aM19955a.f59269b;
                        if (f16 >= 1.0d && Math.round(f13) > 0.0d && Math.round(f13) < 100.0d) {
                            float f17 = c18609aM19955a.f59268a;
                            float fMin = f17 < 0.0f ? 0.0f : Math.min(360.0f, f17);
                            float f18 = 0.0f;
                            float f19 = f16;
                            C18609a c18609a = null;
                            boolean z11 = true;
                            while (true) {
                                if (Math.abs(f18 - f16) < 0.4f) {
                                    iArr = iArrTrimStateSet;
                                    depth2 = depth2;
                                    z6 = true;
                                    if (c18609a != null) {
                                        iM19962f = c18609a.m19957c(c18620l);
                                        break;
                                    }
                                    iM19962f = AbstractC18610b.m19962f(f13);
                                    break;
                                }
                                float f20 = 1000.0f;
                                float f21 = f14;
                                float f22 = f15;
                                float f23 = 1000.0f;
                                C18609a c18609a2 = null;
                                while (true) {
                                    if (Math.abs(f21 - f22) <= 0.01f) {
                                        depth2 = depth2;
                                        fMin = fMin;
                                        f15 = f15;
                                        z6 = true;
                                        float f24 = f14;
                                        iArr = iArrTrimStateSet;
                                        f10 = f24;
                                        break;
                                    }
                                    float f25 = ((f22 - f21) / 2.0f) + f21;
                                    int iM19957c = C18609a.m19956b(f25, f19, fMin).m19957c(C18620l.f59302k);
                                    float fM19963g = AbstractC18610b.m19963g(Color.red(iM19957c));
                                    float fM19963g2 = AbstractC18610b.m19963g(Color.green(iM19957c));
                                    float fM19963g3 = AbstractC18610b.m19963g(Color.blue(iM19957c));
                                    z6 = true;
                                    float[] fArr = AbstractC18610b.f59277d[1];
                                    f15 = 100.0f;
                                    float f26 = ((fM19963g3 * fArr[2]) + ((fM19963g2 * fArr[1]) + (fM19963g * fArr[0]))) / 100.0f;
                                    float fCbrt = f26 <= 0.008856452f ? f26 * 903.2963f : (((float) Math.cbrt(f26)) * 116.0f) - 16.0f;
                                    float fAbs = Math.abs(f13 - fCbrt);
                                    if (fAbs < 0.2f) {
                                        C18609a c18609aM19955a2 = C18609a.m19955a(iM19957c);
                                        C18609a c18609aM19956b = C18609a.m19956b(c18609aM19955a2.f59270c, c18609aM19955a2.f59269b, fMin);
                                        f11 = f25;
                                        float f27 = c18609aM19955a2.f59271d - c18609aM19956b.f59271d;
                                        fMin = fMin;
                                        float f28 = c18609aM19955a2.f59272e - c18609aM19956b.f59272e;
                                        float f29 = c18609aM19955a2.f59273f - c18609aM19956b.f59273f;
                                        double dSqrt = Math.sqrt((f29 * f29) + (f28 * f28) + (f27 * f27));
                                        iArr = iArrTrimStateSet;
                                        float fPow = (float) (Math.pow(dSqrt, 0.63d) * 1.41d);
                                        if (fPow <= 1.0f) {
                                            f23 = fPow;
                                            c18609a2 = c18609aM19955a2;
                                            f20 = fAbs;
                                        }
                                    } else {
                                        f11 = f25;
                                        fMin = fMin;
                                        iArr = iArrTrimStateSet;
                                    }
                                    f10 = 0.0f;
                                    if (f20 == 0.0f && f23 == 0.0f) {
                                        break;
                                    }
                                    if (fCbrt < f13) {
                                        f21 = f11;
                                    } else {
                                        f22 = f11;
                                    }
                                    f15 = 100.0f;
                                    depth2 = depth2;
                                    fMin = fMin;
                                    int[] iArr5 = iArr;
                                    f14 = 0.0f;
                                    iArrTrimStateSet = iArr5;
                                }
                                C18609a c18609a3 = c18609a2;
                                if (!z11) {
                                    if (c18609a3 == null) {
                                        f16 = f19;
                                    } else {
                                        c18609a = c18609a3;
                                        f18 = f19;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                } else {
                                    if (c18609a3 != null) {
                                        iM19962f = c18609a3.m19957c(c18620l);
                                        break;
                                    }
                                    f19 = ((f16 - f18) / 2.0f) + f18;
                                    z11 = false;
                                }
                                int[] iArr6 = iArr;
                                f14 = f10;
                                iArrTrimStateSet = iArr6;
                            }
                        } else {
                            iArr = iArrTrimStateSet;
                            depth2 = depth2;
                            z6 = true;
                            iM19962f = AbstractC18610b.m19962f(f13);
                        }
                        color = iM19962f;
                    } else {
                        iArr = iArrTrimStateSet;
                        depth2 = depth2;
                        z6 = true;
                    }
                    color = (16777215 & color) | (iM8214e << 24);
                } else {
                    iArr = iArrTrimStateSet;
                    depth2 = depth2;
                    z6 = true;
                }
                int i16 = i11 + 1;
                if (i16 > iArr2.length) {
                    int[] iArr7 = new int[i11 <= 4 ? 8 : i11 * 2];
                    System.arraycopy(iArr2, 0, iArr7, 0, i11);
                    iArr2 = iArr7;
                }
                iArr2[i11] = color;
                if (i16 > objArr.length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i11 > 4 ? i11 * 2 : 8);
                    System.arraycopy(objArr, 0, objArr2, 0, i11);
                    objArr = objArr2;
                }
                objArr[i11] = iArr;
                objArr = (int[][]) objArr;
                i11 = i16;
                r6 = z6;
                depth2 = depth2;
                i10 = 0;
            } else {
                int i17 = depth2;
                r6 = r6 == true ? 1 : 0;
                depth2 = i17;
                i10 = 0;
            }
        }
        int[] iArr8 = new int[i11];
        int[][] iArr9 = new int[i11][];
        System.arraycopy(iArr2, 0, iArr8, 0, i11);
        System.arraycopy(objArr, 0, iArr9, 0, i11);
        return new ColorStateList(iArr9, iArr8);
    }
}
