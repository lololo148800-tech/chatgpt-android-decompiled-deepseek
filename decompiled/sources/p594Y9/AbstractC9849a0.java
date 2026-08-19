package p594Y9;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p003A1.AbstractC0233b1;
import p008A6.C0386f;
import p049Bm.InterfaceC1436k;
import p050Bn.C1450d;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p349O0.C5997d;
import p349O0.C6013l;
import p349O0.C6021p;
import p385Pj.C6427b;
import p474T8.C7265c;
import p474T8.C7266d;
import p474T8.C7268f;
import p474T8.InterfaceC7263a;
import p478Tc.AbstractC7308l;
import p507Uh.C7677c;
import p507Uh.C7684j;
import p507Uh.C7689o;
import p544W9.AbstractC8571V2;
import p571X9.AbstractC9196Q3;
import p795i.C14893g;
import p893n.AbstractActivityC17375g;
import p909nm.AbstractC17682p;
import p909nm.C17690x;
import p919o8.AbstractC17962d;
import p919o8.C17880A0;
import p919o8.C17883B0;
import p919o8.C17886C0;
import p919o8.C17892E0;
import p919o8.C17895F0;
import p919o8.C17901H0;
import p919o8.C17987l0;
import p919o8.C17990m0;
import p919o8.C17996o0;
import p919o8.C18002q0;
import p919o8.C18005r0;
import p919o8.C18011t0;
import p919o8.C18014u0;
import p919o8.C18020w0;
import p919o8.C18023x0;
import p919o8.C18029z0;

/* JADX INFO: renamed from: Y9.a0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9849a0 {
    /* JADX INFO: renamed from: a */
    public static C17901H0 m10498a(C3676s jsonObject) {
        String strMo4384r;
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        try {
            long jMo4382p = jsonObject.m4395w("date").mo4382p();
            C17990m0 c17990m0M10474c = AbstractC9830X.m10474c(jsonObject.m4395w(SIPServerTransaction.CONTENT_TYPE_APPLICATION).m4390m());
            AbstractC3673p abstractC3673pM4395w = jsonObject.m4395w(ReferencesHeader.SERVICE);
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = jsonObject.m4395w("version");
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = jsonObject.m4395w("build_version");
            String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = jsonObject.m4395w("build_id");
            String strMo4384r5 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
            C17880A0 c17880a0M10364a = AbstractC9762L2.m10364a(jsonObject.m4395w(ParameterNames.SESSION).m4390m());
            AbstractC3673p abstractC3673pM4395w5 = jsonObject.m4395w("source");
            int i10 = 0;
            if (abstractC3673pM4395w5 != null && (strMo4384r = abstractC3673pM4395w5.mo4384r()) != null) {
                int[] iArrM27k = AbstractC0010F.m27k(8);
                int length = iArrM27k.length;
                while (true) {
                    if (i10 >= length) {
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                    int i11 = iArrM27k[i10];
                    if (AbstractC17962d.m19655p(i11).equals(strMo4384r)) {
                        i10 = i11;
                        break;
                    }
                    i10++;
                }
            }
            C17883B0 c17883b0M10370a = AbstractC9768M2.m10370a(jsonObject.m4395w("view").m4390m());
            AbstractC3673p abstractC3673pM4395w6 = jsonObject.m4395w("usr");
            C17895F0 c17895f0M10399a = abstractC3673pM4395w6 != null ? AbstractC9786P2.m10399a(abstractC3673pM4395w6.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w7 = jsonObject.m4395w("connectivity");
            C18002q0 c18002q0M10517a = abstractC3673pM4395w7 != null ? AbstractC9863c0.m10517a(abstractC3673pM4395w7.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w8 = jsonObject.m4395w("display");
            C18023x0 c18023x0M10347b = abstractC3673pM4395w8 != null ? AbstractC9750J2.m10347b(abstractC3673pM4395w8.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w9 = jsonObject.m4395w("synthetics");
            C17892E0 c17892e0M10388a = abstractC3673pM4395w9 != null ? AbstractC9780O2.m10388a(abstractC3673pM4395w9.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w10 = jsonObject.m4395w("ci_test");
            C17996o0 c17996o0M10489a = abstractC3673pM4395w10 != null ? AbstractC9842Z.m10489a(abstractC3673pM4395w10.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w11 = jsonObject.m4395w("os");
            C17886C0 c17886c0M10379a = abstractC3673pM4395w11 != null ? AbstractC9774N2.m10379a(abstractC3673pM4395w11.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w12 = jsonObject.m4395w("device");
            C18020w0 c18020w0M10571a = abstractC3673pM4395w12 != null ? AbstractC9915k0.m10571a(abstractC3673pM4395w12.m4390m()) : null;
            C18014u0 c18014u0M10567b = AbstractC9903i0.m10567b(jsonObject.m4395w("_dd").m4390m());
            AbstractC3673p abstractC3673pM4395w13 = jsonObject.m4395w("context");
            C18011t0 c18011t0M10536a = abstractC3673pM4395w13 != null ? AbstractC9884f0.m10536a(abstractC3673pM4395w13.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w14 = jsonObject.m4395w("action");
            C17987l0 c17987l0M10466a = abstractC3673pM4395w14 != null ? AbstractC9824W.m10466a(abstractC3673pM4395w14.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w15 = jsonObject.m4395w("container");
            C18005r0 c18005r0M10526d = abstractC3673pM4395w15 != null ? AbstractC9870d0.m10526d(abstractC3673pM4395w15.m4390m()) : null;
            String strMo4384r6 = jsonObject.m4395w("type").mo4384r();
            C18029z0 c18029z0M10356a = AbstractC9756K2.m10356a(jsonObject.m4395w("long_task").m4390m());
            if (AbstractC16544l.m18089b(strMo4384r6, "long_task")) {
                return new C17901H0(jMo4382p, c17990m0M10474c, strMo4384r2, strMo4384r3, strMo4384r4, strMo4384r5, c17880a0M10364a, i10, c17883b0M10370a, c17895f0M10399a, c18002q0M10517a, c18023x0M10347b, c17892e0M10388a, c17996o0M10489a, c17886c0M10379a, c18020w0M10571a, c18014u0M10567b, c18011t0M10536a, c17987l0M10466a, c18005r0M10526d, c18029z0M10356a);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type LongTaskEvent", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type LongTaskEvent", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type LongTaskEvent", e12);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C7677c m10499b(List list, C6021p c6021p, int i10) {
        Object obj;
        InterfaceC7263a c15384c;
        c6021p.m6524S(-431598569);
        Object obj2 = C7684j.f24221Z;
        AbstractActivityC17375g activity = (AbstractActivityC17375g) c6021p.m6548k(AbstractC7308l.f23151a);
        C17690x c17690x = C17690x.f56481Y;
        c6021p.m6524S(-57132327);
        Object obj3 = C6013l.f19514a;
        int i11 = (i10 & 112) | (i10 & 14) | 384;
        c6021p.m6524S(-2117184311);
        if (((Boolean) c6021p.m6548k(AbstractC0233b1.f873a)).booleanValue()) {
            c15384c = new C15384c(list, c17690x);
        } else {
            c6021p.m6524S(-2044770427);
            c6021p.m6524S(992349447);
            Context context = (Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b);
            Activity activityM9761c = AbstractC9196Q3.m9761c(context);
            c6021p.m6524S(2043410185);
            boolean zM6542f = c6021p.m6542f(list);
            Object objM6514H = c6021p.m6514H();
            if (zM6542f || objM6514H == obj3) {
                obj = objM6514H;
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C7268f((String) it.next(), context, activityM9761c));
                }
                c6021p.m6537c0(arrayList);
                obj = arrayList;
            }
            List<C7268f> list3 = (List) obj;
            c6021p.m6553p(false);
            for (C7268f c7268f : list3) {
                c6021p.m6521P(2043417954, c7268f.f23048a);
                C6427b c6427b = new C6427b(6);
                c6021p.m6524S(2043425179);
                boolean zM6542f2 = c6021p.m6542f(c7268f);
                Object objM6514H2 = c6021p.m6514H();
                if (zM6542f2 || objM6514H2 == obj3) {
                    objM6514H2 = new C0386f(c7268f, 8);
                    c6021p.m6537c0(objM6514H2);
                }
                c6021p.m6553p(false);
                C14893g c14893gM9235b = AbstractC8571V2.m9235b(c6427b, (InterfaceC1436k) objM6514H2, c6021p, 0);
                c6021p.m6524S(2043428887);
                boolean zM6542f3 = c6021p.m6542f(c7268f) | c6021p.m6545h(c14893gM9235b);
                Object objM6514H3 = c6021p.m6514H();
                if (zM6542f3 || objM6514H3 == obj3) {
                    objM6514H3 = new C7266d(c7268f, c14893gM9235b, 0);
                    c6021p.m6537c0(objM6514H3);
                }
                c6021p.m6553p(false);
                C5997d.m6444c(c14893gM9235b, (InterfaceC1436k) objM6514H3, c6021p);
                c6021p.m6553p(false);
            }
            c6021p.m6553p(false);
            AbstractC9196Q3.m9760b(list3, null, c6021p, 0);
            c6021p.m6524S(-1913570181);
            boolean zM6542f4 = c6021p.m6542f(list);
            Object objM6514H4 = c6021p.m6514H();
            if (zM6542f4 || objM6514H4 == obj3) {
                objM6514H4 = new C7265c(list3);
                c6021p.m6537c0(objM6514H4);
            }
            C7265c c7265c = (C7265c) objM6514H4;
            c6021p.m6553p(false);
            C6427b c6427b2 = new C6427b(5);
            c6021p.m6524S(-1913560327);
            boolean zM6542f5 = ((((i11 & 112) ^ 48) > 32 && c6021p.m6542f(obj2)) || (i11 & 48) == 32) | c6021p.m6542f(c7265c);
            Object objM6514H5 = c6021p.m6514H();
            if (zM6542f5 || objM6514H5 == obj3) {
                objM6514H5 = new C1450d(c7265c, 3, obj2);
                c6021p.m6537c0(objM6514H5);
            }
            c6021p.m6553p(false);
            Object objM9235b = AbstractC8571V2.m9235b(c6427b2, (InterfaceC1436k) objM6514H5, c6021p, 0);
            c6021p.m6524S(-1913553647);
            boolean zM6542f6 = c6021p.m6542f(c7265c) | c6021p.m6545h(objM9235b);
            Object objM6514H6 = c6021p.m6514H();
            if (zM6542f6 || objM6514H6 == obj3) {
                objM6514H6 = new C1450d(c7265c, 4, objM9235b);
                c6021p.m6537c0(objM6514H6);
            }
            c6021p.m6553p(false);
            C5997d.m6446d(c7265c, objM9235b, (InterfaceC1436k) objM6514H6, c6021p);
            c6021p.m6553p(false);
            c15384c = c7265c;
        }
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        C7689o previouslyRequestedPermissions = AbstractC9863c0.m10518b(c6021p);
        Object objMo7721a = c15384c.mo7721a();
        Object objMo7723d = c15384c.mo7723d();
        boolean zMo7724g = c15384c.mo7724g();
        boolean zMo7722b = c15384c.mo7722b();
        c6021p.m6524S(678017212);
        boolean zM6542f7 = c6021p.m6542f(objMo7721a) | c6021p.m6542f(activity) | c6021p.m6542f(c15384c) | c6021p.m6542f(objMo7723d) | c6021p.m6544g(zMo7724g) | c6021p.m6544g(zMo7722b) | c6021p.m6542f(previouslyRequestedPermissions);
        Object objM6514H7 = c6021p.m6514H();
        if (zM6542f7 || objM6514H7 == obj3) {
            AbstractC16544l.m18094g(activity, "activity");
            AbstractC16544l.m18094g(previouslyRequestedPermissions, "previouslyRequestedPermissions");
            objM6514H7 = new C7677c(c15384c, activity, previouslyRequestedPermissions);
            c6021p.m6537c0(objM6514H7);
        }
        C7677c c7677c = (C7677c) objM6514H7;
        c6021p.m6553p(false);
        c6021p.m6553p(false);
        return c7677c;
    }
}
