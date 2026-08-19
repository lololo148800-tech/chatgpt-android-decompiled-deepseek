package p017Af;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8086f4;
import p523V9.AbstractC8130l0;
import p523V9.AbstractC8238y4;
import p547Wc.AbstractC8757A;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Af.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C0469P extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f1520Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ String f1521Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f1522o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f1523p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f1524q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469P(InterfaceC1426a interfaceC1426a, String str, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f1520Y = i11;
        this.f1522o0 = interfaceC1426a;
        this.f1521Z = str;
        this.f1523p0 = interfaceC10459q;
        this.f1524q0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f1520Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AbstractC8130l0.m8647b(C5997d.m6447d0(this.f1524q0 | 1), this.f1522o0, c6021p, this.f1523p0, this.f1521Z);
                break;
            case 1:
                AbstractC8757A.m9521b(C5997d.m6447d0(this.f1524q0 | 1), this.f1522o0, c6021p, this.f1523p0, this.f1521Z);
                break;
            case 2:
                AbstractC8086f4.m8517d(C5997d.m6447d0(this.f1524q0 | 1), this.f1522o0, c6021p, this.f1523p0, this.f1521Z);
                break;
            case 3:
                AbstractC8238y4.m8877a(C5997d.m6447d0(this.f1524q0 | 1), this.f1522o0, c6021p, this.f1523p0, this.f1521Z);
                break;
            default:
                AbstractC8238y4.m8878b(C5997d.m6447d0(this.f1524q0 | 1), this.f1522o0, c6021p, this.f1523p0, this.f1521Z);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0469P(String str, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f1520Y = i11;
        this.f1521Z = str;
        this.f1522o0 = interfaceC1426a;
        this.f1523p0 = interfaceC10459q;
        this.f1524q0 = i10;
    }
}
