package com.openai.feature.notification.impl;

import androidx.lifecycle.C11082S;
import androidx.lifecycle.ViewModel;
import com.openai.feature.notification.NotificationTaskViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1081wc.InterfaceC20904w;
import p1155zi.C22072w1;
import p1155zi.EnumC22040o1;
import p318Mh.C5406j0;
import p455Sf.C7127l;
import p455Sf.C7129n;
import p481Tf.C7409n;
import p571X9.AbstractC9327m3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/notification/impl/NotificationTaskViewModelImpl;", "Lcom/openai/feature/notification/NotificationTaskViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NotificationTaskViewModelImpl extends NotificationTaskViewModel {

    /* JADX INFO: renamed from: i */
    public final C7409n f39009i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC20904w f39010j;

    /* JADX INFO: renamed from: com.openai.feature.notification.impl.NotificationTaskViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"LSf/n;", "", "Lzi/w1;", "tasks", "invoke", "(LSf/n;Ljava/util/List;)LSf/n;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124461 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public final /* synthetic */ C11082S f39011Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C124461(C11082S c11082s) {
            super(2);
            this.f39011Y = c11082s;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            Object next;
            C7129n setOnEach = (C7129n) obj;
            List tasks = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(tasks, "tasks");
            Iterator it = tasks.iterator();
            while (it.hasNext()) {
                next = it.next();
                EnumC22040o1 enumC22040o1 = ((C22072w1) next).f69785b;
                C5406j0.f17676g.getClass();
                if (enumC22040o1 == C5406j0.f17677h.m5892c(this.f39011Y)) {
                    return new C7129n((C22072w1) next);
                }
            }
            next = null;
            return new C7129n((C22072w1) next);
        }
    }

    public NotificationTaskViewModelImpl(C7409n c7409n, InterfaceC20904w interfaceC20904w, C11082S c11082s) {
        super(new C7129n(null));
        this.f39009i = c7409n;
        this.f39010j = interfaceC20904w;
        m14396l(new C124461(c11082s), c7409n.f23473d);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C7127l intent = (C7127l) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent instanceof C7127l) {
            m14394i(new NotificationTaskViewModelImpl$onIntent$1(this, intent, null));
        }
    }
}
