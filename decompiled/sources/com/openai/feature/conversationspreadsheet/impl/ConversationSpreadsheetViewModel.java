package com.openai.feature.conversationspreadsheet.impl;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.chatgpt.R;
import com.openai.chatgpt.app.RootViewModelImpl;
import com.openai.feature.rootviewmodel.RootViewModel;
import com.openai.viewmodel.BaseViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import me.C17238a;
import mm.C17296C;
import mm.C17309l;
import p046Bk.p047Ep.QzvfuIgrngtl;
import p049Bm.InterfaceC1436k;
import p098Di.C2056e;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p1040ue.C20206d;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21920H0;
import p1155zi.C21929J1;
import p1155zi.C21952P1;
import p1155zi.C22011h0;
import p318Mh.C5435y;
import p404Qe.C6670f;
import p404Qe.C6671g;
import p404Qe.C6675k;
import p404Qe.C6682r;
import p404Qe.C6683s;
import p404Qe.C6684t;
import p404Qe.C6685u;
import p404Qe.InterfaceC6672h;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9315k3;
import p909nm.AbstractC17678l;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p968qi.C18739v;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, m18067d2 = {"Lcom/openai/feature/conversationspreadsheet/impl/ConversationSpreadsheetViewModel;", "Lcom/openai/viewmodel/BaseViewModel;", "LQe/r;", "LQe/h;", "", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class ConversationSpreadsheetViewModel extends BaseViewModel<C6682r, InterfaceC6672h, Object> {

    /* JADX INFO: renamed from: i */
    public final RootViewModel f38104i;

    /* JADX INFO: renamed from: j */
    public final C6675k f38105j;

    /* JADX INFO: renamed from: k */
    public final String f38106k;

    /* JADX INFO: renamed from: com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel$1", m20656f = "ConversationSpreadsheetViewModel.kt", m20657l = {59}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123581 extends AbstractC19694j implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public int f38107Y;

        /* JADX INFO: renamed from: com.openai.feature.conversationspreadsheet.impl.ConversationSpreadsheetViewModel$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LQe/r;", "invoke", "(LQe/r;)LQe/r;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C21952P1 f38109Y;

            /* JADX INFO: renamed from: Z */
            public final /* synthetic */ C18739v f38110Z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C21952P1 c21952p1, C18739v c18739v) {
                super(1);
                this.f38109Y = c21952p1;
                this.f38110Z = c18739v;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                C6682r setState = (C6682r) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                C6685u c6685u = (C6685u) this.f38109Y.f69511a;
                return C6682r.m7181e(setState, c6685u.f21495a, c6685u.f21497c, c6685u.f21496b, 0, this.f38110Z, 17);
            }
        }

        public C123581(InterfaceC18770c interfaceC18770c) {
            super(1, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
            return ConversationSpreadsheetViewModel.this.new C123581(interfaceC18770c);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            return ((C123581) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C18739v c18739v;
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            int i10 = this.f38107Y;
            ConversationSpreadsheetViewModel conversationSpreadsheetViewModel = ConversationSpreadsheetViewModel.this;
            if (i10 == 0) {
                AbstractC9233X.m9807c(obj);
                C6675k c6675k = conversationSpreadsheetViewModel.f38105j;
                this.f38107Y = 1;
                obj = c6675k.m7179d(conversationSpreadsheetViewModel.f38106k, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) obj;
            C6675k c6675k2 = conversationSpreadsheetViewModel.f38105j;
            c6675k2.getClass();
            String fileId = conversationSpreadsheetViewModel.f38106k;
            AbstractC16544l.m18094g(fileId, "fileId");
            C17309l c17309l = c6675k2.f21463i;
            if (c17309l == null) {
                c18739v = new C18739v(0, 15);
            } else {
                if (!AbstractC16544l.m18089b(((C21920H0) c17309l.f55136Y).f69471a, fileId)) {
                    c17309l = null;
                }
                if (c17309l == null || (c18739v = (C18739v) c17309l.f55137Z) == null) {
                    c18739v = new C18739v(0, 15);
                }
            }
            if (abstractC21955Q1 instanceof C21952P1) {
                conversationSpreadsheetViewModel.m14397m(new AnonymousClass1((C21952P1) abstractC21955Q1, c18739v));
            } else if (!AbstractC16544l.m18089b(abstractC21955Q1, C21929J1.f69476a) && (abstractC21955Q1 instanceof AbstractC21933K1)) {
                AbstractC21933K1 abstractC21933K1 = (AbstractC21933K1) abstractC21955Q1;
                if (!(abstractC21933K1.f69485a instanceof CancellationException)) {
                    C2059h c2059h = new C2059h(abstractC21933K1);
                    RootViewModelImpl rootViewModelImpl = (RootViewModelImpl) conversationSpreadsheetViewModel.f38104i;
                    rootViewModelImpl.getClass();
                    rootViewModelImpl.m14393h(c2059h);
                }
                conversationSpreadsheetViewModel.m14393h(C2056e.f6277a);
            }
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSpreadsheetViewModel(C11082S c11082s, RootViewModel rootViewModel, C6675k c6675k) {
        super(new C6682r(((Boolean) C5435y.f17773j.m5892c(c11082s)).booleanValue(), null, null, null, 0, new C18739v(0, 15)));
        C5435y.f17770g.getClass();
        this.f38104i = rootViewModel;
        this.f38105j = c6675k;
        String value = (String) C5435y.f17772i.m5892c(c11082s);
        AbstractC16544l.m18094g(value, "value");
        this.f38106k = value;
        m14394i(new C123581(null));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC6672h intent = (InterfaceC6672h) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C6671g) {
            m14397m(new ConversationSpreadsheetViewModel$onIntent$1(intent));
            return;
        }
        if (intent instanceof C6670f) {
            C6670f c6670f = (C6670f) intent;
            if (((C6682r) m14391f()).f21485a) {
                C6675k c6675k = this.f38105j;
                c6675k.getClass();
                String fileId = this.f38106k;
                AbstractC16544l.m18094g(fileId, "fileId");
                String str = QzvfuIgrngtl.qpl;
                C18739v c18739v = c6670f.f21444a;
                AbstractC16544l.m18094g(c18739v, str);
                c6675k.f21463i = new C17309l(new C21920H0(fileId), c18739v);
                Set set = c18739v.f59610b;
                boolean zIsEmpty = set.isEmpty();
                Set set2 = c18739v.f59612d;
                Set set3 = c18739v.f59611c;
                boolean z6 = zIsEmpty && set3.isEmpty() && set2.isEmpty();
                C17238a c17238a = c6675k.f21460f;
                if (z6) {
                    c17238a.m18967b(fileId);
                } else {
                    c17238a.m18966a(new C20206d(fileId, Integer.valueOf(R.drawable.ic_spreadsheet), AbstractC17680n.m19349Y(AbstractC17678l.m19315v(new String[]{c6675k.m7180e(R.plurals.selected_row, set3.size()), c6675k.m7180e(R.plurals.selected_column, set.size()), c6675k.m7180e(R.plurals.selected_cell, set2.size())}), ", ", null, null, 0, null, null, 62), AbstractC17681o.m19382k(new C6683s(((C22011h0) c6675k.f21455a.f34301c.getValue()).f69652a, fileId), new C6684t(fileId))));
                }
                m14397m(new ConversationSpreadsheetViewModel$updateSelectionState$1(c18739v));
            }
            m14393h(C2056e.f6277a);
        }
    }
}
