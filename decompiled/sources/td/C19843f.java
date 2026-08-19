package td;

import android.content.Context;
import android.content.res.Configuration;
import com.openai.auth.AuthMismatchViewModel;
import com.openai.auth.SwitchAccountViewModel;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.C1837w0;
import p1025te.AbstractC19883n;
import p1025te.C19866Q;
import p1071w0.AbstractC20740b0;
import p1071w0.C20718K0;
import p1095x1.AbstractC21075b0;
import p1095x1.C21081e0;
import p1095x1.InterfaceC21057K;
import p349O0.C5997d;
import p349O0.C6021p;
import p479Td.EnumC7359j0;
import p523V9.AbstractC7878E5;
import p523V9.AbstractC7886F5;
import p523V9.AbstractC8238y4;
import p537W0.C8410b;
import p544W9.AbstractC8664l;
import p547Wc.EnumC8792f;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: td.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C19843f extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f62927Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f62928Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f62929o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f62930p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f62931q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19843f(Object obj, Object obj2, Object obj3, int i10, int i11) {
        super(2);
        this.f62927Y = i11;
        this.f62930p0 = obj;
        this.f62928Z = obj2;
        this.f62931q0 = obj3;
        this.f62929o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f62927Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC8238y4.m8881e((C19849l) this.f62930p0, (InterfaceC1436k) this.f62928Z, (InterfaceC1436k) this.f62931q0, c6021p, iM6447d0);
                break;
            case 1:
                AbstractC19883n.m20787b((C19866Q) this.f62930p0, (InterfaceC1436k) this.f62928Z, (InterfaceC10459q) this.f62931q0, c6021p, C5997d.m6447d0(this.f62929o0 | 1));
                break;
            case 2:
                int iM6447d1 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC20740b0.m21266g((InterfaceC10459q) this.f62930p0, (C1837w0) this.f62928Z, (C8410b) this.f62931q0, c6021p, iM6447d1);
                break;
            case 3:
                Object[] objArr = (Object[]) this.f62931q0;
                ((C20718K0) this.f62930p0).m21221b(Arrays.copyOf(objArr, objArr.length), (InterfaceC1436k) this.f62928Z, c6021p, C5997d.m6447d0(this.f62929o0 | 1));
                break;
            case 4:
                int iM6447d2 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC21075b0.m21560a((InterfaceC10459q) this.f62930p0, (C8410b) this.f62928Z, (InterfaceC21057K) this.f62931q0, c6021p, iM6447d2);
                break;
            case 5:
                int iM6447d3 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC21075b0.m21563d((C21081e0) this.f62930p0, (InterfaceC10459q) this.f62928Z, (InterfaceC1439n) this.f62931q0, c6021p, iM6447d3);
                break;
            case 6:
                int iM6447d4 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC7878E5.m8160a((EnumC7359j0) this.f62930p0, (EnumC8792f) this.f62928Z, (InterfaceC10459q) this.f62931q0, c6021p, iM6447d4);
                break;
            case 7:
                int iM6447d5 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC7886F5.m8179b((Configuration) this.f62930p0, (Context) this.f62928Z, (C8410b) this.f62931q0, c6021p, iM6447d5);
                break;
            default:
                int iM6447d6 = C5997d.m6447d0(this.f62929o0 | 1);
                AbstractC8664l.m9360a((InterfaceC10459q) this.f62930p0, (SwitchAccountViewModel) this.f62928Z, (AuthMismatchViewModel) this.f62931q0, c6021p, iM6447d6);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19843f(C20718K0 c20718k0, Object[] objArr, InterfaceC1436k interfaceC1436k, int i10) {
        super(2);
        this.f62927Y = 3;
        this.f62930p0 = c20718k0;
        this.f62931q0 = objArr;
        this.f62928Z = interfaceC1436k;
        this.f62929o0 = i10;
    }
}
