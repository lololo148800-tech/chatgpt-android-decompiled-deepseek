package com.openai.feature.gizmoshome.impl.edit;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import bf.C11349D;
import bf.C11380h;
import bf.InterfaceC11374b0;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.C0644w;
import p049Bm.InterfaceC1439n;
import p086D6.C1970n;
import p098Di.C2056e;
import p098Di.C2058g;
import p098Di.C2059h;
import p098Di.InterfaceC2053b;
import p103Dn.C2153Q0;
import p1155zi.AbstractC21933K1;
import p1155zi.AbstractC21955Q1;
import p1155zi.C21929J1;
import p1155zi.C21936L0;
import p1155zi.C21952P1;
import p318Mh.C5370J0;
import p318Mh.C5391c;
import p318Mh.C5416o0;
import p318Mh.C5418p0;
import p571X9.AbstractC9233X;
import p571X9.AbstractC9327m3;
import p576Xe.C9473F;
import p751ff.C13632c;
import p751ff.C13633d;
import p751ff.C13634e;
import p751ff.C13635f;
import p751ff.C13641l;
import p751ff.InterfaceC13636g;
import p996rm.EnumC19250a;
import sm.AbstractC19687c;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/gizmoshome/impl/edit/SnorlaxEditViewModelImpl;", "Lcom/openai/feature/gizmoshome/impl/edit/SnorlaxEditViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class SnorlaxEditViewModelImpl extends SnorlaxEditViewModel {

    /* JADX INFO: renamed from: i */
    public final C9473F f38386i;

    /* JADX INFO: renamed from: com.openai.feature.gizmoshome.impl.edit.SnorlaxEditViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lff/l;", "Lbf/b0;", "snorlax", "invoke", "(Lff/l;Lbf/b0;)Lff/l;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123821 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C123821 f38387Y = new C123821();

        public C123821() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C13641l setOnEach = (C13641l) obj;
            InterfaceC11374b0 snorlax = (InterfaceC11374b0) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(snorlax, "snorlax");
            String str = setOnEach.f43090c;
            if (str == null) {
                str = ((C11349D) snorlax).f34319b;
            }
            String str2 = str;
            String str3 = setOnEach.f43091d;
            if (str3 == null) {
                str3 = ((C11349D) snorlax).f34322e;
            }
            return C13641l.m15153e(setOnEach, snorlax, str2, str3, false, 17);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SnorlaxEditViewModelImpl(C9473F c9473f, C11082S c11082s) {
        C5416o0.f17699g.getClass();
        C5370J0 c5370j0 = C5416o0.f17700h;
        super(new C13641l(((C21936L0) c5370j0.m5892c(c11082s)).f69488a, null, null, null, false));
        this.f38386i = c9473f;
        String snorlaxId = ((C21936L0) c5370j0.m5892c(c11082s)).f69488a;
        AbstractC16544l.m18094g(snorlaxId, "snorlaxId");
        m14396l(C123821.f38387Y, new C1970n(c9473f.m10020s(), 17, snorlaxId));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX INFO: renamed from: n */
    public static final Object m14290n(SnorlaxEditViewModelImpl snorlaxEditViewModelImpl, AbstractC19687c abstractC19687c) {
        SnorlaxEditViewModelImpl$deleteSnorlax$1 snorlaxEditViewModelImpl$deleteSnorlax$1;
        C2058g c2058g;
        snorlaxEditViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxEditViewModelImpl$deleteSnorlax$1) {
            snorlaxEditViewModelImpl$deleteSnorlax$1 = (SnorlaxEditViewModelImpl$deleteSnorlax$1) abstractC19687c;
            int i10 = snorlaxEditViewModelImpl$deleteSnorlax$1.f38391p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxEditViewModelImpl$deleteSnorlax$1.f38391p0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxEditViewModelImpl$deleteSnorlax$1 = new SnorlaxEditViewModelImpl$deleteSnorlax$1(snorlaxEditViewModelImpl, abstractC19687c);
            }
        } else {
            snorlaxEditViewModelImpl$deleteSnorlax$1 = new SnorlaxEditViewModelImpl$deleteSnorlax$1(snorlaxEditViewModelImpl, abstractC19687c);
        }
        Object objM10003b = snorlaxEditViewModelImpl$deleteSnorlax$1.f38389Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxEditViewModelImpl$deleteSnorlax$1.f38391p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10003b);
            InterfaceC11374b0 interfaceC11374b0 = ((C13641l) snorlaxEditViewModelImpl.f40343c.getValue()).f43089b;
            if (interfaceC11374b0 != null) {
                snorlaxEditViewModelImpl.m14397m(SnorlaxEditViewModelImpl$deleteSnorlax$2.f38392Y);
                snorlaxEditViewModelImpl$deleteSnorlax$1.f38388Y = snorlaxEditViewModelImpl;
                snorlaxEditViewModelImpl$deleteSnorlax$1.f38391p0 = 1;
                objM10003b = snorlaxEditViewModelImpl.f38386i.m10003b(((C11349D) interfaceC11374b0).f34318a, snorlaxEditViewModelImpl$deleteSnorlax$1);
                if (objM10003b == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snorlaxEditViewModelImpl = snorlaxEditViewModelImpl$deleteSnorlax$1.f38388Y;
        AbstractC9233X.m9807c(objM10003b);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10003b;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C5391c c5391c = C5391c.f17646Z;
        if (!z6) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                snorlaxEditViewModelImpl.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else {
                if (!(abstractC21955Q1 instanceof C21929J1)) {
                    throw new C0644w();
                }
                C5418p0 c5418p0 = C5418p0.f17707h;
                c5418p0.getClass();
                c2058g = new C2058g(c5418p0.m5885a(c5391c), true);
            }
            snorlaxEditViewModelImpl.m14397m(SnorlaxEditViewModelImpl$deleteSnorlax$5.f38393Y);
            return c17296c;
        }
        C5418p0 c5418p1 = C5418p0.f17707h;
        c5418p1.getClass();
        c2058g = new C2058g(c5418p1.m5885a(c5391c), true);
        snorlaxEditViewModelImpl.m14393h(c2058g);
        snorlaxEditViewModelImpl.m14397m(SnorlaxEditViewModelImpl$deleteSnorlax$5.f38393Y);
        return c17296c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX INFO: renamed from: o */
    public static final Object m14291o(SnorlaxEditViewModelImpl snorlaxEditViewModelImpl, AbstractC19687c abstractC19687c) {
        SnorlaxEditViewModelImpl$saveSnorlax$1 snorlaxEditViewModelImpl$saveSnorlax$1;
        String str;
        SnorlaxEditViewModelImpl snorlaxEditViewModelImpl2 = snorlaxEditViewModelImpl;
        snorlaxEditViewModelImpl.getClass();
        if (abstractC19687c instanceof SnorlaxEditViewModelImpl$saveSnorlax$1) {
            snorlaxEditViewModelImpl$saveSnorlax$1 = (SnorlaxEditViewModelImpl$saveSnorlax$1) abstractC19687c;
            int i10 = snorlaxEditViewModelImpl$saveSnorlax$1.f38403p0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snorlaxEditViewModelImpl$saveSnorlax$1.f38403p0 = i10 - Integer.MIN_VALUE;
            } else {
                snorlaxEditViewModelImpl$saveSnorlax$1 = new SnorlaxEditViewModelImpl$saveSnorlax$1(snorlaxEditViewModelImpl2, abstractC19687c);
            }
        } else {
            snorlaxEditViewModelImpl$saveSnorlax$1 = new SnorlaxEditViewModelImpl$saveSnorlax$1(snorlaxEditViewModelImpl2, abstractC19687c);
        }
        Object objM10023v = snorlaxEditViewModelImpl$saveSnorlax$1.f38401Z;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i11 = snorlaxEditViewModelImpl$saveSnorlax$1.f38403p0;
        C17296C c17296c = C17296C.f55119a;
        if (i11 == 0) {
            AbstractC9233X.m9807c(objM10023v);
            C2153Q0 c2153q0 = snorlaxEditViewModelImpl2.f40343c;
            InterfaceC11374b0 interfaceC11374b0 = ((C13641l) c2153q0.getValue()).f43089b;
            if (interfaceC11374b0 != null && (str = ((C13641l) c2153q0.getValue()).f43090c) != null) {
                snorlaxEditViewModelImpl2.m14397m(SnorlaxEditViewModelImpl$saveSnorlax$2.f38404Y);
                String str2 = ((C13641l) c2153q0.getValue()).f43091d;
                C11349D c11349d = (C11349D) interfaceC11374b0;
                String id2 = c11349d.f34318a;
                AbstractC16544l.m18094g(id2, "id");
                C11380h icon = c11349d.f34326i;
                AbstractC16544l.m18094g(icon, "icon");
                List files = c11349d.f34316C;
                AbstractC16544l.m18094g(files, "files");
                C11349D c11349dM12777a = C11349D.m12777a(c11349d, id2, str, c11349d.f34321d, str2, icon, c11349d.f34330m, c11349d.f34335r, null, files, 268300004);
                snorlaxEditViewModelImpl$saveSnorlax$1.f38400Y = snorlaxEditViewModelImpl2;
                snorlaxEditViewModelImpl$saveSnorlax$1.f38403p0 = 1;
                objM10023v = snorlaxEditViewModelImpl2.f38386i.m10023v(c11349dM12777a, snorlaxEditViewModelImpl$saveSnorlax$1);
                if (objM10023v == enumC19250a) {
                    return enumC19250a;
                }
            }
            return c17296c;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        snorlaxEditViewModelImpl2 = snorlaxEditViewModelImpl$saveSnorlax$1.f38400Y;
        AbstractC9233X.m9807c(objM10023v);
        AbstractC21955Q1 abstractC21955Q1 = (AbstractC21955Q1) objM10023v;
        boolean z6 = abstractC21955Q1 instanceof C21952P1;
        C2056e c2056e = C2056e.f6277a;
        if (!z6) {
            if (abstractC21955Q1 instanceof AbstractC21933K1) {
                snorlaxEditViewModelImpl2.m14393h(new C2059h((AbstractC21933K1) abstractC21955Q1));
            } else if (!(abstractC21955Q1 instanceof C21929J1)) {
                throw new C0644w();
            }
            snorlaxEditViewModelImpl2.m14397m(SnorlaxEditViewModelImpl$saveSnorlax$5.f38405Y);
            return c17296c;
        }
        snorlaxEditViewModelImpl2.m14393h(c2056e);
        snorlaxEditViewModelImpl2.m14397m(SnorlaxEditViewModelImpl$saveSnorlax$5.f38405Y);
        return c17296c;
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        InterfaceC13636g intent = (InterfaceC13636g) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C13633d) {
            m14394i(new SnorlaxEditViewModelImpl$onIntent$1(this, null));
            return;
        }
        if (intent instanceof C13635f) {
            m14397m(new SnorlaxEditViewModelImpl$onIntent$2(intent));
        } else if (intent instanceof C13634e) {
            m14397m(new SnorlaxEditViewModelImpl$onIntent$3(intent));
        } else if (intent instanceof C13632c) {
            m14394i(new SnorlaxEditViewModelImpl$onIntent$4(this, null));
        }
    }
}
