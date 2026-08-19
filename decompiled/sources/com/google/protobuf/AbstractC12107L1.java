package com.google.protobuf;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Parcel;
import androidx.compose.p650ui.focus.C10863b;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import fo.C13711h;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p021Aj.C0537v;
import p025An.C0644w;
import p225Im.InterfaceC3759g;
import p349O0.C6021p;
import p492U1.C7543h;
import p523V9.AbstractC8231x5;
import p571X9.AbstractC9101A4;
import p736f0.AbstractC13508z;
import p736f0.C13467E;
import p736f0.C13468F;
import p736f0.C13485c;
import p736f0.C13492j;
import p736f0.C13493k;
import p737f1.InterfaceC13515g;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13746W;
import p758g0.InterfaceC13766i;
import p759g1.AbstractC13799a;
import p759g1.C13801c;
import p759g1.C13802d;
import p774h1.C14353i;
import p774h1.C14365u;
import p774h1.InterfaceC14333K;
import p884m3.C17150i;

/* JADX INFO: renamed from: com.google.protobuf.L1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC12107L1 {
    /* JADX INFO: renamed from: A */
    public static /* synthetic */ String m13809A(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m13810a(InterfaceC13766i interfaceC13766i, long j10) {
        return j10 >= interfaceC13766i.mo15230e();
    }

    /* JADX INFO: renamed from: b */
    public static void m13811b(InterfaceC14333K interfaceC14333K, C13801c c13801c) {
        Path.Direction direction;
        C14353i c14353i = (C14353i) interfaceC14333K;
        float f10 = c13801c.f43586a;
        if (!Float.isNaN(f10)) {
            float f11 = c13801c.f43587b;
            if (!Float.isNaN(f11)) {
                float f12 = c13801c.f43588c;
                if (!Float.isNaN(f12)) {
                    float f13 = c13801c.f43589d;
                    if (!Float.isNaN(f13)) {
                        if (c14353i.f45040b == null) {
                            c14353i.f45040b = new RectF();
                        }
                        RectF rectF = c14353i.f45040b;
                        AbstractC16544l.m18091d(rectF);
                        rectF.set(f10, f11, f12, f13);
                        RectF rectF2 = c14353i.f45040b;
                        AbstractC16544l.m18091d(rectF2);
                        int iM24h = AbstractC0010F.m24h(1);
                        if (iM24h == 0) {
                            direction = Path.Direction.CCW;
                        } else {
                            if (iM24h != 1) {
                                throw new C0644w();
                            }
                            direction = Path.Direction.CW;
                        }
                        c14353i.f45039a.addRect(rectF2, direction);
                        return;
                    }
                }
            }
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }

    /* JADX INFO: renamed from: c */
    public static void m13812c(InterfaceC14333K interfaceC14333K, C13802d c13802d) {
        Path.Direction direction;
        C14353i c14353i = (C14353i) interfaceC14333K;
        if (c14353i.f45040b == null) {
            c14353i.f45040b = new RectF();
        }
        RectF rectF = c14353i.f45040b;
        AbstractC16544l.m18091d(rectF);
        float f10 = c13802d.f43593d;
        rectF.set(c13802d.f43590a, c13802d.f43591b, c13802d.f43592c, f10);
        if (c14353i.f45041c == null) {
            c14353i.f45041c = new float[8];
        }
        float[] fArr = c14353i.f45041c;
        AbstractC16544l.m18091d(fArr);
        long j10 = c13802d.f43594e;
        fArr[0] = AbstractC13799a.m15297b(j10);
        fArr[1] = AbstractC13799a.m15298c(j10);
        long j11 = c13802d.f43595f;
        fArr[2] = AbstractC13799a.m15297b(j11);
        fArr[3] = AbstractC13799a.m15298c(j11);
        long j12 = c13802d.f43596g;
        fArr[4] = AbstractC13799a.m15297b(j12);
        fArr[5] = AbstractC13799a.m15298c(j12);
        long j13 = c13802d.f43597h;
        fArr[6] = AbstractC13799a.m15297b(j13);
        fArr[7] = AbstractC13799a.m15298c(j13);
        RectF rectF2 = c14353i.f45040b;
        AbstractC16544l.m18091d(rectF2);
        float[] fArr2 = c14353i.f45041c;
        AbstractC16544l.m18091d(fArr2);
        int iM24h = AbstractC0010F.m24h(1);
        if (iM24h == 0) {
            direction = Path.Direction.CCW;
        } else {
            if (iM24h != 1) {
                throw new C0644w();
            }
            direction = Path.Direction.CW;
        }
        c14353i.f45039a.addRoundRect(rectF2, fArr2, direction);
    }

    /* JADX INFO: renamed from: d */
    public static void m13813d(InterfaceC13515g interfaceC13515g) {
        ((C10863b) interfaceC13515g).m11301a(8, false, true);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ String m13815f(int i10) {
        switch (i10) {
            case 1:
                return "user_app_launch";
            case 2:
                return "inactivity_timeout";
            case 3:
                return "max_duration";
            case 4:
                return "background_launch";
            case 5:
                return "prewarm";
            case 6:
                return "from_non_interactive_session";
            case 7:
                return "explicit_stop";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String m13816g(int i10) {
        if (i10 == 1) {
            return "NOT_TRACKED";
        }
        if (i10 == 2) {
            return "TRACKED";
        }
        if (i10 == 3) {
            return "EXPIRED";
        }
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ String m13817h(int i10) {
        if (i10 == 1) {
            return "NONE";
        }
        if (i10 == 2) {
            return "FOREGROUND";
        }
        if (i10 == 3) {
            return "BACKGROUND";
        }
        if (i10 == 4) {
            return "APPLICATION_LAUNCH";
        }
        throw null;
    }

    /* JADX INFO: renamed from: i */
    public static float m13818i(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    /* JADX INFO: renamed from: j */
    public static int m13819j(float f10, int i10, int i11) {
        return (Float.floatToIntBits(f10) + i10) * i11;
    }

    /* JADX INFO: renamed from: k */
    public static int m13820k(int i10, int i11, int i12) {
        return (AbstractC0010F.m24h(i10) + i11) * i12;
    }

    /* JADX INFO: renamed from: l */
    public static int m13821l(C17150i c17150i, int i10, int i11) {
        return (c17150i.hashCode() + i10) * i11;
    }

    /* JADX INFO: renamed from: m */
    public static ClassCastException m13822m(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    /* JADX INFO: renamed from: n */
    public static String m13823n(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(str);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public static String m13824o(Object obj, String str, String str2) {
        return str + obj + str2;
    }

    /* JADX INFO: renamed from: p */
    public static String m13825p(StringBuilder sb2, float f10, char c9) {
        sb2.append(f10);
        sb2.append(c9);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: q */
    public static String m13826q(StringBuilder sb2, int i10, char c9) {
        sb2.append(i10);
        sb2.append(c9);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: r */
    public static String m13827r(StringBuilder sb2, Map map, char c9) {
        sb2.append(map);
        sb2.append(c9);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: s */
    public static void m13828s(long j10, String str, StringBuilder sb2) {
        sb2.append((Object) C14365u.m15781i(j10));
        sb2.append(str);
    }

    /* JADX INFO: renamed from: t */
    public static void m13829t(Parcel parcel, int i10, Boolean bool) {
        parcel.writeInt(i10);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    /* JADX INFO: renamed from: u */
    public static void m13830u(C13711h c13711h, long j10) {
        c13711h.m15196m().mo15719r();
        c13711h.m15189L(j10);
    }

    /* JADX INFO: renamed from: v */
    public static void m13831v(Object[] objArr, int i10, String str, LogIntent logIntent) {
        LogWrapperKt.log(logIntent, String.format(str, Arrays.copyOf(objArr, i10)));
    }

    /* JADX INFO: renamed from: w */
    public static boolean m13832w(C6021p c6021p, boolean z6, int i10, InterfaceC3759g interfaceC3759g) {
        c6021p.m6553p(z6);
        c6021p.m6524S(i10);
        return c6021p.m6542f(interfaceC3759g);
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ String m13833x(int i10) {
        switch (i10) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    /* JADX INFO: renamed from: y */
    public static C13467E m13834y(C13493k c13493k, int i10) {
        int i11 = 22;
        int i12 = 2;
        int i13 = 21;
        int i14 = 3;
        int i15 = 1;
        Object obj = AbstractC13795w0.f43580a;
        C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 0.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 3);
        C13485c c13485c = C13485c.f42682p0;
        if (c13493k.m15007f(i10)) {
            return AbstractC13508z.m15021m(new C0537v(i13, new C13492j(c13485c, c13493k, 0)), c13746wM15254s);
        }
        if (c13493k.m15008g(i10)) {
            return AbstractC13508z.m15021m(new C0537v(i13, new C13492j(c13485c, c13493k, i15)), c13746wM15254s);
        }
        if (AbstractC8231x5.m8867c(i10, 2)) {
            return AbstractC13508z.m15021m(new C0537v(i11, new C13492j(c13485c, c13493k, i12)), c13746wM15254s);
        }
        return AbstractC8231x5.m8867c(i10, 3) ? AbstractC13508z.m15021m(new C0537v(i11, new C13492j(c13485c, c13493k, i14)), c13746wM15254s) : C13467E.f42621b;
    }

    /* JADX INFO: renamed from: z */
    public static C13468F m13835z(C13493k c13493k, int i10) {
        int i11 = 24;
        int i12 = 23;
        Object obj = AbstractC13795w0.f43580a;
        C13746W c13746wM15254s = AbstractC13758e.m15254s(0.0f, 0.0f, new C7543h(AbstractC9101A4.m9631a(1, 1)), 3);
        C13485c c13485c = C13485c.f42683q0;
        if (c13493k.m15007f(i10)) {
            return AbstractC13508z.m15023o(new C0537v(i12, new C13492j(c13493k, c13485c, 4)), c13746wM15254s);
        }
        if (c13493k.m15008g(i10)) {
            return AbstractC13508z.m15023o(new C0537v(i12, new C13492j(c13493k, c13485c, 5)), c13746wM15254s);
        }
        if (AbstractC8231x5.m8867c(i10, 2)) {
            return AbstractC13508z.m15023o(new C0537v(i11, new C13492j(c13493k, c13485c, 6)), c13746wM15254s);
        }
        return AbstractC8231x5.m8867c(i10, 3) ? AbstractC13508z.m15023o(new C0537v(i11, new C13492j(c13493k, c13485c, 7)), c13746wM15254s) : C13468F.f42623b;
    }
}
