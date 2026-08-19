package p822j2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p001A.AbstractC0010F;

/* JADX INFO: renamed from: j2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C16044a {

    /* JADX INFO: renamed from: a */
    public boolean f49488a = false;

    /* JADX INFO: renamed from: b */
    public int f49489b;

    /* JADX INFO: renamed from: c */
    public int f49490c;

    /* JADX INFO: renamed from: d */
    public float f49491d;

    /* JADX INFO: renamed from: e */
    public String f49492e;

    /* JADX INFO: renamed from: f */
    public boolean f49493f;

    /* JADX INFO: renamed from: g */
    public int f49494g;

    public C16044a(C16044a c16044a, Object obj) {
        c16044a.getClass();
        this.f49489b = c16044a.f49489b;
        m17609b(obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m17608a(Context context, XmlResourceParser xmlResourceParser, HashMap map) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC16059p.f49707d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        String string = null;
        int i10 = 0;
        boolean z6 = false;
        Object objValueOf = null;
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i11);
            int i12 = 1;
            if (index == 0) {
                string = typedArrayObtainStyledAttributes.getString(index);
                if (string != null && string.length() > 0) {
                    string = Character.toUpperCase(string.charAt(0)) + string.substring(1);
                }
            } else if (index == 10) {
                string = typedArrayObtainStyledAttributes.getString(index);
                z6 = true;
            } else if (index == 1) {
                objValueOf = Boolean.valueOf(typedArrayObtainStyledAttributes.getBoolean(index, false));
                i10 = 6;
            } else {
                int i13 = 3;
                if (index == 3) {
                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                } else {
                    i13 = 4;
                    if (index == 2) {
                        objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            objValueOf = Float.valueOf(TypedValue.applyDimension(1, typedArrayObtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i13 = 5;
                            if (index == 5) {
                                objValueOf = Float.valueOf(typedArrayObtainStyledAttributes.getFloat(index, Float.NaN));
                                i10 = 2;
                            } else {
                                if (index == 6) {
                                    objValueOf = Integer.valueOf(typedArrayObtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    objValueOf = typedArrayObtainStyledAttributes.getString(index);
                                } else {
                                    i12 = 8;
                                    if (index == 8) {
                                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = typedArrayObtainStyledAttributes.getInt(index, -1);
                                        }
                                        objValueOf = Integer.valueOf(resourceId);
                                    }
                                }
                                i10 = i12;
                            }
                        }
                        i10 = 7;
                    }
                }
                i10 = i13;
            }
        }
        if (string != null && objValueOf != null) {
            C16044a c16044a = new C16044a();
            c16044a.f49489b = i10;
            c16044a.f49488a = z6;
            c16044a.m17609b(objValueOf);
            map.put(string, c16044a);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: b */
    public final void m17609b(Object obj) {
        switch (AbstractC0010F.m24h(this.f49489b)) {
            case 0:
            case 7:
                this.f49490c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f49491d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f49494g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f49492e = (String) obj;
                break;
            case 5:
                this.f49493f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f49491d = ((Float) obj).floatValue();
                break;
        }
    }
}
