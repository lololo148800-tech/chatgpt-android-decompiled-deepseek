package com.openai.feature.messages.impl.listitem.content.tools.canmore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p094De.C2025h;
import p479Td.C7351f0;
import p523V9.AbstractC8202u0;
import p571X9.AbstractC9233X;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.messages.impl.listitem.content.tools.canmore.CanmoreViewModelImpl$getStreamingMessagesForWeb$3", m20656f = "CanmoreViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, m18067d2 = {"", "LTd/f0;", "it", "LDn/i;", "LBd/Y1;", "<anonymous>", "(Ljava/util/List;)LDn/i;"}, m18068k = 3, m18069mv = {1, 9, 0})
final class CanmoreViewModelImpl$getStreamingMessagesForWeb$3 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public /* synthetic */ Object f38892Y;

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        CanmoreViewModelImpl$getStreamingMessagesForWeb$3 canmoreViewModelImpl$getStreamingMessagesForWeb$3 = new CanmoreViewModelImpl$getStreamingMessagesForWeb$3(2, interfaceC18770c);
        canmoreViewModelImpl$getStreamingMessagesForWeb$3.f38892Y = obj;
        return canmoreViewModelImpl$getStreamingMessagesForWeb$3;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((CanmoreViewModelImpl$getStreamingMessagesForWeb$3) create((List) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        List list = (List) this.f38892Y;
        ArrayList arrayList = new ArrayList(AbstractC17682p.m19389r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC8202u0.m8818d((C7351f0) it.next()));
        }
        return new C2025h(arrayList);
    }
}
