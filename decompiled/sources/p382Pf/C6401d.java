package p382Pf;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC10842a;
import bf.InterfaceC11374b0;
import com.openai.feature.conversations.impl.compliance.ComplianceViewModel;
import com.openai.feature.disclosure.DisclosureViewModel;
import com.openai.feature.gizmos.impl.store.GizmoPreviewViewModel;
import com.openai.feature.gizmos.impl.store.GizmoStoreViewModel;
import com.openai.feature.notification.NotificationSettingsViewModel;
import com.openai.feature.oauth.impl.AipOauthViewModel;
import com.openai.feature.onboarding.impl.viewmodel.VerifyEmailLinkViewModel;
import com.openai.feature.onboarding.impl.viewmodel.VerifyPhoneViewModel;
import com.openai.feature.onboarding.viewmodel.VerifyEmailCodeViewModel;
import com.openai.feature.settings.impl.memory.MemorySettingsViewModel;
import com.openai.feature.subscriptions.ChoosePlanViewModel;
import java.util.Arrays;
import ki.AbstractC16421b;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import nf.C17608g;
import p003A1.AbstractC0168G;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1439n;
import p1042uh.C20263a0;
import p1095x1.AbstractC21075b0;
import p1140z1.C21694h;
import p1140z1.C21696i;
import p1140z1.C21698j;
import p1140z1.InterfaceC21700k;
import p1155zi.C21958S;
import p349O0.C5997d;
import p349O0.C6021p;
import p349O0.C6042z0;
import p349O0.InterfaceC6008i0;
import p360Od.C6172d;
import p507Uh.C7677c;
import p523V9.AbstractC7973Q4;
import p523V9.AbstractC8025X4;
import p523V9.AbstractC8050b0;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8167p5;
import p537W0.C8410b;
import p544W9.AbstractC8476F2;
import p544W9.AbstractC8482G2;
import p544W9.AbstractC8646i;
import p571X9.AbstractC9100A3;
import p571X9.AbstractC9159K2;
import p571X9.AbstractC9174N;
import p571X9.AbstractC9236X2;
import p571X9.AbstractC9242Y2;
import p571X9.AbstractC9258b0;
import p594Y9.AbstractC9815U2;
import p594Y9.AbstractC9830X;
import p594Y9.AbstractC9943o4;
import p624Zg.AbstractC10374j;
import p635a1.C10456n;
import p635a1.InterfaceC10459q;
import p705dd.EnumC13068a;
import p758g0.C13771k0;
import p810ig.AbstractC14993l;
import p842k0.C16293b;
import p842k0.C16300i;
import p872lg.C16946f;
import p911o0.AbstractC17780r;
import p911o0.C17767k0;
import p911o0.C17782s;
import p946pc.AbstractC18322G;
import p946pc.AbstractC18338d;
import p946pc.C18320E;
import p946pc.C18321F;
import p946pc.C18336b;
import p953q0.InterfaceC18554L;
import ph.C18417e;

/* JADX INFO: renamed from: Pf.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C6401d extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f20827Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f20828Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f20829o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f20830p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6401d(int i10, Object obj, InterfaceC18554L interfaceC18554L) {
        super(2);
        this.f20827Y = 29;
        this.f20829o0 = interfaceC18554L;
        this.f20828Z = i10;
        this.f20830p0 = obj;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f20827Y) {
            case 0:
                ((Number) obj2).intValue();
                AbstractC9258b0.m9832b((C6172d) this.f20829o0, (InterfaceC1426a) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                AbstractC9159K2.m9707a((InterfaceC10459q) this.f20829o0, (MemorySettingsViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                AbstractC9242Y2.m9816a((InterfaceC10459q) this.f20829o0, (DisclosureViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                AbstractC9100A3.m9627a((InterfaceC10459q) this.f20829o0, (NotificationSettingsViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                AbstractC9830X.m10472a((C7677c) this.f20829o0, (InterfaceC1426a) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                AbstractC9815U2.m10445d((C20263a0) this.f20829o0, (InterfaceC10459q) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 6:
                ((Number) obj2).intValue();
                AbstractC9815U2.m10448g((InterfaceC11374b0) this.f20829o0, (InterfaceC10459q) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 7:
                ((Number) obj2).intValue();
                ((C8410b) this.f20829o0).m8962a(this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z) | 1);
                break;
            case 8:
                ((Number) obj2).intValue();
                AbstractC9943o4.m10602a((InterfaceC10459q) this.f20829o0, (AipOauthViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 9:
                ((Number) obj2).intValue();
                AbstractC10374j.m10887a((InterfaceC10459q) this.f20829o0, (ChoosePlanViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 10:
                ((Number) obj2).intValue();
                AbstractC8050b0.m8442c((InterfaceC10459q) this.f20829o0, (GizmoPreviewViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 11:
                ((Number) obj2).intValue();
                AbstractC8090g0.m8547f((InterfaceC10459q) this.f20829o0, (GizmoStoreViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 12:
                ((Number) obj2).intValue();
                AbstractC7973Q4.m8271a((EnumC13068a) this.f20829o0, (InterfaceC10459q) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 13:
                ((Number) obj2).intValue();
                AbstractC8025X4.m8367b((C21958S) this.f20829o0, (InterfaceC1426a) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 14:
                ((Number) obj2).intValue();
                AbstractC8167p5.m8743c((InterfaceC10459q) this.f20829o0, (ComplianceViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 15:
                ((Number) obj2).intValue();
                ((C13771k0) this.f20829o0).m15270a(this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 16:
                ((Number) obj2).intValue();
                AbstractC8646i.m9319c((InterfaceC1426a) this.f20830p0, (InterfaceC1426a) this.f20829o0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 17:
                ((Number) obj2).intValue();
                AbstractC8476F2.m9109b((InterfaceC10459q) this.f20829o0, (VerifyEmailLinkViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 18:
                ((Number) obj2).intValue();
                AbstractC8482G2.m9127a((InterfaceC10459q) this.f20829o0, (VerifyPhoneViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 19:
                ((Number) obj2).intValue();
                AbstractC14993l.m16131b((C16946f) this.f20829o0, (InterfaceC10459q) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 20:
                ((Number) obj2).intValue();
                ((C16300i) this.f20829o0).m17826a((C16293b) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 21:
                ((Number) obj2).intValue();
                Object[] objArr = (Object[]) this.f20829o0;
                AbstractC16421b.m18008a(Arrays.copyOf(objArr, objArr.length), (C8410b) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 22:
                ((Number) obj2).intValue();
                AbstractC9174N.m9729a((InterfaceC10459q) this.f20829o0, (VerifyEmailCodeViewModel) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 23:
                ((Number) obj2).intValue();
                AbstractC9236X2.m9808a((C17608g) this.f20829o0, (InterfaceC1426a) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 24:
                ((Number) obj2).intValue();
                ((C18336b) this.f20829o0).m19853a((C18320E) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            case 25:
                ((Number) obj2).intValue();
                int iM6447d0 = C5997d.m6447d0(this.f20828Z | 1);
                AbstractC18338d.m19854a((C18320E) this.f20829o0, (C8410b) this.f20830p0, (C6021p) obj, iM6447d0);
                break;
            case 26:
                C6021p c6021p = (C6021p) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && c6021p.m6562y()) {
                    c6021p.m6517L();
                } else {
                    for (int i10 = 0; i10 < this.f20828Z; i10++) {
                        InterfaceC10459q interfaceC10459qM11232j = AbstractC10842a.m11232j(C10456n.f30959Y, (C17767k0) this.f20829o0);
                        c6021p.m6525T(733328855);
                        C17782s c17782sM19512f = AbstractC17780r.m19512f(0, c6021p, false);
                        c6021p.m6525T(-1323940314);
                        int i11 = c6021p.f19564P;
                        InterfaceC6008i0 interfaceC6008i0M6550m = c6021p.m6550m();
                        InterfaceC21700k.f68875m0.getClass();
                        C21696i c21696i = C21698j.f68869b;
                        C8410b c8410bM21570k = AbstractC21075b0.m21570k(interfaceC10459qM11232j);
                        c6021p.m6528W();
                        if (c6021p.f19563O) {
                            c6021p.m6549l(c21696i);
                        } else {
                            c6021p.m6543f0();
                        }
                        C5997d.m6439Z(C21698j.f68873f, c6021p, c17782sM19512f);
                        C5997d.m6439Z(C21698j.f68872e, c6021p, interfaceC6008i0M6550m);
                        C21694h c21694h = C21698j.f68874g;
                        if (c6021p.f19563O || !AbstractC16544l.m18089b(c6021p.m6514H(), Integer.valueOf(i11))) {
                            AbstractC0168G.m537z(i11, c6021p, i11, c21694h);
                        }
                        c8410bM21570k.invoke(new C6042z0(c6021p), c6021p, 0);
                        c6021p.m6525T(2058660585);
                        ((C8410b) this.f20830p0).invoke(Integer.valueOf(i10), c6021p, 0);
                        c6021p.m6553p(false);
                        c6021p.m6553p(true);
                        c6021p.m6553p(false);
                        c6021p.m6553p(false);
                    }
                }
                break;
            case 27:
                ((Number) obj2).intValue();
                int iM6447d1 = C5997d.m6447d0(this.f20828Z | 1);
                AbstractC18322G.m19848a((C18321F) this.f20829o0, (C8410b) this.f20830p0, (C6021p) obj, iM6447d1);
                break;
            case 28:
                ((Number) obj2).intValue();
                ((C18417e) this.f20829o0).m19873c((Context) this.f20830p0, (C6021p) obj, C5997d.m6447d0(this.f20828Z | 1));
                break;
            default:
                C6021p c6021p2 = (C6021p) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && c6021p2.m6562y()) {
                    c6021p2.m6517L();
                } else {
                    ((InterfaceC18554L) this.f20829o0).mo5914e(this.f20828Z, this.f20830p0, c6021p2, 0);
                }
                break;
        }
        return C17296C.f55119a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6401d(int i10, C17767k0 c17767k0, C8410b c8410b) {
        super(2);
        this.f20827Y = 26;
        this.f20828Z = i10;
        this.f20829o0 = c17767k0;
        this.f20830p0 = c8410b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6401d(InterfaceC1426a interfaceC1426a, InterfaceC1426a interfaceC1426a2, int i10) {
        super(2);
        this.f20827Y = 16;
        this.f20830p0 = interfaceC1426a;
        this.f20829o0 = interfaceC1426a2;
        this.f20828Z = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6401d(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f20827Y = i11;
        this.f20829o0 = obj;
        this.f20830p0 = obj2;
        this.f20828Z = i10;
    }
}
