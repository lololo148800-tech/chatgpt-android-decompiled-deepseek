package p523V9;

import android.content.Context;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import p033B5.AbstractC0833q;
import p033B5.C0817a;
import p033B5.C0824h;
import p033B5.InterfaceC0829m;
import p1008s8.C19484m;
import p214Ib.AbstractC3673p;
import p214Ib.C3676s;
import p214Ib.C3677t;
import p544W9.AbstractC8532O4;
import p774h1.C14351g;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: V9.H0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7897H0 {
    /* JADX INFO: renamed from: a */
    public static final AbstractC17140a m8193a(InterfaceC0829m interfaceC0829m, Context context, int i10) {
        if (interfaceC0829m instanceof C0817a) {
            return AbstractC8532O4.m9194a(new C14351g(((C0817a) interfaceC0829m).f2281a), i10);
        }
        return interfaceC0829m instanceof C0824h ? new DrawablePainter(AbstractC0833q.m1889b(interfaceC0829m, context.getResources()).mutate()) : new ImagePainter(interfaceC0829m);
    }

    /* JADX INFO: renamed from: b */
    public static int m8194b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 90) {
            return 1;
        }
        if (i10 == 180) {
            return 2;
        }
        if (i10 == 270) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC10763a.m11048f(i10, "Invalid rotation: "));
    }

    /* JADX INFO: renamed from: c */
    public static C19484m m8195c(C3676s c3676s) {
        try {
            AbstractC3673p abstractC3673pM4395w = c3676s.m4395w("architecture");
            String strMo4384r = abstractC3673pM4395w != null ? abstractC3673pM4395w.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w2 = c3676s.m4395w("brand");
            String strMo4384r2 = abstractC3673pM4395w2 != null ? abstractC3673pM4395w2.mo4384r() : null;
            AbstractC3673p abstractC3673pM4395w3 = c3676s.m4395w("model");
            return new C19484m(strMo4384r, strMo4384r2, abstractC3673pM4395w3 != null ? abstractC3673pM4395w3.mo4384r() : null);
        } catch (IllegalStateException e10) {
            throw new C3677t("Unable to parse json into type Device", e10);
        } catch (NullPointerException e11) {
            throw new C3677t("Unable to parse json into type Device", e11);
        } catch (NumberFormatException e12) {
            throw new C3677t("Unable to parse json into type Device", e12);
        }
    }
}
