package p742f6;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.graphics.Rect;
import io.sentry.internal.debugmeta.C15384c;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.HashMap;
import p232J3.C4206F;
import p279L1.VOxZ.sVoFrD;
import p520V5.C7781j;
import p520V5.C7796y;
import p640a6.C10508c;
import p640a6.C10509d;
import p640a6.C10513h;
import p675c6.C11678m;
import p692d0.C12960M;
import p692d0.C12977p;
import p698d6.C13032e;
import p764g6.C13822b;
import p779h6.AbstractC14413b;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: f6.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13566r {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42914a = C15384c.m16635u("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b */
    public static final C15384c f42915b = C15384c.m16635u(ParameterNames.f31999ID, "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c */
    public static final C15384c f42916c = C15384c.m16635u("list");

    /* JADX INFO: renamed from: d */
    public static final C15384c f42917d = C15384c.m16635u("cm", sVoFrD.UJPDxQVXilGO, "dr");

    /* JADX INFO: renamed from: a */
    public static C7781j m15100a(C13822b c13822b) throws C4206F, EOFException {
        HashMap map;
        int i10;
        ArrayList arrayList;
        int i11 = 1;
        float fM15932c = AbstractC14418g.m15932c();
        C12977p c12977p = new C12977p((Object) null);
        ArrayList arrayList2 = new ArrayList();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C12960M c12960m = new C12960M(0);
        C7781j c7781j = new C7781j();
        c13822b.mo15430e();
        int iMo15431g0 = 0;
        int iMo15431g1 = 0;
        float fMo15423O = 0.0f;
        float fMo15423O2 = 0.0f;
        float fMo15423O3 = 0.0f;
        while (c13822b.hasNext()) {
            switch (c13822b.mo15427T(f42914a)) {
                case 0:
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    iMo15431g0 = c13822b.mo15431g0();
                    break;
                case 1:
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    iMo15431g1 = c13822b.mo15431g0();
                    break;
                case 2:
                    fMo15423O = (float) c13822b.mo15423O();
                    i11 = i11;
                    fM15932c = fM15932c;
                    break;
                case 3:
                    fMo15423O2 = ((float) c13822b.mo15423O()) - 0.01f;
                    i11 = i11;
                    fM15932c = fM15932c;
                    break;
                case 4:
                    fMo15423O3 = (float) c13822b.mo15423O();
                    i11 = i11;
                    fM15932c = fM15932c;
                    break;
                case 5:
                    fM15932c = fM15932c;
                    arrayList2 = arrayList2;
                    arrayList3 = arrayList3;
                    fMo15423O = fMo15423O;
                    map = map2;
                    String[] strArrSplit = c13822b.mo15435x().split("\\.");
                    int i12 = Integer.parseInt(strArrSplit[0]);
                    i10 = 1;
                    int i13 = Integer.parseInt(strArrSplit[1]);
                    int i14 = Integer.parseInt(strArrSplit[2]);
                    if (i12 < 4 || (i12 <= 4 && (i13 < 4 || (i13 <= 4 && i14 < 0)))) {
                        c7781j.m8039a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                case 6:
                    ArrayList arrayList4 = arrayList2;
                    arrayList3 = arrayList3;
                    c13822b.mo15429a();
                    int i15 = 0;
                    while (c13822b.hasNext()) {
                        C13032e c13032eM15099a = AbstractC13565q.m15099a(c13822b, c7781j);
                        if (c13032eM15099a.f41380e == 3) {
                            i15++;
                        }
                        ArrayList arrayList5 = arrayList4;
                        arrayList5.add(c13032eM15099a);
                        HashMap map5 = map2;
                        c12977p.m14668h(c13032eM15099a.f41379d, c13032eM15099a);
                        if (i15 > 4) {
                            AbstractC14413b.m15913b("You have " + i15 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                        }
                        arrayList4 = arrayList5;
                        map2 = map5;
                    }
                    map = map2;
                    arrayList2 = arrayList4;
                    c13822b.mo15433k();
                    i10 = 1;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                case 7:
                    arrayList3 = arrayList3;
                    c13822b.mo15429a();
                    while (c13822b.hasNext()) {
                        ArrayList arrayList6 = new ArrayList();
                        C12977p c12977p2 = new C12977p((Object) null);
                        c13822b.mo15430e();
                        String strMo15435x = null;
                        String strMo15435x2 = null;
                        String strMo15435x3 = null;
                        int iMo15431g2 = 0;
                        int iMo15431g3 = 0;
                        while (c13822b.hasNext()) {
                            int iMo15427T = c13822b.mo15427T(f42915b);
                            if (iMo15427T != 0) {
                                if (iMo15427T == 1) {
                                    c13822b.mo15429a();
                                    while (c13822b.hasNext()) {
                                        C13032e c13032eM15099a2 = AbstractC13565q.m15099a(c13822b, c7781j);
                                        c12977p2.m14668h(c13032eM15099a2.f41379d, c13032eM15099a2);
                                        arrayList6.add(c13032eM15099a2);
                                        arrayList2 = arrayList2;
                                    }
                                    arrayList = arrayList2;
                                    c13822b.mo15433k();
                                } else if (iMo15427T == 2) {
                                    iMo15431g2 = c13822b.mo15431g0();
                                } else if (iMo15427T == 3) {
                                    iMo15431g3 = c13822b.mo15431g0();
                                } else if (iMo15427T == 4) {
                                    strMo15435x2 = c13822b.mo15435x();
                                } else if (iMo15427T != 5) {
                                    c13822b.mo15428W();
                                    c13822b.mo15421D();
                                    arrayList = arrayList2;
                                } else {
                                    strMo15435x3 = c13822b.mo15435x();
                                }
                                arrayList2 = arrayList;
                            } else {
                                strMo15435x = c13822b.mo15435x();
                            }
                        }
                        ArrayList arrayList7 = arrayList2;
                        c13822b.mo15434m();
                        if (strMo15435x2 != null) {
                            map3.put(strMo15435x, new C7796y(strMo15435x, iMo15431g2, strMo15435x2, iMo15431g3, strMo15435x3));
                        } else {
                            map2.put(strMo15435x, arrayList6);
                        }
                        arrayList2 = arrayList7;
                    }
                    c13822b.mo15433k();
                    map = map2;
                    arrayList2 = arrayList2;
                    i10 = 1;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                case 8:
                    c13822b.mo15430e();
                    while (c13822b.hasNext()) {
                        if (c13822b.mo15427T(f42916c) != 0) {
                            c13822b.mo15428W();
                            c13822b.mo15421D();
                        } else {
                            c13822b.mo15429a();
                            while (c13822b.hasNext()) {
                                C15384c c15384c = AbstractC13559k.f42900a;
                                c13822b.mo15430e();
                                String strMo15435x4 = null;
                                String strMo15435x5 = null;
                                String strMo15435x6 = null;
                                while (c13822b.hasNext()) {
                                    int iMo15427T2 = c13822b.mo15427T(AbstractC13559k.f42900a);
                                    if (iMo15427T2 != 0) {
                                        ArrayList arrayList8 = arrayList3;
                                        if (iMo15427T2 == 1) {
                                            strMo15435x5 = c13822b.mo15435x();
                                        } else if (iMo15427T2 == 2) {
                                            strMo15435x6 = c13822b.mo15435x();
                                        } else if (iMo15427T2 != 3) {
                                            c13822b.mo15428W();
                                            c13822b.mo15421D();
                                        } else {
                                            c13822b.mo15423O();
                                        }
                                        arrayList3 = arrayList8;
                                    } else {
                                        strMo15435x4 = c13822b.mo15435x();
                                    }
                                }
                                c13822b.mo15434m();
                                map4.put(strMo15435x5, new C10508c(strMo15435x4, strMo15435x5, strMo15435x6));
                                arrayList3 = arrayList3;
                            }
                            c13822b.mo15433k();
                        }
                    }
                    arrayList3 = arrayList3;
                    c13822b.mo15434m();
                    arrayList2 = arrayList2;
                    map = map2;
                    i10 = 1;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                case 9:
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    c13822b.mo15429a();
                    while (c13822b.hasNext()) {
                        C15384c c15384c2 = AbstractC13558j.f42898a;
                        ArrayList arrayList9 = new ArrayList();
                        c13822b.mo15430e();
                        double dMo15423O = 0.0d;
                        char cCharAt = 0;
                        String strMo15435x7 = null;
                        String strMo15435x8 = null;
                        while (c13822b.hasNext()) {
                            int iMo15427T3 = c13822b.mo15427T(AbstractC13558j.f42898a);
                            if (iMo15427T3 == 0) {
                                cCharAt = c13822b.mo15435x().charAt(0);
                            } else if (iMo15427T3 == 1) {
                                c13822b.mo15423O();
                            } else if (iMo15427T3 == 2) {
                                dMo15423O = c13822b.mo15423O();
                            } else if (iMo15427T3 == 3) {
                                strMo15435x7 = c13822b.mo15435x();
                            } else if (iMo15427T3 == 4) {
                                strMo15435x8 = c13822b.mo15435x();
                            } else if (iMo15427T3 != 5) {
                                c13822b.mo15428W();
                                c13822b.mo15421D();
                            } else {
                                c13822b.mo15430e();
                                while (c13822b.hasNext()) {
                                    if (c13822b.mo15427T(AbstractC13558j.f42899b) != 0) {
                                        c13822b.mo15428W();
                                        c13822b.mo15421D();
                                    } else {
                                        c13822b.mo15429a();
                                        while (c13822b.hasNext()) {
                                            arrayList9.add((C11678m) AbstractC13555g.m15090a(c13822b, c7781j));
                                        }
                                        c13822b.mo15433k();
                                    }
                                }
                                c13822b.mo15434m();
                            }
                        }
                        c13822b.mo15434m();
                        C10509d c10509d = new C10509d(arrayList9, cCharAt, dMo15423O, strMo15435x7, strMo15435x8);
                        c12960m.m14654e(c10509d.hashCode(), c10509d);
                    }
                    c13822b.mo15433k();
                    i10 = 1;
                    map = map2;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                case 10:
                    c13822b.mo15429a();
                    while (c13822b.hasNext()) {
                        c13822b.mo15430e();
                        String strMo15435x9 = null;
                        float fMo15423O4 = 0.0f;
                        float fMo15423O5 = 0.0f;
                        while (c13822b.hasNext()) {
                            int iMo15427T4 = c13822b.mo15427T(f42917d);
                            if (iMo15427T4 != 0) {
                                if (iMo15427T4 == i11) {
                                    fMo15423O4 = (float) c13822b.mo15423O();
                                } else if (iMo15427T4 != 2) {
                                    c13822b.mo15428W();
                                    c13822b.mo15421D();
                                } else {
                                    fMo15423O5 = (float) c13822b.mo15423O();
                                }
                                fM15932c = fM15932c;
                            } else {
                                strMo15435x9 = c13822b.mo15435x();
                            }
                            i11 = 1;
                        }
                        float f10 = fM15932c;
                        c13822b.mo15434m();
                        arrayList3.add(new C10513h(strMo15435x9, fMo15423O4, fMo15423O5));
                        fM15932c = f10;
                        fMo15423O = fMo15423O;
                        i11 = 1;
                    }
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    c13822b.mo15433k();
                    i10 = 1;
                    map = map2;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
                default:
                    c13822b.mo15428W();
                    c13822b.mo15421D();
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    i10 = i11;
                    map = map2;
                    i11 = i10;
                    map2 = map;
                    fM15932c = fM15932c;
                    fMo15423O = fMo15423O;
                    break;
            }
            arrayList3 = arrayList3;
            arrayList2 = arrayList2;
        }
        float f11 = fM15932c;
        Rect rect = new Rect(0, 0, (int) (iMo15431g0 * f11), (int) (iMo15431g1 * f11));
        float fM15932c2 = AbstractC14418g.m15932c();
        c7781j.f24590k = rect;
        c7781j.f24591l = fMo15423O;
        c7781j.f24592m = fMo15423O2;
        c7781j.f24593n = fMo15423O3;
        c7781j.f24589j = arrayList2;
        c7781j.f24588i = c12977p;
        c7781j.f24582c = map2;
        c7781j.f24583d = map3;
        c7781j.f24584e = fM15932c2;
        c7781j.f24587h = c12960m;
        c7781j.f24585f = map4;
        c7781j.f24586g = arrayList3;
        return c7781j;
    }
}
