package p003A1;

import androidx.compose.p650ui.platform.AndroidComposeView;
import androidx.compose.p650ui.platform.AndroidCompositionLocals_androidKt;
import com.openai.chatgpt.AbstractC12214a;
import com.openai.feature.serverstatus.impl.failwhale.FailwhaleViewModel;
import com.openai.feature.serverstatus.impl.sunset.SunsetViewModel;
import com.openai.feature.serverstatus.impl.unsupportedcountry.UnsupportedCountryViewModel;
import com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModel;
import com.openai.feature.settings.impl.anonymous.AnonymousSettingsViewModel;
import com.openai.feature.settings.impl.data.DataControlsViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsEditViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsIntroductionViewModel;
import com.openai.feature.settings.impl.instructions.CustomInstructionsViewModel;
import com.openai.voice.assistant.AssistantViewModel;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p017Af.AbstractC0462I;
import p017Af.EnumC0463J;
import p040Bd.C0965N;
import p040Bd.C1031Y0;
import p040Bd.C1048a5;
import p040Bd.C1069d5;
import p040Bd.C1078f0;
import p040Bd.C1111j5;
import p040Bd.C1131n0;
import p040Bd.C1166t;
import p040Bd.C1168t1;
import p042Bf.AbstractC1277s;
import p049Bm.InterfaceC1426a;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p069Cf.AbstractC1652k;
import p072Ci.EnumC1711p;
import p124Ei.AbstractC2511g1;
import p124Ei.C2529m1;
import p124Ei.C2532n1;
import p196Hi.AbstractC3437g;
import p204I1.C3582M;
import p229J0.AbstractC4099n3;
import p229J0.AbstractC4124r4;
import p295Lj.AbstractC5103c;
import p349O0.C5997d;
import p349O0.C6014l0;
import p349O0.C6021p;
import p362Of.AbstractC6196k;
import p523V9.AbstractC7877E4;
import p523V9.AbstractC7885F4;
import p523V9.AbstractC8005U5;
import p523V9.AbstractC8010V3;
import p523V9.AbstractC8018W4;
import p523V9.AbstractC8090g0;
import p523V9.AbstractC8106i0;
import p537W0.C8410b;
import p544W9.AbstractC8484G4;
import p544W9.AbstractC8497J;
import p544W9.AbstractC8532O4;
import p544W9.AbstractC8656j3;
import p544W9.AbstractC8724v;
import p547Wc.AbstractC8757A;
import p571X9.AbstractC9258b0;
import p575Xd.C9466y;
import p586Y0.C9566r;
import p635a1.InterfaceC10459q;
import ug.AbstractC20236s;

/* JADX INFO: renamed from: A1.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257i0 extends AbstractC16546n implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f961Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f962Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f963o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f964p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0257i0(Object obj, Object obj2, int i10, int i11) {
        super(2);
        this.f961Y = i11;
        this.f963o0 = obj;
        this.f964p0 = obj2;
        this.f962Z = i10;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f961Y;
        C6021p c6021p = (C6021p) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                AndroidCompositionLocals_androidKt.m11353a((AndroidComposeView) this.f963o0, (C8410b) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 1:
                AbstractC5103c.m5666b((C9566r) this.f963o0, (Collection) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 2:
                AbstractC8090g0.m8553l((C0965N) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 3:
                AbstractC8106i0.m8587b((C1131n0) this.f963o0, (InterfaceC1436k) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 4:
                AbstractC0462I.m1111a((EnumC0463J) this.f963o0, (InterfaceC1436k) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 5:
                AbstractC0462I.m1113c((C1168t1) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 6:
                AbstractC12214a.m14223a((AbstractC20236s) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 7:
                AbstractC1277s.m1989a((C1166t) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 8:
                AbstractC1652k.m2489a((C1031Y0) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 9:
                AbstractC1652k.m2491c((C1048a5) this.f963o0, (C1069d5) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 10:
                AbstractC1652k.m2492d((C1111j5) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 11:
                AbstractC8010V3.m8322a((InterfaceC10459q) this.f963o0, (FailwhaleViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 12:
                AbstractC7877E4.m8154d((C1078f0) this.f963o0, (EnumC1711p) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 13:
                AbstractC7885F4.m8173a((InterfaceC10459q) this.f963o0, (SunsetViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 14:
                AbstractC2511g1.m3596h((C2532n1) this.f963o0, (InterfaceC1436k) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 15:
                AbstractC8018W4.m8346f((C2529m1) this.f963o0, (InterfaceC1436k) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 16:
                AbstractC8005U5.m8310a((InterfaceC10459q) this.f963o0, (UnsupportedCountryViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 17:
                AbstractC3437g.m4190a((InterfaceC1426a) this.f963o0, (AssistantViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 18:
                AbstractC8724v.m9443a((InterfaceC10459q) this.f963o0, (DeactivatedAccountViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 19:
                int iM6447d0 = C5997d.m6447d0(this.f962Z | 1);
                AbstractC4099n3.m4759c((InterfaceC1439n) this.f963o0, (C8410b) this.f964p0, c6021p, iM6447d0);
                break;
            case 20:
                AbstractC4124r4.m4767a((C3582M) this.f963o0, (InterfaceC1439n) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 21:
                AbstractC8497J.m9159a((InterfaceC10459q) this.f963o0, (AnonymousSettingsViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 22:
                AbstractC8656j3.m9333a((InterfaceC10459q) this.f963o0, (DataControlsViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 23:
                C6014l0[] c6014l0Arr = (C6014l0[]) this.f963o0;
                C5997d.m6442b((C6014l0[]) Arrays.copyOf(c6014l0Arr, c6014l0Arr.length), (InterfaceC1439n) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 24:
                C5997d.m6440a((C6014l0) this.f963o0, (InterfaceC1439n) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 25:
                AbstractC6196k.m6728e((C9466y) this.f963o0, (InterfaceC10459q) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 26:
                AbstractC8484G4.m9135b((InterfaceC10459q) this.f963o0, (CustomInstructionsEditViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 27:
                AbstractC8532O4.m9196c((InterfaceC10459q) this.f963o0, (CustomInstructionsIntroductionViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            case 28:
                AbstractC8757A.m9522c((InterfaceC10459q) this.f963o0, (CustomInstructionsViewModel) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
            default:
                AbstractC9258b0.m9831a((List) this.f963o0, (InterfaceC1426a) this.f964p0, c6021p, C5997d.m6447d0(this.f962Z | 1));
                break;
        }
        return C17296C.f55119a;
    }
}
