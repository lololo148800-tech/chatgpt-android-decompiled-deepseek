package p523V9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.RemoteViews;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC15256t;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16525B;
import mm.C17296C;
import p025An.C0644w;
import p1008s8.C19495x;
import p1113xn.AbstractC21328v;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p339Nf.C5734p;
import p544W9.AbstractC8497J;
import p637a3.EnumC10500q;
import p637a3.InterfaceC10497n;
import p656b3.C11223b;
import p656b3.InterfaceC11222a;
import p672c3.AbstractC11614k0;
import p672c3.C11571E0;
import p672c3.C11600d0;
import p672c3.C11629s;
import p695d3.AbstractC13002g;
import p695d3.C12998c;
import p776h3.C14398l;
import p776h3.C14399m;
import p776h3.C14400n;
import p776h3.C14404r;
import p884m3.AbstractC17148g;
import p884m3.C17144c;
import p884m3.C17145d;
import p884m3.C17146e;
import p884m3.C17147f;
import p909nm.AbstractC17681o;

/* JADX INFO: renamed from: V9.a4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8046a4 {
    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:103:0x021d  */
    /* JADX WARN: Code duplicated, block: B:104:0x021f  */
    /* JADX WARN: Code duplicated, block: B:108:0x0224  */
    /* JADX WARN: Code duplicated, block: B:112:0x024f  */
    /* JADX WARN: Code duplicated, block: B:114:0x0267 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0269  */
    /* JADX WARN: Code duplicated, block: B:117:0x026c  */
    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0275  */
    /* JADX WARN: Code duplicated, block: B:123:0x027a  */
    /* JADX WARN: Code duplicated, block: B:81:0x017b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0181  */
    /* JADX WARN: Code duplicated, block: B:84:0x0186  */
    /* JADX WARN: Code duplicated, block: B:87:0x018b A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:85:0x0187, B:87:0x018b, B:90:0x0197), top: B:132:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0197 A[Catch: all -> 0x0195, TRY_LEAVE, TryCatch #0 {all -> 0x0195, blocks: (B:85:0x0187, B:87:0x018b, B:90:0x0197), top: B:132:0x0187 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c6  */
    /* JADX INFO: renamed from: a */
    public static final void m8422a(C11571E0 c11571e0, RemoteViews remoteViews, InterfaceC10497n interfaceC10497n, C11600d0 c11600d0) {
        RemoteViews remoteViews2;
        int i10;
        C11571E0 c11571e1;
        C11223b c11223b;
        AbstractC17148g abstractC17148g;
        C14400n c14400n;
        int iOrdinal;
        float fM9160b;
        float fM9160b2;
        boolean z6;
        float f10;
        InterfaceC11222a interfaceC11222a;
        Integer num;
        int iIntValue;
        C16525B c16525b = new C16525B();
        C16525B c16525b2 = new C16525B();
        C16525B c16525b3 = new C16525B();
        C16525B c16525b4 = new C16525B();
        C16525B c16525b5 = new C16525B();
        c16525b5.f51262Y = EnumC10500q.f31100Y;
        C16525B c16525b6 = new C16525B();
        C16525B c16525b7 = new C16525B();
        C16525B c16525b8 = new C16525B();
        C16525B c16525b9 = new C16525B();
        C17296C c17296c = C17296C.f55119a;
        Context context = c11571e0.f34973a;
        interfaceC10497n.mo10954j(c17296c, new C5734p(c16525b6, c16525b, c16525b2, context, remoteViews, c11600d0, c16525b3, c16525b5, c16525b4, c11571e0, c16525b8, c16525b7, c16525b9));
        C14404r c14404r = (C14404r) c16525b.f51262Y;
        C14398l c14398l = (C14398l) c16525b2.f51262Y;
        Object obj = AbstractC11614k0.f35156a;
        int i11 = c11600d0.f35092b;
        int i12 = 0;
        int i13 = c11600d0.f35091a;
        if (i11 != -1) {
            remoteViews2 = remoteViews;
            if (Build.VERSION.SDK_INT >= 31) {
                throw new IllegalStateException("There is currently no valid use case where a complex view is used on Android S");
            }
            AbstractC17148g abstractC17148g2 = c14404r != null ? c14404r.f45151a : null;
            AbstractC17148g abstractC17148g3 = c14398l != null ? c14398l.f45139a : null;
            if (m8427f(abstractC17148g2) || m8427f(abstractC17148g3)) {
                boolean z10 = (abstractC17148g2 instanceof C17146e) || (abstractC17148g2 instanceof C17145d);
                boolean z11 = (abstractC17148g3 instanceof C17146e) || (abstractC17148g3 instanceof C17145d);
                if (z10 && z11) {
                    i10 = R.layout.size_match_match;
                } else if (z10) {
                    i10 = R.layout.size_match_wrap;
                } else {
                    i10 = z11 ? R.layout.size_wrap_match : R.layout.size_wrap_wrap;
                }
                c11571e1 = c11571e0;
                int iM8578a = AbstractC8102h4.m8578a(remoteViews2, c11571e1, R.id.sizeViewStub, i10, null);
                boolean z12 = abstractC17148g2 instanceof C17144c;
                C17147f c17147f = C17147f.f54817a;
                C17146e c17146e = C17146e.f54816a;
                C17145d c17145d = C17145d.f54815a;
                Context context2 = c11571e1.f34973a;
                if (z12) {
                    remoteViews2.setInt(iM8578a, "setWidth", (int) TypedValue.applyDimension(1, ((C17144c) abstractC17148g2).f54814a, context2.getResources().getDisplayMetrics()));
                } else {
                    if (!((AbstractC16544l.m18089b(abstractC17148g2, c17145d) ? true : AbstractC16544l.m18089b(abstractC17148g2, c17146e) ? true : AbstractC16544l.m18089b(abstractC17148g2, c17147f)) || abstractC17148g2 == null)) {
                        throw new C0644w();
                    }
                }
                if (abstractC17148g3 instanceof C17144c) {
                    remoteViews2.setInt(iM8578a, "setHeight", (int) TypedValue.applyDimension(1, ((C17144c) abstractC17148g3).f54814a, context2.getResources().getDisplayMetrics()));
                } else {
                    if (!((AbstractC16544l.m18089b(abstractC17148g3, c17145d) ? true : AbstractC16544l.m18089b(abstractC17148g3, c17146e) ? true : AbstractC16544l.m18089b(abstractC17148g3, c17147f)) || abstractC17148g3 == null)) {
                        throw new C0644w();
                    }
                }
            }
            c11223b = (C11223b) c16525b6.f51262Y;
            if (c11223b != null) {
                interfaceC11222a = c11223b.f33979a;
                num = c11571e1.f34986n;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = i13;
                }
                try {
                    if (c11571e1.f34978f) {
                        remoteViews2.setOnClickFillInIntent(iIntValue, AbstractC13002g.m14734d(interfaceC11222a, c11571e1, iIntValue, C12998c.f41250Z));
                    } else {
                        remoteViews2.setOnClickPendingIntent(iIntValue, AbstractC13002g.m14735e(interfaceC11222a, c11571e1, iIntValue, C12998c.f41251o0, 67108864));
                    }
                } catch (Throwable th2) {
                    AbstractC15256t.m16466d("GlanceAppWidget", "Unrecognized Action: " + interfaceC11222a, th2);
                }
            }
            abstractC17148g = (AbstractC17148g) c16525b4.f51262Y;
            if (abstractC17148g != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C11629s.f35245a.m12999a(remoteViews2, i13, abstractC17148g);
                } else {
                    AbstractC15256t.m16482t("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
                }
            }
            c14400n = (C14400n) c16525b3.f51262Y;
            if (c14400n != null) {
                Resources resources = context.getResources();
                C14399m c14399m = c14400n.f45142a;
                float fM9160b3 = AbstractC8497J.m9160b(c14399m.f45141b, resources) + c14399m.f45140a;
                C14399m c14399m2 = c14400n.f45143b;
                fM9160b = AbstractC8497J.m9160b(c14399m2.f45141b, resources) + c14399m2.f45140a;
                C14399m c14399m3 = c14400n.f45144c;
                float fM9160b4 = AbstractC8497J.m9160b(c14399m3.f45141b, resources) + c14399m3.f45140a;
                C14399m c14399m4 = c14400n.f45145d;
                float fM9160b5 = AbstractC8497J.m9160b(c14399m4.f45141b, resources) + c14399m4.f45140a;
                C14399m c14399m5 = c14400n.f45146e;
                fM9160b2 = AbstractC8497J.m9160b(c14399m5.f45141b, resources) + c14399m5.f45140a;
                C14399m c14399m6 = c14400n.f45147f;
                float fM9160b6 = AbstractC8497J.m9160b(c14399m6.f45141b, resources) + c14399m6.f45140a;
                z6 = c11571e1.f34975c;
                if (z6) {
                    f10 = fM9160b2;
                } else {
                    f10 = fM9160b;
                }
                float f11 = fM9160b3 + f10;
                if (!z6) {
                    fM9160b = fM9160b2;
                }
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                remoteViews.setViewPadding(c11600d0.f35091a, (int) TypedValue.applyDimension(1, f11, displayMetrics), (int) TypedValue.applyDimension(1, fM9160b4, displayMetrics), (int) TypedValue.applyDimension(1, fM9160b5 + fM9160b, displayMetrics), (int) TypedValue.applyDimension(1, fM9160b6, displayMetrics));
            }
            if (c16525b8.f51262Y == null) {
                throw new ClassCastException();
            }
            iOrdinal = ((EnumC10500q) c16525b5.f51262Y).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    i12 = 4;
                } else {
                    if (iOrdinal == 2) {
                        throw new C0644w();
                    }
                    i12 = 8;
                }
            }
            remoteViews2.setViewVisibility(i13, i12);
        }
        remoteViews2 = remoteViews;
        if (c14404r != null) {
            m8424c(remoteViews2, c14404r, i13);
        }
        if (c14398l != null) {
            m8423b(remoteViews2, c14398l, i13);
        }
        c11571e1 = c11571e0;
        c11223b = (C11223b) c16525b6.f51262Y;
        if (c11223b != null) {
            interfaceC11222a = c11223b.f33979a;
            num = c11571e1.f34986n;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = i13;
            }
            if (c11571e1.f34978f) {
                remoteViews2.setOnClickFillInIntent(iIntValue, AbstractC13002g.m14734d(interfaceC11222a, c11571e1, iIntValue, C12998c.f41250Z));
            } else {
                remoteViews2.setOnClickPendingIntent(iIntValue, AbstractC13002g.m14735e(interfaceC11222a, c11571e1, iIntValue, C12998c.f41251o0, 67108864));
            }
        }
        abstractC17148g = (AbstractC17148g) c16525b4.f51262Y;
        if (abstractC17148g != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                C11629s.f35245a.m12999a(remoteViews2, i13, abstractC17148g);
            } else {
                AbstractC15256t.m16482t("GlanceAppWidget", "Cannot set the rounded corner of views before Api 31.");
            }
        }
        c14400n = (C14400n) c16525b3.f51262Y;
        if (c14400n != null) {
            Resources resources2 = context.getResources();
            C14399m c14399m7 = c14400n.f45142a;
            float fM9160b7 = AbstractC8497J.m9160b(c14399m7.f45141b, resources2) + c14399m7.f45140a;
            C14399m c14399m8 = c14400n.f45143b;
            fM9160b = AbstractC8497J.m9160b(c14399m8.f45141b, resources2) + c14399m8.f45140a;
            C14399m c14399m9 = c14400n.f45144c;
            float fM9160b8 = AbstractC8497J.m9160b(c14399m9.f45141b, resources2) + c14399m9.f45140a;
            C14399m c14399m10 = c14400n.f45145d;
            float fM9160b9 = AbstractC8497J.m9160b(c14399m10.f45141b, resources2) + c14399m10.f45140a;
            C14399m c14399m11 = c14400n.f45146e;
            fM9160b2 = AbstractC8497J.m9160b(c14399m11.f45141b, resources2) + c14399m11.f45140a;
            C14399m c14399m12 = c14400n.f45147f;
            float fM9160b10 = AbstractC8497J.m9160b(c14399m12.f45141b, resources2) + c14399m12.f45140a;
            z6 = c11571e1.f34975c;
            if (z6) {
                f10 = fM9160b2;
            } else {
                f10 = fM9160b;
            }
            float f12 = fM9160b7 + f10;
            if (!z6) {
                fM9160b = fM9160b2;
            }
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            remoteViews.setViewPadding(c11600d0.f35091a, (int) TypedValue.applyDimension(1, f12, displayMetrics2), (int) TypedValue.applyDimension(1, fM9160b8, displayMetrics2), (int) TypedValue.applyDimension(1, fM9160b9 + fM9160b, displayMetrics2), (int) TypedValue.applyDimension(1, fM9160b10, displayMetrics2));
        }
        if (c16525b8.f51262Y == null) {
            throw new ClassCastException();
        }
        iOrdinal = ((EnumC10500q) c16525b5.f51262Y).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                i12 = 4;
            } else {
                if (iOrdinal == 2) {
                    throw new C0644w();
                }
                i12 = 8;
            }
        }
        remoteViews2.setViewVisibility(i13, i12);
    }

    /* JADX INFO: renamed from: b */
    public static final void m8423b(RemoteViews remoteViews, C14398l c14398l, int i10) {
        AbstractC17148g abstractC17148g = c14398l.f45139a;
        int i11 = Build.VERSION.SDK_INT;
        C17145d c17145d = C17145d.f54815a;
        C17147f c17147f = C17147f.f54817a;
        if (i11 >= 31) {
            if (i11 >= 33 || !AbstractC17681o.m19382k(c17147f, c17145d).contains(abstractC17148g)) {
                C11629s.f35245a.m13000b(remoteViews, i10, abstractC17148g);
                return;
            }
            return;
        }
        List listM19382k = AbstractC17681o.m19382k(c17147f, C17146e.f54816a, c17145d);
        Object obj = AbstractC11614k0.f35156a;
        if (listM19382k.contains(abstractC17148g)) {
            return;
        }
        throw new IllegalArgumentException("Using a height of " + abstractC17148g + " requires a complex layout before API 31");
    }

    /* JADX INFO: renamed from: c */
    public static final void m8424c(RemoteViews remoteViews, C14404r c14404r, int i10) {
        AbstractC17148g abstractC17148g = c14404r.f45151a;
        int i11 = Build.VERSION.SDK_INT;
        C17145d c17145d = C17145d.f54815a;
        C17147f c17147f = C17147f.f54817a;
        if (i11 >= 31) {
            if (i11 >= 33 || !AbstractC17681o.m19382k(c17147f, c17145d).contains(abstractC17148g)) {
                C11629s.f35245a.m13001c(remoteViews, i10, abstractC17148g);
                return;
            }
            return;
        }
        List listM19382k = AbstractC17681o.m19382k(c17147f, C17146e.f54816a, c17145d);
        Object obj = AbstractC11614k0.f35156a;
        if (listM19382k.contains(abstractC17148g)) {
            return;
        }
        throw new IllegalArgumentException("Using a width of " + abstractC17148g + " requires a complex layout before API 31");
    }

    /* JADX INFO: renamed from: d */
    public static C19495x m8425d(C3676s c3676s) {
        try {
            String id2 = c3676s.m4395w(ParameterNames.f31999ID).mo4384r();
            AbstractC16544l.m18093f(id2, "id");
            return new C19495x(id2);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Session", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Session", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Session", e12);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final double m8426e(String str) {
        AbstractC16544l.m18094g(str, "<this>");
        Double dM21719f = AbstractC21328v.m21719f(str);
        if (dM21719f != null) {
            return dM21719f.doubleValue();
        }
        return 0.0d;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m8427f(AbstractC17148g abstractC17148g) {
        boolean z6 = true;
        if (abstractC17148g instanceof C17144c) {
            return true;
        }
        if (!(AbstractC16544l.m18089b(abstractC17148g, C17145d.f54815a) ? true : AbstractC16544l.m18089b(abstractC17148g, C17146e.f54816a) ? true : AbstractC16544l.m18089b(abstractC17148g, C17147f.f54817a)) && abstractC17148g != null) {
            z6 = false;
        }
        if (z6) {
            return false;
        }
        throw new C0644w();
    }
}
