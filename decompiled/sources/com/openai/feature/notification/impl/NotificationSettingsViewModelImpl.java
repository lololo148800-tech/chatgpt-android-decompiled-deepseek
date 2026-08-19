package com.openai.feature.notification.impl;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.openai.feature.notification.NotificationSettingsViewModel;
import com.squareup.anvil.annotations.ContributesMultibinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import p025An.AbstractC0575H;
import p049Bm.InterfaceC1439n;
import p098Di.InterfaceC2053b;
import p1155zi.C21917G1;
import p1155zi.C21921H1;
import p1155zi.InterfaceC21925I1;
import p195Hh.C3430e;
import p455Sf.C7123h;
import p455Sf.C7126k;
import p481Tf.C7409n;
import p523V9.AbstractC8168p6;
import p571X9.AbstractC9327m3;

/* JADX INFO: loaded from: classes3.dex */
@ContributesMultibinding(boundType = ViewModel.class, scope = AbstractC9327m3.class)
@Metadata(m18066d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m18067d2 = {"Lcom/openai/feature/notification/impl/NotificationSettingsViewModelImpl;", "Lcom/openai/feature/notification/NotificationSettingsViewModel;", "impl_release"}, m18068k = 1, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
public final class NotificationSettingsViewModelImpl extends NotificationSettingsViewModel {

    /* JADX INFO: renamed from: i */
    public final C7409n f39001i;

    /* JADX INFO: renamed from: j */
    public final C3430e f39002j;

    /* JADX INFO: renamed from: com.openai.feature.notification.impl.NotificationSettingsViewModelImpl$1 */
    @Metadata(m18066d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m18067d2 = {"LSf/k;", "", "Lzi/w1;", "tasks", "invoke", "(LSf/k;Ljava/util/List;)LSf/k;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C124451 extends AbstractC16546n implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public static final C124451 f39003Y = new C124451();

        public C124451() {
            super(2);
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            C7126k setOnEach = (C7126k) obj;
            List tasks = (List) obj2;
            AbstractC16544l.m18094g(setOnEach, "$this$setOnEach");
            AbstractC16544l.m18094g(tasks, "tasks");
            InterfaceC21925I1 notificationTasks = !tasks.isEmpty() ? new C21921H1(tasks) : setOnEach.f22678a;
            AbstractC16544l.m18094g(notificationTasks, "notificationTasks");
            return new C7126k(notificationTasks);
        }
    }

    public NotificationSettingsViewModelImpl(C7409n c7409n) {
        super(new C7126k(C21917G1.f69468a));
        this.f39001i = c7409n;
        this.f39002j = AbstractC8168p6.m8749b("NotificationSettingsViewModel", null);
        AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new NotificationSettingsViewModelImpl$getNotificationSettings$1(this, null), 3);
        m14396l(C124451.f39003Y, c7409n.f23473d);
    }

    @Override // com.openai.viewmodel.BaseViewModel
    /* JADX INFO: renamed from: j */
    public final void mo14227j(InterfaceC2053b interfaceC2053b) {
        C7123h intent = (C7123h) interfaceC2053b;
        AbstractC16544l.m18094g(intent, "intent");
        if (intent.equals(C7123h.f22672a)) {
            AbstractC0575H.m1156D(ViewModelKt.m12143a(this), null, null, new NotificationSettingsViewModelImpl$getNotificationSettings$1(this, null), 3);
        }
    }
}
