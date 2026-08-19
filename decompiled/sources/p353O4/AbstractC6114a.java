package p353O4;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p330N4.C5664o;
import p499U9.AbstractC7589s;
import p955q2.AbstractC18610b;
import p979r2.C18864e;

/* JADX INFO: renamed from: O4.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6114a {

    /* JADX INFO: renamed from: a */
    public static final int[] f19896a = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};

    /* JADX INFO: renamed from: b */
    public static final int[] f19897b = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};

    /* JADX INFO: renamed from: c */
    public static final int[] f19898c = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};

    /* JADX INFO: renamed from: d */
    public static final int[] f19899d = {R.attr.name, R.attr.pathData, R.attr.fillType};

    /* JADX INFO: renamed from: e */
    public static final int[] f19900e = {R.attr.drawable};

    /* JADX INFO: renamed from: f */
    public static final int[] f19901f = {R.attr.name, R.attr.animation};

    /* JADX INFO: renamed from: g */
    public static final int[] f19902g = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* JADX INFO: renamed from: h */
    public static final int[] f19903h = {R.attr.ordering};

    /* JADX INFO: renamed from: i */
    public static final int[] f19904i = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* JADX INFO: renamed from: j */
    public static final int[] f19905j = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* JADX INFO: renamed from: k */
    public static final int[] f19906k = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* JADX INFO: renamed from: a */
    public static Animator m6665a(Context context, Resources resources, Resources.Theme theme, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i10) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr;
        AttributeSet attributeSet2;
        int i11;
        String str;
        int i12;
        int i13;
        int i14;
        PropertyValuesHolder propertyValuesHolderM6666b;
        int size;
        int i15;
        int i16;
        Keyframe keyframeOfFloat;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        int depth = xmlResourceParser.getDepth();
        Animator animatorM6668d = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlResourceParser.next();
            int i17 = 0;
            int i18 = 3;
            if (next == 3 && xmlResourceParser.getDepth() <= depth) {
                break;
            }
            int i19 = 1;
            if (next == 1) {
                break;
            }
            int i20 = 2;
            if (next == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("objectAnimator")) {
                    ObjectAnimator objectAnimator = new ObjectAnimator();
                    m6668d(context, resources, theme, attributeSet, objectAnimator, xmlResourceParser);
                    animatorM6668d = objectAnimator;
                } else if (name.equals("animator")) {
                    animatorM6668d = m6668d(context, resources, theme, attributeSet, null, xmlResourceParser);
                } else if (name.equals("set")) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources2, theme2, attributeSet, f19903h);
                    m6665a(context, resources, theme, xmlResourceParser, attributeSet, animatorSet2, !AbstractC18610b.m19961e(xmlResourceParser2, "ordering") ? 0 : typedArrayM19964h.getInt(0, 0));
                    typedArrayM19964h.recycle();
                    animatorM6668d = animatorSet2;
                } else {
                    String str2 = "propertyValuesHolder";
                    if (!name.equals("propertyValuesHolder")) {
                        throw new RuntimeException("Unknown animator name: " + xmlResourceParser.getName());
                    }
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                    ArrayList arrayList2 = null;
                    while (true) {
                        int eventType = xmlResourceParser.getEventType();
                        if (eventType == i18 || eventType == i19) {
                            break;
                        }
                        if (eventType != i20) {
                            xmlResourceParser.next();
                        } else {
                            if (xmlResourceParser.getName().equals(str2)) {
                                TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources2, theme2, attributeSetAsAttributeSet, f19904i);
                                String strM19960d = AbstractC18610b.m19960d(typedArrayM19964h2, xmlResourceParser2, "propertyName", i18);
                                int i21 = !AbstractC18610b.m19961e(xmlResourceParser2, "valueType") ? 4 : typedArrayM19964h2.getInt(i20, 4);
                                int i22 = i21;
                                ArrayList arrayList3 = null;
                                while (true) {
                                    int next2 = xmlResourceParser.next();
                                    attributeSet2 = attributeSetAsAttributeSet;
                                    if (next2 == i18 || next2 == 1) {
                                        break;
                                    }
                                    if (xmlResourceParser.getName().equals("keyframe")) {
                                        int[] iArr = f19905j;
                                        i16 = i22;
                                        if (i16 == 4) {
                                            TypedArray typedArrayM19964h3 = AbstractC18610b.m19964h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                            TypedValue typedValuePeekValue = !AbstractC18610b.m19961e(xmlResourceParser2, "value") ? null : typedArrayM19964h3.peekValue(0);
                                            int i23 = (typedValuePeekValue == null || !m6667c(typedValuePeekValue.type)) ? 0 : 3;
                                            typedArrayM19964h3.recycle();
                                            i16 = i23;
                                        }
                                        TypedArray typedArrayM19964h4 = AbstractC18610b.m19964h(resources2, theme2, Xml.asAttributeSet(xmlResourceParser), iArr);
                                        float f10 = AbstractC18610b.m19961e(xmlResourceParser2, "fraction") ? typedArrayM19964h4.getFloat(3, -1.0f) : -1.0f;
                                        TypedValue typedValuePeekValue2 = !AbstractC18610b.m19961e(xmlResourceParser2, "value") ? null : typedArrayM19964h4.peekValue(0);
                                        boolean z6 = typedValuePeekValue2 != null;
                                        int i24 = i16 == 4 ? (z6 && m6667c(typedValuePeekValue2.type)) ? 3 : 0 : i16;
                                        if (!z6) {
                                            keyframeOfFloat = i24 == 0 ? Keyframe.ofFloat(f10) : Keyframe.ofInt(f10);
                                        } else if (i24 == 0) {
                                            keyframeOfFloat = Keyframe.ofFloat(f10, !AbstractC18610b.m19961e(xmlResourceParser2, "value") ? 0.0f : typedArrayM19964h4.getFloat(0, 0.0f));
                                        } else if (i24 == 1 || i24 == 3) {
                                            keyframeOfFloat = Keyframe.ofInt(f10, !AbstractC18610b.m19961e(xmlResourceParser2, "value") ? 0 : typedArrayM19964h4.getInt(0, 0));
                                        } else {
                                            keyframeOfFloat = null;
                                        }
                                        int resourceId = !AbstractC18610b.m19961e(xmlResourceParser2, "interpolator") ? 0 : typedArrayM19964h4.getResourceId(1, 0);
                                        if (resourceId > 0) {
                                            keyframeOfFloat.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
                                        }
                                        typedArrayM19964h4.recycle();
                                        if (keyframeOfFloat != null) {
                                            if (arrayList3 == null) {
                                                arrayList3 = new ArrayList();
                                            }
                                            arrayList3.add(keyframeOfFloat);
                                        }
                                        xmlResourceParser.next();
                                    } else {
                                        i16 = i22;
                                    }
                                    resources2 = resources;
                                    theme2 = theme;
                                    str2 = str2;
                                    attributeSetAsAttributeSet = attributeSet2;
                                    i22 = i16;
                                    i18 = 3;
                                }
                                int i25 = i22;
                                str = str2;
                                if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                                    i13 = 3;
                                    i11 = 2;
                                    propertyValuesHolderM6666b = null;
                                } else {
                                    Keyframe keyframe = (Keyframe) arrayList3.get(0);
                                    Keyframe keyframe2 = (Keyframe) arrayList3.get(size - 1);
                                    float fraction = keyframe2.getFraction();
                                    if (fraction < 1.0f) {
                                        if (fraction < 0.0f) {
                                            keyframe2.setFraction(1.0f);
                                        } else {
                                            arrayList3.add(arrayList3.size(), keyframe2.getType() == Float.TYPE ? Keyframe.ofFloat(1.0f) : keyframe2.getType() == Integer.TYPE ? Keyframe.ofInt(1.0f) : Keyframe.ofObject(1.0f));
                                            size++;
                                        }
                                    }
                                    float fraction2 = keyframe.getFraction();
                                    if (fraction2 != 0.0f) {
                                        if (fraction2 < 0.0f) {
                                            keyframe.setFraction(0.0f);
                                        } else {
                                            arrayList3.add(0, keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(0.0f) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(0.0f) : Keyframe.ofObject(0.0f));
                                            size++;
                                        }
                                    }
                                    Keyframe[] keyframeArr = new Keyframe[size];
                                    arrayList3.toArray(keyframeArr);
                                    int i26 = 0;
                                    while (i26 < size) {
                                        Keyframe keyframe3 = keyframeArr[i26];
                                        if (keyframe3.getFraction() >= 0.0f) {
                                            i15 = size;
                                        } else if (i26 == 0) {
                                            keyframe3.setFraction(0.0f);
                                            i15 = size;
                                        } else {
                                            int i27 = size - 1;
                                            if (i26 == i27) {
                                                keyframe3.setFraction(1.0f);
                                                i15 = size;
                                            } else {
                                                int i28 = i26;
                                                for (int i29 = i26 + 1; i29 < i27 && keyframeArr[i29].getFraction() < 0.0f; i29++) {
                                                    i28 = i29;
                                                }
                                                float fraction3 = (keyframeArr[i28 + 1].getFraction() - keyframeArr[i26 - 1].getFraction()) / ((i28 - i26) + 2);
                                                int i30 = i26;
                                                while (i30 <= i28) {
                                                    keyframeArr[i30].setFraction(keyframeArr[i30 - 1].getFraction() + fraction3);
                                                    i30++;
                                                    size = size;
                                                }
                                                i15 = size;
                                            }
                                        }
                                        i26++;
                                        size = i15;
                                    }
                                    i11 = 2;
                                    propertyValuesHolderM6666b = PropertyValuesHolder.ofKeyframe(strM19960d, keyframeArr);
                                    i13 = 3;
                                    if (i25 == 3) {
                                        propertyValuesHolderM6666b.setEvaluator(C6120g.f19922a);
                                    }
                                }
                                i14 = 0;
                                i12 = 1;
                                if (propertyValuesHolderM6666b == null) {
                                    propertyValuesHolderM6666b = m6666b(typedArrayM19964h2, i21, 0, 1, strM19960d);
                                }
                                if (propertyValuesHolderM6666b != null) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(propertyValuesHolderM6666b);
                                }
                                typedArrayM19964h2.recycle();
                            } else {
                                attributeSet2 = attributeSetAsAttributeSet;
                                i11 = i20;
                                str = str2;
                                i12 = i19;
                                i13 = i18;
                                i14 = i17;
                            }
                            xmlResourceParser.next();
                            resources2 = resources;
                            theme2 = theme;
                            xmlResourceParser2 = xmlResourceParser;
                            i17 = i14;
                            i18 = i13;
                            i19 = i12;
                            i20 = i11;
                            str2 = str;
                            attributeSetAsAttributeSet = attributeSet2;
                        }
                    }
                    int i31 = i19;
                    int i32 = i17;
                    if (arrayList2 != null) {
                        int size2 = arrayList2.size();
                        propertyValuesHolderArr = new PropertyValuesHolder[size2];
                        for (int i33 = i32; i33 < size2; i33++) {
                            propertyValuesHolderArr[i33] = (PropertyValuesHolder) arrayList2.get(i33);
                        }
                    } else {
                        propertyValuesHolderArr = null;
                    }
                    if (propertyValuesHolderArr != null && (animatorM6668d instanceof ValueAnimator)) {
                        ((ValueAnimator) animatorM6668d).setValues(propertyValuesHolderArr);
                    }
                    i17 = i31;
                }
                if (animatorSet != null && i17 == 0) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(animatorM6668d);
                }
                resources2 = resources;
                theme2 = theme;
                xmlResourceParser2 = xmlResourceParser;
            }
        }
        if (animatorSet != null && arrayList != null) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            int i34 = 0;
            while (it.hasNext()) {
                animatorArr[i34] = (Animator) it.next();
                i34++;
            }
            if (i10 == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animatorM6668d;
    }

    /* JADX INFO: renamed from: b */
    public static PropertyValuesHolder m6666b(TypedArray typedArray, int i10, int i11, int i12, String str) {
        int color;
        int color2;
        int color3;
        PropertyValuesHolder propertyValuesHolderOfFloat;
        PropertyValuesHolder propertyValuesHolderOfObject;
        TypedValue typedValuePeekValue = typedArray.peekValue(i11);
        boolean z6 = typedValuePeekValue != null;
        int i13 = z6 ? typedValuePeekValue.type : 0;
        TypedValue typedValuePeekValue2 = typedArray.peekValue(i12);
        boolean z10 = typedValuePeekValue2 != null;
        int i14 = z10 ? typedValuePeekValue2.type : 0;
        if (i10 == 4) {
            i10 = ((z6 && m6667c(i13)) || (z10 && m6667c(i14))) ? 3 : 0;
        }
        boolean z11 = i10 == 0;
        PropertyValuesHolder propertyValuesHolderOfInt = null;
        if (i10 == 2) {
            String string = typedArray.getString(i11);
            String string2 = typedArray.getString(i12);
            C18864e[] c18864eArrM7928c = AbstractC7589s.m7928c(string);
            C18864e[] c18864eArrM7928c2 = AbstractC7589s.m7928c(string2);
            if (c18864eArrM7928c == null && c18864eArrM7928c2 == null) {
                return null;
            }
            if (c18864eArrM7928c == null) {
                if (c18864eArrM7928c2 != null) {
                    return PropertyValuesHolder.ofObject(str, new C5664o(1), c18864eArrM7928c2);
                }
                return null;
            }
            C5664o c5664o = new C5664o(1);
            if (c18864eArrM7928c2 == null) {
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c5664o, c18864eArrM7928c);
            } else {
                if (!AbstractC7589s.m7926a(c18864eArrM7928c, c18864eArrM7928c2)) {
                    throw new InflateException(AbstractC10763a.m11055m(" Can't morph from ", string, " to ", string2));
                }
                propertyValuesHolderOfObject = PropertyValuesHolder.ofObject(str, c5664o, c18864eArrM7928c, c18864eArrM7928c2);
            }
            return propertyValuesHolderOfObject;
        }
        C6120g c6120g = i10 == 3 ? C6120g.f19922a : null;
        if (z11) {
            if (z6) {
                float dimension = i13 == 5 ? typedArray.getDimension(i11, 0.0f) : typedArray.getFloat(i11, 0.0f);
                if (z10) {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
                } else {
                    propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, dimension);
                }
            } else {
                propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat(str, i14 == 5 ? typedArray.getDimension(i12, 0.0f) : typedArray.getFloat(i12, 0.0f));
            }
            propertyValuesHolderOfInt = propertyValuesHolderOfFloat;
        } else if (z6) {
            if (i13 == 5) {
                color2 = (int) typedArray.getDimension(i11, 0.0f);
            } else {
                color2 = m6667c(i13) ? typedArray.getColor(i11, 0) : typedArray.getInt(i11, 0);
            }
            if (z10) {
                if (i14 == 5) {
                    color3 = (int) typedArray.getDimension(i12, 0.0f);
                } else {
                    color3 = m6667c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
                }
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2, color3);
            } else {
                propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color2);
            }
        } else if (z10) {
            if (i14 == 5) {
                color = (int) typedArray.getDimension(i12, 0.0f);
            } else {
                color = m6667c(i14) ? typedArray.getColor(i12, 0) : typedArray.getInt(i12, 0);
            }
            propertyValuesHolderOfInt = PropertyValuesHolder.ofInt(str, color);
        }
        if (propertyValuesHolderOfInt == null || c6120g == null) {
            return propertyValuesHolderOfInt;
        }
        propertyValuesHolderOfInt.setEvaluator(c6120g);
        return propertyValuesHolderOfInt;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m6667c(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    /* JADX INFO: renamed from: d */
    public static ValueAnimator m6668d(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        TypedArray typedArray2;
        ValueAnimator valueAnimator2;
        int resourceId = 0;
        TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources, theme, attributeSet, f19902g);
        TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources, theme, attributeSet, f19906k);
        ValueAnimator valueAnimator3 = objectAnimator == null ? new ValueAnimator() : objectAnimator;
        boolean zM19961e = AbstractC18610b.m19961e(xmlResourceParser, "duration");
        int i10 = RCHTTPStatusCodes.UNSUCCESSFUL;
        if (zM19961e) {
            i10 = typedArrayM19964h.getInt(1, RCHTTPStatusCodes.UNSUCCESSFUL);
        }
        long j10 = i10;
        long j11 = !AbstractC18610b.m19961e(xmlResourceParser, "startOffset") ? 0 : typedArrayM19964h.getInt(2, 0);
        int i11 = !AbstractC18610b.m19961e(xmlResourceParser, "valueType") ? 4 : typedArrayM19964h.getInt(7, 4);
        if (AbstractC18610b.m19961e(xmlResourceParser, "valueFrom") && AbstractC18610b.m19961e(xmlResourceParser, "valueTo")) {
            if (i11 == 4) {
                TypedValue typedValuePeekValue = typedArrayM19964h.peekValue(5);
                boolean z6 = typedValuePeekValue != null;
                int i12 = z6 ? typedValuePeekValue.type : 0;
                TypedValue typedValuePeekValue2 = typedArrayM19964h.peekValue(6);
                boolean z10 = typedValuePeekValue2 != null;
                i11 = ((z6 && m6667c(i12)) || (z10 && m6667c(z10 ? typedValuePeekValue2.type : 0))) ? 3 : 0;
            }
            PropertyValuesHolder propertyValuesHolderM6666b = m6666b(typedArrayM19964h, i11, 5, 6, "");
            if (propertyValuesHolderM6666b != null) {
                valueAnimator3.setValues(propertyValuesHolderM6666b);
            }
        }
        valueAnimator3.setDuration(j10);
        valueAnimator3.setStartDelay(j11);
        valueAnimator3.setRepeatCount(!AbstractC18610b.m19961e(xmlResourceParser, "repeatCount") ? 0 : typedArrayM19964h.getInt(3, 0));
        valueAnimator3.setRepeatMode(!AbstractC18610b.m19961e(xmlResourceParser, "repeatMode") ? 1 : typedArrayM19964h.getInt(4, 1));
        if (typedArrayM19964h2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator3;
            String strM19960d = AbstractC18610b.m19960d(typedArrayM19964h2, xmlResourceParser, "pathData", 1);
            if (strM19960d != null) {
                String strM19960d2 = AbstractC18610b.m19960d(typedArrayM19964h2, xmlResourceParser, "propertyXName", 2);
                String strM19960d3 = AbstractC18610b.m19960d(typedArrayM19964h2, xmlResourceParser, "propertyYName", 3);
                if (strM19960d2 == null && strM19960d3 == null) {
                    throw new InflateException(typedArrayM19964h2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path pathM7929d = AbstractC7589s.m7929d(strM19960d);
                PathMeasure pathMeasure = new PathMeasure(pathM7929d, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(0.0f));
                float length = 0.0f;
                while (true) {
                    length += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(length));
                    if (!pathMeasure.nextContour()) {
                        break;
                    }
                    valueAnimator3 = valueAnimator3;
                }
                PathMeasure pathMeasure2 = new PathMeasure(pathM7929d, false);
                int iMin = Math.min(100, ((int) (length / 0.5f)) + 1);
                float[] fArr = new float[iMin];
                float[] fArr2 = new float[iMin];
                float[] fArr3 = new float[2];
                float f10 = length / (iMin - 1);
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM19964h;
                int i13 = 0;
                int i14 = 0;
                float f11 = 0.0f;
                while (true) {
                    if (i14 >= iMin) {
                        break;
                    }
                    int i15 = iMin;
                    pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i13)).floatValue(), fArr3, null);
                    fArr[i14] = fArr3[0];
                    fArr2[i14] = fArr3[1];
                    f11 += f10;
                    int i16 = i13 + 1;
                    if (i16 < arrayList.size() && f11 > ((Float) arrayList.get(i16)).floatValue()) {
                        pathMeasure2.nextContour();
                        i13 = i16;
                    }
                    i14++;
                    iMin = i15;
                }
                PropertyValuesHolder propertyValuesHolderOfFloat = strM19960d2 != null ? PropertyValuesHolder.ofFloat(strM19960d2, fArr) : null;
                PropertyValuesHolder propertyValuesHolderOfFloat2 = strM19960d3 != null ? PropertyValuesHolder.ofFloat(strM19960d3, fArr2) : null;
                if (propertyValuesHolderOfFloat == null) {
                    resourceId = 0;
                    objectAnimator2.setValues(propertyValuesHolderOfFloat2);
                } else {
                    resourceId = 0;
                    if (propertyValuesHolderOfFloat2 == null) {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat);
                    } else {
                        objectAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2);
                    }
                }
            } else {
                valueAnimator = valueAnimator3;
                typedArray = typedArrayM19964h;
                objectAnimator2.setPropertyName(AbstractC18610b.m19960d(typedArrayM19964h2, xmlResourceParser, "propertyName", 0));
            }
        } else {
            valueAnimator = valueAnimator3;
            typedArray = typedArrayM19964h;
        }
        if (AbstractC18610b.m19961e(xmlResourceParser, "interpolator")) {
            typedArray2 = typedArray;
            resourceId = typedArray2.getResourceId(resourceId, resourceId);
        } else {
            typedArray2 = typedArray;
        }
        if (resourceId > 0) {
            valueAnimator2 = valueAnimator;
            valueAnimator2.setInterpolator(AnimationUtils.loadInterpolator(context, resourceId));
        } else {
            valueAnimator2 = valueAnimator;
        }
        typedArray2.recycle();
        if (typedArrayM19964h2 != null) {
            typedArrayM19964h2.recycle();
        }
        return valueAnimator2;
    }
}
