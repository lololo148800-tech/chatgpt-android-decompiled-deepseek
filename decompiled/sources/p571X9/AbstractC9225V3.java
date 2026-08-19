package p571X9;

import android.content.Context;
import android.content.res.Resources;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import android.text.Annotation;
import android.text.SpannedString;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.feature.onboarding.p683mU.YladLSetV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p001A.AbstractC0010F;
import p204I1.C3573D;
import p204I1.C3579J;
import p204I1.C3586b;
import p204I1.C3587c;
import p204I1.C3590f;
import p204I1.C3595k;
import p204I1.C3596l;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p239Ja.C4307j;
import p328N1.C5609y;
import p349O0.C6021p;
import p467T1.C7200j;
import p478Tc.C7297a;
import p909nm.C17689w;
import p919o8.AbstractC17962d;
import p919o8.C17885C;
import p919o8.C17891E;
import p919o8.C17897G;
import p919o8.C17953a;
import p919o8.C17959c;
import p919o8.C17965e;
import p919o8.C17968f;
import p919o8.C17974h;
import p919o8.C17980j;
import p919o8.C17983k;
import p919o8.C17989m;
import p919o8.C17995o;
import p919o8.C18007s;
import p919o8.C18010t;
import p919o8.C18025y;

/* JADX INFO: renamed from: X9.V3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9225V3 {
    /* JADX INFO: renamed from: a */
    public static final C3590f m9794a(CharSequence string, List annotationClickables) {
        Object next;
        AbstractC16544l.m18094g(string, "string");
        AbstractC16544l.m18094g(annotationClickables, "annotationClickables");
        SpannedString spannedString = new SpannedString(string);
        C3587c c3587c = new C3587c();
        String string2 = spannedString.toString();
        AbstractC16544l.m18093f(string2, "toString(...)");
        c3587c.m4291c(string2);
        for (Object obj : spannedString.getSpans(0, spannedString.length(), Annotation.class)) {
            Annotation annotation = (Annotation) obj;
            int spanStart = spannedString.getSpanStart(annotation);
            int spanEnd = spannedString.getSpanEnd(annotation);
            Iterator it = annotationClickables.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ((C7297a) next).getClass();
            } while (!"delete-link".equals(annotation.getValue()));
            C7297a c7297a = (C7297a) next;
            boolean zM18089b = AbstractC16544l.m18089b(annotation.getKey(), ParameterNames.TAG);
            C7200j c7200j = C7200j.f22864c;
            ArrayList arrayList = c3587c.f10928p0;
            if (zM18089b && c7297a != null) {
                String key = annotation.getKey();
                AbstractC16544l.m18093f(key, "getKey(...)");
                arrayList.add(new C3586b(new C3595k(key, new C3579J(new C3573D(0L, 0L, C5609y.f18157t0, null, null, null, null, 0L, null, null, null, 0L, c7200j, null, 61435), null, null, null), new C4307j(c7297a, 5)), spanStart, spanEnd, null, 8));
            } else if (AbstractC16544l.m18089b(annotation.getKey(), "url")) {
                String value = annotation.getValue();
                AbstractC16544l.m18093f(value, "getValue(...)");
                arrayList.add(new C3586b(new C3596l(value, new C3579J(new C3573D(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, c7200j, null, 61439), null, null, null)), spanStart, spanEnd, null, 8));
            } else {
                String key2 = annotation.getKey();
                AbstractC16544l.m18093f(key2, "getKey(...)");
                String value2 = annotation.getValue();
                AbstractC16544l.m18093f(value2, "getValue(...)");
                arrayList.add(new C3586b(value2, spanStart, spanEnd, key2));
            }
        }
        return c3587c.m4297i();
    }

    /* JADX INFO: renamed from: b */
    public static final C3590f m9795b(int i10, List list, C6021p c6021p, int i11) {
        c6021p.m6524S(-1005412455);
        if ((i11 & 2) != 0) {
            list = C17689w.f56480Y;
        }
        Resources resources = ((Context) c6021p.m6548k(AndroidCompositionLocals_androidKt.f32825b)).getResources();
        AbstractC16544l.m18093f(resources, "getResources(...)");
        C3590f c3590fM9796c = m9796c(resources, i10, list);
        c6021p.m6553p(false);
        return c3590fM9796c;
    }

    /* JADX INFO: renamed from: c */
    public static final C3590f m9796c(Resources resources, int i10, List list) {
        AbstractC16544l.m18094g(resources, "<this>");
        AbstractC16544l.m18094g(list, YladLSetV.WRHkACUftnsl);
        CharSequence text = resources.getText(i10);
        AbstractC16544l.m18093f(text, "getText(...)");
        return m9794a(text, list);
    }

    /* JADX INFO: renamed from: d */
    public static C17897G m9797d(C3676s jsonObject) {
        String strMo4384r;
        String str = YladLSetV.ZSQymSCYEWN;
        AbstractC16544l.m18094g(jsonObject, "jsonObject");
        try {
            long jMo4382p = jsonObject.m4395w("date").mo4382p();
            C17968f c17968fM9766a = AbstractC9201R3.m9766a(jsonObject.m4395w(SIPServerTransaction.CONTENT_TYPE_APPLICATION).m4390m());
            AbstractC3673p abstractC3673pM4395w = jsonObject.m4395w(ReferencesHeader.SERVICE);
            String strMo4384r2 = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = jsonObject.m4395w("version");
            String strMo4384r3 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = jsonObject.m4395w("build_version");
            String strMo4384r4 = abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w4 = jsonObject.m4395w("build_id");
            String strMo4384r5 = abstractC3673pM4395w4 != null ? abstractC3673pM4395w4.mo4384r() : null;
            C17959c c17959cM9751a = AbstractC9190P3.m9751a(jsonObject.m4395w(ParameterNames.SESSION).m4390m());
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
                    if (AbstractC17962d.m19636a(i11).equals(strMo4384r)) {
                        i10 = i11;
                        break;
                    }
                    i10++;
                }
            }
            C17965e c17965eM9762d = AbstractC9196Q3.m9762d(jsonObject.m4395w("view").m4390m());
            AbstractC3673p abstractC3673pM4395w6 = jsonObject.m4395w("usr");
            C17891E c17891eM9945b = abstractC3673pM4395w6 != null ? AbstractC9352q4.m9945b(abstractC3673pM4395w6.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w7 = jsonObject.m4395w("connectivity");
            C17980j c17980jM9813b = abstractC3673pM4395w7 != null ? AbstractC9237X3.m9813b(abstractC3673pM4395w7.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w8 = jsonObject.m4395w("display");
            C18010t c18010tM9877b = abstractC3673pM4395w8 != null ? AbstractC9298h4.m9877b(abstractC3673pM4395w8.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w9 = jsonObject.m4395w("synthetics");
            C17885C c17885cM9939b = abstractC3673pM4395w9 != null ? AbstractC9346p4.m9939b(abstractC3673pM4395w9.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w10 = jsonObject.m4395w("ci_test");
            C17974h c17974hM9780a = abstractC3673pM4395w10 != null ? AbstractC9213T3.m9780a(abstractC3673pM4395w10.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w11 = jsonObject.m4395w("os");
            C18025y c18025yM9913b = abstractC3673pM4395w11 != null ? AbstractC9322l4.m9913b(abstractC3673pM4395w11.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w12 = jsonObject.m4395w("device");
            C18007s c18007sM9869b = abstractC3673pM4395w12 != null ? AbstractC9292g4.m9869b(abstractC3673pM4395w12.m4390m()) : null;
            C17995o c17995oM9840a = AbstractC9268c4.m9840a(jsonObject.m4395w("_dd").m4390m());
            AbstractC3673p abstractC3673pM4395w13 = jsonObject.m4395w("context");
            C17989m c17989mM9829b = abstractC3673pM4395w13 != null ? AbstractC9256a4.m9829b(abstractC3673pM4395w13.m4390m()) : null;
            AbstractC3673p abstractC3673pM4395w14 = jsonObject.m4395w("container");
            C17983k c17983kM9818b = abstractC3673pM4395w14 != null ? AbstractC9243Y3.m9818b(abstractC3673pM4395w14.m4390m()) : null;
            String strMo4384r6 = jsonObject.m4395w("type").mo4384r();
            C17953a c17953aM9734a = AbstractC9178N3.m9734a(jsonObject.m4395w("action").m4390m());
            if (AbstractC16544l.m18089b(strMo4384r6, "action")) {
                return new C17897G(jMo4382p, c17968fM9766a, strMo4384r2, strMo4384r3, strMo4384r4, strMo4384r5, c17959cM9751a, i10, c17965eM9762d, c17891eM9945b, c17980jM9813b, c18010tM9877b, c17885cM9939b, c17974hM9780a, c18025yM9913b, c18007sM9869b, c17995oM9840a, c17989mM9829b, c17983kM9818b, c17953aM9734a);
            }
            throw new IllegalStateException("Check failed.");
        } catch (IllegalStateException e10) {
            throw new C3677t(str, e10);
        } catch (NullPointerException e11) {
            throw new C3677t(str, e11);
        } catch (NumberFormatException e12) {
            throw new C3677t(str, e12);
        }
    }
}
