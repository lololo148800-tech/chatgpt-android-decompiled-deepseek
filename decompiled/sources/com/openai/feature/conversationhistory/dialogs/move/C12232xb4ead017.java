package com.openai.feature.conversationhistory.dialogs.move;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.openai.viewmodel.BaseViewModel;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2052a;
import p103Dn.AbstractC2124C;
import p349O0.InterfaceC5985X;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: renamed from: com.openai.feature.conversationhistory.dialogs.move.ConversationMoveDialogKt$RemoveConvoFromProjectMenuItem-X1J3Mg0$$inlined$injectViewModel$1 */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.viewmodel.InjectViewModelKt$injectViewModel$1$1", m20656f = "InjectViewModel.kt", m20657l = {58}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\u001c\b\u0003\u0010\u0007\u0018\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0006*\u00020\bH\u008a@¢\u0006\u0004\b\n\u0010\u000b"}, m18067d2 = {"LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "Lcom/openai/viewmodel/BaseViewModel;", TokenNames.f32019T, "LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
public final class C12232xb4ead017 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37336Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ BaseViewModel f37337Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC5985X f37338o0;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.dialogs.move.ConversationMoveDialogKt$RemoveConvoFromProjectMenuItem-X1J3Mg0$$inlined$injectViewModel$1$1, reason: invalid class name */
    @InterfaceC19689e(m20655c = "com.openai.feature.viewmodel.InjectViewModelKt$injectViewModel$1$1$1", m20656f = "InjectViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0003*\u00020\u0002\"\b\b\u0002\u0010\u0005*\u00020\u0004\"\u001c\b\u0003\u0010\u0007\u0018\u0001*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00062\u0006\u0010\b\u001a\u00028\u0002H\u008a@"}, m18067d2 = {"LDi/k;", TokenNames.f32018S, "LDi/b;", TokenNames.f32012I, "LDi/a;", TokenNames.f32010E, "Lcom/openai/viewmodel/BaseViewModel;", TokenNames.f32019T, "it", "Lmm/C;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    public final class AnonymousClass1 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37339Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ InterfaceC5985X f37340Z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
            this.f37340Z = interfaceC5985X;
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37340Z, interfaceC18770c);
            anonymousClass1.f37339Y = obj;
            return anonymousClass1;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((InterfaceC2052a) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            anonymousClass1.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            ((InterfaceC1436k) this.f37340Z.getValue()).invoke((InterfaceC2052a) this.f37339Y);
            return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12232xb4ead017(BaseViewModel baseViewModel, InterfaceC5985X interfaceC5985X, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37337Z = baseViewModel;
        this.f37338o0 = interfaceC5985X;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C12232xb4ead017(this.f37337Z, this.f37338o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C12232xb4ead017) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37336Y;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            BaseViewModel baseViewModel = this.f37337Z;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f37338o0, null);
            this.f37336Y = 1;
            if (AbstractC2124C.m3212k(baseViewModel.f40347g, anonymousClass1, this) == enumC19250a) {
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
