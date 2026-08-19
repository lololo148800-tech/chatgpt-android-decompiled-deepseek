package p294Li;

import com.openai.voice.settings.VoiceModeSettingsViewModel;
import java.util.List;
import mm.C17296C;
import p001A.AbstractC0010F;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1000s0.C19408d;
import p172Gi.C3077j;
import p349O0.InterfaceC5985X;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17680n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Li.n */
/* JADX INFO: loaded from: classes3.dex */
public final class C5092n extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ List f16658Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C19408d f16659Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ VoiceModeSettingsViewModel f16660o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC5985X f16661p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5092n(List list, C19408d c19408d, VoiceModeSettingsViewModel voiceModeSettingsViewModel, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16658Y = list;
        this.f16659Z = c19408d;
        this.f16660o0 = voiceModeSettingsViewModel;
        this.f16661p0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5092n(this.f16658Y, this.f16659Z, this.f16660o0, this.f16661p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5092n c5092n = (C5092n) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5092n.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19408d c19408d = this.f16659Z;
        C3077j c3077j = (C3077j) AbstractC17680n.m19344T(c19408d.m20498j(), this.f16658Y);
        if (c3077j != null) {
            this.f16660o0.m14395k(new C5098t(c3077j));
            ((InterfaceC1436k) this.f16661p0.getValue()).invoke(c3077j);
        } else {
            AbstractC8160o6.m8727b(AbstractC5094p.f16664b, AbstractC0010F.m19c(c19408d.m20498j(), "Failed selecting voice at index ", ": Out of bounds index for voice selection."), null, 6);
        }
        return C17296C.f55119a;
    }
}
