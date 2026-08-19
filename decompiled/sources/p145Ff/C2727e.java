package p145Ff;

import com.openai.feature.messages.impl.listitem.content.spreadsheet.MessageSpreadsheetViewModel;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p349O0.InterfaceC5985X;
import p364Oh.AbstractC6224C;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: Ff.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C2727e extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public InterfaceC5985X f8375Y;

    /* JADX INFO: renamed from: Z */
    public int f8376Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ MessageSpreadsheetViewModel f8377o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ String f8378p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ InterfaceC5985X f8379q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2727e(MessageSpreadsheetViewModel messageSpreadsheetViewModel, String str, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f8377o0 = messageSpreadsheetViewModel;
        this.f8378p0 = str;
        this.f8379q0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C2727e(this.f8377o0, this.f8378p0, this.f8379q0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2727e) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        InterfaceC5985X interfaceC5985X;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f8376Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            InterfaceC5985X interfaceC5985X2 = this.f8379q0;
            interfaceC5985X2.setValue(null);
            this.f8375Y = interfaceC5985X2;
            this.f8376Z = 1;
            obj = this.f8377o0.mo14318n(this.f8378p0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
            interfaceC5985X = interfaceC5985X2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC5985X = this.f8375Y;
            AbstractC9233X.m9807c(obj);
        }
        interfaceC5985X.setValue((AbstractC6224C) obj);
        return C17296C.f55119a;
    }
}
