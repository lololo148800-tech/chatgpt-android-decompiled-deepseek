package com.openai.feature.conversations.impl.input;

import android.net.Uri;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1025te.C19863N;
import p1025te.C19867S;
import p1025te.C19868T;
import p1025te.C19872c;
import p1155zi.EnumC21968V0;
import p523V9.AbstractC7845A4;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p991rh.EnumC18991F;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.input.InputViewModelImpl$observeDrawnImage$1", m20656f = "InputViewModelImpl.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lte/N;", "state", "Lmm/C;", "<anonymous>", "(Lte/N;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class InputViewModelImpl$observeDrawnImage$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f37938Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ InputViewModelImpl f37939Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InputViewModelImpl$observeDrawnImage$1(InputViewModelImpl inputViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37939Z = inputViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        InputViewModelImpl$observeDrawnImage$1 inputViewModelImpl$observeDrawnImage$1 = new InputViewModelImpl$observeDrawnImage$1(this.f37939Z, interfaceC18770c);
        inputViewModelImpl$observeDrawnImage$1.f37938Y = obj;
        return inputViewModelImpl$observeDrawnImage$1;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        InputViewModelImpl$observeDrawnImage$1 inputViewModelImpl$observeDrawnImage$1 = (InputViewModelImpl$observeDrawnImage$1) create((C19863N) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        inputViewModelImpl$observeDrawnImage$1.invokeSuspend(c17296c);
        return c17296c;
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C19863N c19863n = (C19863N) this.f37938Y;
        C19872c c19872c = c19863n.f62960g;
        InputViewModelImpl inputViewModelImpl = this.f37939Z;
        if (c19872c != null) {
            Uri uri2 = c19872c.f63008d;
            boolean z6 = c19863n.f62958e;
            if (z6 && (uri = c19872c.f63007c) != null && c19872c.f63005a != null && c19872c.f63006b != null && uri2 != null) {
                int i10 = InputViewModelImpl.f37880t;
                inputViewModelImpl.getClass();
                inputViewModelImpl.m14263o(uri, EnumC18991F.f60567q0, EnumC21968V0.Inpainting, c19872c.f63005a, c19872c.f63006b, c19872c.f63008d);
                inputViewModelImpl.f37883k.m20781a(InputViewModelImpl$resetInputImageAttachmentState$1.f37958Y);
            } else if (z6 && c19872c.f63009e) {
                int i11 = InputViewModelImpl.f37880t;
                inputViewModelImpl.getClass();
                if (uri2 != null) {
                    InputViewModelImpl.m14261p(inputViewModelImpl, uri2, EnumC18991F.f60566p0, null, 60);
                    inputViewModelImpl.f37883k.m20781a(InputViewModelImpl$resetInputImageAttachmentState$1.f37958Y);
                }
            }
        }
        AbstractC7845A4 abstractC7845A4 = c19863n.f62959f;
        if (abstractC7845A4 instanceof C19867S ? true : abstractC7845A4 instanceof C19868T) {
            InputViewModelImpl$observeDrawnImage$1$2$1 inputViewModelImpl$observeDrawnImage$1$2$1 = new InputViewModelImpl$observeDrawnImage$1$2$1(abstractC7845A4);
            int i12 = InputViewModelImpl.f37880t;
            inputViewModelImpl.m14397m(inputViewModelImpl$observeDrawnImage$1$2$1);
            inputViewModelImpl.f37883k.m20781a(InputViewModelImpl$observeDrawnImage$1$2$2.f37941Y);
        }
        return C17296C.f55119a;
    }
}
