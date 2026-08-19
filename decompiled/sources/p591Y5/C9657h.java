package p591Y5;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.AbstractC10763a;
import android.graphics.PointF;
import com.google.protobuf.AbstractC12107L1;
import io.sentry.internal.debugmeta.C15384c;
import java.util.List;
import p544W9.AbstractC8751z2;
import p675c6.C11668c;
import p779h6.AbstractC14417f;
import p802i6.C14935a;
import p802i6.C14936b;

/* JADX INFO: renamed from: Y5.h */
/* JADX INFO: loaded from: classes.dex */
public final class C9657h extends AbstractC9658i {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f29103i;

    /* JADX INFO: renamed from: j */
    public final Object f29104j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9657h(int i10, List list) {
        super(list);
        this.f29103i = i10;
        switch (i10) {
            case 1:
                super(list);
                this.f29104j = new PointF();
                break;
            case 2:
                super(list);
                this.f29104j = new C14936b();
                break;
            default:
                int iMax = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C11668c c11668c = (C11668c) ((C14935a) list.get(i11)).f46525b;
                    if (c11668c != null) {
                        iMax = Math.max(iMax, c11668c.f35332b.length);
                    }
                }
                this.f29104j = new C11668c(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: f */
    public final Object mo10235f(C14935a c14935a, float f10) {
        Object obj;
        switch (this.f29103i) {
            case 0:
                C11668c c11668c = (C11668c) c14935a.f46525b;
                C11668c c11668c2 = (C11668c) c14935a.f46526c;
                C11668c c11668c3 = (C11668c) this.f29104j;
                c11668c3.getClass();
                if (c11668c.equals(c11668c2) || f10 <= 0.0f) {
                    c11668c3.m13022a(c11668c);
                } else if (f10 >= 1.0f) {
                    c11668c3.m13022a(c11668c2);
                } else {
                    int[] iArr = c11668c.f35332b;
                    int length = iArr.length;
                    int[] iArr2 = c11668c2.f35332b;
                    if (length != iArr2.length) {
                        StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb2.append(iArr.length);
                        sb2.append(" vs ");
                        throw new IllegalArgumentException(AbstractC10763a.m11056n(sb2, iArr2.length, Separators.RPAREN));
                    }
                    int i10 = 0;
                    while (true) {
                        int length2 = iArr.length;
                        int[] iArr3 = c11668c3.f35332b;
                        float[] fArr = c11668c3.f35331a;
                        if (i10 < length2) {
                            fArr[i10] = AbstractC14417f.m15928e(c11668c.f35331a[i10], c11668c2.f35331a[i10], f10);
                            iArr3[i10] = AbstractC8751z2.m9506c(f10, iArr[i10], iArr2[i10]);
                            i10++;
                        } else {
                            for (int length3 = iArr.length; length3 < fArr.length; length3++) {
                                fArr[length3] = fArr[iArr.length - 1];
                                iArr3[length3] = iArr3[iArr.length - 1];
                            }
                        }
                    }
                }
                return c11668c3;
            case 1:
                return m10245k(c14935a, f10, f10, f10);
            default:
                Object obj2 = c14935a.f46525b;
                if (obj2 == null || (obj = c14935a.f46526c) == null) {
                    throw new IllegalStateException("Missing values for keyframe.");
                }
                C14936b c14936b = (C14936b) obj2;
                C14936b c14936b2 = (C14936b) obj;
                C15384c c15384c = this.f29086e;
                if (c15384c != null) {
                    C14936b c14936b3 = (C14936b) c15384c.m16641r(c14935a.f46530g, c14935a.f46531h.floatValue(), c14936b, c14936b2, f10, m10233d(), this.f29085d);
                    if (c14936b3 != null) {
                        return c14936b3;
                    }
                }
                float fM15928e = AbstractC14417f.m15928e(c14936b.f46540a, c14936b2.f46540a, f10);
                float fM15928e2 = AbstractC14417f.m15928e(c14936b.f46541b, c14936b2.f46541b, f10);
                C14936b c14936b4 = (C14936b) this.f29104j;
                c14936b4.f46540a = fM15928e;
                c14936b4.f46541b = fM15928e2;
                return c14936b4;
        }
    }

    @Override // p591Y5.AbstractC9653d
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ Object mo10236g(C14935a c14935a, float f10, float f11, float f12) {
        switch (this.f29103i) {
            case 1:
                return m10245k(c14935a, f10, f11, f12);
            default:
                return super.mo10236g(c14935a, f10, f11, f12);
        }
    }

    /* JADX INFO: renamed from: k */
    public PointF m10245k(C14935a c14935a, float f10, float f11, float f12) {
        Object obj;
        Object obj2 = c14935a.f46525b;
        if (obj2 == null || (obj = c14935a.f46526c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) obj2;
        PointF pointF2 = (PointF) obj;
        C15384c c15384c = this.f29086e;
        if (c15384c != null) {
            PointF pointF3 = (PointF) c15384c.m16641r(c14935a.f46530g, c14935a.f46531h.floatValue(), pointF, pointF2, f10, m10233d(), this.f29085d);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = (PointF) this.f29104j;
        float f13 = pointF.x;
        float fM13818i = AbstractC12107L1.m13818i(pointF2.x, f13, f11, f13);
        float f14 = pointF.y;
        pointF4.set(fM13818i, AbstractC12107L1.m13818i(pointF2.y, f14, f12, f14));
        return pointF4;
    }
}
