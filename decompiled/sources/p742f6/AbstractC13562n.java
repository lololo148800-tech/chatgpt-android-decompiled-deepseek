package p742f6;

import android.graphics.Color;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.util.ArrayList;
import p001A.AbstractC0010F;
import p764g6.AbstractC13821a;

/* JADX INFO: renamed from: f6.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13562n {

    /* JADX INFO: renamed from: a */
    public static final C15384c f42906a = C15384c.m16635u("x", "y");

    /* JADX INFO: renamed from: a */
    public static int m15091a(AbstractC13821a abstractC13821a) {
        abstractC13821a.mo15429a();
        int iMo15423O = (int) (abstractC13821a.mo15423O() * 255.0d);
        int iMo15423O2 = (int) (abstractC13821a.mo15423O() * 255.0d);
        int iMo15423O3 = (int) (abstractC13821a.mo15423O() * 255.0d);
        while (abstractC13821a.hasNext()) {
            abstractC13821a.mo15421D();
        }
        abstractC13821a.mo15433k();
        return Color.argb(255, iMo15423O, iMo15423O2, iMo15423O3);
    }

    /* JADX INFO: renamed from: b */
    public static PointF m15092b(AbstractC13821a abstractC13821a, float f10) {
        int iM24h = AbstractC0010F.m24h(abstractC13821a.mo15424P());
        if (iM24h == 0) {
            abstractC13821a.mo15429a();
            float fMo15423O = (float) abstractC13821a.mo15423O();
            float fMo15423O2 = (float) abstractC13821a.mo15423O();
            while (abstractC13821a.mo15424P() != 2) {
                abstractC13821a.mo15421D();
            }
            abstractC13821a.mo15433k();
            return new PointF(fMo15423O * f10, fMo15423O2 * f10);
        }
        if (iM24h != 2) {
            if (iM24h != 6) {
                throw new IllegalArgumentException("Unknown point starts with ".concat(AbstractC12107L1.m13809A(abstractC13821a.mo15424P())));
            }
            float fMo15423O3 = (float) abstractC13821a.mo15423O();
            float fMo15423O4 = (float) abstractC13821a.mo15423O();
            while (abstractC13821a.hasNext()) {
                abstractC13821a.mo15421D();
            }
            return new PointF(fMo15423O3 * f10, fMo15423O4 * f10);
        }
        abstractC13821a.mo15430e();
        float fM15094d = 0.0f;
        float fM15094d2 = 0.0f;
        while (abstractC13821a.hasNext()) {
            int iMo15427T = abstractC13821a.mo15427T(f42906a);
            if (iMo15427T == 0) {
                fM15094d = m15094d(abstractC13821a);
            } else if (iMo15427T != 1) {
                abstractC13821a.mo15428W();
                abstractC13821a.mo15421D();
            } else {
                fM15094d2 = m15094d(abstractC13821a);
            }
        }
        abstractC13821a.mo15434m();
        return new PointF(fM15094d * f10, fM15094d2 * f10);
    }

    /* JADX INFO: renamed from: c */
    public static ArrayList m15093c(AbstractC13821a abstractC13821a, float f10) {
        ArrayList arrayList = new ArrayList();
        abstractC13821a.mo15429a();
        while (abstractC13821a.mo15424P() == 1) {
            abstractC13821a.mo15429a();
            arrayList.add(m15092b(abstractC13821a, f10));
            abstractC13821a.mo15433k();
        }
        abstractC13821a.mo15433k();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static float m15094d(AbstractC13821a abstractC13821a) {
        int iMo15424P = abstractC13821a.mo15424P();
        int iM24h = AbstractC0010F.m24h(iMo15424P);
        if (iM24h != 0) {
            if (iM24h == 6) {
                return (float) abstractC13821a.mo15423O();
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(AbstractC12107L1.m13809A(iMo15424P)));
        }
        abstractC13821a.mo15429a();
        float fMo15423O = (float) abstractC13821a.mo15423O();
        while (abstractC13821a.hasNext()) {
            abstractC13821a.mo15421D();
        }
        abstractC13821a.mo15433k();
        return fMo15423O;
    }
}
