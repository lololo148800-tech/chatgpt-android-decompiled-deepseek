package com.openai.feature.messages.impl.listitem.content.reference.map;

import androidx.lifecycle.ViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p040Bd.C0893B;
import p042Bf.C1284z;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1091wn.C21036q;
import p403Qd.C6636i;
import p479Td.C7351f0;
import p571X9.AbstractC9315k3;
import p909nm.AbstractC17680n;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9315k3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/messages/impl/listitem/content/reference/map/BusinessesMapViewModelImpl;", "Lcom/openai/feature/messages/impl/listitem/content/reference/map/BusinessesMapViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class BusinessesMapViewModelImpl extends BusinessesMapViewModel {

    /* JADX INFO: renamed from: com.openai.feature.messages.impl.listitem.content.reference.map.BusinessesMapViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"LBf/z;", "LQd/i;", "conversation", "invoke", "(LBf/z;LQd/i;)LBf/z;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124231 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ String f38831Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124231(String str) {
            super(2);
            this.f38831Y = str;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Object objInvoke;
            List list;
            C1284z setOnEach = (C1284z) obj;
            C6636i c6636i = (C6636i) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            C0893B c0893b = null;
            if (c6636i != null) {
                C21036q c21036qM7167f = c6636i.m7167f();
                Iterator it = c21036qM7167f.f66917a.iterator();
                do {
                    if (!it.hasNext()) {
                        objInvoke = null;
                        break;
                    }
                    objInvoke = c21036qM7167f.f66918b.invoke(it.next());
                } while (!AbstractC16544l.m18089b(((C7351f0) objInvoke).f23286a, this.f38831Y));
                C7351f0 c7351f0 = (C7351f0) objInvoke;
                if (c7351f0 != null && (list = c7351f0.f23307v) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof C0893B) {
                            arrayList.add(obj3);
                        }
                    }
                    c0893b = (C0893B) AbstractC17680n.m19343S(arrayList);
                }
            }
            return new C1284z(c0893b);
        }
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        if (interfaceC2053b != null) {
            throw new ClassCastException();
        }
        AbstractC16544l.m18094g(null, "intent");
    }
}
