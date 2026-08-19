package p039Bc;

import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.InterfaceC17302e;
import p002A0.C0120T;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p080D0.AbstractC1807h0;
import p080D0.C1837w0;
import p1042uh.C20263a0;
import p1062vd.C20571u;
import p1071w0.AbstractC20740b0;
import p1155zi.C21891A;
import p349O0.C5997d;
import p349O0.C6021p;
import p467T1.EnumC7198h;
import p502Uc.AbstractC7622f;
import p523V9.AbstractC8063c5;
import p523V9.AbstractC8152n6;
import p523V9.AbstractC8194t0;
import p537W0.C8410b;
import p544W9.AbstractC8652j;
import p544W9.AbstractC8662k3;
import p547Wc.AbstractC8757A;
import p635a1.InterfaceC10459q;
import p664bc.AbstractC11336c;
import p870le.AbstractC16854K;
import p911o0.InterfaceC17763i0;
import p946pc.C18320E;

/* JADX INFO: renamed from: Bc.t */
/* JADX INFO: loaded from: classes3.dex */
public final class C0886t extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f2605Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ boolean f2606Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f2607o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f2608p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ Object f2609q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0886t(Object obj, boolean z6, InterfaceC10459q interfaceC10459q, int i10, int i11) {
        super(2);
        this.f2605Y = i11;
        this.f2609q0 = obj;
        this.f2606Z = z6;
        this.f2608p0 = interfaceC10459q;
        this.f2607o0 = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2605Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                int iM6447d0 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC8194t0.m8795a(this.f2606Z, (InterfaceC10459q) this.f2608p0, (ConversationViewModel) this.f2609q0, c6021p, iM6447d0);
                break;
            case 1:
                int iM6447d1 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC1807h0.m2619h(this.f2606Z, (EnumC7198h) this.f2608p0, (C1837w0) this.f2609q0, c6021p, iM6447d1);
                break;
            case 2:
                AbstractC8152n6.m8699c((C21891A) this.f2609q0, this.f2606Z, (InterfaceC10459q) this.f2608p0, c6021p, C5997d.m6447d0(this.f2607o0 | 1));
                break;
            case 3:
                int iM6447d2 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC8662k3.m9353d(this.f2606Z, (InterfaceC17763i0) this.f2608p0, (C8410b) this.f2609q0, c6021p, iM6447d2);
                break;
            case 4:
                int iM6447d3 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC7622f.m7962a((String) this.f2608p0, this.f2606Z, (C8410b) this.f2609q0, c6021p, iM6447d3);
                break;
            case 5:
                AbstractC8757A.m9524e(this.f2609q0, this.f2606Z, (InterfaceC10459q) this.f2608p0, c6021p, C5997d.m6447d0(this.f2607o0 | 1));
                break;
            case 6:
                int iM6447d4 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC8652j.m9328a((String) this.f2608p0, this.f2606Z, (InterfaceC1436k) this.f2609q0, c6021p, iM6447d4);
                break;
            case 7:
                int iM6447d5 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC16854K.m18577c((C20263a0) this.f2609q0, (InterfaceC10459q) this.f2608p0, this.f2606Z, c6021p, iM6447d5);
                break;
            case 8:
                int iM6447d6 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC11336c.m12771a((C18320E) this.f2608p0, this.f2606Z, (C8410b) this.f2609q0, c6021p, iM6447d6);
                break;
            case 9:
                int iM6447d7 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC8063c5.m8459b((C20571u) this.f2609q0, this.f2606Z, (InterfaceC10459q) this.f2608p0, c6021p, iM6447d7);
                break;
            default:
                int iM6447d8 = C5997d.m6447d0(this.f2607o0 | 1);
                AbstractC20740b0.m21262c((C0120T) this.f2608p0, this.f2606Z, (C8410b) this.f2609q0, c6021p, iM6447d8);
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0886t(Object obj, boolean z6, InterfaceC17302e interfaceC17302e, int i10, int i11) {
        super(2);
        this.f2605Y = i11;
        this.f2608p0 = obj;
        this.f2606Z = z6;
        this.f2609q0 = interfaceC17302e;
        this.f2607o0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0886t(C20263a0 c20263a0, InterfaceC10459q interfaceC10459q, boolean z6, int i10) {
        super(2);
        this.f2605Y = 7;
        this.f2609q0 = c20263a0;
        this.f2608p0 = interfaceC10459q;
        this.f2606Z = z6;
        this.f2607o0 = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0886t(boolean z6, Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f2605Y = i11;
        this.f2606Z = z6;
        this.f2608p0 = obj;
        this.f2609q0 = obj2;
        this.f2607o0 = i10;
    }
}
