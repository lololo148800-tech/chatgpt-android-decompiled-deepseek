package p523V9;

import com.openai.chatgpt.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p003A1.AbstractC0168G;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p169Gf.C3037a;
import p257K3.C4535c;
import p291Lf.AbstractC5018o;
import p291Lf.C5019p;
import p349O0.C5997d;
import p349O0.C6018n0;
import p349O0.C6021p;
import p349O0.InterfaceC6008i0;
import p403Qd.C6600F;
import p403Qd.C6621a0;
import p403Qd.EnumC6606L;
import p478Tc.AbstractC7313q;
import p635a1.AbstractC10443a;
import p635a1.C10444b;
import p635a1.InterfaceC10459q;
import p774h1.AbstractC14334L;
import p774h1.C14341T;
import p895n1.C17424d;
import p895n1.C17425e;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17682p;
import p911o0.AbstractC17788v;
import p911o0.AbstractC17792x;
import p911o0.C17764j;
import p911o0.C17790w;
import p926of.C18175l;

/* JADX INFO: renamed from: V9.Q5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7974Q5 {

    /* JADX INFO: renamed from: a */
    public static C17425e f25226a;

    /* JADX WARN: Code duplicated, block: B:51:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0127  */
    /* JADX WARN: Code duplicated, block: B:69:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x017c A[LOOP:0: B:70:0x0176->B:72:0x017c, LOOP_END] */
    /* JADX INFO: renamed from: a */
    public static final void m8274a(C6600F c6600f, InterfaceC10459q interfaceC10459q, C6021p c6021p, int i10) {
        int i11;
        int i12;
        int i13;
        String strM19533p;
        C6621a0 c6621a0;
        List list;
        Integer numValueOf;
        ArrayList arrayList;
        Iterator it;
        boolean z6;
        c6021p.m6526U(2088615101);
        if ((i10 & 6) == 0) {
            i11 = (c6021p.m6542f(c6600f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c6021p.m6542f(interfaceC10459q) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && c6021p.m6562y()) {
            c6021p.m6517L();
        } else {
            if (c6600f.f21313e != null) {
                C6018n0 c6018n0M6555r = c6021p.m6555r();
                if (c6018n0M6555r != null) {
                    c6018n0M6555r.f19536d = new C3037a(c6600f, interfaceC10459q, i10, 1);
                    return;
                }
                return;
            }
            C17790w c17790wM19515a = AbstractC17788v.m19515a(new C17764j(AbstractC7313q.f23199d, false, null), C10444b.f30946y0, c6021p, 0);
            int i14 = c6021p.f19564P;
            InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
            InterfaceC10459q interfaceC10459qM10923d = AbstractC10443a.m10923d(c6021p, interfaceC10459q);
            InterfaceC21700k.f68875m0.getClass();
            C21696i c21696i = C21698j.f68869b;
            c6021p.m6528W();
            if (c6021p.f19563O) {
                c6021p.m6549l(c21696i);
            } else {
                c6021p.m6543f0();
            }
            C5997d.m6439Z(C21698j.f68873f, c6021p, c17790wM19515a);
            C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
            C21694h c21694h = C21698j.f68874g;
            if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i14))) {
                AbstractC0168G.m537z(i14, c6021p, i14, c21694h);
            }
            C5997d.m6439Z(C21698j.f68871d, c6021p, interfaceC10459qM10923d);
            EnumC6606L enumC6606L = c6600f.f21311c;
            if (enumC6606L.m7161a()) {
                if (enumC6606L == EnumC6606L.f21329o0 || enumC6606L == EnumC6606L.f21330p0) {
                    i12 = -324521438;
                    i13 = R.string.dalle_creating_images_failed;
                } else {
                    c6021p.m6524S(-1470157104);
                    c6021p.m6553p(false);
                    strM19533p = null;
                }
                c6021p.m6524S(-324518167);
                if (strM19533p != null) {
                    if (enumC6606L == EnumC6606L.f21327Y) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    AbstractC8011V4.m8325a(strM19533p, z6, null, 0, c6021p, 0, 12);
                }
                c6021p.m6553p(false);
                c6021p.m6524S(-324510960);
                if (!enumC6606L.m7161a()) {
                    c6621a0 = (C6621a0) c6600f.f21314f;
                    list = c6621a0.f21354c;
                    numValueOf = list != null ? Integer.valueOf(list.size()) : null;
                    if (numValueOf != null || numValueOf.intValue() == 0) {
                        c6021p.m6524S(-324507375);
                        c6021p.m6553p(false);
                    } else if (numValueOf.intValue() == 1) {
                        c6021p.m6524S(-324506205);
                        AbstractC5018o.m5647b(new C18175l((String) AbstractC17680n.m19341Q(list), ((Number) c6621a0.f21353b.f55136Y).intValue(), ((Number) c6621a0.f21353b.f55137Z).intValue()), null, null, null, c6021p, 48, 12);
                        c6021p.m6553p(false);
                    } else {
                        c6021p.m6524S(-324494244);
                        List list2 = list;
                        arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                        it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(new C18175l((String) it.next(), ((Number) c6621a0.f21353b.f55136Y).intValue(), ((Number) c6621a0.f21353b.f55137Z).intValue()));
                        }
                        AbstractC5018o.m5649d(new C5019p(arrayList), null, null, c6021p, 48, 4);
                        c6021p.m6553p(false);
                    }
                }
                c6021p.m6553p(false);
                c6021p.m6553p(true);
            } else {
                i12 = -324527237;
                i13 = R.string.dalle_creating_images;
            }
            strM19533p = AbstractC17792x.m19533p(c6021p, i12, i13, c6021p, false);
            c6021p.m6524S(-324518167);
            if (strM19533p != null) {
                if (enumC6606L == EnumC6606L.f21327Y) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                AbstractC8011V4.m8325a(strM19533p, z6, null, 0, c6021p, 0, 12);
            }
            c6021p.m6553p(false);
            c6021p.m6524S(-324510960);
            if (!enumC6606L.m7161a()) {
                c6621a0 = (C6621a0) c6600f.f21314f;
                list = c6621a0.f21354c;
                if (list != null) {
                }
                if (numValueOf != null) {
                    c6021p.m6524S(-324507375);
                    c6021p.m6553p(false);
                } else if (numValueOf.intValue() == 1) {
                    c6021p.m6524S(-324506205);
                    AbstractC5018o.m5647b(new C18175l((String) AbstractC17680n.m19341Q(list), ((Number) c6621a0.f21353b.f55136Y).intValue(), ((Number) c6621a0.f21353b.f55137Z).intValue()), null, null, null, c6021p, 48, 12);
                    c6021p.m6553p(false);
                } else {
                    c6021p.m6524S(-324494244);
                    List list3 = list;
                    arrayList = new ArrayList(AbstractC17682p.m19389r(list3, 10));
                    it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C18175l((String) it.next(), ((Number) c6621a0.f21353b.f55136Y).intValue(), ((Number) c6621a0.f21353b.f55137Z).intValue()));
                    }
                    AbstractC5018o.m5649d(new C5019p(arrayList), null, null, c6021p, 48, 4);
                    c6021p.m6553p(false);
                }
            }
            c6021p.m6553p(false);
            c6021p.m6553p(true);
        }
        C6018n0 c6018n0M6555r2 = c6021p.m6555r();
        if (c6018n0M6555r2 != null) {
            c6018n0M6555r2.f19536d = new C3037a(c6600f, interfaceC10459q, i10, 2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m8275b(String str) {
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (AbstractC16544l.m18096i(cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static final C17425e m8276c() {
        C17425e c17425e = f25226a;
        if (c17425e != null) {
            return c17425e;
        }
        float f10 = (float) 24.0d;
        C17424d c17424d = new C17424d("ThumbUp", f10, f10, 24.0f, 24.0f, 0L, 0, false, 224);
        C14341T c14341t = new C14341T(AbstractC14334L.m15625c(0));
        C14341T c14341t2 = new C14341T(AbstractC14334L.m15626d(4278190080L));
        C4535c c4535c = new C4535c(3);
        c4535c.m5290p(8.0f, 10.0f);
        c4535c.m5286l(6.0f);
        c4535c.m5283i(4.8954f, 10.0f, 4.0f, 10.8954f, 4.0f, 12.0f);
        c4535c.m5293s(19.0f);
        c4535c.m5283i(4.0f, 20.1045f, 4.8954f, 21.0f, 6.0f, 21.0f);
        c4535c.m5286l(15.7086f);
        c4535c.m5283i(17.0615f, 21.0f, 18.2469f, 20.0945f, 18.6029f, 18.7893f);
        c4535c.m5288n(19.9665f, 13.7893f);
        c4535c.m5283i(20.487f, 11.8809f, 19.0504f, 10.0f, 17.0722f, 10.0f);
        c4535c.m5286l(15.0f);
        c4535c.m5288n(15.949f, 6.9158f);
        c4535c.m5283i(16.4974f, 5.1335f, 15.3041f, 3.288f, 13.4537f, 3.0567f);
        c4535c.m5288n(13.0f, 3.0f);
        c4535c.m5288n(9.4961f, 9.1317f);
        c4535c.m5283i(9.1893f, 9.6686f, 8.6184f, 10.0f, 8.0f, 10.0f);
        c4535c.m5293s(10.0f);
        c4535c.m5282h();
        c4535c.m5290p(8.0f, 10.0f);
        c4535c.m5293s(15.5f);
        c4535c.m5293s(19.0f);
        c4535c.m5283i(8.0f, 20.1045f, 8.8954f, 21.0f, 10.0f, 21.0f);
        c4535c.m5286l(15.0f);
        C17424d.m19121a(c17424d, c4535c.f14813Z, 0, c14341t, c14341t2, 2.0f, 0, 1, 4.0f);
        C17425e c17425eM19122b = c17424d.m19122b();
        f25226a = c17425eM19122b;
        return c17425eM19122b;
    }
}
