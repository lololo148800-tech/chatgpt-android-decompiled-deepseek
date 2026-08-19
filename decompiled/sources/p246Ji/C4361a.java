package p246Ji;

import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p229J0.C3880A3;
import p349O0.C5997d;
import p349O0.C6021p;
import p544W9.AbstractC8739x2;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Ji.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C4361a extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f14181Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ List f14182Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC1426a f14183o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC10459q f14184p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3880A3 f14185q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ int f14186r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4361a(List list, InterfaceC1426a interfaceC1426a, InterfaceC10459q interfaceC10459q, C3880A3 c3880a3, int i10, int i11) {
        super(2);
        this.f14181Y = i11;
        this.f14182Z = list;
        this.f14183o0 = interfaceC1426a;
        this.f14184p0 = interfaceC10459q;
        this.f14185q0 = c3880a3;
        this.f14186r0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f14181Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC8739x2.m9472a(this.f14182Z, this.f14183o0, this.f14184p0, this.f14185q0, (C6021p) obj, C5997d.m6447d0(this.f14186r0 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                AbstractC8739x2.m9472a(this.f14182Z, this.f14183o0, this.f14184p0, this.f14185q0, (C6021p) obj, C5997d.m6447d0(this.f14186r0 | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
