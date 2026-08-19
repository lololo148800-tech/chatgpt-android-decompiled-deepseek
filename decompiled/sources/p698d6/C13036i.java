package p698d6;

import android.content.res.AssetManager;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.auth0.android.provider.lcl.qffLJgOYizGmMj;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001A.AbstractC0010F;
import p1073w3.C20810l;
import p117Eb.C2392v;
import p140Fa.C2700t;
import p520V5.C7781j;
import p520V5.C7794w;
import p520V5.InterfaceC7763A;
import p540W5.C8430a;
import p567X5.C9054d;
import p571X9.AbstractC9306j0;
import p591Y5.AbstractC9653d;
import p591Y5.C9654e;
import p591Y5.C9656g;
import p591Y5.C9663n;
import p591Y5.C9665p;
import p640a6.C10507b;
import p640a6.C10508c;
import p640a6.C10509d;
import p640a6.C10514i;
import p658b5.C11232c;
import p660b6.C11249a;
import p660b6.C11250b;
import p675c6.C11678m;
import p692d0.C12977p;
import p779h6.AbstractC14418g;

/* JADX INFO: renamed from: d6.i */
/* JADX INFO: loaded from: classes.dex */
public final class C13036i extends AbstractC13029b {

    /* JADX INFO: renamed from: D */
    public final StringBuilder f41405D;

    /* JADX INFO: renamed from: E */
    public final RectF f41406E;

    /* JADX INFO: renamed from: F */
    public final Matrix f41407F;

    /* JADX INFO: renamed from: G */
    public final C8430a f41408G;

    /* JADX INFO: renamed from: H */
    public final C8430a f41409H;

    /* JADX INFO: renamed from: I */
    public final HashMap f41410I;

    /* JADX INFO: renamed from: J */
    public final C12977p f41411J;

    /* JADX INFO: renamed from: K */
    public final ArrayList f41412K;

    /* JADX INFO: renamed from: L */
    public final C9654e f41413L;

    /* JADX INFO: renamed from: M */
    public final C7794w f41414M;

    /* JADX INFO: renamed from: N */
    public final C7781j f41415N;

    /* JADX INFO: renamed from: O */
    public final int f41416O;

    /* JADX INFO: renamed from: P */
    public final C9654e f41417P;

    /* JADX INFO: renamed from: Q */
    public C9665p f41418Q;

    /* JADX INFO: renamed from: R */
    public final C9654e f41419R;

    /* JADX INFO: renamed from: S */
    public C9665p f41420S;

    /* JADX INFO: renamed from: T */
    public final C9656g f41421T;

    /* JADX INFO: renamed from: U */
    public C9665p f41422U;

    /* JADX INFO: renamed from: V */
    public final C9656g f41423V;

    /* JADX INFO: renamed from: W */
    public C9665p f41424W;

    /* JADX INFO: renamed from: X */
    public final C9654e f41425X;

    /* JADX INFO: renamed from: Y */
    public C9665p f41426Y;

    /* JADX INFO: renamed from: Z */
    public C9665p f41427Z;

    /* JADX INFO: renamed from: a0 */
    public final C9654e f41428a0;

    /* JADX INFO: renamed from: b0 */
    public final C9654e f41429b0;

    /* JADX INFO: renamed from: c0 */
    public final C9654e f41430c0;

    public C13036i(C7794w c7794w, C13032e c13032e) {
        C20810l c20810l;
        C20810l c20810l2;
        C11249a c11249a;
        C20810l c20810l3;
        C11249a c11249a2;
        C20810l c20810l4;
        C11249a c11249a3;
        C2392v c2392v;
        C11249a c11249a4;
        C2392v c2392v2;
        C11250b c11250b;
        C2392v c2392v3;
        C11250b c11250b2;
        C2392v c2392v4;
        C11249a c11249a5;
        C2392v c2392v5;
        C11249a c11249a6;
        super(c7794w, c13032e);
        this.f41405D = new StringBuilder(2);
        this.f41406E = new RectF();
        this.f41407F = new Matrix();
        C8430a c8430a = new C8430a(1, 1);
        c8430a.setStyle(Paint.Style.FILL);
        this.f41408G = c8430a;
        C8430a c8430a2 = new C8430a(1, 2);
        c8430a2.setStyle(Paint.Style.STROKE);
        this.f41409H = c8430a2;
        this.f41410I = new HashMap();
        this.f41411J = new C12977p((Object) null);
        this.f41412K = new ArrayList();
        this.f41416O = 2;
        this.f41414M = c7794w;
        this.f41415N = c13032e.f41377b;
        C9654e c9654e = new C9654e(2, (List) c13032e.f41392q.f11539Z);
        this.f41413L = c9654e;
        c9654e.m10230a(this);
        m14772d(c9654e);
        C11232c c11232c = c13032e.f41393r;
        if (c11232c != null && (c2392v5 = (C2392v) c11232c.f33996Y) != null && (c11249a6 = (C11249a) c2392v5.f7436Z) != null) {
            AbstractC9653d abstractC9653dMo10670p = c11249a6.mo10670p();
            this.f41417P = (C9654e) abstractC9653dMo10670p;
            abstractC9653dMo10670p.m10230a(this);
            m14772d(abstractC9653dMo10670p);
        }
        if (c11232c != null && (c2392v4 = (C2392v) c11232c.f33996Y) != null && (c11249a5 = (C11249a) c2392v4.f7437o0) != null) {
            AbstractC9653d abstractC9653dMo10670p2 = c11249a5.mo10670p();
            this.f41419R = (C9654e) abstractC9653dMo10670p2;
            abstractC9653dMo10670p2.m10230a(this);
            m14772d(abstractC9653dMo10670p2);
        }
        if (c11232c != null && (c2392v3 = (C2392v) c11232c.f33996Y) != null && (c11250b2 = (C11250b) c2392v3.f7438p0) != null) {
            C9656g c9656gMo10670p = c11250b2.mo10670p();
            this.f41421T = c9656gMo10670p;
            c9656gMo10670p.m10230a(this);
            m14772d(c9656gMo10670p);
        }
        if (c11232c != null && (c2392v2 = (C2392v) c11232c.f33996Y) != null && (c11250b = (C11250b) c2392v2.f7439q0) != null) {
            C9656g c9656gMo10670p2 = c11250b.mo10670p();
            this.f41423V = c9656gMo10670p2;
            c9656gMo10670p2.m10230a(this);
            m14772d(c9656gMo10670p2);
        }
        if (c11232c != null && (c2392v = (C2392v) c11232c.f33996Y) != null && (c11249a4 = (C11249a) c2392v.f7440r0) != null) {
            AbstractC9653d abstractC9653dMo10670p3 = c11249a4.mo10670p();
            this.f41425X = (C9654e) abstractC9653dMo10670p3;
            abstractC9653dMo10670p3.m10230a(this);
            m14772d(abstractC9653dMo10670p3);
        }
        if (c11232c != null && (c20810l4 = (C20810l) c11232c.f33997Z) != null && (c11249a3 = (C11249a) c20810l4.f66086b) != null) {
            AbstractC9653d abstractC9653dMo10670p4 = c11249a3.mo10670p();
            this.f41428a0 = (C9654e) abstractC9653dMo10670p4;
            abstractC9653dMo10670p4.m10230a(this);
            m14772d(abstractC9653dMo10670p4);
        }
        if (c11232c != null && (c20810l3 = (C20810l) c11232c.f33997Z) != null && (c11249a2 = (C11249a) c20810l3.f66087c) != null) {
            AbstractC9653d abstractC9653dMo10670p5 = c11249a2.mo10670p();
            this.f41429b0 = (C9654e) abstractC9653dMo10670p5;
            abstractC9653dMo10670p5.m10230a(this);
            m14772d(abstractC9653dMo10670p5);
        }
        if (c11232c != null && (c20810l2 = (C20810l) c11232c.f33997Z) != null && (c11249a = (C11249a) c20810l2.f66088d) != null) {
            AbstractC9653d abstractC9653dMo10670p6 = c11249a.mo10670p();
            this.f41430c0 = (C9654e) abstractC9653dMo10670p6;
            abstractC9653dMo10670p6.m10230a(this);
            m14772d(abstractC9653dMo10670p6);
        }
        if (c11232c == null || (c20810l = (C20810l) c11232c.f33997Z) == null) {
            return;
        }
        this.f41416O = c20810l.f66085a;
    }

    /* JADX INFO: renamed from: u */
    public static void m14785u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: v */
    public static void m14786v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // p698d6.AbstractC13029b, p567X5.InterfaceC9055e
    /* JADX INFO: renamed from: c */
    public final void mo9612c(RectF rectF, Matrix matrix, boolean z6) {
        super.mo9612c(rectF, matrix, z6);
        C7781j c7781j = this.f41415N;
        rectF.set(0.0f, 0.0f, c7781j.f24590k.width(), c7781j.f24590k.height());
    }

    @Override // p698d6.AbstractC13029b, p640a6.InterfaceC10511f
    /* JADX INFO: renamed from: f */
    public final void mo9614f(C15384c c15384c, Object obj) {
        super.mo9614f(c15384c, obj);
        PointF pointF = InterfaceC7763A.f24513a;
        if (obj == 1) {
            C9665p c9665p = this.f41418Q;
            if (c9665p != null) {
                m14780p(c9665p);
            }
            C9665p c9665p2 = new C9665p(c15384c, null);
            this.f41418Q = c9665p2;
            c9665p2.m10230a(this);
            m14772d(this.f41418Q);
            return;
        }
        if (obj == 2) {
            C9665p c9665p3 = this.f41420S;
            if (c9665p3 != null) {
                m14780p(c9665p3);
            }
            C9665p c9665p4 = new C9665p(c15384c, null);
            this.f41420S = c9665p4;
            c9665p4.m10230a(this);
            m14772d(this.f41420S);
            return;
        }
        if (obj == InterfaceC7763A.f24526n) {
            C9665p c9665p5 = this.f41422U;
            if (c9665p5 != null) {
                m14780p(c9665p5);
            }
            C9665p c9665p6 = new C9665p(c15384c, null);
            this.f41422U = c9665p6;
            c9665p6.m10230a(this);
            m14772d(this.f41422U);
            return;
        }
        if (obj == InterfaceC7763A.f24527o) {
            C9665p c9665p7 = this.f41424W;
            if (c9665p7 != null) {
                m14780p(c9665p7);
            }
            C9665p c9665p8 = new C9665p(c15384c, null);
            this.f41424W = c9665p8;
            c9665p8.m10230a(this);
            m14772d(this.f41424W);
            return;
        }
        if (obj == InterfaceC7763A.f24502A) {
            C9665p c9665p9 = this.f41426Y;
            if (c9665p9 != null) {
                m14780p(c9665p9);
            }
            C9665p c9665p10 = new C9665p(c15384c, null);
            this.f41426Y = c9665p10;
            c9665p10.m10230a(this);
            m14772d(this.f41426Y);
            return;
        }
        if (obj != InterfaceC7763A.f24509H) {
            if (obj == InterfaceC7763A.f24511J) {
                C9654e c9654e = this.f41413L;
                c9654e.getClass();
                c9654e.m10239j(new C9663n(new C2700t(), c15384c, new C10507b()));
                return;
            }
            return;
        }
        C9665p c9665p11 = this.f41427Z;
        if (c9665p11 != null) {
            m14780p(c9665p11);
        }
        C9665p c9665p12 = new C9665p(c15384c, null);
        this.f41427Z = c9665p12;
        c9665p12.m10230a(this);
        m14772d(this.f41427Z);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x035e  */
    /* JADX WARN: Code duplicated, block: B:120:0x03db  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e6  */
    /* JADX WARN: Code duplicated, block: B:123:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:127:0x0400  */
    /* JADX WARN: Code duplicated, block: B:129:0x0413  */
    /* JADX WARN: Code duplicated, block: B:132:0x041c  */
    /* JADX WARN: Code duplicated, block: B:135:0x0434  */
    /* JADX WARN: Code duplicated, block: B:151:0x0485  */
    /* JADX WARN: Code duplicated, block: B:152:0x048e  */
    /* JADX WARN: Code duplicated, block: B:154:0x0499 A[LOOP:9: B:153:0x0497->B:154:0x0499, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:158:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:159:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:177:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0478 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:25:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:29:0x0115  */
    /* JADX WARN: Code duplicated, block: B:31:0x012a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0133  */
    /* JADX WARN: Code duplicated, block: B:36:0x0147  */
    /* JADX WARN: Code duplicated, block: B:37:0x0155  */
    /* JADX WARN: Code duplicated, block: B:39:0x0164  */
    /* JADX WARN: Code duplicated, block: B:40:0x0175  */
    /* JADX WARN: Code duplicated, block: B:42:0x0189 A[LOOP:4: B:41:0x0187->B:42:0x0189, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ee  */
    @Override // p698d6.AbstractC13029b
    /* JADX INFO: renamed from: j */
    public final void mo14775j(Canvas canvas, Matrix matrix, int i10) {
        C10508c c10508c;
        String str;
        String str2;
        String str3;
        Typeface typefaceCreateFromAsset;
        Typeface typeface;
        int i11;
        Typeface typeface2;
        float fFloatValue;
        float fM15932c;
        List listAsList;
        int size;
        int i12;
        int length;
        PointF pointF;
        float f10;
        List listM14791z;
        int i13;
        C13035h c13035h;
        int i14;
        String str4;
        int length2;
        int iCodePointAt;
        int iCharCount;
        int i15;
        C10508c c10508c2;
        long j10;
        C12977p c12977p;
        StringBuilder sb2;
        int iCharCount2;
        String string;
        int iCodePointAt2;
        float fFloatValue2;
        float f11;
        int i16;
        PointF pointF2;
        float f12;
        float f13;
        C8430a c8430a;
        String str5;
        String str6;
        List listM14791z2;
        int i17;
        C13035h c13035h2;
        int i18;
        String str7;
        int i19;
        C10509d c10509d;
        HashMap map;
        ArrayList arrayList;
        int size2;
        ArrayList arrayList2;
        int i20;
        int i21;
        List list;
        int i22;
        Path pathMo9617n;
        C10507b c10507b = (C10507b) this.f41413L.mo10234e();
        C7781j c7781j = this.f41415N;
        C10508c c10508c3 = (C10508c) c7781j.f24585f.get(c10507b.f31129b);
        if (c10508c3 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m14787t(c10507b, i10, 0);
        C7794w c7794w = this.f41414M;
        Map map2 = c7794w.f24672v0;
        C9656g c9656g = this.f41423V;
        String str8 = "\u0003";
        C8430a c8430a2 = this.f41408G;
        int i23 = -1;
        C8430a c8430a3 = this.f41409H;
        String str9 = c10508c3.f31143c;
        String str10 = c10508c3.f31141a;
        if (map2 != null || c7794w.f24658Y.f24587h.m14655f() <= 0) {
            C9665p c9665p = this.f41427Z;
            if (c9665p == null || (typeface = (Typeface) c9665p.mo10234e()) == null) {
                Map map3 = c7794w.f24672v0;
                if (map3 != null) {
                    str2 = str10;
                    if (map3.containsKey(str2)) {
                        typeface = (Typeface) map3.get(str2);
                        str8 = "\u0003";
                        c10508c = c10508c3;
                        str3 = Separators.RETURN;
                    } else {
                        c10508c = c10508c3;
                        String str11 = c10508c.f31142b;
                        if (map3.containsKey(str11)) {
                            typeface2 = (Typeface) map3.get(str11);
                        } else {
                            str = str9;
                            String strM9890i = AbstractC9306j0.m9890i(str2, "-", str);
                            if (map3.containsKey(strM9890i)) {
                                typeface2 = (Typeface) map3.get(strM9890i);
                            }
                        }
                        typeface = typeface2;
                        str3 = Separators.RETURN;
                        str8 = "\u0003";
                    }
                    if (typeface == null) {
                        typeface = c10508c.f31144d;
                    }
                } else {
                    c10508c = c10508c3;
                    str = str9;
                    str2 = str10;
                }
                C2392v c2392vM8061i = c7794w.m8061i();
                if (c2392vM8061i != null) {
                    C10514i c10514i = (C10514i) c2392vM8061i.f7436Z;
                    c10514i.f31159b = str2;
                    c10514i.f31160c = str;
                    HashMap map4 = (HashMap) c2392vM8061i.f7438p0;
                    Typeface typeface3 = (Typeface) map4.get(c10514i);
                    if (typeface3 != null) {
                        str8 = "\u0003";
                        typefaceCreateFromAsset = typeface3;
                        str3 = Separators.RETURN;
                    } else {
                        HashMap map5 = (HashMap) c2392vM8061i.f7439q0;
                        Typeface typeface4 = (Typeface) map5.get(str2);
                        if (typeface4 != null) {
                            typefaceCreateFromAsset = typeface4;
                            str3 = Separators.RETURN;
                        } else {
                            str3 = Separators.RETURN;
                            Typeface typeface5 = c10508c.f31144d;
                            if (typeface5 != null) {
                                typefaceCreateFromAsset = typeface5;
                            } else {
                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) c2392vM8061i.f7440r0, "fonts/" + str2 + ((String) c2392vM8061i.f7437o0));
                                map5.put(str2, typefaceCreateFromAsset);
                            }
                        }
                        boolean zContains = str.contains("Italic");
                        boolean zContains2 = str.contains("Bold");
                        if (zContains && zContains2) {
                            i11 = 3;
                        } else if (zContains) {
                            i11 = 2;
                        } else {
                            i11 = zContains2 ? 1 : 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i11) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i11);
                        }
                        map4.put(c10514i, typefaceCreateFromAsset);
                    }
                } else {
                    str3 = Separators.RETURN;
                    str8 = "\u0003";
                    typefaceCreateFromAsset = null;
                }
                typeface = typefaceCreateFromAsset;
                if (typeface == null) {
                    typeface = c10508c.f31144d;
                }
            } else {
                str8 = "\u0003";
                c10508c = c10508c3;
                str3 = Separators.RETURN;
            }
            if (typeface != null) {
                String str12 = c10507b.f31128a;
                c8430a2.setTypeface(typeface);
                C9665p c9665p2 = this.f41426Y;
                float fFloatValue3 = c9665p2 != null ? ((Float) c9665p2.mo10234e()).floatValue() : c10507b.f31130c;
                c8430a2.setTextSize(AbstractC14418g.m15932c() * fFloatValue3);
                c8430a3.setTypeface(c8430a2.getTypeface());
                c8430a3.setTextSize(c8430a2.getTextSize());
                float f14 = c10507b.f31132e / 10.0f;
                C9665p c9665p3 = this.f41424W;
                if (c9665p3 != null) {
                    fFloatValue = ((Float) c9665p3.mo10234e()).floatValue();
                } else {
                    if (c9656g != null) {
                        fFloatValue = ((Float) c9656g.mo10234e()).floatValue();
                    }
                    fM15932c = ((AbstractC14418g.m15932c() * f14) * fFloatValue3) / 100.0f;
                    listAsList = Arrays.asList(str12.replaceAll(Separators.NEWLINE, "\r").replaceAll(str8, "\r").replaceAll(str3, "\r").split("\r"));
                    size = listAsList.size();
                    i12 = 0;
                    length = 0;
                    while (i12 < size) {
                        String str13 = (String) listAsList.get(i12);
                        pointF = c10507b.f31140m;
                        if (pointF == null) {
                            f10 = 0.0f;
                        } else {
                            f10 = pointF.x;
                        }
                        List list2 = listAsList;
                        listM14791z = m14791z(str13, f10, c10508c, 0.0f, fM15932c, false);
                        i13 = 0;
                        while (i13 < listM14791z.size()) {
                            c13035h = (C13035h) listM14791z.get(i13);
                            i14 = i23 + 1;
                            canvas.save();
                            if (m14790y(canvas, c10507b, i14, c13035h.f41404b)) {
                                str4 = c13035h.f41403a;
                                length2 = 0;
                                while (length2 < str4.length()) {
                                    iCodePointAt = str4.codePointAt(length2);
                                    int i24 = i14;
                                    List list3 = listM14791z;
                                    iCharCount = Character.charCount(iCodePointAt) + length2;
                                    while (true) {
                                        if (iCharCount < str4.length()) {
                                            i15 = size;
                                            c10508c2 = c10508c;
                                            break;
                                        }
                                        iCodePointAt2 = str4.codePointAt(iCharCount);
                                        i15 = size;
                                        c10508c2 = c10508c;
                                        if (Character.getType(iCodePointAt2) == 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                                            break;
                                        }
                                        iCharCount += Character.charCount(iCodePointAt2);
                                        iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                        size = i15;
                                        c10508c = c10508c2;
                                    }
                                    j10 = iCodePointAt;
                                    c12977p = this.f41411J;
                                    if (c12977p.m14666f(j10) >= 0) {
                                        string = (String) c12977p.m14664d(j10);
                                    } else {
                                        sb2 = this.f41405D;
                                        sb2.setLength(0);
                                        iCharCount2 = length2;
                                        while (iCharCount2 < iCharCount) {
                                            int i25 = iCharCount;
                                            int iCodePointAt3 = str4.codePointAt(iCharCount2);
                                            sb2.appendCodePoint(iCodePointAt3);
                                            iCharCount2 += Character.charCount(iCodePointAt3);
                                            iCharCount = i25;
                                        }
                                        string = sb2.toString();
                                        c12977p.m14668h(j10, string);
                                    }
                                    m14787t(c10507b, i10, length + length2);
                                    if (c10507b.f31138k) {
                                        m14785u(string, c8430a2, canvas);
                                        m14785u(string, c8430a3, canvas);
                                    } else {
                                        m14785u(string, c8430a3, canvas);
                                        m14785u(string, c8430a2, canvas);
                                    }
                                    canvas.translate(c8430a2.measureText(string) + fM15932c, 0.0f);
                                    length2 += string.length();
                                    listM14791z = list3;
                                    i14 = i24;
                                    size = i15;
                                    i12 = i12;
                                    c10508c = c10508c2;
                                }
                            }
                            i23 = i14;
                            length = c13035h.f41403a.length() + length;
                            canvas.restore();
                            i13++;
                            listM14791z = listM14791z;
                            size = size;
                            i12 = i12;
                            c10508c = c10508c;
                        }
                        i12++;
                        listAsList = list2;
                        size = size;
                    }
                }
                f14 += fFloatValue;
                fM15932c = ((AbstractC14418g.m15932c() * f14) * fFloatValue3) / 100.0f;
                listAsList = Arrays.asList(str12.replaceAll(Separators.NEWLINE, "\r").replaceAll(str8, "\r").replaceAll(str3, "\r").split("\r"));
                size = listAsList.size();
                i12 = 0;
                length = 0;
                while (i12 < size) {
                    String str14 = (String) listAsList.get(i12);
                    pointF = c10507b.f31140m;
                    if (pointF == null) {
                        f10 = 0.0f;
                    } else {
                        f10 = pointF.x;
                    }
                    List list4 = listAsList;
                    listM14791z = m14791z(str14, f10, c10508c, 0.0f, fM15932c, false);
                    i13 = 0;
                    while (i13 < listM14791z.size()) {
                        c13035h = (C13035h) listM14791z.get(i13);
                        i14 = i23 + 1;
                        canvas.save();
                        if (m14790y(canvas, c10507b, i14, c13035h.f41404b)) {
                            str4 = c13035h.f41403a;
                            length2 = 0;
                            while (length2 < str4.length()) {
                                iCodePointAt = str4.codePointAt(length2);
                                int i26 = i14;
                                List list5 = listM14791z;
                                iCharCount = Character.charCount(iCodePointAt) + length2;
                                while (true) {
                                    if (iCharCount < str4.length()) {
                                        i15 = size;
                                        c10508c2 = c10508c;
                                        break;
                                    }
                                    iCodePointAt2 = str4.codePointAt(iCharCount);
                                    i15 = size;
                                    c10508c2 = c10508c;
                                    if (Character.getType(iCodePointAt2) == 16) {
                                    }
                                    iCharCount += Character.charCount(iCodePointAt2);
                                    iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                                    size = i15;
                                    c10508c = c10508c2;
                                }
                                j10 = iCodePointAt;
                                c12977p = this.f41411J;
                                if (c12977p.m14666f(j10) >= 0) {
                                    string = (String) c12977p.m14664d(j10);
                                } else {
                                    sb2 = this.f41405D;
                                    sb2.setLength(0);
                                    iCharCount2 = length2;
                                    while (iCharCount2 < iCharCount) {
                                        int i27 = iCharCount;
                                        int iCodePointAt4 = str4.codePointAt(iCharCount2);
                                        sb2.appendCodePoint(iCodePointAt4);
                                        iCharCount2 += Character.charCount(iCodePointAt4);
                                        iCharCount = i27;
                                    }
                                    string = sb2.toString();
                                    c12977p.m14668h(j10, string);
                                }
                                m14787t(c10507b, i10, length + length2);
                                if (c10507b.f31138k) {
                                    m14785u(string, c8430a2, canvas);
                                    m14785u(string, c8430a3, canvas);
                                } else {
                                    m14785u(string, c8430a3, canvas);
                                    m14785u(string, c8430a2, canvas);
                                }
                                canvas.translate(c8430a2.measureText(string) + fM15932c, 0.0f);
                                length2 += string.length();
                                listM14791z = list5;
                                i14 = i26;
                                size = i15;
                                i12 = i12;
                                c10508c = c10508c2;
                            }
                        }
                        i23 = i14;
                        length = c13035h.f41403a.length() + length;
                        canvas.restore();
                        i13++;
                        listM14791z = listM14791z;
                        size = size;
                        i12 = i12;
                        c10508c = c10508c;
                    }
                    i12++;
                    listAsList = list4;
                    size = size;
                }
            }
        } else {
            C9665p c9665p4 = this.f41426Y;
            float fFloatValue4 = (c9665p4 != null ? ((Float) c9665p4.mo10234e()).floatValue() : c10507b.f31130c) / 100.0f;
            float[] fArr = (float[]) AbstractC14418g.f45311d.get();
            float f15 = 0.0f;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            float f16 = AbstractC14418g.f45312e;
            fArr[2] = f16;
            fArr[3] = f16;
            matrix.mapPoints(fArr);
            C7794w c7794w2 = c7794w;
            Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
            List listAsList2 = Arrays.asList(c10507b.f31128a.replaceAll(Separators.NEWLINE, "\r").replaceAll("\u0003", "\r").replaceAll(Separators.RETURN, "\r").split("\r"));
            int size3 = listAsList2.size();
            float f17 = c10507b.f31132e / 10.0f;
            C9665p c9665p5 = this.f41424W;
            if (c9665p5 != null) {
                fFloatValue2 = ((Float) c9665p5.mo10234e()).floatValue();
            } else {
                if (c9656g != null) {
                    fFloatValue2 = ((Float) c9656g.mo10234e()).floatValue();
                }
                f11 = f17;
                i16 = 0;
                while (i16 < size3) {
                    String str15 = (String) listAsList2.get(i16);
                    pointF2 = c10507b.f31140m;
                    if (pointF2 == null) {
                        f12 = f15;
                    } else {
                        f12 = pointF2.x;
                    }
                    f13 = fFloatValue4;
                    C10508c c10508c4 = c10508c3;
                    List list6 = listAsList2;
                    int i28 = size3;
                    int i29 = i16;
                    c8430a = c8430a3;
                    str5 = str10;
                    C10508c c10508c5 = c10508c3;
                    str6 = str9;
                    listM14791z2 = m14791z(str15, f12, c10508c4, f13, f11, true);
                    i17 = 0;
                    while (i17 < listM14791z2.size()) {
                        c13035h2 = (C13035h) listM14791z2.get(i17);
                        i18 = i23 + 1;
                        canvas.save();
                        if (m14790y(canvas, c10507b, i18, c13035h2.f41404b)) {
                            str7 = c13035h2.f41403a;
                            i19 = 0;
                            while (i19 < str7.length()) {
                                List list7 = listM14791z2;
                                c10509d = (C10509d) c7781j.f24587h.m14652c(C10509d.m10965a(str7.charAt(i19), str5, str6));
                                if (c10509d == null) {
                                    i21 = i17;
                                    i18 = i18;
                                    str6 = str6;
                                    str5 = str5;
                                    c7794w2 = c7794w2;
                                } else {
                                    m14787t(c10507b, i10, i19);
                                    map = this.f41410I;
                                    if (map.containsKey(c10509d)) {
                                        list = (List) map.get(c10509d);
                                        i21 = i17;
                                    } else {
                                        arrayList = c10509d.f31145a;
                                        size2 = arrayList.size();
                                        arrayList2 = new ArrayList(size2);
                                        i20 = 0;
                                        while (i20 < size2) {
                                            arrayList2.add(new C9054d(c7794w2, this, (C11678m) arrayList.get(i20), c7781j));
                                            i20++;
                                            size2 = size2;
                                            arrayList = arrayList;
                                            i17 = i17;
                                        }
                                        i21 = i17;
                                        map.put(c10509d, arrayList2);
                                        list = arrayList2;
                                    }
                                    i22 = 0;
                                    while (i22 < list.size()) {
                                        pathMo9617n = ((C9054d) list.get(i22)).mo9617n();
                                        pathMo9617n.computeBounds(this.f41406E, false);
                                        Matrix matrix2 = this.f41407F;
                                        matrix2.reset();
                                        List list8 = list;
                                        matrix2.preTranslate(0.0f, (-c10507b.f31134g) * AbstractC14418g.m15932c());
                                        matrix2.preScale(f13, f13);
                                        pathMo9617n.transform(matrix2);
                                        if (c10507b.f31138k) {
                                            m14786v(pathMo9617n, c8430a2, canvas);
                                            m14786v(pathMo9617n, c8430a, canvas);
                                        } else {
                                            m14786v(pathMo9617n, c8430a, canvas);
                                            m14786v(pathMo9617n, c8430a2, canvas);
                                        }
                                        i22++;
                                        list = list8;
                                    }
                                    canvas.translate((AbstractC14418g.m15932c() * ((float) c10509d.f31147c) * f13) + f11, 0.0f);
                                }
                                i19++;
                                c7794w2 = c7794w2;
                                listM14791z2 = list7;
                                str7 = str7;
                                i18 = i18;
                                str6 = str6;
                                str5 = str5;
                                i17 = i21;
                            }
                        }
                        canvas.restore();
                        c7794w2 = c7794w2;
                        i23 = i18;
                        str6 = str6;
                        str5 = str5;
                        i17++;
                        listM14791z2 = listM14791z2;
                    }
                    String str16 = str6;
                    String str17 = str5;
                    i16 = i29 + 1;
                    c10508c3 = c10508c5;
                    str9 = str16;
                    str10 = str17;
                    f15 = 0.0f;
                    fFloatValue4 = f13;
                    c8430a3 = c8430a;
                    size3 = i28;
                    listAsList2 = list6;
                }
            }
            f17 += fFloatValue2;
            f11 = f17;
            i16 = 0;
            while (i16 < size3) {
                String str18 = (String) listAsList2.get(i16);
                pointF2 = c10507b.f31140m;
                if (pointF2 == null) {
                    f12 = f15;
                } else {
                    f12 = pointF2.x;
                }
                f13 = fFloatValue4;
                C10508c c10508c6 = c10508c3;
                List list9 = listAsList2;
                int i210 = size3;
                int i211 = i16;
                c8430a = c8430a3;
                str5 = str10;
                C10508c c10508c7 = c10508c3;
                str6 = str9;
                listM14791z2 = m14791z(str18, f12, c10508c6, f13, f11, true);
                i17 = 0;
                while (i17 < listM14791z2.size()) {
                    c13035h2 = (C13035h) listM14791z2.get(i17);
                    i18 = i23 + 1;
                    canvas.save();
                    if (m14790y(canvas, c10507b, i18, c13035h2.f41404b)) {
                        str7 = c13035h2.f41403a;
                        i19 = 0;
                        while (i19 < str7.length()) {
                            List list10 = listM14791z2;
                            c10509d = (C10509d) c7781j.f24587h.m14652c(C10509d.m10965a(str7.charAt(i19), str5, str6));
                            if (c10509d == null) {
                                i21 = i17;
                                i18 = i18;
                                str6 = str6;
                                str5 = str5;
                                c7794w2 = c7794w2;
                            } else {
                                m14787t(c10507b, i10, i19);
                                map = this.f41410I;
                                if (map.containsKey(c10509d)) {
                                    list = (List) map.get(c10509d);
                                    i21 = i17;
                                } else {
                                    arrayList = c10509d.f31145a;
                                    size2 = arrayList.size();
                                    arrayList2 = new ArrayList(size2);
                                    i20 = 0;
                                    while (i20 < size2) {
                                        arrayList2.add(new C9054d(c7794w2, this, (C11678m) arrayList.get(i20), c7781j));
                                        i20++;
                                        size2 = size2;
                                        arrayList = arrayList;
                                        i17 = i17;
                                    }
                                    i21 = i17;
                                    map.put(c10509d, arrayList2);
                                    list = arrayList2;
                                }
                                i22 = 0;
                                while (i22 < list.size()) {
                                    pathMo9617n = ((C9054d) list.get(i22)).mo9617n();
                                    pathMo9617n.computeBounds(this.f41406E, false);
                                    Matrix matrix3 = this.f41407F;
                                    matrix3.reset();
                                    List list11 = list;
                                    matrix3.preTranslate(0.0f, (-c10507b.f31134g) * AbstractC14418g.m15932c());
                                    matrix3.preScale(f13, f13);
                                    pathMo9617n.transform(matrix3);
                                    if (c10507b.f31138k) {
                                        m14786v(pathMo9617n, c8430a2, canvas);
                                        m14786v(pathMo9617n, c8430a, canvas);
                                    } else {
                                        m14786v(pathMo9617n, c8430a, canvas);
                                        m14786v(pathMo9617n, c8430a2, canvas);
                                    }
                                    i22++;
                                    list = list11;
                                }
                                canvas.translate((AbstractC14418g.m15932c() * ((float) c10509d.f31147c) * f13) + f11, 0.0f);
                            }
                            i19++;
                            c7794w2 = c7794w2;
                            listM14791z2 = list10;
                            str7 = str7;
                            i18 = i18;
                            str6 = str6;
                            str5 = str5;
                            i17 = i21;
                        }
                    }
                    canvas.restore();
                    c7794w2 = c7794w2;
                    i23 = i18;
                    str6 = str6;
                    str5 = str5;
                    i17++;
                    listM14791z2 = listM14791z2;
                }
                String str19 = str6;
                String str110 = str5;
                i16 = i211 + 1;
                c10508c3 = c10508c7;
                str9 = str19;
                str10 = str110;
                f15 = 0.0f;
                fFloatValue4 = f13;
                c8430a3 = c8430a;
                size3 = i210;
                listAsList2 = list9;
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: t */
    public final void m14787t(C10507b c10507b, int i10, int i11) {
        C9665p c9665p = this.f41418Q;
        C8430a c8430a = this.f41408G;
        if (c9665p != null) {
            c8430a.setColor(((Integer) c9665p.mo10234e()).intValue());
        } else {
            C9654e c9654e = this.f41417P;
            if (c9654e == null || !m14789x(i11)) {
                c8430a.setColor(c10507b.f31135h);
            } else {
                c8430a.setColor(((Integer) c9654e.mo10234e()).intValue());
            }
        }
        C9665p c9665p2 = this.f41420S;
        C8430a c8430a2 = this.f41409H;
        if (c9665p2 != null) {
            c8430a2.setColor(((Integer) c9665p2.mo10234e()).intValue());
        } else {
            C9654e c9654e2 = this.f41419R;
            if (c9654e2 == null || !m14789x(i11)) {
                c8430a2.setColor(c10507b.f31136i);
            } else {
                c8430a2.setColor(((Integer) c9654e2.mo10234e()).intValue());
            }
        }
        AbstractC9653d abstractC9653d = this.f41357w.f29135j;
        int iIntValue = 100;
        int iIntValue2 = abstractC9653d == null ? 100 : ((Integer) abstractC9653d.mo10234e()).intValue();
        C9654e c9654e3 = this.f41425X;
        if (c9654e3 != null && m14789x(i11)) {
            iIntValue = ((Integer) c9654e3.mo10234e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i10) / 255.0f);
        c8430a.setAlpha(iRound);
        c8430a2.setAlpha(iRound);
        C9665p c9665p3 = this.f41422U;
        if (c9665p3 != null) {
            c8430a2.setStrokeWidth(((Float) c9665p3.mo10234e()).floatValue());
            return;
        }
        C9656g c9656g = this.f41421T;
        if (c9656g == null || !m14789x(i11)) {
            c8430a2.setStrokeWidth(AbstractC14418g.m15932c() * c10507b.f31137j);
        } else {
            c8430a2.setStrokeWidth(((Float) c9656g.mo10234e()).floatValue());
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m14789x(int i10) {
        C9654e c9654e;
        int length = ((C10507b) this.f41413L.mo10234e()).f31128a.length();
        C9654e c9654e2 = this.f41428a0;
        if (c9654e2 == null || (c9654e = this.f41429b0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) c9654e2.mo10234e()).intValue(), ((Integer) c9654e.mo10234e()).intValue());
        int iMax = Math.max(((Integer) c9654e2.mo10234e()).intValue(), ((Integer) c9654e.mo10234e()).intValue());
        C9654e c9654e3 = this.f41430c0;
        if (c9654e3 != null) {
            int iIntValue = ((Integer) c9654e3.mo10234e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f41416O == 2) {
            return i10 >= iMin && i10 < iMax;
        }
        float f10 = (i10 / length) * 100.0f;
        return f10 >= ((float) iMin) && f10 < ((float) iMax);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m14790y(Canvas canvas, C10507b c10507b, int i10, float f10) {
        PointF pointF = c10507b.f31139l;
        PointF pointF2 = c10507b.f31140m;
        float fM15932c = AbstractC14418g.m15932c();
        float f11 = (i10 * c10507b.f31133f * fM15932c) + (pointF == null ? 0.0f : (c10507b.f31133f * fM15932c) + pointF.y);
        if (this.f41414M.f24639F0 && pointF2 != null && pointF != null && f11 >= pointF.y + pointF2.y + c10507b.f31130c) {
            return false;
        }
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int iM24h = AbstractC0010F.m24h(c10507b.f31131d);
        if (iM24h == 0) {
            canvas.translate(f12, f11);
        } else if (iM24h == 1) {
            canvas.translate((f12 + f13) - f10, f11);
        } else if (iM24h == 2) {
            canvas.translate(((f13 / 2.0f) + f12) - (f10 / 2.0f), f11);
        }
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final List m14791z(String str, float f10, C10508c c10508c, float f11, float f12, boolean z6) {
        float fMeasureText;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z6) {
                C10509d c10509d = (C10509d) this.f41415N.f24587h.m14652c(C10509d.m10965a(cCharAt, c10508c.f31141a, c10508c.f31143c));
                if (c10509d != null) {
                    fMeasureText = (AbstractC14418g.m15932c() * ((float) c10509d.f31147c) * f11) + f12;
                }
            } else {
                fMeasureText = this.f41408G.measureText(str.substring(i13, i13 + 1)) + f12;
            }
            if (cCharAt == ' ') {
                z10 = true;
                f15 = fMeasureText;
            } else if (z10) {
                z10 = false;
                i12 = i13;
                f14 = fMeasureText;
            } else {
                f14 += fMeasureText;
            }
            f13 += fMeasureText;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                C13035h c13035hM14788w = m14788w(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    float length = (f13 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f15);
                    c13035hM14788w.f41403a = strTrim;
                    c13035hM14788w.f41404b = length;
                    i11 = i13;
                    i12 = i11;
                    f13 = fMeasureText;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15;
                    c13035hM14788w.f41403a = strTrim2;
                    c13035hM14788w.f41404b = length2;
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            C13035h c13035hM14788w2 = m14788w(i10);
            c13035hM14788w2.f41403a = str.substring(i11);
            c13035hM14788w2.f41404b = f13;
        }
        return this.f41412K.subList(0, i10);
    }

    /* JADX INFO: renamed from: w */
    public final C13035h m14788w(int i10) {
        ArrayList arrayList = this.f41412K;
        for (int size = arrayList.size(); size < i10; size++) {
            C13035h c13035h = new C13035h();
            c13035h.f41403a = qffLJgOYizGmMj.boOGlxXTRrAWr;
            c13035h.f41404b = 0.0f;
            arrayList.add(c13035h);
        }
        return (C13035h) arrayList.get(i10 - 1);
    }
}
