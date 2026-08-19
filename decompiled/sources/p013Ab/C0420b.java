package p013Ab;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.widget.ImageView;
import bb.AbstractC11281F;
import bb.AbstractC11320m;
import bb.AbstractC11330w;
import bb.C11279D;
import bb.C11299Y;
import co.C11829s;
import com.google.protobuf.AbstractC12107L1;
import fo.C13711h;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mo.C17342i;
import mo.EnumC17357x;
import org.xmlpull.v1.XmlPullParserException;
import p001A.AbstractC0010F;
import p001A.C0017I0;
import p001A.C0093v0;
import p003A1.C0160D0;
import p003A1.InterfaceC0161D1;
import p030B2.AbstractC0738T;
import p049Bm.InterfaceC1436k;
import p080D0.AbstractC1807h0;
import p1007s7.C19465d;
import p1009s9.C19501d;
import p1014t1.AbstractC19736m;
import p1014t1.C19729f;
import p1014t1.C19738o;
import p1014t1.C19741r;
import p1014t1.C19742s;
import p1073w3.AbstractC20817s;
import p1073w3.C20811m;
import p1073w3.C20816r;
import p1095x1.InterfaceC21098s;
import p117Eb.C2385o;
import p153Fn.C2925c;
import p200Hm.C3508g;
import p310M9.C5311e;
import p372P3.AbstractC6320b;
import p372P3.C6325g;
import p372P3.C6330l;
import p372P3.C6337s;
import p372P3.C6339u;
import p372P3.InterfaceC6326h;
import p392Q0.C6546d;
import p523V9.AbstractC8020X;
import p523V9.AbstractC8025X4;
import p523V9.C7863C6;
import p523V9.C7917J4;
import p523V9.C7999U;
import p523V9.C8019W5;
import p571X9.AbstractC9106B3;
import p571X9.C9120E;
import p571X9.C9191P4;
import p571X9.C9340o4;
import p571X9.C9375u3;
import p594Y9.C9741I;
import p594Y9.C9805S4;
import p594Y9.C9955q4;
import p594Y9.C9978u3;
import p606Yn.C10110k;
import p615Z6.C10252z0;
import p644ab.C10530c;
import p644ab.C10535h;
import p658b5.C11242m;
import p692d0.AbstractC12955H;
import p692d0.C12948A;
import p736f0.C13487e;
import p817j$.util.DesugarCollections;
import p817j$.util.Objects;
import p880m.AbstractC17123a;
import p883m2.AbstractC17141a;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p909nm.C17677k;
import p928oh.C18194a;
import p953q0.AbstractC18551I;
import p953q0.C18580g;
import p953q0.InterfaceC18556N;
import p955q2.AbstractC18610b;
import p955q2.AbstractC18611c;
import p960q9.C18655i;
import p977r0.C18837i;
import p977r0.C18838j;
import p999s.AbstractC19357i0;
import p999s.C19372q;

/* JADX INFO: renamed from: Ab.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0420b implements InterfaceC6326h, InterfaceC18556N {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1380Y;

    /* JADX INFO: renamed from: Z */
    public int f1381Z;

    /* JADX INFO: renamed from: o0 */
    public Object f1382o0;

    /* JADX INFO: renamed from: p0 */
    public Object f1383p0;

    public /* synthetic */ C0420b(char c9, int i10) {
        this.f1380Y = i10;
    }

    /* JADX INFO: renamed from: j */
    public static C0420b m1036j(Resources resources, int i10, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        float f10;
        float f11;
        float f12;
        int i11;
        Shader radialGradient;
        Shader.TileMode tileMode;
        Shader.TileMode tileMode2;
        XmlResourceParser xml = resources.getXml(i10);
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
        String name = xml.getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                ColorStateList colorStateListM19971b = AbstractC18611c.m19971b(resources, xml, attributeSetAsAttributeSet, theme);
                return new C0420b((Shader) null, colorStateListM19971b, colorStateListM19971b.getDefaultColor());
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        String name2 = xml.getName();
        if (!name2.equals("gradient")) {
            throw new XmlPullParserException(xml.getPositionDescription() + ": invalid gradient color tag " + name2);
        }
        TypedArray typedArrayM19964h = AbstractC18610b.m19964h(resources, theme, attributeSetAsAttributeSet, AbstractC17141a.f54811d);
        float f13 = !AbstractC18610b.m19961e(xml, "startX") ? 0.0f : typedArrayM19964h.getFloat(8, 0.0f);
        float f14 = !AbstractC18610b.m19961e(xml, "startY") ? 0.0f : typedArrayM19964h.getFloat(9, 0.0f);
        float f15 = !AbstractC18610b.m19961e(xml, "endX") ? 0.0f : typedArrayM19964h.getFloat(10, 0.0f);
        float f16 = !AbstractC18610b.m19961e(xml, "endY") ? 0.0f : typedArrayM19964h.getFloat(11, 0.0f);
        float f17 = !AbstractC18610b.m19961e(xml, "centerX") ? 0.0f : typedArrayM19964h.getFloat(3, 0.0f);
        float f18 = !AbstractC18610b.m19961e(xml, "centerY") ? 0.0f : typedArrayM19964h.getFloat(4, 0.0f);
        int i12 = !AbstractC18610b.m19961e(xml, "type") ? 0 : typedArrayM19964h.getInt(2, 0);
        int color = !AbstractC18610b.m19961e(xml, "startColor") ? 0 : typedArrayM19964h.getColor(0, 0);
        boolean zM19961e = AbstractC18610b.m19961e(xml, "centerColor");
        int color2 = !AbstractC18610b.m19961e(xml, "centerColor") ? 0 : typedArrayM19964h.getColor(7, 0);
        int color3 = !AbstractC18610b.m19961e(xml, "endColor") ? 0 : typedArrayM19964h.getColor(1, 0);
        int i13 = !AbstractC18610b.m19961e(xml, "tileMode") ? 0 : typedArrayM19964h.getInt(6, 0);
        float f19 = !AbstractC18610b.m19961e(xml, "gradientRadius") ? 0.0f : typedArrayM19964h.getFloat(5, 0.0f);
        typedArrayM19964h.recycle();
        int depth = xml.getDepth() + 1;
        float f20 = f19;
        ArrayList arrayList = new ArrayList(20);
        float f21 = f16;
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next2 = xml.next();
            f10 = f15;
            if (next2 == 1) {
                f11 = f14;
                break;
            }
            int depth2 = xml.getDepth();
            f11 = f14;
            if (depth2 < depth && next2 == 3) {
                break;
            }
            if (next2 == 2 && depth2 <= depth && xml.getName().equals("item")) {
                TypedArray typedArrayM19964h2 = AbstractC18610b.m19964h(resources, theme, attributeSetAsAttributeSet, AbstractC17141a.f54812e);
                boolean zHasValue = typedArrayM19964h2.hasValue(0);
                boolean zHasValue2 = typedArrayM19964h2.hasValue(1);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xml.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color4 = typedArrayM19964h2.getColor(0, 0);
                float f22 = typedArrayM19964h2.getFloat(1, 0.0f);
                typedArrayM19964h2.recycle();
                arrayList2.add(Integer.valueOf(color4));
                arrayList.add(Float.valueOf(f22));
            }
            f15 = f10;
            f14 = f11;
        }
        C0160D0 c0160d0 = arrayList2.size() > 0 ? new C0160D0(arrayList2, arrayList) : null;
        if (c0160d0 == null) {
            c0160d0 = zM19961e ? new C0160D0(color, color2, color3) : new C0160D0(color, color3);
        }
        if (i12 == 1) {
            float f23 = f17;
            i11 = 0;
            if (f20 <= 0.0f) {
                f12 = f18;
                throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
            }
            if (i13 == 1) {
                f12 = f18;
                tileMode = Shader.TileMode.REPEAT;
            } else if (i13 != 2) {
                f12 = f18;
                tileMode = Shader.TileMode.CLAMP;
            } else {
                f12 = f18;
                tileMode = Shader.TileMode.MIRROR;
            }
            radialGradient = new RadialGradient(f23, f12, f20, c0160d0.f641a, c0160d0.f642b, tileMode);
        } else if (i12 != 2) {
            if (i13 != 1) {
                tileMode2 = i13 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
            } else {
                tileMode2 = Shader.TileMode.REPEAT;
            }
            Shader.TileMode tileMode3 = tileMode2;
            i11 = 0;
            radialGradient = new LinearGradient(f13, f11, f10, f21, c0160d0.f641a, c0160d0.f642b, tileMode3);
        } else {
            i11 = 0;
            radialGradient = new SweepGradient(f17, f18, c0160d0.f641a, c0160d0.f642b);
        }
        return new C0420b(radialGradient, (ColorStateList) null, i11);
    }

    /* JADX INFO: renamed from: z */
    private final /* synthetic */ void m1037z() {
    }

    /* JADX INFO: renamed from: A */
    public void m1038A(Object obj, Object obj2) {
        int i10 = (this.f1381Z + 1) * 2;
        Object[] objArr = (Object[]) this.f1382o0;
        if (i10 > objArr.length) {
            this.f1382o0 = Arrays.copyOf(objArr, AbstractC11330w.m12760e(objArr.length, i10));
        }
        if (obj == null) {
            throw new NullPointerException(AbstractC10763a.m11051i(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(AbstractC12107L1.m13824o(obj, "null value in entry: ", "=null"));
        }
        Object[] objArr2 = (Object[]) this.f1382o0;
        int i11 = this.f1381Z;
        int i12 = i11 * 2;
        objArr2[i12] = obj;
        objArr2[i12 + 1] = obj2;
        this.f1381Z = i11 + 1;
    }

    /* JADX INFO: renamed from: B */
    public void m1039B() {
        AbstractC17678l.m19312s((int[]) this.f1382o0, 0, 0, 6);
        ((C17677k) this.f1383p0).clear();
    }

    /* JADX INFO: renamed from: C */
    public void m1040C(int i10) {
        ImageView imageView = (ImageView) this.f1382o0;
        if (i10 != 0) {
            Drawable drawableM9636b = AbstractC9106B3.m9636b(imageView.getContext(), i10);
            if (drawableM9636b != null) {
                AbstractC19357i0.m20462a(drawableM9636b);
            }
            imageView.setImageDrawable(drawableM9636b);
        } else {
            imageView.setImageDrawable(null);
        }
        m1048c();
    }

    /* JADX INFO: renamed from: D */
    public void m1041D(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative lanes are not supported");
        }
        m1057m(i10);
        ((int[]) this.f1382o0)[i10 - this.f1381Z] = i11 + 1;
    }

    /* JADX INFO: renamed from: E */
    public List m1042E(CharSequence charSequence) {
        charSequence.getClass();
        C18655i c18655i = (C18655i) this.f1383p0;
        c18655i.getClass();
        C10535h c10535h = new C10535h(c18655i, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (c10535h.hasNext()) {
            arrayList.add((String) c10535h.next());
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002d  */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: F */
    public void m1043F(C19729f c19729f) {
        C19738o c19738o = (C19738o) this.f1383p0;
        C19738o c19738o2 = (C19738o) c19729f.f62460a.get(0);
        if (c19738o != null) {
            long j10 = c19738o2.f62479b - c19738o.f62479b;
            InterfaceC0161D1 interfaceC0161D1 = (InterfaceC0161D1) this.f1382o0;
            if (j10 >= interfaceC0161D1.mo498a() || !AbstractC1807h0.m2633v(interfaceC0161D1, c19738o, c19738o2)) {
                this.f1381Z = 1;
            } else {
                this.f1381Z++;
            }
        } else {
            this.f1381Z = 1;
        }
        this.f1383p0 = c19738o2;
    }

    /* JADX INFO: renamed from: G */
    public void m1044G(String str, C19501d c19501d) {
        int i10 = this.f1381Z + 1;
        Object[] objArr = (Object[]) this.f1382o0;
        int length = objArr.length;
        int i11 = i10 + i10;
        if (i11 > length) {
            if (i11 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i12 = length + (length >> 1) + 1;
            if (i12 < i11) {
                int iHighestOneBit = Integer.highestOneBit(i11 - 1);
                i12 = iHighestOneBit + iHighestOneBit;
            }
            if (i12 < 0) {
                i12 = Integer.MAX_VALUE;
            }
            this.f1382o0 = Arrays.copyOf(objArr, i12);
        }
        Object[] objArr2 = (Object[]) this.f1382o0;
        int i13 = this.f1381Z;
        int i14 = i13 + i13;
        objArr2[i14] = str;
        objArr2[i14 + 1] = c19501d;
        this.f1381Z = i13 + 1;
    }

    /* JADX INFO: renamed from: H */
    public byte[] m1045H() {
        switch (this.f1380Y) {
            case 6:
                ((C19465d) this.f1383p0).f61776u0 = false;
                C19465d c19465d = (C19465d) this.f1383p0;
                c19465d.f61774s0 = Boolean.FALSE;
                C8019W5 c8019w5 = new C8019W5(c19465d);
                C10252z0 c10252z0 = (C10252z0) this.f1382o0;
                c10252z0.f30454Y = c8019w5;
                try {
                    C7863C6.m8140b();
                    C7863C6 c7863c6 = C7863C6.f24766o0;
                    C7917J4 c7917j4 = new C7917J4(c10252z0);
                    C13711h c13711h = new C13711h(12);
                    c7863c6.m8141a(c13711h);
                    return new C5311e(new HashMap((HashMap) c13711h.f43259Z), new HashMap((HashMap) c13711h.f43260o0), (C7999U) c13711h.f43261p0, 13).m5848C(c7917j4);
                } catch (UnsupportedEncodingException e10) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
                }
            case 7:
                ((C19465d) this.f1383p0).f61776u0 = false;
                C19465d c19465d2 = (C19465d) this.f1383p0;
                c19465d2.f61774s0 = Boolean.FALSE;
                C9340o4 c9340o4 = new C9340o4(c19465d2);
                C0017I0 c0017i0 = (C0017I0) this.f1382o0;
                c0017i0.f64Y = c9340o4;
                try {
                    C9191P4.m9753b();
                    C9191P4 c9191p4 = C9191P4.f27974o0;
                    C9375u3 c9375u3 = new C9375u3(c0017i0);
                    C13711h c13711h2 = new C13711h(15);
                    c9191p4.m9754a(c13711h2);
                    return new C5311e(new HashMap((HashMap) c13711h2.f43259Z), new HashMap((HashMap) c13711h2.f43260o0), (C9120E) c13711h2.f43261p0, 16).m5849D(c9375u3);
                } catch (UnsupportedEncodingException e11) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e11);
                }
            default:
                ((C19465d) this.f1383p0).f61776u0 = false;
                C19465d c19465d3 = (C19465d) this.f1383p0;
                c19465d3.f61774s0 = Boolean.FALSE;
                C9955q4 c9955q4 = new C9955q4(c19465d3);
                C10252z0 c10252z1 = (C10252z0) this.f1382o0;
                c10252z1.f30454Y = c9955q4;
                try {
                    C9805S4.m10429b();
                    C9805S4 c9805s4 = C9805S4.f29321o0;
                    C9978u3 c9978u3 = new C9978u3(c10252z1);
                    C5311e c5311e = new C5311e(18);
                    c9805s4.m10430a(c5311e);
                    return new C11242m(new HashMap((HashMap) c5311e.f17484Z), new HashMap((HashMap) c5311e.f17485o0), (C9741I) c5311e.f17486p0).m12612N(c9978u3);
                } catch (UnsupportedEncodingException e12) {
                    throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e12);
                }
        }
    }

    @Override // p953q0.InterfaceC18556N
    /* JADX INFO: renamed from: a */
    public int mo1046a(Object obj) {
        C12948A c12948a = (C12948A) this.f1382o0;
        int iM14603c = c12948a.m14603c(obj);
        if (iM14603c >= 0) {
            return c12948a.f41111c[iM14603c];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m1047b(int i10, Object obj) {
        if (i10 < 0) {
            throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "size should be >=0, but was ").toString());
        }
        if (i10 == 0) {
            return;
        }
        C18580g c18580g = new C18580g(this.f1381Z, obj, i10);
        this.f1381Z += i10;
        ((C6546d) this.f1382o0).m7099c(c18580g);
    }

    /* JADX INFO: renamed from: c */
    public void m1048c() {
        C17342i c17342i;
        ImageView imageView = (ImageView) this.f1382o0;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC19357i0.m20462a(drawable);
        }
        if (drawable == null || (c17342i = (C17342i) this.f1383p0) == null) {
            return;
        }
        C19372q.m20476e(drawable, c17342i, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: d */
    public boolean m1049d(int i10, int i11) {
        int iM1065u = m1065u(i10);
        return iM1065u == i11 || iM1065u == -1 || iM1065u == -2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    @Override // p372P3.InterfaceC6326h
    /* JADX INFO: renamed from: e */
    public C6325g mo1050e(C6330l c6330l, long j10) throws EOFException, InterruptedIOException {
        switch (this.f1380Y) {
            case 4:
                long j11 = c6330l.f20548p0;
                long jM1058n = m1058n(c6330l);
                long jMo3048e = c6330l.mo3048e();
                c6330l.m6941g(Math.max(6, ((C6339u) this.f1382o0).f20567c), false);
                long jM1058n2 = m1058n(c6330l);
                long jMo3048e2 = c6330l.mo3048e();
                if (jM1058n > j10 || jM1058n2 <= j10) {
                    return jM1058n2 <= j10 ? new C6325g(jM1058n2, -2, jMo3048e2) : new C6325g(jM1058n, -1, j11);
                }
                return new C6325g(-9223372036854775807L, 0, jMo3048e);
            default:
                long j12 = c6330l.f20548p0;
                int iMin = (int) Math.min(112800, c6330l.f20547o0 - j12);
                C20811m c20811m = (C20811m) this.f1383p0;
                c20811m.m21341C(iMin);
                c6330l.mo3047d(c20811m.f66092a, 0, iMin, false);
                int i10 = c20811m.f66094c;
                long j13 = -1;
                long j14 = -1;
                long j15 = -9223372036854775807L;
                while (c20811m.m21346a() >= 188) {
                    byte[] bArr = c20811m.f66092a;
                    int i11 = c20811m.f66093b;
                    while (i11 < i10 && bArr[i11] != 71) {
                        i11++;
                    }
                    int i12 = i11 + 188;
                    if (i12 > i10) {
                        return j15 != -9223372036854775807L ? new C6325g(j15, -2, j12 + j13) : C6325g.f20523d;
                    }
                    long jM8369d = AbstractC8025X4.m8369d(c20811m, i11, this.f1381Z);
                    if (jM8369d != -9223372036854775807L) {
                        long jM21381b = ((C20816r) this.f1382o0).m21381b(jM8369d);
                        if (jM21381b > j10) {
                            return j15 == -9223372036854775807L ? new C6325g(jM21381b, -1, j12) : new C6325g(-9223372036854775807L, 0, j12 + j14);
                        }
                        if (100000 + jM21381b > j10) {
                            return new C6325g(-9223372036854775807L, 0, j12 + ((long) i11));
                        }
                        j15 = jM21381b;
                        j14 = i11;
                    }
                    c20811m.m21344F(i12);
                    j13 = i12;
                }
                if (j15 != -9223372036854775807L) {
                }
        }
    }

    /* JADX INFO: renamed from: f */
    public C0421c m1051f() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        return new C0421c(((Long) this.f1383p0).longValue(), (String) this.f1382o0, this.f1381Z);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0188  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: g */
    public C11299Y m1052g() {
        short[] sArr;
        char c9;
        ?? r6;
        byte[] bArr;
        boolean z6;
        ?? r10;
        C11299Y c11299y;
        C11279D c11279d = (C11279D) this.f1383p0;
        if (c11279d != null) {
            throw c11279d.m12700a();
        }
        int i10 = this.f1381Z;
        Object[] objArrCopyOf = (Object[]) this.f1382o0;
        if (i10 == 0) {
            c11299y = C11299Y.f34197s0;
        } else {
            int i11 = 1;
            C11279D c11279d2 = null;
            ?? r11 = 0;
            C11279D c11279d3 = null;
            C11279D c11279d4 = null;
            if (i10 == 1) {
                Objects.requireNonNull(objArrCopyOf[0]);
                Objects.requireNonNull(objArrCopyOf[1]);
                c11299y = new C11299Y(1, null, objArrCopyOf);
            } else {
                AbstractC8020X.m8354d(i10, objArrCopyOf.length >> 1);
                int iM12703r = AbstractC11281F.m12703r(i10);
                if (i10 == 1) {
                    Objects.requireNonNull(objArrCopyOf[0]);
                    Objects.requireNonNull(objArrCopyOf[1]);
                } else {
                    int i12 = iM12703r - 1;
                    byte b = -1;
                    if (iM12703r <= 128) {
                        bArr = new byte[iM12703r];
                        Arrays.fill(bArr, (byte) -1);
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < i10) {
                            int i15 = i13 * 2;
                            int i16 = i14 * 2;
                            Object obj = objArrCopyOf[i15];
                            Objects.requireNonNull(obj);
                            Object obj2 = objArrCopyOf[i15 ^ i11];
                            Objects.requireNonNull(obj2);
                            int iM12736p = AbstractC11320m.m12736p(obj.hashCode());
                            while (true) {
                                int i17 = iM12736p & i12;
                                int i18 = bArr[i17] & 255;
                                if (i18 == 255) {
                                    bArr[i17] = (byte) i16;
                                    if (i14 < i13) {
                                        objArrCopyOf[i16] = obj;
                                        objArrCopyOf[i16 ^ 1] = obj2;
                                    }
                                    i14++;
                                    break;
                                }
                                if (obj.equals(objArrCopyOf[i18 == true ? 1 : 0])) {
                                    int i19 = ~i18;
                                    Object obj3 = objArrCopyOf[i19 == true ? 1 : 0];
                                    Objects.requireNonNull(obj3);
                                    C11279D c11279d5 = new C11279D(obj, obj2, obj3);
                                    objArrCopyOf[i19 == true ? 1 : 0] = obj2;
                                    c11279d3 = c11279d5;
                                    break;
                                }
                                iM12736p = i17 + 1;
                            }
                            i13++;
                            i11 = 1;
                        }
                        if (i14 == i10) {
                            r11 = bArr;
                        } else {
                            sArr = new Object[]{bArr, Integer.valueOf(i14), c11279d3};
                            r11 = sArr;
                        }
                    } else {
                        if (iM12703r <= 32768) {
                            sArr = new short[iM12703r];
                            Arrays.fill(sArr, (short) -1);
                            int i20 = 0;
                            for (int i21 = 0; i21 < i10; i21++) {
                                int i22 = i21 * 2;
                                int i23 = i20 * 2;
                                Object obj4 = objArrCopyOf[i22];
                                Objects.requireNonNull(obj4);
                                Object obj5 = objArrCopyOf[i22 ^ 1];
                                Objects.requireNonNull(obj5);
                                int iM12736p2 = AbstractC11320m.m12736p(obj4.hashCode());
                                while (true) {
                                    int i24 = iM12736p2 & i12;
                                    int i25 = sArr[i24] & 65535;
                                    if (i25 == 65535) {
                                        sArr[i24] = (short) i23;
                                        if (i20 < i21) {
                                            objArrCopyOf[i23] = obj4;
                                            objArrCopyOf[i23 ^ 1] = obj5;
                                        }
                                        i20++;
                                        break;
                                    }
                                    if (obj4.equals(objArrCopyOf[i25 == true ? 1 : 0])) {
                                        int i26 = ~i25;
                                        Object obj6 = objArrCopyOf[i26 == true ? 1 : 0];
                                        Objects.requireNonNull(obj6);
                                        c11279d4 = new C11279D(obj4, obj5, obj6);
                                        objArrCopyOf[i26 == true ? 1 : 0] = obj5;
                                        break;
                                    }
                                    iM12736p2 = i24 + 1;
                                }
                            }
                            if (i20 != i10) {
                                bArr = new Object[]{sArr, Integer.valueOf(i20), c11279d4};
                                r11 = bArr;
                            }
                        } else {
                            sArr = new int[iM12703r];
                            Arrays.fill((int[]) sArr, -1);
                            int i27 = 0;
                            int i28 = 0;
                            while (i27 < i10) {
                                int i29 = i27 * 2;
                                int i30 = i28 * 2;
                                Object obj7 = objArrCopyOf[i29];
                                Objects.requireNonNull(obj7);
                                Object obj8 = objArrCopyOf[i29 ^ 1];
                                Objects.requireNonNull(obj8);
                                int iM12736p3 = AbstractC11320m.m12736p(obj7.hashCode());
                                while (true) {
                                    int i31 = iM12736p3 & i12;
                                    ?? r15 = sArr[i31];
                                    if (r15 == b) {
                                        sArr[i31] = i30;
                                        if (i28 < i27) {
                                            objArrCopyOf[i30] = obj7;
                                            objArrCopyOf[i30 ^ 1] = obj8;
                                        }
                                        i28++;
                                        break;
                                    }
                                    if (obj7.equals(objArrCopyOf[r15])) {
                                        int i32 = r15 ^ 1;
                                        Object obj9 = objArrCopyOf[i32 == true ? 1 : 0];
                                        Objects.requireNonNull(obj9);
                                        c11279d2 = new C11279D(obj7, obj8, obj9);
                                        objArrCopyOf[i32 == true ? 1 : 0] = obj8;
                                        break;
                                    }
                                    iM12736p3 = i31 + 1;
                                    b = -1;
                                }
                                i27++;
                                b = -1;
                            }
                            if (i28 != i10) {
                                c9 = 2;
                                r6 = new Object[]{sArr, Integer.valueOf(i28), c11279d2};
                            }
                        }
                        r11 = sArr;
                    }
                    z6 = r6 instanceof Object[];
                    r10 = r6;
                    if (z6) {
                        Object[] objArr = (Object[]) r6;
                        this.f1383p0 = (C11279D) objArr[c9];
                        Object obj10 = objArr[0];
                        int iIntValue = ((Integer) objArr[1]).intValue();
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue * 2);
                        r10 = obj10;
                        i10 = iIntValue;
                    }
                    c11299y = new C11299Y(i10, r10, objArrCopyOf);
                }
                c9 = 2;
                r6 = r11;
                z6 = r6 instanceof Object[];
                r10 = r6;
                if (z6) {
                    Object[] objArr2 = (Object[]) r6;
                    this.f1383p0 = (C11279D) objArr2[c9];
                    Object obj11 = objArr2[0];
                    int iIntValue2 = ((Integer) objArr2[1]).intValue();
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue2 * 2);
                    r10 = obj11;
                    i10 = iIntValue2;
                }
                c11299y = new C11299Y(i10, r10, objArrCopyOf);
            }
        }
        C11279D c11279d6 = (C11279D) this.f1383p0;
        if (c11279d6 == null) {
            return c11299y;
        }
        throw c11279d6.m12700a();
    }

    /* JADX INFO: renamed from: h */
    public void m1053h(int i10) {
        if (i10 < 0 || i10 >= this.f1381Z) {
            StringBuilder sbM11057o = AbstractC10763a.m11057o(i10, "Index ", ", size ");
            sbM11057o.append(this.f1381Z);
            throw new IndexOutOfBoundsException(sbM11057o.toString());
        }
    }

    @Override // p372P3.InterfaceC6326h
    /* JADX INFO: renamed from: i */
    public void mo1054i() {
        switch (this.f1380Y) {
            case 4:
                break;
            default:
                byte[] bArr = AbstractC20817s.f66111f;
                C20811m c20811m = (C20811m) this.f1383p0;
                c20811m.getClass();
                c20811m.m21342D(bArr.length, bArr);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public void m1055k(C19729f c19729f) {
        ?? r6 = c19729f.f62460a;
        int size = r6.size();
        int i10 = 0;
        while (true) {
            C19742s c19742s = (C19742s) this.f1383p0;
            if (i10 >= size) {
                InterfaceC21098s interfaceC21098s = (InterfaceC21098s) this.f1382o0;
                if (interfaceC21098s == null) {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
                AbstractC19736m.m20688j(c19729f, interfaceC21098s.mo21517D(0L), new C18194a(this, 5, c19742s), false);
                if (this.f1381Z == 2) {
                    int size2 = r6.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        ((C19738o) r6.get(i11)).m20691a();
                    }
                    C0093v0 c0093v0 = c19729f.f62461b;
                    if (c0093v0 == null) {
                        return;
                    }
                    c0093v0.f403Z = !c19742s.f62509o0;
                    return;
                }
                return;
            }
            if (((C19738o) r6.get(i10)).m20692b()) {
                if (this.f1381Z == 2) {
                    InterfaceC21098s interfaceC21098s2 = (InterfaceC21098s) this.f1382o0;
                    if (interfaceC21098s2 == null) {
                        throw new IllegalStateException("layoutCoordinates not set");
                    }
                    AbstractC19736m.m20688j(c19729f, interfaceC21098s2.mo21517D(0L), new C19741r(c19742s, 0), true);
                }
                this.f1381Z = 3;
                return;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: l */
    public void m1056l(int i10, int i11) {
        if (i10 > 131072) {
            throw new IllegalArgumentException(AbstractC0010F.m19c(i10, "Requested item capacity ", " is larger than max supported: 131072!").toString());
        }
        int[] iArr = (int[]) this.f1382o0;
        if (iArr.length < i10) {
            int length = iArr.length;
            while (length < i10) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC17678l.m19307n(i11, 0, 12, (int[]) this.f1382o0, iArr2);
            this.f1382o0 = iArr2;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m1057m(int i10) {
        C17677k c17677k;
        int i11 = this.f1381Z;
        int i12 = i10 - i11;
        if (i12 < 0 || i12 >= 131072) {
            int iMax = Math.max(i10 - (((int[]) this.f1382o0).length / 2), 0);
            this.f1381Z = iMax;
            int i13 = iMax - i11;
            if (i13 >= 0) {
                int[] iArr = (int[]) this.f1382o0;
                if (i13 < iArr.length) {
                    AbstractC17678l.m19303j(0, i13, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.f1382o0;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i13), ((int[]) this.f1382o0).length, 0);
            } else {
                int i14 = -i13;
                int[] iArr3 = (int[]) this.f1382o0;
                if (iArr3.length + i14 < 131072) {
                    m1056l(iArr3.length + i14 + 1, i14);
                } else {
                    if (i14 < iArr3.length) {
                        AbstractC17678l.m19303j(i14, 0, iArr3.length - i14, iArr3, iArr3);
                    }
                    int[] iArr4 = (int[]) this.f1382o0;
                    Arrays.fill(iArr4, 0, Math.min(iArr4.length, i14), 0);
                }
            }
        } else {
            m1056l(i12 + 1, 0);
        }
        while (true) {
            c17677k = (C17677k) this.f1383p0;
            if (c17677k.isEmpty() || ((C18837i) c17677k.first()).f59956a >= this.f1381Z) {
                break;
            } else {
                c17677k.removeFirst();
            }
        }
        while (!c17677k.isEmpty() && ((C18837i) c17677k.last()).f59956a > this.f1381Z + ((int[]) this.f1382o0).length) {
            c17677k.removeLast();
        }
    }

    /* JADX INFO: renamed from: n */
    public long m1058n(C6330l c6330l) throws EOFException, InterruptedIOException {
        long j10;
        C6337s c6337s;
        C6339u c6339u;
        boolean zM6886b;
        int iM6943m;
        while (true) {
            long jMo3048e = c6330l.mo3048e();
            j10 = c6330l.f20547o0;
            long j11 = j10 - 6;
            c6337s = (C6337s) this.f1383p0;
            c6339u = (C6339u) this.f1382o0;
            if (jMo3048e >= j11) {
                break;
            }
            long jMo3048e2 = c6330l.mo3048e();
            byte[] bArr = new byte[2];
            c6330l.mo3047d(bArr, 0, 2, false);
            int i10 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i11 = this.f1381Z;
            if (i10 != i11) {
                c6330l.f20550r0 = 0;
                c6330l.m6941g((int) (jMo3048e2 - c6330l.f20548p0), false);
                zM6886b = false;
            } else {
                C20811m c20811m = new C20811m(16);
                System.arraycopy(bArr, 0, c20811m.f66092a, 0, 2);
                byte[] bArr2 = c20811m.f66092a;
                int i12 = 0;
                for (int i13 = 2; i12 < 14 && (iM6943m = c6330l.m6943m(bArr2, i13 + i12, 14 - i12)) != -1; i13 = 2) {
                    i12 += iM6943m;
                }
                c20811m.m21343E(i12);
                c6330l.f20550r0 = 0;
                c6330l.m6941g((int) (jMo3048e2 - c6330l.f20548p0), false);
                zM6886b = AbstractC6320b.m6886b(c20811m, c6339u, i11, c6337s);
            }
            if (zM6886b) {
                break;
            }
            c6330l.m6941g(1, false);
        }
        if (c6330l.mo3048e() < j10 - 6) {
            return c6337s.f20561a;
        }
        c6330l.m6941g((int) (j10 - c6330l.mo3048e()), false);
        return c6339u.f20574j;
    }

    /* JADX INFO: renamed from: o */
    public int m1059o(int i10, int i11) {
        do {
            i10--;
            if (-1 >= i10) {
                return -1;
            }
        } while (!m1049d(i10, i11));
        return i10;
    }

    /* JADX INFO: renamed from: p */
    public void m1060p(int i10, int i11, InterfaceC1436k interfaceC1436k) {
        m1053h(i10);
        m1053h(i11);
        if (i11 < i10) {
            throw new IllegalArgumentException(("toIndex (" + i11 + ") should be not smaller than fromIndex (" + i10 + ')').toString());
        }
        C6546d c6546d = (C6546d) this.f1382o0;
        int iM19925f = AbstractC18551I.m19925f(i10, c6546d);
        int i12 = ((C18580g) c6546d.f21182Y[iM19925f]).f59182a;
        while (i12 <= i11) {
            C18580g c18580g = (C18580g) c6546d.f21182Y[iM19925f];
            interfaceC1436k.invoke(c18580g);
            i12 += c18580g.f59183b;
            iM19925f++;
        }
    }

    /* JADX INFO: renamed from: q */
    public Object m1061q(int i10) {
        SparseArray sparseArray;
        if (this.f1381Z == -1) {
            this.f1381Z = 0;
        }
        while (true) {
            int i11 = this.f1381Z;
            sparseArray = (SparseArray) this.f1382o0;
            if (i11 <= 0 || i10 >= sparseArray.keyAt(i11)) {
                break;
            }
            this.f1381Z--;
        }
        while (this.f1381Z < sparseArray.size() - 1 && i10 >= sparseArray.keyAt(this.f1381Z + 1)) {
            this.f1381Z++;
        }
        return sparseArray.valueAt(this.f1381Z);
    }

    /* JADX INFO: renamed from: r */
    public C18580g m1062r(int i10) {
        m1053h(i10);
        C18580g c18580g = (C18580g) this.f1383p0;
        if (c18580g != null) {
            int i11 = c18580g.f59183b;
            int i12 = c18580g.f59182a;
            if (i10 < i11 + i12 && i12 <= i10) {
                return c18580g;
            }
        }
        C6546d c6546d = (C6546d) this.f1382o0;
        C18580g c18580g2 = (C18580g) c6546d.f21182Y[AbstractC18551I.m19925f(i10, c6546d)];
        this.f1383p0 = c18580g2;
        return c18580g2;
    }

    /* JADX INFO: renamed from: s */
    public int[] m1063s(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        C17677k c17677k = (C17677k) this.f1383p0;
        C18837i c18837i = (C18837i) AbstractC17680n.m19344T(AbstractC17681o.m19378g(c17677k, 0, c17677k.mo7371f(), new C18838j(0, numValueOf)), c17677k);
        if (c18837i != null) {
            return c18837i.f59957b;
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public Object m1064t(int i10) {
        int i11 = i10 - this.f1381Z;
        if (i11 >= 0) {
            Object[] objArr = (Object[]) this.f1383p0;
            AbstractC16544l.m18094g(objArr, "<this>");
            if (i11 <= objArr.length - 1) {
                return objArr[i11];
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f1380Y) {
            case 12:
                return m1066v();
            case 19:
                StringBuilder sb2 = new StringBuilder();
                if (((EnumC17357x) this.f1383p0) == EnumC17357x.HTTP_1_0) {
                    sb2.append("HTTP/1.0");
                } else {
                    sb2.append("HTTP/1.1");
                }
                sb2.append(' ');
                sb2.append(this.f1381Z);
                sb2.append(' ');
                sb2.append((String) this.f1382o0);
                String string = sb2.toString();
                AbstractC16544l.m18093f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public int m1065u(int i10) {
        int i11 = this.f1381Z;
        if (i10 < i11) {
            return -1;
        }
        int[] iArr = (int[]) this.f1382o0;
        if (i10 >= iArr.length + i11) {
            return -1;
        }
        return iArr[i10 - i11] - 1;
    }

    /* JADX INFO: renamed from: v */
    public String m1066v() {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = this.f1381Z + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = ((Object[]) this.f1382o0)[i11];
            if (obj instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
                if (!AbstractC16544l.m18089b(serialDescriptor.getKind(), C10110k.f29936c)) {
                    int i12 = ((int[]) this.f1383p0)[i11];
                    if (i12 >= 0) {
                        sb2.append(Separators.DOT);
                        sb2.append(serialDescriptor.mo10683f(i12));
                    }
                } else if (((int[]) this.f1383p0)[i11] != -1) {
                    sb2.append("[");
                    sb2.append(((int[]) this.f1383p0)[i11]);
                    sb2.append("]");
                }
            } else if (obj != C11829s.f35845a) {
                sb2.append("['");
                sb2.append(obj);
                sb2.append("']");
            }
        }
        String string = sb2.toString();
        AbstractC16544l.m18093f(string, "toString(...)");
        return string;
    }

    /* JADX INFO: renamed from: w */
    public int m1067w() {
        int i10 = this.f1381Z;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }

    /* JADX INFO: renamed from: x */
    public boolean m1068x() {
        ColorStateList colorStateList;
        return ((Shader) this.f1382o0) == null && (colorStateList = (ColorStateList) this.f1383p0) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: y */
    public void m1069y(AttributeSet attributeSet, int i10) {
        int resourceId;
        ImageView imageView = (ImageView) this.f1382o0;
        Context context = imageView.getContext();
        int[] iArr = AbstractC17123a.f54737f;
        C11242m c11242mM12599G = C11242m.m12599G(context, attributeSet, iArr, i10);
        AbstractC0738T.m1583k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) c11242mM12599G.f34019Z, i10);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) c11242mM12599G.f34019Z;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC9106B3.m9636b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC19357i0.m20462a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(c11242mM12599G.m12600A(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(AbstractC19357i0.m20463b(typedArray.getInt(3, -1), null));
            }
        } finally {
            c11242mM12599G.m12606H();
        }
    }

    public C0420b(int i10, byte b) {
        this.f1380Y = i10;
        switch (i10) {
            case 15:
                this.f1382o0 = new C6546d(new C18580g[16]);
                break;
            case 18:
                this.f1382o0 = new int[16];
                this.f1383p0 = new C17677k();
                break;
            default:
                this.f1382o0 = new Object[8];
                this.f1381Z = 0;
                break;
        }
    }

    public C0420b(int i10, String str, ArrayList arrayList) {
        this.f1380Y = 14;
        this.f1381Z = i10;
        this.f1382o0 = str;
        this.f1383p0 = arrayList;
    }

    public C0420b(C0017I0 c0017i0, int i10) {
        this.f1380Y = 7;
        this.f1383p0 = new C19465d();
        this.f1382o0 = c0017i0;
        C9191P4.m9753b();
        this.f1381Z = i10;
    }

    public C0420b(C10252z0 c10252z0, int i10) {
        this.f1380Y = 6;
        this.f1383p0 = new C19465d();
        this.f1382o0 = c10252z0;
        C7863C6.m8140b();
        this.f1381Z = i10;
    }

    public C0420b(C10252z0 c10252z0, int i10, byte b) {
        this.f1380Y = 9;
        this.f1383p0 = new C19465d();
        this.f1382o0 = c10252z0;
        C9805S4.m10429b();
        this.f1381Z = i10;
    }

    public C0420b(String str, String[] strArr) {
        String string;
        int i10 = 2;
        this.f1380Y = 24;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(Separators.COMMA);
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            string = sb2.toString();
        }
        this.f1383p0 = string;
        this.f1382o0 = str;
        Object[] objArr = {str, 23};
        if (str.length() <= 23) {
            while (i10 <= 7 && !Log.isLoggable((String) this.f1382o0, i10)) {
                i10++;
            }
            this.f1381Z = i10;
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public C0420b(C2925c c2925c, InterfaceC1436k onAudioData) {
        this.f1380Y = 3;
        AbstractC16544l.m18094g(onAudioData, "onAudioData");
        this.f1382o0 = c2925c;
        this.f1383p0 = onAudioData;
    }

    public C0420b(EnumC17357x enumC17357x, int i10, String str) {
        this.f1380Y = 19;
        this.f1383p0 = enumC17357x;
        this.f1381Z = i10;
        this.f1382o0 = str;
    }

    public C0420b(C19742s c19742s) {
        this.f1380Y = 21;
        this.f1383p0 = c19742s;
        this.f1381Z = 1;
    }

    public C0420b(ImageView imageView) {
        this.f1380Y = 20;
        this.f1381Z = 0;
        this.f1382o0 = imageView;
    }

    public C0420b(C2385o c2385o) {
        this.f1380Y = 2;
        this.f1382o0 = new SparseArray();
        this.f1383p0 = c2385o;
        this.f1381Z = -1;
    }

    public C0420b(C3508g c3508g, AbstractC18551I abstractC18551I) {
        this.f1380Y = 16;
        C0420b c0420bMo19801k = abstractC18551I.mo19801k();
        int i10 = c3508g.f10591Y;
        if (i10 >= 0) {
            int iMin = Math.min(c3508g.f10592Z, c0420bMo19801k.f1381Z - 1);
            if (iMin < i10) {
                C12948A c12948a = AbstractC12955H.f41148a;
                AbstractC16544l.m18092e(c12948a, "null cannot be cast to non-null type androidx.collection.ObjectIntMap<K of androidx.collection.ObjectIntMapKt.emptyObjectIntMap>");
                this.f1382o0 = c12948a;
                this.f1383p0 = new Object[0];
                this.f1381Z = 0;
                return;
            }
            int i11 = (iMin - i10) + 1;
            this.f1383p0 = new Object[i11];
            this.f1381Z = i10;
            C12948A c12948a2 = new C12948A(i11);
            c0420bMo19801k.m1060p(i10, iMin, new C13487e(i10, iMin, c12948a2, this));
            this.f1382o0 = c12948a2;
            return;
        }
        throw new IllegalStateException("negative nearestRange.first");
    }

    public C0420b(Shader shader, ColorStateList colorStateList, int i10) {
        this.f1380Y = 17;
        this.f1382o0 = shader;
        this.f1383p0 = colorStateList;
        this.f1381Z = i10;
    }

    public C0420b(C6339u c6339u, int i10) {
        this.f1380Y = 4;
        this.f1382o0 = c6339u;
        this.f1381Z = i10;
        this.f1383p0 = new C6337s();
    }

    public C0420b(int i10, C20816r c20816r) {
        this.f1380Y = 22;
        this.f1381Z = i10;
        this.f1382o0 = c20816r;
        this.f1383p0 = new C20811m();
    }

    public C0420b(C18655i c18655i) {
        this.f1380Y = 10;
        this.f1383p0 = c18655i;
        this.f1382o0 = C10530c.f31239Y;
        this.f1381Z = Integer.MAX_VALUE;
    }

    public C0420b(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List listUnmodifiableList;
        this.f1380Y = 23;
        this.f1381Z = i11;
        if (arrayList == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f1382o0 = listUnmodifiableList;
        this.f1383p0 = bArr;
    }

    public C0420b(InterfaceC0161D1 interfaceC0161D1) {
        this.f1380Y = 1;
        this.f1382o0 = interfaceC0161D1;
    }

    public C0420b(int i10) {
        this.f1380Y = 11;
        this.f1382o0 = new Object[i10 * 2];
        this.f1381Z = 0;
    }
}
