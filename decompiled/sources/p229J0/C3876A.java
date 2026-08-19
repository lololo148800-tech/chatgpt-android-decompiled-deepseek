package p229J0;

import androidx.compose.p650ui.layout.AbstractC10868a;
import com.withpersona.sdk2.inquiry.network.dto.p686ui.UiComponentConfig;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC16544l;
import p037B9.MeDP.MpoABj;
import p102Dm.AbstractC2119a;
import p1071w0.AbstractC20734X;
import p1095x1.AbstractC21069X;
import p1095x1.AbstractC21076c;
import p1095x1.C21094o;
import p1095x1.InterfaceC21056J;
import p1095x1.InterfaceC21057K;
import p1095x1.InterfaceC21058L;
import p1095x1.InterfaceC21059M;
import p1095x1.InterfaceC21095p;
import p492U1.C7536a;
import p909nm.C17690x;
import p911o0.InterfaceC17760h;
import p911o0.InterfaceC17766k;

/* JADX INFO: renamed from: J0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C3876A implements InterfaceC21057K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC4045e3 f11719a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC17760h f11720b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC17766k f11721c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f11722d;

    public C3876A(InterfaceC4045e3 interfaceC4045e3, InterfaceC17760h interfaceC17760h, InterfaceC17766k interfaceC17766k, int i10) {
        this.f11719a = interfaceC4045e3;
        this.f11720b = interfaceC17760h;
        this.f11721c = interfaceC17766k;
        this.f11722d = i10;
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int mo1119a(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21232c(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int mo1120b(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21240k(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int mo1122d(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21236g(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int mo1123e(InterfaceC21095p interfaceC21095p, List list, int i10) {
        return AbstractC20734X.m21244o(this, interfaceC21095p, list, i10);
    }

    @Override // p1095x1.InterfaceC21057K
    /* JADX INFO: renamed from: c */
    public final InterfaceC21058L mo1121c(InterfaceC21059M interfaceC21059M, List list, long j10) {
        int iM7854i;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            InterfaceC21056J interfaceC21056J = (InterfaceC21056J) list.get(i10);
            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J), MpoABj.LxsEwec)) {
                AbstractC21069X abstractC21069XMo21533p = interfaceC21056J.mo21533p(C7536a.m7847b(j10, 0, 0, 0, 0, 14));
                int size2 = list.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    InterfaceC21056J interfaceC21056J2 = (InterfaceC21056J) list.get(i11);
                    if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J2), "actionIcons")) {
                        AbstractC21069X abstractC21069XMo21533p2 = interfaceC21056J2.mo21533p(C7536a.m7847b(j10, 0, 0, 0, 0, 14));
                        if (C7536a.m7854i(j10) == Integer.MAX_VALUE) {
                            iM7854i = C7536a.m7854i(j10);
                        } else {
                            iM7854i = (C7536a.m7854i(j10) - abstractC21069XMo21533p.f66981Y) - abstractC21069XMo21533p2.f66981Y;
                            if (iM7854i < 0) {
                                iM7854i = 0;
                            }
                        }
                        int i12 = iM7854i;
                        int size3 = list.size();
                        for (int i13 = 0; i13 < size3; i13++) {
                            InterfaceC21056J interfaceC21056J3 = (InterfaceC21056J) list.get(i13);
                            if (AbstractC16544l.m18089b(AbstractC10868a.m11315a(interfaceC21056J3), UiComponentConfig.Title.type)) {
                                AbstractC21069X abstractC21069XMo21533p3 = interfaceC21056J3.mo21533p(C7536a.m7847b(j10, 0, i12, 0, 0, 12));
                                C21094o c21094o = AbstractC21076c.f66995b;
                                int iMo21547H = abstractC21069XMo21533p3.mo21547H(c21094o) != Integer.MIN_VALUE ? abstractC21069XMo21533p3.mo21547H(c21094o) : 0;
                                float fMo4606a = this.f11719a.mo4606a();
                                int iM7853h = C7536a.m7853h(j10) == Integer.MAX_VALUE ? C7536a.m7853h(j10) : C7536a.m7853h(j10) + (Float.isNaN(fMo4606a) ? 0 : AbstractC2119a.m3195i(fMo4606a));
                                return interfaceC21059M.mo19936R(C7536a.m7854i(j10), iM7853h, C17690x.f56481Y, new C4167z(abstractC21069XMo21533p, iM7853h, abstractC21069XMo21533p3, this.f11720b, j10, abstractC21069XMo21533p2, interfaceC21059M, this.f11721c, this.f11722d, iMo21547H));
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
