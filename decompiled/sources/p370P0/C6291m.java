package p370P0;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import p038Ba.AbstractC0865o;
import p045Bj.C1313k;
import p049Bm.InterfaceC1426a;
import p349O0.C5947D0;
import p349O0.C5995c;
import p349O0.C6018n0;
import p349O0.C6036w0;
import p571X9.AbstractC9180O;
import p571X9.AbstractC9186P;

/* JADX INFO: renamed from: P0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6291m extends AbstractC6276C {

    /* JADX INFO: renamed from: e */
    public static final C6291m f20419e;

    /* JADX INFO: renamed from: g */
    public static final C6291m f20421g;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f20422c;

    /* JADX INFO: renamed from: d */
    public static final C6291m f20418d = new C6291m(1, 2, 0);

    /* JADX INFO: renamed from: f */
    public static final C6291m f20420f = new C6291m(1, 2, 2);

    static {
        int i10 = 1;
        f20419e = new C6291m(i10, i10, 1);
        int i11 = 1;
        f20421g = new C6291m(i11, i11, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6291m(int i10, int i11, int i12) {
        super(i10, i11);
        this.f20422c = i12;
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: a */
    public final void mo6757a(C6277D c6277d, AbstractC0865o abstractC0865o, C5947D0 c5947d0, C1313k c1313k) {
        int iM6366c;
        int iM6377o;
        switch (this.f20422c) {
            case 0:
                Object objInvoke = ((InterfaceC1426a) c6277d.m6798d(0)).invoke();
                C5995c c5995c = (C5995c) c6277d.m6798d(1);
                int iM6796c = c6277d.m6796c(0);
                AbstractC16544l.m18092e(abstractC0865o, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                c5995c.getClass();
                c5947d0.m6363N(c5947d0.m6366c(c5995c), objInvoke);
                abstractC0865o.mo1936i(iM6796c, objInvoke);
                abstractC0865o.m1933f(objInvoke);
                break;
            case 1:
                C5995c c5995c2 = (C5995c) c6277d.m6798d(0);
                int iM6796c2 = c6277d.m6796c(0);
                abstractC0865o.m1945r();
                c5995c2.getClass();
                abstractC0865o.mo1935h(iM6796c2, c5947d0.m6386x(c5947d0.m6366c(c5995c2)));
                break;
            case 2:
                Object objM6798d = c6277d.m6798d(0);
                C5995c c5995c3 = (C5995c) c6277d.m6798d(1);
                int iM6796c3 = c6277d.m6796c(0);
                if (objM6798d instanceof C6036w0) {
                    ((ArrayList) c1313k.f3468c).add(((C6036w0) objM6798d).f19669a);
                }
                int iM6366c2 = c5947d0.m6366c(c5995c3);
                int iM6370g = c5947d0.m6370g(c5947d0.m6356G(iM6366c2, iM6796c3));
                Object[] objArr = c5947d0.f19366c;
                Object obj = objArr[iM6370g];
                objArr[iM6370g] = objM6798d;
                if (obj instanceof C6036w0) {
                    int iM6377o2 = c5947d0.m6377o() - c5947d0.m6356G(iM6366c2, iM6796c3);
                    C6036w0 c6036w0 = (C6036w0) obj;
                    C5995c c5995c4 = c6036w0.f19670b;
                    if (c5995c4 == null || !c5995c4.m6411a()) {
                        iM6366c = -1;
                        iM6377o = -1;
                    } else {
                        iM6366c = c5947d0.m6366c(c5995c4);
                        iM6377o = c5947d0.m6377o() - c5947d0.m6369f(c5947d0.f19365b, c5947d0.m6378p(c5947d0.m6379q(iM6366c) + iM6366c));
                    }
                    c1313k.m2022i(c6036w0.f19669a, iM6377o2, iM6366c, iM6377o);
                } else if (obj instanceof C6018n0) {
                    ((C6018n0) obj).m6502d();
                }
                break;
            default:
                Object objM6798d2 = c6277d.m6798d(0);
                int iM6796c4 = c6277d.m6796c(0);
                if (objM6798d2 instanceof C6036w0) {
                    ((ArrayList) c1313k.f3468c).add(((C6036w0) objM6798d2).f19669a);
                }
                int iM6370g2 = c5947d0.m6370g(c5947d0.m6356G(c5947d0.f19383t, iM6796c4));
                Object[] objArr2 = c5947d0.f19366c;
                Object obj2 = objArr2[iM6370g2];
                objArr2[iM6370g2] = objM6798d2;
                if (obj2 instanceof C6036w0) {
                    c1313k.m2022i(((C6036w0) obj2).f19669a, c5947d0.m6377o() - c5947d0.m6356G(c5947d0.f19383t, iM6796c4), -1, -1);
                } else if (obj2 instanceof C6018n0) {
                    ((C6018n0) obj2).m6502d();
                }
                break;
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: b */
    public final String mo6758b(int i10) {
        switch (this.f20422c) {
            case 0:
                return AbstractC9180O.m9737b(i10, 0) ? "insertIndex" : super.mo6758b(i10);
            case 1:
                return AbstractC9180O.m9737b(i10, 0) ? "insertIndex" : super.mo6758b(i10);
            case 2:
                return AbstractC9180O.m9737b(i10, 0) ? "groupSlotIndex" : super.mo6758b(i10);
            default:
                return AbstractC9180O.m9737b(i10, 0) ? "groupSlotIndex" : super.mo6758b(i10);
        }
    }

    @Override // p370P0.AbstractC6276C
    /* JADX INFO: renamed from: c */
    public final String mo6759c(int i10) {
        switch (this.f20422c) {
            case 0:
                if (AbstractC9186P.m9747a(i10, 0)) {
                    return "factory";
                }
                return AbstractC9186P.m9747a(i10, 1) ? "groupAnchor" : super.mo6759c(i10);
            case 1:
                return AbstractC9186P.m9747a(i10, 0) ? "groupAnchor" : super.mo6759c(i10);
            case 2:
                if (AbstractC9186P.m9747a(i10, 0)) {
                    return "value";
                }
                return AbstractC9186P.m9747a(i10, 1) ? "anchor" : super.mo6759c(i10);
            default:
                return AbstractC9186P.m9747a(i10, 0) ? "value" : super.mo6759c(i10);
        }
    }
}
