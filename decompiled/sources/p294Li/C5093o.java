package p294Li;

import com.openai.voice.settings.VoiceModeSettingsViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Li.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C5093o extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ VoiceModeSettingsViewModel f16662Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5093o(VoiceModeSettingsViewModel voiceModeSettingsViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f16662Y = voiceModeSettingsViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C5093o(this.f16662Y, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C5093o c5093o = (C5093o) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c5093o.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        this.f16662Y.m14395k(C5096r.f16667a);
        return C17296C.f55119a;
    }
}
