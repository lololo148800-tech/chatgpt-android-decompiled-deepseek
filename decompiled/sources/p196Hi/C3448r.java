package p196Hi;

import com.openai.voice.VoiceModeViewModel;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p059C5.C1592j;
import p1014t1.C19723A;
import p124Ei.C2471P0;
import p193Hf.C3350b0;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p860l0.AbstractC16689K1;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Hi.r */
/* JADX INFO: loaded from: classes3.dex */
public final class C3448r extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f10481Y;

    /* JADX INFO: renamed from: Z */
    public /* synthetic */ Object f10482Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceModeViewModel f10483o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f10484p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3448r(VoiceModeViewModel voiceModeViewModel, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f10483o0 = voiceModeViewModel;
        this.f10484p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C3448r c3448r = new C3448r(this.f10483o0, this.f10484p0, interfaceC18770c);
        c3448r.f10482Z = obj;
        return c3448r;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3448r) create((C19723A) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f10481Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C19723A c19723a = (C19723A) this.f10482Z;
            VoiceModeViewModel voiceModeViewModel = this.f10483o0;
            InterfaceC5985X interfaceC5985X = this.f10484p0;
            C3350b0 c3350b0 = new C3350b0(voiceModeViewModel, 3, interfaceC5985X);
            C1592j c1592j = new C1592j(voiceModeViewModel, interfaceC5985X, null, 7);
            C2471P0 c2471p0 = new C2471P0(voiceModeViewModel, 2);
            this.f10481Y = 1;
            if (AbstractC16689K1.m18508e(c19723a, c3350b0, c1592j, c2471p0, this, 1) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        return C17296C.f55119a;
    }
}
