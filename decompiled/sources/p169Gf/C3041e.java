package p169Gf;

import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p403Qd.EnumC6606L;
import p523V9.AbstractC7981R5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Gf.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3041e extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f9145Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EnumC6606L f9146Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f9147o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f9148p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ boolean f9149q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f9150r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ int f9151s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3041e(EnumC6606L enumC6606L, InterfaceC10459q interfaceC10459q, String str, boolean z6, int i10, int i11, int i12) {
        super(2);
        this.f9145Y = i12;
        this.f9146Z = enumC6606L;
        this.f9147o0 = interfaceC10459q;
        this.f9148p0 = str;
        this.f9149q0 = z6;
        this.f9150r0 = i10;
        this.f9151s0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9145Y) {
            case 0:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f9150r0 | 1);
                InterfaceC10459q interfaceC10459q = this.f9147o0;
                AbstractC7981R5.m8284a(this.f9146Z, interfaceC10459q, this.f9148p0, this.f9149q0, (C6021p) obj, iM6447d0, this.f9151s0);
                break;
            default:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f9150r0 | 1);
                InterfaceC10459q interfaceC10459q2 = this.f9147o0;
                AbstractC7981R5.m8284a(this.f9146Z, interfaceC10459q2, this.f9148p0, this.f9149q0, (C6021p) obj, iM6447d1, this.f9151s0);
                break;
        }
        return C17296C.f55119a;
    }
}
