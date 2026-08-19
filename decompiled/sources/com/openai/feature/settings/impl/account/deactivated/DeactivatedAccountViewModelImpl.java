package com.openai.feature.settings.impl.account.deactivated;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p020Ai.C0515d;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.InterfaceC2053b;
import p103Dn.AbstractC2124C;
import p1155zi.C22038o;
import p1155zi.C22062u;
import p219Ig.C3712a;
import p219Ig.C3714c;
import p219Ig.C3716e;
import p219Ig.InterfaceC3718g;
import p552Wg.C8847i;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p708dh.C13158l;
import p708dh.C13166t;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/settings/impl/account/deactivated/DeactivatedAccountViewModelImpl;", "Lcom/openai/feature/settings/impl/account/deactivated/DeactivatedAccountViewModel;", "impl_googlePlayRelease"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class DeactivatedAccountViewModelImpl extends DeactivatedAccountViewModel {

    /* JADX INFO: renamed from: i */
    public final C13166t f39473i;

    /* JADX INFO: renamed from: j */
    public final C13158l f39474j;

    /* JADX INFO: renamed from: com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModelImpl$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModelImpl$1", m20656f = "DeactivatedAccountViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LAi/d;", "it", "Lmm/C;", "<anonymous>", "(LAi/d;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124781 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f39475Y;

        /* JADX INFO: renamed from: com.openai.feature.settings.impl.account.deactivated.DeactivatedAccountViewModelImpl$1$1, reason: invalid class name */
        @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LIg/g;", "invoke", "(LIg/g;)LIg/g;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
        final class AnonymousClass1 extends AbstractC16546n implements InterfaceC1436k {

            /* JADX INFO: renamed from: Y */
            public final /* synthetic */ C0515d f39477Y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C0515d c0515d) {
                super(1);
                this.f39477Y = c0515d;
            }

            @Override // p049Bm.InterfaceC1436k
            public final Object invoke(Object obj) {
                InterfaceC3718g setState = (InterfaceC3718g) obj;
                AbstractC16544l.m18094g(setState, "$this$setState");
                return new C3714c(this.f39477Y);
            }
        }

        public C124781(InterfaceC18770c interfaceC18770c) {
            super(2, interfaceC18770c);
        }

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C124781 c124781 = DeactivatedAccountViewModelImpl.this.new C124781(interfaceC18770c);
            c124781.f39475Y = obj;
            return c124781;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C124781 c124781 = (C124781) create((C0515d) obj, (InterfaceC18770c) obj2);
            C17296C c17296c = C17296C.f55119a;
            c124781.invokeSuspend(c17296c);
            return c17296c;
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            DeactivatedAccountViewModelImpl.this.m14397m(new AnonymousClass1((C0515d) this.f39475Y));
            return C17296C.f55119a;
        }
    }

    public DeactivatedAccountViewModelImpl(C13166t c13166t, C13158l c13158l) {
        super(C3716e.f11267a);
        this.f39473i = c13166t;
        this.f39474j = c13158l;
        AbstractC2124C.m3226y(new C1970n(c13166t.f41801e, 5, new C124781(null)), ViewModelKt.m12143a(this));
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C3712a intent = (C3712a) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C3712a.f11262a)) {
            m14394i(new DeactivatedAccountViewModelImpl$onIntent$1(this, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m14350n(C0515d c0515d, AbstractC19687c abstractC19687c) {
        DeactivatedAccountViewModelImpl$createPersonalAccount$1 deactivatedAccountViewModelImpl$createPersonalAccount$1;
        DeactivatedAccountViewModelImpl deactivatedAccountViewModelImpl;
        Map map;
        Collection collectionValues;
        if (abstractC19687c instanceof DeactivatedAccountViewModelImpl$createPersonalAccount$1) {
            deactivatedAccountViewModelImpl$createPersonalAccount$1 = (DeactivatedAccountViewModelImpl$createPersonalAccount$1) abstractC19687c;
            int i10 = deactivatedAccountViewModelImpl$createPersonalAccount$1.f39481p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                deactivatedAccountViewModelImpl$createPersonalAccount$1.f39481p0 = i10 - Integer.MIN_VALUE;
            } else {
                deactivatedAccountViewModelImpl$createPersonalAccount$1 = new DeactivatedAccountViewModelImpl$createPersonalAccount$1(this, abstractC19687c);
            }
        } else {
            deactivatedAccountViewModelImpl$createPersonalAccount$1 = new DeactivatedAccountViewModelImpl$createPersonalAccount$1(this, abstractC19687c);
        }
        Object objM14820a = deactivatedAccountViewModelImpl$createPersonalAccount$1.f39479Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = deactivatedAccountViewModelImpl$createPersonalAccount$1.f39481p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 != 0) {
            if (i11 == 1) {
                deactivatedAccountViewModelImpl = deactivatedAccountViewModelImpl$createPersonalAccount$1.f39478Y;
                AbstractC9233X.m9807c(objM14820a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(objM14820a);
            }
            return c17296c;
        }
        AbstractC9233X.m9807c(objM14820a);
        m14397m(new DeactivatedAccountViewModelImpl$createPersonalAccount$2(c0515d));
        deactivatedAccountViewModelImpl$createPersonalAccount$1.f39478Y = this;
        deactivatedAccountViewModelImpl$createPersonalAccount$1.f39481p0 = 1;
        objM14820a = this.f39474j.m14820a(deactivatedAccountViewModelImpl$createPersonalAccount$1);
        if (objM14820a == enumC19250a) {
            return enumC19250a;
        }
        deactivatedAccountViewModelImpl = this;
        C22062u c22062u = (C22062u) objM14820a;
        if (c22062u != null && (map = c22062u.f69762a) != null && (collectionValues = map.values()) != null) {
            deactivatedAccountViewModelImpl$createPersonalAccount$1.f39478Y = null;
            deactivatedAccountViewModelImpl$createPersonalAccount$1.f39481p0 = 2;
            if (deactivatedAccountViewModelImpl.m14351o(collectionValues, deactivatedAccountViewModelImpl$createPersonalAccount$1) == enumC19250a) {
                return enumC19250a;
            }
        }
        return c17296c;
    }

    /* JADX INFO: renamed from: o */
    public final Object m14351o(Collection collection, AbstractC19687c abstractC19687c) {
        Object next;
        Iterator it = collection.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C22038o) next).f69719i);
        C22038o c22038o = (C22038o) next;
        C17296C c17296c = C17296C.f55119a;
        if (c22038o != null) {
            C13166t c13166t = this.f39473i;
            c13166t.getClass();
            Object objM21029b = c13166t.f41797a.m21029b(new C8847i(c13166t, 20, c22038o.f69711a), abstractC19687c);
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            if (objM21029b != enumC19250a) {
                objM21029b = c17296c;
            }
            if (objM21029b == enumC19250a) {
                return objM21029b;
            }
        }
        return c17296c;
    }
}
