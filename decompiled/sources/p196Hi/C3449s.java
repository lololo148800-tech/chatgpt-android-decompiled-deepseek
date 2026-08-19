package p196Hi;

import com.openai.voice.assistant.AbstractC12590a;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p349O0.C5997d;
import p349O0.C6021p;
import p523V9.AbstractC8047a5;
import p635a1.InterfaceC10459q;

/* JADX INFO: renamed from: Hi.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C3449s extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10485Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC1436k f10486Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10459q f10487o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ int f10488p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ int f10489q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3449s(InterfaceC1436k interfaceC1436k, InterfaceC10459q interfaceC10459q, int i10, int i11, int i12) {
        super(2);
        this.f10485Y = i12;
        this.f10486Z = interfaceC1436k;
        this.f10487o0 = interfaceC10459q;
        this.f10488p0 = i10;
        this.f10489q0 = i11;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f10485Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f10488p0 | 1);
                AbstractC12590a.m14403b(this.f10486Z, this.f10487o0, c6021p, iM6447d0, this.f10489q0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f10488p0 | 1);
                AbstractC8047a5.m8432e(this.f10486Z, this.f10487o0, c6021p, iM6447d1, this.f10489q0);
                break;
            default:
                int iM6447d2 = C5997d.m6447d0(this.f10488p0 | 1);
                AbstractC8047a5.m8432e(this.f10486Z, this.f10487o0, c6021p, iM6447d2, this.f10489q0);
                break;
        }
        return C17296C.f55119a;
    }
}
