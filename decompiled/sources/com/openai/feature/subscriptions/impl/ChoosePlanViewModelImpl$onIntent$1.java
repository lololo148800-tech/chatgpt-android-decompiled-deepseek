package com.openai.feature.subscriptions.impl;

import com.openai.chatgpt.R;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import mm.C17309l;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p103Dn.C2153Q0;
import p1081wc.C20856B;
import p1155zi.C21975X1;
import p1155zi.EnumC21981Z1;
import p324Mn.C5524E;
import p324Mn.C5525F;
import p324Mn.C5551u;
import p544W9.AbstractC8519M3;
import p571X9.AbstractC9233X;
import p624Zg.C10356a;
import p624Zg.C10362d;
import p624Zg.C10365e0;
import p624Zg.C10376k;
import p624Zg.C10378l;
import p624Zg.InterfaceC10364e;
import p817j$.time.LocalDateTime;
import p817j$.time.format.DateTimeFormatter;
import p909nm.AbstractC17660E;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$onIntent$1", m20656f = "ChoosePlanViewModelImpl.kt", m20657l = {216}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ChoosePlanViewModelImpl$onIntent$1 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f39874Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ChoosePlanViewModelImpl f39875Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC10364e f39876o0;

    /* JADX INFO: renamed from: com.openai.feature.subscriptions.impl.ChoosePlanViewModelImpl$onIntent$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"LZg/l;", "invoke", "(LZg/l;)LZg/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C125181 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ LocalDateTime f39877Y;

        /* JADX INFO: renamed from: Z */
        public final /* synthetic */ ChoosePlanViewModelImpl f39878Z;

        /* JADX INFO: renamed from: o0 */
        public final /* synthetic */ InterfaceC10364e f39879o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C125181(LocalDateTime localDateTime, ChoosePlanViewModelImpl choosePlanViewModelImpl, InterfaceC10364e interfaceC10364e) {
            super(1);
            this.f39877Y = localDateTime;
            this.f39878Z = choosePlanViewModelImpl;
            this.f39879o0 = interfaceC10364e;
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C10378l setState = (C10378l) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            ChoosePlanViewModelImpl choosePlanViewModelImpl = this.f39878Z;
            LocalDateTime localDateTime = this.f39877Y;
            return C10378l.m10892e(setState, null, new C10376k(localDateTime == null ? choosePlanViewModelImpl.f39867i.m3160b(R.string.subscriptions_plan_downgrade_wihtout_date_confirmation_text) : choosePlanViewModelImpl.f39867i.m3161c(R.string.subscriptions_plan_downgrade_with_date_confirmation_text, localDateTime.format(DateTimeFormatter.ofPattern("MMMM dd, yyyy"))), ((C10362d) this.f39879o0).f30712a), 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChoosePlanViewModelImpl$onIntent$1(ChoosePlanViewModelImpl choosePlanViewModelImpl, InterfaceC10364e interfaceC10364e, InterfaceC18770c interfaceC18770c) {
        super(1, interfaceC18770c);
        this.f39875Z = choosePlanViewModelImpl;
        this.f39876o0 = interfaceC10364e;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new ChoosePlanViewModelImpl$onIntent$1(this.f39875Z, this.f39876o0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((ChoosePlanViewModelImpl$onIntent$1) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f39874Y;
        ChoosePlanViewModelImpl choosePlanViewModelImpl = this.f39875Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C2153Q0 c2153q0 = choosePlanViewModelImpl.f39868j.f34536s0;
            this.f39874Y = 1;
            obj = AbstractC2124C.m3221t(c2153q0, this);
            if (obj == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C21975X1 c21975x1 = ((C10365e0) obj).f30718b;
        LocalDateTime localDateTime = null;
        EnumC21981Z1 enumC21981Z1 = c21975x1 != null ? c21975x1.f69571a : null;
        EnumC21981Z1 enumC21981Z2 = EnumC21981Z1.f69583q0;
        InterfaceC10364e interfaceC10364e = this.f39876o0;
        if (enumC21981Z1 == enumC21981Z2) {
            choosePlanViewModelImpl.f39869k.mo21447a(C20856B.f66303f, AbstractC17660E.m19258c(new C17309l("purchase_package_id", ((C10362d) interfaceC10364e).f30712a)));
            C5551u c5551u = c21975x1.f69573c;
            if (c5551u != null) {
                C5525F.Companion.getClass();
                localDateTime = AbstractC8519M3.m9187a(c5551u, C5524E.m5924a()).f17975Y;
            }
            choosePlanViewModelImpl.m14397m(new C125181(localDateTime, choosePlanViewModelImpl, interfaceC10364e));
        } else {
            choosePlanViewModelImpl.m14392g(new C10356a(((C10362d) interfaceC10364e).f30712a));
        }
        return C17296C.f55119a;
    }
}
