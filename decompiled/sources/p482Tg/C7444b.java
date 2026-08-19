package p482Tg;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC7870D5;
import p523V9.AbstractC8063c5;
import p571X9.AbstractC9292g4;
import p594Y9.AbstractC9997x4;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Tg.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C7444b extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23560Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f23561Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f23562o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f23563p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7444b(String str, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f23560Y = i11;
        this.f23561Z = str;
        this.f23562o0 = interfaceC10459q;
        this.f23563p0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f23560Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC9292g4.m9868a(this.f23561Z, this.f23562o0, c6021p, C5997d.m6447d0(this.f23563p0 | 1));
                break;
            case 1:
                AbstractC7870D5.m8147a(this.f23561Z, this.f23562o0, c6021p, C5997d.m6447d0(this.f23563p0 | 1));
                break;
            case 2:
                AbstractC7870D5.m8147a(this.f23561Z, this.f23562o0, c6021p, C5997d.m6447d0(this.f23563p0 | 1));
                break;
            case 3:
                AbstractC9997x4.m10638a(this.f23561Z, this.f23562o0, c6021p, C5997d.m6447d0(this.f23563p0 | 1));
                break;
            default:
                AbstractC8063c5.m8464g(this.f23561Z, this.f23562o0, c6021p, C5997d.m6447d0(this.f23563p0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
