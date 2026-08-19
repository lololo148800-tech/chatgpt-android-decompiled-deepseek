package p769gj;

import android.widget.EditText;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: gj.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C14177s extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f44563Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ EditText f44564Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14177s(EditText editText, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44564Z = editText;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C14177s c14177s = new C14177s(this.f44564Z, interfaceC18770c);
        c14177s.f44563Y = obj;
        return c14177s;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14177s c14177s = (C14177s) create((String) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14177s.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        String str = (String) this.f44563Y;
        EditText editText = this.f44564Z;
        if (!AbstractC16544l.m18089b(str, editText.getText().toString())) {
            editText.setText(str);
        }
        return C17296C.f55119a;
    }
}
