package p193Hf;

import bf.C11363S;
import com.openai.feature.conversations.impl.input.AbstractC12341a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8136l6;
import p537W0.C8410b;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hf.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3371i0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10292Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f10293Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ boolean f10294o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f10295p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f10296q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ Object f10297r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3371i0(Object obj, boolean z6, boolean z10, Object obj2, int i10, int i11) {
        super(2);
        this.f10292Y = i11;
        this.f10296q0 = obj;
        this.f10293Z = z6;
        this.f10294o0 = z10;
        this.f10297r0 = obj2;
        this.f10295p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f10292Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8136l6.m8660a((String) this.f10296q0, this.f10293Z, this.f10294o0, (InterfaceC10459q) this.f10297r0, (C6021p) obj, C5997d.m6447d0(this.f10295p0 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC8090g0.m8554m((C11363S) this.f10296q0, this.f10293Z, this.f10294o0, (InterfaceC1436k) this.f10297r0, (C6021p) obj, C5997d.m6447d0(this.f10295p0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f10295p0 | 1);
                C8410b c8410b = (C8410b) this.f10296q0;
                AbstractC12341a.m14271h(this.f10293Z, this.f10294o0, (InterfaceC10459q) this.f10297r0, c8410b, (C6021p) obj, iM6447d0);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3371i0(boolean z6, boolean z10, InterfaceC10459q interfaceC10459q, C8410b c8410b, int i10) {
        super(2);
        this.f10292Y = 2;
        this.f10293Z = z6;
        this.f10294o0 = z10;
        this.f10297r0 = interfaceC10459q;
        this.f10296q0 = c8410b;
        this.f10295p0 = i10;
    }
}
