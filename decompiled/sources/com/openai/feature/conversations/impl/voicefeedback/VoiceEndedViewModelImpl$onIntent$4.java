package com.openai.feature.conversations.impl.voicefeedback;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p103Dn.AbstractC2124C;
import p1081wc.C20860F;
import p1155zi.C22011h0;
import p172Gi.C3061C;
import p172Gi.C3080m;
import p172Gi.C3086s;
import p172Gi.EnumC3089v;
import p174Gk.uSfJ.HpucjswO;
import p364Oh.AbstractC6224C;
import p364Oh.AbstractC6249w;
import p427Rc.C6852i;
import p523V9.AbstractC8160o6;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17660E;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import re.AbstractC18967t;
import re.C18959l;
import re.C18963p;
import re.C18964q;
import re.InterfaceC18962o;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$4", m20656f = "VoiceEndedViewModel.kt", m20657l = {168, 172, 174}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lmm/C;", "<anonymous>", "()V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class VoiceEndedViewModelImpl$onIntent$4 extends AbstractC19694j implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public int f38058Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ VoiceEndedViewModelImpl f38059Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ InterfaceC18962o f38060o0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$4$3 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123533 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123533 f38061Y = new C123533();

        public C123533() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            if (!(setState instanceof C18963p)) {
                return setState;
            }
            C3061C c3061c = ((C18963p) setState).f60517a;
            AbstractC16544l.m18094g(c3061c, HpucjswO.VihIydvfT);
            return new C18963p(c3061c, true);
        }
    }

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.voicefeedback.VoiceEndedViewModelImpl$onIntent$4$4 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lre/t;", "invoke", "(Lre/t;)Lre/t;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123544 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123544 f38062Y = new C123544();

        public C123544() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            AbstractC18967t setState = (AbstractC18967t) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C18964q.f60519a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceEndedViewModelImpl$onIntent$4(VoiceEndedViewModelImpl voiceEndedViewModelImpl, InterfaceC18770c interfaceC18770c, InterfaceC18962o interfaceC18962o) {
        super(1, interfaceC18770c);
        this.f38059Z = voiceEndedViewModelImpl;
        this.f38060o0 = interfaceC18962o;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(InterfaceC18770c interfaceC18770c) {
        return new VoiceEndedViewModelImpl$onIntent$4(this.f38059Z, interfaceC18770c, this.f38060o0);
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        return ((VoiceEndedViewModelImpl$onIntent$4) create((InterfaceC18770c) obj)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c1 A[LOOP:0: B:32:0x00bb->B:34:0x00c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00ea  */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Iterator it;
        AbstractC6224C abstractC6224C;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f38058Y;
        InterfaceC18962o interfaceC18962o = this.f38060o0;
        VoiceEndedViewModelImpl voiceEndedViewModelImpl = this.f38059Z;
        if (i10 != 0) {
            if (i10 == 1) {
                AbstractC9233X.m9807c(obj);
            } else if (i10 == 2) {
                AbstractC9233X.m9807c(obj);
                String str = ((C22011h0) obj).f69652a;
                voiceEndedViewModelImpl.m14397m(C123533.f38061Y);
                EnumC3089v enumC3089v = EnumC3089v.f9299o0;
                C18959l c18959l = (C18959l) interfaceC18962o;
                Iterable iterable = c18959l.f60513a;
                arrayList = new ArrayList(AbstractC17682p.m19389r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C3080m) it.next()).f9283a);
                }
                C3086s c3086s = new C3086s(str, enumC3089v, arrayList, c18959l.f60514b);
                this.f38058Y = 3;
                obj = voiceEndedViewModelImpl.f38038m.m3716b(c3086s, this);
                if (obj == enumC19250a) {
                    return enumC19250a;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9233X.m9807c(obj);
            }
            abstractC6224C = (AbstractC6224C) obj;
            voiceEndedViewModelImpl.m14397m(C123544.f38062Y);
            if (abstractC6224C instanceof AbstractC6249w) {
                AbstractC8160o6.m8731f(voiceEndedViewModelImpl.f38040o, "Failed to submit feedback", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
            }
            return C17296C.f55119a;
        }
        AbstractC9233X.m9807c(obj);
        C3061C c3061cMo20277e = ((AbstractC18967t) voiceEndedViewModelImpl.m14391f()).mo20277e();
        if (c3061cMo20277e != null) {
            C20860F c20860f = C20860F.f66379p;
            Iterable iterable2 = ((C18959l) interfaceC18962o).f60513a;
            ArrayList arrayList2 = new ArrayList(AbstractC17682p.m19389r(iterable2, 10));
            Iterator it2 = iterable2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C3080m) it2.next()).f9283a);
            }
            int iM19257b = AbstractC17660E.m19257b(AbstractC17682p.m19389r(arrayList2, 10));
            if (iM19257b < 16) {
                iM19257b = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM19257b);
            for (Object obj2 : arrayList2) {
                linkedHashMap.put(obj2, Boolean.TRUE);
            }
            this.f38058Y = 1;
            if (voiceEndedViewModelImpl.m14273n(c3061cMo20277e, c20860f, linkedHashMap, this) == enumC19250a) {
                return enumC19250a;
            }
        }
        C6852i c6852i = voiceEndedViewModelImpl.f38037l.f34301c;
        this.f38058Y = 2;
        obj = AbstractC2124C.m3221t(c6852i, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        String str2 = ((C22011h0) obj).f69652a;
        voiceEndedViewModelImpl.m14397m(C123533.f38061Y);
        EnumC3089v enumC3089v2 = EnumC3089v.f9299o0;
        C18959l c18959l2 = (C18959l) interfaceC18962o;
        Iterable iterable3 = c18959l2.f60513a;
        arrayList = new ArrayList(AbstractC17682p.m19389r(iterable3, 10));
        it = iterable3.iterator();
        while (it.hasNext()) {
            arrayList.add(((C3080m) it.next()).f9283a);
        }
        C3086s c3086s2 = new C3086s(str2, enumC3089v2, arrayList, c18959l2.f60514b);
        this.f38058Y = 3;
        obj = voiceEndedViewModelImpl.f38038m.m3716b(c3086s2, this);
        if (obj == enumC19250a) {
            return enumC19250a;
        }
        abstractC6224C = (AbstractC6224C) obj;
        voiceEndedViewModelImpl.m14397m(C123544.f38062Y);
        if (abstractC6224C instanceof AbstractC6249w) {
            AbstractC8160o6.m8731f(voiceEndedViewModelImpl.f38040o, "Failed to submit feedback", ((AbstractC6249w) abstractC6224C).f20328a, null, 4);
        }
        return C17296C.f55119a;
    }
}
