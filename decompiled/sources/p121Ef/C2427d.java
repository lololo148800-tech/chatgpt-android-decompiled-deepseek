package p121Ef;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7877E4;
import p544W9.AbstractC8634g;
import p544W9.AbstractC8651i4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ef.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C2427d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f7545Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ Object f7546Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f7547o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ boolean f7548p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f7549q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f7550r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2427d(int i10, String str, boolean z6, InterfaceC10459q interfaceC10459q, int i11) {
        super(2);
        this.f7545Y = 0;
        this.f7549q0 = i10;
        this.f7546Z = str;
        this.f7548p0 = z6;
        this.f7547o0 = interfaceC10459q;
        this.f7550r0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7545Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f7550r0 | 1);
                AbstractC7877E4.m8153b(this.f7549q0, iM6447d0, (C6021p) obj, this.f7547o0, (String) this.f7546Z, this.f7548p0);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f7549q0 | 1);
                AbstractC8651i4.m9323a(iM6447d1, this.f7550r0, (C6021p) obj, this.f7547o0, (String) this.f7546Z, this.f7548p0);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iM6447d2 = C5997d.m6447d0(this.f7549q0 | 1);
                AbstractC8651i4.m9323a(iM6447d2, this.f7550r0, (C6021p) obj, this.f7547o0, (String) this.f7546Z, this.f7548p0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d3 = C5997d.m6447d0(this.f7549q0 | 1);
                InterfaceC1426a interfaceC1426a = (InterfaceC1426a) this.f7546Z;
                AbstractC8634g.m9289c(interfaceC1426a, this.f7547o0, this.f7548p0, (C6021p) obj, iM6447d3, this.f7550r0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2427d(Object obj, InterfaceC10459q interfaceC10459q, boolean z6, int i10, int i11, int i12) {
        super(2);
        this.f7545Y = i12;
        this.f7546Z = obj;
        this.f7547o0 = interfaceC10459q;
        this.f7548p0 = z6;
        this.f7549q0 = i10;
        this.f7550r0 = i11;
    }
}
