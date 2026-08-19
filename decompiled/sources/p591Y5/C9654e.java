package p591Y5;

import android.graphics.PointF;
import io.sentry.internal.debugmeta.C15384c;
import java.util.List;
import p544W9.AbstractC8751z2;
import p640a6.C10507b;
import p779h6.AbstractC14417f;
import p802i6.C14935a;

/* JADX INFO: renamed from: Y5.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9654e extends AbstractC9658i {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f29090i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9654e(int i10, List list) {
        super(list);
        this.f29090i = i10;
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        Object obj;
        switch (this.f29090i) {
            case 0:
                return Integer.valueOf(m10240k(c14935a, f10));
            case 1:
                return Integer.valueOf(m10240k(c14935a, f10));
            default:
                C15384c c15384c = this.f29086e;
                Object obj2 = c14935a.f46525b;
                if (c15384c == null) {
                    return (f10 != 1.0f || (obj = c14935a.f46526c) == null) ? (C10507b) obj2 : (C10507b) obj;
                }
                Float f11 = c14935a.f46531h;
                float fFloatValue = f11 == null ? Float.MAX_VALUE : f11.floatValue();
                C10507b c10507b = (C10507b) obj2;
                Object obj3 = c14935a.f46526c;
                return (C10507b) c15384c.m16641r(c14935a.f46530g, fFloatValue, c10507b, obj3 == null ? c10507b : (C10507b) obj3, f10, m10232c(), this.f29085d);
        }
    }

    /* JADX INFO: renamed from: k */
    public int m10240k(C14935a c14935a, float f10) {
        Float f11;
        int i10;
        switch (this.f29090i) {
            case 0:
                if (c14935a.f46525b == null || c14935a.f46526c == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C15384c c15384c = this.f29086e;
                Object obj = c14935a.f46525b;
                if (c15384c != null && (f11 = c14935a.f46531h) != null) {
                    Integer num = (Integer) c15384c.m16641r(c14935a.f46530g, f11.floatValue(), (Integer) obj, (Integer) c14935a.f46526c, f10, m10233d(), this.f29085d);
                    if (num != null) {
                        return num.intValue();
                    }
                }
                return AbstractC8751z2.m9506c(AbstractC14417f.m15925b(f10, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) c14935a.f46526c).intValue());
            default:
                Object obj2 = c14935a.f46525b;
                if (obj2 == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                Object obj3 = c14935a.f46526c;
                if (obj3 == null) {
                    if (c14935a.f46534k == 784923401) {
                        c14935a.f46534k = ((Integer) obj2).intValue();
                    }
                    i10 = c14935a.f46534k;
                } else {
                    if (c14935a.f46535l == 784923401) {
                        c14935a.f46535l = ((Integer) obj3).intValue();
                    }
                    i10 = c14935a.f46535l;
                }
                C15384c c15384c2 = this.f29086e;
                Object obj4 = c14935a.f46525b;
                if (c15384c2 != null) {
                    Integer num2 = (Integer) c15384c2.m16641r(c14935a.f46530g, c14935a.f46531h.floatValue(), (Integer) obj4, Integer.valueOf(i10), f10, m10233d(), this.f29085d);
                    if (num2 != null) {
                        return num2.intValue();
                    }
                }
                if (c14935a.f46534k == 784923401) {
                    c14935a.f46534k = ((Integer) obj4).intValue();
                }
                int i11 = c14935a.f46534k;
                PointF pointF = AbstractC14417f.f45307a;
                return (int) ((f10 * (i10 - i11)) + i11);
        }
    }
}
