package p870le;

import com.openai.feature.conversations.input.InputViewModel;
import mm.C17296C;
import p003A1.C0190N0;
import p003A1.InterfaceC0300w1;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1025te.C19853D;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9268c4;
import p737f1.C13522n;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: le.P */
/* JADX INFO: loaded from: classes3.dex */
public final class C16859P extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C13522n f54085Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InterfaceC0300w1 f54086Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InputViewModel f54087o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16859P(C13522n c13522n, InterfaceC0300w1 interfaceC0300w1, InputViewModel inputViewModel, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f54085Y = c13522n;
        this.f54086Z = interfaceC0300w1;
        this.f54087o0 = inputViewModel;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C16859P(this.f54085Y, this.f54086Z, this.f54087o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C16859P c16859p = (C16859P) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c16859p.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        AbstractC9268c4.m9841b(this.f54085Y);
        InterfaceC0300w1 interfaceC0300w1 = this.f54086Z;
        if (interfaceC0300w1 != null) {
            ((C0190N0) interfaceC0300w1).m572b();
        }
        this.f54087o0.m14395k(C19853D.f62945a);
        return C17296C.f55119a;
    }
}
